



	/*�ѽ�, �߽��� ���Ѵ�.
	 * 1~8 �ѽ�, 9 �߽�
	 * �ѽ� ���ĵ��� �����Ѵ�.1~i(Random*i+1) 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	

	public class RandomFood {
		private static int k;
		private static int kf;
		
		private static String kList[] = { "�ѽ�", "�ѽ�", "�ѽ�", "�ѽ�", "�ѽ�"
				, "�ѽ�", "�ѽ�", "�ѽ�", "�ѽ�", "�߽�" };

		private static String kfList[] = { "��ȭ����", "���", "��Į����", "�人��", "���������ġ�",
				"����", "���赿 ��Į", "������", "���ٱ����屹", "�����", "�δ��" };

		

		public static String kfRandom() {
			int len = kList.length;
			k = (int)(Math.random() * len);
			if (k == 9)
				return "������ " + kList[k] + "�� �԰ڽ��ϴ�.";
			else {
				len = kfList.length;
				kf = (int)(Math.random() * len);
				return "������ " + kList[k] + " " + kfList[kf] + "��(��) �԰ڽ��ϴ�.";
			}
		}

		public static void main(String[] args) {
			for(int i = 0; i<100;i++)
			System.out.println(kfRandom());

		}
	
	}

	

