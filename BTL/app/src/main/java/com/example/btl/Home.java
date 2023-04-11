package com.example.btl;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.btl.adapter.CategoryAdapter;
import com.example.btl.adapter.CourseAdapter;
import com.example.btl.model.Category;
import com.example.btl.model.Course;

import java.util.ArrayList;
import java.util.List;

public class Home extends AppCompatActivity {
    ImageView imageviewclick;
    RecyclerView categoryRecycler, courseRecycler;
    CategoryAdapter categoryAdapter;
    static CourseAdapter courseAdapter;
    static List<Course> courseList = new ArrayList<>();
    static List<Course> fullcoursesList = new ArrayList<>();


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        imageviewclick  = findViewById(R.id.imageclick);
        imageviewclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                courseList.clear();
                courseList.addAll(fullcoursesList);
                courseAdapter.notifyDataSetChanged();
            }
        });
        List<Category> categoryList = new ArrayList<>();
        categoryList.add(new Category(1, "Kho"));
        categoryList.add(new Category(2, "Canh"));
        categoryList.add(new Category(3, "Hầm"));
        categoryList.add(new Category(4, "Rau"));
        categoryList.add(new Category(5, "Luộc"));
        categoryList.add(new Category(6, "Xào"));
        categoryList.add(new Category(7, "Món nước"));
        categoryList.add(new Category(8, "Khác"));
        setCategoryRecycler(categoryList);
        courseList.add(new Course(1, "khotau", "Thịt kho tàu", "~ 45\nphút               ","Dễ","#C81818",
                "Thành phần\n" +
                        "\nThịt ba chỉ hay thịt chân giò 500 gr\n" +
                        "Trứng vịt luộc 5 quả\n" +
                        "Nước dừa 400 ml\n" +
                        "Hành băm 1 muỗng canh\n" +
                        "Tỏi băm 1 muỗng canh\n" +
                        "Nước mắm 3 muỗng canh\n" +
                        "Gia vị thông dụng 1 ít (Đường/ hạt nêm/ tiêu xay)\n" +
                        "\nCách làm\n " +
                        "\n1. Ướp thịt :\n" +
                                "Thịt ba chỉ hay thịt chân giò sau khi mua về thì rửa sạch với nước muối, để ráo sau đó cắt miếng vừa ăn rồi cho vào tô, nên chọn thịt có da mỏng để kho được ngon, mau mềm hơn và không bị ngấy.\n" +
                                "\n" +
                                "Lần lượt nêm vào tô 1 muỗng canh hành băm, 1 muỗng canh tỏi băm, 3 muỗng canh nước mắm, 2 muỗng canh đường, 1/3 muỗng canh hạt nêm và 1 muỗng cà phê tiêu, trộn đều.\n" +
                                "Dùng màng bọc thực phẩm bọc tô thịt lại, ướp ít nhất trong 1 tiếng cho thịt thấm gia vị.\n" +
                        "\n2. Thắng nước màu :\n" +
                                "Bắc nồi lên bếp, cho vào nồi 1 muỗng cà phê đường đun với lửa vừa, cùng lúc đó dùng đũa khuấy đều đến khi nước đường trở màu nâu cánh gián thì tắt bếp.\n" +
                                "\n" +
                                "Chờ đường nguội thì màu sẽ đậm hơn, đổ thêm 1/2 chén (chén ăn cơm) nước lọc cho loãng bớt." +
                        "\n3. Kho thịt :\n" +
                                "Bạn gắp thịt đã ướp cho vào nồi nước màu vừa thắng, đảo với lửa lớn cho đến khi thịt săn lại thì đổ 400ml nước dừa vào.\n" +
                                "\n" +
                                "Đậy nắp nồi lại rồi kho thịt với lửa nhỏ trong vòng 30 phút. Sau 30 phút, nếu thấy nước cạn quá thì cho thêm nước, cho 5 quả trứng vịt luộc đã bóc vỏ vào nồi, đậy nắp và đun tiếp trong 30 phút cho thịt chín mềm rồi tắt bếp.\n" +
                        "\n4. Thành phẩm :\n" +
                                "Vậy là món thịt kho Tàu thơm ngon đã hoàn thành và có thể dùng nóng được rồi. Món ăn có màu nâu cánh gián rất bắt mắt, hương vị đậm đà cực hấp dẫn.\n" +
                                "\n" +
                                "Thịt heo được kho mềm có vị béo nhẹ kết hợp với trứng vịt bùi bùi cực đưa cơm đấy nhé!" ,1));
        courseList.add(new Course(2, "pho","Phở","~ 50\nphút               ","Dễ","#9FA52D",
                "Thành phần\n" +
                        "\nPhở 1 gói\n" +
                        " Thịt bò 500 gr\n" +
                        " Xương heo 100 gr\n" +
                        " Gia vị nấu phở bò 1 gói\n" +
                        " Hành tây 1 củ\n" +
                        " Hành tím 4 củ\n" +
                        " Gừng 1 củ\n" +
                        " Đường phèn 2 muỗng canh\n" +
                        " Rau ăn phở 1 ít\n" +
                        " Gia vị thông dụng . 1 ít (hạt nêm/ đường/ bột ngọt/ muối)\n" +
                        "\n" +
                        "Cách Làm\n"+
                        "1. Sơ chế và chần thịt :\n" +
                        "Bạn bắc lên bếp 1 nồi nước và cho vào nồi hành tím đã đập dập rồi nấu trên bếp ở nhiệt độ cao.\n" +
                        "\n" +
                        "Khi nước sôi, bạn cho thịt bò và xương heo đã sơ chế vào và chần khoảng 3 phút để loại bỏ mùi hôi. Sau đó, bạn vớt thịt ra và cho ngay vào tô nước lạnh.\n" +
                        "2. Sơ chế các nguyên liệu khác :\n" +
                        "Hành tím mua về bạn lột vỏ 3 củ, sau đó rửa sạch và đập dập, 2 củ còn lại thì rửa sạch và để ráo.\n" +
                        "Hành tây cắt bỏ rễ, và rửa sạch. Bạn rửa sạch gừng và để ráo.\n" +
                        "Nướng hành tây, 2 củ hành tím và gừng trên bếp khoảng 2 phút đến khi dậy mùi thơm.\n" +
                        "Bạn cho phần gia vị nấu phở bò vào chảo và rang trên bếp ở nhiệt độ trung bình nhỏ trong 4 phút đến khi dậy mùi thơm. Cho các gia vị vừa rang vào túi lọc có sẵn và cột chặt miệng túi lại\n" +
                        "3.Nấu nước dùng :\n" +
                        "Bạn cho vào nồi 1.5 lít nước cùng thịt bò và xương heo đã chần rồi đậy nắp lại, hầm trong 1 tiếng. Trong lúc hầm nước dùng, bạn thường xuyên mở nắp nồi và hớt sạch bọt để nước dùng được trong hơn nhé!\n" +
                        "\n" +
                        "Khi nước sôi, bạn cho hành tây, hành tím, gừng đã nướng thơm và túi gia vị nấu phở đã rang vào nồi.\n" +
                        "\n" +
                        "Tiếp theo, bạn thêm vào nồi 2 muỗng canh đường phèn, 2 muỗng cà phê muối, 1.5 muỗng cà phê bột ngọt, 1.5 muỗng cà phê hạt nêm rồi khuấy đều, nêm nếm lại gia vị cho vừa ăn và nắp lại 3 phút rồi tắt bếp là hoàn thành.\n" +
                        "4.Hoàn thành :\n" +
                        "Bạn vớt thịt bò trong nồi nước dùng ra và cắt thành những lát vừa ăn.\n" +
                        "\n" +
                        "Sau đó, cho bánh phở ra tô, xếp thịt bò lên trên rồi chan nước dùng và thêm ít ớt cắt lát, rau ăn phở như ngò gai, hành lá,..."
                        ,7));
        courseList.add(new Course(3, "canhdua", "Canh dưa", "~ 45\nphút               ","Dễ","#A52B2B",
                "Thành phần\n" +
                        "Bắp bò 300 gr\n" +
                        "(có thể sử dụng các phần thịt bò khác)\n" +
                        " Dưa cải chua 100 gr\n" +
                        " Rau tần 1 ít\n" +
                        " Cà chua 3 quả\n" +
                        " Tỏi 3 tép\n" +
                        " Dầu ăn 150 ml\n" +
                        " Nước mắm 1 muỗng canh\n" +
                        " Gia vị thông dụng 1 ít (đường/ bột ngọt/ hạt nêm)\n" +
                        "Cách làm\n" +
                        "1. Sơ chế các nguyên liệu:\n" +
                        "Bạn khử sạch mùi hôi của thịt bò bằng cách xát muối thật kỹ. Tiếp theo, rửa lại với nước, để ráo rồi cắt lát thịt để mang đi chế biến.\n" +
                        "Cải chua mua về xả qua nước lạnh để cải giòn, tiếp theo rửa và vắt ráo nước khoảng 2 - 3 lần cho cải không bị mặn và quá chua. Sau đó, cắt cải chua thành các khúc vừa ăn khoảng 1 lóng tay.\n" +
                        "Cà chua mua về, bạn bỏ cuống, rửa sạch rồi cắt múi cau. Đối với tỏi, bạn bóc vỏ rồi băm nhuyễn.\n" +
                        "Tương tự với rau tần, bạn cũng rửa sạch, để ráo rồi cắt nhuyễn nhé!\n"+
                        "2.Xào hỗn hợp các nguyên liệu :\n" +
                        "Đầu tiên, bạn phi thơm vàng tỏi băm với 150ml dầu ăn. Sau đó, cho 1/2 số cà chua đã cắt vào xào trong 1 phút. Kế tiếp, cho thịt bò đã cắt vào xào khoảng 5 phút với lửa nhỏ.\n" +
                        "\n" +
                        "Tiếp theo, bạn cho 100gr dưa cải chua vào nồi xào khoảng 2 phút với lửa nhỏ, đừng quên đảo đều tay để nguyên liệu không bị cháy nhé!" +
                        "\n"+
                        "3.Nấu canh dưa chua thịt bò rau tần :\n" +
                        "Cho 1.5 lít nước vào nồi và nêm 2 muỗng cà phê đường, 1 muỗng cà phê hạt nêm cùng 1/2 muỗng cà phê bột ngọt. Tiếp đó, bạn nấu canh ở lửa nhỏ cho bò mềm khoảng 20 phút.\n" +
                        "\n" +
                        "Sau khi bò mềm, cho rau tần đã cắt nhỏ vào cùng phần cà chua còn lại và thêm 1 muỗng canh nước mắm để hương vị thêm đậm đà.\n" +
                        "\n" +
                        "Nấu thêm 5 phút, nêm nếm gia vị cho vừa ăn rồi tắt bếp là hoàn thành." +
                        "\n"+
                        "4.Thành phẩm :\n" +
                        "Bát canh dưa chua thịt bò rau tần nóng hổi, thơm lừng hẳn sẽ khiến mọi người ngất ngây bởi sự hòa quyện hoàn hảo giữa vị chua chua của dưa cải kết hợp cùng vị ngọt đậm đà của thịt bắp bò.\n" +
                        "\n" +
                        "Bạn có thể thưởng thức món canh dưa chua thịt bò rau tần cùng cơm để cảm nhận một cách trọn vẹn hương vị ngon khó cưỡng này nhé!"
                        , 2));
        courseList.add(new Course(4, "thitboham", "Bò hầm thuốc bắc", "~ 100\nphút              ","Dễ","#CB8D16",
                "Thành phần\n" +
                        " Thịt nạm bò 500 gr\n" +
                        " Chân gà 500 gr\n" +
                        " Củ sen 200 gr\n" +
                        " Hạt sen tươi 30 gr\n" +
                        " Gừng 20 gr\n" +
                        " Kỷ tử 5 gr\n" +
                        " Táo tàu 10 trái\n" +
                        " Hoài sơn 4 miếng\n" +
                        " Đẳng sâm 2 gr\n" +
                        " Đỗ trọng 2 gr\n" +
                        " Hoàng kỳ 1 miếng\n" +
                        " Bạch chỉ 1 miếng\n" +
                        " Ngọc trúc 1 miếng\n" +
                        " Xuyên khung 2 gr\n" +
                        " Thục địa 1 miếng\n" +
                        " Thảo quả 2 quả\n" +
                        " Hoa hồi 4 miếng\n" +
                        " Đường phèn 2.5 muỗng canh\n" +
                        " Bột ngọt 1/2 muỗng canh\n" +
                        " Nước tương 1 muỗng canh\n" +
                        " Muối 1 ít\n "+
                        "Cách làm\n" +
                        "\n"+
                        "1.Sơ chế chân gà và thịt bò :" +
                        "Chân gà mua về, các bạn lột bỏ phần màng phía bên ngoài, mang chà sạch với muối, sau đó xả sạch lại với nước, để ráo. Dùng dao cắt bỏ phần móng chân, rồi chặt chân gà làm đôi theo chiều ngang.\n" +
                        "\n" +
                        "Thịt bò, sau khi mua về các bạn dùng dao cắt bớt phần mỡ thừa (nếu có), đem chà sạch với 1 ít muối. Sau đó rửa sạch lại với vài lần nước rồi để ráo.\n" +
                        "\n" +
                        "Bắc một nồi nước lên bếp và đun sôi, sau đó thêm vào nồi 1 trái thảo quả khô, 2 miếng hoa hồi vào nấu thêm khoảng 5 phút nữa. Sau đó, cho phần thịt bò và chân gà vào, chần sơ đến khi nước sôi trở lại thì vớt ra ngoài, xả sơ lại với nước lạnh và để ráo.\n" +
                        "2.Luộc thịt bò :\n" +
                        "Bắc nồi lên bếp, cho 1 lít nước lọc, 1 trái thảo quả khô, 2 miếng hoa hồi khi nãy vớt ra và thịt bò vào nồi. Tiến hành luộc thịt bò ở lửa lớn cho nước sôi.\n" +
                        "\n" +
                        "Sau khi nước đã sôi, các bạn hạ nhỏ lửa và hớt bọt. Nêm tiếp vào nồi 1 muỗng canh muối rồi đậy nắp và hầm khoảng 1 giờ - 1 giờ 30 phút cho thịt bò mềm." +
                        "\n"+
                        "3.Sơ chế các nguyên liệu khác :\n" +
                        "Để loại sạch bụi bẩn, củ sen khi mua về các bạn dùng bàn chải chà sạch phần vỏ bên ngoài, sau đó rửa lại với nước.\n" +
                        "\n" +
                        "Dùng dao cắt củ sen thành các lát mỏng dày khoảng 1/2 lóng tay. Để củ sen không bị thâm, sau khi cắt bạn cần cho ngay vào nước muối và ngâm cho đến lúc chế biến mới vớt củ sen ra.\n."
                        + "Về phần hạt sen, các bạn tách vỏ, tách bỏ tâm sen, rửa sạch tránh làm đắng hạt nếu còn tâm sen vương lại. Đối với hạt sen tươi các bạn không nên ngâm với nước, sẽ khiến hạt sen bị chai, cứng ăn không ngon.\n" +
                        "Kỷ tử, táo tàu, hoài sơn mang đi ngâm nước khoảng 15 - 20 phút cho nở mềm.\n" +
                        "4.Nấu món ăn :\n" +
                        "Vớt toàn bộ thảo quả và hoa hồi trong nồi nước luộc bò ra ngoài.\n" +
                        "\n" +
                        "Sau đó thêm tiếp 1 lít nước lọc, chân gà, củ sen, táo tàu, hạt sen và toàn bộ gia vị hầm thuốc bắc trừ kỷ tử (bao gồm: 4 miếng hoài sơn, 2gr đẳng sâm, 2gr đỗ trọng, 1 miếng hoàng kỳ, 1 miếng bạch chỉ, 1 miếng ngọc trúc, 2gr xuyên khung, 1 miếng thục địa) vào nồi và tiến hành đun sôi.\n" +
                        "Sau khi nước dùng sôi, thêm vào nồi 2 muỗng canh đường phèn. Vặn nhỏ lửa và tiếp tục hầm thêm khoảng 30 phút nữa cho các nguyên liệu chín mềm. Kế đến, cho kỷ tử vào và tiếp tục nấu thêm 10 phút nữa.\n" +
                        "\n" +
                        "Sau đó thêm vào nồi 1/2 muỗng canh bột ngọt, 1/2 muỗng canh đường phèn, 1 muỗng canh nước tương sau đó nêm nếm lại cho vừa ăn rồi tắt bếp.\n" +
                        "5.Thành phẩm :\n" +
                        "Vớt thịt bò ra ngoài, để nguội rồi cắt miếng vừa ăn. Xếp thịt bò, chân gà, củ sen và các gia vị thuốc bắc ra tô, sau đó cho nước dùng vào, trang trí lại cho đẹp mắt là hoàn thành.\n" +
                        "\n" +
                        "Bò tiềm thuốc bắc thơm ngon, bổ dưỡng với nước dùng thanh ngọt, thịt bò mềm ngọt, thấm vị, chân gà dai giòn ăn cùng với củ sen, hạt sen bùi bùi kích thích vị giác vô cùng. Với cách nấu đơn giản, không một chút cầu kì, nhưng lại vô cùng bổ dưỡng phù hợp cho các bà bầu và trẻ nhỏ. Hãy thử trổ tài làm ngay món này cho các thành viên trong gia đình cùng thưởng thức nhé!"
                , 3));
        courseList.add(new Course(5, "bapcailuoc", "Bắp cải luộc", "~ 20\nphút               ","Dễ","#DEAD00",
                "Thành phần\n" +
                        "1 cây bắp cải\n" +
                        "Cách làm\n" +
                        "\n" +
                        "1. Tách vỏ bắp cải:\n" +
                        "Bắp cải mua về bạn bóc các lớp lá phía bên ngoài, loại bỏ những lá bị sâu và bị dập úa. Bởi phần bên ngoài thường là những lá héo, bám nhiều bụi bẩn.\n" +
                        "\n" +
                        "2: Rửa bắp cải :\n" +
                        "Kế đến bạn rửa sạch bắp cải dưới vòi nước để rửa sạc bụi bẩn còn bám lại trên bắp cải.\n" +
                        "\n" +
                        "Ngoài ra để giúp bắp cải sạch hơn, bạn cũng có thể rửa với nước muối pha loãng và ngâm trong khoảng 10 phút, sau đó rửa lại với nước sạch, để ráo." +
                        "\n" +
                        "3. Cắt nhỏ bắp cải :\n" +
                        "Tùy theo sở thích mà bạn có thể cắt bắp cải thành các miếng nhỏ hình chữ nhật hoặc thái sợi, hình khối tam giác sao cho vừa ăn là được nha." +
                        "\n" +
                        "4: Luộc bắp cải\n" +
                        "Chuẩn bị một cái nồi, cho vào nồi lượng nước vừa phải, cho thêm khoảng 1/2 muỗng cà phê giấm (nếu bạn không thích mùi nồng của rau), đun sôi ở lửa lớn.\n" +
                        "\n" +
                        "Kế đến cho bắp cải vào nồi, hạ lửa nhỏ và luộc trong khoảng 5 phút (bắp cải thái sợi) hoặc trong khoảng 10 - 15 phút (bắp cải thái vuông, hình khối)." +
                        "\n" +
                        "5: Thành phẩm\n" +
                        "Bắp cải nóng hổi, xanh tươi. Bắp cải được luộc chín tới nên vẫn giữ được độ giòn, ngọt. Món ăn tuy đơn giản nhưng khi dùng kèm với cơm nóng, thêm một chén nước chấm kế bên là ngon đúng điệu luôn đấy nhé!"
                        ,4));
        courseList.add(new Course(6, "raumuongxao", "Rau muống xào", "~ 15\nphút               ","Dễ","#EEA83E",
                "Thành phần\n" +
                        "\n" +
                        "Rau muống 500 gr\n" +
                        " Tỏi 2 củ\n" +
                        " Dầu hào 1 muỗng canh\n" +
                        " Dầu ăn 2 muỗng canh\n" +
                        " Gia vị thông dụng 1 ít (đường/ muối/ hạt nêm/ bột ngọt) \n" +
                        "Cách làm\n" +
                        "1. Sơ chế nguyên liệu :\n" +
                        "Rau muống nhặt bỏ phần gốc và những lá hư rồi ngắt thành từng khúc vừa ăn. Sau đó, đem rau đi rửa với nước muối pha loãng rồi rửa lại với nước sạch một lần nữa và để ráo.\n" +
                        "\n" +
                        "Tỏi bóc vỏ rồi đập dập." +
                        "\n" +
                        "2.Làm rau muống xào tỏi:\n" +
                        "Bắc chảo lên bếp, cho vào chảo 2 muỗng canh dầu ăn. Đợi dầu ăn nóng, cho tỏi vào phi thơm. Kế tiếp, cho hết rau muống vào xào đều tay trên lửa lớn rồi cho thêm 1/4 chén nước lọc vào và tiếp tục xào khoảng 5 phút cho rau chín.\n" +
                        "\n" +
                        "Sau đó nêm vào chảo 1 muỗng canh hạt nêm, 1 muỗng cà phê đường, 1/2 muỗng cà phê bột ngọt, 1 muỗng cà phê dầu hào rồi xào đều tay đến khi nào gia vị tan hết. Bạn có thể nêm nếm lại gia vị sao cho phù hợp với khẩu vị rồi tắt bếp và cho ra dĩa." +
                        "\n" +
                        "3.Thành phẩm :\n" +
                        "Rau muống xào tỏi hoàn thành có mùi rất thơm của tỏi. Rau muống có một màu xanh đẹp mắt, giòn giòn chứ không hề dai. Gia vị nêm nếm rất vừa ăn lại thơm mùi tiêu xay càng kích thích vị giác.\n" +
                        "\n" +
                        "Bữa ăn trong gia đình mà có mặt của món ăn này thì nồi cơm sẽ hết rất nhanh đấy, đơn giản và lại thực hiện nhanh chóng, vào bếp làm ngay nào!"
                ,4));
        courseList.add(new Course(7, "myxao", "Mỳ spaghetti", "~ 30\nphút               ","Dễ","#FF7070",
                "Thành phần\n" +
                        "Mì ý 200 gr\n" +
                        " Thịt bò bằm 200 gr\n" +
                        " Sốt mì ý 400 gr (làm sẵn)\n" +
                        " Hành tây 1/2 củ (cắt hạt lựu)\n" +
                        " Dầu ô liu 2 muỗng canh\n" +
                        " Muối/ tiêu xay 1 ít" +
                        "\n"+
                        "Cách làm\n" +
                        "1.Luộc mì :\n" +
                        "Bắc nồi lên bếp, cho khoảng 700ml nước vào nấu với lửa lớn. Đến khi nước sôi lên thì cho 1 muỗng cà phê muối và hết 200gr mì ý vào, giảm lại lửa vừa, khi đầu mì chạm nước đã mềm thì dùng tay nhấn hết toàn bộ sợi mì chìm xuống nước.\n" +
                        "\n" +
                        "Khuấy đều mì và nấu khoảng 8 - 10 phút thì tắt bếp, rồi vớt mì đã luộc ra rổ cho ráo nước là hoàn thành." +
                        "\n" +
                        "2.Ướp thịt :\n" +
                        "Cho 200gr thịt bò bằm vào 1 cái tô, cho vào 1/2 muỗng cà phê muối và 1/3 muỗng cà phê tiêu xay rồi trộn đều. Sau đó đem đi ướp khoảng 10 phút cho thịt bò thấm gia vị." +
                        "\n" +
                        "3.Làm sốt mì ý :\n" +
                        "Đặt chảo lên bếp bật lửa vừa, cho vào 1 muỗng canh dầu ô liu, chờ dầu nóng thì cho tiếp 1/2 củ hành tây cắt hạt lựu vào phi thơm.\n" +
                        "\n" +
                        "Tiếp đó cho thịt bò bằm đã ướp gia vị vào xào thật đều tay để bò không bị dính lại với nhau. Bạn xào khoảng 3 phút cho thịt bò chín nhé.\n" +
                        "\n" +
                        "Sau khi thịt bò đã chín bạn cho hết 400gr sốt mì ý đã làm sẵn vào chảo thịt xào rồi đảo đều tay khoảng 3 phút, thêm 1/3 muỗng cà phê tiêu xay vào đảo đều rồi tắt bếp.\n" +
                        "4.Hoàn thành :\n" +
                        "Bạn cho mì ý đã luộc ra dĩa sau đó rưới 1 ít sốt bò bằm lên trên, thêm 1 trái cà chua được cắt tỉa thành hình hoa đẹp mắt lên trên để trang trí là hoàn thành."
                ,8));

        courseList.add(new Course(8, "boxao", "Bò xào hành tay", "~ 45\nphút               ","Dễ","#945B38",
                "Thành phần\n" +
                        "Thịt bò 300 gr\n" +
                        " Hành tây 1 củ\n" +
                        " Dầu ăn 2 muỗng canh\n" +
                        " Gia vị thông dụng 1 ít (muối/ hạt nêm/ bột ngọt)" +
                        "\n" +
                        "Cách làm\n" +
                        "1.Sơ chế nguyên liệu :\n" +
                        "Thịt bò mua về rửa sạch, cắt miếng mỏng vừa ăn cho vào tô.\n" +
                        "\n" +
                        "Hành tây lột vỏ rồi cũng rửa sạch, sau đó bạn cắt múi cau có độ dày khoảng 1/2 đốt ngón tay." +
                        "\n" +
                        "2.Làm thịt bò xào hành tây :\n" +
                        "Cho thịt bò vào chảo cùng 1 muỗng canh dầu ăn, 1 muỗng cà phê hạt nêm, 1/2 muỗng cà phê bột ngọt, 1 muỗng cà phê muối xào đều tay với lửa lớn trong 1 phút cho thịt bò săn lại thì cho 4 muỗng canh nước lọc vào xào khoảng 2 phút cho rút bớt nước thì cho thịt bò ra dĩa.\n" +
                        "\n" +
                        "Dùng lại chảo vừa xào thịt, cho 1 muỗng dầu ăn vào chảo đun nóng, cho hành tây vào xào khoảng 1 phút thì nêm vào 1 muỗng cà phê hạt nêm, xào đều tay trên bếp với lửa lớn khoảng 2 phút là được.\n" +
                        "\n" +
                        "Hạ lửa vừa cho phần thịt bò đã xào vào, đảo trên bếp khoảng 3 phút cho hành tây và thịt bò chín hẳn thì nêm nếm lại gia vị và tắt bếp." +
                        "\n" +
                        "3.Thành phẩm :\n" +
                        "Thịt bò xào hành tây đã hoàn thành trong vài phút, thật nhanh và đơn giản đúng không nào.\n" +
                        "\n" +
                        "Thịt bò xào vừa tới, mềm và thấm gia vị cộng thêm vị ngọt tự nhiên của hành tây, cắn vào giòn giòn rất vui miệng mà món xào không hề bị ngán. Chúc bạn thực hiện thành công nhé."
                ,6));

        courseList.add(new Course(9, "tomluoc", "Tôm luộc", "~ 15\nphút               ","Dễ","#690004",
                "Thành phần\n" +
                        "1kg tôm\n" +
                        "3 nhánh sả\n" +
                        "1/2 muỗng cà phê muối\n" +
                        "1/2 muỗng cà phê bột ngọt\n" +
                        "Cách làm\n" +
                        "1. Sơ chế\n" +
                        "Bạn rửa tôm cho sạch hoàn toàn đất cát rồi rút bỏ phần chỉ đen trên lưng và rửa lại lần nữa với nước.\n" +
                        "2. Luộc tôm\n" +
                        "Bạn đặt nồi nước luộc tôm lên bếp và thêm vào nồi 1/2 muỗng cà phê muối, 1/2 muỗng cà phê bột ngọt, sả đập dập rồi đun cho nước sôi ở lửa lớn.\n" +
                                "\n" +
                                "Khi nước sôi, bạn cho tôm đã sơ chế sạch vào luộc từ 5 - 7 phút tùy vào số lượng và kích cỡ tôm, luộc đến khi tôm chín thì vớt ra."
                ,5));

        courseList.add(new Course(10, "banhkem", "Bánh kem", "~ 80\nphút               ","Dễ","#FC9211",
                "Thành phần\n" +
                        "Bột mì đa dụng 280 gr\n" +
                        " Baking powder 2.25 muỗng cà phê\n" +
                        "(bột nở)\n" +
                        " Bơ lạt 510 gr\n" +
                        "(để mềm)\n" +
                        " Trứng gà 3 quả\n" +
                        " Tinh chất vani 1.5 muỗng canh\n" +
                        " Buttermilk 240 ml\n" +
                        " Sữa tươi không đường 60 gr\n" +
                        "(hoặc whipping cream)\n" +
                        " Đường bột 575 gr\n" +
                        " Đường 333 gr\n" +
                        " Muối 1 muỗng cà phê\n" +
                        " Cốm màu 1 ít\n" +
                        "\n"+
                        "Cách làm\n" +
                        "1.Trộn bột :\n" +
                        "Đầu tiên, rây mịn 280gr bột mì vào tô, sau đó cho vào thêm 3/4 muỗng cà phê muối, 2.25 muỗng cà phê baking powder rồi trộn đều." +
                        "\n" +
                        "2.Đánh bơ và trứng :\n" +
                        "Cho vào tô mới 170gr bơ lạt để mềm rồi dùng máy đánh cho mịn mượt. Tiếp theo, cho từ từ 333gr đường vào tô bơ và tiếp tục trộn đều trong 3 phút đến khi bơ bông đều, có màu vàng nhạt.\n" +
                        "Kế đến, cho lần lượt 3 quả trứng gà vào rồi đánh cho hỗn hợp mịn mượt.\n" +
                        "\n" +
                        "Cuối cùng, cho vào thêm 1 muỗng canh tinh chất vani, trộn đều 1 lần nữa là hoàn tất." +
                        "\n" +
                        "3.Trộn bột bánh :\n" +
                        "Tiếp đến, cho luân phiên bột khô và 240ml buttermilk vào tô bơ, vừa cho vừa trộn bằng máy.\n" +
                        "\n" +
                        "Cứ cho 1 ít bột khô thì bạn đổ vào 1 ít sữa để hỗn hợp được loãng, dễ hòa quyện với nhau." +
                        "\n" +
                        "4.Nướng bánh :\n" +
                        "Làm nóng lò nướng trước ở nhiệt độ 175 độ C trong 15 phút.\n" +
                        "\n" +
                        "Thoa 1 lớp bơ vào khuôn tròn, sau đó cho vào 1 tấm giấy nến. Kế đến, đổ hỗn hợp bột bánh vào khuôn rồi dùng tay đập nhẹ dưới đáy khuôn để bột dàn đều.\n" +
                        "\n" +
                        "Nướng bánh 30 phút ở nhiệt độ 175 độ C đến khi mặt bánh chín vàng là được." +
                        "\n" +
                        "5.Làm kem trang trí bánh :\n" +
                        "Cho vào tô 340gr bơ lạt để mềm rồi dùng máy đánh cho mịn mượt.\n" +
                        "\n" +
                        "Tiếp theo, rây mịn vào tô bơ: 1/4 muỗng cà phê muối, 575gr đường bột, 1/2 muỗng canh tinh chất vani rồi tiếp tục đánh đều.\n" +
                        "\n" +
                        "Cuối cùng, bạn cho 60ml sữa tươi (hoặc whipping cream) và đánh bằng máy đến khi hỗn hợp mịn mượt." +
                        "\n" +
                        "6.Hoàn thành :\n" +
                        "Cho kem bơ vào túi bắt bông kem, sau đó bạn bơm kem lên mặt bánh, hướng từ giữa ra ngoài, 1 tay bơm kem 1 tay xoay bàn xoay để hỗn hợp dàn đều.\n" +
                        "\n" +
                        "Kế đến, tráng mịn mặt lại rồi đặt lớp bánh thứ 2 lên trên. Tiếp theo, bóp kem phủ đều bánh, dùng cây dao tráng lại cho mịn các mặt xung quanh.\n" +
                        "\n" +
                        "Để tạo các đường vân, bạn đặt cây dao cố định 1 chỗ dưới đáy bánh, sau đó xoay bàn xoay để tạo hình. Làm tương tự với những đường vân trên.\n" +
                        "\n" +
                        "Cuối cùng, rắc 1 ít cốm màu lên mặt bánh là hoàn tất."
                ,8));

        fullcoursesList.addAll(courseList);

        setCourseRecycler(courseList);
    }


    public void fromMaintoCall(View view){
        Intent intent = new Intent(this, CallPage.class);
        startActivity(intent);
    }
    public void fromMaintoFavorrite(View view){
        Intent intent = new Intent(this, favourite.class);
        startActivity(intent);
    }
    private void setCourseRecycler(List<Course> courseList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);

        courseRecycler = findViewById(R.id.courseRecycler);
        courseRecycler.setLayoutManager(layoutManager);

        courseAdapter = new CourseAdapter(this, courseList);
        courseRecycler.setAdapter(courseAdapter);

    }


    private void setCategoryRecycler(List<Category> categoryList) {

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);

        categoryRecycler = findViewById(R.id.categoryRecycler);
        categoryRecycler.setLayoutManager(layoutManager);

        categoryAdapter = new CategoryAdapter(this, categoryList);
        categoryRecycler.setAdapter(categoryAdapter);
    }

    public static void showCoursesByCategory(int category){

        courseList.clear();
        courseList.addAll(fullcoursesList);

        List<Course> filterCourses = new ArrayList<>();

        for(Course c : courseList){
            if(c.getCategory() == category)
                filterCourses.add(c);
        }
        courseList.clear();
        courseList.addAll(filterCourses);
        courseAdapter.notifyDataSetChanged();
    }

}

