package xk;

import androidx.annotation.NonNull;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends OutputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f145311b = 0;

    public long d() {
        return this.f145311b;
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        this.f145311b++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.f145311b += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(@NonNull byte[] bArr, int i10, int i11) {
        int i12;
        if (i10 >= 0 && i10 <= bArr.length && i11 >= 0 && (i12 = i10 + i11) <= bArr.length && i12 >= 0) {
            this.f145311b += (long) i11;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
