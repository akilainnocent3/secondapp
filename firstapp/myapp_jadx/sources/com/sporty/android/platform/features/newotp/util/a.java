package com.sporty.android.platform.features.newotp.util;

import com.sporty.android.platform.features.newotp.feature.register.revamp.RegisterRevampConfig;
import defpackage.ad50;
import defpackage.bt20;
import defpackage.cw40;
import defpackage.du40;
import defpackage.et20;
import defpackage.ew40;
import defpackage.fd50;
import defpackage.ht20;
import defpackage.iw40;
import defpackage.j6c;
import defpackage.jc50;
import defpackage.jr20;
import defpackage.oc50;
import defpackage.uv20;
import defpackage.vd50;
import defpackage.vs20;
import defpackage.wt40;
import defpackage.wv40;
import defpackage.xb50;

/* JADX INFO: loaded from: classes5.dex */
public final class a {
    public static OtpModule a(String str, String str2, String str3, int i, boolean z) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        return new OtpModule(new OtpData.PrimaryPhone(str, str2, j6c.CHANGE_PRIMARY_PHONE, z, i, str3, OTPResult.NoResult.a), new OtpViewModelClasses(vs20.class, et20.class, uv20.class, bt20.class, ht20.class, jr20.class));
    }

    public static OtpModule b(String str, String str2, RegisterRevampConfig registerRevampConfig) {
        str.getClass();
        str2.getClass();
        registerRevampConfig.getClass();
        return new OtpModule(new OtpData.Register(str, str2, (OTPResult.Success) null, registerRevampConfig, 12), new OtpViewModelClasses(du40.class, cw40.class, iw40.class, wv40.class, ew40.class, wt40.class));
    }

    public static /* synthetic */ OtpModule c(a aVar, String str, String str2) {
        RegisterRevampConfig.Default r0 = RegisterRevampConfig.Default.a;
        aVar.getClass();
        return b(str, str2, r0);
    }

    public static OtpModule d(String str, String str2) {
        str.getClass();
        str2.getClass();
        return new OtpModule(new OtpData.RestPassword(str, str2, 12), new OtpViewModelClasses(jc50.class, ad50.class, vd50.class, oc50.class, fd50.class, xb50.class));
    }
}
