package io.appmetrica.analytics.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class I8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ec f95931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ec f95932b;

    public I8() {
        this(new W7(), new M9(), new C4928b());
    }

    public I8(W7 w10, M9 m10, C4928b c4928b) {
        Ec ec2 = new Ec(w10);
        this.f95931a = ec2;
        ec2.a(J8.NONE, w10);
        ec2.a(J8.EXTERNALLY_ENCRYPTED_EVENT_CRYPTER, m10);
        ec2.a(J8.AES_VALUE_ENCRYPTION, c4928b);
        this.f95932b = new Ec(w10);
    }
}
