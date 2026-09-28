package defpackage;

import android.app.Dialog;
import com.sportybet.plugin.realsports.betsucc.presentation.fragment.BetSuccessfulPageFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ka3 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ka3(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Dialog e3yVar;
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                BetSuccessfulPageFragment betSuccessfulPageFragment = (BetSuccessfulPageFragment) obj3;
                BetSuccessfulPageFragment.b bVar = (BetSuccessfulPageFragment.b) obj2;
                if (((Boolean) obj).booleanValue()) {
                    String strG = betSuccessfulPageFragment.B.g("android_notification_optimization_version");
                    if ("B".equals(strG)) {
                        gym.a(betSuccessfulPageFragment.w, z4y.a);
                        e3yVar = new z2y(r0b.d(betSuccessfulPageFragment.requireContext()), betSuccessfulPageFragment.requireActivity(), new xb3(betSuccessfulPageFragment), new yb3(betSuccessfulPageFragment, 0));
                    } else if (!"D".equals(strG)) {
                        betSuccessfulPageFragment.o0(bVar);
                    } else {
                        gym.a(betSuccessfulPageFragment.w, a5y.a);
                        e3yVar = new e3y(r0b.d(betSuccessfulPageFragment.requireContext()), betSuccessfulPageFragment.requireActivity(), new zb3(betSuccessfulPageFragment, 0), new bc3(betSuccessfulPageFragment, 0));
                    }
                    e3yVar.show();
                } else {
                    betSuccessfulPageFragment.o0(bVar);
                }
                break;
            default:
                Function0 function0 = (Function0) obj2;
                if (!((j590) obj3).e()) {
                    function0.invoke();
                }
                break;
        }
        return Unit.a;
    }
}
