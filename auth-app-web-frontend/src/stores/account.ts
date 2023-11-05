import { ref } from 'vue'
import { defineStore } from 'pinia'

type RegistrationData = {
  username: string;
  password: string;
  confirmPassword: string;
};

type LogonData = {
  username: string;
  password: string;
};

const useAccount = defineStore('task', () => {
    const message = ref('')
    const success = ref(false)
    const data = ref(null)
    const createAccount = async (e: RegistrationData) => {
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

    const logonAccount = async (e: LogonData) => {
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

    const uploadFile = async (e: { img: string; desc: string }) => {
      const formData = new FormData()
      const img = document.querySelector("input[name='Upload image']") 
      if (!e.img) {
        console.log('no image was found');
        return img;
      }
      const imageFile = await fetchImageAsFile(img.files[0]); // Function to fetch the image and convert it to a File object

      if (imageFile) {
        formData.append('url', imageFile);
        formData.append('desc', e.desc);
        formData.append('userId', 'admin'); // Test
    
        await fetch('http://localhost:9000/post', {
          method: 'POST',
          body: formData
        })
          .then(response => response.json())
          .then(async data => {
            console.log(data);
            console.log(message.value)
          })
          .catch(error => {
            console.log(error);
          });
      }
    };
    
    const fetchImageAsFile = async (file: File) => {
      try {
        const imageData = await file.arrayBuffer();
        const imageFileName = file.name;
        return new File([imageData], imageFileName);
      } catch (error) {
        console.error("Error fetching and creating image file:", error);
        return null;
      }
    }

    const getFile = async () => {
      await fetch ('http://localhost:9000/post', {
        method: 'GET'
      })
      .then(response => response.json())
      .then(d => {
        data.value = d
      })
      .catch(error => {
        console.log(error)
      })
    }

    setInterval(async () => {
      await getFile()
    }, 4000)

    return {
      message,
      success,
      data,
      createAccount,
      logonAccount,
      uploadFile
    }


})

export default useAccount
