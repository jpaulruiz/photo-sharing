import { ref } from 'vue'
import { defineStore } from 'pinia'

const useAccount = defineStore('task', () => {
    const message = ref('')
    const success = ref(false)
    const createAccount = async (e) => {
      const formData = new URLSearchParams()
      formData.append('username', e.username)
      formData.append('password', e.password)
      formData.append('confirmPassword', e.confirmPassword)

      await fetch('http://localhost:9000/registration', {
        method: 'POST',
        headers: {
          'Content-Type': 'application/x-www-form-urlencoded',
        },
        body: formData
      })
      .then(response => response.json())
      .then(data => {
        message.value = data.message
        if (message.value !== '') {
          const searchWord = /(successfully)/g
          if (message.value.search(searchWord) > -1) {
            success.value = true
          }
        }
      })
      .catch(error => {
        console.log(error)
      })
    }

    const logonAccount = async (e) => {
      const formData = new URLSearchParams()
      formData.append('username', e.username)
      formData.append('password', e.password)

      await fetch('http://localhost:9000/isLogon', {
        method: 'POST',
        headers: {
          'Content-Type': 'application/x-www-form-urlencoded',
        },
        body: formData
      })
      .then(response => response.json())
      .then(data => {
        //redirect
        message.value = data.message
        if (data.message !== '') {
          const searchWord = /(successfully)/g
          if (data.message.search(searchWord) > -1) {
            success.value = true
            window.location.href = '/dashboard'
          }
        }
      })
      .catch(error => {
        console.log(error)
      })
    }

    const uploadFile = async (e) => {
      const formData = new FormData()
      formData.append('url', e.img)
      formData.append('desc', e.desc)
      formData.append('userId', 'admin') //test

      await fetch('http://localhost:9000/post', {
        method: 'POST',
        headers: {
          'Content-Type': 'multipart/form-data',
        },
        body: formData
      })
      .then(response => response.json())
      .then(data => {
        console.log(data)
      })
      .catch(error => {
        console.log(error)
      })
    }

    return {
      message,
      success,
      createAccount,
      logonAccount,
      uploadFile
    }
})

export default useAccount
