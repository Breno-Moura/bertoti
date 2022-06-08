import { http } from './config'

export default	{

	salvar:(usuario)=>{
		return http.post('usuario',usuario);
  },
    
	atualizar:(usuario)=>{
		return http.put('usuario',usuario);
  },

  listar:()=>{
		return http.get('usuarios')
  },
    
	apagar:(usuario)=>{
		return http.delete('usuario', { data: usuario })
	}
}