package defpackage;

import android.view.View;
import com.sportygames.commons.SportyGamesManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class i560 implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((View) obj).getClass();
                SportyGamesManager.getInstance().gotoSportyBet(xae.c, null);
                break;
            default:
                break;
        }
        return Unit.a;
    }
}
