import com.sun.org.apache.xpath.internal.operations.Or;
import mylib.Validation;

public class Invoice {
    private int id;
    private String date;

    public Invoice() {

    }

    public Invoice( int id, String date) {
        this.id = id;
        this.date = date;
    }

    // hàm này để input thông tin invoice (id, date)
    public void inputInvoice() {
        System.out.println("Input the info of Invoice: ");
        while (true) {
            try {
                id = (int)Validation.inputNumber("Input id of Invoice [1-100]: ", 1, 100);
                date = Validation.inputString("Input date of Invoice: ", "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]|(?:Jan|Mar|May|Jul|Aug|Oct|Dec)))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[1,3-9]|1[0-2]|(?:Jan|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec))\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)(?:0?2|(?:Feb))\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9]|(?:Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep))|(?:1[0-2]|(?:Oct|Nov|Dec)))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$");
                break;
            } catch (Exception er) {
                System.out.println("Input invoice again");
            }
        }
    }

    // hàm này để xuất đơn hàng
    public void displayInvoice() {
        this.inputInvoice();
        System.out.println("Invoice of Customer: ");
        System.out.println("id: " + id + ", date: " + date);
    }
}
