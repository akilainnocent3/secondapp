package yads;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class y83 extends Cdo {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f158182i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f158183j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f158184k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f158185l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte[] f158186m = ib3.f150521f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f158187n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f158188o;

    @Override // yads.Cdo, yads.bl
    public final ByteBuffer a() {
        int i10;
        if (super.isEnded() && (i10 = this.f158187n) > 0) {
            a(i10).put(this.f158186m, 0, this.f158187n).flip();
            this.f158187n = 0;
        }
        ByteBuffer byteBuffer = this.f148286g;
        this.f148286g = bl.f147231a;
        return byteBuffer;
    }

    @Override // yads.Cdo
    public final zk b(zk zkVar) throws al {
        if (zkVar.f158887c != 2) {
            throw new al(zkVar);
        }
        this.f158184k = true;
        return (this.f158182i == 0 && this.f158183j == 0) ? zk.f158884e : zkVar;
    }

    @Override // yads.Cdo
    public final void c() {
        if (this.f158184k) {
            this.f158184k = false;
            int i10 = this.f158183j;
            int i11 = this.f148281b.f158888d;
            this.f158186m = new byte[i10 * i11];
            this.f158185l = this.f158182i * i11;
        }
        this.f158187n = 0;
    }

    @Override // yads.Cdo
    public final void d() {
        if (this.f158184k) {
            int i10 = this.f158187n;
            if (i10 > 0) {
                this.f158188o += (long) (i10 / this.f148281b.f158888d);
            }
            this.f158187n = 0;
        }
    }

    @Override // yads.Cdo
    public final void e() {
        this.f158186m = ib3.f150521f;
    }

    @Override // yads.Cdo, yads.bl
    public final boolean isEnded() {
        return super.isEnded() && this.f158187n == 0;
    }

    @Override // yads.bl
    public final void a(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        if (i10 == 0) {
            return;
        }
        int iMin = Math.min(i10, this.f158185l);
        this.f158188o += (long) (iMin / this.f148281b.f158888d);
        this.f158185l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f158185l > 0) {
            return;
        }
        int i11 = i10 - iMin;
        int length = (this.f158187n + i11) - this.f158186m.length;
        ByteBuffer byteBufferA = a(length);
        int i12 = this.f158187n;
        int i13 = ib3.f150516a;
        int iMax = Math.max(0, Math.min(length, i12));
        byteBufferA.put(this.f158186m, 0, iMax);
        int iMax2 = Math.max(0, Math.min(length - iMax, i11));
        byteBuffer.limit(byteBuffer.position() + iMax2);
        byteBufferA.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i14 = i11 - iMax2;
        int i15 = this.f158187n - iMax;
        this.f158187n = i15;
        byte[] bArr = this.f158186m;
        System.arraycopy(bArr, iMax, bArr, 0, i15);
        byteBuffer.get(this.f158186m, this.f158187n, i14);
        this.f158187n += i14;
        byteBufferA.flip();
    }
}
