package defpackage;

import android.view.View;
import android.widget.TextView;
import com.sportybet.plugin.event.e;
import com.sportybet.plugin.realsports.activities.PreMatchEventActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class kb20 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kb20(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                PreMatchEventActivity preMatchEventActivity = (PreMatchEventActivity) obj;
                e eVar = preMatchEventActivity.L1;
                if (eVar != null) {
                    eVar.A1(true, false);
                }
                e eVar2 = preMatchEventActivity.L1;
                if (eVar2 != null) {
                    eVar2.C1();
                    return;
                }
                return;
            default:
                ql60 ql60Var = (ql60) obj;
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
                textView2.setEnabled(true);
                TextView textView3 = ql60Var.K;
                if (textView3 == null) {
                    Intrinsics.n("rangeHeader");
                    throw null;
                }
                textView3.setEnabled(false);
                ql60Var.a();
                ql60Var.N.j(Boolean.TRUE);
                return;
        }
    }
}
