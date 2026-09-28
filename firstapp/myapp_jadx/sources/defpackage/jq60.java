package defpackage;

import android.os.Build;
import kotlin.text.c;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jq60 {
    public static final int a(hq60 hq60Var, String str) {
        hq60Var.getClass();
        int iA = l0b.a(hq60Var, str);
        if (iA >= 0) {
            return iA;
        }
        int iA2 = l0b.a(hq60Var, "`" + str + '`');
        if (iA2 >= 0) {
            return iA2;
        }
        if (Build.VERSION.SDK_INT > 25 || str.length() == 0) {
            return -1;
        }
        int columnCount = hq60Var.getColumnCount();
        String strConcat = ".".concat(str);
        String strA = zdf0.a('`', ".", str);
        for (int i = 0; i < columnCount; i++) {
            String columnName = hq60Var.getColumnName(i);
            if (columnName.length() >= str.length() + 2 && (c.k(columnName, strConcat, false) || (columnName.charAt(0) == '`' && c.k(columnName, strA, false)))) {
                return i;
            }
        }
        return -1;
    }
}
