/* 
Câu 1" Đệ quy 
Câu 2: Sắp xếp 
	Mô tả trên dãy số 
	Viết giải thuật 
Câu 3: Danh sách móc nối 
	Khai báo cấu trúc dữ liệu
Câu 4: Xây dựng cây nhị phân
*/
#include<iostream>

using namespace std;
/*
	Nguyên tắc tạo thành danh sách:
	+ Danh sách được tạo thành từ các phần tử gọi là nút (node)
	+ Các node có thể nằm bất kỳ đâu trong bộ nhớ 
	+ Mỗi node là một cấu trúc gồm 2 thành phần 
		- infor chứa thông tin của 1 phần tử của danh sách L
		- next là một con trỏ, nó trỏ vào node đứng sau
	
	Để truy nhập vào các node trong danh sách ta phải đi từ node đầu tiên
	Cần một con trỏ, trỏ vào node đầu của danh sách 
	Phần tử cuối cùng của danh sách có next=Null	
	
	Ưu điểm:
		- Tiết kiệm bộ nhớ 
		- Các thao tác thêm và xóa thực hiện nhanh vì không phải dịch chuyển các phần tử
	Nhược điểm:
		- Việc truy xuất vào các phần tử chậm vì luôn phải xuất phát từ phần tử đầu tiên
		- Chỉ duyệt được danh sách theo một chiều nhất định, từ trên xuống 
		- Các thao tác khá phức tạp, khó hiểu với người mới lập trình
*/

// Khai báo kiểu dữ liệu phần tử 
struct SinhVien{
	int id; 
	char hoTen[30];
	int tuoi;
	float diemTk;
};

// Khai báo kiểu dữ liệu Node 
struct Node{
	SinhVien infor;
	Node *next;
};

// Khai báo kiểu con trỏ Node 
typedef Node *TRO;

// Con trỏ L trỏ vào Node đầu 
TRO L;

// Các phép toán trên danh sách 
// Khởi tạo danh sách rỗng 
void creat(TRO &L){
	L = NULL;
}

// Kiểm tra danh sách rỗng
int empty(TRO L){
	return L == NULL;
}

// Hàm duyệt danh sách 
void travel(TRO L){
	TRO Q;
	if (!empty(L)){
		Q = L;
		while (Q != NULL)
		{
			// Statement 
			Q = Q->next;
		}
	}
}

/*
	Tìm kiếm một nút trên danh sách 
	1. Nếu danh sách không rỗng, cho con trỏ Q trỏ vào node đầu tiên Q = L;
	
	2. Nếu (Q!=NULL) và chưa trỏ vào node cần tìm thì có thể thực hiện yêu cầu 
		và chuyển Q xuống node ngay sau đó 
		Q = Q->next;
	3. Lặp lại bước 2:
	4. Trả về con trỏ Q: return Q;

*/

TRO search(TRO L){
	TRO Q = L;
	while (Q!=NULL && (ĐK))
		Q = Q->next;
	return Q;
}

/*
	Danh sách có phần tử đầu tiên được trỏ bởi con trỏ L
	Giả sử dữ liệu của phần tử lưu trong biến elem
	
	Khai báo con trỏ P
	Cấp phát bộ nhớ cho con trỏ P
	Đưa dữ liệu vào node mới 
	next của node mới trỏ vào phần tử đầu của danh sách 
	L = P
*/

void firstAdd(TRO &L, SinhVien sv)
{
	TRO P;
	P = new Node;
	P->infor = sv;
	P->next = L;
	L = P;
}

/*
	Chèn một nút vào cuối danh sách 
	1. Khởi tạo node mới và đưa dữ liệu vào node mới 
	2. Đưa con trỏ Q tìm đến cuối danh sách 
	3. Nối node cuối với node mới 
*/

void add(TRO &L, SinhVien sv)
{
	TRO P, Q;
	P = new Node; P->infor = sv;
	P->next = NULL;
	if (empty(L)) L = P;
	else {
		Q = L;
		while (Q->next != NULL)
			Q = Q->next;
		Q->next = P;
	}
}

/*
	Chèn một nút vào sau nút trỏ bởi Q
	Danh sách có phần tử đầu tiên được trỏ bởi con trỏ L
		Q trỏ vào node mà node mới được bổ úng vào sau nó 
	Dữ liệu lưu trong biên elem 
		Khai báo con trỏ P: TRO P;
	Cấp phát bộ nhớ cho con trỏ P:
	P = new Node;
		Đưa dữ liệu vào node mới 
		P->infor = elem;
	next của node mới trỏ vào node đứng sau node trỏ bởi Q
		P->next = Q->next 
	next của node trỏ bởi Q trỏ vào node mới Q->next = P;
*/

void insert(TRO &L, TRO Q, SinhVien sv)
{
	TRO P;
	P = new Node ;
	P->infor = sv;
	P->next = Q->next;
	Q->next = P;
	// Hàm insert cũng thỏa mãn nếu bổ sung phần tử vào cuối danh sách 
	// khi đó Q trỏ vào node cuối dang sách 
}

/*
	Xóa nút đầu tiên trong danh sách 
	1. Khai báo con trỏ Q: TRO Q;
	2. Cho Q trỏ vào node đầu tiên 
		Q = L;
	3. Chuyển L xuống node thứ 2:
		L = L->next
	4. Xóa node trỏ bởi con trỏ Q
*/

void firstDelete(TRO &L)
{
	TRO Q;
	Q = L;
	L = L->next;
	delete Q;
}

/*
	Xóa nút đứng sau nút trỏ bởi con trỏ M 
	1. Khai báo con trỏ Q
	2. Cho Q trỏ vào node ở sau node trỏ bởi M 
	3. next của M trỏ vào node sau node trỏ bởi Q
	M->next = Q->next 
	4. Xóa node trỏ bởi con trỏ Q
*/
void after_Delete(TRO &L< TRO M)
{
	TRO Q;
	Q = M->next;
	M->next = Q->next;
	delete Q;
}

/*
	Tạo một danh sách mới 
	Xuất phát từ một danh sách rỗng
	1. Khai báo 2 con trỏ P, Q và biến elem
	2. Nhập dữ liệu cho biến elem 
	3. Cấp phát bộ nhớ cho con trỏ P và đưa dữ liệu vào chỗ nhớ đó
		đồng thời P->next = NULL;
	4. Nếu L=NUll thì L trỏ vào P ngược lại next của node trỏ bởi Q
		trỏ vào node mới 
	5. Cho Q trỏ vào node mới 
	6. Nếu thỏa mãn điều kiện nhập tiếp thì lặp lại bước 3, ngược lại kết thúc
*/

void input_List(TRO &L)
{
	TRO P,Q; SinhVien sv; char tieptuc; creat(L);
	do{
		......
	}
}

int main()
{
	
	
	return 0;
}