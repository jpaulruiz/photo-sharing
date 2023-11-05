<template>
    <top-level-view>
        <h2>Dashboard</h2>
        <section>
            <aawf-button>
                New Post
            </aawf-button>
            <aawf-button>
                Logout
            </aawf-button>
        </section>
        <div class="wrapper">
            <aawf-upload-form 
            :form-submit="acc.uploadFile"/>
        </div>
        <section class="image-wrapper">
            <div v-for="d in acc.data">
                <img class="image-container" :src="imageDataUrl(d.img)" alt="Image">
            </div>
        </section>
    </top-level-view>
</template>

<script setup lang="ts">
    import TopLevelView from '../templates/top-level-view.vue'
    import AawfUploadForm from '../organisms/aawf-upload-form.vue'
    import AawfButton from '../atoms/aawf-button.vue';
    import useAccount from '../../stores/account.ts'

    const acc = useAccount()

    function imageDataUrl(imageBytes: Array<number>) {
      const binaryData = new Uint8Array(imageBytes);
      const blob = new Blob([binaryData]);
      const dataUrl = URL.createObjectURL(blob);
      return dataUrl;
    }
</script>

<style scoped>
    .wrapper {
        display: flex;
    }

    h2 {
        text-align: center;
    }

    section {
        display: flex;
        justify-content: center;
    }

    .image-wrapper {
        display: flex;
        flex-direction: column;
        align-items: center;
    }

    .image-container {
        object-fit: contain;
        width: 40vw;
        height: 40vh;
        border: 2px solid black;
        border-radius: 2px;
        padding: 0;
    }

</style>