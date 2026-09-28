package defpackage;

import android.net.Uri;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* JADX INFO: loaded from: classes6.dex */
public final class bnh0 {
    public final cbg a;
    public final mpe0 b;

    public bnh0(cbg cbgVar) {
        cbgVar.getClass();
        this.a = cbgVar;
        this.b = hwr.b(new d710(this, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String d(bnh0 bnh0Var, String[] strArr, Map map, int i) {
        if ((i & 2) != 0) {
            map = o2g.a;
            map.getClass();
        }
        return bnh0Var.c(strArr, map, null);
    }

    public static String f(String str, String[] strArr, Map map, String str2) {
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        for (String str3 : strArr) {
            builderBuildUpon.appendEncodedPath(StringsKt.c0(StringsKt.a0(str3, "/"), "/"));
        }
        for (Map.Entry entry : map.entrySet()) {
            builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        if (str2 != null) {
            builderBuildUpon.encodedFragment(str2);
        }
        String string = builderBuildUpon.build().toString();
        string.getClass();
        return string;
    }

    public static String g(String str, String[] strArr) {
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        return f(str, strArr, o2gVar, null);
    }

    public final String a(String str, String[] strArr) {
        if (str.equals("https") || str.equals("wss")) {
            return g(c.p(this.a.b().b, "https", str, false), strArr);
        }
        hb5.a("Supported schemes are only https and wss");
        return null;
    }

    public final String b(String... strArr) {
        return g(this.a.b().f, strArr);
    }

    public final String c(String[] strArr, Map<String, String> map, String str) {
        map.getClass();
        return f(this.a.b().c, (String[]) xx0.p(new String[]{"m"}, strArr), map, str);
    }

    public final String e(String... strArr) {
        strArr.getClass();
        return g(this.a.b().e, strArr);
    }

    public final String h(String... strArr) {
        return g(this.a.b().c, strArr);
    }

    public final boolean i(String str) {
        str.getClass();
        List list = (List) this.b.getValue();
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (c.l((String) it.next(), str, true)) {
                return true;
            }
        }
        return false;
    }
}
