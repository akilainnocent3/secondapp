package defpackage;

import android.view.View;
import androidx.fragment.app.e;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class kmh implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kmh(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                yec yecVar = ((ymh) obj).c;
                if (yecVar != null) {
                    yecVar.dismiss();
                }
                break;
            default:
                yw80 yw80Var = (yw80) obj;
                e eVar = yw80Var.a;
                String string = eVar.getString(R.string.daily);
                string.getClass();
                yw80Var.A = string;
                yw80Var.b.x1(yw80Var.z, string);
                yw80Var.d(yw80Var.z, yw80Var.f, yw80Var.i);
                yw80Var.c().w.setBackgroundColor(eVar.getColor(R.color.bg_primary));
                yw80Var.c().A.setBackgroundColor(eVar.getColor(R.color.sh_dialog_bg_dark_theme));
                yw80Var.c().E.setBackgroundColor(eVar.getColor(R.color.sh_dialog_bg_dark_theme));
                break;
        }
    }
}
