package defpackage;

import android.view.View;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportygames.sportyherov2.components.SHKeypadContainer;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class sn60 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sn60(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                int i2 = SHKeypadContainer.F;
                ((Function1) obj).invoke(4);
                break;
            default:
                ((d6j0) obj).dismiss();
                wz.a("popup_action", "Ping Pong", "about provably fair", AnalyticsParam.STORY_SKIP_REASON_CLOSE);
                break;
        }
    }
}
