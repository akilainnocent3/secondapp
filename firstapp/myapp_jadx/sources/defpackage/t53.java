package defpackage;

import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.BetSlipTrackingViewModel$observeInsureMoreVisibilityEvent$1", f = "BetSlipTrackingViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class t53 extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
    public /* synthetic */ boolean a;
    public final /* synthetic */ u53 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t53(u53 u53Var, v1b<? super t53> v1bVar) {
        super(2, v1bVar);
        this.b = u53Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        t53 t53Var = new t53(this.b, v1bVar);
        t53Var.a = ((Boolean) obj).booleanValue();
        return t53Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((t53) create(bool2, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        u53 u53Var = this.b;
        if (u53Var.c && z) {
            v03.h0 h0Var = v03.h0.a;
            List listK = b.k(k00.d, k00.c);
            rdd0 rdd0Var = u53Var.a;
            k00[] k00VarArr = (k00[]) listK.toArray(new k00[0]);
            rdd0Var.a(h0Var, (k00[]) Arrays.copyOf(k00VarArr, k00VarArr.length));
            u53Var.c = false;
        }
        return Unit.a;
    }
}
