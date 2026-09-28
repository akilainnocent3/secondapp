package defpackage;

import com.sportygames.commons.SportyGamesManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class xjb implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xjb(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                enb enbVar = (enb) obj;
                enbVar.U = enb.a.b;
                enbVar.w0().getClass();
                SportyGamesManager.getInstance().gotoSportyBet(xae.a, null);
                break;
            default:
                ((x6p) obj).invoke(zxk.c.a);
                break;
        }
        return Unit.a;
    }
}
