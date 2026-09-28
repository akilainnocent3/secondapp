package defpackage;

import android.view.View;
import androidx.fragment.app.e;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class mmh implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mmh(Object obj, int i) {
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
                String string = eVar.getString(R.string.payout_amount);
                string.getClass();
                yw80Var.z = string;
                String string2 = eVar.getString(R.string.daily);
                string2.getClass();
                yw80Var.A = string2;
                yw80Var.b.x1(yw80Var.z, string2);
                yw80Var.d(yw80Var.z, yw80Var.f, yw80Var.i);
                yw80Var.c().c.setTextColor(eVar.getColor(R.color.swipe_color));
                yw80Var.c().c.setBackgroundColor(eVar.getColor(R.color.sb_black_100));
                yw80Var.c().i.setBackgroundColor(eVar.getColor(R.color.sh_unselected_bg_dark_theme));
                yw80Var.c().w.setBackgroundColor(eVar.getColor(R.color.bg_primary));
                yw80Var.c().A.setBackgroundColor(eVar.getColor(R.color.sh_dialog_bg_dark_theme));
                yw80Var.c().E.setBackgroundColor(eVar.getColor(R.color.sh_dialog_bg_dark_theme));
                yw80Var.c().i.setTextColor(eVar.getColor(R.color.text_secondary));
                break;
        }
    }
}
