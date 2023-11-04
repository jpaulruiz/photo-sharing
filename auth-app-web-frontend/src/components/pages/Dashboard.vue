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
    </top-level-view>
</template>

<script setup lang="ts">
    import TopLevelView from '../templates/top-level-view.vue'
    import AawfUploadForm from '../organisms/aawf-upload-form.vue'
    import AawfButton from '../atoms/aawf-button.vue';
    import useAccount from '../../stores/account.ts'

    const acc = useAccount()
</script>

<style scoped>
    .wrapper {
        display: flex;
        height: 92vh;
    }

    h2 {
        text-align: center;
    }

    section {
        display: flex;
        justify-content: center;
    }
</style>