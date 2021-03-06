CREATE DATABASE BRAINSIZE
GO

USE BRAINSIZE
GO

CREATE TABLE MucDo(
	MucDo int not null,
	TenMucDo NVARCHAR(50) not null
	
	CONSTRAINT PK_MUCDO PRIMARY KEY(MucDo)
)

CREATE TABLE CauHoi(
	IDCH INT IDENTITY ,
	CauHoi NVARCHAR(1000) not null,
	DapAn1 NVARCHAR(100) not null,
	DapAn2 NVARCHAR(100) not null,
	DapAn3 NVARCHAR(100) not null,
	DapAn4 NVARCHAR(100) not null,
	KetQua NVARCHAR(100) not null,
	MucDo int not null
	
	CONSTRAINT PK_CAUHOI PRIMARY KEY(IDCH)
	CONSTRAINT FK_CAUHOI_MUCDO FOREIGN KEY(MucDo) references MUCDO(MucDo)
)
GO

CREATE TABLE BangDiem(
	IDBD INT IDENTITY ,
	Ten NVARCHAR(100) null,
	Diem INT not null
	
	CONSTRAINT PK_BANGDIEM PRIMARY KEY(IDBD)
)
GO

--Mức độ:
INSERT MucDo
VALUES(1,N'Mức dễ')

INSERT MucDo
VALUES(2,N'Mức trung bình')

INSERT MucDo
VALUES(3,N'Mức khó')

--MỨC 1
INSERT CAUHOI
VALUES(N'Sông Bến Hải và sông Thạch Hãn nằm ở tỉnh nào?',N'Quảng Bình',N'Quảng Ninh',N'Quảng Trị',N'Quảng Ngãi',N'Quảng Trị',1)

INSERT CAUHOI
VALUES(N'Trong các cây cầu sau, cầu nào là cầu xoay?',N'Cầu Thanh Trì',N'Cầu Thị Nại',N'Cầu Sông Hàn',N'Cầu Cần Thơ',N'Cầu Sông Hàn',1)

INSERT CAUHOI
VALUES(N'Đại Ngu là quốc hiệu của triều đại nào?',N'Triều Ngô',N'Triều Hồ',N'Các chúa Nguyễn',N'Nhà Tây Sơn',N'Triều Hồ',1)

INSERT CAUHOI
VALUES(N'Các vua Hùng đặt quốc hiệu nước ta là gì?',N'Văn Lang',N'Âu Lạc',N'Vạn Xuân',N'Đại Việt',N'Văn Lang',1)

INSERT CAUHOI
VALUES(N'An Dương Vương đặt quốc hiệu nước ta là gì?',N'Âu Lạc',N'Vạn Xuân',N'Đại Cồ Việt',N'Đại Việt',N'Âu Lạc',1)

INSERT CAUHOI
VALUES(N'Ai được bầu làm Tổng bí thư Đảng cộng sản Việt Nam tại Đại hội XI?',N'Nguyễn Phú Trọng',N'Nguyễn Sinh Hùng',N'Trương Tấn Sang',N'Nguyễn Tấn Dũng',N'Nguyễn Phú Trọng',1)

INSERT CAUHOI
VALUES(N'Cúm và sởi là những bệnh lây truyền qua đường nào?',N'Tiêu hoá',N'Hô hấp',N'Sinh dục',N'Máu',N'Hô hấp',1)

INSERT CAUHOI
VALUES(N'Nước nào ở khu vực Đông Nam Á không có địa giới với bất kỳ nước khác?',N'Philippines',N'Malaysia',N'Lào',N'Thái Lan',N'Philippines',1)

INSERT CAUHOI
VALUES(N'Virus sởi lây truyền qua đường nào?',N'Tiêu hoá',N'Hô hấp',N'Máu',N'Sinh dục',N'Hô hấp',1)

INSERT CAUHOI
VALUES(N'Việt Nam lần đầu tiên vô địch AFF Cup là vào năm nào?',N'2004',N'2006',N'2008',N'2010',N'2008',1)

INSERT CAUHOI
VALUES(N'Phú Yên đăng cai Năm du lịch quốc gia 2011 ở khu vực nào?',N'Nam Trung Bộ',N'Tây Nguyên',N'Đông Bắc Bộ',N'Tây Nam Bộ',N'Nam Trung Bộ',1)

INSERT CAUHOI
VALUES(N'Phổi, họng, thanh quản, khí quản, phế quản, phổi thuộc hệ cơ quan nào trong cơ thể người?',N'Hệ tuần hoàn',N'Hệ sinh dục',N'Hệ hô hấp',N'Hệ thần kinh',N'Hệ hô hấp',1)

INSERT CAUHOI
VALUES(N'Trong các hàm số lượng giác cơ bản, hàm số nào là hàm số chẵn?',N'y=sinx',N'y=cosx',N'y-cotgx',N'y=tgx',N'y=cosx',1)

INSERT CAUHOI
VALUES(N'Loại vitamin nào cơ thể con người có thể tự tổng hợp được nhờ ánh sáng Mặt Trời?',N'Vitamin A',N'Vitamin D',N'Vitamin E',N'Vitamin K',N'Vitamin D',1)

INSERT CAUHOI
VALUES(N'Paracetamol thuộc nhóm thuốc nào sau đây?',N'Thuốc lợi tiểu',N'Thuốc hạ sốt, giảm đau, chống viêm',N'Thuốc điều trị tăng huyết áp',N'Thuốc an thần, bình thân',N'Thuốc hạ sốt, giảm đau, chống viêm',1)

INSERT CAUHOI
VALUES(N'Điền từ còn thiếu trong câu thành ngữ:’”….xa không cứu được …gần”.',N'Lính-Tướng',N'Chồng-Vợ',N'Nước-Lửa',N'Chó-Mèo',N'Nước-Lửa',1)

INSERT CAUHOI
VALUES(N'Thung lũng nổi tiếng ở Mỹ với ngành công nghệ thông tin được đặt tên theo nguyên tố nào?',N'Sắt',N'Silic',N'Asen',N'Uran',N'Silic',1)

INSERT CAUHOI
VALUES(N'Tập hợp các số thực được ký hiệu bằng chữ cái nào?',N'N',N'Z',N'Q',N'R',N'R',1)

INSERT CAUHOI
VALUES(N'Khí nào chiếm 80% thành phần không khí?',N'N2',N'O2',N'H2',N'Cl2',N'N2',1)

INSERT CAUHOI
VALUES(N'Loài hoa nào được chọn là Quốc hoa của Việt Nam?',N'Hoa sen',N'Hoa mai',N'Hoa đào',N'Hoa hồng',N'Hoa sen',1)

INSERT CAUHOI
VALUES(N'Bộ phim “The Social Network” về mạng xã hội nào đã đạt giải Quả cầu vàng 2011?',N'Facebook',N'Twitter',N'Yahoo Plus',N'Opera',N'Facebook',1)

INSERT CAUHOI
VALUES(N'Vận động viên Việt Nam tiêu biểu của năm 2010 là vận động viên Vũ Thị Hương của môn thể thao nào?',N'Điền kinh',N'Cờ vua',N'Karatedo',N'Cầu lông',N'Điền kinh',1)

INSERT CAUHOI
VALUES(N'Bánh pía là đặc sản có nguồn gốc từ tỉnh nào?',N'Bến Tre',N'Sóc Trăng',N'Bạc Liêu',N'Hậu Giang',N'Sóc Trăng',1)

INSERT CAUHOI
VALUES(N'Vạn Thắng Vương là ai ?',N'Đinh Bộ Lĩnh',N'Lê Hoàn',N'Lê Lợi',N'Nguyễn Huệ',N'Đinh Bộ Lĩnh',1)

INSERT CAUHOI
VALUES(N'Sau khi chiến thắng quân Nam Hán vào năm 938, Ngô Quyền đã đóng đô ở đâu?',N'Hoa Lư',N'Đại La',N'Cổ Loa',N'Phú Xuân',N'Cổ Loa',1)

INSERT CAUHOI
VALUES(N'Năm 2011, nước ta kỷ niệm bao nhiêu năm Bác Hồ ra đi tìm đường cứu nước?',N'90 năm',N'100 năm',N'110 năm',N'120 năm',N'100 năm',1)

INSERT CAUHOI
VALUES(N'Dấu câu nào được dùng để đánh dấu ranh giới giữa các vế trong câu ghép?',N'Dấu ba chấm',N'Dấu chấm',N'Dấu chấm hỏi',N'Dấu phẩy',N'Dấu phẩy',1)

INSERT CAUHOI
VALUES(N'Ngôn ngữ nào sau đây không phải là ngôn ngữ lập trình?',N'Pascal',N'C++',N'Java',N'CRT',N'CRT',1)

INSERT CAUHOI
VALUES(N'Từ nào sau đây chỉ tế bào máu?',N'Huyết đồ',N'Huyết tương',N'Huyết thanh',N'Huyết cầu',N'Huyết cầu',1)

INSERT CAUHOI
VALUES(N'Đâu không phải là một loại tế bào máu?',N'Khúc côn cầu',N'Hồng cầu',N'Tiểu cầu',N'Bạch cầu',N'Khúc côn cầu',1)

