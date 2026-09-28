package defpackage;

import android.view.View;
import android.widget.ToggleButton;
import com.sporty.android.common_ui.widgets.ItemToggleView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g3p implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g3p(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                int i2 = ItemToggleView.I;
                ToggleButton toggleButton = ((i3p) obj).d;
                toggleButton.setChecked(!toggleButton.isChecked());
                break;
            default:
                oh60 oh60Var = (oh60) obj;
                oh60Var.a();
                oh60Var.dismiss();
                break;
        }
    }
}
