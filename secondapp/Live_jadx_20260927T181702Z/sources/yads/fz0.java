package yads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class fz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q80 f149313a;

    public fz0(q80 q80Var) {
        this.f149313a = q80Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(boolean z10, or.f fVar) {
        ez0 ez0Var;
        if (fVar instanceof ez0) {
            ez0Var = (ez0) fVar;
            int i10 = ez0Var.f148890d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                ez0Var.f148890d = i10 - Integer.MIN_VALUE;
            } else {
                ez0Var = new ez0(this, fVar);
            }
        } else {
            ez0Var = new ez0(this, fVar);
        }
        Object objH = ez0Var.f148888b;
        Object objL = qr.d.l();
        int i11 = ez0Var.f148890d;
        if (i11 == 0) {
            dr.j1.n(objH);
            q80 q80Var = this.f149313a;
            ez0Var.f148890d = 1;
            objH = jv.i.h(q80Var.f154346d, new p80(q80Var, z10, null), ez0Var);
            if (objH == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dr.j1.n(objH);
        }
        List<e40> list = ((u50) objH).f156284g;
        ArrayList arrayList = new ArrayList(fr.i0.d0(list, 10));
        for (e40 e40Var : list) {
            arrayList.add(new i40(e40Var.f148491a, e40Var.f148492b, e40Var.f148493c));
        }
        return new v40(arrayList);
    }
}