INSERT CAUHOI
VALUES(N'Ngoài khối A thì khối thi nào cũng được tổ chức vào đợt 1 kỳ thi tuyển sinh đại học?',N'Khối V',N'Khối H',N'Khối M',N'Khối N',N'Khối V',1)

INSERT CAUHOI
VALUES(N'Côn trùng (sâu bọ) là lớp động vật thuộc ngành động vật nào?',N'Động vật nguyên sinh',N'Ruột khoang',N'Thân mềm',N'Chân khớp',N'Chân khớp',1)

INSERT CAUHOI
VALUES(N'Trên bề mặt của la bàn từ, hướng Nam được ký hiệu bằng chữ cái gì?',N'N',N'S',N'E',N'W',N'S',1)

INSERT CAUHOI
VALUES(N'Giải thưởng Emmy là giải thưởng cao quý của thể loại giải trí nào?',N'Truyền hình',N'Điện ảnh',N'Âm nhạc',N'Thể thao',N'Truyền hình',1)

INSERT CAUHOI
VALUES(N'Bánh Pía có hương vị đặc trưng của loại quả nào sau đây?',N'Măng cụt',N'Chôm chôm',N'Mãng cầu',N'Sầu riêng',N'Sầu riêng',1)

INSERT CAUHOI
VALUES(N'Bộ phận đất nổi, nhỏ hơn lục địa, xung quanh có biển và đại dương bao quanh gọi là gì?',N'Đảo',N'Quần đảo',N'Hải đảo',N'Quốc đảo',N'Hải đảo',1)

INSERT CAUHOI
VALUES(N'Cầu Phú Mỹ-cây cầu đẹp và hiện đại nhất thành phố Hồ Chí Minh có hình dáng của chữ cái nào?',N'T',N'H',N'L',N'M',N'H',1)

INSERT CAUHOI
VALUES(N'Liên Hiệp Quốc đã tuyên bố lấy năm 2011 là Năm Quốc tế ... trùng với dịp kỷ niệm 100 năm nhà khoa học Marie Curie nhận giải Nobel ...',N'Sinh học',N'Vật lý',N'Hoá học',N'Thiên văn học',N'Hoá học',1)

INSERT CAUHOI
VALUES(N'Bệnh nào sau đây không phải bệnh truyền nhiễm?',N'Sởi',N'Quai bị',N'Đậu mùa',N'Tiểu đường',N'Tiểu đường',1)

INSERT CAUHOI
VALUES(N'Trong dấu ba chấm là địa danh nào: "...có suối đãi vàng/Có hồ Ba Bể có nàng áo xanh"?',N'Thái Nguyên',N'Cao Bằng',N'Bắc Kạn',N'Lạng Sơn',N'Bắc Kạn',1)

INSERT CAUHOI
VALUES(N'Quốc gia nào sau đây có chung đường biên giới cả trên đất liên và trên biển với Việt Nam?',N'Thái Lan',N'Lào',N'Trung Quốc',N'Indonesia',N'Trung Quốc',1)

INSERT CAUHOI
VALUES(N'Ure là loại phân nào?',N'Phân đạm',N'Phân lân',N'Phân kali',N'Phân NPK',N'Phân đạm',1)

INSERT CAUHOI
VALUES(N'Cơ quan nào tham gia điều hoà cân bằng áp suất thẩm thấu nhờ khả năng tái hấp thụ hoặc thải bớt nước và các chất hoà tan trong máu?',N'Gan',N'Thận',N'Lách',N'Dạ dày',N'Thận',1)

INSERT CAUHOI
VALUES(N'Cờ đỏ sao vàng lần đầu tiên xuất hiện tại cuộc khởi nghĩa nào?',N'Khởi nghĩa Nam Kỳ',N'Khởi nghĩa Bắc Sơn',N'Binh biến Đô Lương',N'Khởi nghĩa Ba Tơ',N'Khởi nghĩa Nam Kỳ',1)

INSERT CAUHOI
VALUES(N'Trong bài hát "Tình ca Tây Bắc", người con gái ví mình như dòng sông nào?',N'Sông Lô',N'Sông Thao',N'Sông Mã',N'Sông Hồng',N'Sông Mã',1)

INSERT CAUHOI
VALUES(N'Câu thơ nổi tiếng "Như chưa hề có cuộc chia ly" nằm trong bài thơ nào?',N'Hoa cúc tím',N'Cuộc chia li màu đỏ',N'Con đường ấy',N'Sắc cầu vồng',N'Cuộc chia li màu đỏ',1)

INSERT CAUHOI
VALUES(N'Festival diều quốc tế là hoạt động văn hoá của thành phố nào?',N'Vũng Tàu',N'Buôn Ma Thuột',N'Quy Nhơn',N'Nha Trang',N'Vũng Tàu',1)

INSERT CAUHOI
VALUES(N'Tỉnh thành nào đứng đầu bảng xếp hạng năng lực cạnh tranh cấp tỉnh 2010 (PCI)?',N'Đà Nẵng',N'Trà Vinh',N'Lào Cai',N'Đồng Tháp',N'Đà Nẵng',1)

INSERT CAUHOI
VALUES(N'Đột biến ở NST bao nhiêu gây ra bệnh Down?',N'20',N'21',N'22',N'23',N'21',1)

INSERT CAUHOI
VALUES(N'Trên mặt thoáng chất lỏng có hai quá trình ngược nhau, đó là sự bay hơi và gì?',N'Sự thăng hoa',N'Sự ngưng tụ',N'Sự đông đặc',N'Sự kết tủa',N'Sự ngưng tụ',1)

INSERT CAUHOI
VALUES(N'Tổng giám đốc hiện nay của Đài truyền hình Việt Nam là ai?',N'Vũ Văn Hiến',N'Trần Đăng Tuấn',N'Trần Bình Minh',N'Nguyễn Thành Lương',N'Trần Bình Minh',1)

INSERT CAUHOI
VALUES(N'Thành phố nào sau đây là thành phố trực thuộc TW?',N'Hải Phòng',N'Hoà Bình',N'Yên Bái',N'Thái Nguyên',N'Hải Phòng',1)

INSERT CAUHOI
VALUES(N'Trẻ em có bao nhiêu chiếc răng sữa?',N'16',N'20',N'24',N'22',N'20',1)

INSERT CAUHOI
VALUES(N'Ngôi sao nhí nào đạt giải đặc biệt Đồ Rê Mí 2010?',N'Thanh Trúc',N'Anh Thư',N'Cát Tường',N'Hà Anh',N'Thanh Trúc',1)

INSERT CAUHOI
VALUES(N'Vị vua nào ban hành chiếu “Cần Vương” kêu gọi đồng bào, tướng lĩnh, sĩ phu ra sức giúp vua cứu nước khi thực dân Pháp đặt ách thống trị lên đất nước chúng ta?',N'Hàm Nghi',N'Duy Tân',N'Thành Thái',N'Dục Đức',N'Hàm Nghi',1)

INSERT CAUHOI
VALUES(N'Hình nào sau đây không có hai đường chéo cắt nhau tại trung điểm của mỗi đường?',N'Hình thang cân',N'Hình chữ nhật',N'Hình bình hành',N'Hình thoi',N'Hình thang cân',1)

INSERT CAUHOI
VALUES(N'Châu lục nào nằm hoàn toàn ở bán cầu Tây?',N'Châu Âu',N'Châu Á',N'Châu Phi',N'Châu Mỹ',N'Châu Mỹ',1)

INSERT CAUHOI
VALUES(N'Trong các tật khúc xạ về mắt thì bệnh nào chiếm tỉ lệ cao nhất và được gọi là căn bệnh học đường?',N'Cận thị',N'Viễn thị',N'Loạn thị',N'Lệch khúc xạ',N'Cận thị',1)

INSERT CAUHOI
VALUES(N'Tam giác nào có tâm nằm trên một cạnh của nó?',N'Tam giác vuông',N'Tam giác cân',N'Tam giác đều',N'Tam giác nhọn',N'Tam giác vuông',1)

INSERT CAUHOI
VALUES(N'Chương trình Đồ Rê Mí lên sóng của VTV3 bắt đầu từ năm nào?',N'2007',N'2008',N'2009',N'2010',N'2007',1)

INSERT CAUHOI
VALUES(N'Động Thiên Đường, Động Sơn Đoòng là những danh thắng của tỉnh nào?',N'Quảng Ninh',N'Quảng Bình',N'Quảng Ngãi',N'Quảng Nam',N'Quảng Bình',1)

INSERT CAUHOI
VALUES(N'Tập hợp nào lấp đầy trục số?',N'Số tự nhiên',N'Số nguyên',N'Số hữu tỷ',N'Số thực',N'Số thực',1)

INSERT CAUHOI
VALUES(N'Những người hay xay xỉn thì được gọi là đệ tử của ai?',N'Lưu Linh',N'Lý Bạch',N'Trương Phi',N'Chí Phèo',N'Chí Phèo',1)

INSERT CAUHOI
VALUES(N'Tiểu thuyết "Búp sen xanh" của nhà văn Sơn Tùng viết về thời thơ ấu của ai?',N'Võ Nguyên Giáp',N'Phạm Văn Đồng',N'Hồ Chí Minh',N'Lê Duẩn',N'Hồ Chí Minh',1)

