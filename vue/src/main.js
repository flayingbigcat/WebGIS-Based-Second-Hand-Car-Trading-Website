import { createApp } from 'vue'
import App from './App.vue'
import router from '../src/router/index'
import 'bootstrap/dist/css/bootstrap.css'
import 'bootstrap/dist/js/bootstrap.js'
import 'bootstrap/dist/css/bootstrap.min.css'
// import axios from 'axios'
createApp(App)
    .use(router)
    .mount('#app');
