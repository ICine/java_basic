#include<bits/stdc++.h>
#define Max 10
using namespace std;

struct SinhVien{
	char Hoten[30];
	char masv[20];
	float diem;
};

struct List{
	int count;
	SinhVien s[Max];
};

void Input(SinhVien &x){
		cout << "\nNhap vao ma sinh vien: ";\
			fflush(stdin);
			gets(x.masv);
		cout << "\nNhap vao ho va ten sinh vien: ";
			fflush(stdin);
			gets(x.Hoten);
		cout << "\nNhap vao diem tong ket sinh vien: ";
			cin >> x.diem;
		cout << "\n---------------------||------------------\n";
}
void DanhSach(List &L){
	SinhVien x;
	L.count = -1;
	List intializer_List(L);
	do{
		cout << "\nNhap vao sinh vien thu "<<L.count+1<< endl;
		Input(x);
		L.count++;
		L.s[L.count] = x;
	}while(L.count < 2);

}

void Insert(List &L, int k){
	SinhVien x; 
	cout << "\nNhap sinh vien can bo sung: ";
	Input(x);
	for(int i = L.count + 1; i >= k; i--){
		L.s[i] = L.s[i - 1];
	}
	L.count = L.count+1;
	L.s[k-1] = x; 
}

void Delete(List &L, int k){
	for(int i = k - 1; i < L.count; i++){
		L.s[i]= L.s[i + 1];
		
	}
	L.count--;

}
void InsertionSort_Down(List &L){
	for(int i = 1; i <= L.count; i++){
		SinhVien temp = L.s[i];
		int j = i - 1;
		while(j >= 0 && temp.diem > L.s[j].diem){
			L.s[j + 1] = L.s[j];
			j--;
		}
		L.s[j+1] = temp;
	}
}

//void BubbleSort_Down(List &L){
//	for(int i = 0; i < L.count - 1; i++){
//		int m = i;
//		for()
//	}
//	
//}

void SelectionSort_Down(List &L){
	
}
void Output(List L){
	cout << left << setw(15) << "Ma sinh vien" << left << setw(30) << "Ho va ten" << left << setw(10) << "Diem" << endl;
	for(int i = 0; i <= L.count; i++){
		cout << left << setw(15) <<	L.s[i].masv << left << setw(30) << L.s[i].Hoten << left << setw(10) << L.s[i].diem<< endl;
	}
}


int main(){
	List L;
	int k, l;
	cout << "\nNHAP VAO DANH SACH SINH VIEN: " << endl;
	DanhSach(L);
	Output(L);
//	cout << "\nNhap vao vi tri can chen: ";
//		cin >> k;
//	Insert(L, k);
//	cout << "\nDanh sach sau khi chen la: \n";
//	Output(L);
//	cout << "\nNhap vao vi tri can xoa: ";
//		cin >> k;
//	Delete(L, k);
//	cout << "\nDanh sach sau khi xoa: \n";
//	Output(L);
	cout << "\ndanh sach sau khi sap xep giam la: ";
		InsertionSort_Down(L);
		Output(L);
		
}