package defpackage;

import com.sporty.android.common.uievent.a;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrws;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class rws extends j8i0 {
    public final pws a;
    public final lrm b;
    public final l290 c;
    public final ku90<a> d;
    public final t340 e;
    public final ku90<mws> f;
    public final t340 i;
    public final wwd0 v;
    public final v340 w;
    public final wwd0 y;
    public final v340 z;

    public rws(pws pwsVar, lrm lrmVar, l290 l290Var) {
        lrmVar.getClass();
        this.a = pwsVar;
        this.b = lrmVar;
        this.c = l290Var;
        ku90<a> ku90Var = new ku90<>();
        this.d = ku90Var;
        this.e = e1i.a(ku90Var);
        ku90<mws> ku90Var2 = new ku90<>();
        this.f = ku90Var2;
        this.i = e1i.a(ku90Var2);
        wwd0 wwd0VarA = xwd0.a(tzs.a.a);
        this.v = wwd0VarA;
        this.w = e1i.b(wwd0VarA);
        wwd0 wwd0VarA2 = xwd0.a(null);
        this.y = wwd0VarA2;
        this.z = e1i.b(wwd0VarA2);
    }

    public static /* synthetic */ jvd0 y1(rws rwsVar, String str, g08 g08Var, lws lwsVar, int i) {
        if ((i & 2) != 0) {
            g08Var = g08.UNKNOWN;
        }
        g08 g08Var2 = g08Var;
        if ((i & 16) != 0) {
            lwsVar = lws.a;
        }
        return rwsVar.x1(str, g08Var2, true, false, lwsVar);
    }

    public final jvd0 x1(String str, g08 g08Var, boolean z, boolean z2, lws lwsVar) {
        g08Var.getClass();
        lwsVar.getClass();
        return ej5.c(o8i0.d(this), null, null, new qws(str, this, z, lwsVar, g08Var, z2, null), 3);
    }
}
