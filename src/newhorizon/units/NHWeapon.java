package newhorizon.units;

import mindustry.entities.bullet.BulletType;
import mindustry.type.Weapon;
import newhorizon.NewHorizon;

public class NHWeapon extends Weapon{
	public NHWeapon(){
		this("");
	}
	
	public NHWeapon(String name){
		super(NewHorizon.name(name));
	}
	
	@Override
	public NHWeapon copy(){
		return (NHWeapon)super.copy();
	}
	
//	@Override
//	public void load(){
//		this.region = Core.atlas.find(name, Core.atlas.find("clear"));
//		this.heatRegion = Core.atlas.find(name + "-heat");
//		this.outlineRegion = Core.atlas.find(name + "-outline");
//	}
	
	public NHWeapon setInaccuracy(float inaccuracy){
		this.inaccuracy = inaccuracy;
		return this;
	}
	
	public NHWeapon setAutoTarget(boolean active){
		autoTarget = active;
		controllable = !active;
		return this;
	}
	
	public NHWeapon setAlternate(boolean b){
		alternate = b;
		return this;
	}
	
	public NHWeapon setPos(float x, float y){
		this.x = x;
		this.y = y;
		return this;
	}
	
	public NHWeapon salvoDelay(int total, int id){
		this.firstShotDelay = reload/ total * id;
		return this;
	}
	
	public NHWeapon setDelay(float delay){
		this.firstShotDelay = delay;
		return this;
	}
	
	public NHWeapon setType(BulletType type){
		bullet = type;
		return this;
	}
	
	public static Weapon setPos(Weapon weapon, float x, float y){
		weapon.x = x;
		weapon.y = y;
		return weapon;
	}
}
