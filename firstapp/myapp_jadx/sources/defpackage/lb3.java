package defpackage;

import android.net.Uri;
import androidx.compose.runtime.a;
import com.sportybet.plugin.realsports.betsucc.presentation.fragment.BetSuccessfulPageFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class lb3 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                BetSuccessfulPageFragment betSuccessfulPageFragment = (BetSuccessfulPageFragment) obj3;
                jmh0 jmh0Var = (jmh0) obj2;
                String str = jmh0Var.e;
                betSuccessfulPageFragment.G.a(new qxj(jmh0Var.b, ((Integer) obj).intValue(), jmh0Var.f, jmh0Var.d), k00.c, k00.d);
                if (str != null) {
                    betSuccessfulPageFragment.E.l(Uri.parse(str), null);
                    betSuccessfulPageFragment.dismissAllowingStateLoss();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                voq.e((es1) obj3, (a) obj, qj40.a(7));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ lb3(BetSuccessfulPageFragment betSuccessfulPageFragment) {
        this.b = betSuccessfulPageFragment;
    }
}
