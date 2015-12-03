package package2;

public class Mediator {
	
	private FootSoldier footSoldier ;
	private SpySoldier spySoldier ;
	private ArtillerySoldier artillerySoldier ;
	
	public FootSoldier getFootSoldier() {
		return footSoldier;
	}
	public void setFootSoldier(FootSoldier footSoldier) {
		this.footSoldier = footSoldier;
	}
	public SpySoldier getSpySoldier() {
		return spySoldier;
	}
	public void setSpySoldier(SpySoldier spySoldier) {
		this.spySoldier = spySoldier;
	}
	public ArtillerySoldier getArtillerySoldier() {
		return artillerySoldier;
	}
	public void setArtillerySoldier(ArtillerySoldier artillerySoldier) {
		this.artillerySoldier = artillerySoldier;
	}
	
	public void execute(String code) {
		if(code.equals("paoji")){
			this.artillerySoldier.work();
		}else if (code.equals("zhengcha")) {
			this.spySoldier.work();
		}else if (code.equals("chongfeng")) {
			this.footSoldier.work();
		}else {
			System.out.println("指令错误！");
		}
	}
	
}
