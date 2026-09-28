package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class l0b {
    public static final int a(hq60 hq60Var, String str) {
        hq60Var.getClass();
        if (hq60Var instanceof zou) {
            throw null;
        }
        int columnCount = hq60Var.getColumnCount();
        for (int i = 0; i < columnCount; i++) {
            if (str.equals(hq60Var.getColumnName(i))) {
                return i;
            }
        }
        return -1;
    }

    public static final int b(hq60 hq60Var, String str) {
        hq60Var.getClass();
        int iA = jq60.a(hq60Var, str);
        if (iA >= 0) {
            return iA;
        }
        int columnCount = hq60Var.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i = 0; i < columnCount; i++) {
            arrayList.add(hq60Var.getColumnName(i));
        }
        uj5.b("Column '", str, "' does not exist. Available columns: [", CollectionsKt.a0(arrayList, null, null, null, null, 63), 93);
        return 0;
    }

    public static final String c(String str) {
        String host = Uri.parse(str).getHost();
        String strA0 = host != null ? StringsKt.a0(host, "www.") : null;
        return strA0 == null ? "" : strA0;
    }
}
