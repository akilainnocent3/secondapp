package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public final class vmk0 {
    public static String a(Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String strA;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                strA = "null";
            } else {
                try {
                    strA = obj.toString();
                } catch (Exception e) {
                    String strA2 = tug.a(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strA2), (Throwable) e);
                    strA = tx5.a("<", strA2, " threw ", e.getClass().getName(), ">");
                }
            }
            objArr[i2] = strA;
            i2++;
        }
        StringBuilder sb = new StringBuilder((length * 16) + 29);
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (iIndexOf = "expected a non-null reference".indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) "expected a non-null reference", i3, iIndexOf);
            sb.append(objArr[i]);
            i++;
            i3 = iIndexOf + 2;
        }
        sb.append((CharSequence) "expected a non-null reference", i3, 29);
        if (i < length2) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }
}
