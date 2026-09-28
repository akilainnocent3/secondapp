package defpackage;

import com.sportybet.android.social.data.local.CCPDatabase_Impl;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.roulette.activities.RouletteActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class yl5 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yl5(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new j2c((CCPDatabase_Impl) obj);
            case 1:
                ((Function0) obj).invoke();
                return Unit.a;
            default:
                int[] iArr = RouletteActivity.A0;
                SportyGamesManager.getInstance().gotoSportyBet(xae.c, null);
                ((vx50) obj).dismiss();
                return null;
        }
    }
}
