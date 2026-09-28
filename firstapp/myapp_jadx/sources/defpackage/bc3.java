package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.compose.ui.platform.ComposeView;
import com.sportybet.plugin.realsports.betsucc.presentation.fragment.BetSuccessfulPageFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class bc3 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bc3(Object obj, int i) {
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
                gym.a(betSuccessfulPageFragment.w, w4y.a);
                break;
            default:
                Intent intent = new Intent("cashoutCall");
                intent.putExtra("betIndex", 1);
                Context context = ((ComposeView) obj).getContext();
                if (context != null) {
                    fdt.a(context).c(intent);
                }
                break;
        }
        return Unit.a;
    }
}
