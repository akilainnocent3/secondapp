package defpackage;

import com.sportybet.android.widget.BubbleView;
import com.sportybet.feature.payment.impl.security.nameupdate.presentation.activity.NameMismatchCSActivity;
import com.sportybet.feature.playTimeControlDialog.PlayTimeControlDialogActivity;
import com.sportybet.plugin.realsports.home.LivePanel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class o5e implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o5e(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((d900) ((p5e) obj).z0()).b.e(wae.ME_TRANSACTIONS, vj5.a(new Pair("key_param_tx_category", Integer.valueOf(aqg0.e.c.a))));
                return Unit.a;
            case 1:
                djh djhVar = ((u6j) obj).b;
                if (djhVar != null) {
                    djhVar.H.setVisibility(0);
                }
                return Unit.a;
            case 2:
                int i2 = LivePanel.c0;
                gby.b(((BubbleView) obj).getDescriptionView().getContext());
                return Unit.a;
            case 3:
                NameMismatchCSActivity nameMismatchCSActivity = (NameMismatchCSActivity) obj;
                int i3 = NameMismatchCSActivity.c;
                d900 d900Var = nameMismatchCSActivity.b;
                if (d900Var == null) {
                    Intrinsics.n("paymentRouter");
                    throw null;
                }
                d900Var.b.d(wae.HOME);
                nameMismatchCSActivity.finish();
                return Unit.a;
            default:
                int i4 = PlayTimeControlDialogActivity.c;
                sh8.c().e(o7d.a(wae.WITHDRAW));
                ((PlayTimeControlDialogActivity) obj).finish();
                return Unit.a;
        }
    }
}
