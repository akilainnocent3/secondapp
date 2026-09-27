package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.bridge.fbsdk.FBLoginASID;
import com.facebook.ads.internal.bridge.gms.AdvertisingId;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.util.Arrays;
import zi.c;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ao, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2536ao implements TD {
    public static byte[] A01;
    public final T8 A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 57);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-20, c.C, c.f161639q, c.G, c.D, c.f161646x, c.f161639q};
    }

    public C2536ao(T8 t10) {
        this.A00 = t10;
    }

    @Override // com.facebook.ads.redexgen.core.TD
    public final String A79() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.TD
    public final String A86() {
        return WI.A02(this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.TD
    public final String A87() {
        return FBLoginASID.getFBLoginASID();
    }

    @Override // com.facebook.ads.redexgen.core.TD
    public final String A8V() {
        return AdInternalSettings.getMediationService();
    }

    @Override // com.facebook.ads.redexgen.core.TD
    public final String A8c() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.TD
    public final TC A8x() {
        AdvertisingId advertisingIdInfoDirectly = AdvertisingId.getAdvertisingIdInfoDirectly(this.A00);
        if (advertisingIdInfoDirectly == null) {
            return null;
        }
        return new C2545ax(this, advertisingIdInfoDirectly);
    }

    @Override // com.facebook.ads.redexgen.core.TD
    public final String A9Q() {
        return AdInternalSettings.getUrlPrefix();
    }

    @Override // com.facebook.ads.redexgen.core.TD
    public final String A9S() {
        return A00(0, 7, 114);
    }

    @Override // com.facebook.ads.redexgen.core.TD
    public final String A9T() {
        return BuildConfigApi.getVersionName(this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.TD
    public final boolean AAO() {
        return BuildConfigApi.isDebug();
    }
}
