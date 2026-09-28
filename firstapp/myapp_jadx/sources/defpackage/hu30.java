package defpackage;

import android.view.View;
import androidx.appcompat.app.b;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class hu30 implements View.OnClickListener {
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        b.a aVar = new b.a(view.getContext());
        aVar.a(R.string.bet_history__this_market_is_still_waiting_for_the_final_results);
        aVar.setPositiveButton(R.string.common_functions__ok, new ku30());
        aVar.f();
    }
}
