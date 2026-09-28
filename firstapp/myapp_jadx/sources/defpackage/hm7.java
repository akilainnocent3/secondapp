package defpackage;

import android.view.KeyEvent;
import android.view.View;
import android.widget.RadioGroup;
import com.sportybet.android.choosebet.presentation.ChooseBetActivity;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class hm7 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ hm7(KeyEvent.Callback callback, int i) {
        this.a = i;
        this.b = callback;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        KeyEvent.Callback callback = this.b;
        switch (i) {
            case 0:
                ChooseBetActivity chooseBetActivity = (ChooseBetActivity) callback;
                String str = chooseBetActivity.e;
                if (str != null) {
                    bn7 bn7VarZ1 = chooseBetActivity.z1();
                    ej5.c(o8i0.d(bn7VarZ1), null, null, new ym7(bn7VarZ1, str, null), 3);
                }
                break;
            default:
                ((RadioGroup) callback).check(R.id.rb_partial_free_bet);
                break;
        }
    }
}
