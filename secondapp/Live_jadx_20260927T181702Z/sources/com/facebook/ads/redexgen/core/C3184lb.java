package com.facebook.ads.redexgen.core;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3184lb implements InterfaceC2064Jj {
    public static String[] A01 = {"5dk9XJP2wGzKf", "t9Sqq8YLjeTrFPP9jF9lF", "ZSSLQReFK2RnB4Tl20", "6LiPtiUXCvNXZPkDmbiLO", "ML1syn76y5DaiFADQPhnbgz9k8Qidn9e", "l6QdmjZcy6MGH", "", "GeXYkzAGCbUHzEIcx9bq6WN7r3"};
    public static final C3184lb A02 = new C3184lb();
    public final List<C3410pT> A00;

    public C3184lb() {
        this.A00 = Collections.emptyList();
    }

    public C3184lb(C3410pT c3410pT) {
        this.A00 = Collections.singletonList(c3410pT);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2064Jj
    public final List<C3410pT> A7X(long j10) {
        return j10 >= 0 ? this.A00 : Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2064Jj
    public final long A83(int i10) {
        AbstractC16843y.A07(i10 == 0);
        if (A01[5].length() != 13) {
            throw new RuntimeException();
        }
        A01[7] = "BSEyCnkUJKVAglTMpAGc69o360";
        return 0L;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2064Jj
    public final int A84() {
        return 1;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2064Jj
    public final int A8a(long j10) {
        return j10 < 0 ? 0 : -1;
    }
}
