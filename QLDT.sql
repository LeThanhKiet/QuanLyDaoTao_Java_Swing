create database QLDT
use QLDT

create table tblNguoiQuanLy(
	MaNQL nvarchar(15) primary key,
	TenNQL nvarchar(40)
) 
insert into tblNguoiQuanLy values
('QuanLy1', N'Vũ Thị Hoài Thu'),
('QuanLy2', N'Lê Thành Kiệt'),
('QuanLy3', N'Phương Văn Cảnh')

create table tblNguoiDung(
	TenDangNhap nvarchar(30) primary key,
	MatKhau nvarchar(10) not null
)
insert into tblNguoiDung values
(N'admin1', 'admin1'),
(N'admin2', 'admin2'),
(N'admin3', 'admin3'),
(N'GV01', 'gv01'),
(N'GV02', 'gv02'),
(N'GV03', 'gv03'),
(N'GV04', 'gv04'),
(N'GV05', 'gv05'),
(N'GV06', 'gv06'),
(N'GV07', 'gv07'),
(N'SV01', 'sv01'),
(N'SV02', 'sv02'),
(N'SV03', 'sv03'),
(N'SV04', 'sv04'),
(N'SV05', 'sv05'),
(N'SV06', 'sv06'),
(N'SV07', 'sv07'),
(N'SV08', 'sv08'),
(N'SV09', 'sv09'),
(N'SV010', 'sv10'),
(N'SV011', 'sv011')

create table tblKhoa(
	MaKhoa nvarchar(10) primary key not null,
	TenKhoa nvarchar(50),
	SDT nvarchar(10),
)
insert into tblKhoa values
('CNTT',N'Công Nghệ Thông Tin','0945321780'),
('DTVT',N'Điện Tử Viễn Thông','0337745698'),
('QTKD',N'Quản Trị Kinh Doanh','0998345611')

create table tblChuyenNganh(
	MaChuyenNganh nvarchar(15) primary key,
	TenChuyenNganh nvarchar(90),
	MaKhoa nvarchar(10) foreign key references tblKhoa(MaKhoa),
)

insert into tblChuyenNganh values
('CNPM',N'Công Nghệ Phần Mềm','CNTT'),
('HTTMDT',N'Hệ Thống Thương Mại Điện Tử','CNTT'),
('QTVANM',N'Quản Trị Và An Ninh Mạng','CNTT'),
('TTNTVTGM',N'Trí Tuệ Nhân Tạo Và Thị Giác Máy','CNTT'),
('QTDN',N'Quản Trị Doanh Nghiệp','QTKD'),
('DTVKTMT',N'Điện Tử Và Kỹ Thuật Máy Tinh','DTVT'),
('DTVT',N'Điện Tử Viễn Thông','DTVT'),
('DTRVTTNT',N'Điện Tử RoBot Và Trí Tuệ Nhân Tạo','DTVT'),
('CHTTMVI',N'Các Hệ Thống Thông Minh Và IoT','DTVT'),
('MVTVMT',N'Mạng Viễn Thông Và Máy Tính','DTVT')

create table tblGiangVien(
	MaGV nvarchar(10) primary key not null,
	TenGV nvarchar(40),
	MaChuyenNganh nvarchar(15) foreign key references tblChuyenNganh(MaChuyenNganh),
	NgaySinh date,
	GioiTinh nvarchar(5),
	Email nvarchar(50),
	DiaChi nvarchar(50),
	SDT nvarchar(10)
)
insert into tblGiangVien values
('GV01',N'Phương Văn Cảnh','CNPM','08/19/1991',N'Nam',N'phuongvancanh@gmail.com',N'Hà Nội','0987654126'),
('GV02',N'Nguyễn Văn Đoàn','TTNTVTGM','07/03/1986',N'Nam',N'nguyenvandoan@gmail.com',N'Nam Định','0998706532'),
('GV03',N'Lê Mạnh Hùng','QTVANM','12/3/1983',N'Nam',N'lemanhhung@gmail.com',N'Hà Nội','0873610987'),
('GV04',N'Trần Thị Linh','QTDN','11/11/1979',N'Nữ',N'tranthilinh@gmail.com',N'Hà Nam','0374523097'),
('GV05',N'Nguyễn Văn Nam','DTVT','4/4/1990',N'Nam',N'nguyenvannam@gmail.com',N'Thái Bình','0987091123'),
('GV06',N'Bùi Khánh Linh','HTTMDT','7/7/1978',N'Nữ',N'buikhanhlinh@gmail.com',N'Hải Phòng','0345687109')

create table tblLop(
	MaLop nvarchar(10) primary key not null,
	TenLop nvarchar(30),
	MaChuyenNganh nvarchar(15) foreign key references tblChuyenNganh(MaChuyenNganh),
	SiSo int,
	KhoaHoc nvarchar(40)
)
insert into tblLop values
('Lop01','D16CNPM7','CNPM',40,2021),
('Lop02','D16CNPM1','CNPM',50,2021),
('Lop03','D15HTTMDT','HTTMDT',60,2020),
('Lop04','D16QTDN4','QTDN',40,2021),
('Lop05','D14DTVT','DTVT',60,2019),
('Lop06','D17QTVANM','QTVANM',50,2022)


