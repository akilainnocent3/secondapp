package defpackage;

import com.sportygames.commons.SportyGamesManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final class gry implements Function0<Unit> {
    public final /* synthetic */ zqy a;

    public gry(zqy zqyVar) {
        this.a = zqyVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.a.w0().getClass();
        SportyGamesManager.getInstance().gotoSportyBet(xae.a, null);
        return Unit.a;
    }
}
