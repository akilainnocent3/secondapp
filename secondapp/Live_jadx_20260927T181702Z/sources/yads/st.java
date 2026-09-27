package yads;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class st extends Cdo {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f155543i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f155544j;

    @Override // yads.bl
    public final void a(ByteBuffer byteBuffer) {
        int[] iArr = this.f155544j;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferA = a(((iLimit - iPosition) / this.f148281b.f158888d) * this.f148282c.f158888d);
        while (iPosition < iLimit) {
            for (int i10 : iArr) {
                byteBufferA.putShort(byteBuffer.getShort((i10 * 2) + iPosition));
            }
            iPosition += this.f148281b.f158888d;
        }
        byteBuffer.position(iLimit);
        byteBufferA.flip();
    }

    @Override // yads.Cdo
    public final zk b(zk zkVar) throws al {
        int[] iArr = this.f155543i;
        if (iArr == null) {
            return zk.f158884e;
        }
        if (zkVar.f158887c != 2) {
            throw new al(zkVar);
        }
        boolean z10 = zkVar.f158886b != iArr.length;
        int i10 = 0;
        while (i10 < iArr.length) {
            int i11 = iArr[i10];
            if (i11 >= zkVar.f158886b) {
                throw new al(zkVar);
            }
            z10 |= i11 != i10;
            i10++;
        }
        return z10 ? new zk(zkVar.f158885a, iArr.length, 2) : zk.f158884e;
    }

    @Override // yads.Cdo
    public final void c() {
        this.f155544j = this.f155543i;
    }

    @Override // yads.Cdo
    public final void e() {
        this.f155544j = null;
        this.f155543i = null;
    }
}
