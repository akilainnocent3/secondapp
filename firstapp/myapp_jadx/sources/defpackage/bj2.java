package defpackage;

import com.sporty.android.book.domain.entity.BetBuilderData;
import com.sporty.android.book.domain.entity.BetBuilderOddsFailureType;
import com.sporty.android.book.domain.entity.UIState;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class bj2 extends saj implements Function0<Boolean> {
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        BetBuilderData betBuilderData = (BetBuilderData) ((UIState) ((fj2) this.receiver).d.getValue()).getData();
        return Boolean.valueOf((betBuilderData != null ? betBuilderData.getFailureTypeEnum() : null) == BetBuilderOddsFailureType.ZERO_WIN_BET);
    }
}
