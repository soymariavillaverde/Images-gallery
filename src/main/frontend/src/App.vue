<script setup>
import { RouterLink , RouterView  } from 'vue-router';
import Header from "../src/components/Header.vue";
import Footer from "../src/components/Footer.vue"
import Card from "../src/components/Card.vue"
</script>

<template>
  <main>
    <Header/>
    <RouterView />
    <Card/>
    <Footer/>    
  </main>
</template>

<style scoped>
</style>
