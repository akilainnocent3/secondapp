package yads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class bh2 implements dw.p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bh2 f147194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ dw.l2 f147195b;

    static {
        bh2 bh2Var = new bh2();
        f147194a = bh2Var;
        dw.l2 l2Var = new dw.l2("com.monetization.ads.base.model.mediation.prefetch.PrefetchedMediationData", bh2Var, 1);
        l2Var.o("prefetched_mediation_data", false);
        f147195b = l2Var;
    }

    @Override // dw.p0
    public final zv.j[] childSerializers() {
        return new zv.j[]{dh2.f148213b[0]};
    }

    @Override // zv.e
    public final Object deserialize(cw.f fVar) {
        List list;
        dw.l2 l2Var = f147195b;
        cw.d dVarB = fVar.b(l2Var);
        zv.j[] jVarArr = dh2.f148213b;
        int i10 = 1;
        List list2 = null;
        if (dVarB.h()) {
            list = (List) dVarB.x(l2Var, 0, jVarArr[0], null);
        } else {
            boolean z10 = true;
            int i11 = 0;
            while (z10) {
                int iZ = dVarB.z(l2Var);
                if (iZ == -1) {
                    z10 = false;
                } else {
                    if (iZ != 0) {
                        throw new zv.t0(iZ);
                    }
                    list2 = (List) dVarB.x(l2Var, 0, jVarArr[0], list2);
                    i11 = 1;
                }
            }
            list = list2;
            i10 = i11;
        }
        dVarB.c(l2Var);
        return new dh2(i10, list);
    }

    @Override // zv.j, zv.d0, zv.e
    public final bw.f getDescriptor() {
        return f147195b;
    }

    @Override // zv.d0
    public final void serialize(cw.h hVar, Object obj) {
        dw.l2 l2Var = f147195b;
        cw.e eVarB = hVar.b(l2Var);
        eVarB.f(l2Var, 0, dh2.f148213b[0], ((dh2) obj).f148214a);
        eVarB.c(l2Var);
    }

    @Override // dw.p0
    public final zv.j[] typeParametersSerializers() {
        return dw.p0.a.a(this);
    }
}