INSERT CAUHOI
VALUES(N'Quốc gia nào ở khu vực Đông Nam Á không có địa giới với bất kỳ quốc gia nào khác?',N'Brunei',N'Singapore',N'Philippines',N'Đông Timor',N'Philippines',1)

INSERT CAUHOI
VALUES(N'Loài hoa nào được bình chọn là quốc hoa của Việt Nam?',N'Hoa sen',N'Hoa mai',N'Hoa đào',N'Hoa tre',N'Hoa sen',1)

INSERT CAUHOI
VALUES(N'Môi trường truyền âm không bao gồm:',N'Chất lỏng',N'Chất rắn',N'Chất khí',N'Chân không',N'Chân không',1)

INSERT CAUHOI
VALUES(N'Loài nào sau đây không cùng ngành với các loài còn lại?',N'Thuỷ tức',N'San hô',N'Mực',N'Hải quỳ',N'Mực',1)

INSERT CAUHOI
VALUES(N'Ngày dài nhất và đêm ngắn nhất ở bán cầu Bắc là ngày?',N'Xuân phân',N'Hạ chí',N'Thu phân',N'Đông chí',N'Hạ chí',1)

INSERT CAUHOI
VALUES(N'Năm 1994,  Lào và  ... đã khánh thành cây cầu hữu nghị đầu tiên bắc qua sông Mekong nối thủ đô Vientiane với tỉnh NongKhai',N'Myanmar',N'Thái Lan',N'Trung Quốc',N'Campuchia',N'Thái Lan',1)

INSERT CAUHOI
VALUES(N'Ca sĩ nào vào vai chính trong phim "Võ lâm truyền kỳ"?',N'Đan Trường',N'Lam Trường',N'Quang Dũng',N'Đàm Vĩnh Hưng',N'Đan Trường',1)

INSERT CAUHOI
VALUES(N'Yếu tố nào không phải là 1 trong 3 yếu tố chính cấu thành nên quốc gia?',N'Ngôn ngữ',N'Cư dân',N'Lãnh thổ',N'Chính quyền',N'Ngôn ngữ',1)

INSERT CAUHOI
VALUES(N'Chỉ số gia tiêu dùng có ký hiệu là gì?',N'HDI',N'CPI',N'GEI',N'FDI',N'CPI',1)

INSERT CAUHOI
VALUES(N'Trên đường kéo pháo ở Điện Biên, người anh hùng nào đã hy sinh anh dũng khi lấy thân chèn bánh pháo, cứu pháo an toàn?',N'Tô Vĩnh Diện',N'Phan Đình Giót',N'Cù Chính Lan',N'La Văn Cầu',N'Phan Đình Giót',1)

INSERT CAUHOI
VALUES(N'Ai là người đã chủ trương thành lập Hội Duy tân và khởi xướng phong trào Đông Du vào đầu thế kỷ 20 ở nước ta?',N'Phan Bội Châu',N'Phan Châu Trinh',N'Nguyễn An Ninh',N'Trương Vĩnh Ký',N'Phan Bội Châu',1)

INSERT CAUHOI
VALUES(N'Quân cờ nào có trên cả bàn cờ vua và bàn cờ tướng?',N'Tướng',N'Sĩ',N'Pháo',N'Mã',N'Mã',1)

INSERT CAUHOI
VALUES(N'Mức lương tối thiểu của cán bộ công chức được điều chỉnh từ ngày 1/5/2011 là?',N'800.000VNĐ',N'810.000VNĐ',N'820.000VNĐ',N'830.000VNĐ',N'830.000VNĐ',1)

INSERT CAUHOI
VALUES(N'Thành nhà Hồ được UNESO công nhận là di sản văn hoá thế giới nằm ở tỉnh nào?',N'Ninh Bình',N'Thanh Hoá',N'Nghệ An',N'Hà Tĩnh',N'Thanh Hoá',1)

--MỨC 2:
INSERT CAUHOI
VALUES(N'Hà Nội T&T và CLB nào của Việt Nam tham dự AFC Cup 2011?',N'Sông Lam Nghệ An',N'SHB Đà Nẵng',N'Hoàng Anh Gia Lai',N'Becamex Bình Dương',N'Sông Lam Nghệ An',2)

INSERT CAUHOI
VALUES(N'AFC Asian Cup 2011 được tổ chức tại quốc gia nào?',N'Qatar',N'Hàn Quốc',N'Nhật Bản',N'Iraq',N'Qatar',2)

INSERT CAUHOI
VALUES(N'Đội nào lên ngôi vô địch AFC Asian Cup 2011 tổ chức tại Qatar?',N'Nhật Bản',N'Australia',N'Hàn Quốc',N'Uzbekistan',N'Nhật Bản',2)

INSERT CAUHOI
VALUES(N'Năm 1010, Lý Thái Tổ đã cho xây dựng điện nào ở trung tâm hoàng thành Thăng Long?',N'Điện Kính Thiên',N'Điện Càn Nguyên',N'Điện Càn Chánh',N'Điện Càn Thành',N'Điện Càn Nguyên',2)

INSERT CAUHOI
VALUES(N'"Điêu tàn" là tập thơ đầu tiên của nhà thơ nào?',N'Anh Thơ',N'Thế Lữ',N'Bích Khê',N'Chế Lan Viên',N'Chế Lan Viên',2)

INSERT CAUHOI
VALUES(N'Tỉnh nào đăng cai tổ chức Năm du lịch Quốc gia 2012?',N'Thừa Thiên Huế',N'Hải Phòng',N'Lâm Đồng',N'Thanh Hoá',N'Thừa Thiên Huế',2)

INSERT CAUHOI
VALUES(N'Sự kiện giờ Trái Đất được tổ chức lần đầu tiên vào năm 2007 tại thành phố nào?',N'Sydney',N'Tokyo',N'Bắc Kinh',N'Singapore',N'Sydney',2)

INSERT CAUHOI
VALUES(N'Tượng đài Mẹ Suốt nằm bên cạnh con sông nào?',N'Sông Nhật Lệ',N'Sông Gianh',N'Sông Long Đại',N'Sông Kiến Giang',N'Sông Nhật Lệ',2)

INSERT CAUHOI
VALUES(N'Giáo sư Trần Văn Khê nổi tiếng ở lĩnh vực nào?',N'Toán học',N'Thiên văn học',N'Lịch sử',N'Âm nhạc',N'Âm nhạc',2)

INSERT CAUHOI
VALUES(N'Bảo tàng Hồ Chí Minh khánh thành vào kỷ niệm lần thứ mấy ngày sinh của chủ tịch Hồ Chí Minh?',N'70',N'80',N'90',N'100',N'100',2)

INSERT CAUHOI
VALUES(N'Thành cổ Sơn Tây do vị vua nào xây dựng nên vào năm 1822?',N'Gia Long',N'Minh Mạng',N'Thiệu Trị',N'Tự Đức',N'Minh Mạng',2)

INSERT CAUHOI
VALUES(N'Nhà thơ nào là người Việt Nam đầu tiên nhận Giải thưởng văn học Đông Nam Á năm 1996?',N'Tố Hữu',N'Nguyễn Đình Thi',N'Nguyễn Khoa Điềm',N'Huy Cận',N'Tố Hữu',2)

INSERT CAUHOI
VALUES(N'Việt Nam đã đăng cai cuộc thi sắc đẹp nào trong năm 2010?',N'Hoa hậu thế giới',N'Hoa hậu Trái Đất',N'Hoa hậu hoàn vũ',N'Hoa hậu quốc tế',N'Hoa hậu thế giới',2)

INSERT CAUHOI
VALUES(N'Truyện “Vợ chồng A Phủ” trong tập truyện Tây Bắc của nhà văn Tô Hoài viết về người dân tộc nào?',N'Vân Kiều',N'Thái',N'H’Mông',N'Tày',N'H’Mông',2)

INSERT CAUHOI
VALUES(N'Quốc gia nào giữ chức chủ tịch luân phiên Liên minh châu Âu trong nửa đầu năm 2011?',N'Hungary',N'Bungary',N'Romania',N'Ucraikne',N'Hungary',2)

INSERT CAUHOI
VALUES(N'Chùa nào được Lý Nam Đế cho xây sau khi lên ngôi hoàng đế năm 544?',N'Chùa Trấn Quốc',N'Chùa Một Cột',N'Chùa Tây Phương',N'Chùa Tứ Pháp',N'Chùa Trấn Quốc',2)

INSERT CAUHOI
VALUES(N'Tổ chức thương mại thế giới có trụ sở đặt tại quốc gia nào?',N'Bỉ',N'Thuỵ Sỹ',N'Hà Lan',N'Đức',N'Thuỵ Sỹ',2)

INSERT CAUHOI
VALUES(N'Truyền kỳ mạn lục, một tác phẩm được đánh giá là " thiên cổ kỳ bút", là sáng tác của ai?',N'Nguyễn Trãi',N'Nguyễn Bỉnh Khiêm',N'Nguyễn Dữ',N'Nguyễn Du',N'Nguyễn Dữ',2)

INSERT CAUHOI
VALUES(N'Tác phẩm điện ảnh "Thập diện mai phục" là của đạo diễn nào?',N'Lý An',N'Dương Khiết',N'Trương Nghệ Mưu',N'Ngô Vũ Sâm',N'Trương Nghệ Mưu',2)

