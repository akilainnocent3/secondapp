package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class yh2 implements dw.p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yh2 f158320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ dw.l2 f158321b;

    static {
        yh2 yh2Var = new yh2();
        f158320a = yh2Var;
        dw.l2 l2Var = new dw.l2("com.monetization.ads.base.model.mediation.prefetch.PrefetchedMediationResult", yh2Var, 3);
        l2Var.o("status", false);
        l2Var.o("error_message", false);
        l2Var.o("status_code", false);
        f158321b = l2Var;
    }

    @Override // dw.p0
    public final zv.j[] childSerializers() {
        return new zv.j[]{ai2.f146818d[0], aw.a.v(dw.c3.f79541a), aw.a.v(dw.y0.f79707a)};
    }

    @Override // zv.e
    public final Object deserialize(cw.f fVar) {
        int i10;
        di2 di2Var;
        String str;
        Integer num;
        dw.l2 l2Var = f158321b;
        cw.d dVarB = fVar.b(l2Var);
        zv.j[] jVarArr = ai2.f146818d;
        di2 di2Var2 = null;
        if (dVarB.h()) {
            di2Var = (di2) dVarB.x(l2Var, 0, jVarArr[0], null);
            str = (String) dVarB.u(l2Var, 1, dw.c3.f79541a, null);
            num = (Integer) dVarB.u(l2Var, 2, dw.y0.f79707a, null);
            i10 = 7;
        } else {
            boolean z10 = true;
            int i11 = 0;
            String str2 = null;
            Integer num2 = null;
            while (z10) {
                int iZ = dVarB.z(l2Var);
                if (iZ == -1) {
                    z10 = false;
                } else if (iZ == 0) {
                    di2Var2 = (di2) dVarB.x(l2Var, 0, jVarArr[0], di2Var2);
                    i11 |= 1;
                } else if (iZ == 1) {
                    str2 = (String) dVarB.u(l2Var, 1, dw.c3.f79541a, str2);
                    i11 |= 2;
                } else {
                    if (iZ != 2) {
                        throw new zv.t0(iZ);
                    }
                    num2 = (Integer) dVarB.u(l2Var, 2, dw.y0.f79707a, num2);
                    i11 |= 4;
                }
            }
            i10 = i11;
            di2Var = di2Var2;
            str = str2;
            num = num2;
        }
        dVarB.c(l2Var);
        return new ai2(i10, di2Var, str, num);
    }

    @Override // zv.j, zv.d0, zv.e
    public final bw.f getDescriptor() {
        return f158321b;
    }

    @Override // zv.d0
    public final void serialize(cw.h hVar, Object obj) {
        ai2 ai2Var = (ai2) obj;
        dw.l2 l2Var = f158321b;
        cw.e eVarB = hVar.b(l2Var);
        eVarB.f(l2Var, 0, ai2.f146818d[0], ai2Var.f146819a);
        eVarB.i(l2Var, 1, dw.c3.f79541a, ai2Var.f146820b);
        eVarB.i(l2Var, 2, dw.y0.f79707a, ai2Var.f146821c);
        eVarB.c(l2Var);
    }

    @Override // dw.p0
    public final zv.j[] typeParametersSerializers() {
        return dw.p0.a.a(this);
    }
}
