package defpackage;

import android.view.View;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;

/* JADX INFO: loaded from: classes7.dex */
public final class ea20 implements View.OnClickListener {
    public final /* synthetic */ cq40 a;
    public final /* synthetic */ Outcome b;
    public final /* synthetic */ ca20.b c;
    public final /* synthetic */ Market d;
    public final /* synthetic */ Event e;

    public ea20(cq40 cq40Var, Outcome outcome, ca20.b bVar, Market market, Event event, int i) {
        this.a = cq40Var;
        this.b = outcome;
        this.c = bVar;
        this.d = market;
        this.e = event;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        cq40 cq40Var = this.a;
        if (jCurrentTimeMillis - cq40Var.a < 350) {
            return;
        }
        cq40Var.a = jCurrentTimeMillis;
        view.getClass();
        Outcome outcome = this.b;
        if (outcome != null) {
            this.c.b.K(this.e, this.d, outcome);
        }
    }
}
