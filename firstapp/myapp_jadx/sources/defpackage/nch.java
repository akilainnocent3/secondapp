package defpackage;

import android.view.View;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class nch implements View.OnClickListener {
    public final /* synthetic */ mch.b a;
    public final /* synthetic */ Market b;
    public final /* synthetic */ Event c;
    public final /* synthetic */ Outcome d;

    public /* synthetic */ nch(mch.b bVar, Market market, Event event, Outcome outcome, int i) {
        this.a = bVar;
        this.b = market;
        this.c = event;
        this.d = outcome;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.b.r0(this.c, this.b, this.d);
    }
}
