package defpackage;

import android.view.KeyEvent;
import android.view.View;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportygames.sportyherocompose.components.OverUnderComponent;
import com.sportygames.sportyherov2.components.SHKeypadContainer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ubg implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ ubg(KeyEvent.Callback callback, int i) {
        this.a = i;
        this.b = callback;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        KeyEvent.Callback callback = this.b;
        switch (i) {
            case 0:
                xbg xbgVar = (xbg) callback;
                xbg.b(xbgVar.i, AnalyticsParam.STORY_SKIP_REASON_CLOSE);
                xbg.a aVar = xbgVar.f;
                if (aVar == null) {
                    Intrinsics.n("errorInfo");
                    throw null;
                }
                aVar.d.invoke();
                xbgVar.dismiss();
                return;
            default:
                OverUnderComponent overUnderComponent = (OverUnderComponent) callback;
                int i2 = OverUnderComponent.e0;
                overUnderComponent.j();
                SHKeypadContainer sHKeypadContainer = overUnderComponent.U;
                if (sHKeypadContainer != null) {
                    sHKeypadContainer.performClick();
                    return;
                } else {
                    Intrinsics.n("ouKeypad");
                    throw null;
                }
        }
    }
}
