import { createRouter, createWebHistory } from 'vue-router'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'logon-form',
      component: () => import('../components/pages/LoginView.vue')
    },
    {
      path: '/register-form',
      name: 'register-form',
      // route level code-splitting
      // this generates a separate chunk (About.[hash].js) for this route
      // which is lazy-loaded when the route is visited.
      component: () => import('../components/pages/RegisterView.vue')
    },
    {
      path: '/dashboard',
      name: 'dashboard',
      component: () => import('../components/pages/Dashboard.vue'),
      meta: {
        requiresAuth: true
      }
    }
  ]
})

export default router