INSERT CAUHOI
VALUES(N'Nam ca sĩ nào đạt giải thưởng Ca sĩ của năm tại Lễ trao giải Làn Sóng Xanh 2010?',N'Đàm Vĩnh Hưng',N'Lam Trường',N'Đan Trường',N'Minh Quân',N'Đàm Vĩnh Hưng',2)

INSERT CAUHOI
VALUES(N'Việt Nam đang vận động giành quyền đăng cai tổ chức Á vận hội (ASIAD) diễn ra vào năm nào?',N'2016',N'2017',N'2018',N'2019',N'2018',2)

INSERT CAUHOI
VALUES(N'Đội tuyển bóng đá nào xếp thứ ba tại World Cup 2010?',N'Tây Ban Nha',N'Hà Lan',N'Đức',N'Uruguay',N'Đức',2)

INSERT CAUHOI
VALUES(N'Vận tốc của sóng âm truyền trong môi trường nào lớn nhất?',N'Chân không',N'Chất khí',N'Chất rắn',N'Chất lỏng',N'Chất rắn',2)

INSERT CAUHOI
VALUES(N'Ando Momofuku là người Nhật Bản đã phát minh ra món ăn gì rất phổ biến hiện nay?',N'Xúc xích',N'Gà rán',N'Mỳ ăn liền',N'Bánh sandwich',N'Mỳ ăn liền',2)

INSERT CAUHOI
VALUES(N'Ai đạt giải nhất cuộc thi Bước nhảy hoàn vũ 2011?',N'Thu Minh',N'Nguyên Vũ',N'Thuỷ Tiên',N'Anh Khoa',N'Thu Minh',2)

INSERT CAUHOI
VALUES(N'Thành phố nào của Nhật Bản bị tàn phá nặng nề nhất sau thảm hoạ động đất và sóng thần ngày 11/3/2011?',N'Sendai',N'Chiba',N'Kobe',N'Hiroshima',N'Hiroshima',2)

INSERT CAUHOI
VALUES(N'Địa danh nào còn thiếu trong câu ca dao : ....có núi Vọng Phu/Có đầm Thị Nại có cù lao Xanh"?',N'Phú Yên',N'Khánh Hoà',N'Long An',N'Bình Định',N'Bình Định',2)

INSERT CAUHOI
VALUES(N'"Cỏ cú" là tên gọi khác của loại cỏ nào dưới đây?',N'Cỏ may',N'Cỏ chanh',N'Cỏ gấu',N'Cỏ gừng',N'Cỏ gấu',2)

INSERT CAUHOI
VALUES(N'Thế vận hội mùa hè 2012 sẽ được tổ chức ở đâu?',N'Paris',N'London',N'Moscow',N'Berlin',N'London',2)

INSERT CAUHOI
VALUES(N'Giải “Người dẫn chương trình được yêu thích nhất” của Giải Mai Vàng 2010 thuộc về ai?',N'Phan Anh',N'Danh Tùng',N'Mỹ Lan',N'Lê Anh',N'Phan Anh',2)

INSERT CAUHOI
VALUES(N'Đương kim Tổng thống Mỹ Barack Obama đã trải qua tuổi thơ ở đất nước Đông Nam Á nào?',N'Thái Lan',N'Việt Nam',N'Indonesia',N'Singapore',N'Indonesia',2)

INSERT CAUHOI
VALUES(N'Địa danh "Cần Giuộc" trong bài "Văn Tế nghĩa Sĩ Cần Giuộc" hiện nay nằm ở tỉnh nào?',N'Long An',N'Tiền Giang',N'An Giang',N'Cần Thơ',N'Long An',2)

INSERT CAUHOI
VALUES(N'Công thức hoá học của Oxi già là gì?',N'O2',N'O3',N'H2O',N'H2O2',N'H2O2',2)

INSERT CAUHOI
VALUES(N'Trong môn quần vợt thì một năm có bao nhiêu giải Grand Slam được tổ chức?',N'3',N'4',N'5',N'6',N'4',2)

INSERT CAUHOI
VALUES(N'Tập “Dư địa chí” được Nguyễn Trãi soạn dưới triều vua nào?',N'Lê Thái Tổ',N'Lê Thái Tông',N'Lê Thánh Tông',N'Lê Hiến Tông',N'Lê Thái Tông',2)

INSERT CAUHOI
VALUES(N'Khí độc Sarin có chứa thành phần nguyên tố Halogen nào?',N'Flo',N'Clo',N'Brom',N'Iot',N'Flo',2)

INSERT CAUHOI
VALUES(N'Các trung tâm công nghiệp lớn như Tokyo, Kyoto, Yokohama, Nagoia, Osaka nằm trên hòn đảo nào của Nhật Bản?',N'Hokkaido',N'Honsu',N'Shikoku',N'Kyusyu',N'Honsu',2)

INSERT CAUHOI
VALUES(N'Tượng đài chiến thắng Điện Biên Phủ được dựng ở ngọn đồi nào?',N'A1',N'B1',N'C1',N'D1',N'D1',2)

INSERT CAUHOI
VALUES(N'Nhất Trí, nhì Lân, tam Vân, tứ Cẩn là chỉ bộ tứ đại thụ ở bộ môn nghệ thuật nào?',N'Hội hoạ',N'Âm nhạc',N'Sân khấu',N'Điện ảnh',N'Hội hoạ',2)

INSERT CAUHOI
VALUES(N'Trụ sở của Ban thư ký ASEAN được đặt tại quốc gia nào sau đây?',N'Thái Lan',N'Singapore',N'Malaysia',N'Indonesia',N'Indonesia',2)

INSERT CAUHOI
VALUES(N'Tỉnh Quảng Ninh hiện có mấy thành phố trực thuộc tỉnh?',N'1',N'2',N'3',N'4',N'3',2)

INSERT CAUHOI
VALUES(N'Hành tinh nào trong Hệ Mặt Trời có chu kỳ tự quay quanh trục và độ nghiêng gần giống Trái Đất nhất?',N'Sao Thuỷ',N'Sao Hoả',N'Sao Mộc',N'Sao Kim',N'Sao Kim',2)

INSERT CAUHOI
VALUES(N'Trận chiến đấu ác liệt nhất trong chiến dịch biên giới thu đông 1950 là trận nào?',N'Trận Phủ Thông',N'Trận Đông Khê',N'Trận Chợ Cống',N'Trận Xuân Bồ',N'Trận Đông Khê',2)

INSERT CAUHOI
VALUES(N'Giải ... được coi là giải thưởng danh giá nhất trong lĩnh vực âm nhạc, tương đương với giải Oscar trong lĩnh vực điện ảnh.',N'ACM Award',N'Grammy',N'Billboard',N'World Peace Music Award',N'Grammy',2)

INSERT CAUHOI
VALUES(N'Châu lục nào tiếp giáp với cả Đại Tây Dương và Ấn Độ Dương?',N'Châu Á',N'Châu Phi',N'Châu Âu',N'Châu Mỹ',N'Châu Phi',2)

INSERT CAUHOI
VALUES(N'Huy chương Fields được trao cho các nhà toán học không quá bao nhiêu tuổi?',N'30',N'35',N'40',N'45',N'40',2)

INSERT CAUHOI
VALUES(N'Binh thư yếu lược, Vạn kiếp truyền tông bí truyền là những tác phẩm nổi tiếng về khoa học quân sự của vị anh hùng dân tộc nào?',N'Trần Hưng Đạo',N'Nguyễn Trãi',N'Đào Duy Từ',N'Ngô Sĩ Liên',N'Trần Hưng Đạo',2)

INSERT CAUHOI
VALUES(N'Dòng sông nào được nhắc đến trong bài hát “Lên ngàn” của nhạc sĩ Hoàng Việt?',N'Sông Đồng Nai',N'Sông Mã',N'Sông Vàm Cỏ Đông',N'Sông Gianh',N'Sông Vàm Cỏ Đông',2)

INSERT CAUHOI
VALUES(N'Ngày lễ nào sau đây tính theo âm lịch?',N'Ngày sân khấu Việt Nam',N'Ngày âm nhạc Việt Nam',N'Ngày thể thao Việt Nam',N'Ngày văn hoá các dân tộc Việt Nam',N'Ngày sân khấu Việt Nam',2)

INSERT CAUHOI
VALUES(N'Trong 4 loại tứ linh của thành Thăng Long thì loài nào không được miêu tả là vàng?',N'Rồng',N'Trâu',N'Ngựa',N'Rùa',N'Ngựa',2)

INSERT CAUHOI
VALUES(N'Nước nào đăng cai cuộc thi Sáng tạo Robot châu Á-Thái Bình Dương 2011?',N'Thái Lan',N'Malaysia',N'Indonesia',N'Singapore',N'Thái Lan',2)

INSERT CAUHOI
VALUES(N'Ngày 24/3 là ngày thế giới phòng chống ...?',N'Lao',N'Phong',N'Ung thư',N'Cổ chướng',N'Lao',2)

INSERT CAUHOI
VALUES(N'Trong môn võ Taekwondo, cấp đai cao nhất có màu gì?',N'Đen',N'Xanh',N'Trắng',N'Đỏ',N'Đen',2)

