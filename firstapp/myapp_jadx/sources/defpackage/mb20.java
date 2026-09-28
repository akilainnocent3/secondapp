package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import com.sportybet.plugin.realsports.activities.PreMatchEventActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class mb20 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mb20(Object obj, int i) {
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
                ComposeView composeView = preMatchEventActivity.u1;
                if (composeView == null || composeView.getVisibility() != 0) {
                    return;
                }
                preMatchEventActivity.A1();
                return;
            default:
                ql60 ql60Var = (ql60) obj;
                TextView textView = ql60Var.L;
                if (textView == null) {
                    Intrinsics.n("classicHeader");
                    throw null;
                }
                textView.setEnabled(false);
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
                textView3.setEnabled(true);
                ql60Var.a();
                ql60Var.O.j(Boolean.TRUE);
                return;
        }
    }
}
