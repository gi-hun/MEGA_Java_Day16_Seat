/*
 * # ���� ���
 * . ���� ������ �̸� ���
 */
package day_16;

public class ArrayEx34 {
	public static void main(String[] args) {
		String[] name = {"ȫ�浿", "�迵", "�ڹ�ŷ", "�κ�ö", "�ް���"};
		int[] score   = {    87,    42,    100,     11,     98};
		
		for(int i=0;i<5;i++)
		{
			int max=score[i];
			int idx = i;
			
			for(int j=i;j<5;j++)
			{
				if(max<score[j])
				{
					max = score[j];
					idx = j;
				}
			}
			
			int temp = score[i];
			score[i] = score[idx];
			score[idx] = temp;
			
		    String str = name[i];
			name[i] = name[idx];
			name[idx] = str;
		}
		
		for(int i=0;i<5;i++)
		{
			System.out.print(name[i] +" ");
			System.out.print(score[i] +" ");
			System.out.println();
		}
	}
}