INSERT CAUHOI
VALUES(N'Tính đến năm 2012, thành phố nào 3 lần đăng cai Thế vận hội mùa hè?',N'London',N'Paris',N'Chicago',N'Tokyo',N'London',2)

INSERT CAUHOI
VALUES(N'Cơ quan nào sau đây dự trữ tỉ lệ glycogen cao nhất so với tỉ trọng của nó?',N'Cơ',N'Não',N'Gan',N'Mô mỡ',N'Gan',2)

INSERT CAUHOI
VALUES(N'Đâu không phải là tai biến trong sản khoa?',N'U nang buồng trứng',N'Uốn ván sơ sinh',N'Vỡ tử cung',N'Băng huyết',N'U nang buồng trứng',2)

INSERT CAUHOI
VALUES(N'Loại vacxin 5 trong 1 DPT-VGB-Hib không có tác dụng phòng chống bệnh nào?',N'Bạch hầu',N'Uốn ván',N'Ho gà',N'Lao',N'Lao',2)

INSERT CAUHOI
VALUES(N'Cuộc tổng tiến công chiến lược 1972 đánh vào tỉnh nào đầu tiên và làm hướng tiến công chủ yếu rồi phát triển rộng ra khắp chiến trường miền Nam?',N'Quảng Trị',N'Quảng Ngãi',N'Bình Phước',N'Đăk Lăk',N'Quảng Trị',2)

INSERT CAUHOI
VALUES(N'Cây cầu nào là một trong 5 công trình trọng điểm chào mừng 1000 năm Thăng Long – Hà Nội?',N'Cầu Long Biên',N'Cầu Vĩnh Tuy',N'Cầu Chương Dương',N'Cầu Thượng Cát',N'Cầu Vĩnh Tuy',2)

INSERT CAUHOI
VALUES(N'Hệ thống đô thị ở Việt Nam được phân thành mấy loại?',N'3',N'4',N'5',N'6',N'5',2)

INSERT CAUHOI
VALUES(N'Cầu thủ nào đạt danh hiệu Quả bóng vàng Việt Nam năm 2010?',N'Minh Phương',N'Vũ Phong',N'Tấn Trường',N'Trọng Hoàng',N'Minh Phương',2)

INSERT CAUHOI
VALUES(N'"Nhìn ra biển cả" là bộ phim về quãng đời tuổi trẻ của Chủ tịch Hồ Chí Minh do Hãng phim nào sản xuất?',N'Hãng phim Hội nhà văn',N'Hãng phim Hội điện ảnh',N'Hãng phim truyện Việt Nam',N'Hãng phim Giải Phóng',N'Hãng phim Hội điện ảnh',2)

INSERT CAUHOI
VALUES(N'Người đẹp nào đại diện cho Việt Nam tham dự cuộc thi Hoa hậu hoàn vũ năm 2011 tại Brazil?',N'Lưu Thị Diễm Hương',N'Đặng Thị Ngọc Hân',N'Vũ Thị Hoàng My',N'Đặng Thị Thùy Trang',N'Vũ Thị Hoàng My',2)

INSERT CAUHOI
VALUES(N'Trường đại học nào đã bảo vệ thành công ngôi vô địch Robocon Việt Nam?',N'Đại học Công nghiệp Hà Nội',N'Đại học Bách khoa Đà Nẵng',N'Đại học dân lập Lạc Hồng',N'Đại học sư phạm kỹ thuật thành phố Hồ Chí Minh',N'Đại học dân lập Lạc Hồng',2)

INSERT CAUHOI
VALUES(N'Biểu tượng cao quý của liên hoan phim Cannes là gì?',N'Sư tử vàng',N'Cành cọ vàng',N'Quả cầu vàng',N'Bông sen vàng',N'Cành cọ vàng',2)

INSERT CAUHOI
VALUES(N'Trong Truyện Kiều, bài thơ viết cho Đạm Tiên được Kiều viết lên cái gì?',N'Cây',N'Đá',N'Bia mộ',N'Khăn',N'Cây',2)

INSERT CAUHOI
VALUES(N'Black Death là thuật ngữ riêng để chỉ căn bênh nào từng hoành hoành toàn thế giới trong thế kỷ XIV?',N'Đậu mùa',N'Dịch hạch',N'Bò điên',N'Cúm',N'Dịch hạch',2)

INSERT CAUHOI
VALUES(N'Núi Phú Sĩ nằm trên hòn đảo nào của quần đảo Nhật Bản?',N'Hokkaido',N'Shikoku',N'Honshu',N'Kyushu',N'Shikoku',2)

INSERT CAUHOI
VALUES(N'Đầu lưỡi nhạy cảm nhất với vị nào?',N'Vị ngọt',N'Vị đắng',N'Vị chua',N'Vị cay',N'Vị đắng',2)

INSERT CAUHOI
VALUES(N'Quốc gia nào đăng cai EURO 2016?',N'Pháp',N'Anh',N'Hà Lan',N'Đức',N'Pháp',2)

INSERT CAUHOI
VALUES(N'Giải thưởng Nhân tài đất Việt 2011 không trao cho lĩnh vực nào?',N'Công nghệ thông tin',N'Kinh tế học',N'Y dược',N'Khoa học tự nhiên',N'Công nghệ thông tin',2)

INSERT CAUHOI
VALUES(N'Tháng 7 (July) và tháng 8 (August) được đặt theo tên các vị hoàng đế cổ đại của nước nào?',N'La Mã',N'Ai Cập',N'Ba Tư',N'Thổ Nhĩ Kỳ',N'La Mã',2)

INSERT CAUHOI
VALUES(N'Theo thuyết Ngũ Hành thì hành nào khắc với Thổ?',N'Kim',N'Mộc',N'Thuỷ',N'Hoả',N'Mộc',2)

INSERT CAUHOI
VALUES(N'Ngôi chùa nào là trụ sở của Giáo hội Phật giáo Việt Nam?',N'Chùa Thiên Mụ',N'Chùa Bái Đính',N'Chùa Quán Sứ',N'Chùa Keo',N'Chùa Quán Sứ',2)

INSERT CAUHOI
VALUES(N'Ba đường nào sau đây trong tam giác không đồng quy tại một điểm?',N'Ba đường cao',N'Ba đường trung bình',N'Ba đường trung tuyến',N'Ba đuờng phân giác',N'Ba đường trung bình',2)

INSERT CAUHOI
VALUES(N'Nữ cầu thủ nào nhận giải Quả bóng vàng Việt Nam 2010?',N'Trần Thị Kim Hồng',N'Đặng Thị Kiều Trinh',N'Nguyễn Thị Ngọc Anh',N'Đoàn Thị Kim Hồng',N'Trần Thị Kim Hồng',2)

INSERT CAUHOI
VALUES(N'Oxit được phân làm mấy loại?',N'1',N'2',N'3',N'4',N'4',2)

INSERT CAUHOI
VALUES(N'Kim loại nào có khối lượng riêng nhỏ nhất?',N'Liti',N'Natri',N'Kali',N'Beri',N'Liti',2)

INSERT CAUHOI
VALUES(N'Tàu Titanic bị đắm vào năm nào?',N'1910',N'1911',N'1912',N'1913',N'1912',2)

INSERT CAUHOI
VALUES(N'Đồng thau là hợp kim của hai kim loại nào?',N'Đồng và Sắt',N'Đồng và Thiếc',N'Đồng và Nhôm',N'Đồng và Kẽm',N'Đồng và Kẽm',2)

INSERT CAUHOI
VALUES(N'Các mặt bên của hình chóp cụt là hình gì?',N'Hình vuông',N'Hình thoi',N'Hình thang',N'Hình tam giác',N'Hình thang',2)

INSERT CAUHOI
VALUES(N'Hiện nay mỗi vòng chung kết của FIFA World Cup có tất cả bao nhiêu trận đấu?',N'56',N'60',N'64',N'68',N'64',2)

INSERT CAUHOI
VALUES(N'Trụ sở của liên minh châu Âu EU đặt tại quốc gia nào?',N'Italia',N'Thụy Sĩ',N'Bỉ',N'Pháp',N'Thụy Sĩ',2)

INSERT CAUHOI
VALUES(N'Ai là người nữ anh hùng đầu tiên của Quân đội nhân dân Việt Nam?',N'Nguyễn Thị Minh Khai',N'Nguyễn Thị Chiên',N'Đinh Thị Vân',N'Nguyễn Thị Định',N'Nguyễn Thị Định',2)

INSERT CAUHOI
VALUES(N'Nếu bạn đang ở vị trí kinh độ 0, vĩ độ 0 bạn đang ở đại dương nào?',N'Đại Tây Dương',N'Bắc Băng Dương',N'Ấn Độ Dương',N'Thái Bình Dương',N'Đại Tây Dương',2)

INSERT CAUHOI
VALUES(N'XAU là ký hiệu tiền tệ theo chuẩn ISO của kim loại nào?',N'Vàng',N'Bạc',N'Đồng',N'Chì',N'Vàng',2)

INSERT CAUHOI
VALUES(N'Cầu Thị Nại là cây cầu vượt biển lớn nhất Việt Nam nằm trong hệ thống cầu đường Nhơn Hội nằm ở tỉnh nào của nước ta?',N'Bình Thuận',N'Khánh Hoà',N'Phú Yên',N'Bình Định',N'Bình Định',2)

