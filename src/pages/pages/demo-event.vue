<template>
<div class="content">
  <demo-block :childData="Mobj" @childhandler='childhandler'>
    <template slot="preview">
      <model-obj
        :backgroundAlpha="0"
        ref="model"
        @on-load="onLoad"
        @on-mousemove="onMouseMove"
        :src="Mobj"
      ></model-obj>
      <div class="example-loading" v-show="loading"></div>
    </template>
  </demo-block>
</div>
</template>

<script>
import DemoBlock from '../../components/demo-block.vue';
import ModelObj from '../../3dModel/model-obj.vue';

export default {
  name: 'demo-event',
  data() {
    return {
      loading: true,
      intersected: null,
      path: 'static/models/obj/',
      obj: '.obj',
      Mobj: 'static/models/obj/tree.obj',
    };
  },
  methods: {
    onLoad() {
      this.loading = false;
    },
    onMouseMove(event) {
      console.log(event);

      if (!event) {
        if (this.intersected) {
          this.intersected.material.color.setStyle('#fff');
        }

        this.intersected = null;
        return;
      }

      this.intersected = event.object;
      this.intersected.material.color.setStyle('#13ce66');
    },
    childhandler(val) {
      console.log(val);
      this.Mobj = this.path + val + this.obj;
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