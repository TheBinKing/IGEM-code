<template>
<div class="content">
  <demo-block :childData="Mobj" @childhandler='childhandler'>
    <template slot="preview">
      <div class="background-buttons">
        <p>Color</p>
        <button @click="bgColor = '#ff0'">#ff0</button>
        <button @click="bgColor = '#f00'">#f00</button>
        <button @click="bgColor = '#13ce66'">#13ce66</button>
        <p>Alpha</p>
        <button @click="bgAlpha = 0.5">0.5</button>
        <button @click="bgAlpha = 1">1</button>
        <button @click="bgAlpha = 0">0</button>
      </div>
      <model-obj
        class="model-box"
        :backgroundAlpha="bgAlpha"
        :backgroundColor="bgColor"
        @on-load="onLoad"
        :src="Mobj"
        :mtl="Mmtl"
      ></model-obj>
      <div class="example-loading" v-show="loading"></div>
    </template>
  </demo-block>
  </div>
</template>
<style lang="less" scoped>
.content {
  padding: 20px;
  max-width: 1200px;
  margin: 80px auto 0;
}
</style>
<style >

.background-text {
  position: absolute;
  top: 50%;
  left: 0;
  z-index: 1;
  width: 100%;
  transform: translateY(-50%);
  text-align: center;
  font-size: 60px;
}
.background-buttons {
  position: absolute;
  top: 0;
  left: 10px;
  z-index: 3;
}

.background-buttons > p {
  margin-top: 15px;
  color: #000;
}

.background-buttons > button {
  background: #fff;
  padding: 4px 6px;
  margin-top: 5px;
  outline: none;
  border: 1px solid #c4c4c4;
}

.model-box {
  position: relative;
  z-index: 2;
}
</style>

<script>
import DemoBlock from '../../components/demo-block.vue';
// import DemoBlock from '../components/demo-block.vue';
// import ModelObj from '../../3dModel/model-obj.vue';
import ModelObj from '../../3dModel/model-obj.vue';
export default {
  name: 'demo-background',
  data() {
    return {
      path: 'static/models/obj/',
      obj: '.obj',
      mtl: '.mtl',
      Mobj: 'static/models/obj/tree.obj',
      Mmtl: 'static/models/obj/tree.mtl',
      loading: true,
      bgColor: '#ff0',
      bgAlpha: 0.5,
    };
  },
  methods: {
    onLoad() {
      this.loading = false;
    },
    childhandler(val) {
      console.log(val);
      this.Mobj = this.path + val + this.obj;
      this.Mmtl = this.path + val + this.mtl;
    },

  },
  components: {
    ModelObj,
    DemoBlock,
  },
};
</script>
