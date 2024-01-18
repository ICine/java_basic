#include<iostream>
#include<iomanip>
#define Max 50

using namespace std;

typedef struct SinhVien{
	char name[30];
	int msv;
	float diem_that;
} SV;

struct List{
	int count;
	SV e[Max];
};

void nhapsv(SV &sv)
{
	
	cout << "Nhap ten sv: ";fflush(stdin);
	gets(sv.name);
	cout << "Nhap msv: "; 
	cin >> sv.msv;
	cout << "Nhap diem sv: ";
	cin >> sv.diem_that;
}

void nhapds(List &L)
{
	SV x; L.count = -1;
	List initializer_list(L);
	do
	{
		cout << "Nhap sv thu " << L.count + 1<<endl;
		nhapsv(x);
		L.count ++;
		L.e[L.count] = x;
	}while (L.count < 2);
}

void hiends(List L)
{
	cout << setw(10) << "Name";
	cout << setw(5) << "MSV";
	cout << setw(17) << "Diem" << endl;
	
	for (int i = 0; i <= L.count; i++)
	{
		cout << setw(10) << L.e[i].name;
		cout << setw(5) << L.e[i].msv;
		cout << setw(17) << L.e[i].diem_that << endl;
	}
}

int main()
{
	List L;
	nhapds(L);
	hiends(L);
	
	return 0;
}