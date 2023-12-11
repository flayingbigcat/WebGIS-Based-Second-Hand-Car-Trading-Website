import { createApp } from 'vue'
import App from './App.vue'
import router from '../src/router/index.js'
import 'bootstrap/dist/css/bootstrap.css'
import 'bootstrap/dist/js/bootstrap.js'
import 'bootstrap/dist/css/bootstrap.min.css'


createApp(App)
    .use(router)
    .mount('#app');
