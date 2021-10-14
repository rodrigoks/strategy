package br.com.jbusiness.designpattern.strategy.exemplo.frete;

public enum TipoFrete {

	NORMAL{
		@Override
		public Frete obterFrete() {
			return new Normal();
		}
	},
	SEDEX{
		@Override
		public Frete obterFrete() {
			return new Sedex();
		}
	};
	
	public abstract Frete obterFrete();
	
}
