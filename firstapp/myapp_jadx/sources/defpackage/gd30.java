package defpackage;

import com.sportybet.plugin.realsports.betslip.simulate.SimulateAutoBetPanel;
import com.sportybet.plugin.realsports.betslip.widget.QuickBetView;
import com.sportybet.plugin.realsports.data.sim.SimShareData;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class gd30 implements SimulateAutoBetPanel.a {
    @Override // com.sportybet.plugin.realsports.betslip.simulate.SimulateAutoBetPanel.a
    public final void a(int i) {
        boolean z = QuickBetView.j1;
        SimShareData.INSTANCE.getAutoBetTimesSubject().onNext(Integer.valueOf(i));
    }
}
