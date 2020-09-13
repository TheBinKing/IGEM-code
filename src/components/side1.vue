<template>
  <div>
    <el-input placeholder="PLEASE INPUT PDB ID" v-model="input" clearable>
    </el-input>
    <br />
    <el-button type="primary" style="center" v-on:click="getPdbUrl()"
      >主要按钮</el-button
    >
    <!-- <div v-if="1"> -->
    <br />
    {{ id }}
    <br />
    {{ data }}
    <br />
    {{ list }}
    <br />
    <ul>
      <li
        v-for="(item, index) in inputValue"
        :key="index"
        :value="item.value"
        v-text="item.name"
      ></li>
    </ul>
    <div
      style="height: 400px; width: 400px; position: relative;"
      class="viewer_3Dmoljs"
      data-href="http://104.168.174.5/pdb/3eoz.pdb"
      data-backgroundcolor="0xffffff"
      data-select1="chain:A"
      data-style1="cartoon:color=spectrum"
      data-surface1="opacity:.7;color:white"
      data-select2="chain:B"
      data-style2="stick"
    ></div>
  </div>
  <!-- </div> -->
</template>

<script>
let pdbid;
import axios from "axios";
export default {
  data() {
    pdbid;

    return {
      input: "",
      data: null,
      list: [],
      id: null,
    };
  },
  methods: {
    getPdbUrl() {
      axios
        .get("http://104.168.174.5:9000/igem/3w_100/list?list=", {
          // id: "id",
          // name: "name",
          // page: page,
          // size: _this.$refs.pagination.size,
          params: {},
        })
        .then((response) => {
          // this.id = response.data.content.list[0].domain;
          // this.data = response.data;
          // this.list = response.data.content.list;
          console.log(response);
        })
        .catch(function(error) {
          console.log(error);
        });
    },
  },
  computed: {
    pdbSearch() {
      let _this = this;
      let inputValue = [];
      this.list.map(function(item) {
        if (item.name.search(_this.input) != -1) {
          inputValue.push(item);
        }
      });

      return inputValue;
    },
  },
  //created(){}
};
</script>
<style lang="less" scoped></style>
