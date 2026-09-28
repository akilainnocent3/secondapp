package defpackage;

import androidx.recyclerview.widget.GridLayoutManager;
import com.sportybet.plugin.realsports.quickmarket.QuickMarketOptionActivity;

/* JADX INFO: loaded from: classes7.dex */
public final class qi30 extends GridLayoutManager.b {
    public final /* synthetic */ QuickMarketOptionActivity a;

    public qi30(QuickMarketOptionActivity quickMarketOptionActivity) {
        this.a = quickMarketOptionActivity;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.b
    public final int getSpanSize(int i) {
        di30 di30Var = this.a.b;
        return (di30Var == null || di30Var.getItemViewType(i) != 0) ? 1 : 3;
    }
}
