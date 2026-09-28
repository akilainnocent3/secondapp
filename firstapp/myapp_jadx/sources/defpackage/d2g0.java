package defpackage;

import android.content.DialogInterface;
import com.sporty.android.core.model.tracking.AnalyticsParam;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class d2g0 implements DialogInterface.OnCancelListener {
    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        wz.a("popup_action", "Ping Pong", "top wins", AnalyticsParam.STORY_SKIP_REASON_CLOSE);
    }
}
