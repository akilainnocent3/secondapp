package com.facebook.ads.redexgen.core;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2846fq {
    public float A00;
    public EnumC2124Lr A01;
    public Map<String, String> A02;

    public C2846fq(EnumC2124Lr enumC2124Lr) {
        this(enumC2124Lr, 0.0f);
    }

    public C2846fq(EnumC2124Lr enumC2124Lr, float f10) {
        this(enumC2124Lr, f10, null);
    }

    public C2846fq(@Nullable EnumC2124Lr enumC2124Lr, float f10, Map<String, String> windowParams) {
        this.A01 = enumC2124Lr;
        this.A00 = f10;
        if (windowParams != null) {
            this.A02 = windowParams;
        } else {
            this.A02 = new HashMap();
        }
    }

    public final float A00() {
        return this.A00;
    }

    public final int A01() {
        return this.A01.A03();
    }

    public final EnumC2124Lr A02() {
        return this.A01;
    }

    public final Map<String, String> A03() {
        return this.A02;
    }

    public final boolean A04() {
        return this.A01 == EnumC2124Lr.A0I;
    }
}
