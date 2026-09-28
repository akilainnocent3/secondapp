package defpackage;

import android.view.View;
import com.google.android.material.datepicker.c;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes4.dex */
public final class pbv extends e6 {
    public final /* synthetic */ c d;

    public pbv(c cVar) {
        this.d = cVar;
    }

    @Override // defpackage.e6
    public final void d(View view, c7 c7Var) {
        this.a.onInitializeAccessibilityNodeInfo(view, c7Var.a);
        c cVar = this.d;
        c7Var.b(new c7.a(16, cVar.C.getVisibility() == 0 ? cVar.getString(R.string.mtrl_picker_toggle_to_year_selection) : cVar.getString(R.string.mtrl_picker_toggle_to_day_selection)));
    }
}
