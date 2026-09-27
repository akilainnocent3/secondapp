package af;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class x implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f5010b;

    public x(n nVar) {
        this.f5010b = nVar;
    }

    @Override // af.n
    public boolean advancePeekPosition(int i10, boolean z10) throws IOException {
        return this.f5010b.advancePeekPosition(i10, z10);
    }

    @Override // af.n
    public int b(byte[] bArr, int i10, int i11) throws IOException {
        return this.f5010b.b(bArr, i10, i11);
    }

    @Override // af.n
    public long getLength() {
        return this.f5010b.getLength();
    }

    @Override // af.n
    public long getPeekPosition() {
        return this.f5010b.getPeekPosition();
    }

    @Override // af.n
    public long getPosition() {
        return this.f5010b.getPosition();
    }

    @Override // af.n
    public boolean peekFully(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        return this.f5010b.peekFully(bArr, i10, i11, z10);
    }

    @Override // af.n, ah.r
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        return this.f5010b.read(bArr, i10, i11);
    }

    @Override // af.n
    public boolean readFully(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        return this.f5010b.readFully(bArr, i10, i11, z10);
    }

    @Override // af.n
    public void resetPeekPosition() {
        this.f5010b.resetPeekPosition();
    }

    @Override // af.n
    public <E extends Throwable> void setRetryPosition(long j10, E e10) throws Throwable {
        this.f5010b.setRetryPosition(j10, e10);
    }

    @Override // af.n
    public int skip(int i10) throws IOException {
        return this.f5010b.skip(i10);
    }

    @Override // af.n
    public boolean skipFully(int i10, boolean z10) throws IOException {
        return this.f5010b.skipFully(i10, z10);
    }

    @Override // af.n
    public void advancePeekPosition(int i10) throws IOException {
        this.f5010b.advancePeekPosition(i10);
    }

    @Override // af.n
    public void peekFully(byte[] bArr, int i10, int i11) throws IOException {
        this.f5010b.peekFully(bArr, i10, i11);
    }

    @Override // af.n
    public void readFully(byte[] bArr, int i10, int i11) throws IOException {
        this.f5010b.readFully(bArr, i10, i11);
    }

    @Override // af.n
    public void skipFully(int i10) throws IOException {
        this.f5010b.skipFully(i10);
    }
}
