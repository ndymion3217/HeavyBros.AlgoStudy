

import java.util.Scanner;
public class Main{		//���� �˰��򿡼� Main Ŭ������ �������� ������ ������ ���� �߻�
    public static void main(String args[]){
        int a=0, b=0, n=0;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        a = n/5;
        n%=5;
        while(a>=0){
            if(n%3==0){
                b= n/3;
                n%=3;
                break;
            }
            a--;
            n+=5;
        }
        System.out.printf("%d", n == 0 ? a+b:-1);
    }
}

/*
ä�� ��ȣ	���̵�		���� ��ȣ	���� ����	���		�޸�	�ð�	���	�ڵ� ����	
7944451		whkgudwns	2839		���� ���	�¾ҽ��ϴ�!!	9868 KB	124 MS	Java	471 B
*/