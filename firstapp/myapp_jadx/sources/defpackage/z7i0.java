package defpackage;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.core.view.ViewKt$allViews$1", f = "View.kt", l = {410, 412}, m = "invokeSuspend")
public final class z7i0 extends ji50 implements Function2<wc80<? super View>, v1b<? super Unit>, Object> {
    public int b;
    public /* synthetic */ Object c;
    final /* synthetic */ View d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z7i0(View view, v1b<? super z7i0> v1bVar) {
        super(2, v1bVar);
        this.d = view;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        z7i0 z7i0Var = new z7i0(this.d, v1bVar);
        z7i0Var.c = obj;
        return z7i0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(wc80<? super View> wc80Var, v1b<? super Unit> v1bVar) {
        return ((z7i0) create(wc80Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.b;
        if (i == 0) {
            uj50.b(obj);
            wc80 wc80Var = (wc80) this.c;
            View view = this.d;
            this.c = wc80Var;
            this.b = 1;
            wc80Var.b(this, view);
            return y5bVar;
        }
        if (i == 1) {
            wc80 wc80Var2 = (wc80) this.c;
            uj50.b(obj);
            View view2 = this.d;
            if (view2 instanceof ViewGroup) {
                this.c = null;
                this.b = 2;
                wc80Var2.getClass();
                if (wc80Var2.c(new vvg0(new t7i0((ViewGroup) view2), s7i0.a), this) == y5bVar) {
                    return y5bVar;
                }
            }
        } else {
            if (i != 2) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
