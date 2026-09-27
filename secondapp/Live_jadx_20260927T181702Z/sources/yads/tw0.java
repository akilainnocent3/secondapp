package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class tw0 implements dw.p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tw0 f156096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ dw.l2 f156097b;

    static {
        tw0 tw0Var = new tw0();
        f156096a = tw0Var;
        dw.l2 l2Var = new dw.l2("com.monetization.ads.base.model.fonts.FontParameters", tw0Var, 1);
        l2Var.o("urls", false);
        f156097b = l2Var;
    }

    @Override // dw.p0
    public final zv.j[] childSerializers() {
        return new zv.j[]{aw.a.v(bx0.f147385a)};
    }

    @Override // zv.e
    public final Object deserialize(cw.f fVar) {
        dx0 dx0Var;
        dw.l2 l2Var = f156097b;
        cw.d dVarB = fVar.b(l2Var);
        int i10 = 1;
        dx0 dx0Var2 = null;
        if (dVarB.h()) {
            dx0Var = (dx0) dVarB.u(l2Var, 0, bx0.f147385a, null);
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
                    dx0Var2 = (dx0) dVarB.u(l2Var, 0, bx0.f147385a, dx0Var2);
                    i11 = 1;
                }
            }
            dx0Var = dx0Var2;
            i10 = i11;
        }
        dVarB.c(l2Var);
        return new vw0(i10, dx0Var);
    }

    @Override // zv.j, zv.d0, zv.e
    public final bw.f getDescriptor() {
        return f156097b;
    }

    @Override // zv.d0
    public final void serialize(cw.h hVar, Object obj) {
        dw.l2 l2Var = f156097b;
        cw.e eVarB = hVar.b(l2Var);
        eVarB.i(l2Var, 0, bx0.f147385a, ((vw0) obj).f157104a);
        eVarB.c(l2Var);
    }

    @Override // dw.p0
    public final zv.j[] typeParametersSerializers() {
        return dw.p0.a.a(this);
    }
}
