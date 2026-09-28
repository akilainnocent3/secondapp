package defpackage;

import com.google.android.material.tabs.TabLayout;
import com.sportygames.commons.components.WalletText;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.evenodd.remote.models.WalletInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class d1j implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d1j(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String currency;
        WalletInfo walletInfo;
        WalletInfo walletInfo2;
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                n2j n2jVar = (n2j) obj2;
                LoadingState loadingState = (LoadingState) obj;
                if (!n2jVar.a) {
                    n2jVar.a = true;
                    n2jVar.Q = false;
                    n2jVar.J0();
                }
                djh djhVar = n2jVar.b;
                if (djhVar != null) {
                    WalletText walletText = djhVar.I;
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    if (hTTPResponse == null || (walletInfo2 = (WalletInfo) hTTPResponse.getData()) == null || (currency = walletInfo2.getCurrency()) == null) {
                        currency = "";
                    }
                    HTTPResponse hTTPResponse2 = (HTTPResponse) loadingState.getData();
                    walletText.setBalance(currency, (hTTPResponse2 == null || (walletInfo = (WalletInfo) hTTPResponse2.getData()) == null) ? null : walletInfo.getBalance());
                }
                djh djhVar2 = n2jVar.b;
                if (djhVar2 != null) {
                    djhVar2.I.f = true;
                }
                double d = n2jVar.P;
                if (d > 0.0d) {
                    if (djhVar2 != null) {
                        djhVar2.I.a(Math.abs(d));
                    }
                } else if (d < 0.0d && djhVar2 != null) {
                    djhVar2.I.b(Math.abs(d));
                }
                n2jVar.P = 0.0d;
                break;
            default:
                ((TabLayout) obj2).o((lqs.a) obj);
                break;
        }
        return Unit.a;
    }
}
