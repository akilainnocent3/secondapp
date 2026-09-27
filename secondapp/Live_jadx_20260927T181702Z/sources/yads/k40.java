package yads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class k40 implements dw.p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k40 f151382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ dw.l2 f151383b;

    static {
        k40 k40Var = new k40();
        f151382a = k40Var;
        dw.l2 l2Var = new dw.l2("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelAdUnitMediation", k40Var, 2);
        l2Var.o(com.ironsource.mediationsdk.d.f62457h, false);
        l2Var.o("bidding", false);
        f151383b = l2Var;
    }

    @Override // dw.p0
    public final zv.j[] childSerializers() {
        zv.j[] jVarArr = m40.f152314c;
        return new zv.j[]{jVarArr[0], jVarArr[1]};
    }

    @Override // zv.e
    public final Object deserialize(cw.f fVar) {
        int i10;
        List list;
        List list2;
        dw.l2 l2Var = f151383b;
        cw.d dVarB = fVar.b(l2Var);
        zv.j[] jVarArr = m40.f152314c;
        List list3 = null;
        if (dVarB.h()) {
            list = (List) dVarB.x(l2Var, 0, jVarArr[0], null);
            list2 = (List) dVarB.x(l2Var, 1, jVarArr[1], null);
            i10 = 3;
        } else {
            boolean z10 = true;
            int i11 = 0;
            List list4 = null;
            while (z10) {
                int iZ = dVarB.z(l2Var);
                if (iZ == -1) {
                    z10 = false;
                } else if (iZ == 0) {
                    list3 = (List) dVarB.x(l2Var, 0, jVarArr[0], list3);
                    i11 |= 1;
                } else {
                    if (iZ != 1) {
                        throw new zv.t0(iZ);
                    }
                    list4 = (List) dVarB.x(l2Var, 1, jVarArr[1], list4);
                    i11 |= 2;
                }
            }
            i10 = i11;
            list = list3;
            list2 = list4;
        }
        dVarB.c(l2Var);
        return new m40(i10, list, list2);
    }

    @Override // zv.j, zv.d0, zv.e
    public final bw.f getDescriptor() {
        return f151383b;
    }

    @Override // zv.d0
    public final void serialize(cw.h hVar, Object obj) {
        m40 m40Var = (m40) obj;
        dw.l2 l2Var = f151383b;
        cw.e eVarB = hVar.b(l2Var);
        zv.j[] jVarArr = m40.f152314c;
        eVarB.f(l2Var, 0, jVarArr[0], m40Var.f152315a);
        eVarB.f(l2Var, 1, jVarArr[1], m40Var.f152316b);
        eVarB.c(l2Var);
    }

    @Override // dw.p0
    public final zv.j[] typeParametersSerializers() {
        return dw.p0.a.a(this);
    }
}
