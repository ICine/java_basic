#include<iostream>
#define MAX 6

using namespace std;

/*
	• Danh sách được lưu trữ trong bộ nhớ bởi một mảng một chiều
	gọi là lưu trữ kế tiếp.
	• Mỗi phần tử của mảng lưu trữ một phần tử của danh sách.
	• Ưu điểm:
	– Truy cập nhanh và đồng đều đối với mọi phần tử
	– Các thao tác được thực hiện khá đơn giản.
	• Nhược điểm:
	– Do kích thước mảng cố định khi khai báo nên có thể dẫn đến sự
	lãng phí hoặc thiếu bộ nhớ
*/


struct SinhVien
{
	char hoTen[30];
	int tuoi;
	double diemTk;
};

struct List
{
	int count;
	SinhVien e[MAX];
}

List L; // Khai báo ds L

// Các phép toán trên danh sách kế tiếp

// Khởi tạo danh sách rỗng
void create(List &L){
	L.count = -1;
}

// Kiểm tra danh sách rỗng
int empty(List L){
	return (L.count == -1);
}

// Kiểm tra danh sách đầy 
int full(List L){
	return (L.count == MAX-1);
}

// Thêm một phần tử vào cuối danh sách 
// Danh sách chưa đầy 
int add (List &L, SinhVien sv)
{
	if (full(L))
		return 0;
	else {
		L.count++;
		L.e[L.count] == sv;
		return 1;
	}
}

// Loại bỏ một phần tử khỏi danh sách 
int remove(int k, List &L)
{
	// K = 1-n
	if (k <= L.count + 1 && k > 0)
	{
		for (int i = k; i <= L.count; i++)
			L.e[i - 1] = L.e[i];
		L.count = L.count - 1;
		return 1;
	}
	else return 0;
}

// Chèn một phần tử vào vị trí k trong danh sách L
int insert(List &L, int k, SinhVien sv)
{
	if (k <= L.count + 1 && k > 0 && !full(L))
	{
		for (int i = L.count; i >= k - 1; i--)
			L.e[i+1] = L.e[i];
		L.e[k-1] = sv;
		L.count++;
		return 1;
	}
	else return 0;
}



int main()
{
	
	
	
	return 0;
}