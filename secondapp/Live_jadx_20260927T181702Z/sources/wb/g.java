package wb;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class g implements a<byte[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f142644a = "ByteArrayPool";

    @Override // wb.a
    public int b() {
        return 1;
    }

    @Override // wb.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int a(byte[] bArr) {
        return bArr.length;
    }

    @Override // wb.a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public byte[] newArray(int i10) {
        return new byte[i10];
    }

    @Override // wb.a
    public String getTag() {
        return f142644a;
    }
}
