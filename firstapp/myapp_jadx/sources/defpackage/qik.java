package defpackage;

import android.view.View;
import android.widget.RadioGroup;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes7.dex */
public final class qik implements View.OnFocusChangeListener {
    public final /* synthetic */ RadioGroup a;

    public qik(RadioGroup radioGroup) {
        this.a = radioGroup;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        if (z) {
            this.a.check(R.id.rb_partial_free_bet);
        }
    }
}
