package defpackage;

import com.sportygames.commons.SportyGamesManager;
import com.sportygames.pingpong.components.ShRoundBetsContainer;
import com.sportygames.pingpong.remote.models.TopBets;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class yv80 implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TopBets topBets = (TopBets) obj;
        int i = ShRoundBetsContainer.e;
        topBets.getClass();
        String userId = SportyGamesManager.getInstance().getUserId();
        userId.getClass();
        return Boolean.valueOf(StringsKt.M(userId, topBets.getUserId(), false));
    }
}
