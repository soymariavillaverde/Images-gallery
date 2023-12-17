<script setup>
import { RouterLink , RouterView  } from 'vue-router';
import Header from "../src/components/Header.vue";
import Footer from "../src/components/Footer.vue"
</script>

<template>
    <Header/>
    <RouterView />
    <Footer/>    
</template>

<style scoped>
</style>
