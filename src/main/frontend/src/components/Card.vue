<template>
  <main>
    <v-card class="mx-auto">
        <v-img
          src="https://picsum.photos/300/300"
          height="300px"
          width="300px"
          max-width="300px"
          cover
        ></v-img>
        <div max-width="400px">
          <v-card-title>
            Título de la imagen
          </v-card-title>
        </div>
    </v-card>
  </main>
  </template>

  <style lang="scss" scoped>
    main{
      padding-top: 10%;
    }
</style>