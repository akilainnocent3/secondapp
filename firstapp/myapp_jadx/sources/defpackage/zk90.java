package defpackage;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import com.sportybet.plugin.realsports.betslip.simulate.SimulateAutoBetPanel;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class zk90 implements View.OnClickListener {
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = SimulateAutoBetPanel.K;
        Context context = view.getContext();
        context.getClass();
        FragmentManager supportFragmentManager = null;
        try {
            Context contextB = dvi.b(context);
            contextB.getClass();
            supportFragmentManager = ((e) contextB).getSupportFragmentManager();
            if (supportFragmentManager.H("SimAutoBetInfo") != null) {
                itf0.a aVar = itf0.a;
                aVar.q("SimAutoBetInfo");
                aVar.a("a dialog is already on the screen", new Object[0]);
                return;
            }
        } catch (ClassCastException unused) {
            itf0.a aVar2 = itf0.a;
            aVar2.q("SimAutoBetInfo");
            aVar2.a("Can't get fragment manager", new Object[0]);
        }
        if (supportFragmentManager == null || supportFragmentManager.K) {
            return;
        }
        wk90 wk90Var = new wk90();
        wk90Var.setCancelable(false);
        wk90Var.show(supportFragmentManager, "SimAutoBetInfo");
    }
}
