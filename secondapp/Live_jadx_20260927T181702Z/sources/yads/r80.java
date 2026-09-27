package yads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class r80 implements dw.p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r80 f154811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ dw.l2 f154812b;

    static {
        r80 r80Var = new r80();
        f154811a = r80Var;
        dw.l2 l2Var = new dw.l2("com.yandex.mobile.ads.features.debugpanel.data.local.model.DebugPanelSdkData", r80Var, 3);
        l2Var.o("version", false);
        l2Var.o("is_integrated", false);
        l2Var.o("integration_messages", false);
        f154812b = l2Var;
    }

    @Override // dw.p0
    public final zv.j[] childSerializers() {
        return new zv.j[]{dw.c3.f79541a, dw.i.f79576a, t80.f155753d[2]};
    }

    @Override // zv.e
    public final Object deserialize(cw.f fVar) {
        int i10;
        boolean zG;
        String strJ;
        List list;
        dw.l2 l2Var = f154812b;
        cw.d dVarB = fVar.b(l2Var);
        zv.j[] jVarArr = t80.f155753d;
        if (dVarB.h()) {
            strJ = dVarB.J(l2Var, 0);
            zG = dVarB.G(l2Var, 1);
            list = (List) dVarB.x(l2Var, 2, jVarArr[2], null);
            i10 = 7;
        } else {
            boolean z10 = true;
            int i11 = 0;
            String strJ2 = null;
            List list2 = null;
            boolean zG2 = false;
            while (z10) {
                int iZ = dVarB.z(l2Var);
                if (iZ == -1) {
                    z10 = false;
                } else if (iZ == 0) {
                    strJ2 = dVarB.J(l2Var, 0);
                    i11 |= 1;
                } else if (iZ == 1) {
                    zG2 = dVarB.G(l2Var, 1);
                    i11 |= 2;
                } else {
                    if (iZ != 2) {
                        throw new zv.t0(iZ);
                    }
                    list2 = (List) dVarB.x(l2Var, 2, jVarArr[2], list2);
                    i11 |= 4;
                }
            }
            i10 = i11;
            zG = zG2;
            strJ = strJ2;
            list = list2;
        }
        dVarB.c(l2Var);
        return new t80(i10, strJ, zG, list);
    }

    @Override // zv.j, zv.d0, zv.e
    public final bw.f getDescriptor() {
        return f154812b;
    }

    @Override // zv.d0
    public final void serialize(cw.h hVar, Object obj) {
        t80 t80Var = (t80) obj;
        dw.l2 l2Var = f154812b;
        cw.e eVarB = hVar.b(l2Var);
        zv.j[] jVarArr = t80.f155753d;
        eVarB.v(l2Var, 0, t80Var.f155754a);
        eVarB.B(l2Var, 1, t80Var.f155755b);
        eVarB.f(l2Var, 2, jVarArr[2], t80Var.f155756c);
        eVarB.c(l2Var);
    }

    @Override // dw.p0
    public final zv.j[] typeParametersSerializers() {
        return dw.p0.a.a(this);
    }
}
