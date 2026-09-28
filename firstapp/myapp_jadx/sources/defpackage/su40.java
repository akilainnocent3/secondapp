package defpackage;

import com.sporty.android.sportynews.ui.SportyNewsVideoDetailFragment;
import com.sportybet.feature.payment.impl.transaction.presentation.activity.TxDetailsV2Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class su40 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ su40(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function1) obj).invoke(o6z.g.a);
                return Unit.a;
            case 1:
                ohp<Object>[] ohpVarArr = SportyNewsVideoDetailFragment.X;
                return ((muc0) ((SportyNewsVideoDetailFragment) obj).y.getValue()).a;
            default:
                TxDetailsV2Activity txDetailsV2Activity = (TxDetailsV2Activity) obj;
                int i2 = TxDetailsV2Activity.v;
                azm azmVar = txDetailsV2Activity.b;
                if (azmVar == null) {
                    Intrinsics.n("router");
                    throw null;
                }
                azmVar.d(wae.HOME);
                wc.a(txDetailsV2Activity);
                return Unit.a;
        }
    }
}
