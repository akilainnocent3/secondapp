package defpackage;

import com.sportygames.commons.SportyGamesManager;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class clb implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ clb(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                SportyGamesManager.getInstance().gotoSportyBet(xae.c, null);
                return Unit.a;
            default:
                HashMap map = new HashMap();
                map.putAll(fdg.e.c);
                map.putAll(fdg.g);
                return map;
        }
    }
}
