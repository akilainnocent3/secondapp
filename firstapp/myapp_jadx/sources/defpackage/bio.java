package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import com.sportybet.android.instantwin.presentation.promotiondialog.model.InstantWinPromotionDialogInput;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.lobby.remote.models.GameDetails;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class bio implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bio(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Bundle arguments = ((eio) obj).getArguments();
                if (arguments != null) {
                    return (InstantWinPromotionDialogInput) ((Parcelable) rj5.a(arguments, "ARG_INPUT", InstantWinPromotionDialogInput.class));
                }
                return null;
            case 1:
                return (yc7) ((v1t) obj).d.invoke();
            default:
                GameDetails gameDetails = ((l560) obj).S;
                wz.a("AddMoneyClicked", gameDetails != null ? gameDetails.getName() : null, new String[0]);
                SportyGamesManager.getInstance().gotoSportyBet(xae.c, null);
                return Unit.a;
        }
    }
}
