package List;

import javafx.scene.image.Image;

public class Exotic {

	private String weaponEngName;
	private String weaponName;
	private String weaponType;
	private String weaponexplan;
	private String unique;
	private String uniquename;
	private String specialPuckname;
	private String specialPuck;
	private String getway;
	private String masterPieceQuest;
	private String masterPieceReward;
	
	private Image weaponIcon;
	private Image uniqueIcon;
	private Image spPuckIcon;
	private Image status;
	private Image detail;
	private Image masterPieceIcon;
	
	
	public Exotic(String nameEng, String name, String desc,String uniname,String uni,String Type,String sPuckN,
			String sPuck,String get,String masterQuest,String masterRe,Image wIcon,Image uIcon,Image spIcon,Image status,Image detail,Image masterIcon) {
		this.weaponEngName = nameEng;
		this.weaponName = name;
		this.weaponexplan = desc;
		this.uniquename = uniname;
		this.unique = uni;
		this.weaponType = Type;
		this.specialPuckname = sPuckN;
		this.specialPuck = sPuck;
		this.getway = get;
		this.weaponIcon = wIcon;
		this.uniqueIcon = uIcon;
		this.spPuckIcon = spIcon;
		this.status = status;
		this.detail = detail;
		this.masterPieceIcon = masterIcon;
		this.masterPieceQuest = masterQuest;
		this.masterPieceReward = masterRe;
	}
	
	public String getSpecialPuckname() {
		return specialPuckname;
	}

	public void setSpecialPuckname(String specialPuckname) {
		this.specialPuckname = specialPuckname;
	}

	public String getUniquename() {
		return uniquename;
	}

	public void setUniquename(String uniquename) {
		this.uniquename = uniquename;
	}

	public String getWeaponName() {
		return weaponName;
	}

	public void setWeaponName(String weaponName) {
		this.weaponName = weaponName;
	}

	public String getWeaponType() {
		return weaponType;
	}

	public void setWeaponType(String weaponType) {
		this.weaponType = weaponType;
	}

	public String getWeaponexplan() {
		return weaponexplan;
	}

	public void setWeaponexplan(String weaponexplan) {
		this.weaponexplan = weaponexplan;
	}

	public String getUnique() {
		return unique;
	}

	public void setUnique(String unique) {
		this.unique = unique;
	}

	public String getSpecialPuck() {
		return specialPuck;
	}

	public void setSpecialPuck(String specialPuck) {
		this.specialPuck = specialPuck;
	}

	public String getGetway() {
		return getway;
	}

	public void setGetway(String getway) {
		this.getway = getway;
	}

	@Override
	public String toString() {
		return weaponName;
	}

	public Image getWeaponIcon() {
		return weaponIcon;
	}

	public void setWeaponIcon(Image weaponIcon) {
		this.weaponIcon = weaponIcon;
	}

	public Image getUniqueIcon() {
		return uniqueIcon;
	}

	public void setUniqueIcon(Image uniqueIcon) {
		this.uniqueIcon = uniqueIcon;
	}

	public Image getSpPuckIcon() {
		return spPuckIcon;
	}

	public void setSpPuckIcon(Image spPuckIcon) {
		this.spPuckIcon = spPuckIcon;
	}

	public Image getStatus() {
		return status;
	}

	public void setStatus(Image status) {
		this.status = status;
	}

	public Image getDetail() {
		return detail;
	}

	public void setDetail(Image detail) {
		this.detail = detail;
	}

	public String getMasterPieceQuest() {
		return masterPieceQuest;
	}

	public void setMasterPieceQuest(String masterPieceQuest) {
		this.masterPieceQuest = masterPieceQuest;
	}

	public String getMasterPieceReward() {
		return masterPieceReward;
	}

	public void setMasterPieceReward(String masterPieceReward) {
		this.masterPieceReward = masterPieceReward;
	}

	public Image getMasterPieceIcon() {
		return masterPieceIcon;
	}

	public void setMasterPieceIcon(Image masterPieceIcon) {
		this.masterPieceIcon = masterPieceIcon;
	}

	public String getWeaponEngName() {
		return weaponEngName;
	}

	public void setWeaponEngName(String weaponEngName) {
		this.weaponEngName = weaponEngName;
	}
	
}
