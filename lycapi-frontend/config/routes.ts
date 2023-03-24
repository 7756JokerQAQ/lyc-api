export default [
<<<<<<< HEAD
=======
  { path: '/', name: '主页', icon: 'smile', component: './Index' },
  { path: '/interface_info/:id', name: '查看接口', icon: 'smile', component: './InterfaceInfo', hideInMenu: true },
>>>>>>> 173d163 (前端)
  {
    path: '/user',
    layout: false,
    routes: [{ name: '登录', path: '/user/login', component: './User/Login' }],
  },
<<<<<<< HEAD
  // { path: '/welcome', name: '欢迎', icon: 'smile', component: './Welcome' },
=======

>>>>>>> 173d163 (前端)
  {
    path: '/admin',
    name: '管理页',
    icon: 'crown',
    access: 'canAdmin',
    routes: [
<<<<<<< HEAD
      { name: '接口管理', icon: 'table', path: '/admin/interface_info', component: './InterfaceInfo' },
    ],
  },

  // { path: '/', redirect: '/welcome' },
=======
      { name: '接口管理', icon: 'table', path: '/admin/interface_info', component: './Admin/InterfaceInfo' },
      { name: '接口分析', icon: 'analysis', path: '/admin/interface_analysis', component: './Admin/InterfaceAnalysis' },
    ],
  },

>>>>>>> 173d163 (前端)
  { path: '*', layout: false, component: './404' },
];
