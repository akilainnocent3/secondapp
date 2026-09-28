package defpackage;

import com.sporty.android.book.domain.entity.BetBuilderData;
import com.sporty.android.book.domain.entity.BetBuilderOddsFailureType;
import com.sporty.android.book.domain.entity.UIState;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class cj2 extends saj implements Function0<Boolean> {
    /* JADX WARN: Code duplicated, block: B:13:0x0035  */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean z;
        wwd0 wwd0Var = ((fj2) this.receiver).d;
        BetBuilderData betBuilderData = (BetBuilderData) ((UIState) wwd0Var.getValue()).getData();
        if ((betBuilderData != null ? betBuilderData.getFailureTypeEnum() : null) == null) {
            z = false;
        } else {
            BetBuilderData betBuilderData2 = (BetBuilderData) ((UIState) wwd0Var.getValue()).getData();
            if ((betBuilderData2 != null ? betBuilderData2.getFailureTypeEnum() : null) != BetBuilderOddsFailureType.ZERO_WIN_BET) {
                z = true;
            } else {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}
