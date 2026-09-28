package defpackage;

import androidx.fragment.app.e;
import com.sportybet.feature.luckynumber.winningpopup.presentation.LNWinningPopupActivity;
import com.sportybet.feature.luckynumber.winningpopup.presentation.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class r64 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r64(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                t64 t64Var = (t64) obj;
                azm azmVar = t64Var.f;
                if (azmVar == null) {
                    Intrinsics.n("router");
                    throw null;
                }
                azmVar.d(wae.HOME);
                e activity = t64Var.getActivity();
                if (activity != null) {
                    activity.finish();
                }
                return Unit.a;
            default:
                int i2 = LNWinningPopupActivity.d;
                ((LNWinningPopupActivity) obj).z1().x1(a.C0411a.a);
                return Unit.a;
        }
    }
}
