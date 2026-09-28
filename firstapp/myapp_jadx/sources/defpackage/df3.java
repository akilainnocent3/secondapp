package defpackage;

import androidx.compose.runtime.m;
import com.sportybet.plugin.realsports.betslip.widget.BetslipActivity;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class df3 implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ df3(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                Set<g08> set = BetslipActivity.X2;
                return Unit.a;
            case 1:
                return m.b(Boolean.FALSE);
            default:
                return Unit.a;
        }
    }
}
