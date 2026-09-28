package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class epg0 {
    public static dpg0 a(String str) {
        ArrayList arrayList;
        List<String> listSplit$default;
        if (str == null || (listSplit$default = StringsKt__StringsKt.split$default(str, new String[]{"|"}, false, 2, 2, null)) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(l48.r(listSplit$default, 10));
            for (String str2 : listSplit$default) {
                s9e0 s9e0Var = s9e0.a;
                String string = StringsKt.t0(str2).toString();
                s9e0Var.getClass();
                arrayList.add(s9e0.a(string));
            }
        }
        if (arrayList == null) {
            itf0.a.d(inm.a("error: error occurring when splitting: ", str), new Object[0]);
            return new dpg0(null, null);
        }
        if (arrayList.size() >= 2) {
            return new dpg0((String) arrayList.get(0), (String) arrayList.get(1));
        }
        itf0.a.d(inm.a("error: msg without delimiter: ", str), new Object[0]);
        return new dpg0(null, (String) arrayList.get(0));
    }
}
