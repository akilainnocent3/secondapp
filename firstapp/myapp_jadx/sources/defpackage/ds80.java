package defpackage;

import android.view.View;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ds80 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View.OnCreateContextMenuListener b;

    public /* synthetic */ ds80(View.OnCreateContextMenuListener onCreateContextMenuListener, int i) {
        this.a = i;
        this.b = onCreateContextMenuListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        View.OnCreateContextMenuListener onCreateContextMenuListener = this.b;
        switch (i) {
            case 0:
                ns80 ns80Var = (ns80) onCreateContextMenuListener;
                String string = ns80Var.getContext().getString(R.string.monthly);
                string.getClass();
                ns80Var.d = string;
                ns80Var.a.x1(string);
                ns80Var.c();
                ns80Var.b().w.setBackgroundColor(ns80Var.getContext().getColor(R.color.pp_setting_bg));
                ns80Var.b().A.setBackgroundColor(ns80Var.getContext().getColor(R.color.bg_primary));
                ns80Var.b().E.setBackgroundColor(ns80Var.getContext().getColor(R.color.pp_setting_bg));
                wz.a("BiggestCoeffClicked", "Ping Pong", "Month");
                break;
            default:
                ilg0 ilg0Var = (ilg0) ((blg0) onCreateContextMenuListener).i.getValue();
                ej5.c(o8i0.d(ilg0Var), null, null, new hlg0(ilg0Var.b, ilg0Var, null), 3);
                break;
        }
    }
}
