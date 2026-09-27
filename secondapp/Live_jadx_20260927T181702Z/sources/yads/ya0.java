package yads;

import android.content.Context;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ya0 implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final db0 f158209a;

    public ya0(db0 db0Var) {
        this.f158209a = db0Var;
    }

    @Override // yads.o0
    public final /* bridge */ /* synthetic */ Object a(View view, m0 m0Var, u0 u0Var) {
        return a(view, (wa0) m0Var, (or.f) u0Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(View view, wa0 wa0Var, or.f fVar) {
        xa0 xa0Var;
        if (fVar instanceof xa0) {
            xa0Var = (xa0) fVar;
            int i10 = xa0Var.f157761d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                xa0Var.f157761d = i10 - Integer.MIN_VALUE;
            } else {
                xa0Var = new xa0(this, fVar);
            }
        } else {
            xa0Var = new xa0(this, fVar);
        }
        Object objA = xa0Var.f157759b;
        Object objL = qr.d.l();
        int i11 = xa0Var.f157761d;
        if (i11 == 0) {
            dr.j1.n(objA);
            Context context = view.getContext();
            db0 db0Var = this.f158209a;
            xa0Var.f157761d = 1;
            objA = db0Var.a(context, wa0Var, xa0Var);
            if (objA == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dr.j1.n(objA);
        }
        return new o01(true, (sg2) objA);
    }
}
