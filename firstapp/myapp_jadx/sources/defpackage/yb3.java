package defpackage;

import com.sportybet.plugin.realsports.betsucc.presentation.fragment.BetSuccessfulPageFragment;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class yb3 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yb3(Object obj, int i) {
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
                betSuccessfulPageFragment.o0(BetSuccessfulPageFragment.b.a);
                gym.a(betSuccessfulPageFragment.w, v4y.a);
                return Unit.a;
            case 1:
                zzr zzrVar = (zzr) obj;
                return new Pair(Boolean.valueOf(zzrVar.i.c()), Boolean.valueOf(zzrVar.h() == 0 && zzrVar.i() == 0));
            default:
                w6g0 w6g0Var = (w6g0) obj;
                if (!w6g0Var.isRemoving()) {
                    w6g0Var.getParentFragmentManager().Y();
                }
                return Unit.a;
        }
    }
}
