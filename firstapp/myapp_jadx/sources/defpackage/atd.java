package defpackage;

import android.view.View;
import com.sportybet.feature.payment.impl.deposit.presentation.adapter.DepositCardSavedAdapter;
import com.sportybet.plugin.event.EventActivity;
import com.sportybet.plugin.realsports.event.widget.LiveEventControlsHeaderView;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class atd implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ atd(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                DepositCardSavedAdapter.ViewHolder.setData$lambda$1((kg6) obj, view);
                break;
            default:
                mkg mkgVar = ((LiveEventControlsHeaderView) obj).d;
                if (mkgVar != null) {
                    EventActivity eventActivity = mkgVar.a;
                    int i2 = EventActivity.U0;
                    eventActivity.P1();
                }
                break;
        }
    }
}
