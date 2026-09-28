package defpackage;

import android.app.Dialog;
import com.sportygames.commons.models.GiftItem;
import com.sportygames.crash.remote.models.BetHistoryItem;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class so2 implements gaj {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ so2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Dialog dialog;
        int i = this.a;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                String str2 = (String) obj2;
                str.getClass();
                str2.getClass();
                ((zo2) obj4).A.invoke(str, str2, (BetHistoryItem) obj3);
                break;
            default:
                enb enbVar = (enb) obj4;
                GiftItem giftItem = (GiftItem) obj;
                Double d = (Double) obj2;
                d.getClass();
                ((Boolean) obj3).getClass();
                giftItem.getClass();
                ((x5a0) enbVar.p0().b0).setValue(giftItem);
                ((x5a0) enbVar.p0().a0).setValue(d);
                xi60 xi60Var = enbVar.j0;
                if (xi60Var != null && (dialog = xi60Var.getDialog()) != null && dialog.isShowing()) {
                    xi60 xi60Var2 = enbVar.j0;
                    if (xi60Var2 != null) {
                        xi60Var2.dismiss();
                    }
                    enbVar.j0 = null;
                }
                zob zobVarW0 = enbVar.w0();
                zobVarW0.f = giftItem.getGiftId();
                zobVarW0.b = d;
                break;
        }
        return Unit.a;
    }
}
