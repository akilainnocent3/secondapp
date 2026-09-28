package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.compose.ui.platform.ComposeView;
import com.sportybet.plugin.realsports.betslip.widget.BetslipActivity;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class yi3 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yi3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                BetslipActivity betslipActivity = (BetslipActivity) obj;
                Set<g08> set = BetslipActivity.X2;
                fb1 fb1Var = (fb1) betslipActivity.b1.getValue();
                y81 y81Var = y81.a;
                y81Var.getClass();
                ej5.c(o8i0.d(fb1Var), fb1Var.a, null, new vb1(fb1Var, y81Var, null), 2);
                betslipActivity.u4();
                break;
            case 1:
                ((Function0) obj).invoke();
                break;
            case 2:
                ((Function1) obj).invoke(vg8.a.a);
                break;
            default:
                Intent intent = new Intent("cashoutCall");
                intent.putExtra("betIndex", 2);
                Context context = ((ComposeView) obj).getContext();
                if (context != null) {
                    fdt.a(context).c(intent);
                }
                break;
        }
        return Unit.a;
    }
}
