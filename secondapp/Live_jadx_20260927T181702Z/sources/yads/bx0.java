package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class bx0 implements dw.p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bx0 f147385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ dw.l2 f147386b;

    static {
        bx0 bx0Var = new bx0();
        f147385a = bx0Var;
        dw.l2 l2Var = new dw.l2("com.monetization.ads.base.model.fonts.FontUrls", bx0Var, 4);
        l2Var.o("regular", false);
        l2Var.o("bold", false);
        l2Var.o("light", false);
        l2Var.o("medium", false);
        f147386b = l2Var;
    }

    @Override // dw.p0
    public final zv.j[] childSerializers() {
        dw.c3 c3Var = dw.c3.f79541a;
        return new zv.j[]{c3Var, c3Var, c3Var, c3Var};
    }

    @Override // zv.e
    public final Object deserialize(cw.f fVar) {
        String strJ;
        String strJ2;
        String str;
        String str2;
        int i10;
        dw.l2 l2Var = f147386b;
        cw.d dVarB = fVar.b(l2Var);
        if (dVarB.h()) {
            strJ = dVarB.J(l2Var, 0);
            String strJ3 = dVarB.J(l2Var, 1);
            String strJ4 = dVarB.J(l2Var, 2);
            strJ2 = dVarB.J(l2Var, 3);
            str = strJ4;
            str2 = strJ3;
            i10 = 15;
        } else {
            strJ = null;
            String strJ5 = null;
            String strJ6 = null;
            String strJ7 = null;
            boolean z10 = true;
            int i11 = 0;
            while (z10) {
                int iZ = dVarB.z(l2Var);
                if (iZ == -1) {
                    z10 = false;
                } else if (iZ == 0) {
                    strJ = dVarB.J(l2Var, 0);
                    i11 |= 1;
                } else if (iZ == 1) {
                    strJ7 = dVarB.J(l2Var, 1);
                    i11 |= 2;
                } else if (iZ == 2) {
                    strJ6 = dVarB.J(l2Var, 2);
                    i11 |= 4;
                } else {
                    if (iZ != 3) {
                        throw new zv.t0(iZ);
                    }
                    strJ5 = dVarB.J(l2Var, 3);
                    i11 |= 8;
                }
            }
            strJ2 = strJ5;
            str = strJ6;
            str2 = strJ7;
            i10 = i11;
        }
        String str3 = strJ;
        dVarB.c(l2Var);
        return new dx0(i10, str3, str2, str, strJ2);
    }

    @Override // zv.j, zv.d0, zv.e
    public final bw.f getDescriptor() {
        return f147386b;
    }

    @Override // zv.d0
    public final void serialize(cw.h hVar, Object obj) {
        dx0 dx0Var = (dx0) obj;
        dw.l2 l2Var = f147386b;
        cw.e eVarB = hVar.b(l2Var);
        eVarB.v(l2Var, 0, dx0Var.f148400a);
        eVarB.v(l2Var, 1, dx0Var.f148401b);
        eVarB.v(l2Var, 2, dx0Var.f148402c);
        eVarB.v(l2Var, 3, dx0Var.f148403d);
        eVarB.c(l2Var);
    }

    @Override // dw.p0
    public final zv.j[] typeParametersSerializers() {
        return dw.p0.a.a(this);
    }
}
