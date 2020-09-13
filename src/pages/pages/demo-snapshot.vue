<template>
<div class="content">
  <demo-block :childData="Mobj" @childhandler='childhandler'>
    <template slot="preview">
      <button type="button" class="create" @click="snapshot">snapshot</button>
      <model-obj
        ref="model"
        :backgroundAlpha="0"
        @on-load="onLoad"
        :rotation="rotation"
        :src="Mobj"
        :mtl="Mmtl"
        :glOptions="{ preserveDrawingBuffer: true }"
      />
      <img class="snapshot" v-if="base64" :src="base64" />
      <div class="example-loading" v-show="loading"></div>
    </template>
  </demo-block>
</div>
</template>

<script>
import DemoBlock from '../../components/demo-block.vue';
import ModelObj from '../../3dModel/model-obj.vue';

export default {
  name: 'demo-snapshot',
  data() {
    return {
      path: 'static/models/obj/',
      obj: '.obj',
      mtl: '.mtl',
      Mobj: 'static/models/obj/tree.obj',
      Mmtl: 'static/models/obj/tree.mtl',
      loading: true,
      base64: null,
      rotation: {
        x: -Math.PI / 2,
        y: 0,
        z: 0,
      },
    };
  },
  methods: {
    onLoad() {
      this.loading = false;
    },
    snapshot() {
      this.base64 = this.$refs.model.renderer.domElement.toDataURL('image/png', 1);
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
<style>
.create {
  position: absolute;
  left: 20px;
  top: 20px;
  z-index: 10000;
  background: #fff;
  padding: 4px 6px;
  margin-top: 5px;
  outline: none;
  border: 1px solid #c4c4c4;
}

.snapshot {
  position: absolute;
  bottom: 20px;
  left: 20px;
  height: 200px;
  border: 1px solid #c4c4c4;
  border-radius: 2px;
}
</style>
<style lang="less" scoped>
.content {
  padding: 20px;
  max-width: 1200px;
  margin: 80px auto 0;
}
</style>