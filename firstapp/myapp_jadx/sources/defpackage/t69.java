package defpackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public final class t69 {
    public static final op8 a = new op8(-1475014657, new q69(), false);
    public static final op8 b = new op8(1069473247, new r69(), false);
    public static final op8 c = new op8(1313863086, new s69(), false);

    public static boolean a(String str) {
        try {
            if (str.length() != 0) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.getDefault());
                Date date = simpleDateFormat.parse(str);
                String str2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(new Date());
                str2.getClass();
                Date date2 = simpleDateFormat.parse(str2);
                if ((date != null ? date.getTime() : 0L) - (date2 != null ? date2.getTime() : 0L) <= 0) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static String b(String str) {
        str.getClass();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd MMM YY");
        try {
            Date date = simpleDateFormat.parse(str);
            date.getClass();
            String str2 = simpleDateFormat2.format(date);
            str2.getClass();
            return str2;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
