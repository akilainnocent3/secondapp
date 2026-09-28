package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.material3.internal.AnchoredDraggableState$draggableState$1$drag$2", f = "AnchoredDraggable.kt", l = {277}, m = "invokeSuspend")
public final class j20 extends tje0 implements gaj<s00, m9f<Object>, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ k20 b;
    public final /* synthetic */ icf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j20(k20 k20Var, icf icfVar, v1b v1bVar) {
        super(3, v1bVar);
        this.b = k20Var;
        this.c = icfVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(s00 s00Var, m9f<Object> m9fVar, v1b<? super Unit> v1bVar) {
        return new j20(this.b, this.c, v1bVar).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            k20.a aVar = this.b.a;
            this.a = 1;
            if (this.c.invoke(aVar, this) == y5bVar) {
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
