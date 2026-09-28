package defpackage;

import android.view.View;
import com.sporty.android.core.model.tracking.AnalyticsParam;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class vi40 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vi40(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                yi40 yi40Var = (yi40) obj;
                String string = yi40Var.a.v.getText().toString();
                if (string.length() > 0) {
                    yi40Var.f.a(string, g08.RECOMMENDED_BOOKING_CODE_SUCCESSFUL);
                }
                break;
            default:
                ((nv80) obj).dismiss();
                wz.a("popup_action", "Ping Pong", "provably fair setting", AnalyticsParam.STORY_SKIP_REASON_CLOSE);
                break;
        }
    }
}
