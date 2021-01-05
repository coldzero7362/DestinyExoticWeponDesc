package views;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import List.Exotic;
import application.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class MainController {
	@FXML
	private ListView<Exotic> list;

	private ObservableList<Exotic> items;

	@FXML
	private Label WeaponNameLable;// 무기이름
	@FXML
	private Label WeaponexplanLable;// 무기설명
	@FXML
	private Label UniqueNameLable;// 본질 이름
	@FXML
	private Label UniqueLable;// 본질 라벨
	@FXML
	private Label weaponTypeLable;// 무기 타입
	@FXML
	private Label Specialpuck;// 특수 퍽
	@FXML
	private Label SpecialpuckName;// 특수 퍽이름
	@FXML
	private Label getwayLabel;// 획득방법
	@FXML
	private Label mastermakeQuest;
	@FXML
	private Label mastermakeEffect;
	@FXML
	private Label Dammy;
	
	
	@FXML
	private ImageView weaponicon;// 총기 아이콘
	@FXML
	private ImageView Uniquelicon;// 본질 아이콘
	@FXML
	private ImageView Specialpeckicon;// 특수 퍽 아이콘
	@FXML
	private ImageView Status;
	@FXML
	private ImageView mastermakeIcon;
	@FXML
	private ImageView details;

	int mode = 0;

	@FXML
	private void initialize() {

		File Name = new File(getClass().getResource("/Explanation/weponName.txt").getFile());
		items = FXCollections.observableArrayList();
		list.setItems(items);
		try {
			FileInputStream fis = new FileInputStream(Name);
			InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
			BufferedReader br = new BufferedReader(isr);
			
			while (true) {
				String line = br.readLine();
				if (line == null)
					break;
				String[] infoStr = line.split("#");

				if (infoStr.length < 10) {
					System.out.println(line);// 디버그용 코드(콘솔출력)
				}				
				
				Image img = new Image(Main.class.getResource("/WeaponIcon/" + infoStr[0] + ".jpg").toString());
				Image img2 = new Image(getClass().getResource("/unipuckicon/" + infoStr[0] + ".png").toString());
				Image img3 = new Image(getClass().getResource("/spPuckIcon/" + infoStr[0] + ".png").toString());
				Image img4 = new Image(getClass().getResource("/Status/" + infoStr[0] + ".png").toString());
				Image img5 = new Image(getClass().getResource("/details/" + infoStr[0] + ".jpg").toString());
				Image img6 = new Image(getClass().getResource("/masterPiece/" + infoStr[0] + ".jpg").toString());
				
				Exotic temp = new Exotic(infoStr[0], infoStr[1], infoStr[2], infoStr[3], infoStr[4], infoStr[5],
						infoStr[6], infoStr[7],infoStr[8],infoStr[9],infoStr[10],img, img2, img3, img4,img5,img6);

				items.add(temp);
				mode++;
				
				if (mode == 52) {
					System.out.println("파일이 모두 읽어짐 ");

				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("파일입력중 오류 발생");
		}
	
	}

	
	
	public void view() {

		int idx = list.getSelectionModel().getSelectedIndex();
		if (idx >= 0) {
			Exotic item = items.get(idx);
			
			WeaponNameLable.setText(item.getWeaponName());
			WeaponexplanLable.setText(item.getWeaponexplan().replace("\\n", "\n"));
			UniqueNameLable.setText(item.getUniquename());
			UniqueLable.setText(item.getUnique().replace("\\n", "\n"));
			weaponTypeLable.setText(item.getWeaponType());
			SpecialpuckName.setText(item.getSpecialPuckname());
			Specialpuck.setText(item.getSpecialPuck().replace("\\n", "\n"));
			getwayLabel.setText(item.getGetway().replace("\\n", "\n"));
			weaponicon.setImage(item.getWeaponIcon());
			Uniquelicon.setImage(item.getUniqueIcon());
			Specialpeckicon.setImage(item.getSpPuckIcon());
			Status.setImage(item.getStatus());
			details.setImage(item.getDetail());
			mastermakeIcon.setImage(item.getMasterPieceIcon());
			mastermakeQuest.setText(item.getMasterPieceQuest().replace("\\n", "\n"));
			mastermakeEffect.setText(item.getMasterPieceReward().replace("\\n", "\n"));

		}
	}

}
