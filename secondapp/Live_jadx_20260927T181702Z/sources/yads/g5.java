package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class g5 implements dw.p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g5 f149397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ dw.l2 f149398b;

    static {
        g5 g5Var = new g5();
        f149397a = g5Var;
        dw.l2 l2Var = new dw.l2("com.monetization.ads.common.AdImpressionData", g5Var, 1);
        l2Var.o("rawData", false);
        f149398b = l2Var;
    }

    @Override // dw.p0
    public final zv.j[] childSerializers() {
        return new zv.j[]{dw.c3.f79541a};
    }

    @Override // zv.e
    public final Object deserialize(cw.f fVar) {
        String strJ;
        dw.l2 l2Var = f149398b;
        cw.d dVarB = fVar.b(l2Var);
        int i10 = 1;
        if (dVarB.h()) {
            strJ = dVarB.J(l2Var, 0);
        } else {
            strJ = null;
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
                    strJ = dVarB.J(l2Var, 0);
                    i11 = 1;
                }
            }
            i10 = i11;
        }
        dVarB.c(l2Var);
        return new j5(i10, strJ);
    }

    @Override // zv.j, zv.d0, zv.e
    public final bw.f getDescriptor() {
        return f149398b;
    }

    @Override // zv.d0
    public final void serialize(cw.h hVar, Object obj) {
        dw.l2 l2Var = f149398b;
        cw.e eVarB = hVar.b(l2Var);
        eVarB.v(l2Var, 0, ((j5) obj).f150935b);
        eVarB.c(l2Var);
    }

    @Override // dw.p0
    public final zv.j[] typeParametersSerializers() {
        return dw.p0.a.a(this);
    }
}
