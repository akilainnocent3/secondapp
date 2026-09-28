package defpackage;

import android.view.View;
import com.sporty.android.core.model.tracking.AnalyticsParam;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class imh implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ imh(Object obj, int i) {
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
                ((yw80) obj).dismiss();
                wz.a("popup_action", "Sporty Hero", "top wins", AnalyticsParam.STORY_SKIP_REASON_CLOSE);
                break;
        }
    }
}
