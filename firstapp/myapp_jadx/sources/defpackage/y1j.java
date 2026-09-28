package defpackage;

import com.sportygames.commons.SportyGamesManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class y1j implements Function0 {
    public final /* synthetic */ int a = 1;

    public /* synthetic */ y1j() {
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                SportyGamesManager.getInstance().gotoSportyBet(xae.c, null);
                return Unit.a;
            default:
                return Integer.valueOf(xm10.a.length);
        }
    }

    public /* synthetic */ y1j(n2j n2jVar) {
    }
}
