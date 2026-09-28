package defpackage;

import com.sportybet.feature.payment.impl.transaction.presentation.activity.TxDetailsV2Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class uu40 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uu40(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                o6z o6zVar = (o6z) obj;
                o6zVar.getClass();
                ((Function1) obj2).invoke(o6zVar);
                break;
            default:
                TxDetailsV2Activity txDetailsV2Activity = (TxDetailsV2Activity) obj2;
                String str = (String) obj;
                int i2 = TxDetailsV2Activity.v;
                str.getClass();
                String string = StringsKt.t0(str).toString();
                if (string.length() <= 0) {
                    string = null;
                }
                if (string != null) {
                    vxo.b(txDetailsV2Activity, string);
                }
                break;
        }
        return Unit.a;
    }
}