INSERT CAUHOI
VALUES(N'ASIAD 2014 được tổ chức tại nước nào?',N'Hàn Quốc',N'Trung Quốc',N'Nhật Bản',N'Ấn Độ',N'Hàn Quốc',2)

INSERT CAUHOI
VALUES(N'Than đá, than bùn là loại khoáng sản nào?',N'Năng lượng',N'Kim loại đen',N'Kim loại màu',N'Phi kim',N'Năng lượng',2)

INSERT CAUHOI
VALUES(N'Trong Thăng Long tứ trấn, trấn nào nằm ở khu phố cổ Hà Nội (phố Hàng Buồm)?',N'Đền Bạch Mã',N'Đền Quán Thánh',N'Đền Kim Liên',N'Đền Voi Phục',N'Đền Bạch Mã',2)

INSERT CAUHOI
VALUES(N'Đội tuyển bóng chuyền Việt Nam đã 3 lần vô địch Giải bóng chuyền nữ quốc tế VTV Cup vào các năm?',N'2007,2008,2009',N'2008,2009,2010',N'2007,2009,2010',N'2007,2008,2010',N'2007,2009,2010',2)

INSERT CAUHOI
VALUES(N'CLB nào vô địch Champion League mùa bóng 2000-2011?',N'Manchester United',N'Barcelona',N'Real Madrid',N'Schalke 04',N'Barcelona',2)

INSERT CAUHOI
VALUES(N'Đại hội thể thao người khuyết tật Đông Nam Á Para Games 2011 được tổ chức tại nước nào?',N'Malaysia',N'Indonesia',N'Philippines',N'Thái Lan',N'Indonesia',2)

INSERT CAUHOI
VALUES(N'Vào đêm giao thừa ở Nhật Bản thì các chùa đều đánh bao nhiêu tiếng chuông?',N'9',N'12',N'36',N'108',N'108',2)

INSERT CAUHOI
VALUES(N'Hội khoẻ Phù Đổng toàn quốc lần thứ VIII-2012 diễn ra tại thành phố nào?',N'TP Hồ Chí Minh',N'Hải Phòng',N'Cần Thơ',N'Đà Nẵng',N'Cần Thơ',2)

INSERT CAUHOI
VALUES(N'Nhà thơ thời Đường được nhắc đến trong di chúc của Bác Hồ là ai?',N'Lý Bạch',N'Đỗ Phủ',N'Bạch Cư Dị',N'Vương Duy',N'Đỗ Phủ',2)

INSERT CAUHOI
VALUES(N'Tỉnh thành nào đăng cai tổ chức Đại hội thể dục thể thao toàn quốc lần thứ VII-2014?',N'Thái Bình',N'Nam Định',N'Hưng Yên',N'Hà Nam',N'Nam Định',2)

INSERT CAUHOI
VALUES(N'Từ 1/8/2011, mỗi học sinh, sinh viên sẽ được vay tối đa bao nhiêu một tháng với lãi suất ưu đãi 0,65%?',N'800.000VNĐ',N'900.000VNĐ',N'1.000.000VNĐ',N'1.100.000VNĐ',N'1.000.000VNĐ',2)

INSERT CAUHOI
VALUES(N'Để bảo vệ vỏ tàu biển bằng thép, người ta thường gắn vào vỏ tàu (phần ngâm dưới nước) những tấm kim loại',N'Kẽm (Zn)',N'Đồng (Cu)',N'Bạc (Ag)',N'Chì (Pb)',N'Kẽm (Zn)',2)

--MỨC 3:
INSERT CAUHOI
VALUES(N'Hội nghị chống biến đổi khí hậu lần thứ 17- 2011 được tổ chức tại nước nào?',N'Đan Mạch',N'Mexico',N'Nam Phi',N'Quatar và Hàn Quốc',N'Nam Phi',3)

INSERT CAUHOI
VALUES(N'Bùi Hữu Nghĩa, một trong bốn rồng vàng của vùng Đồng Nai xưa là tài năng ở lĩnh vực nào?',N'Hoạ',N'Phú',N'Đàn',N'Thi',N'Thi',3)

INSERT CAUHOI
VALUES(N'Giải thưởng nào được lập ra vào năm 2005 được trao cho những người có thành tựu trong việc phát huy và gìn giữ văn hóa dân tộc?',N'Đào Tấn',N'Bùi Xuân Phái',N'Lê Văn Thiêm',N'Phạm Thuận Dật',N'Đào Tấn',3)

INSERT CAUHOI
VALUES(N'Vai trò chính của vitamin nào là giúp cho quá trình đông máu diễn ra tốt và hạn chế lượng máu bị mất khi bị thương?',N'Vitamin A',N'Vitamin D',N'Vitamin E',N'Vitamin K',N'Vitamin K',3)

INSERT CAUHOI
VALUES(N'The ASEAN WAY-ca khúc chính thức của ASEAN là sáng tác của nhạc sĩ người nước nào?',N'Thái Lan',N'Việt Nam',N'Singapore',N'Malaysia',N'Thái Lan',3)

INSERT CAUHOI
VALUES(N'CLB nào vô địch FIFA Club World Cup 2010 tổ chức tại Qatar?',N'Inter Milan',N'Real Madrid',N'Bayern Munich',N'Manchester United',N'Inter Milan',3)

INSERT CAUHOI
VALUES(N'Lễ Hội Gióng chính thức được nhận bằng Di sản văn hoá thế giới vào năm nào?',N'2008',N'2009',N'2010',N'2011',N'2010',3)

INSERT CAUHOI
VALUES(N'Tác phẩm "Thuỷ hử" của Thi Nại Am diễn ra vào triều đại nào của Trung Quốc?',N'Triều Tống',N'Triều Nguyên',N'Triều Minh',N'Triều Thanh',N'Triều Nguyên',3)

INSERT CAUHOI
VALUES(N'Từ “nhị thánh” trong câu “ Đây là nơi chiến địa buổi Trùng Hưng nhị thánh bắt Ô Mã” (Bạch Đằng giang phú) gồm những người nào?',N'Ngô Quyền và Trần Hưng Đạo',N'Ngô Quyền và Trần Thái Tông',N'Ngô Quyền và Trần Nhân Tông',N'Trần Thánh Tông và Trần Nhân Tông',N'Ngô Quyền và Trần Hưng Đạo',3)

INSERT CAUHOI
VALUES(N'Nhà thơ Chế Lan Viên còn có bút danh khác mang tên dòng sông nào?',N'Nhật Lệ',N'Thạch Hãn',N'Thu Bồn',N'Bến Hải',N'Thạch Hãn',3)

INSERT CAUHOI
VALUES(N'Nhà văn nào đại diện cho Việt Nam nhận Giải thưởng văn học Đông Nam Á 2010?',N'Nguyễn Nhật Ánh (Cho tôi xin một vé đi tuổi thơ)',N'Cao Duy Sơn (Ngôi nhà xưa bên suối)',N'Nguyễn Thị Ngọc Tư (Cánh đồng bất tận)',N'Trần Văn Tuấn (Rừng thiêng nước trong)',N'Nguyễn Nhật Ánh (Cho tôi xin một vé đi tuổi thơ)',3)

INSERT CAUHOI
VALUES(N'Eo biển nào sau đây là nơi phân cách giữa châu Âu và châu Phi?',N'Bosphorus',N'Bering',N'Gibraltar',N'Malacca',N'Gibraltar',3)

INSERT CAUHOI
VALUES(N'Lã Thanh Huyền đã tham gia bộ phim nào sau đây?',N'Nhà có nhiều cửa sổ',N'Đẹp từng centimet',N'Blog nàng dâu',N'Ngôi nhà hạnh phúc',N'Blog nàng dâu',3)

INSERT CAUHOI
VALUES(N'Con số nào được xem là số xui xẻo với người Trung Quốc?',N'1',N'2',N'3',N'4',N'4',3)

INSERT CAUHOI
VALUES(N'Có câu tục ngữ"...hết bị đòn,...còn mất vợ"?',N'Ăn',N'Uống',N'Ở',N'Mặc',N'Ăn',3)

INSERT CAUHOI
VALUES(N'Hổ Quyền dưới thời nhà Nguyễn là một đấu trường của những cuộc tử chiến giữa hổ và loài động vật nào?',N'Bò tót',N'Báo',N'Voi',N'Chó',N'Voi',3)

INSERT CAUHOI
VALUES(N'Trong nhạc phẩm "Hoa sữa" nhạc sĩ Hồng Đăng còn nhắc tới loại cây nào khác?',N'Bàng',N'Phượng',N'Phi lao',N'Quất',N'Phi lao',3)

INSERT CAUHOI
VALUES(N'Ngọn núi nào được nhắc tới trong bài thơ "Quê mẹ" của Tố Hữu?',N'Thiên Thai',N'Ngự Bình',N'Non Nước',N'Hồng Lĩnh',N'Thiên Thai',3)

INSERT CAUHOI
VALUES(N'Vị tướng nào dưới thời Hai Bà Trưng là ông tổ của lò vật Mai Động?',N'Ông Đông Bảng',N'Ông Đồng',N'Tam Trinh',N'Đào Kỳ',N'Tam Trinh',3)

