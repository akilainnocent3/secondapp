package yads;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ty2 extends Cdo {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f156128i = te.r0.f136799u;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f156129j = 20000;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final short f156130k = 1024;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f156131l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f156132m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte[] f156133n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public byte[] f156134o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f156135p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f156136q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f156137r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f156138s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f156139t;

    public ty2(int i10) {
        byte[] bArr = ib3.f150521f;
        this.f156133n = bArr;
        this.f156134o = bArr;
    }

    @Override // yads.bl
    public final void a(ByteBuffer byteBuffer) {
        int iLimit;
        int iLimit2;
        int iPosition;
        while (byteBuffer.hasRemaining() && !this.f148286g.hasRemaining()) {
            int i10 = this.f156135p;
            if (i10 == 0) {
                int iLimit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit3, byteBuffer.position() + this.f156133n.length));
                int iLimit4 = byteBuffer.limit() - 2;
                while (true) {
                    if (iLimit4 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    } else {
                        if (Math.abs((int) byteBuffer.getShort(iLimit4)) > this.f156130k) {
                            int i11 = this.f156131l;
                            iPosition = ((iLimit4 / i11) * i11) + i11;
                            break;
                        }
                        iLimit4 -= 2;
                    }
                }
                if (iPosition == byteBuffer.position()) {
                    this.f156135p = 1;
                } else {
                    byteBuffer.limit(iPosition);
                    int iRemaining = byteBuffer.remaining();
                    a(iRemaining).put(byteBuffer).flip();
                    if (iRemaining > 0) {
                        this.f156138s = true;
                    }
                }
                byteBuffer.limit(iLimit3);
            } else if (i10 == 1) {
                int iLimit5 = byteBuffer.limit();
                int iPosition2 = byteBuffer.position();
                while (true) {
                    if (iPosition2 >= byteBuffer.limit()) {
                        iLimit2 = byteBuffer.limit();
                        break;
                    } else {
                        if (Math.abs((int) byteBuffer.getShort(iPosition2)) > this.f156130k) {
                            int i12 = this.f156131l;
                            iLimit2 = (iPosition2 / i12) * i12;
                            break;
                        }
                        iPosition2 += 2;
                    }
                }
                int iPosition3 = iLimit2 - byteBuffer.position();
                byte[] bArr = this.f156133n;
                int length = bArr.length;
                int i13 = this.f156136q;
                int i14 = length - i13;
                if (iLimit2 >= iLimit5 || iPosition3 >= i14) {
                    int iMin = Math.min(iPosition3, i14);
                    byteBuffer.limit(byteBuffer.position() + iMin);
                    byteBuffer.get(this.f156133n, this.f156136q, iMin);
                    int i15 = this.f156136q + iMin;
                    this.f156136q = i15;
                    byte[] bArr2 = this.f156133n;
                    if (i15 == bArr2.length) {
                        if (this.f156138s) {
                            int i16 = this.f156137r;
                            a(i16).put(bArr2, 0, i16).flip();
                            if (i16 > 0) {
                                this.f156138s = true;
                            }
                            this.f156139t += (long) ((this.f156136q - (this.f156137r * 2)) / this.f156131l);
                        } else {
                            this.f156139t += (long) ((i15 - this.f156137r) / this.f156131l);
                        }
                        byte[] bArr3 = this.f156133n;
                        int i17 = this.f156136q;
                        int iMin2 = Math.min(byteBuffer.remaining(), this.f156137r);
                        int i18 = this.f156137r - iMin2;
                        System.arraycopy(bArr3, i17 - i18, this.f156134o, 0, i18);
                        byteBuffer.position(byteBuffer.limit() - iMin2);
                        byteBuffer.get(this.f156134o, i18, iMin2);
                        this.f156136q = 0;
                        this.f156135p = 2;
                    }
                    byteBuffer.limit(iLimit5);
                } else {
                    a(i13).put(bArr, 0, i13).flip();
                    if (i13 > 0) {
                        this.f156138s = true;
                    }
                    this.f156136q = 0;
                    this.f156135p = 0;
                }
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException();
                }
                int iLimit6 = byteBuffer.limit();
                int iPosition4 = byteBuffer.position();
                while (true) {
                    if (iPosition4 >= byteBuffer.limit()) {
                        iLimit = byteBuffer.limit();
                        break;
                    } else {
                        if (Math.abs((int) byteBuffer.getShort(iPosition4)) > this.f156130k) {
                            int i19 = this.f156131l;
                            iLimit = (iPosition4 / i19) * i19;
                            break;
                        }
                        iPosition4 += 2;
                    }
                }
                byteBuffer.limit(iLimit);
                this.f156139t += (long) (byteBuffer.remaining() / this.f156131l);
                byte[] bArr4 = this.f156134o;
                int i20 = this.f156137r;
                int iMin3 = Math.min(byteBuffer.remaining(), this.f156137r);
                int i21 = this.f156137r - iMin3;
                System.arraycopy(bArr4, i20 - i21, this.f156134o, 0, i21);
                byteBuffer.position(byteBuffer.limit() - iMin3);
                byteBuffer.get(this.f156134o, i21, iMin3);
                if (iLimit < iLimit6) {
                    byte[] bArr5 = this.f156134o;
                    int i22 = this.f156137r;
                    a(i22).put(bArr5, 0, i22).flip();
                    if (i22 > 0) {
                        this.f156138s = true;
                    }
                    this.f156135p = 0;
                    byteBuffer.limit(iLimit6);
                }
            }
        }
    }

    @Override // yads.Cdo
    public final zk b(zk zkVar) throws al {
        if (zkVar.f158887c == 2) {
            return this.f156132m ? zkVar : zk.f158884e;
        }
        throw new al(zkVar);
    }

    @Override // yads.Cdo
    public final void c() {
        if (this.f156132m) {
            zk zkVar = this.f148281b;
            int i10 = zkVar.f158888d;
            this.f156131l = i10;
            long j10 = this.f156128i;
            long j11 = zkVar.f158885a;
            int i11 = ((int) ((j10 * j11) / 1000000)) * i10;
            if (this.f156133n.length != i11) {
                this.f156133n = new byte[i11];
            }
            int i12 = ((int) ((this.f156129j * j11) / 1000000)) * i10;
            this.f156137r = i12;
            if (this.f156134o.length != i12) {
                this.f156134o = new byte[i12];
            }
        }
        this.f156135p = 0;
        this.f156139t = 0L;
        this.f156136q = 0;
        this.f156138s = false;
    }

    @Override // yads.Cdo
    public final void d() {
        int i10 = this.f156136q;
        if (i10 > 0) {
            a(i10).put(this.f156133n, 0, i10).flip();
            if (i10 > 0) {
                this.f156138s = true;
            }
        }
        if (this.f156138s) {
            return;
        }
        this.f156139t += (long) (this.f156137r / this.f156131l);
    }

    @Override // yads.Cdo
    public final void e() {
        this.f156132m = false;
        this.f156137r = 0;
        byte[] bArr = ib3.f150521f;
        this.f156133n = bArr;
        this.f156134o = bArr;
    }

    @Override // yads.Cdo, yads.bl
    public final boolean isActive() {
        return this.f156132m;
    }
}
