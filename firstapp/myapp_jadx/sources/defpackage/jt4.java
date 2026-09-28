package defpackage;

import android.view.View;
import com.sportygames.commons.SportyGamesManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class jt4 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ jt4(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                String str = (String) obj;
                str.getClass();
                return op5.c(op5.a, str.concat(":sg_campaign"), "");
            case 1:
                return Unit.a;
            default:
                ((View) obj).getClass();
                SportyGamesManager.getInstance().gotoSportyBet(xae.c, null);
                return Unit.a;
        }
    }
}
