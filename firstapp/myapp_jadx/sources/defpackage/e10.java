package defpackage;

import androidx.compose.foundation.gestures.a;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$animateTo$4", f = "AnchoredDraggable.kt", l = {1342}, m = "invokeSuspend")
public final class e10 extends tje0 implements iaj<t00, n9f<Object>, Object, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ t00 b;
    public /* synthetic */ n9f c;
    public /* synthetic */ Object d;
    public final /* synthetic */ i20<Object> e;
    public final /* synthetic */ xi0<Float> f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e10(i20<Object> i20Var, xi0<Float> xi0Var, v1b<? super e10> v1bVar) {
        super(4, v1bVar);
        this.e = i20Var;
        this.f = xi0Var;
    }

    @Override // defpackage.iaj
    public final Object d(t00 t00Var, n9f<Object> n9fVar, Object obj, v1b<? super Unit> v1bVar) {
        e10 e10Var = new e10(this.e, this.f, v1bVar);
        e10Var.b = t00Var;
        e10Var.c = n9fVar;
        e10Var.d = obj;
        return e10Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            t00 t00Var = this.b;
            n9f n9fVar = this.c;
            Object obj2 = this.d;
            i20<Object> i20Var = this.e;
            float fJ = ((t5a0) i20Var.k).j();
            this.b = null;
            this.c = null;
            this.a = 1;
            if (a.d(i20Var, fJ, t00Var, n9fVar, obj2, this.f, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
