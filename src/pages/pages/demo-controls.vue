<template>
<div class="content">
  <demo-block  :childData="Mobj" @childhandler='childhandler'>
    <template slot="preview">
      <div class="controls-buttons">
        <button @click="toggle('pan')">{{ enablePan ? 'disable' : 'enable' }} translation</button>
        <button @click="toggle('zoom')">{{ enableZoom ? 'disable' : 'enable' }} zoom</button>
        <button @click="toggle('rotate')">{{ enableRotate ? 'disable' : 'enable' }} rotation</button>
      </div>
      <model-obj
        :backgroundAlpha="0"
        @on-load="onLoad"
        :src="Mobj"
        :mtl="Mmtl"
        :controlsOptions="{
          enablePan,
          enableZoom,
          enableRotate,
        }"
      ></model-obj>
      <div class="example-loading" v-show="loading"></div>
    </template>
  </demo-block>
  </div>
</template>

<style>
.controls-buttons {
  width: 130px;
}
.controls-buttons > button {
  background: #fff;
  padding: 4px 6px;
  margin-top: 5px;
  margin-left: 4px;
  outline: none;
  cursor: pointer;
  border: 1px solid #c4c4c4;
}
</style>

<script>
import DemoBlock from '../../components/demo-block.vue';
import ModelObj from '../../3dModel/model-obj.vue';

export default {
  name: 'demo-controls',
  data() {
    return {
      loading: true,
      enablePan: true,
      enableZoom: true,
      enableRotate: true,
      path: 'static/models/obj/',
      obj: '.obj',
      mtl: '.mtl',
      Mobj: 'static/models/obj/tree.obj',
      Mmtl: 'static/models/obj/tree.mtl',
    };
  },
  methods: {
    onLoad() {
      this.loading = false;
    },
    toggle(type) {
      if (type === 'pan') this.enablePan = !this.enablePan;
      if (type === 'zoom') this.enableZoom = !this.enableZoom;
      if (type === 'rotate') this.enableRotate = !this.enableRotate;
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
<style lang="less" scoped>
.content {
  padding: 20px;
  max-width: 1200px;
  margin: 80px auto 0;
}
</style>