package defpackage;

import android.content.Context;
import com.sportybet.android.cashoutphase3.InstantCashoutView;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class uji implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uji(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return Float.valueOf(((fmt) obj).g());
            case 1:
                int i2 = InstantCashoutView.J;
                return ((Context) obj).getDrawable(R.drawable.bg_filled_brand_secondary_disable_2_radius);
            default:
                l9s.a aVar = ((l9s) obj).b;
                if (aVar != null) {
                    aVar.o0();
                }
                return Unit.a;
        }
    }
}
