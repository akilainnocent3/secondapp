package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class gm0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final gm0 f149685c = new gm0(1, "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCznqFqHos01bT613or9cQ8OWXEB0nvx8UZ//V75T+fb1IDn1/lPBwGY/OK5RfQYuqeIKoKasqfwtRo3sr8dJ+SDm29Brh3lV9r+apohla+GIAyYd5wcJugMfVH5z9SBxh19ukg+GiIvvDpmgi0M8gNVo6Nk21tkEgFxc9FfdT/HwIDAQAB");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f149686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f149687b;

    public gm0(int i10, String str) {
        this.f149686a = str;
        this.f149687b = i10;
    }

    public final String a() {
        return this.f149686a;
    }

    public final int b() {
        return this.f149687b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gm0)) {
            return false;
        }
        gm0 gm0Var = (gm0) obj;
        return kotlin.jvm.internal.m0.g(this.f149686a, gm0Var.f149686a) && this.f149687b == gm0Var.f149687b;
    }

    public final int hashCode() {
        return this.f149687b + (this.f149686a.hashCode() * 31);
    }

    public final String toString() {
        return "EncryptionParameters(publicKey=" + this.f149686a + ", version=" + this.f149687b + gi.j.f86771d;
    }
}
