package defpackage;

import android.widget.PopupWindow;
import com.sportybet.plugin.realsports.outrights.detail.OutrightsActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class wbz implements PopupWindow.OnDismissListener {
    public final /* synthetic */ OutrightsActivity a;

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ld ldVar = this.a.b;
        if (ldVar != null) {
            ldVar.c.setExpanded(false);
        } else {
            Intrinsics.n("binding");
            throw null;
        }
    }
}
