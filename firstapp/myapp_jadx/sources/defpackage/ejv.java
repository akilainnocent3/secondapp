package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import androidx.media3.exoplayer.k;
import com.sporty.android.core.model.pocket.withdraw.partner.RX.oAudzpbdOhCI;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class ejv extends androidx.media3.exoplayer.b {
    public static final byte[] Q0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public boolean A0;
    public long B0;
    public long C0;
    public boolean D0;
    public boolean E0;
    public boolean F0;
    public boolean G0;
    public final viv.b H;
    public rwg H0;
    public final float I;
    public e5d I0;
    public final g5d J;
    public d J0;
    public final g5d K;
    public long K0;
    public final g5d L;
    public boolean L0;
    public final cd2 M;
    public boolean M0;
    public final MediaCodec.BufferInfo N;
    public boolean N0;
    public final ArrayDeque<d> O;
    public long O0;
    public final uly P;
    public long P0;
    public androidx.media3.common.a Q;
    public androidx.media3.common.a R;
    public lef S;
    public lef T;
    public k.a U;
    public MediaCrypto V;
    public float W;
    public float X;
    public viv Y;
    public androidx.media3.common.a Z;
    public MediaFormat a0;
    public boolean b0;
    public float c0;
    public ArrayDeque<ziv> d0;
    public b e0;
    public ziv f0;
    public int g0;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public long l0;
    public long m0;
    public int n0;
    public int o0;
    public ByteBuffer p0;
    public boolean q0;
    public boolean r0;
    public boolean s0;
    public boolean t0;
    public boolean u0;
    public int v0;
    public int w0;
    public int x0;
    public boolean y0;
    public boolean z0;

    public static final class a {
        public static void a(viv.a aVar, sp10 sp10Var) {
            LogSessionId logSessionIdA = sp10Var.a();
            if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            aVar.b.setString("log-session-id", logSessionIdA.getStringId());
        }
    }

    public final class c {
        public c() {
        }
    }

    public static final class d {
        public static final d e = new d(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L);
        public final long a;
        public final long b;
        public final long c;
        public final pxf0<androidx.media3.common.a> d = new pxf0<>();

        public d(long j, long j2, long j3) {
            this.a = j;
            this.b = j2;
            this.c = j3;
        }
    }

    public ejv(int i, viv.b bVar, float f) {
        super(i);
        this.H = bVar;
        this.I = f;
        this.J = new g5d(0);
        this.K = new g5d(0);
        this.L = new g5d(2);
        cd2 cd2Var = new cd2(2);
        cd2Var.z = 32;
        this.M = cd2Var;
        this.N = new MediaCodec.BufferInfo();
        this.W = 1.0f;
        this.X = 1.0f;
        this.O = new ArrayDeque<>();
        this.J0 = d.e;
        cd2Var.l(0);
        cd2Var.d.order(ByteOrder.nativeOrder());
        uly ulyVar = new uly();
        ulyVar.a = j31.a;
        ulyVar.c = 0;
        ulyVar.b = 2;
        this.P = ulyVar;
        this.c0 = -1.0f;
        this.g0 = 0;
        this.v0 = 0;
        this.n0 = -1;
        this.o0 = -1;
        this.m0 = -9223372036854775807L;
        this.B0 = -9223372036854775807L;
        this.C0 = -9223372036854775807L;
        this.K0 = -9223372036854775807L;
        this.l0 = -9223372036854775807L;
        this.w0 = 0;
        this.x0 = 0;
        this.I0 = new e5d();
        this.O0 = -9223372036854775807L;
        this.P0 = -9223372036854775807L;
    }

    public boolean A0(g5d g5dVar) {
        return false;
    }

    public boolean B0() {
        return true;
    }

    public boolean C0(ziv zivVar) {
        return true;
    }

    public boolean D0() {
        int i = this.x0;
        if (i == 3 || (this.h0 && !this.A0)) {
            return true;
        }
        if (i != 2) {
            return false;
        }
        try {
            H0();
            return false;
        } catch (rwg e) {
            cft.h("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
            return true;
        }
    }

    @Override // androidx.media3.exoplayer.b
    public void E() {
        this.Q = null;
        z0(d.e);
        this.O.clear();
        if (!this.r0) {
            U();
        } else {
            this.r0 = false;
            v0();
        }
    }

    public boolean E0(androidx.media3.common.a aVar) {
        return false;
    }

    public abstract int F0(androidx.media3.common.a aVar);

    @Override // androidx.media3.exoplayer.b
    public void G(long j, boolean z) {
        this.D0 = false;
        this.E0 = false;
        this.G0 = false;
        if (this.r0) {
            v0();
        } else if (U()) {
            e0();
        }
        if (this.J0.d.h() > 0) {
            this.F0 = true;
        }
        this.J0.d.b();
        this.O.clear();
    }

    public final boolean G0(androidx.media3.common.a aVar) {
        if (this.Y != null && this.x0 != 3 && this.v != 0) {
            float f = this.X;
            aVar.getClass();
            androidx.media3.common.a[] aVarArr = this.y;
            aVarArr.getClass();
            float fX = X(f, aVar, aVarArr);
            float f2 = this.c0;
            if (f2 != fX) {
                if (fX == -1.0f) {
                    if (this.y0) {
                        this.w0 = 1;
                        this.x0 = 3;
                        return false;
                    }
                    t0();
                    e0();
                    return false;
                }
                if (f2 != -1.0f || fX > this.I) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fX);
                    viv vivVar = this.Y;
                    vivVar.getClass();
                    vivVar.b(bundle);
                    this.c0 = fX;
                }
            }
        }
        return true;
    }

    public final void H0() throws rwg {
        lef lefVar = this.T;
        lefVar.getClass();
        if (lefVar.h() != null) {
            try {
                MediaCrypto mediaCrypto = this.V;
                mediaCrypto.getClass();
                mediaCrypto.setMediaDrmSession(null);
            } catch (MediaCryptoException e) {
                throw D(e, this.Q, false, 6006);
            }
        }
        y0(this.T);
        this.w0 = 0;
        this.x0 = 0;
    }

    public final void I0(long j) {
        androidx.media3.common.a aVarF = this.J0.d.f(j);
        if (aVarF == null && this.L0 && this.a0 != null) {
            aVarF = this.J0.d.e();
        }
        if (aVarF != null) {
            this.R = aVarF;
        } else if (!this.b0 || (aVarF = this.R) == null) {
            return;
        }
        l0(aVarF, this.a0);
        this.b0 = false;
        this.L0 = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r4 >= r0) goto L16;
     */
    @Override // androidx.media3.exoplayer.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void L(androidx.media3.common.a[] r12, long r13, long r15, ekv.b r17) {
        /*
            r11 = this;
            ejv$d r12 = r11.J0
            long r0 = r12.c
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L24
            ejv$d r4 = new ejv$d
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.z0(r4)
            boolean r12 = r11.M0
            if (r12 == 0) goto L56
            r11.o0()
            return
        L24:
            java.util.ArrayDeque<ejv$d> r12 = r11.O
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L57
            long r0 = r11.B0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L3c
            long r4 = r11.K0
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L57
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L57
        L3c:
            ejv$d r4 = new ejv$d
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.z0(r4)
            ejv$d r12 = r11.J0
            long r12 = r12.c
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 == 0) goto L56
            r11.o0()
        L56:
            return
        L57:
            ejv$d r0 = new ejv$d
            long r1 = r11.B0
            r3 = r13
            r5 = r15
            r0.<init>(r1, r3, r5)
            r12.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ejv.L(androidx.media3.common.a[], long, long, ekv$b):void");
    }

    /* JADX WARN: Code duplicated, block: B:114:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:117:0x0302 A[LOOP:0: B:25:0x0090->B:117:0x0302, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:136:0x0300 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r24v0, types: [androidx.media3.exoplayer.b, ejv] */
    /* JADX WARN: Type inference failed for: r28v0 */
    /* JADX WARN: Type inference failed for: r28v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r4v22, types: [int] */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    public final boolean N(long j, long j2) {
        cd2 cd2Var;
        ?? r4;
        ?? r28;
        ly0.f(!this.E0);
        cd2 cd2Var2 = this.M;
        if (cd2Var2.o()) {
            ByteBuffer byteBuffer = cd2Var2.d;
            int i = this.o0;
            int i2 = cd2Var2.y;
            long j3 = cd2Var2.f;
            boolean zD0 = d0(this.A, cd2Var2.w);
            boolean zI = cd2Var2.i(4);
            androidx.media3.common.a aVar = this.R;
            aVar.getClass();
            cd2Var = cd2Var2;
            if (r0(j, j2, null, byteBuffer, i, 0, i2, j3, zD0, zI, aVar)) {
                n0(cd2Var.w);
                cd2Var.j();
            }
        }
        cd2Var = cd2Var2;
        if (this.D0) {
            this.E0 = true;
            return false;
        }
        ?? r2 = 0;
        boolean z = this.s0;
        g5d g5dVar = this.L;
        if (z) {
            ly0.f(cd2Var.n(g5dVar));
            this.s0 = false;
        }
        if (this.t0) {
            if (cd2Var.o()) {
                return true;
            }
            this.r0 = false;
            v0();
            this.t0 = false;
            e0();
            if (!this.r0) {
                return false;
            }
        }
        ly0.f(!this.D0);
        yti ytiVar = this.c;
        ytiVar.a();
        g5dVar.j();
        while (true) {
            g5dVar.j();
            int iM = M(ytiVar, g5dVar, r2);
            if (iM == -5) {
                k0(ytiVar);
            } else if (iM != -4) {
                if (iM != -3) {
                    fm20.a();
                    return r2;
                }
                if (f()) {
                    this.C0 = this.B0;
                }
            } else if (g5dVar.i(4)) {
                this.D0 = true;
                this.C0 = this.B0;
            } else {
                this.B0 = Math.max(this.B0, g5dVar.f);
                if (f() || this.K.i(536870912)) {
                    this.C0 = this.B0;
                }
                byte[] bArr = null;
                if (this.F0) {
                    androidx.media3.common.a aVar2 = this.Q;
                    aVar2.getClass();
                    this.R = aVar2;
                    if (Objects.equals(aVar2.n, "audio/opus") && !this.R.q.isEmpty()) {
                        byte[] bArr2 = this.R.q.get(r2);
                        int i3 = (bArr2[10] & 255) | ((bArr2[11] & 255) << 8);
                        androidx.media3.common.a.C0062a c0062aA = this.R.a();
                        c0062aA.H = i3;
                        this.R = new androidx.media3.common.a(c0062aA);
                    }
                    l0(this.R, null);
                    this.F0 = r2;
                }
                g5dVar.m();
                androidx.media3.common.a aVar3 = this.R;
                if (aVar3 != null && Objects.equals(aVar3.n, "audio/opus")) {
                    if (g5dVar.i(268435456)) {
                        g5dVar.b = this.R;
                        b0(g5dVar);
                    }
                    if (this.A - g5dVar.f <= 80000) {
                        List<byte[]> list = this.R.q;
                        g5dVar.d.getClass();
                        if (g5dVar.d.limit() - g5dVar.d.position() != 0) {
                            uly ulyVar = this.P;
                            if (ulyVar.b == 2 && (list.size() == 1 || list.size() == 3)) {
                                bArr = list.get(r2);
                            }
                            ByteBuffer byteBuffer2 = g5dVar.d;
                            int iPosition = byteBuffer2.position();
                            int iLimit = byteBuffer2.limit();
                            int i4 = iLimit - iPosition;
                            int i5 = (i4 + 255) / 255;
                            int i6 = i5 + 27 + i4;
                            if (ulyVar.b == 2) {
                                int length = bArr != null ? bArr.length + 28 : 47;
                                i6 = (length == true ? 1 : 0) + 44 + i6;
                                r4 = length;
                            } else {
                                r4 = r2;
                            }
                            if (ulyVar.a.capacity() < i6) {
                                ulyVar.a = ByteBuffer.allocate(i6).order(ByteOrder.LITTLE_ENDIAN);
                            } else {
                                ulyVar.a.clear();
                            }
                            ByteBuffer byteBuffer3 = ulyVar.a;
                            if (ulyVar.b == 2) {
                                if (bArr != null) {
                                    uly.a(byteBuffer3, 0L, 0, 1, true);
                                    byteBuffer3.put(wh9.a(bArr.length));
                                    byteBuffer3.put(bArr);
                                    byteBuffer3.putInt(22, jrh0.o(byteBuffer3.arrayOffset(), bArr.length + 28, 0, byteBuffer3.array()));
                                    byteBuffer3.position(bArr.length + 28);
                                } else {
                                    byteBuffer3.put(uly.d);
                                }
                                byteBuffer3.put(uly.e);
                                r28 = r4;
                            } else {
                                r28 = r4 == true ? 1 : 0;
                                iLimit = iLimit;
                            }
                            int iB = ulyVar.c + ((int) ((xxf.b(byteBuffer2.get(0), byteBuffer2.limit() > 1 ? byteBuffer2.get(1) : (byte) 0) * 48000) / 1000000));
                            ulyVar.c = iB;
                            uly.a(byteBuffer3, iB, ulyVar.b, i5, false);
                            for (int i7 = 0; i7 < i5; i7++) {
                                if (i4 >= 255) {
                                    byteBuffer3.put((byte) -1);
                                    i4 -= 255;
                                } else {
                                    byteBuffer3.put((byte) i4);
                                    i4 = 0;
                                }
                            }
                            int i8 = iLimit;
                            while (iPosition < i8) {
                                byteBuffer3.put(byteBuffer2.get(iPosition));
                                iPosition++;
                            }
                            byteBuffer2.position(byteBuffer2.limit());
                            byteBuffer3.flip();
                            if (ulyVar.b == 2) {
                                byteBuffer3.putInt(r28 + 66, jrh0.o(byteBuffer3.arrayOffset() + r28 + 44, byteBuffer3.limit() - byteBuffer3.position(), 0, byteBuffer3.array()));
                            } else {
                                byteBuffer3.putInt(22, jrh0.o(byteBuffer3.arrayOffset(), byteBuffer3.limit() - byteBuffer3.position(), 0, byteBuffer3.array()));
                            }
                            ulyVar.b++;
                            ulyVar.a = byteBuffer3;
                            g5dVar.j();
                            g5dVar.l(ulyVar.a.remaining());
                            g5dVar.d.put(ulyVar.a);
                            g5dVar.m();
                        }
                    }
                }
                if (cd2Var.o()) {
                    long j4 = this.A;
                    if (d0(j4, cd2Var.w) == d0(j4, g5dVar.f)) {
                        if (!cd2Var.n(g5dVar)) {
                            r2 = 0;
                        }
                    }
                } else if (!cd2Var.n(g5dVar)) {
                    r2 = 0;
                }
                this.s0 = true;
            }
            if (cd2Var.o()) {
                cd2Var.m();
            }
            return cd2Var.o() || this.D0 || this.t0;
        }
    }

    public abstract i5d O(ziv zivVar, androidx.media3.common.a aVar, androidx.media3.common.a aVar2);

    public yiv P(IllegalStateException illegalStateException, ziv zivVar) {
        return new yiv(illegalStateException, zivVar);
    }

    public final boolean Q() throws rwg {
        if (!this.y0) {
            H0();
            return true;
        }
        this.w0 = 1;
        this.x0 = 2;
        return true;
    }

    public final boolean R(long j, long j2) throws rwg {
        boolean z;
        boolean z2;
        boolean z3;
        viv vivVar = this.Y;
        vivVar.getClass();
        int i = this.o0;
        MediaCodec.BufferInfo bufferInfo = this.N;
        if (i < 0) {
            int iN = vivVar.n(bufferInfo);
            if (iN < 0) {
                if (iN == -2) {
                    this.A0 = true;
                    viv vivVar2 = this.Y;
                    vivVar2.getClass();
                    MediaFormat mediaFormatE = vivVar2.e();
                    if (this.g0 != 0 && mediaFormatE.getInteger("width") == 32 && mediaFormatE.getInteger("height") == 32) {
                        this.j0 = true;
                        return true;
                    }
                    this.a0 = mediaFormatE;
                    this.b0 = true;
                    return true;
                }
                if (this.k0 && (this.D0 || this.w0 == 2)) {
                    q0();
                }
                long j3 = this.l0;
                if (j3 != -9223372036854775807L) {
                    long j4 = j3 + 100;
                    vs7 vs7Var = this.i;
                    vs7Var.getClass();
                    if (j4 < vs7Var.a()) {
                        q0();
                        return false;
                    }
                }
                return false;
            }
            if (this.j0) {
                this.j0 = false;
                vivVar.k(iN);
                return true;
            }
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                q0();
                return false;
            }
            this.o0 = iN;
            ByteBuffer byteBufferO = vivVar.o(iN);
            this.p0 = byteBufferO;
            if (byteBufferO != null) {
                byteBufferO.position(bufferInfo.offset);
                this.p0.limit(bufferInfo.offset + bufferInfo.size);
            }
            I0(bufferInfo.presentationTimeUs);
        }
        long j5 = bufferInfo.presentationTimeUs;
        boolean z4 = j5 < this.A;
        long j6 = this.C0;
        boolean z5 = j6 != -9223372036854775807L && j6 <= j5;
        this.q0 = z5;
        if (this.N0) {
            long j7 = this.O0;
            if (j7 == -9223372036854775807L || j5 > j7) {
                this.O0 = j5;
                this.q0 = false;
                z2 = false;
                z3 = false;
                z = true;
            } else {
                this.N0 = false;
                this.O0 = -9223372036854775807L;
                z = z4;
                z2 = false;
                z3 = z5;
            }
        } else {
            z = z4;
            z2 = false;
            z3 = z5;
        }
        ByteBuffer byteBuffer = this.p0;
        int i2 = this.o0;
        int i3 = bufferInfo.flags;
        androidx.media3.common.a aVar = this.R;
        aVar.getClass();
        boolean z6 = z2;
        if (!r0(j, j2, vivVar, byteBuffer, i2, i3, 1, j5, z, z3, aVar)) {
            return z6;
        }
        n0(bufferInfo.presentationTimeUs);
        boolean z7 = (bufferInfo.flags & 4) != 0 ? true : z6;
        if (!z7 && this.z0 && this.q0) {
            vs7 vs7Var2 = this.i;
            vs7Var2.getClass();
            this.l0 = vs7Var2.a();
        }
        this.o0 = -1;
        this.p0 = null;
        if (!z7) {
            return true;
        }
        q0();
        return z6;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0196  */
    /* JADX WARN: Code duplicated, block: B:103:0x019f  */
    /* JADX WARN: Code duplicated, block: B:106:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:107:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:116:0x0093 A[EDGE_INSN: B:116:0x0093->B:33:0x0093 BREAK  A[LOOP:0: B:30:0x0071->B:32:0x007e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0034  */
    /* JADX WARN: Code duplicated, block: B:20:0x0039  */
    /* JADX WARN: Code duplicated, block: B:23:0x004b  */
    /* JADX WARN: Code duplicated, block: B:25:0x004f  */
    /* JADX WARN: Code duplicated, block: B:27:0x006c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0070  */
    /* JADX WARN: Code duplicated, block: B:32:0x007e A[LOOP:0: B:30:0x0071->B:32:0x007e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00df  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:71:0x010d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0114  */
    /* JADX WARN: Code duplicated, block: B:76:0x011c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:80:0x0123  */
    /* JADX WARN: Code duplicated, block: B:84:0x0136  */
    /* JADX WARN: Code duplicated, block: B:86:0x013e  */
    /* JADX WARN: Code duplicated, block: B:87:0x014f  */
    /* JADX WARN: Code duplicated, block: B:91:0x016b  */
    /* JADX WARN: Code duplicated, block: B:93:0x0173  */
    /* JADX WARN: Code duplicated, block: B:96:0x0182  */
    /* JADX WARN: Code duplicated, block: B:99:0x0192  */
    public final boolean S() throws rwg {
        int iPosition;
        yti ytiVar;
        int iM;
        boolean zI;
        long j;
        int iW;
        d850 d850Var;
        int i;
        ArrayDeque<d> arrayDeque;
        int[] iArr;
        int i2;
        androidx.media3.common.a aVar;
        g5d g5dVar = this.K;
        v3c v3cVar = g5dVar.c;
        viv vivVar = this.Y;
        if (vivVar != null && this.w0 != 2 && !this.D0) {
            if (this.n0 < 0) {
                int iM2 = vivVar.m();
                this.n0 = iM2;
                if (iM2 >= 0) {
                    g5dVar.d = vivVar.i(iM2);
                    g5dVar.j();
                    if (this.w0 == 1) {
                        if (!this.k0) {
                            this.z0 = true;
                            vivVar.c(this.n0, 0, 4, 0L);
                            this.n0 = -1;
                            g5dVar.d = null;
                        }
                        this.w0 = 2;
                        return false;
                    }
                    if (this.i0) {
                        this.i0 = false;
                        ByteBuffer byteBuffer = g5dVar.d;
                        byteBuffer.getClass();
                        byteBuffer.put(Q0);
                        vivVar.c(this.n0, 38, 0, 0L);
                        this.n0 = -1;
                        g5dVar.d = null;
                        this.y0 = true;
                        return true;
                    }
                    if (this.v0 == 1) {
                        i2 = 0;
                        while (true) {
                            aVar = this.Z;
                            aVar.getClass();
                            if (i2 < aVar.q.size()) {
                                break;
                            }
                            byte[] bArr = this.Z.q.get(i2);
                            ByteBuffer byteBuffer2 = g5dVar.d;
                            byteBuffer2.getClass();
                            byteBuffer2.put(bArr);
                            i2++;
                        }
                        this.v0 = 2;
                    }
                    ByteBuffer byteBuffer3 = g5dVar.d;
                    byteBuffer3.getClass();
                    iPosition = byteBuffer3.position();
                    ytiVar = this.c;
                    ytiVar.a();
                    try {
                        iM = M(ytiVar, g5dVar, 0);
                        if (iM == -3) {
                            if (f()) {
                                this.C0 = this.B0;
                                return false;
                            }
                        } else {
                            if (iM == -5) {
                                if (this.v0 == 2) {
                                    g5dVar.j();
                                    this.v0 = 1;
                                }
                                k0(ytiVar);
                                return true;
                            }
                            if (g5dVar.i(4)) {
                                if (this.y0 && !g5dVar.i(1)) {
                                    g5dVar.j();
                                    if (this.v0 == 2) {
                                        this.v0 = 1;
                                        return true;
                                    }
                                } else if (!A0(g5dVar)) {
                                    zI = g5dVar.i(1073741824);
                                    if (zI && iPosition != 0) {
                                        iArr = v3cVar.d;
                                        if (iArr == null) {
                                            iArr = new int[1];
                                            v3cVar.d = iArr;
                                            v3cVar.i.numBytesOfClearData = iArr;
                                        }
                                        iArr[0] = iArr[0] + iPosition;
                                    }
                                    j = g5dVar.f;
                                    if (this.F0) {
                                        arrayDeque = this.O;
                                        if (arrayDeque.isEmpty()) {
                                            pxf0<androidx.media3.common.a> pxf0Var = this.J0.d;
                                            androidx.media3.common.a aVar2 = this.Q;
                                            aVar2.getClass();
                                            pxf0Var.a(aVar2, j);
                                        } else {
                                            pxf0<androidx.media3.common.a> pxf0Var2 = arrayDeque.peekLast().d;
                                            androidx.media3.common.a aVar3 = this.Q;
                                            aVar3.getClass();
                                            pxf0Var2.a(aVar3, j);
                                        }
                                        this.F0 = false;
                                    }
                                    this.B0 = Math.max(this.B0, j);
                                    if (f() || g5dVar.i(536870912)) {
                                        this.C0 = this.B0;
                                    }
                                    g5dVar.m();
                                    if (g5dVar.i(268435456)) {
                                        b0(g5dVar);
                                    }
                                    p0(g5dVar);
                                    iW = W(g5dVar);
                                    if (Build.VERSION.SDK_INT >= 34 || (iW & 32) == 0) {
                                        d850Var = this.d;
                                        d850Var.getClass();
                                        if (!d850Var.b) {
                                            this.P0 = Math.max(this.P0, g5dVar.f);
                                        }
                                    }
                                    i = this.n0;
                                    if (zI) {
                                        vivVar.a(i, v3cVar, j, iW);
                                    } else {
                                        ByteBuffer byteBuffer4 = g5dVar.d;
                                        byteBuffer4.getClass();
                                        vivVar.c(i, byteBuffer4.limit(), iW, j);
                                    }
                                    this.n0 = -1;
                                    g5dVar.d = null;
                                    this.y0 = true;
                                    this.v0 = 0;
                                    this.I0.c++;
                                    return true;
                                }
                                return true;
                            }
                            this.C0 = this.B0;
                            if (this.v0 == 2) {
                                g5dVar.j();
                                this.v0 = 1;
                            }
                            this.D0 = true;
                            if (!this.y0) {
                                q0();
                                return false;
                            }
                            if (!this.k0) {
                                this.z0 = true;
                                vivVar.c(this.n0, 0, 4, 0L);
                                this.n0 = -1;
                                g5dVar.d = null;
                                return false;
                            }
                        }
                    } catch (g5d.a e) {
                        h0(e);
                        s0(0);
                        T();
                        return true;
                    }
                }
            } else {
                if (this.w0 == 1) {
                    if (!this.k0) {
                        this.z0 = true;
                        vivVar.c(this.n0, 0, 4, 0L);
                        this.n0 = -1;
                        g5dVar.d = null;
                    }
                    this.w0 = 2;
                    return false;
                }
                if (this.i0) {
                    this.i0 = false;
                    ByteBuffer byteBuffer5 = g5dVar.d;
                    byteBuffer5.getClass();
                    byteBuffer5.put(Q0);
                    vivVar.c(this.n0, 38, 0, 0L);
                    this.n0 = -1;
                    g5dVar.d = null;
                    this.y0 = true;
                    return true;
                }
                if (this.v0 == 1) {
                    i2 = 0;
                    while (true) {
                        aVar = this.Z;
                        aVar.getClass();
                        if (i2 < aVar.q.size()) {
                            break;
                            break;
                        }
                        byte[] bArr2 = this.Z.q.get(i2);
                        ByteBuffer byteBuffer6 = g5dVar.d;
                        byteBuffer6.getClass();
                        byteBuffer6.put(bArr2);
                        i2++;
                    }
                    this.v0 = 2;
                }
                ByteBuffer byteBuffer7 = g5dVar.d;
                byteBuffer7.getClass();
                iPosition = byteBuffer7.position();
                ytiVar = this.c;
                ytiVar.a();
                iM = M(ytiVar, g5dVar, 0);
                if (iM == -3) {
                    if (f()) {
                        this.C0 = this.B0;
                        return false;
                    }
                } else {
                    if (iM == -5) {
                        if (this.v0 == 2) {
                            g5dVar.j();
                            this.v0 = 1;
                        }
                        k0(ytiVar);
                        return true;
                    }
                    if (g5dVar.i(4)) {
                        if (this.y0) {
                            if (!A0(g5dVar)) {
                                zI = g5dVar.i(1073741824);
                                if (zI) {
                                    iArr = v3cVar.d;
                                    if (iArr == null) {
                                        iArr = new int[1];
                                        v3cVar.d = iArr;
                                        v3cVar.i.numBytesOfClearData = iArr;
                                    }
                                    iArr[0] = iArr[0] + iPosition;
                                }
                                j = g5dVar.f;
                                if (this.F0) {
                                    arrayDeque = this.O;
                                    if (arrayDeque.isEmpty()) {
                                        pxf0<androidx.media3.common.a> pxf0Var3 = arrayDeque.peekLast().d;
                                        androidx.media3.common.a aVar4 = this.Q;
                                        aVar4.getClass();
                                        pxf0Var3.a(aVar4, j);
                                    } else {
                                        pxf0<androidx.media3.common.a> pxf0Var4 = this.J0.d;
                                        androidx.media3.common.a aVar5 = this.Q;
                                        aVar5.getClass();
                                        pxf0Var4.a(aVar5, j);
                                    }
                                    this.F0 = false;
                                }
                                this.B0 = Math.max(this.B0, j);
                                if (f()) {
                                    this.C0 = this.B0;
                                } else {
                                    this.C0 = this.B0;
                                }
                                g5dVar.m();
                                if (g5dVar.i(268435456)) {
                                    b0(g5dVar);
                                }
                                p0(g5dVar);
                                iW = W(g5dVar);
                                if (Build.VERSION.SDK_INT >= 34) {
                                    d850Var = this.d;
                                    d850Var.getClass();
                                    if (!d850Var.b) {
                                        this.P0 = Math.max(this.P0, g5dVar.f);
                                    }
                                } else {
                                    d850Var = this.d;
                                    d850Var.getClass();
                                    if (!d850Var.b) {
                                        this.P0 = Math.max(this.P0, g5dVar.f);
                                    }
                                }
                                i = this.n0;
                                if (zI) {
                                    vivVar.a(i, v3cVar, j, iW);
                                } else {
                                    ByteBuffer byteBuffer8 = g5dVar.d;
                                    byteBuffer8.getClass();
                                    vivVar.c(i, byteBuffer8.limit(), iW, j);
                                }
                                this.n0 = -1;
                                g5dVar.d = null;
                                this.y0 = true;
                                this.v0 = 0;
                                this.I0.c++;
                                return true;
                            }
                        } else if (!A0(g5dVar)) {
                            zI = g5dVar.i(1073741824);
                            if (zI) {
                                iArr = v3cVar.d;
                                if (iArr == null) {
                                    iArr = new int[1];
                                    v3cVar.d = iArr;
                                    v3cVar.i.numBytesOfClearData = iArr;
                                }
                                iArr[0] = iArr[0] + iPosition;
                            }
                            j = g5dVar.f;
                            if (this.F0) {
                                arrayDeque = this.O;
                                if (arrayDeque.isEmpty()) {
                                    pxf0<androidx.media3.common.a> pxf0Var5 = arrayDeque.peekLast().d;
                                    androidx.media3.common.a aVar6 = this.Q;
                                    aVar6.getClass();
                                    pxf0Var5.a(aVar6, j);
                                } else {
                                    pxf0<androidx.media3.common.a> pxf0Var6 = this.J0.d;
                                    androidx.media3.common.a aVar7 = this.Q;
                                    aVar7.getClass();
                                    pxf0Var6.a(aVar7, j);
                                }
                                this.F0 = false;
                            }
                            this.B0 = Math.max(this.B0, j);
                            if (f()) {
                                this.C0 = this.B0;
                            } else {
                                this.C0 = this.B0;
                            }
                            g5dVar.m();
                            if (g5dVar.i(268435456)) {
                                b0(g5dVar);
                            }
                            p0(g5dVar);
                            iW = W(g5dVar);
                            if (Build.VERSION.SDK_INT >= 34) {
                                d850Var = this.d;
                                d850Var.getClass();
                                if (!d850Var.b) {
                                    this.P0 = Math.max(this.P0, g5dVar.f);
                                }
                            } else {
                                d850Var = this.d;
                                d850Var.getClass();
                                if (!d850Var.b) {
                                    this.P0 = Math.max(this.P0, g5dVar.f);
                                }
                            }
                            i = this.n0;
                            if (zI) {
                                vivVar.a(i, v3cVar, j, iW);
                            } else {
                                ByteBuffer byteBuffer9 = g5dVar.d;
                                byteBuffer9.getClass();
                                vivVar.c(i, byteBuffer9.limit(), iW, j);
                            }
                            this.n0 = -1;
                            g5dVar.d = null;
                            this.y0 = true;
                            this.v0 = 0;
                            this.I0.c++;
                            return true;
                        }
                        return true;
                    }
                    this.C0 = this.B0;
                    if (this.v0 == 2) {
                        g5dVar.j();
                        this.v0 = 1;
                    }
                    this.D0 = true;
                    if (!this.y0) {
                        q0();
                        return false;
                    }
                    if (!this.k0) {
                        this.z0 = true;
                        vivVar.c(this.n0, 0, 4, 0L);
                        this.n0 = -1;
                        g5dVar.d = null;
                        return false;
                    }
                }
            }
        }
        return false;
    }

    public final void T() {
        try {
            viv vivVar = this.Y;
            ly0.g(vivVar);
            vivVar.flush();
        } finally {
            w0();
        }
    }

    public final boolean U() {
        if (this.Y != null) {
            if (D0()) {
                t0();
                return true;
            }
            if (B0()) {
                T();
                return false;
            }
            long j = this.P0;
            if (j != -9223372036854775807L && this.A <= j && this.K0 < j) {
                this.N0 = true;
                this.P0 = -9223372036854775807L;
            }
        }
        return false;
    }

    public final List<ziv> V(boolean z) {
        androidx.media3.common.a aVar = this.Q;
        aVar.getClass();
        ArrayList arrayListY = Y(aVar, z);
        if (!arrayListY.isEmpty() || !z) {
            return arrayListY;
        }
        ArrayList arrayListY2 = Y(aVar, false);
        if (!arrayListY2.isEmpty()) {
            cft.g("MediaCodecRenderer", "Drm session requires secure decoder for " + aVar.n + ", but no secure decoder available. Trying to proceed with " + arrayListY2 + ".");
        }
        return arrayListY2;
    }

    public int W(g5d g5dVar) {
        return 0;
    }

    public abstract float X(float f, androidx.media3.common.a aVar, androidx.media3.common.a[] aVarArr);

    public abstract ArrayList Y(androidx.media3.common.a aVar, boolean z);

    public long Z(long j, long j2) {
        return super.s(j, j2);
    }

    public abstract viv.a a0(ziv zivVar, androidx.media3.common.a aVar, MediaCrypto mediaCrypto, float f);

    public abstract void b0(g5d g5dVar);

    @Override // androidx.media3.exoplayer.l
    public final int d(androidx.media3.common.a aVar) throws rwg {
        try {
            return F0(aVar);
        } catch (ijv.b e) {
            throw D(e, aVar, false, 4002);
        }
    }

    public final boolean d0(long j, long j2) {
        if (j2 >= j) {
            return false;
        }
        androidx.media3.common.a aVar = this.R;
        return aVar == null || !Objects.equals(aVar.n, "audio/opus") || j - j2 > 80000;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x007f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x009e A[Catch: b -> 0x00ae, TryCatch #1 {b -> 0x00ae, blocks: (B:47:0x009a, B:49:0x009e, B:51:0x00a5, B:56:0x00b0, B:60:0x00bd), top: B:72:0x009a }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:70:0x0088 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final void e0() {
        androidx.media3.common.a aVar;
        lef lefVar;
        if (this.Y != null || this.r0 || (aVar = this.Q) == null) {
            return;
        }
        String str = aVar.n;
        boolean z = true;
        if (this.T == null && E0(aVar)) {
            this.r0 = false;
            v0();
            boolean zEquals = "audio/mp4a-latm".equals(str);
            cd2 cd2Var = this.M;
            if (zEquals || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                cd2Var.z = 32;
            } else {
                cd2Var.z = 1;
            }
            this.r0 = true;
            return;
        }
        y0(this.T);
        if (this.S == null) {
            try {
                lefVar = this.S;
                if (lefVar == null && (lefVar.getState() == 3 || this.S.getState() == 4)) {
                    lef lefVar2 = this.S;
                    ly0.g(str);
                    if (!lefVar2.k(str)) {
                        z = false;
                    }
                } else {
                    z = false;
                }
                f0(this.V, z);
            } catch (b e) {
                throw D(e, aVar, false, 4001);
            }
        } else {
            ly0.f(this.V == null);
            lef lefVar3 = this.S;
            mzi mziVarH = lefVar3.h();
            if (!mzi.a || mziVarH == null) {
                if (mziVarH == null) {
                    try {
                        this.V = new MediaCrypto(null, null);
                    } catch (MediaCryptoException e2) {
                        throw D(e2, this.Q, false, 6006);
                    }
                } else if (lefVar3.e() != null) {
                }
                lefVar = this.S;
                if (lefVar == null) {
                    z = false;
                } else {
                    z = false;
                }
                f0(this.V, z);
            } else {
                int state = lefVar3.getState();
                if (state == 1) {
                    lef.a aVarE = lefVar3.e();
                    aVarE.getClass();
                    throw D(aVarE, this.Q, false, aVarE.a);
                }
                if (state == 4) {
                    if (mziVarH == null) {
                        this.V = new MediaCrypto(null, null);
                    } else if (lefVar3.e() != null) {
                    }
                    lefVar = this.S;
                    if (lefVar == null) {
                        z = false;
                    } else {
                        z = false;
                    }
                    f0(this.V, z);
                }
            }
        }
        MediaCrypto mediaCrypto = this.V;
        if (mediaCrypto == null || this.Y != null) {
            return;
        }
        mediaCrypto.release();
        this.V = null;
    }

    public final void f0(MediaCrypto mediaCrypto, boolean z) throws b {
        androidx.media3.common.a aVar = this.Q;
        aVar.getClass();
        if (this.d0 == null) {
            try {
                List<ziv> listV = V(z);
                this.d0 = new ArrayDeque<>();
                ArrayList arrayList = (ArrayList) listV;
                if (!arrayList.isEmpty()) {
                    this.d0.add((ziv) arrayList.get(0));
                }
                this.e0 = null;
            } catch (ijv.b e) {
                throw new b(aVar, e, z, -49998);
            }
        }
        if (this.d0.isEmpty()) {
            throw new b(aVar, null, z, -49999);
        }
        ArrayDeque<ziv> arrayDeque = this.d0;
        arrayDeque.getClass();
        while (this.Y == null) {
            ziv zivVarPeekFirst = arrayDeque.peekFirst();
            zivVarPeekFirst.getClass();
            if (!g0(aVar) || !C0(zivVarPeekFirst)) {
                return;
            }
            try {
                c0(zivVarPeekFirst, mediaCrypto);
            } catch (Exception e2) {
                cft.h("MediaCodecRenderer", "Failed to initialize decoder: " + zivVarPeekFirst, e2);
                arrayDeque.removeFirst();
                b bVar = new b("Decoder init failed: " + zivVarPeekFirst.a + ", " + aVar, e2, aVar.n, z, zivVarPeekFirst, e2 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e2).getDiagnosticInfo() : null);
                h0(bVar);
                b bVar2 = this.e0;
                if (bVar2 == null) {
                    this.e0 = bVar;
                } else {
                    this.e0 = new b(bVar2.getMessage(), bVar2.getCause(), bVar2.a, bVar2.b, bVar2.c, bVar2.d);
                }
                if (arrayDeque.isEmpty()) {
                    throw this.e0;
                }
            }
        }
        this.d0 = null;
    }

    public boolean g0(androidx.media3.common.a aVar) {
        return true;
    }

    @Override // androidx.media3.exoplayer.k
    public void h(long j, long j2) {
        boolean z = false;
        if (this.G0) {
            this.G0 = false;
            q0();
        }
        rwg rwgVar = this.H0;
        if (rwgVar != null) {
            this.H0 = null;
            throw rwgVar;
        }
        try {
            if (this.E0) {
                u0();
                return;
            }
            if (this.Q != null || s0(2)) {
                e0();
                if (this.r0) {
                    Trace.beginSection("bypassRender");
                    while (N(j, j2)) {
                    }
                    Trace.endSection();
                } else if (this.Y != null) {
                    vs7 vs7Var = this.i;
                    vs7Var.getClass();
                    vs7Var.d();
                    Trace.beginSection("drainAndFeed");
                    while (R(j, j2)) {
                    }
                    while (S()) {
                    }
                    Trace.endSection();
                } else {
                    e5d e5dVar = this.I0;
                    int i = e5dVar.d;
                    rs60 rs60Var = this.w;
                    rs60Var.getClass();
                    e5dVar.d = i + rs60Var.c(j - this.z);
                    s0(1);
                }
                synchronized (this.I0) {
                }
            }
        } catch (MediaCodec.CryptoException e) {
            throw D(e, this.Q, false, jrh0.x(e.getErrorCode()));
        } catch (IllegalStateException e2) {
            boolean z2 = e2 instanceof MediaCodec.CodecException;
            if (!z2) {
                StackTraceElement[] stackTrace = e2.getStackTrace();
                if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                    throw e2;
                }
            }
            h0(e2);
            if (z2 && ((MediaCodec.CodecException) e2).isRecoverable()) {
                z = true;
            }
            if (z) {
                t0();
            }
            yiv yivVarP = P(e2, this.f0);
            throw D(yivVarP, this.Q, z, yivVarP.a == 1101 ? 4006 : 4003);
        }
    }

    public abstract void h0(Exception exc);

    public abstract void i0(long j, String str, long j2);

    @Override // androidx.media3.exoplayer.k
    public boolean isReady() {
        boolean zIsReady;
        if (this.Q == null) {
            return false;
        }
        if (f()) {
            zIsReady = this.C;
        } else {
            rs60 rs60Var = this.w;
            rs60Var.getClass();
            zIsReady = rs60Var.isReady();
        }
        if (zIsReady || this.o0 >= 0) {
            return true;
        }
        if (this.m0 == -9223372036854775807L) {
            return false;
        }
        vs7 vs7Var = this.i;
        vs7Var.getClass();
        return vs7Var.d() < this.m0;
    }

    public abstract void j0(String str);

    /* JADX WARN: Code duplicated, block: B:55:0x00c5  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a1, code lost:
    
        if (r7.equals(r4.f()) == false) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.i5d k0(defpackage.yti r13) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ejv.k0(yti):i5d");
    }

    public abstract void l0(androidx.media3.common.a aVar, MediaFormat mediaFormat);

    public void m0(long j) {
    }

    public void n0(long j) {
        this.K0 = j;
        while (true) {
            ArrayDeque<d> arrayDeque = this.O;
            if (arrayDeque.isEmpty() || j < arrayDeque.peek().a) {
                return;
            }
            d dVarPoll = arrayDeque.poll();
            dVarPoll.getClass();
            z0(dVarPoll);
            o0();
        }
    }

    public abstract void o0();

    public void p0(g5d g5dVar) {
    }

    public final void q0() throws rwg {
        int i = this.x0;
        if (i == 1) {
            T();
            return;
        }
        if (i == 2) {
            T();
            H0();
        } else if (i != 3) {
            this.E0 = true;
            u0();
        } else {
            t0();
            e0();
        }
    }

    public abstract boolean r0(long j, long j2, viv vivVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, androidx.media3.common.a aVar);

    @Override // androidx.media3.exoplayer.k
    public final long s(long j, long j2) {
        return Z(j, j2);
    }

    public final boolean s0(int i) throws rwg {
        yti ytiVar = this.c;
        ytiVar.a();
        g5d g5dVar = this.J;
        g5dVar.j();
        int iM = M(ytiVar, g5dVar, i | 4);
        if (iM == -5) {
            k0(ytiVar);
            return true;
        }
        if (iM != -4 || !g5dVar.i(4)) {
            return false;
        }
        this.D0 = true;
        q0();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void t0() {
        try {
            viv vivVar = this.Y;
            if (vivVar != null) {
                vivVar.release();
                this.I0.b++;
                ziv zivVar = this.f0;
                zivVar.getClass();
                j0(zivVar.a);
            }
            this.Y = null;
            try {
                MediaCrypto mediaCrypto = this.V;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.V = null;
                y0(null);
                x0();
            }
        } catch (Throwable th) {
            this.Y = null;
            try {
                MediaCrypto mediaCrypto2 = this.V;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
                this.V = null;
                y0(null);
                x0();
            }
        }
    }

    public abstract void u0();

    public final void v0() {
        this.B0 = -9223372036854775807L;
        this.C0 = -9223372036854775807L;
        this.K0 = -9223372036854775807L;
        this.t0 = false;
        this.M.j();
        this.L.j();
        this.s0 = false;
        ByteBuffer byteBuffer = j31.a;
        uly ulyVar = this.P;
        ulyVar.a = byteBuffer;
        ulyVar.c = 0;
        ulyVar.b = 2;
    }

    @Override // androidx.media3.exoplayer.k
    public void w(float f, float f2) {
        this.W = f;
        this.X = f2;
        G0(this.Z);
    }

    public void w0() {
        this.n0 = -1;
        this.K.d = null;
        this.o0 = -1;
        this.p0 = null;
        this.B0 = -9223372036854775807L;
        this.C0 = -9223372036854775807L;
        this.K0 = -9223372036854775807L;
        this.m0 = -9223372036854775807L;
        this.z0 = false;
        this.l0 = -9223372036854775807L;
        this.y0 = false;
        this.i0 = false;
        this.j0 = false;
        this.q0 = false;
        this.w0 = 0;
        this.x0 = 0;
        this.v0 = this.u0 ? 1 : 0;
        this.N0 = false;
        this.O0 = -9223372036854775807L;
        this.P0 = -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.b, androidx.media3.exoplayer.l
    public final int x() {
        return 8;
    }

    public final void x0() {
        w0();
        this.H0 = null;
        this.d0 = null;
        this.f0 = null;
        this.Z = null;
        this.a0 = null;
        this.b0 = false;
        this.A0 = false;
        this.c0 = -1.0f;
        this.g0 = 0;
        this.h0 = false;
        this.k0 = false;
        this.u0 = false;
        this.v0 = 0;
    }

    public final void y0(lef lefVar) {
        lef lefVar2 = this.S;
        if (lefVar2 != lefVar) {
            if (lefVar != null) {
                lefVar.j(null);
            }
            if (lefVar2 != null) {
                lefVar2.i(null);
            }
        }
        this.S = lefVar;
    }

    public final void z0(d dVar) {
        this.J0 = dVar;
        long j = dVar.c;
        if (j != -9223372036854775807L) {
            this.L0 = true;
            m0(j);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00b5  */
    public final void c0(ziv zivVar, MediaCrypto mediaCrypto) {
        int i;
        this.f0 = zivVar;
        androidx.media3.common.a aVar = this.Q;
        aVar.getClass();
        String str = zivVar.a;
        float f = this.X;
        androidx.media3.common.a[] aVarArr = this.y;
        aVarArr.getClass();
        float fX = X(f, aVar, aVarArr);
        if (fX <= this.I) {
            fX = -1.0f;
        }
        vs7 vs7Var = this.i;
        vs7Var.getClass();
        long jD = vs7Var.d();
        viv.a aVarA0 = a0(zivVar, aVar, mediaCrypto, fX);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            sp10 sp10Var = this.f;
            sp10Var.getClass();
            a.a(aVarA0, sp10Var);
        }
        try {
            Trace.beginSection("createCodec:" + str);
            viv vivVarA = this.H.a(aVarA0);
            this.Y = vivVarA;
            vivVarA.d(new c());
            Trace.endSection();
            vs7 vs7Var2 = this.i;
            vs7Var2.getClass();
            long jD2 = vs7Var2.d();
            if (!zivVar.e(aVar)) {
                String strC = androidx.media3.common.a.c(aVar);
                Locale locale = Locale.US;
                cft.g("MediaCodecRenderer", tx5.a("Format exceeds selected codec's capabilities [", strC, ", ", str, "]"));
            }
            this.c0 = fX;
            this.Z = aVar;
            boolean z = false;
            if (i2 > 25 || !"OMX.Exynos.avc.dec.secure".equals(str)) {
                i = 0;
            } else {
                String str2 = Build.MODEL;
                if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                    i = 2;
                } else {
                    i = 0;
                }
            }
            this.g0 = i;
            this.h0 = i2 == 29 && "c2.android.aac.decoder".equals(str);
            String str3 = zivVar.a;
            if ((i2 <= 25 && "OMX.rk.video_decoder.avc".equals(str3)) || ((i2 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str3) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str3) || "OMX.bcm.vdec.avc.tunnel".equals(str3) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str3) || "OMX.bcm.vdec.hevc.tunnel".equals(str3) || oAudzpbdOhCI.YCJaNkmULbtHx.equals(str3))) || ("Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && zivVar.f))) {
                z = true;
            }
            this.k0 = z;
            this.Y.getClass();
            if (this.v == 2) {
                vs7 vs7Var3 = this.i;
                vs7Var3.getClass();
                this.m0 = vs7Var3.d() + 1000;
            }
            this.I0.a++;
            i0(jD2, str, jD2 - jD);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public static class b extends Exception {
        public final String a;
        public final boolean b;
        public final ziv c;
        public final String d;

        /* JADX WARN: Illegal instructions before constructor call */
        public b(androidx.media3.common.a aVar, ijv.b bVar, boolean z, int i) {
            String str = "Decoder init failed: [" + i + "], " + aVar;
            String str2 = aVar.n;
            StringBuilder sbB = mq0.b("androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_", i < 0 ? "neg_" : "");
            sbB.append(Math.abs(i));
            this(str, bVar, str2, z, null, sbB.toString());
        }

        public b(String str, Throwable th, String str2, boolean z, ziv zivVar, String str3) {
            super(str, th);
            this.a = str2;
            this.b = z;
            this.c = zivVar;
            this.d = str3;
        }
    }
}
