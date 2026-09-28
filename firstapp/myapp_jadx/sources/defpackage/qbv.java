package defpackage;

import android.view.View;
import com.google.android.material.datepicker.c;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes4.dex */
public final class qbv implements View.OnClickListener {
    public final /* synthetic */ c a;

    public qbv(c cVar) {
        this.a = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        c cVar = this.a;
        c.d dVar = cVar.i;
        c.d dVar2 = c.d.a;
        c.d dVar3 = c.d.b;
        if (dVar == dVar3) {
            cVar.n0(dVar2);
            cVar.y.announceForAccessibility(cVar.getString(R.string.mtrl_picker_toggled_to_day_selection));
        } else if (dVar == dVar2) {
            cVar.n0(dVar3);
            cVar.w.announceForAccessibility(cVar.getString(R.string.mtrl_picker_toggled_to_year_selection));
        }
    }
}
