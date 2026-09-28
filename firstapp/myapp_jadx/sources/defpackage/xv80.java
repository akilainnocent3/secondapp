package defpackage;

import com.sportygames.commons.SportyGamesManager;
import com.sportygames.sportyherov2.components.ShRoundBetsContainer;
import com.sportygames.sportyherov2.remote.models.TopBets;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class xv80 implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TopBets topBets = (TopBets) obj;
        int i = ShRoundBetsContainer.d;
        topBets.getClass();
        String userId = SportyGamesManager.getInstance().getUserId();
        userId.getClass();
        return Boolean.valueOf(StringsKt.M(userId, topBets.getUserId(), false));
    }
}
