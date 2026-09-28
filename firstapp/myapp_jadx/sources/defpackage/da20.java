package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;

/* JADX INFO: loaded from: classes7.dex */
public final class da20 implements View.OnClickListener {
    public final /* synthetic */ cq40 a;
    public final /* synthetic */ ca20.b b;
    public final /* synthetic */ Outcome c;
    public final /* synthetic */ etj d;
    public final /* synthetic */ Market e;
    public final /* synthetic */ Event f;

    public da20(cq40 cq40Var, ca20.b bVar, Outcome outcome, etj etjVar, Market market, Event event, int i) {
        this.a = cq40Var;
        this.b = bVar;
        this.c = outcome;
        this.d = etjVar;
        this.e = market;
        this.f = event;
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
        ca20.b bVar = this.b;
        g2p g2pVar = bVar.a;
        g2pVar.f.setVisibility(0);
        ImageView imageView = g2pVar.c;
        imageView.setVisibility(4);
        imageView.setClickable(false);
        Outcome outcome = this.c;
        if (outcome != null) {
            this.d.invoke(bVar);
            bVar.b.x(this.f, this.e, outcome);
        }
    }
}
