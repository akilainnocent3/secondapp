package defpackage;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public final class ynl0 implements wol0 {
    public final /* synthetic */ iol0 a;

    public ynl0(iol0 iol0Var) {
        this.a = iol0Var;
    }

    @Override // defpackage.wol0
    public final void a(String str, String str2, Bundle bundle) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        iol0 iol0Var = this.a;
        if (!zIsEmpty) {
            iol0Var.b().p(new wnl0(this, str, str2, bundle));
            return;
        }
        k8l0 k8l0Var = iol0Var.l;
        if (k8l0Var != null) {
            y4l0 y4l0Var = k8l0Var.f;
            k8l0.m(y4l0Var);
            y4l0Var.f.b(str2, "AppId not known when logging event");
        }
    }
}
