/*
	Hãy nhập vào 1 danh sách sinh viên được lưu trữ kế tiếp
	SV (họ tên, msv, điểm thật). Thực hiện các yêu cầu sau 
	+ In ra danh sách sinh viên vừa nhập 
	+ Xóa 1 sinh viên ở vị trí thứ k
	+ Sắp xếp danh sách sinh viên theo chiều giảm dần của điểm thật bằng phương pháp nổi bọt, lựa chọn
*/

#include<iostream>
#include<iomanip>

using namespace std;

struct SinhVien {
	char name[30];
	int msv;
	float diem_that;
};

typedef SinhVien SV;

void nhapThongTinSV(SV &sv);
void xuatThongTinSV(SV sv);
void nhapSV(SV a[], int &n);
void xuatSV(SV a[], int n);
int xoaSV(SV a[], int &n, int key);
void sapXepNoiBot(SV a[], int n);
void sapXepLuaChon(SV a[], int n);


int main() 
{
	int n;
	SV a[1000];
	nhapSV(a, n);
	xuatSV(a, n);
	
	int xoa_sv = xoaSV(a, n , 3);
	if (xoa_sv)
		cout << "Xoa sinh vien thanh cong " << endl;
	else 
		cout << "Xoa thinh vien that bai" << endl;
		
	xuatSV(a, n);
	return 0;
}

void nhapThongTinSV(SV &sv)
{
	cout << "Nhap ten sinh vien:"; fflush(stdin); gets(sv.name);
	cout << "Nhap msv: "; cin >> sv.msv;
	cout << "Nhap diem that: "; cin >> sv.diem_that;
}

void xuatThongTinSV(SV sv)
{
	cout << right << setw(2) << sv.name	
		<< right << setw(12) << sv.msv
		<< right << setw(12) << sv.diem_that << endl;
}
void nhapSV(SV a[], int &n)
{
	cout << "Nhap so luong sinh vien: "; cin >> n;
	for (int i = 0; i < n; i++)
	{
		cout << "Nhap thong tin sinh vien thu " << i + 1 << ": " << endl;
		nhapThongTinSV(a[i]);
	}
}
void xuatSV(SV a[], int n)
{
	cout << right << setw(2) << "Name"	
		<< right << setw(12) << "msv"
		<< right << setw(12) << "Diem" << endl;
	for (int i = 0; i < n; i++)
		xuatThongTinSV(a[i]);
	
}
int xoaSV(SV a[], int &n, int key)
{
	if (key > n || key < 0)
		return -1;	
	
	for (int i = key; i < n - 1; i++)
		a[i] = a[i + 1];
	
	n--;
	return 1;
}

//3
//Hung 
//2022601019
//10
//Hoa 
//2022601020
//10
//Phuong 
//2022601021
//8

//void sapXepNoiBot(SV a[], int n);
//void sapXepLuaChon(SV a[], int n);


