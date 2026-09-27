package f6;

import java.io.IOException;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public class g0 implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f83474a;

    public g0(v vVar) {
        this.f83474a = vVar;
    }

    @Override // f6.v
    public boolean advancePeekPosition(int i10, boolean z10) throws IOException {
        return this.f83474a.advancePeekPosition(i10, z10);
    }

    @Override // f6.v
    public int b(byte[] bArr, int i10, int i11) throws IOException {
        return this.f83474a.b(bArr, i10, i11);
    }

    @Override // f6.v
    public long getLength() {
        return this.f83474a.getLength();
    }

    @Override // f6.v
    public long getPeekPosition() {
        return this.f83474a.getPeekPosition();
    }

    @Override // f6.v
    public long getPosition() {
        return this.f83474a.getPosition();
    }

    @Override // f6.v
    public boolean peekFully(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        return this.f83474a.peekFully(bArr, i10, i11, z10);
    }

    @Override // f6.v, u4.c0
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        return this.f83474a.read(bArr, i10, i11);
    }

    @Override // f6.v
    public boolean readFully(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        return this.f83474a.readFully(bArr, i10, i11, z10);
    }

    @Override // f6.v
    public void resetPeekPosition() {
        this.f83474a.resetPeekPosition();
    }

    @Override // f6.v
    public <E extends Throwable> void setRetryPosition(long j10, E e10) throws Throwable {
        this.f83474a.setRetryPosition(j10, e10);
    }

    @Override // f6.v
    public int skip(int i10) throws IOException {
        return this.f83474a.skip(i10);
    }

    @Override // f6.v
    public boolean skipFully(int i10, boolean z10) throws IOException {
        return this.f83474a.skipFully(i10, z10);
    }

    @Override // f6.v
    public void advancePeekPosition(int i10) throws IOException {
        this.f83474a.advancePeekPosition(i10);
    }

    @Override // f6.v
    public void peekFully(byte[] bArr, int i10, int i11) throws IOException {
        this.f83474a.peekFully(bArr, i10, i11);
    }

    @Override // f6.v
    public void readFully(byte[] bArr, int i10, int i11) throws IOException {
        this.f83474a.readFully(bArr, i10, i11);
    }

    @Override // f6.v
    public void skipFully(int i10) throws IOException {
        this.f83474a.skipFully(i10);
    }
}
