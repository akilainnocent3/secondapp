package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class la0 implements dw.p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final la0 f151910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ dw.l2 f151911b;

    static {
        la0 la0Var = new la0();
        f151910a = la0Var;
        dw.l2 l2Var = new dw.l2("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelWaterfallParameter", la0Var, 2);
        l2Var.o("name", false);
        l2Var.o("value", false);
        f151911b = l2Var;
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
        dw.l2 l2Var = f151911b;
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
        return new na0(i10, strJ, strJ2);
    }

    @Override // zv.j, zv.d0, zv.e
    public final bw.f getDescriptor() {
        return f151911b;
    }

    @Override // zv.d0
    public final void serialize(cw.h hVar, Object obj) {
        na0 na0Var = (na0) obj;
        dw.l2 l2Var = f151911b;
        cw.e eVarB = hVar.b(l2Var);
        eVarB.v(l2Var, 0, na0Var.f152957a);
        eVarB.v(l2Var, 1, na0Var.f152958b);
        eVarB.c(l2Var);
    }

    @Override // dw.p0
    public final zv.j[] typeParametersSerializers() {
        return dw.p0.a.a(this);
    }
}
