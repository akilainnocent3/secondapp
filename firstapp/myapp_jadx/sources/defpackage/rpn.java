package defpackage;

import android.content.Context;
import com.sportybet.android.cashoutphase3.InstantCashoutView;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class rpn implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rpn(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                int i2 = InstantCashoutView.J;
                return Integer.valueOf(((Context) obj).getColor(R.color.text_disable_type1_primary));
            default:
                l9s.a aVar = ((l9s) obj).b;
                if (aVar != null) {
                    aVar.q();
                }
                return Unit.a;
        }
    }
}
