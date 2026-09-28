package defpackage;

import androidx.fragment.app.e;
import com.sportybet.android.globalpay.stp.spei.SpeiByStpDepositFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class eva0 implements Function0<Unit> {
    public final /* synthetic */ SpeiByStpDepositFragment a;

    public eva0(SpeiByStpDepositFragment speiByStpDepositFragment) {
        this.a = speiByStpDepositFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        SpeiByStpDepositFragment speiByStpDepositFragment = this.a;
        d900 d900Var = speiByStpDepositFragment.l0;
        if (d900Var == null) {
            Intrinsics.n("paymentRouter");
            throw null;
        }
        e eVarRequireActivity = speiByStpDepositFragment.requireActivity();
        eVarRequireActivity.getClass();
        d900Var.d(eVarRequireActivity);
        return Unit.a;
    }
}
