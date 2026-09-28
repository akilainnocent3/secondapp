package defpackage;

import android.view.View;
import com.google.android.material.search.SearchView;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.bookingcode.presentation.activity.a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ya8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ya8(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ab8 ab8Var = (ab8) obj;
                ab8Var.a();
                ab8Var.dismiss();
                wz.a("popup_action", "Ping Pong", "bet history", AnalyticsParam.STORY_SKIP_REASON_CLOSE);
                break;
            case 1:
                a aVar = (a) obj;
                if (!aVar.A || aVar.o0()) {
                    aVar.n0().z1(q8s.a);
                } else {
                    aVar.n0().z1(z8s.a);
                }
                a.InterfaceC0220a interfaceC0220a = aVar.B;
                if (interfaceC0220a != null) {
                    interfaceC0220a.Q0();
                }
                break;
            default:
                int i2 = SearchView.T;
                ((SearchView) obj).l();
                break;
        }
    }
}
