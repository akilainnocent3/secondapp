package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdErrorType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2372Vm {
    public final AdErrorType A00;
    public final String A01;

    public C2372Vm(int i10, String str) {
        this(AdErrorType.adErrorTypeFromCode(i10), str);
    }

    public C2372Vm(AdErrorType adErrorType, String str) {
        str = TextUtils.isEmpty(str) ? adErrorType.getDefaultErrorMessage() : str;
        this.A00 = adErrorType;
        this.A01 = str;
    }

    public static C2372Vm A00(AdErrorType adErrorType) {
        return new C2372Vm(adErrorType, (String) null);
    }

    public static C2372Vm A01(AdErrorType adErrorType, String str) {
        return new C2372Vm(adErrorType, str);
    }

    public static C2372Vm A02(C2373Vn c2373Vn) {
        return new C2372Vm(c2373Vn.A00(), c2373Vn.A01());
    }

    public final AdErrorType A03() {
        return this.A00;
    }

    public final String A04() {
        return this.A01;
    }
}
