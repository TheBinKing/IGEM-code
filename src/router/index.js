import Vue from 'vue'
import Router from 'vue-router'
import notFound from '@/components/notFound'
import index from "../pages/index"
import home from '../pages/home'
import page1 from '../pages/page1'
import page2 from '../pages/page2'
import page3 from '../pages/page3'
import page4 from '../pages/page4'
import side1 from '../pages/page2/side1'
import side2 from '../pages/page2/side2'
import login from '../pages/login'
import register from '../pages/register'
import background from '../pages/pages/demo-background';
import basic from '../pages/pages/demo-basic'
import collada from '../pages/pages/demo-collada'
import controls from '../pages/pages/demo-controls'
import event from '../pages/pages/demo-event'
import fbx from '../pages/pages/demo-fbx'
import gltf from '../pages/pages/demo-gltf'
import json from '../pages/pages/demo-json'
import obj from '../pages/pages/demo-obj'
import objMtl from '../pages/pages/demo-obj-mtl'
import rotate from '../pages/pages/demo-rotate'
import ply from '../pages/pages/demo-ply'
import snapshot from '../pages/pages/demo-snapshot'
import stl from '../pages/pages/demo-stl'


Vue.use(Router)

export default new Router({
    routes: [{
        path: '/',
        redirect: '/home'
    },{
        path:'/home',
        name:'home',
        component: home
    }, {
        path: '/page1',
        name: 'page1',
        component: page1
      }, {
        path: '/page2',
        name: 'page2',
        component: page2
      }, {
        path: '/page3',
        name: 'page3',
        component: page3
      }, {
        path: '/page4',
        name: 'page4',
        component: page4
      }, {
        path: '/side1',
        name: 'side1',
        component: side1
      }, {
        path: '/side2',
        name: 'side2',
        component: side2
      },{
        path: '/login',
        name: 'login',
        component: login
      }, {
        path: '/register',
        name: 'register',
        component: register
      }, {
        path: '*',
        name: 'notFound',
        component: notFound,
      },{
        path: '/page2/demo-background',
        name: 'background',
        component: background,
      },
      {
        path: '/page2/demo-basic',
        name: 'basic',
        component: basic,
      },
      {
        path: '/page2/demo-collada',
        name: 'collada',
        component: collada,
      },
      {
        path: '/page2/demo-controls',
        name: 'controls',
        component: controls,
      },{
        path: '/page2/demo-event',
        name: 'event',
        component: event,
      },{
        path: '/page2/demo-fbx',
        name: 'fbx',
        component: fbx,
      },{
        path: '/page2/demo-gltf',
        name: 'gltf',
        component: gltf,
      },{
        path: '/page2/demo-json',
        name: 'json',
        component: json,
      },{
        path: '/page2/demo-obj',
        name: 'obj',
        component: obj,
      },{
        path: '/page2/demo-obj-mtl',
        name: 'objMtl',
        component: objMtl,
      },{
        path: '/page2/demo-ply',
        name: 'ply',
        component: ply,
      },{
        path: '/page2/demo-rotate',
        name: 'rotate',
        component: rotate,
      },{
        path: '/page2/demo-snapshot',
        name: 'snapshot',
        component: snapshot,
      },{
        path: '/page2/demo-stl',
        name: 'stl',
        component: stl,
      },
    ]
})