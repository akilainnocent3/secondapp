package x8;

import cv.k0;
import java.util.Arrays;
import java.util.Objects;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@j8.q.b
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final byte[] f144739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final String f144740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public final byte[] f144741c;

    public a(@oy.l byte[] encryptedTopic, @oy.l String keyIdentifier, @oy.l byte[] encapsulatedKey) {
        m0.p(encryptedTopic, "encryptedTopic");
        m0.p(keyIdentifier, "keyIdentifier");
        m0.p(encapsulatedKey, "encapsulatedKey");
        this.f144739a = encryptedTopic;
        this.f144740b = keyIdentifier;
        this.f144741c = encapsulatedKey;
    }

    @oy.l
    public final byte[] a() {
        return this.f144741c;
    }

    @oy.l
    public final byte[] b() {
        return this.f144739a;
    }

    @oy.l
    public final String c() {
        return this.f144740b;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Arrays.equals(this.f144739a, aVar.f144739a) && this.f144740b.contentEquals(aVar.f144740b) && Arrays.equals(this.f144741c, aVar.f144741c);
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(Arrays.hashCode(this.f144739a)), this.f144740b, Integer.valueOf(Arrays.hashCode(this.f144741c)));
    }

    @oy.l
    public String toString() {
        return "EncryptedTopic { " + ("EncryptedTopic=" + k0.U1(this.f144739a) + ", KeyIdentifier=" + this.f144740b + ", EncapsulatedKey=" + k0.U1(this.f144741c) + " }");
    }
}
