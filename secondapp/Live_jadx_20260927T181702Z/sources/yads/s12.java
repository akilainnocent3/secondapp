package yads;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class s12 implements j72 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fy1 f155224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l12 f155225b;

    public s12(fy1 fy1Var) {
        this.f155224a = fy1Var;
    }

    @Override // yads.j72
    public final void a(l12 l12Var) {
        l12Var.a();
    }

    @Override // yads.j72
    public final void a(l12 l12Var, gv gvVar) {
        this.f155225b = l12Var;
        fy1 fy1Var = this.f155224a;
        vb vbVar = new vb(l12Var, gvVar, fy1Var.f149301e, new hl3());
        for (oi oiVar : fy1Var.f149298b) {
            pi piVarA = l12Var.a(oiVar);
            if (!androidx.activity.k0.a(piVarA)) {
                piVarA = null;
            }
            if (piVarA != null) {
                piVarA.c(oiVar.f153503c);
                kotlin.jvm.internal.m0.n(oiVar, "null cannot be cast to non-null type com.monetization.ads.network.model.Asset<kotlin.Any?>");
                piVarA.a(oiVar, vbVar);
            }
        }
        lm2 lm2Var = l12Var.f151835c.f158100e;
        ns.o oVar = y12.f158095g[4];
        List list = (List) lm2Var.f152056a.get();
        if (list != null) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
        }
    }

    @Override // yads.j72
    public final void a() {
        l12 l12Var = this.f155225b;
        if (l12Var != null) {
            for (oi oiVar : this.f155224a.f149298b) {
                pi piVarA = l12Var.a(oiVar);
                if (piVarA instanceof pf0) {
                    ((pf0) piVarA).b(oiVar.f153503c);
                }
            }
        }
    }
}
