package main_pack;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import manager.StudentDatabase;

// import org.json.JSONObject;


public class ScoreManagement extends StudentManagementLayout implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		
		// 保存
		if (e.getSource() == saveButton) {
			String id = idField.getText();
			String name = nameField.getText();
			String gender = genderField.getText();
			double chinese = Double.parseDouble(chineseField.getText());
			double math = Double.parseDouble(mathField.getText());
			double english = Double.parseDouble(englishField.getText());
			double computer = Double.parseDouble(computerField.getText());
			StudentDatabase StudentDatabase = new StudentDatabase(id, name, gender, chinese, math, english, computer);
			StudentDatabases.add(StudentDatabase);
			JOptionPane.showMessageDialog(null, "添加成功！");
		} 
		
		// 查找
		else if (e.getSource() == findButton) {
			String id = idField.getText();
			boolean found = false;
			for (StudentDatabase StudentDatabase : StudentDatabases) {
				if (StudentDatabase.getId().equals(id)) {
					nameField.setText(StudentDatabase.getName());
					genderField.setText(StudentDatabase.getGender());
					chineseField.setText(String.valueOf(StudentDatabase.getChinese()));
					mathField.setText(String.valueOf(StudentDatabase.getMath()));
					englishField.setText(String.valueOf(StudentDatabase.getEnglish()));
					computerField.setText(String.valueOf(StudentDatabase.getComputer()));
					found = true;
					break;
				}
			}
			if (!found) {
				JOptionPane.showMessageDialog(null, "未找到该学生！");
			}
		} 
		
		// 更新信息
		else if (e.getSource() == updateButton) {
			String id = idField.getText();
			boolean found = false;
			for (StudentDatabase StudentDatabase : StudentDatabases) {
				if (StudentDatabase.getId().equals(id)) {
					StudentDatabase.setName(nameField.getText());
					StudentDatabase.setGender(genderField.getText());
					StudentDatabase.setChinese(Double.parseDouble(chineseField.getText()));
					StudentDatabase.setMath(Double.parseDouble(mathField.getText()));
					StudentDatabase.setEnglish(Double.parseDouble(englishField.getText()));
					StudentDatabase.setComputer(Double.parseDouble(computerField.getText()));
					JOptionPane.showMessageDialog(null, "更新成功！");
					found = true;
					break;
				}
			}
			if (!found) {
				JOptionPane.showMessageDialog(null, "未找到该学生！");
			}
		} 
		
		// 删除
		else if (e.getSource() == deleteButton) {
			String id = idField.getText();
			boolean found = false;
			for (int i = 0; i < StudentDatabases.size(); i++) {
				if (StudentDatabases.get(i).getId().equals(id)) {
					StudentDatabases.remove(i);
					JOptionPane.showMessageDialog(null, "删除成功！");
					found = true;
					break;
				}
			}
			if (!found) {
				JOptionPane.showMessageDialog(null, "未找到该学生！");
			}
		} 
		
		// 录入
		else if (e.getSource() == helpButton) {
			JOptionPane.showMessageDialog(null, new Help().toString());
		} 
		
		// 显示全部信息
		else if (e.getSource() == showAllButton) {
			if (StudentDatabases.size() == 0) {
				JOptionPane.showMessageDialog(null, "暂无学生信息！");
			} else {
				String message = "";
				for (StudentDatabase StudentDatabase : StudentDatabases) {
					message += "学号：" + StudentDatabase.getId() + "\n";
					message += "姓名：" + StudentDatabase.getName() + "\n";
					message += "性别：" + StudentDatabase.getGender() + "\n";
					message += "语文成绩：" + StudentDatabase.getChinese() + "\n";
					message += "数学成绩：" + StudentDatabase.getMath() + "\n";
					message += "英语成绩：" + StudentDatabase.getEnglish() + "\n";
					message += "计算机成绩：" + StudentDatabase.getComputer() + "\n";
					message += "============================\n";
				}
				JTextArea textArea = new JTextArea(message);
				JScrollPane scrollPane = new JScrollPane(textArea);
				textArea.setFont(new Font("微软雅黑", Font.PLAIN, 16));
				scrollPane.setBounds(80, 110, 600, 360);
				JOptionPane.showMessageDialog(null, scrollPane);
			}
		} 
		
		// 累计
		else if (e.getSource() == statButton) {
			if (StudentDatabases.size() == 0) {
				JOptionPane.showMessageDialog(null, "暂无学生信息！");
			} else {
				double chineseSum = 0, mathSum = 0, englishSum = 0, computerSum = 0;
				double chineseMax = StudentDatabases.get(0).getChinese(), mathMax = StudentDatabases.get(0).getMath();
				double englishMax = StudentDatabases.get(0).getEnglish(), computerMax = StudentDatabases.get(0).getComputer();
				double chineseMin = StudentDatabases.get(0).getChinese(), mathMin = StudentDatabases.get(0).getMath();
				double englishMin = StudentDatabases.get(0).getEnglish(), computerMin = StudentDatabases.get(0).getComputer();
				for (StudentDatabase StudentDatabase : StudentDatabases) {
					chineseSum += StudentDatabase.getChinese();
					mathSum += StudentDatabase.getMath();
					englishSum += StudentDatabase.getEnglish();
					computerSum += StudentDatabase.getComputer();
					if (StudentDatabase.getChinese() > chineseMax) {
						chineseMax = StudentDatabase.getChinese();
					}
					if (StudentDatabase.getMath() > mathMax) {
						mathMax = StudentDatabase.getMath();
					}
					if (StudentDatabase.getEnglish() > englishMax) {
						englishMax = StudentDatabase.getEnglish();
					}
					if (StudentDatabase.getComputer() > computerMax) {
						computerMax = StudentDatabase.getComputer();
					}
					if (StudentDatabase.getChinese() < chineseMin) {
						chineseMin = StudentDatabase.getChinese();
					}
					if (StudentDatabase.getMath() < mathMin) {
						mathMin = StudentDatabase.getMath();
					}
					if (StudentDatabase.getEnglish() < englishMin) {
						englishMin = StudentDatabase.getEnglish();
					}
					if (StudentDatabase.getComputer() < computerMin) {
						computerMin = StudentDatabase.getComputer();
					}
				}
				double chineseAverage = chineseSum / StudentDatabases.size();
				double mathAverage = mathSum / StudentDatabases.size();
				double englishAverage = englishSum / StudentDatabases.size();
				double computerAverage = computerSum / StudentDatabases.size();
				String message = "语文成绩：\n";
				message += "平均分：" + chineseAverage + "\n";
				message += "最高分：" + chineseMax + "\n";
				message += "最低分：" + chineseMin + "\n";
				message += "======================================\n";
				message += "数学成绩：\n";
				message += "平均分：" + mathAverage + "\n";
				message += "最高分：" + mathMax + "\n";
				message += "最低分：" + mathMin + "\n";
				message += "======================================\n";
				message += "英语成绩：\n";
				message += "平均分：" + englishAverage + "\n";
				message += "最高分：" + englishMax + "\n";
				message += "最低分：" + englishMin + "\n";
				message += "======================================\n";
				message += "计算机成绩：\n";
				message += "平均分：" + computerAverage + "\n";
				message += "最高分：" + computerMax + "\n";
				message += "最低分：" + computerMin + "\n";
				
				// sumUpField.setText(message);
				
				/*
				JTextArea textArea = new JTextArea(message);
				sumUpScrollPane = new JScrollPane(textArea);
				sumUpScrollPane.setBounds(350, 140, 380, 240);
				sumUpScrollPane.setFont(new Font("微软雅黑", Font.PLAIN, 16));
				*/
				// JOptionPane.showMessageDialog(null, sumUpScrollPane);
				JOptionPane.showMessageDialog(null, message);
			}
		}
		
		// 导出
		else if (e.getSource() == saveToFileButton) {
			//JSONObject json = new JSONObject();
			String filePath = "database.dat";
			String jsonStr = JSON.toJSONString(StudentDatabases);
			
			FileWriter fw;
			try {
				fw = new FileWriter(filePath);
				fw.write(jsonStr);
				fw.flush();
				fw.close();
			} catch (IOException i) {
				i.printStackTrace();
			}
			
			JOptionPane.showMessageDialog(null, "导出成功！");
		}
		
		// 导入
		else if (e.getSource() == loadFromFileButton) {			
			StringBuilder stringBuilder = new StringBuilder(); // 存储文件中的字符流

	        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("database.dat"))) {
	            String line;
	            while ((line = bufferedReader.readLine()) != null) {
	                stringBuilder.append(line);
	            }
	        } catch (IOException i) {
	            i.printStackTrace();
	        }

	        String stringFromFile = stringBuilder.toString(); // 将读取的字符流转换为字符串
			
			// JSONObject loadFromJson = JSON.parseObject(stringFromFile);
			JSONArray jsonArray = JSON.parseArray(stringFromFile);  // 字符串解析为json数组
			for (int i = 0; i < jsonArray.size(); i++) {
			    JSONObject jsonObject = jsonArray.getJSONObject(i);
			    String loadId = jsonObject.getString("id");
			    String loadName = jsonObject.getString("name");
			    String loadGender = jsonObject.getString("gender");
			    double loadChinese = jsonObject.getDoubleValue("chinese");
			    double loadMath = jsonObject.getDoubleValue("math");
			    double loadEnglish = jsonObject.getDoubleValue("english");
			    double loadComputer = jsonObject.getDoubleValue("computer");
			    StudentDatabase StudentDatabase = new StudentDatabase(loadId, 
			    													  loadName, 
			    													  loadGender, 
			    													  loadChinese, 
			    													  loadMath, 
			    													  loadEnglish, 
			    													  loadComputer);
			    StudentDatabases.add(StudentDatabase);
			}
			
			//studentloadFromJson.getString("id");
			
			JOptionPane.showMessageDialog(null, "导入成功！");
		}
	}
}
