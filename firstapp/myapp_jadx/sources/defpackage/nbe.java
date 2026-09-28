package defpackage;

import android.os.Build;
import java.util.Locale;
import kotlin.text.c;

/* JADX INFO: loaded from: classes.dex */
public final class nbe {
    /* JADX WARN: Code duplicated, block: B:12:0x0041  */
    /* JADX WARN: Code duplicated, block: B:19:? A[RETURN, SYNTHETIC] */
    public static final boolean a() {
        String lowerCase;
        if (Build.VERSION.SDK_INT >= 31 && "Spreadtrum".equalsIgnoreCase(Build.SOC_MANUFACTURER)) {
            return true;
        }
        String str = Build.HARDWARE;
        str.getClass();
        Locale locale = Locale.ROOT;
        String lowerCase2 = str.toLowerCase(locale);
        lowerCase2.getClass();
        if (c.u(lowerCase2, "ums", false)) {
            return true;
        }
        String str2 = Build.MANUFACTURER;
        str2.getClass();
        if (str2.equalsIgnoreCase("Itel")) {
            lowerCase = str.toLowerCase(locale);
            lowerCase.getClass();
            if (c.u(lowerCase, "sp", false)) {
                return true;
            }
        } else {
            String str3 = Build.BRAND;
            str3.getClass();
            if (str3.equalsIgnoreCase("Itel")) {
                lowerCase = str.toLowerCase(locale);
                lowerCase.getClass();
                if (c.u(lowerCase, "sp", false)) {
                    return true;
                }
            }
        }
        return false;
    }
}
