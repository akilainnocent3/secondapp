package yads;

import android.net.Uri;
import android.os.Bundle;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class fm1 implements xq {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final wq f149163h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f149164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final am1 f149165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yl1 f149166d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final jm1 f149167e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ul1 f149168f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final cm1 f149169g;

    static {
        p51.g();
        sm2 sm2Var = sm2.f155489f;
        cm1 cm1Var = cm1.f147776d;
        jm1 jm1Var = jm1.H;
        f149163h = new wq() { // from class: yads.v04
            @Override // yads.wq
            public final xq fromBundle(Bundle bundle) {
                return fm1.a(bundle);
            }
        };
    }

    public fm1(String str, ul1 ul1Var, am1 am1Var, yl1 yl1Var, jm1 jm1Var, cm1 cm1Var) {
        this.f149164b = str;
        this.f149165c = am1Var;
        this.f149166d = yl1Var;
        this.f149167e = jm1Var;
        this.f149168f = ul1Var;
        this.f149169g = cm1Var;
    }

    public static fm1 a(Bundle bundle) {
        String string = bundle.getString(Integer.toString(0, 36), "");
        string.getClass();
        Bundle bundle2 = bundle.getBundle(Integer.toString(1, 36));
        yl1 yl1Var = bundle2 == null ? yl1.f158396g : (yl1) yl1.f158397h.fromBundle(bundle2);
        Bundle bundle3 = bundle.getBundle(Integer.toString(2, 36));
        jm1 jm1Var = bundle3 == null ? jm1.H : (jm1) jm1.I.fromBundle(bundle3);
        Bundle bundle4 = bundle.getBundle(Integer.toString(3, 36));
        ul1 ul1Var = bundle4 == null ? ul1.f156495h : (ul1) tl1.f155942g.fromBundle(bundle4);
        Bundle bundle5 = bundle.getBundle(Integer.toString(4, 36));
        return new fm1(string, ul1Var, null, yl1Var, jm1Var, bundle5 == null ? cm1.f147776d : (cm1) cm1.f147777e.fromBundle(bundle5));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fm1)) {
            return false;
        }
        fm1 fm1Var = (fm1) obj;
        return ib3.a(this.f149164b, fm1Var.f149164b) && this.f149168f.equals(fm1Var.f149168f) && ib3.a(this.f149165c, fm1Var.f149165c) && ib3.a(this.f149166d, fm1Var.f149166d) && ib3.a(this.f149167e, fm1Var.f149167e) && ib3.a(this.f149169g, fm1Var.f149169g);
    }

    public final int hashCode() {
        int iHashCode = this.f149164b.hashCode() * 31;
        am1 am1Var = this.f149165c;
        return this.f149169g.hashCode() + ((this.f149167e.hashCode() + ((this.f149168f.hashCode() + ((this.f149166d.hashCode() + ((iHashCode + (am1Var != null ? am1Var.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }

    public static fm1 a(String str) {
        am1 am1Var;
        sl1 sl1Var = new sl1();
        vl1 vl1Var = new vl1();
        List list = Collections.EMPTY_LIST;
        sm2 sm2Var = sm2.f155489f;
        cm1 cm1Var = cm1.f147776d;
        Uri uri = str == null ? null : Uri.parse(str);
        if (vl1Var.f157005b != null && vl1Var.f157004a == null) {
            throw new IllegalStateException();
        }
        wl1 wl1Var = null;
        if (uri != null) {
            if (vl1Var.f157004a != null) {
                wl1Var = new wl1(vl1Var);
            }
            am1Var = new am1(uri, null, wl1Var, list, null, sm2Var, null);
        } else {
            am1Var = null;
        }
        return new fm1("", new ul1(sl1Var), am1Var, new yl1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), jm1.H, cm1Var);
    }
}
