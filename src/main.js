import Vue from 'vue';
import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';
import App from './App'
import router from './router'
import i18n from './i18n/';
import axios from 'axios';

Vue.use(ElementUI);


Vue.config.productionTip = false

new Vue({
  el:'#app',
  router,
  i18n,
  axios,
  render: h=> h(App)
}).$mount('#app')
