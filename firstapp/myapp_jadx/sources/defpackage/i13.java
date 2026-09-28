package defpackage;

import com.sportybet.plugin.realsports.betslip.widget.BetSlipFooter;
import com.sportygames.commons.models.GiftItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class i13 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i13(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                int i2 = BetSlipFooter.j0;
                ((BetSlipFooter) obj).k();
                break;
            case 1:
                bwb bwbVar = (bwb) obj;
                ((x5a0) bwbVar.y2).setValue(Boolean.FALSE);
                ((x5a0) bwbVar.R0().R).setValue(Boolean.TRUE);
                bwbVar.R0().O1(new GiftItem(0.0d, "", "", "", 0.0d, 0L, 0, Double.valueOf(0.0d), null));
                break;
            default:
                ((Function1) obj).invoke(v9k0.g.a);
                break;
        }
        return Unit.a;
    }
}
