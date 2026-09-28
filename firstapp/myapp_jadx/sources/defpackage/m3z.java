package defpackage;

import com.sporty.android.common_analytics.opentelemetry.RumDomainData;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class m3z implements ss60 {
    public final RumDomainData a;
    public final wig0 b;

    public m3z(double d, RumDomainData rumDomainData) {
        this.a = rumDomainData;
        ti1 ti1Var = wig0.c;
        if (d < 0.0d || d > 1.0d) {
            hb5.a("ratio must be in range [0.0, 1.0]");
            throw null;
        }
        this.b = new wig0(d, d == 0.0d ? Long.MIN_VALUE : d == 1.0d ? Long.MAX_VALUE : (long) (9.223372036854776E18d * d));
    }

    @Override // defpackage.ss60
    public final String a() {
        return tug.a("OtelIgnoreRatioSampler(", this.b.b, ")");
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0067  */
    /* JADX WARN: Code duplicated, block: B:38:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:? A[LOOP:0: B:25:0x0061->B:39:?, LOOP_END, SYNTHETIC] */
    @Override // defpackage.ss60
    public final ti1 b(m0b m0bVar, String str, String str2, wqa0 wqa0Var, m21 m21Var, List<sfs> list) {
        List<String> allowlist;
        Iterator<T> it;
        m0bVar.getClass();
        str.getClass();
        wqa0Var.getClass();
        m21Var.getClass();
        list.getClass();
        String str3 = (String) m21Var.e(smh0.a);
        String host = "";
        if (str3 == null) {
            str3 = "";
        }
        try {
            host = new URL(str3).getHost();
        } catch (Exception unused) {
        }
        RumDomainData rumDomainData = this.a;
        if (rumDomainData == null) {
            ti1 ti1Var = ti1.d;
            ti1Var.getClass();
            return ti1Var;
        }
        host.getClass();
        List<String> blocklist = rumDomainData.getBlocklist();
        if (blocklist == null || !blocklist.isEmpty()) {
            Iterator<T> it2 = blocklist.iterator();
            while (it2.hasNext()) {
                if (oye.a(host, (String) it2.next())) {
                }
            }
            allowlist = rumDomainData.getAllowlist();
            if (allowlist != null || !allowlist.isEmpty()) {
                it = allowlist.iterator();
                while (it.hasNext()) {
                    if (oye.a(host, (String) it.next())) {
                        ti1 ti1VarB = this.b.b(m0bVar, str, str2, wqa0Var, m21Var, list);
                        ti1VarB.getClass();
                        return ti1VarB;
                    }
                }
            }
        } else {
            allowlist = rumDomainData.getAllowlist();
            if (allowlist != null) {
                it = allowlist.iterator();
                while (it.hasNext()) {
                    if (oye.a(host, (String) it.next())) {
                        ti1 ti1VarB2 = this.b.b(m0bVar, str, str2, wqa0Var, m21Var, list);
                        ti1VarB2.getClass();
                        return ti1VarB2;
                    }
                }
            } else {
                it = allowlist.iterator();
                while (it.hasNext()) {
                    if (oye.a(host, (String) it.next())) {
                        ti1 ti1VarB3 = this.b.b(m0bVar, str, str2, wqa0Var, m21Var, list);
                        ti1VarB3.getClass();
                        return ti1VarB3;
                    }
                }
            }
        }
        ti1 ti1Var2 = ti1.d;
        ti1Var2.getClass();
        return ti1Var2;
    }
}
