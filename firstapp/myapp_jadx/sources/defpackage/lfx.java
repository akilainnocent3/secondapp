package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class lfx {
    public final ifx a;
    public final ygx b;
    public final Bundle c;
    public s9s.b d;
    public final jgx e;
    public final String f;
    public final Bundle g;
    public final kv60 h;
    public boolean i;
    public final kbs j;
    public s9s.b k;
    public final ov60 l;
    public final mpe0 m;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Llfx$a;", "Lj8i0;", "Lvu60;", "handle", "<init>", "(Lvu60;)V", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends j8i0 {
        public final vu60 a;

        public a(vu60 vu60Var) {
            vu60Var.getClass();
            this.a = vu60Var;
        }
    }

    public lfx(ifx ifxVar) {
        this.a = ifxVar;
        this.b = ifxVar.b;
        this.c = ifxVar.c;
        this.d = ifxVar.d;
        this.e = ifxVar.e;
        this.f = ifxVar.f;
        this.g = ifxVar.i;
        int i = 1;
        this.h = new kv60(new mv60(ifxVar, new xk20(ifxVar, i)));
        mpe0 mpe0VarB = hwr.b(new jfx(0));
        this.j = new kbs(ifxVar, true);
        this.k = s9s.b.b;
        this.l = (ov60) mpe0VarB.getValue();
        this.m = hwr.b(new bp5(i));
    }

    public final Bundle a() {
        Bundle bundle = this.c;
        if (bundle == null) {
            return null;
        }
        o2g.a.getClass();
        Bundle bundleA = vj5.a((Pair[]) Arrays.copyOf(new Pair[0], 0));
        bundleA.putAll(bundle);
        return bundleA;
    }

    public final void b() {
        if (!this.i) {
            kv60 kv60Var = this.h;
            kv60Var.a.a();
            this.i = true;
            if (this.e != null) {
                dv60.b(this.a);
            }
            kv60Var.a(this.g);
        }
        int iOrdinal = this.d.ordinal();
        int iOrdinal2 = this.k.ordinal();
        kbs kbsVar = this.j;
        if (iOrdinal < iOrdinal2) {
            kbsVar.i(this.d);
        } else {
            kbsVar.i(this.k);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(jq40.a(ifx.class).k());
        sb.append("(" + this.f + ')');
        sb.append(" destination=");
        sb.append(this.b);
        return sb.toString();
    }
}
