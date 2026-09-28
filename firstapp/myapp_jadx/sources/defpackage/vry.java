package defpackage;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.sportybet.android.widget.OneUpTwoUpCheckbox;

/* JADX INFO: loaded from: classes7.dex */
public final class vry implements g6i0 {
    public final OneUpTwoUpCheckbox a;
    public final CheckBox b;
    public final TextView c;
    public final ProgressBar d;

    public vry(OneUpTwoUpCheckbox oneUpTwoUpCheckbox, CheckBox checkBox, TextView textView, ProgressBar progressBar) {
        this.a = oneUpTwoUpCheckbox;
        this.b = checkBox;
        this.c = textView;
        this.d = progressBar;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
