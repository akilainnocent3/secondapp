package defpackage;

import com.sportybet.plugin.realsports.data.QuickMarketHelper;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class wi30 implements QuickMarketHelper.FetchCallback {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ bj30 b;

    public /* synthetic */ wi30(boolean z, bj30 bj30Var) {
        this.a = z;
        this.b = bj30Var;
    }

    @Override // com.sportybet.plugin.realsports.data.QuickMarketHelper.FetchCallback
    public final void onResult(List list) {
        ssw<bj30.a> sswVar = this.b.a;
        if (this.a) {
            list.getClass();
            sswVar.m(new bj30.a.C0128a(list));
        } else {
            list.getClass();
            sswVar.m(new bj30.a.b(list));
        }
    }
}
