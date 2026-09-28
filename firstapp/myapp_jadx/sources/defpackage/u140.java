package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.android.limits.reached.compose.ReachedLimitsDialogKt$ReachedLimitsDialog$7$1", f = "ReachedLimitsDialog.kt", l = {}, m = "invokeSuspend", v = 2)
public final class u140 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ c240 a;
    public final /* synthetic */ List<c140> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public u140(c240 c240Var, List<? extends c140> list, v1b<? super u140> v1bVar) {
        super(2, v1bVar);
        this.a = c240Var;
        this.b = list;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new u140(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((u140) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        List<c140> list = this.b;
        list.getClass();
        boolean zIsEmpty = list.isEmpty();
        c240 c240Var = this.a;
        if (zIsEmpty) {
            ej5.c(o8i0.d(c240Var), null, null, new z140(c240Var, null), 3);
        } else {
            wwd0 wwd0Var = c240Var.a;
            do {
                value = wwd0Var.getValue();
                ((y140) value).getClass();
            } while (!wwd0Var.g(value, new y140(list)));
            wwd0 wwd0Var2 = c240Var.i;
            do {
                value2 = wwd0Var2.getValue();
                ((Boolean) value2).getClass();
            } while (!wwd0Var2.g(value2, Boolean.FALSE));
        }
        return Unit.a;
    }
}
