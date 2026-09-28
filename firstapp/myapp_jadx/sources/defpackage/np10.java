package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.android.gp.tz.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class np10 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ np10(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                pp10 pp10Var = (pp10) obj;
                pp10Var.g();
                if (view.getId() == R.id.exo_overflow_show) {
                    pp10Var.q.start();
                    return;
                } else {
                    if (view.getId() == R.id.exo_overflow_hide) {
                        pp10Var.r.start();
                        return;
                    }
                    return;
                }
            default:
                vx50 vx50Var = (vx50) obj;
                AppCompatButton appCompatButton = vx50Var.c;
                if (appCompatButton == null) {
                    Intrinsics.n("positiveButton");
                    throw null;
                }
                wz.a("popup_action", "Roulette", AnalyticsEvent.BI_TRACKING_KIND_ERROR, appCompatButton.getText().toString());
                vx50.a aVar = vx50Var.e;
                if (aVar == null) {
                    Intrinsics.n("errorInfo");
                    throw null;
                }
                aVar.d.invoke();
                vx50Var.dismiss();
                return;
        }
    }
}
