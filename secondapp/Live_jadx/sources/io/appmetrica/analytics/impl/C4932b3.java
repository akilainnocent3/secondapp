package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.b3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class C4932b3 implements InterfaceC4958c3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f96996a;

    public C4932b3(int i10) {
        this.f96996a = i10;
    }

    public static InterfaceC4958c3 a(InterfaceC4958c3... interfaceC4958c3Arr) {
        return new C4932b3(b(interfaceC4958c3Arr));
    }

    public static int b(InterfaceC4958c3... interfaceC4958c3Arr) {
        int bytesTruncated = 0;
        for (InterfaceC4958c3 interfaceC4958c3 : interfaceC4958c3Arr) {
            if (interfaceC4958c3 != null) {
                bytesTruncated = interfaceC4958c3.getBytesTruncated() + bytesTruncated;
            }
        }
        return bytesTruncated;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4958c3
    public final int getBytesTruncated() {
        return this.f96996a;
    }

    public String toString() {
        return "BytesTruncatedInfo{bytesTruncated=" + this.f96996a + fw.b.f85383j;
    }
}
