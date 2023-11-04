<template>
    <form 
        class="form-class"
        name="upload-form"
        method="POST"
        @submit.prevent="formSubmit(newData)"
        aria-labelledby="uploadForm"
        aria-describedby="upload form">
            <aawf-label-input 
                input-type="file"
                input-name="Upload image"
                aria-label=""
                aria-described=""
                @update:model-value="e => newData.img = e" />
            <aawf-label-input 
                input-type="text"
                input-name="Caption"
                aria-label=""
                aria-described=""
                @update:model-value="e => newData.desc = e" />
            <aawf-button
                type="submit"
                id="form-submit"
                name="form-submit"
                aria-label="addButton"
                aria-described="Button for form submission">
                Upload
            </aawf-button>
            <slot></slot>
    </form>
</template>

<script setup lang="ts">
    import AawfLabelInput from '../molecules/aawf-label-input.vue'
    import AawfButton from '../atoms/aawf-button.vue'

    defineProps({
        formSubmit: {
            type: Function,
            default() {
                return 'Default Function'
            }
        }
    })

    const newData = {
        img: '',
        desc: ''
    }
</script>

<style scoped>
    button {
        margin-top: 0.4rem;
    }
</style>