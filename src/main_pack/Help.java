package main_pack;

public final class Help {
	private final String[] doc = {
			"                                  ----��������----",
			"",
			"����   ->   ���������Ϣ��ʱ����",
			"����   ->   ����������ѱ�����Ϣ����",
			"����   ->   ����ѧ�Ų���ѧ���ɼ���Ϣ",
			"ͳ�����ѧ���ĳɼ�  ->  ���ɼ�ͳ���ԶԻ�����ʽ���",
			"��ʾ����ѧ����Ϣ  ->  ��ʾ�ݴ��������Ϣ",
			"��������   ->   ��������Ŀ¼��\"database.dat\"�ļ�����Ϣ",
			"��������   ->   ���ݴ���Ϣ��������Ŀ¼��\"database.dat\"�ļ�",
			"",
			"",
			"Copyright ������, ������ 2023, All rights reserved"
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
