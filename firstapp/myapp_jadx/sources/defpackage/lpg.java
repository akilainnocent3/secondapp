package defpackage;

import com.sportybet.android.instantwin.presentation.buildandgo.sTE.siPCzPFw;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class lpg {

    public static abstract class a {
        public final void a(String str, String str2) {
            HashMap map = ((fi1.a) this).f;
            if (map != null) {
                map.put(str, str2);
            } else {
                ib5.a("Property \"autoMetadata\" has not been set");
            }
        }
    }

    public final String a(String str) {
        String str2 = b().get(str);
        return str2 == null ? "" : str2;
    }

    public abstract Map<String, String> b();

    public abstract Integer c();

    public abstract d4g d();

    public abstract long e();

    public abstract byte[] f();

    public abstract byte[] g();

    public final int h(String str) {
        String str2 = b().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public abstract Integer i();

    public abstract String j();

    public abstract String k();

    public abstract long l();

    public final fi1.a m() {
        fi1.a aVar = new fi1.a();
        String strK = k();
        if (strK == null) {
            bmy.a("Null transportName");
            return null;
        }
        aVar.a = strK;
        aVar.b = c();
        aVar.g = i();
        aVar.h = j();
        aVar.i = f();
        aVar.j = g();
        d4g d4gVarD = d();
        if (d4gVarD == null) {
            bmy.a(siPCzPFw.UsFZsEv);
            return null;
        }
        aVar.c = d4gVarD;
        aVar.d = Long.valueOf(e());
        aVar.e = Long.valueOf(l());
        aVar.f = new HashMap(b());
        return aVar;
    }
}
