<template>
  <div id="app">

    <nav>
      <div class="nav-wrapper blue darken-1">
        <a href="#" class="brand-logo center">Usuarios Front</a>
      </div>
    </nav>

    <div class="container">

      <ul>
        <li v-for="(erro, index) of errors" :key="index">
          campo <b>{{erro.field}}</b> - {{erro.defaultMessage}}
        </li>
      </ul>


      <form @submit.prevent="salvar">

          <label>Nome</label>
          <input type="text" placeholder="Nome" v-model="usuario.nome" >
          <label>Quantidade</label>
          <input type="number" placeholder="Idade" v-model="usuario.quantidade" >
          <label>Valor</label>
          <input type="text" placeholder="Salário" v-model="usuario.valor" >

          <button class="waves-effect waves-light btn-small">Salvar<i class="material-icons left">save</i></button>

      </form>

      <table>

        <thead>

          <tr>
            <th>NOME</th>
            <th>IDADE</th>
            <th>SALARIO</th>
            <th>OPÇÕES</th>
          </tr>

        </thead>

        <tbody>

          <tr v-for="usuario of usuarios" :key="usuario.id">

            <td>{{ usuario.nome }}</td>
            <td>{{ usuario.quantidade }}</td>
            <td>{{ usuario.valor }}</td>
            <td>
              <button @click="editar(usuario)" class="waves-effect btn-small blue darken-1"><i class="material-icons">create</i></button>
              <button @click="remover(usuario)" class="waves-effect btn-small red darken-1"><i class="material-icons">delete_sweep</i></button>
            </td>

          </tr>

        </tbody>
      
      </table>

    </div>

  </div>
</template>

<script>

import Usuario from './services/usuarios'

export default {
  name: 'app',
  data () {
    return {
      usuario:{
        id: '',
        nome: '',
        idade: '',
        salario: ''
      },
      usuarios: [],
      errors: []
    }
  },

  mounted(){
    this.listar()
  },

  methods:{
    
    listar(){
      Usuario.listar().then(resposta => {
        this.usuarios = resposta.data
      }).catch(e => {
        console.log(e)
      })
    },

    salvar(){

      if(!this.usuario.id){

        Usuario.salvar(this.usuario).then(resposta => {
          this.usuario = {}
          alert('Cadastrado com sucesso!')
          this.listar()
          this.errors = {}
        }).catch(e => {
          this.errors = e.response.data.errors
        })

      }else{

        Usuario.atualizar(this.usuario).then(resposta => {
          this.usuario = {}
          this.errors = {}
          alert('Atualizado com sucesso!')
          this.listar()
        }).catch(e => {
          this.errors = e.response.data.errors
        })

      }
      

    },

    editar(usuario){
      this.usuario = usuario
    },

    remover(usuario){

      if(confirm('Deseja excluir o usuario?')){

        Usuario.apagar(usuario).then(resposta => {
          this.listar()
          this.errors = {}
        }).catch(e => {
          this.errors = e.response.data.errors
        })

      }

    }
  }

}
</script>

<style>



</style>
