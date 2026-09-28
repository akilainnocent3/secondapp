package defpackage;

import android.graphics.Bitmap;
import com.sporty.android.core.model.MyLog;
import com.sportybet.feature.winning.WinningDialogActivity;

/* JADX INFO: loaded from: classes6.dex */
public final class haj0 extends ibn<Bitmap> {
    public final /* synthetic */ WinningDialogActivity a;

    public haj0(WinningDialogActivity winningDialogActivity) {
        this.a = winningDialogActivity;
    }

    @Override // defpackage.ibn
    public final boolean a(String str, xzk xzkVar) {
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_COMMON);
        aVar.p(xzkVar, "unable to load online resources: %s", str);
        this.a.finish();
        return true;
    }

    @Override // defpackage.ibn
    public final void b(String str) {
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_COMMON);
        aVar.a("online resources was cached: %s", str);
    }
}
