package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.ironsource.C4235d4;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.LinkedList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class r {
    public long A;
    public boolean B;
    public long C;
    public Method D;
    public int E;
    public long F;
    public long G;
    public int H;
    public long I;
    public long J;
    public int K;
    public int L;
    public long M;
    public long N;
    public long O;
    public float P;
    public c[] Q;
    public ByteBuffer[] R;
    public ByteBuffer S;
    public ByteBuffer T;
    public byte[] U;
    public int V;
    public int W;
    public boolean X;
    public boolean Y;
    public int Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f45617a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f45618a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f45619b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f45620b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c[] f45621c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public long f45622c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f45623d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ConditionVariable f45624e = new ConditionVariable(true);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f45625f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k f45626g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinkedList f45627h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public AudioTrack f45628i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f45629j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f45630k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f45631l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f45632m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f45633n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f45634o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f45635p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f45636q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.s f45637r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.s f45638s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f45639t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f45640u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ByteBuffer f45641v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f45642w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f45643x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f45644y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f45645z;

    public r(c[] cVarArr, u uVar) {
        this.f45623d = uVar;
        if (z.f47158a >= 18) {
            try {
                this.D = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        if (z.f47158a >= 19) {
            this.f45626g = new l();
        } else {
            this.f45626g = new k();
        }
        s sVar = new s();
        this.f45617a = sVar;
        x xVar = new x();
        this.f45619b = xVar;
        c[] cVarArr2 = new c[cVarArr.length + 3];
        this.f45621c = cVarArr2;
        cVarArr2[0] = new v();
        cVarArr2[1] = sVar;
        System.arraycopy(cVarArr, 0, cVarArr2, 2, cVarArr.length);
        cVarArr2[cVarArr.length + 2] = xVar;
        this.f45625f = new long[10];
        this.P = 1.0f;
        this.L = 0;
        this.f45633n = 3;
        this.Z = 0;
        this.f45638s = com.fyber.inneractive.sdk.player.exoplayer2.s.f46811d;
        this.W = -1;
        this.Q = new c[0];
        this.R = new ByteBuffer[0];
        this.f45627h = new LinkedList();
    }

    /* JADX WARN: Code duplicated, block: B:52:0x009b  */
    public final void a(int i10, int i11, int i12, int[] iArr) throws m {
        int i13;
        int i14;
        int i15 = z.f47158a;
        if (i12 == Integer.MIN_VALUE) {
            i13 = i10 * 3;
        } else if (i12 == 1073741824) {
            i13 = i10 * 4;
        } else if (i12 == 2) {
            i13 = i10 * 2;
        } else {
            if (i12 != 3) {
                throw new IllegalArgumentException();
            }
            i13 = i10;
        }
        this.E = i13;
        this.f45617a.f45648d = iArr;
        boolean zA = false;
        for (c cVar : this.f45621c) {
            try {
                zA |= cVar.a(i11, i10, i12);
                if (cVar.d()) {
                    i10 = cVar.e();
                    i12 = 2;
                }
            } catch (b e10) {
                throw new m(e10);
            }
        }
        if (zA) {
            h();
        }
        int i16 = 252;
        switch (i10) {
            case 1:
                i14 = 4;
                break;
            case 2:
                i14 = 12;
                break;
            case 3:
                i14 = 28;
                break;
            case 4:
                i14 = 204;
                break;
            case 5:
                i14 = Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE;
                break;
            case 6:
                i14 = 252;
                break;
            case 7:
                i14 = 1276;
                break;
            case 8:
                i14 = com.fyber.inneractive.sdk.player.exoplayer2.b.f45699a;
                break;
            default:
                throw new m(com.fyber.inneractive.sdk.player.exoplayer2.m.a("Unsupported channel count: ", i10));
        }
        int i17 = z.f47158a;
        if (i17 > 23 || !"foster".equals(z.f47159b) || !"NVIDIA".equals(z.f47160c)) {
            i16 = i14;
        } else if (i10 != 3 && i10 != 5) {
            if (i10 != 7) {
                i16 = i14;
            } else {
                i16 = com.fyber.inneractive.sdk.player.exoplayer2.b.f45699a;
            }
        }
        if (i17 <= 25) {
            "fugu".equals(z.f47159b);
        }
        if (!zA && d() && this.f45631l == i12 && this.f45629j == i11 && this.f45630k == i16) {
            return;
        }
        g();
        this.f45631l = i12;
        this.f45634o = false;
        this.f45629j = i11;
        this.f45630k = i16;
        this.f45632m = 2;
        this.H = i10 * 2;
        int minBufferSize = AudioTrack.getMinBufferSize(i11, i16, 2);
        if (minBufferSize == -2) {
            throw new IllegalStateException();
        }
        int i18 = minBufferSize * 4;
        long j10 = this.f45629j;
        int i19 = this.H;
        int i20 = ((int) ((250000 * j10) / 1000000)) * i19;
        int iMax = (int) Math.max(minBufferSize, ((j10 * 750000) / 1000000) * ((long) i19));
        if (i18 < i20) {
            i18 = i20;
        } else if (i18 > iMax) {
            i18 = iMax;
        }
        this.f45635p = i18;
        this.f45636q = (((long) (i18 / this.H)) * 1000000) / ((long) this.f45629j);
        a(this.f45638s);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d9  */
    public final void b(ByteBuffer byteBuffer, long j10) throws q {
        int iWrite;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.T;
            int iWrite2 = 0;
            if (byteBuffer2 == null) {
                this.T = byteBuffer;
                if (z.f47158a < 21) {
                    int iRemaining = byteBuffer.remaining();
                    byte[] bArr = this.U;
                    if (bArr == null || bArr.length < iRemaining) {
                        this.U = new byte[iRemaining];
                    }
                    int iPosition = byteBuffer.position();
                    byteBuffer.get(this.U, 0, iRemaining);
                    byteBuffer.position(iPosition);
                    this.V = 0;
                }
            } else if (byteBuffer2 != byteBuffer) {
                throw new IllegalArgumentException();
            }
            int iRemaining2 = byteBuffer.remaining();
            if (z.f47158a < 21) {
                int iA = this.f45635p - ((int) (this.I - (this.f45626g.a() * ((long) this.H))));
                if (iA > 0) {
                    iWrite2 = this.f45628i.write(this.U, this.V, Math.min(iRemaining2, iA));
                    if (iWrite2 > 0) {
                        this.V += iWrite2;
                        byteBuffer.position(byteBuffer.position() + iWrite2);
                    }
                }
            } else if (!this.f45618a0) {
                iWrite2 = this.f45628i.write(byteBuffer, iRemaining2, 1);
            } else {
                if (j10 == -9223372036854775807L) {
                    throw new IllegalStateException();
                }
                AudioTrack audioTrack = this.f45628i;
                if (this.f45641v == null) {
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
                    this.f45641v = byteBufferAllocate;
                    byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
                    this.f45641v.putInt(1431633921);
                }
                if (this.f45642w == 0) {
                    this.f45641v.putInt(4, iRemaining2);
                    this.f45641v.putLong(8, j10 * 1000);
                    this.f45641v.position(0);
                    this.f45642w = iRemaining2;
                }
                int iRemaining3 = this.f45641v.remaining();
                if (iRemaining3 <= 0) {
                    iWrite = audioTrack.write(byteBuffer, iRemaining2, 1);
                    if (iWrite < 0) {
                        this.f45642w = 0;
                    } else {
                        this.f45642w -= iWrite;
                    }
                    iWrite2 = iWrite;
                } else {
                    int iWrite3 = audioTrack.write(this.f45641v, iRemaining3, 1);
                    if (iWrite3 < 0) {
                        this.f45642w = 0;
                        iWrite2 = iWrite3;
                    } else if (iWrite3 >= iRemaining3) {
                        iWrite = audioTrack.write(byteBuffer, iRemaining2, 1);
                        if (iWrite < 0) {
                            this.f45642w = 0;
                        } else {
                            this.f45642w -= iWrite;
                        }
                        iWrite2 = iWrite;
                    }
                }
            }
            this.f45622c0 = SystemClock.elapsedRealtime();
            if (iWrite2 < 0) {
                throw new q(iWrite2);
            }
            boolean z10 = this.f45634o;
            if (!z10) {
                this.I += (long) iWrite2;
            }
            if (iWrite2 == iRemaining2) {
                if (z10) {
                    this.J += (long) this.K;
                }
                this.T = null;
            }
        }
    }

    public final boolean c() {
        if (!d()) {
            return false;
        }
        if (b() <= this.f45626g.a()) {
            return e() && this.f45628i.getPlayState() == 2 && this.f45628i.getPlaybackHeadPosition() == 0;
        }
        return true;
    }

    public final boolean d() {
        return this.f45628i != null;
    }

    public final boolean e() {
        if (z.f47158a >= 23) {
            return false;
        }
        int i10 = this.f45632m;
        return i10 == 5 || i10 == 6;
    }

    public final void f() {
        this.Y = true;
        if (d()) {
            this.N = System.nanoTime() / 1000;
            this.f45628i.play();
        }
    }

    public final void g() {
        if (d()) {
            this.F = 0L;
            this.G = 0L;
            this.I = 0L;
            this.J = 0L;
            this.K = 0;
            com.fyber.inneractive.sdk.player.exoplayer2.s sVar = this.f45637r;
            if (sVar != null) {
                this.f45638s = sVar;
                this.f45637r = null;
            } else if (!this.f45627h.isEmpty()) {
                this.f45638s = ((p) this.f45627h.getLast()).f45614a;
            }
            this.f45627h.clear();
            this.f45639t = 0L;
            this.f45640u = 0L;
            this.S = null;
            this.T = null;
            int i10 = 0;
            while (true) {
                c[] cVarArr = this.Q;
                if (i10 >= cVarArr.length) {
                    break;
                }
                c cVar = cVarArr[i10];
                cVar.flush();
                this.R[i10] = cVar.a();
                i10++;
            }
            this.X = false;
            this.W = -1;
            this.f45641v = null;
            this.f45642w = 0;
            this.L = 0;
            this.O = 0L;
            this.f45645z = 0L;
            this.f45644y = 0;
            this.f45643x = 0;
            this.A = 0L;
            this.B = false;
            this.C = 0L;
            if (this.f45628i.getPlayState() == 3) {
                this.f45628i.pause();
            }
            AudioTrack audioTrack = this.f45628i;
            this.f45628i = null;
            this.f45626g.a(null, false);
            this.f45624e.close();
            new j(this, audioTrack).start();
        }
    }

    public final void h() {
        ArrayList arrayList = new ArrayList();
        for (c cVar : this.f45621c) {
            if (cVar.d()) {
                arrayList.add(cVar);
            } else {
                cVar.flush();
            }
        }
        int size = arrayList.size();
        this.Q = (c[]) arrayList.toArray(new c[size]);
        this.R = new ByteBuffer[size];
        for (int i10 = 0; i10 < size; i10++) {
            c cVar2 = this.Q[i10];
            cVar2.flush();
            this.R[i10] = cVar2.a();
        }
    }

    public final void i() {
        if (d()) {
            if (z.f47158a >= 21) {
                this.f45628i.setVolume(this.P);
                return;
            }
            AudioTrack audioTrack = this.f45628i;
            float f10 = this.P;
            audioTrack.setStereoVolume(f10, f10);
        }
    }

    public final boolean a(ByteBuffer byteBuffer, long j10) throws q, n {
        int i10;
        ByteBuffer byteBuffer2 = this.S;
        if (byteBuffer2 != null && byteBuffer != byteBuffer2) {
            throw new IllegalArgumentException();
        }
        if (!d()) {
            this.f45624e.block();
            if (this.f45618a0) {
                this.f45628i = new AudioTrack(new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(16).build(), new AudioFormat.Builder().setChannelMask(this.f45630k).setEncoding(this.f45632m).setSampleRate(this.f45629j).build(), this.f45635p, 1, this.Z);
            } else if (this.Z == 0) {
                this.f45628i = new AudioTrack(this.f45633n, this.f45629j, this.f45630k, this.f45632m, this.f45635p, 1);
            } else {
                this.f45628i = new AudioTrack(this.f45633n, this.f45629j, this.f45630k, this.f45632m, this.f45635p, 1, this.Z);
            }
            int state = this.f45628i.getState();
            if (state == 1) {
                int audioSessionId = this.f45628i.getAudioSessionId();
                if (this.Z != audioSessionId) {
                    this.Z = audioSessionId;
                    u uVar = (u) this.f45623d;
                    uVar.f45657a.P.audioSessionId(audioSessionId);
                    uVar.f45657a.getClass();
                }
                this.f45626g.a(this.f45628i, e());
                i();
                this.f45620b0 = false;
                if (this.Y) {
                    f();
                }
            } else {
                try {
                    this.f45628i.release();
                } catch (Exception unused) {
                } catch (Throwable th2) {
                    this.f45628i = null;
                    throw th2;
                }
                this.f45628i = null;
                throw new n(state, this.f45629j, this.f45630k, this.f45635p);
            }
        }
        if (e()) {
            if (this.f45628i.getPlayState() == 2) {
                this.f45620b0 = false;
                return false;
            }
            if (this.f45628i.getPlayState() == 1 && this.f45626g.a() != 0) {
                return false;
            }
        }
        boolean z10 = this.f45620b0;
        boolean zC = c();
        this.f45620b0 = zC;
        if (z10 && !zC && this.f45628i.getPlayState() != 1) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f45622c0;
            u uVar2 = (u) this.f45623d;
            uVar2.f45657a.P.audioTrackUnderrun(this.f45635p, com.fyber.inneractive.sdk.player.exoplayer2.b.a(this.f45636q), jElapsedRealtime);
            uVar2.f45657a.getClass();
        }
        if (this.S == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (this.f45634o && this.K == 0) {
                int i11 = this.f45632m;
                if (i11 == 7 || i11 == 8) {
                    int iPosition = byteBuffer.position();
                    i10 = ((((byteBuffer.get(iPosition + 5) & 252) >> 2) | ((byteBuffer.get(iPosition + 4) & 1) << 6)) + 1) * 32;
                } else if (i11 == 5) {
                    i10 = 1536;
                } else if (i11 == 6) {
                    i10 = (((byteBuffer.get(byteBuffer.position() + 4) & l3.a.f103436o7) >> 6) != 3 ? a.f45576a[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4] : 6) * 256;
                } else {
                    throw new IllegalStateException(com.fyber.inneractive.sdk.player.exoplayer2.m.a("Unexpected audio encoding: ", i11));
                }
                this.K = i10;
            }
            if (this.f45637r != null) {
                if (!a()) {
                    return false;
                }
                this.f45627h.add(new p(this.f45637r, Math.max(0L, j10), (b() * 1000000) / ((long) this.f45629j)));
                this.f45637r = null;
                h();
            }
            int i12 = this.L;
            if (i12 == 0) {
                this.M = Math.max(0L, j10);
                this.L = 1;
            } else {
                long j11 = (((this.f45634o ? this.G : this.F / ((long) this.E)) * 1000000) / ((long) this.f45629j)) + this.M;
                if (i12 == 1 && Math.abs(j11 - j10) > 200000) {
                    Log.e("AudioTrack", "Discontinuity detected [expected " + j11 + ", got " + j10 + C4235d4.j.f61462e);
                    this.L = 2;
                }
                if (this.L == 2) {
                    this.M = (j10 - j11) + this.M;
                    this.L = 1;
                    u uVar3 = (u) this.f45623d;
                    uVar3.f45657a.getClass();
                    uVar3.f45657a.V = true;
                }
            }
            if (this.f45634o) {
                this.G += (long) this.K;
            } else {
                this.F += (long) byteBuffer.remaining();
            }
            this.S = byteBuffer;
        }
        if (this.f45634o) {
            b(this.S, j10);
        } else {
            a(j10);
        }
        if (this.S.hasRemaining()) {
            return false;
        }
        this.S = null;
        return true;
    }

    public final long b() {
        return this.f45634o ? this.J : this.I / ((long) this.H);
    }

    public final void a(long j10) throws q {
        ByteBuffer byteBuffer;
        int length = this.Q.length;
        int i10 = length;
        while (i10 >= 0) {
            if (i10 > 0) {
                byteBuffer = this.R[i10 - 1];
            } else {
                byteBuffer = this.S;
                if (byteBuffer == null) {
                    byteBuffer = c.f45582a;
                }
            }
            if (i10 == length) {
                b(byteBuffer, j10);
            } else {
                c cVar = this.Q[i10];
                cVar.a(byteBuffer);
                ByteBuffer byteBufferA = cVar.a();
                this.R[i10] = byteBufferA;
                if (byteBufferA.hasRemaining()) {
                    i10++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i10--;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0021  */
    /* JADX WARN: Code duplicated, block: B:15:0x0025  */
    /* JADX WARN: Code duplicated, block: B:18:0x0031 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0032  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0032 -> B:9:0x0012). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final boolean a() {
        /*
            r9 = this;
            int r0 = r9.W
            r1 = 1
            r2 = 0
            r3 = -1
            if (r0 != r3) goto L14
            boolean r0 = r9.f45634o
            if (r0 == 0) goto Lf
            com.fyber.inneractive.sdk.player.exoplayer2.audio.c[] r0 = r9.Q
            int r0 = r0.length
            goto L10
        Lf:
            r0 = r2
        L10:
            r9.W = r0
        L12:
            r0 = r1
            goto L15
        L14:
            r0 = r2
        L15:
            int r4 = r9.W
            com.fyber.inneractive.sdk.player.exoplayer2.audio.c[] r5 = r9.Q
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L38
            r4 = r5[r4]
            if (r0 == 0) goto L28
            r4.b()
        L28:
            r9.a(r7)
            boolean r0 = r4.c()
            if (r0 != 0) goto L32
            return r2
        L32:
            int r0 = r9.W
            int r0 = r0 + r1
            r9.W = r0
            goto L12
        L38:
            java.nio.ByteBuffer r0 = r9.T
            if (r0 == 0) goto L44
            r9.b(r0, r7)
            java.nio.ByteBuffer r0 = r9.T
            if (r0 == 0) goto L44
            return r2
        L44:
            r9.W = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.audio.r.a():boolean");
    }

    public final com.fyber.inneractive.sdk.player.exoplayer2.s a(com.fyber.inneractive.sdk.player.exoplayer2.s sVar) {
        if (this.f45634o) {
            com.fyber.inneractive.sdk.player.exoplayer2.s sVar2 = com.fyber.inneractive.sdk.player.exoplayer2.s.f46811d;
            this.f45638s = sVar2;
            return sVar2;
        }
        x xVar = this.f45619b;
        float f10 = sVar.f46812a;
        xVar.getClass();
        int i10 = z.f47158a;
        float fMax = Math.max(0.1f, Math.min(f10, 8.0f));
        xVar.f45691e = fMax;
        x xVar2 = this.f45619b;
        float f11 = sVar.f46813b;
        xVar2.getClass();
        xVar2.f45692f = Math.max(0.1f, Math.min(f11, 8.0f));
        com.fyber.inneractive.sdk.player.exoplayer2.s sVar3 = new com.fyber.inneractive.sdk.player.exoplayer2.s(fMax, f11);
        com.fyber.inneractive.sdk.player.exoplayer2.s sVar4 = this.f45637r;
        if (sVar4 == null) {
            if (!this.f45627h.isEmpty()) {
                sVar4 = ((p) this.f45627h.getLast()).f45614a;
            } else {
                sVar4 = this.f45638s;
            }
        }
        if (!sVar3.equals(sVar4)) {
            if (d()) {
                this.f45637r = sVar3;
            } else {
                this.f45638s = sVar3;
            }
        }
        return this.f45638s;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    /* JADX WARN: Code duplicated, block: B:80:0x024a  */
    public final long a(boolean z10) {
        long j10;
        long j11;
        long jA;
        long jA2;
        long j12;
        if (!d() || this.L == 0) {
            return Long.MIN_VALUE;
        }
        long j13 = 1000;
        if (this.f45628i.getPlayState() == 3) {
            k kVar = this.f45626g;
            long jA3 = (kVar.a() * 1000000) / ((long) kVar.f45603c);
            if (jA3 == 0) {
                j10 = 1000;
            } else {
                long jNanoTime = System.nanoTime() / 1000;
                if (jNanoTime - this.A >= 30000) {
                    long[] jArr = this.f45625f;
                    int i10 = this.f45643x;
                    jArr[i10] = jA3 - jNanoTime;
                    this.f45643x = (i10 + 1) % 10;
                    int i11 = this.f45644y;
                    if (i11 < 10) {
                        this.f45644y = i11 + 1;
                    }
                    this.A = jNanoTime;
                    this.f45645z = 0L;
                    int i12 = 0;
                    while (true) {
                        int i13 = this.f45644y;
                        if (i12 >= i13) {
                            break;
                        }
                        this.f45645z = (this.f45625f[i12] / ((long) i13)) + this.f45645z;
                        i12++;
                        j13 = j13;
                    }
                }
                j10 = j13;
                if (!e() && jNanoTime - this.C >= 500000) {
                    boolean zE = this.f45626g.e();
                    this.B = zE;
                    if (zE) {
                        j11 = 1000000;
                        long jC = this.f45626g.c() / j10;
                        j12 = 5000000;
                        long jB = this.f45626g.b();
                        if (jC < this.N) {
                            this.B = false;
                        } else if (Math.abs(jC - jNanoTime) > 5000000) {
                            StringBuilder sb2 = new StringBuilder("Spurious audio timestamp (system clock mismatch): ");
                            sb2.append(jB);
                            sb2.append(", ");
                            sb2.append(jC);
                            sb2.append(", ");
                            sb2.append(jNanoTime);
                            sb2.append(", ");
                            sb2.append(jA3);
                            sb2.append(", ");
                            sb2.append(this.f45634o ? this.G : this.F / ((long) this.E));
                            sb2.append(", ");
                            sb2.append(b());
                            Log.w("AudioTrack", sb2.toString());
                            this.B = false;
                        } else if (Math.abs(((jB * 1000000) / ((long) this.f45629j)) - jA3) > 5000000) {
                            StringBuilder sb3 = new StringBuilder("Spurious audio timestamp (frame position mismatch): ");
                            sb3.append(jB);
                            sb3.append(", ");
                            sb3.append(jC);
                            sb3.append(", ");
                            sb3.append(jNanoTime);
                            sb3.append(", ");
                            sb3.append(jA3);
                            sb3.append(", ");
                            sb3.append(this.f45634o ? this.G : this.F / ((long) this.E));
                            sb3.append(", ");
                            sb3.append(b());
                            Log.w("AudioTrack", sb3.toString());
                            this.B = false;
                        }
                    } else {
                        j11 = 1000000;
                        j12 = 5000000;
                    }
                    Method method = this.D;
                    if (method != null && !this.f45634o) {
                        try {
                            long jIntValue = (((long) ((Integer) method.invoke(this.f45628i, null)).intValue()) * j10) - this.f45636q;
                            this.O = jIntValue;
                            long jMax = Math.max(jIntValue, 0L);
                            this.O = jMax;
                            if (jMax > j12) {
                                Log.w("AudioTrack", "Ignoring impossibly large audio latency: " + this.O);
                                this.O = 0L;
                            }
                        } catch (Exception unused) {
                            this.D = null;
                        }
                    }
                    this.C = jNanoTime;
                }
            }
            j11 = 1000000;
        } else {
            j10 = 1000;
            j11 = 1000000;
        }
        long jNanoTime2 = System.nanoTime() / j10;
        if (this.B) {
            jA = ((this.f45626g.b() + (((jNanoTime2 - (this.f45626g.c() / j10)) * ((long) this.f45629j)) / j11)) * j11) / ((long) this.f45629j);
        } else {
            if (this.f45644y == 0) {
                k kVar2 = this.f45626g;
                jA = (kVar2.a() * j11) / ((long) kVar2.f45603c);
            } else {
                jA = jNanoTime2 + this.f45645z;
            }
            if (!z10) {
                jA -= this.O;
            }
        }
        long j14 = this.M;
        while (!this.f45627h.isEmpty() && jA >= ((p) this.f45627h.getFirst()).f45616c) {
            p pVar = (p) this.f45627h.remove();
            this.f45638s = pVar.f45614a;
            this.f45640u = pVar.f45616c;
            this.f45639t = pVar.f45615b - this.M;
        }
        if (this.f45638s.f46812a == 1.0f) {
            jA2 = (jA + this.f45639t) - this.f45640u;
        } else if (this.f45627h.isEmpty()) {
            x xVar = this.f45619b;
            long j15 = xVar.f45697k;
            if (j15 >= 1024) {
                jA2 = z.a(jA - this.f45640u, xVar.f45696j, j15) + this.f45639t;
            } else {
                jA2 = ((long) (((double) this.f45638s.f46812a) * (jA - this.f45640u))) + this.f45639t;
            }
        } else {
            jA2 = ((long) (((double) this.f45638s.f46812a) * (jA - this.f45640u))) + this.f45639t;
        }
        return j14 + jA2;
    }
}
