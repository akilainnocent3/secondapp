package defpackage;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import com.sporty.android.common_ui.widgets.InsureCheckBoxView;

/* JADX INFO: loaded from: classes4.dex */
public final class xhd0 implements g6i0 {
    public final InsureCheckBoxView a;
    public final CheckBox b;
    public final View c;
    public final TextView d;

    public xhd0(InsureCheckBoxView insureCheckBoxView, CheckBox checkBox, View view, TextView textView) {
        this.a = insureCheckBoxView;
        this.b = checkBox;
        this.c = view;
        this.d = textView;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
