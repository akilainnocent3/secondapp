package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNBetListViewKt$LNBetListView$2$1", f = "LNBetListView.kt", l = {}, m = "invokeSuspend", v = 2)
public final class zzp extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ l38 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzp(l38 l38Var, v1b<? super zzp> v1bVar) {
        super(2, v1bVar);
        this.a = l38Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new zzp(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((zzp) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        l38 l38Var = this.a;
        isw iswVar = l38Var.c;
        u5a0 u5a0Var = (u5a0) l38Var.b;
        if (u5a0Var.D() != 0) {
            ((t5a0) iswVar).A(f.d(((t5a0) iswVar).j(), -u5a0Var.D(), 0.0f));
        }
        return Unit.a;
    }
}
