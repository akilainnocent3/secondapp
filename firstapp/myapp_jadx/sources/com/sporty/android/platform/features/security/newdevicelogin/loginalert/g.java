package com.sporty.android.platform.features.security.newdevicelogin.loginalert;

import androidx.compose.runtime.m;
import com.sporty.android.core.model.accountprotection.LastLoginDeviceInfo;
import defpackage.e1i;
import defpackage.j8i0;
import defpackage.ku90;
import defpackage.lyz;
import defpackage.mgb0;
import defpackage.t340;
import defpackage.vu60;
import defpackage.xq00;
import defpackage.ytw;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sporty/android/platform/features/security/newdevicelogin/loginalert/g;", "Lj8i0;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class g extends j8i0 {
    public final lyz a;
    public final mgb0 b;
    public final xq00 c;
    public final LastLoginDeviceInfo d;
    public final ytw e;
    public final ku90<b> f;
    public final t340 i;

    public g(lyz lyzVar, vu60 vu60Var, mgb0 mgb0Var, xq00 xq00Var) {
        lyzVar.getClass();
        vu60Var.getClass();
        mgb0Var.getClass();
        xq00Var.getClass();
        this.a = lyzVar;
        this.b = mgb0Var;
        this.c = xq00Var;
        this.d = (LastLoginDeviceInfo) vu60Var.b("device_info");
        this.e = m.b(d.C0211d.a);
        ku90<b> ku90Var = new ku90<>();
        this.f = ku90Var;
        this.i = e1i.a(ku90Var);
    }
}
