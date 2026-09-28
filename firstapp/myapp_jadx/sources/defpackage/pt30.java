package defpackage;

import android.view.View;
import com.sportybet.android.bethistory.presentation.activity.RSportsBetTicketDetailsActivity;

/* JADX INFO: loaded from: classes5.dex */
public final class pt30 implements View.OnClickListener {
    public final /* synthetic */ RSportsBetTicketDetailsActivity a;

    public pt30(RSportsBetTicketDetailsActivity rSportsBetTicketDetailsActivity) {
        this.a = rSportsBetTicketDetailsActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = RSportsBetTicketDetailsActivity.s0;
        this.a.B1(false);
    }
}
