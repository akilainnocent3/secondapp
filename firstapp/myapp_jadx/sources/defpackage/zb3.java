package defpackage;

import com.sportybet.plugin.realsports.betsucc.presentation.fragment.BetSuccessfulPageFragment;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class zb3 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zb3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                BetSuccessfulPageFragment betSuccessfulPageFragment = (BetSuccessfulPageFragment) obj;
                u93 u93Var = betSuccessfulPageFragment.J;
                u93Var.getClass();
                ej5.c(o8i0.d(u93Var), u93Var.e, null, new o93(u93Var, null), 2);
                gym.a(betSuccessfulPageFragment.w, y4y.a);
                return Unit.a;
            case 1:
                zzr zzrVar = (zzr) obj;
                return new Pair(Integer.valueOf(zzrVar.h()), Integer.valueOf(zzrVar.i()));
            default:
                w6g0 w6g0Var = (w6g0) obj;
                Function1<? super Long, Unit> function1 = w6g0Var.c;
                if (function1 != null) {
                    function1.invoke(Long.valueOf(w6g0Var.e));
                }
                return Unit.a;
        }
    }
}
