package defpackage;

import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.platform.features.newotp.util.a;
import com.sportybet.android.instantwin.newtork.model.error.ErrorCode;
import kotlin.Metadata;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lp9g;", "Lj8i0;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class p9g extends j8i0 {
    public final t340 A;
    public final o2k a;
    public final byz b;
    public final ige c;
    public final psm d;
    public final a e;
    public final rdd0 f;
    public final dge i;
    public final String v;
    public final wwd0 w;
    public final v340 y;
    public final ku90<e9g> z;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public p9g(o2k o2kVar, byz byzVar, ige igeVar, psm psmVar, a aVar, vu60 vu60Var, rdd0 rdd0Var) {
        byzVar.getClass();
        igeVar.getClass();
        psmVar.getClass();
        vu60Var.getClass();
        rdd0Var.getClass();
        this.a = o2kVar;
        this.b = byzVar;
        this.c = igeVar;
        this.d = psmVar;
        this.e = aVar;
        this.f = rdd0Var;
        String str = (String) vu60Var.b("action");
        dge dgeVar = null;
        if (str != null) {
            switch (str.hashCode()) {
                case -1044083128:
                    if (str.equals("block_device")) {
                        dgeVar = dge.a.a;
                    }
                    break;
                case -262957397:
                    if (str.equals("logout_device")) {
                        dgeVar = dge.b.a;
                    }
                    break;
                case 1259811001:
                    if (str.equals("logout_other_devices")) {
                        dgeVar = dge.c.a;
                    }
                    break;
                case 2020507489:
                    if (str.equals("unblock_device")) {
                        dgeVar = dge.d.a;
                    }
                    break;
            }
        }
        this.i = dgeVar;
        this.v = (String) vu60Var.b("deviceId");
        wwd0 wwd0VarA = xwd0.a(new h9g(0));
        this.w = wwd0VarA;
        this.y = e1i.b(wwd0VarA);
        ku90<e9g> ku90Var = new ku90<>();
        this.z = ku90Var;
        this.A = e1i.a(ku90Var);
    }

    public final void x1(c9g c9gVar) {
        if (c9gVar instanceof c9g.a) {
            ej5.c(o8i0.d(this), null, null, new i9g(this, ((c9g.a) c9gVar).a, null), 3);
        } else if (!(c9gVar instanceof c9g.b)) {
            uhc.a();
        } else {
            ej5.c(o8i0.d(this), null, null, new l9g(this, ((c9g.b) c9gVar).a, null), 3);
        }
    }

    public final void y1(lk50.a aVar) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        SprThrowable sprThrowableH = bm50.h(aVar);
        wwd0 wwd0Var = this.w;
        if (sprThrowableH == null) {
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, h9g.a((h9g) value, null, null, null, uxs.ENABLE, false, new d9g.a(vch0.b), 23)));
            return;
        }
        int d = sprThrowableH.getD();
        if (b.k(Integer.valueOf(ErrorCode.INVALID), 18300, 18301, 18303).contains(Integer.valueOf(d))) {
            do {
                value4 = wwd0Var.getValue();
            } while (!wwd0Var.g(value4, h9g.a((h9g) value4, null, null, sprThrowableH.b(), uxs.ENABLE, false, null, 51)));
        } else if (d == 18302) {
            do {
                value3 = wwd0Var.getValue();
            } while (!wwd0Var.g(value3, h9g.a((h9g) value3, null, null, sprThrowableH.b(), uxs.DISABLE, false, null, 51)));
        } else {
            do {
                value2 = wwd0Var.getValue();
            } while (!wwd0Var.g(value2, h9g.a((h9g) value2, null, null, null, uxs.ENABLE, false, new d9g.a(sprThrowableH.b()), 23)));
        }
    }
}
