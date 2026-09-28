package defpackage;

import android.net.Uri;
import com.sportybet.android.gp.tz.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h12 implements ee00 {
    public final /* synthetic */ i12 a;

    public h12(i12 i12Var) {
        this.a = i12Var;
    }

    @Override // defpackage.ee00
    public final void onDenied() {
        zyf0.a(R.string.common_functions__permission_denied);
    }

    @Override // defpackage.ee00
    public final void onGranted() {
        i12 i12Var = this.a;
        ee<Uri> eeVar = i12Var.c;
        if (eeVar == null) {
            Intrinsics.n("cameraLauncher");
            throw null;
        }
        Object value = i12Var.a.getValue();
        value.getClass();
        eeVar.b((Uri) value);
    }
}
