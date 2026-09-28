package defpackage;

import com.sporty.android.core.model.realsports.Order;
import com.sportybet.plugin.realsports.betslip.widget.QuickBetView;

/* JADX INFO: loaded from: classes7.dex */
public final class bf30 implements mpy {
    public final /* synthetic */ QuickBetView a;
    public final /* synthetic */ Order b;
    public final /* synthetic */ boolean c;

    public bf30(QuickBetView quickBetView, Order order, boolean z) {
        this.a = quickBetView;
        this.b = order;
        this.c = z;
    }

    @Override // defpackage.mpy
    public final void a() {
        boolean z = QuickBetView.j1;
        this.a.t0(this.b, this.c);
    }

    @Override // defpackage.mpy
    public final void b() {
        boolean z = QuickBetView.j1;
        this.a.t0(this.b, this.c);
    }
}
