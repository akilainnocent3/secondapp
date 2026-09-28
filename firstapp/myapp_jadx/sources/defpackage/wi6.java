package defpackage;

import com.sportybet.plugin.realsports.data.BetSelection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class wi6 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ wi6(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                BetSelection betSelection = (BetSelection) obj;
                betSelection.getClass();
                return Long.valueOf(betSelection.startTime);
            default:
                ((xi60.a) obj).getClass();
                return Unit.a;
        }
    }
}
