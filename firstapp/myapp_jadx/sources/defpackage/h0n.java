package defpackage;

import androidx.compose.animation.d;
import androidx.compose.animation.g;
import com.sportybet.feature.luckynumber.winningpopup.presentation.LNWinningPopupActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class h0n implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return Integer.valueOf(((Integer) obj).intValue() / 2);
            case 1:
                int i = LNWinningPopupActivity.d;
                ((d) obj).getClass();
                return g.a;
            default:
                pb80 pb80Var = (pb80) obj;
                pb80Var.getClass();
                mb80.a(pb80Var);
                return Unit.a;
        }
    }
}
