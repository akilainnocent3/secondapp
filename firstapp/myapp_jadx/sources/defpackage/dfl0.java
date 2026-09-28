package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class dfl0 extends jfl0 {
    public final int d;

    public dfl0(int i, byte[] bArr) {
        super(bArr);
        lfl0.i(0, i, bArr.length);
        this.d = i;
    }

    @Override // defpackage.jfl0, defpackage.lfl0
    public final byte a(int i) {
        int i2 = this.d;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.c[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(t7l.b(i, "Index < 0: ", new StringBuilder(String.valueOf(i).length() + 11)));
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 18 + String.valueOf(i2).length());
        sb.append("Index > length: ");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        throw new ArrayIndexOutOfBoundsException(sb.toString());
    }

    @Override // defpackage.jfl0, defpackage.lfl0
    public final byte b(int i) {
        return this.c[i];
    }

    @Override // defpackage.jfl0, defpackage.lfl0
    public final int c() {
        return this.d;
    }
}
