package defpackage;

import android.view.View;
import android.widget.TextView;
import com.sportybet.plugin.realsports.activities.PreMatchEventActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class nuj implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View.OnCreateContextMenuListener b;

    public /* synthetic */ nuj(View.OnCreateContextMenuListener onCreateContextMenuListener, int i) {
        this.a = i;
        this.b = onCreateContextMenuListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        int i2 = 1;
        View.OnCreateContextMenuListener onCreateContextMenuListener = this.b;
        switch (i) {
            case 0:
                suj sujVar = (suj) onCreateContextMenuListener;
                c2t c2tVar = sujVar.b;
                if (c2tVar == null) {
                    Intrinsics.n("viewModel");
                    throw null;
                }
                n8f n8fVar = new n8f(sujVar, i2);
                ej5.c(o8i0.d(c2tVar), null, null, new z1t(new r8t(), n8fVar, c2tVar, null), 3);
                return;
            case 1:
                PreMatchEventActivity preMatchEventActivity = (PreMatchEventActivity) onCreateContextMenuListener;
                int i3 = PreMatchEventActivity.a2;
                preMatchEventActivity.d2(new iua(preMatchEventActivity, i2));
                return;
            default:
                ql60 ql60Var = (ql60) onCreateContextMenuListener;
                TextView textView = ql60Var.L;
                if (textView == null) {
                    Intrinsics.n("classicHeader");
                    throw null;
                }
                textView.setEnabled(true);
                TextView textView2 = ql60Var.J;
                if (textView2 == null) {
                    Intrinsics.n("ouHeader");
                    throw null;
                }
                textView2.setEnabled(false);
                TextView textView3 = ql60Var.K;
                if (textView3 == null) {
                    Intrinsics.n("rangeHeader");
                    throw null;
                }
                textView3.setEnabled(true);
                ql60Var.a();
                ql60Var.M.j(Boolean.TRUE);
                return;
        }
    }
}
