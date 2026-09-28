package defpackage;

import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.views.NavigationActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ljx implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ ljx(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                int i = NavigationActivity.y;
                SportyGamesManager.getInstance().gotoSportyBet(xae.c, null);
                break;
        }
        return Unit.a;
    }
}
