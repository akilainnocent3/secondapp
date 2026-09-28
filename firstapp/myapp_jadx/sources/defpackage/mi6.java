package defpackage;

import com.sportybet.plugin.realsports.data.BetSelection;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class mi6 implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        BetSelection betSelection = (BetSelection) obj;
        betSelection.getClass();
        return Integer.valueOf(betSelection.status);
    }
}
