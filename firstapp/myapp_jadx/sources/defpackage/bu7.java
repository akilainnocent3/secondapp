package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class bu7 {
    public static final /* synthetic */ int a = 0;

    public static void a(StringBuilder sb, HashMap map) {
        sb.append("{");
        boolean z = true;
        for (String str : map.keySet()) {
            if (!z) {
                sb.append(",");
            }
            String str2 = (String) map.get(str);
            u4.a(sb, "\"", str, "\":");
            if (str2 == null) {
                sb.append("null");
            } else {
                u4.a(sb, "\"", str2, "\"");
            }
            z = false;
        }
        sb.append("}");
    }
}
