package defpackage;

import com.sportybet.plugin.realsports.data.BetSelection;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class k81 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ k81(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                Double d = (Double) obj;
                d.doubleValue();
                return d;
            default:
                BetSelection betSelection = (BetSelection) obj;
                betSelection.getClass();
                return Long.valueOf(betSelection.startTime);
        }
    }
}
