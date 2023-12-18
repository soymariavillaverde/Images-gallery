import { ref, computed } from 'vue'
import { defineStore } from 'pinia'

import axios from 'axios'

export const useGetImagesrStore = defineStore('getImages', () => {
  // aquí voy a llamar a la api con axios

  return { count, doubleCount, increment }
})