create table tblSinhVien(
	MaSV nvarchar(10) primary key not null,
	TenSV nvarchar(40),
	NgaySinh date,
	GioiTinh nvarchar(5),
	DiaChi nvarchar(50),
	SDT nvarchar(10),
	MaLop nvarchar(10) foreign key references tblLop(MaLop),
	HeDaoTao nvarchar(50)
)
insert into tblSinhVien values
('SV01',N'Lê Thành Kiệt','2/7/2000',N'Nam',N'Hà Nội',0902345678,'Lop01',N'Đại Học'),
('SV02',N'Vũ Thị Hoài Thu','10/03/2003',N'Nữ',N'Thái Bình',0376891649,'Lop01',N'Đại Học'),
('SV03',N'Nguyễn Thị Thu Hương','7/27/2003',N'Nữ',N'Bắc Giang',0376896667,'Lop01',N'Đại Học'),
('SV04',N'Lê Thanh Bình','1/4/2003',N'Nam',N'Hà Nội',0987912314,'Lop02',N'Đại Học'),
('SV05',N'Nguyễn Xuân Thủy','7/27/2003',N'Nam',N'Hà Nam',0734162905,'Lop02',N'Đại Học'),
('SV06',N'Trịnh Phương Linh','11/23/2003',N'Nữ',N'Hưng Yên',0345222809,'Lop03',N'Đại Học'),
('SV07',N'Trần Hông Quân','2/10/2003',N'Nam',N'Ninh Bình',0999657743,'Lop03',N'Đại Học'),
('SV08',N'Phạm Thùy Trang','10/14/2003',N'Nữ',N'Thái Bình',0377455809,'Lop04',N'Đại Học'),
('SV09',N'Lê Huy Đồng','11/11/2002',N'Nam',N'Thanh Hóa',0987650934,'Lop05',N'Đại Học'),
('SV10',N'Phạm Minh Hiếu','1/4/2003',N'Nam',N'Hà Nội',0345622314,'Lop06',N'Đại Học'),
('SV11',N'Nguyễn Thế Phong','8/6/2001',N'Nam',N'Hà Nội',0977765109,'Lop01',N'Đại Học')

create table tblMonHoc(
	MaMH nvarchar(20) primary key not null,
	TenMH nvarchar(60),
	MaChuyenNganh nvarchar(15) foreign key references tblChuyenNganh(MaChuyenNganh),
	HocKy nvarchar(6),
	SoTinChi int,
	HinhThucThi nvarchar(30),
	SoTiet int
)
insert into tblMonHoc values
('MH01',N'Lập trình Java','CNPM',4,3,N'Báo cáo',45),
('MH02',N'Lập trình .Net','CNPM',4,3,N'Thực Hành',45),
('MH03',N'Cơ sở lập trình web','HTTMDT',4,2,N'Báo Cáo',30),
('MH04',N'Lập trình hướng đối tượng','CNPM',3,3,N'Thực Hành',45),
('MH05',N'Quản lý tài chính','QTDN',4,2,N'Tự Luận',30),
('MH06',N'Lập trình nhúng','DTVT',4,3,N'Báo Cáo',45),
('MH07',N'Nhập môn tin học','QTVANM',1,3,N'Thực Hành',45)

create table tblLopHocPhan(
	MaLopHocPhan nvarchar(10) primary key,
	MaMH nvarchar(20) foreign key references tblMonHoc(MaMH),
	MaChuyenNganh nvarchar(15) foreign key references tblChuyenNganh(MaChuyenNganh),
	MaGV nvarchar(10) foreign key references tblGiangVien(MaGV),
	SiSo int,
	HocKy int,
	NamHoc nvarchar(15),
)

insert into tblLopHocPhan values
('LopHP01', 'MH01', 'CNPM','GV01', 30, 4, '2022-2023'),
('LopHP02', 'MH01', 'CNPM','GV01', 30, 4, '2022-2023'),
('LopHP03', 'MH02', 'CNPM','GV02', 30, 4, '2022-2023'),
('LopHP04', 'MH02', 'CNPM','GV02', 30, 4, '2022-2023'),
('LopHP05', 'MH03', 'CNPM','GV04', 30, 4, '2022-2023'),
('LopHP06', 'MH03', 'CNPM','GV04', 30, 4, '2022-2023'),
('LopHP07', 'MH04', 'CNPM','GV06', 30, 2, '2022-2023'),
('LopHP08', 'MH05', 'QTDN','GV03', 30, 2, '2022-2023'),
('LopHP09', 'MH05', 'QTDN','GV03', 30, 2, '2022-2023'),
('LopHP10', 'MH06', 'DTVT','GV05', 30, 2, '2022-2023'),
('LopHP11', 'MH07', 'CNPM','GV01', 30, 2, '2022-2023'),
('LopHP12', 'MH07', 'CNPM','GV02', 30, 2, '2022-2023')

create table tblDiem(
	MaSV nvarchar(10) foreign key references tblSinhVien(MaSV),
	MaLopHocPhan nvarchar(10) foreign key references tblLopHocPhan(MaLopHocPhan),
	DiemTP float,
	DiemCK float,
	DiemTK float,
	XepLoai nvarchar(20),
	primary key(MaSV, MaLopHocPhan)
)

insert into tblDiem values
('SV01','LopHP01',10,10,10,'A'),
('SV01','LopHP03',9,9.5,7.9,'A'),
('SV01','LopHP07',9,9.5,7.9,'A'),
('SV02','LopHP03',10,10,10,'A'),
('SV02','LopHP02',10,10,10,'A'),
('SV02','LopHP06',9,9,9,'A'),
('SV03','LopHP07',8,8,8,'B+'),
('SV03','LopHP08',8,9,8.7,'A'),
('SV04','LopHP01',8,9,8.7,'A'),
('SV05','LopHP03',7,7,7,'B'),
('SV05','LopHP01',7,7,7,'B'),
('SV05','LopHP04',7,6,6.8,'B'),
('SV07','LopHP02',7,7,7,'B'),
('SV08','LopHP08',7,7,7,'B')


