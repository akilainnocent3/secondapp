package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.userfeedback.feedbackform.FeedbackFormViewModel$submit$2", f = "FeedbackFormViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class yhh extends tje0 implements Function2<lk50<? extends Unit>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ zhh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yhh(zhh zhhVar, v1b<? super yhh> v1bVar) {
        super(2, v1bVar);
        this.b = zhhVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        yhh yhhVar = new yhh(this.b, v1bVar);
        yhhVar.a = obj;
        return yhhVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends Unit> lk50Var, v1b<? super Unit> v1bVar) {
        return ((yhh) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean z = lk50Var instanceof lk50.a;
        zhh zhhVar = this.b;
        if (z) {
            wwd0 wwd0Var = zhhVar.b;
            do {
                value2 = wwd0Var.getValue();
            } while (!wwd0Var.g(value2, whh.a((whh) value2, null, null, uxs.ENABLE, null, false, new xgh.d(((lk50.a) lk50Var).b), 59)));
        } else if (Intrinsics.g(lk50Var, lk50.b.a)) {
            wwd0 wwd0Var2 = zhhVar.b;
            do {
                value = wwd0Var2.getValue();
            } while (!wwd0Var2.g(value, whh.a((whh) value, null, null, uxs.LOADING, null, false, null, 123)));
        } else {
            if (!(lk50Var instanceof lk50.c)) {
                uhc.a();
                return null;
            }
            ku90<chh> ku90Var = zhhVar.d;
            ku90Var.a.a(chh.c.a);
        }
        return Unit.a;
    }
}
