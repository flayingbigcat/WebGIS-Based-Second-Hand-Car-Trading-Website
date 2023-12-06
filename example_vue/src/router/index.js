import { createRouter, createWebHistory } from 'vue-router'

// 导入组件
import HelloWorld from '../components/Index.vue'
import SignUp from '../components/SignUp.vue'
import LoginPage from '../components/LoginPage.vue'
import CartPage from '../components/CartPage.vue'
import OrderPage from '../components/OrderPage.vue'
import ShopPage from '../components/ShopPage.vue'
import ForgetPage from '../components/ForgetPage.vue'

// 创建路由实例
const router = createRouter({
    history: createWebHistory(),
    routes: [
        { path: '/', component: HelloWorld },
        { path: '/Index', component: HelloWorld },
        { path: '/SignUp', component: SignUp },
        { path: '/LoginPage', component: LoginPage },
        { path: '/CartPage', component: CartPage},
        { path: '/OrderPage', component: OrderPage},
        { path: '/ShopPage',component: ShopPage},
        { path: '/ForgetPage',component: ForgetPage}
    ],
});

// 导出路由实例
export default router;
