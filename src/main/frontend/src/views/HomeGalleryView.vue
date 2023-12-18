<script setup>
import { RouterLink } from 'vue-router';
import Card from "../components/Card.vue";

</script>

<template>
  <main>
    <Card></Card>
  </main>
</template>

<style lang="scss">
  body{
    main {
      margin: 0;
      height: 100vh;
      width: 100vw;
      display: flex;
      flex-direction: row;
      flex-wrap: wrap;
      justify-content: center;
      align-items: center;
}
  }
h1{
  color: white
}
</style>