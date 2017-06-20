package utils;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by think on 2017/5/27.
 */
//根据传入的时间格式把Long变成对应的格式。
public class MyDateTag extends TagSupport {

    private String value;

    private String datePattern;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDatePattern() {
        return datePattern;
    }

    public void setDatePattern(String datePattern) {
        this.datePattern = datePattern;
    }

    public int doStartTag() throws JspException{

        String vv = ""+value;
        try {
            Long time = Long.valueOf(vv.trim());
            Calendar c = Calendar.getInstance();
            c.setTimeInMillis(time);
            SimpleDateFormat sdf = new SimpleDateFormat(datePattern);
            String format = sdf.format(c.getTime());
            pageContext.getOut().write(format);
        }catch (Exception e){
            e.printStackTrace();
        }
        return super.doStartTag();
    }
}