INSERT CAUHOI
VALUES(N'"Bạn từ lầu Hạc lên đường/Giữa mùa hoa khói Châu Dương xuôi dòng"(Hoàng Hạc Lâu tống Mạnh Hạo Nhiên chi Quảng Lăng-Lý Bạch) Cụm từ "mùa hoa khói" chỉ mùa nào trong năm?',N'Mùa xuân',N'Mùa hạ',N'Mùa thu',N'Mùa đông',N'Mùa xuân',3)

INSERT CAUHOI
VALUES(N'Bối cảnh của câu chuyện tỉnh Romeo và Juliet là thành phố nào của nước Ý?',N'Venice',N'Milan',N'Rome',N'Verona',N'Verona',3)

INSERT CAUHOI
VALUES(N'Ngân hàng trung ương châu Âu (ECB) có trụ sở đặt tại thành phố nào?',N'Brussel',N'Frankurt',N'Paris',N'Geneva',N'Frankurt',3)

INSERT CAUHOI
VALUES(N'Từ ngày 01/01/2011, Estonia là quốc gia thứ mấy của Liên minh châu Âu sử dụng đồng euro?',N'17',N'18',N'19',N'20',N'17',3)

INSERT CAUHOI
VALUES(N'Lê Bích Phương, vận động viên duy nhất giành được huy chương vàng cho Việt Nam tại ASIAD 16 (năm 2010) thuộc môn thể thể thao nào?',N'Karatedo',N'Điền kinh',N'Cờ vua',N'Bắn súng',N'Karatedo',3)

INSERT CAUHOI
VALUES(N'Tác phẩm “Dị hương” của nhà văn Sương Nguyệt Minh đạt giải thưởng của Hội nhà văn Việt Nam năm 2010 thuộc thể loại nào?',N'Thơ',N'Tập truyện ngắn',N'Tiểu thuyết',N'Văn học dịch',N'Tập truyện ngắn',3)

INSERT CAUHOI
VALUES(N'Bộ phim "W"của đạo diễn Oliver Stone viết về ai?',N'Geroge Walker Bush',N'Winston Churchil',N'William Shakespear',N'Walt Disney',N'Geroge Walker Bush',3)

INSERT CAUHOI
VALUES(N'Nước nào là nước chủ nhà tại Copa America 2011?',N'Argentina',N'Boliviar',N'Venezuela',N'Paraguay',N'Argentina',3)

INSERT CAUHOI
VALUES(N'Đơn phân của protein là :',N'Glucose',N'Axit amin',N'Axit béo',N'Nuclêotit',N'Axit amin',3)

INSERT CAUHOI
VALUES(N'Một hòn đảo của tỉnh Quảng Ngãi nơi được mệnh danh là "Vương quốc hành tỏi". Đó là đảo nào?',N'Đảo Lý Sơn',N'Đảo Cồn Cỏ',N'Đảo Thổ Chu',N'Đảo Phú Quốc',N'Đảo Lý Sơn',3)

INSERT CAUHOI
VALUES(N'Bài hát “Hồn sĩ tử” của nhạc sĩ Lưu Hữu Phước được dùng trong các lễ tang còn có tên gọi là “Hát Giang trường hận” được lấy cảm hứng từ cuộc khởi nghĩa nào?',N'Khởi nghĩa Hai Bà Trưng',N'Khởi nghĩa Bà Triệu',N'Khởi nghĩa Mai Thúc Loan',N'Khởi nghĩa Phùng Hưng',N'Khởi nghĩa Hai Bà Trưng',3)

INSERT CAUHOI
VALUES(N'...là tác phẩm được viết và đóng thành quyển sách nặng nhất ở Việt Nam do nhà thư pháp Nguyệt Đình thực hiện.',N'Bình Ngô đại cáo',N'Truyện Kiều',N'Truyện Lục Vân Tiên',N'Đại từ điển tiếng Việt',N'Truyện Kiều',3)

INSERT CAUHOI
VALUES(N'Thành Long Biên được ai chọn làm kinh đô?',N'An Dương Vương',N'Lý Nam Đế',N'Ngô Quyền',N'Đinh Tiên Hoàng',N'Lý Nam Đế',3)

INSERT CAUHOI
VALUES(N'Vào năm nào thì Sea Games và Para Games không do cùng một quốc gia tổ chức?',N'2003',N'2005',N'2007',N'2009',N'2009',3)

INSERT CAUHOI
VALUES(N'Đường hoa Nguyễn Huệ- con đường hoa được tố chức thường niên- năm 2011 có chủ đề là gì?',N'Vượt sóng',N'Vững tin',N'Xuân bình minh',N'Tầm cao mới',N'Tầm cao mới',3)

INSERT CAUHOI
VALUES(N'Cơ quan nào của hệ thần kinh là trung tâm của những phản xạ thăng bằng?',N'Não bộ',N'Tiểu não',N'Hành não',N'Gian não',N'Hành não',3)

INSERT CAUHOI
VALUES(N'Loại kháng thể duy nhất có thể truyền qua rau thai?',N'IgA',N'IgM',N'IgG',N'IgD',N'IgG',3)

INSERT CAUHOI
VALUES(N'Quốc hội Việt Nam gia nhập AIPO (nay là AIPA) vào năm nào?',N'1995',N'2000',N'2005',N'2010',N'1995',3)

INSERT CAUHOI
VALUES(N'Titan là vệ tinh duy nhất trong hệ mặt trời có khí quyển và cũng là vệ tinh lớn nhất của hành tinh nào?',N'Sao Thuỷ',N'Sao Thổ',N'Sao Mộc',N'Sao Kim',N'Sao Thổ',3)

INSERT CAUHOI
VALUES(N'Ngày 23/4 hàng năm được UNESO chọn là "Ngày thế giới ..." làm gì?',N'Du lịch',N'Đọc sách',N'Ăn uống',N'Giải trí',N'Đọc sách',3)

INSERT CAUHOI
VALUES(N'Tại cuộc thi bắn pháo hoa quốc tế tại Đà Nẵng năm 2011 với chủ đề “Lung linh sông Hàn”, đội nào vô địch?',N'Anh',N'Hàn Quốc',N'Italia',N'Trung Quốc',N'Italia',3)

INSERT CAUHOI
VALUES(N'"Trong một tứ giác nội tiếp, tích hai đường chéo bằng tổng tích hai cạnh đối " là nội dung của định lý nào?',N'Pythagore',N'Thales',N'Ptoleme',N'Viet',N'Ptoleme',3)

INSERT CAUHOI
VALUES(N'Loại thuốc nào là kháng sinh hàng đầu trong điều trị lao?',N'Isoniazid',N'Rifampicin',N'Ethambutol',N'Steptomycine',N'Rifampicin',3)

INSERT CAUHOI
VALUES(N'Nhà thơ nào sau không nằm trong nhóm “Bàn Thành tứ hữu?',N'Hàn Mặc Tử',N'Chế Lan Viên',N'Quách Tấn',N'Huy Cận',N'Huy Cận',3)

INSERT CAUHOI
VALUES(N'"Vượt qua bến Thượng Hải" là bộ phim của hãng phim nào?',N'Hãng phim Hội nhà văn',N'Hãng phim Hội điện ảnh',N'Hãng phim truyện Việt Nam',N'Hãng phim Giải Phóng',N'Hãng phim Hội nhà văn',3)

INSERT CAUHOI
VALUES(N'Nguyên tố hóa học nào được mệnh danh là nguyên tố của sự sống và tư duy?',N'N',N'P',N'O',N'S',N'P',3)

INSERT CAUHOI
VALUES(N'Đền nào vừa là Thăng Long tứ trấn vừa là Thăng Long tứ quán?',N'Đền Quán Thánh (Trấn Vũ quán)',N'Chùa Huyền Thiên (Huyền Thiên quán)',N'Chùa Kim Cổ (Đồng Thiên quán)',N'Chùa Vua (Đế Thích quán)',N'Đền Quán Thánh (Trấn Vũ quán)',3)

INSERT CAUHOI
VALUES(N'Ai không phải là “Gia Định tam gia”?',N'Lê Quang Định',N'Ngô Nhân Tịnh',N'Trịnh Hoài Đức',N'Võ Trường Toản',N'Võ Trường Toản',3)

INSERT CAUHOI
VALUES(N'Tỉnh nào có tỉ lệ cử tri đi bầu cử đại biểu quốc hội khóa XIII cao nhất?',N'Thừa Thiên Huế',N'Quảng Nam',N'Bình Định',N'Phú Yên',N'Thừa Thiên Huế',3)

INSERT CAUHOI
VALUES(N'Bộ phim đầu tiên tại Việt Nam được lồng tiếng Việt theo tiêu chuẩn Hollywood?',N'Rio',N'Avatar',N'Kungfu Panda',N'Titanic',N'Rio',3)

INSERT CAUHOI
VALUES(N'Trong Hệ Mặt Trời, hành tinh nào phản chiếu ánh sáng màu đỏ?',N'Sao Thuỷ',N'Sao Hoả',N'Sao Mộc',N'Sao Kim',N'Sao Hoả',3)

INSERT CAUHOI
VALUES(N'Tập thơ “Thiên Nam dư hạ tập” được biên soạn dưới triều vua nào?',N'Lê Thánh Tông',N'Lê Thái Tông',N'Lê Thần Tông',N'Lê Thái Tổ',N'Lê Thánh Tông',3)

