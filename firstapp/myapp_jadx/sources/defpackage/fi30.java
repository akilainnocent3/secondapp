package defpackage;

import com.sportybet.android.globalpay.kyc.za.a;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.quickmarket.QuickMarketOptionActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class fi30 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fi30(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return Integer.valueOf(((QuickMarketOptionActivity) obj).getResources().getDimensionPixelSize(R.dimen.quick_market_menu_divider));
            default:
                a aVar = (a) obj;
                a.InterfaceC0227a interfaceC0227a = aVar.a;
                if (interfaceC0227a != null) {
                    interfaceC0227a.a(wae.KYC);
                }
                aVar.dismiss();
                return Unit.a;
        }
    }
}
