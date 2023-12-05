import { createRouter, createWebHistory } from 'vue-router';

// 导入组件
import HelloWorld from '../components/Index.vue';
// import About from '../views/About.vue';
// import Contact from '../views/Contact.vue';

// 创建路由实例
const router = createRouter({
    history: createWebHistory(),
    routes: [
        { path: '/', component: HelloWorld },
        { path: '/index', component: HelloWorld },
        // { path: '/about', component: About },
        // { path: '/contact', component: Contact },
    ],
});

// 导出路由实例
export default router;