INSERT CAUHOI
VALUES(N'Ngày 8/6 là ngày gì?',N'Ngày quốc tế thiếu nhi',N'Ngày vi chất dinh dưỡng',N'Ngày môi trường thế giới',N'Ngày đại dương thế giới',N'Ngày đại dương thế giới',3)

INSERT CAUHOI
VALUES(N'Quinin là thuốc:',N'Điều trị sốt rét',N'Điều trị lao',N'Điều trị phong',N'Điều trị HIV/AIDS',N'Điều trị sốt rét',3)

INSERT CAUHOI
VALUES(N'Hành tinh nào xa nhất trong Hệ Mặt Trời ?',N'Uranus (Thiên Vương)',N'Neptune (Hải Vương)',N'Pluto (Diêm Vương)',N'Saturn (Sao Thổ)',N'Uranus (Thiên Vương)',3)

INSERT CAUHOI
VALUES(N'Nguyên tố hoá học nào  có độ âm điện bé nhất  và được sử dụng làm tế bào quang điện?',N'Cesi',N'Liti',N'Natri',N'Kali',N'Cesi',3)

INSERT CAUHOI
VALUES(N'Sông Thạch Hãn ở tỉnh Quảng Trị đổ ra biển bởi cửa sông nào?',N'Cửa Việt',N'Cửa Tùng',N'Cửa Đại',N'Cửa Hội',N'Cửa Tùng',3)

INSERT CAUHOI
VALUES(N'Hòn đảo là nơi duy nhất mà chủ tịch Hồ Chí Minh đồng ý cho dựng tượng khi người còn sống?',N'Cát Bà',N'Phú Quốc',N'Cô Tô',N'Cồn Cỏ',N'Cô Tô',3)

INSERT CAUHOI
VALUES(N'Liên hoan phim Việt Nam lần thứ XVII được tổ chức tại tỉnh thành nào của nước ta?',N'Hà Nội',N'TP Hồ Chí Minh',N'Nam Định',N'Phú Yên',N'Phú Yên',3)

INSERT CAUHOI
VALUES(N'Dự án 100 vở kịch kinh điển của Nhà hát Tuổi trẻ thực hiện từ năm 2008 đến 2020 được mở đầu bằng vở kịch nào?',N'Âm mưu và tình yêu',N'Hamlet',N'Romeo và Juliet',N'Người mẹ',N'Âm mưu và tình yêu',3)

INSERT CAUHOI
VALUES(N'Thành phố nào là bối cảnh trong phim "Trăng nơi đáy giếng" (đạo diễn Nguyễn Vinh Sơn)?',N'Đà Lạt',N'Huế',N'Nha Trang',N'Quy Nhơn',N'Huế',3)

INSERT CAUHOI
VALUES(N'Năm 1824, động Phong Nha được vị vua nào sắc phong là "Diệu ứng chi thần"?',N'Gia Long',N'Minh Mạng',N'Thiệu Trị',N'Tự Đức',N'Minh Mạng',3)

INSERT CAUHOI
VALUES(N'Bùi Đình Diệm là tên thật của nhà thơ nào?',N'Tố Hữu',N'Chính Hữu',N'Quang Dũng',N'Thế Lữ',N'Quang Dũng',3)

INSERT CAUHOI
VALUES(N'Câu nói nổi tiếng: “Nhằm thẳng quân thù, bắn” là của người anh hùng nào?',N'Nguyễn Viết Xuân',N'Lê Văn Tám',N'Cù Chính Lan',N'La Văn Cầu',N'Nguyễn Viết Xuân',3)

INSERT CAUHOI
VALUES(N'Số La Mã nào sau đây có giá trị lớn nhất?',N'X',N'C',N'L',N'M',N'C',3)

INSERT CAUHOI
VALUES(N'Các tế bào nào của máu tham gia tiêu diệt các vi khuẩn gây tổn thương?',N'Huyết cầu',N'Hồng cầu',N'Bạch cầu',N'Tiểu cầu',N'Bạch cầu',3)

INSERT CAUHOI
VALUES(N'Với một tam giác bất kì, đường tròn chứa chân của ba đường cao, ba trung điểm của ba cạnh, ba trung điểm của ba đoạn thẳng nối ba đỉnh với trực tâm gọi là gì?',N'Đường tròn Cauchy',N'Đường tròn Euler',N'Đường tròn Viete',N'Đường tròn Newton',N'Đường tròn Euler',3)

INSERT CAUHOI
VALUES(N'Tại lễ trao giải Cánh diều vàng 2010, bộ phim nào đạt giải Cánh diều vàng ở hạng mục Phim truyện nhựa?',N'Long Thành cầm giả ca',N'Cánh đồng bất tận',N'Vũ điệu đam mê',N'Khát vọng Thăng Long',N'Long Thành cầm giả ca',3)

INSERT CAUHOI
VALUES(N'Trên ... có một ngọn núi còn cao hơn cả đỉnh núi Everest, được đặt tên là Maxwell Montes.',N'Sao Thuỷ',N'Sao Hoả',N'Sao Mộc',N'Sao Kim',N'Sao Kim',3)

INSERT CAUHOI
VALUES(N'Để duy trì nồng độ trong máu, các thuốc chống viêm corticoid nên uống vào lúc mấy giờ vào buổi sáng?',N'4 giờ',N'6 giờ',N'8 giờ',N'10 giờ',N'6 giờ',3)

INSERT CAUHOI
VALUES(N'Bộ phim truyền hình nào đạt giải Cánh diều vàng 2010?',N'Bí thư tỉnh uỷ',N'Vó ngựa trời Nam',N'Câu chuyện pháp đình-Ngã rẽ',N'Người lính đặc nhiệm',N'Bí thư tỉnh uỷ',3)

INSERT CAUHOI
VALUES(N'Tờ báo bằng chữ quốc ngữ đầu tiên ở nước ta ra đời vào nửa cuối thế kỷ XIX ở Sài Gòn có tên là gì?',N'Nữ giới chung',N'Gia Định báo',N'Công luận báo',N'Lục tỉnh tân văn',N'Gia Định báo',3)

INSERT CAUHOI
VALUES(N'Vị chúa nào của chúa Nguyễn là người đầu tiên đã phác thảo ra hình dáng chiếc áo dài Việt Nam?',N'Nguyễn Phúc Thuần',N'Nguyễn Phúc Khoát',N'Nguyễn Phúc Thái',N'Nguyễn Phúc Chu',N'Nguyễn Phúc Khoát',3)

INSERT CAUHOI
VALUES(N'Nhà thơ Tố Hữu tả vẻ đẹp của đất nước nào qua câu thơ "Đường bạch dương sương trắng nắng tràn"?',N'Nga',N'Ba Lan',N'Bungari',N'Cuba',N'Ba Lan',3)

INSERT CAUHOI
VALUES(N'Thành phố Turku  (...) và Tallinn (Estonia)  được chọn là các thủ đô văn hoá châu Âu năm 2011.',N'Phần Lan',N'Đan Mạch',N'Na Uy',N'Thuỵ Điển',N'Phần Lan',3)

INSERT CAUHOI
VALUES(N'Ai được tạp chí Time bình chọn là "Nhân vật của năm" 2010?',N'Mark Zuckerberg (chủ Facebook)',N'Những người thất nghiệp Mỹ',N'Steve Jobs (Giám đốc tập đoàn công nghệ Apple)',N'Ca sĩ Lady Gaga',N'Mark Zuckerberg (chủ Facebook)',3)

INSERT CAUHOI
VALUES(N'Các tiểu vương quốc Arab thống nhất (UAE) hiện nay có bao nhiêu tiểu vương quốc?',N'5',N'6',N'7',N'8',N'7',3)

INSERT CAUHOI
VALUES(N'Bộ phim truyền hình nào sau đây không có nội dung về phòng chống HIV/AIDS?',N'Nhà có nhiều cửa sổ',N'Vượt qua thử thách',N'Khi đàn chim trở về',N'Gió qua miền tối sáng',N'Vượt qua thử thách',3)

INSERT CAUHOI
VALUES(N'Ấn Độ, Đức, Bồ Đào Nha và Colombia và ..... là 5 nước uỷ viên viên không thường trực Hội đồng Bảo an Liên hợp quốc nhiệm kỳ 2011-2012.',N'Nam Phi',N'Ai Cập',N'Bờ Biển Ngà',N'Tuynisi',N'Nam Phi',3)

INSERT CAUHOI
VALUES(N'Ngôi trường đầu tiên mang tên cố Thủ tướng Võ Văn Kiệt nằm ở tỉnh nào?',N'Long An',N'Bình Dương',N'Bình Phước',N'Vĩnh Long',N'Vĩnh Long',3)


--bảng điểm
INSERT BANGDIEM
VALUES('Player 1',5)

INSERT BANGDIEM
VALUES('Player 2',10)

INSERT BANGDIEM
VALUES('Player 3',15)

INSERT BANGDIEM
VALUES('Player 4',20)

INSERT BANGDIEM
VALUES('Player 5',25)


select COUNT(*) from CAUHOI
select* from MUCDO
select* from BANGDIEM