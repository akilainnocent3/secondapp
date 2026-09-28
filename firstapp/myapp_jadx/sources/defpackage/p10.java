package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$2", f = "AnchoredDraggable.kt", l = {470}, m = "invokeSuspend")
public final class p10 extends tje0 implements gaj<t00, n9f<Object>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ q10<Object> c;
    public final /* synthetic */ aq40 d;
    public final /* synthetic */ float e;

    public static final class a implements tp70 {
        public final /* synthetic */ q10<Object> a;
        public final /* synthetic */ t00 b;

        public a(q10<Object> q10Var, t00 t00Var) {
            this.a = q10Var;
            this.b = t00Var;
        }

        @Override // defpackage.tp70
        public final float e(float f) {
            q10<Object> q10Var = this.a;
            float fD = q10Var.O.d(f);
            float fJ = fD - ((t5a0) q10Var.O.j).j();
            this.b.a(fD, 0.0f);
            return fJ;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p10(q10<Object> q10Var, aq40 aq40Var, float f, v1b<? super p10> v1bVar) {
        super(3, v1bVar);
        this.c = q10Var;
        this.d = aq40Var;
        this.e = f;
    }

    @Override // defpackage.gaj
    public final Object invoke(t00 t00Var, n9f<Object> n9fVar, v1b<? super Unit> v1bVar) {
        aq40 aq40Var = this.d;
        float f = this.e;
        p10 p10Var = new p10(this.c, aq40Var, f, v1bVar);
        p10Var.b = t00Var;
        return p10Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        aq40 aq40Var;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            t00 t00Var = (t00) this.b;
            q10<Object> q10Var = this.c;
            a aVar = new a(q10Var, t00Var);
            svh svhVar = q10Var.S;
            if (svhVar == null) {
                Intrinsics.n("resolvedFlingBehavior");
                throw null;
            }
            aq40 aq40Var2 = this.d;
            this.b = aq40Var2;
            this.a = 1;
            obj = svhVar.a(aVar, this.e, this);
            if (obj == y5bVar) {
                return y5bVar;
            }
            aq40Var = aq40Var2;
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aq40Var = (aq40) this.b;
            uj50.b(obj);
        }
        aq40Var.a = ((Number) obj).floatValue();
        return Unit.a;
    }
}
