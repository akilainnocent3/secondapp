package defpackage;

import android.view.View;
import com.sporty.android.core.model.tracking.AnalyticsParam;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class z6p implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z6p(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((c7p) obj).p0();
                break;
            default:
                wz.a("popup_action", "Sporty Hero", "game limit", AnalyticsParam.STORY_SKIP_REASON_CLOSE);
                ((z4f) obj).invoke();
                break;
        }
    }
}
