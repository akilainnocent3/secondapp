package defpackage;

import android.view.View;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class w4j implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View.OnCreateContextMenuListener b;

    public /* synthetic */ w4j(View.OnCreateContextMenuListener onCreateContextMenuListener, int i) {
        this.a = i;
        this.b = onCreateContextMenuListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        View.OnCreateContextMenuListener onCreateContextMenuListener = this.b;
        switch (i) {
            case 0:
                ((u6j) onCreateContextMenuListener).o1(-1);
                return;
            default:
                vx50 vx50Var = (vx50) onCreateContextMenuListener;
                wz.a("popup_action", "Roulette", AnalyticsEvent.BI_TRACKING_KIND_ERROR, AnalyticsParam.STORY_SKIP_REASON_CLOSE);
                vx50.a aVar = vx50Var.e;
                if (aVar == null) {
                    Intrinsics.n("errorInfo");
                    throw null;
                }
                aVar.e.invoke();
                vx50Var.dismiss();
                return;
        }
    }
}
