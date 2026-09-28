package defpackage;

import com.sportybet.android.transaction.ui.txdetails.TxDetailsActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class r3n implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r3n(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                ((Function1) obj2).invoke(new y3n.c(str));
                return Unit.a;
            default:
                TxDetailsActivity txDetailsActivity = (TxDetailsActivity) obj2;
                String str2 = (String) obj;
                int i2 = TxDetailsActivity.D0;
                str2.getClass();
                String string = StringsKt.t0(str2).toString();
                if (string.length() <= 0) {
                    string = null;
                }
                if (string != null) {
                    vxo.b(txDetailsActivity, string);
                }
                return null;
        }
    }
}
