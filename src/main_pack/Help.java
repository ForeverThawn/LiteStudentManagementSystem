package main_pack;

public final class Help {
	private final String[] doc = {
			"                                  ----帮助主题----",
			"",
			"保存   ->   将输入的信息暂时保存",
			"更新   ->   将输入的且已保存信息更新",
			"查找   ->   根据学号查找学生成绩信息",
			"统计输出学生的成绩  ->  将成绩统计以对话框形式输出",
			"显示所有学生信息  ->  显示暂存的所有信息",
			"导入数据   ->   导入程序根目录下\"database.dat\"文件的信息",
			"导出数据   ->   将暂存信息导出至根目录下\"database.dat\"文件",
			"",
			"",
			"Copyright 高奕阳, 宋沛霖 2023, All rights reserved"
	};
	
	@Override
	public String toString() {
		StringBuilder buf = new StringBuilder();
		for (String s : doc) {
			buf.append(s + "\n");
		}
		return buf.toString();
	}
}
