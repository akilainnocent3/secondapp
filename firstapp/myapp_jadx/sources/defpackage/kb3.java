package defpackage;

import com.sportybet.plugin.realsports.betsucc.presentation.fragment.BetSuccessfulPageFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class kb3 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kb3(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                BetSuccessfulPageFragment betSuccessfulPageFragment = (BetSuccessfulPageFragment) obj2;
                boolean z = ((jj40) obj) instanceof jj40.b;
                rdd0 rdd0Var = betSuccessfulPageFragment.G;
                if (z) {
                    rdd0Var.a(rxj.a, k00.c, k00.d);
                } else {
                    rdd0Var.a(sxj.a, k00.c, k00.d);
                }
                tch tchVar = betSuccessfulPageFragment.K;
                tchVar.getClass();
                ej5.c(o8i0.d(tchVar), null, null, new xch(null, tchVar), 3);
                break;
            default:
                ((Function1) obj2).invoke(((pt00) obj).a);
                break;
        }
        return Unit.a;
    }
}
