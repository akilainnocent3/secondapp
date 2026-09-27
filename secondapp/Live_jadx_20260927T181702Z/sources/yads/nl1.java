package yads;

import android.content.Context;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class nl1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ll1 f153086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jq f153087b;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ nl1(Context context) {
        ll1 ll1VarA = new nm2(context).a();
        this(ll1VarA, new jq(ll1VarA));
    }

    public final kl1 a(List list) {
        Iterator it = list.iterator();
        double d10 = -1.0d;
        kl1 kl1Var = null;
        while (it.hasNext()) {
            kl1 kl1Var2 = (kl1) it.next();
            double d11 = kotlin.jvm.internal.m0.g("video/mp4", kl1Var2.f151590d) ? 1.5d : 1.0d;
            jq jqVar = this.f153087b;
            jqVar.getClass();
            int i10 = kl1Var2.f151595i;
            if (i10 == 0) {
                int i11 = kl1Var2.f151594h * kl1Var2.f151593g;
                ll1 ll1Var = jqVar.f151213a;
                i10 = (int) ((i11 / (ll1Var.f152043a * ll1Var.f152044b)) * ll1Var.f152045c);
            }
            int i12 = this.f153086a.f152045c;
            int iMax = (int) Math.max(0.0d, i10);
            double dAbs = d11 / ((iMax < 100 ? 10.0d : ((double) ((int) Math.abs(i12 - iMax))) / ((double) i12)) + 1.0d);
            if (dAbs > d10) {
                kl1Var = kl1Var2;
                d10 = dAbs;
            }
        }
        return kl1Var;
    }

    public nl1(ll1 ll1Var, jq jqVar) {
        this.f153086a = ll1Var;
        this.f153087b = jqVar;
    }
}
