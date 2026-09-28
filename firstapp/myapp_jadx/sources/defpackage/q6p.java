package defpackage;

import android.view.View;
import com.sportygames.commons.models.GiftItem;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class q6p implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q6p(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((s6p) obj).m0(true);
                return;
            default:
                ij60 ij60Var = (ij60) obj;
                op5.a.getClass();
                String str = op5.c;
                if (str == null) {
                    str = "";
                }
                wz.a("FBGSelected", krh0.e(str), "false");
                gaj<? super GiftItem, ? super Double, ? super Boolean, Unit> gajVar = ij60Var.c;
                xi60.a aVar = ij60Var.d;
                if (aVar == null) {
                    Intrinsics.n("dataItem");
                    throw null;
                }
                GiftItem giftItem = aVar.a;
                gajVar.invoke(giftItem, Double.valueOf(giftItem.getCurBal()), Boolean.FALSE);
                return;
        }
    }
}
