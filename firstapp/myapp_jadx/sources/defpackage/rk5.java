package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rk5 implements nw0<byte[]> {
    @Override // defpackage.nw0
    public final int a() {
        return 1;
    }

    @Override // defpackage.nw0
    public final int b(byte[] bArr) {
        return bArr.length;
    }

    @Override // defpackage.nw0
    public final String getTag() {
        return "ByteArrayPool";
    }

    @Override // defpackage.nw0
    public final byte[] newArray(int i) {
        return new byte[i];
    }
}
