package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class oh2 implements dw.p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final oh2 f153499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ dw.l2 f153500b;

    static {
        oh2 oh2Var = new oh2();
        f153499a = oh2Var;
        dw.l2 l2Var = new dw.l2("com.monetization.ads.base.model.mediation.prefetch.PrefetchedMediationNetworkWinner", oh2Var, 2);
        l2Var.o("name", false);
        l2Var.o("network_ad_unit", false);
        f153500b = l2Var;
    }

    @Override // dw.p0
    public final zv.j[] childSerializers() {
        dw.c3 c3Var = dw.c3.f79541a;
        return new zv.j[]{c3Var, c3Var};
    }

    @Override // zv.e
    public final Object deserialize(cw.f fVar) {
        String strJ;
        String strJ2;
        int i10;
        dw.l2 l2Var = f153500b;
        cw.d dVarB = fVar.b(l2Var);
        if (dVarB.h()) {
            strJ = dVarB.J(l2Var, 0);
            strJ2 = dVarB.J(l2Var, 1);
            i10 = 3;
        } else {
            strJ = null;
            String strJ3 = null;
            boolean z10 = true;
            int i11 = 0;
            while (z10) {
                int iZ = dVarB.z(l2Var);
                if (iZ == -1) {
                    z10 = false;
                } else if (iZ == 0) {
                    strJ = dVarB.J(l2Var, 0);
                    i11 |= 1;
                } else {
                    if (iZ != 1) {
                        throw new zv.t0(iZ);
                    }
                    strJ3 = dVarB.J(l2Var, 1);
                    i11 |= 2;
                }
            }
            strJ2 = strJ3;
            i10 = i11;
        }
        dVarB.c(l2Var);
        return new qh2(i10, strJ, strJ2);
    }

    @Override // zv.j, zv.d0, zv.e
    public final bw.f getDescriptor() {
        return f153500b;
    }

    @Override // zv.d0
    public final void serialize(cw.h hVar, Object obj) {
        qh2 qh2Var = (qh2) obj;
        dw.l2 l2Var = f153500b;
        cw.e eVarB = hVar.b(l2Var);
        eVarB.v(l2Var, 0, qh2Var.f154466a);
        eVarB.v(l2Var, 1, qh2Var.f154467b);
        eVarB.c(l2Var);
    }

    @Override // dw.p0
    public final zv.j[] typeParametersSerializers() {
        return dw.p0.a.a(this);
    }
}
