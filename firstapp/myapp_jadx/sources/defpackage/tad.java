package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.exoplayer.d;
import com.sportybet.plugin.realsports.data.CashOut;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class tad {
    public static final Object n0 = new Object();
    public static ScheduledExecutorService o0;
    public static int p0;
    public r21 A;
    public g B;
    public g C;
    public eo10 D;
    public boolean E;
    public ByteBuffer F;
    public int G;
    public long H;
    public long I;
    public long J;
    public long K;
    public int L;
    public boolean M;
    public boolean N;
    public long O;
    public float P;
    public ByteBuffer Q;
    public int R;
    public ByteBuffer S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public int Y;
    public boolean Z;
    public final Context a;
    public bm1 a0;
    public final f b;
    public x21 b0;
    public final f77 c;
    public boolean c0;
    public final axg0 d;
    public long d0;
    public final oyf0 e;
    public long e0;
    public final nyf0 f;
    public boolean f0;
    public final c150 g;
    public boolean g0;
    public final h41 h;
    public Looper h0;
    public final ArrayDeque<g> i;
    public long i0;
    public int j;
    public long j0;
    public k k;
    public Handler k0;
    public final i<a41> l;
    public Context l0;
    public final i<d41> m;
    public final boolean m0;
    public final wad n;
    public final oad o;
    public final xad p;
    public final int q;
    public sp10 r;
    public wiv.a s;
    public e t;
    public e u;
    public i31 v;
    public AudioTrack w;
    public u21 x;
    public w21 y;
    public h z;

    public static final class a {
        public static void a(AudioTrack audioTrack, sp10 sp10Var) {
            LogSessionId logSessionIdA = sp10Var.a();
            if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            audioTrack.setLogSessionId(logSessionIdA);
        }
    }

    public interface b {
        public static final wad a = new wad();
    }

    public interface c {
        public static final xad a = new xad();
    }

    public static final class d {
        public final Context a;
        public f c;
        public boolean d;
        public oad f;
        public final u21 b = u21.c;
        public final wad e = b.a;

        public d(Context context) {
            this.a = context;
        }
    }

    public static final class e {
        public final androidx.media3.common.a a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final i31 i;
        public final boolean j;
        public final boolean k;
        public final boolean l;

        public e(androidx.media3.common.a aVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, i31 i31Var, boolean z, boolean z2, boolean z3) {
            this.a = aVar;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = i5;
            this.g = i6;
            this.h = i7;
            this.i = i31Var;
            this.j = z;
            this.k = z2;
            this.l = z3;
        }

        public final y31 a() {
            return new y31(this.g, this.e, this.f, this.h, this.l, this.c == 1);
        }
    }

    public static class f {
        public final j31[] a;
        public final fi90 b;
        public final woa0 c;

        public f(j31... j31VarArr) {
            fi90 fi90Var = new fi90();
            fi90Var.m = 0;
            fi90Var.o = 0;
            fi90Var.p = 0;
            byte[] bArr = jrh0.b;
            fi90Var.n = bArr;
            fi90Var.q = bArr;
            woa0 woa0Var = new woa0();
            woa0Var.b = 1.0f;
            woa0Var.c = 1.0f;
            j31.a aVar = j31.a.e;
            woa0Var.d = aVar;
            woa0Var.e = aVar;
            woa0Var.f = aVar;
            woa0Var.g = aVar;
            ByteBuffer byteBuffer = j31.a;
            woa0Var.j = byteBuffer;
            woa0Var.k = byteBuffer.asShortBuffer();
            woa0Var.l = byteBuffer;
            j31[] j31VarArr2 = new j31[j31VarArr.length + 2];
            this.a = j31VarArr2;
            System.arraycopy(j31VarArr, 0, j31VarArr2, 0, j31VarArr.length);
            this.b = fi90Var;
            this.c = woa0Var;
            j31VarArr2[j31VarArr.length] = fi90Var;
            j31VarArr2[j31VarArr.length + 1] = woa0Var;
        }
    }

    public static final class g {
        public final eo10 a;
        public final long b;
        public final long c;
        public long d;

        public g(eo10 eo10Var, long j, long j2) {
            this.a = eo10Var;
            this.b = j;
            this.c = j2;
        }
    }

    public static final class h {
        public final AudioTrack a;
        public final w21 b;
        public uad c = new AudioRouting.OnRoutingChangedListener() { // from class: uad
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final void onRoutingChanged(AudioRouting audioRouting) {
                AudioDeviceInfo routedDevice;
                tad.h hVar = this.a;
                if (hVar.c == null || (routedDevice = audioRouting.getRoutedDevice()) == null) {
                    return;
                }
                hVar.b.b(routedDevice);
            }
        };

        /* JADX WARN: Type inference failed for: r3v1, types: [uad] */
        public h(AudioTrack audioTrack, w21 w21Var) {
            this.a = audioTrack;
            this.b = w21Var;
            audioTrack.addOnRoutingChangedListener(this.c, new Handler(Looper.myLooper()));
        }
    }

    public static final class i<T extends Exception> {
        public T a;
        public long b = -9223372036854775807L;
        public long c = -9223372036854775807L;

        /* JADX INFO: Thrown type has an unknown type hierarchy: T extends java.lang.Exception */
        public final void a(T t) throws T {
            boolean z;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (this.a == null) {
                this.a = t;
            }
            if (this.b == -9223372036854775807L) {
                synchronized (tad.n0) {
                    z = tad.p0 > 0;
                }
                if (!z) {
                    this.b = 200 + jElapsedRealtime;
                }
            }
            long j = this.b;
            if (j == -9223372036854775807L || jElapsedRealtime < j) {
                this.c = jElapsedRealtime + 50;
                return;
            }
            T t2 = this.a;
            if (t2 != t) {
                t2.addSuppressed(t);
            }
            T t3 = this.a;
            this.a = null;
            this.b = -9223372036854775807L;
            this.c = -9223372036854775807L;
            throw t3;
        }
    }

    public final class j {
        public j() {
        }

        public final void a(final long j) {
            final x31 x31Var;
            Handler handler;
            wiv.a aVar = tad.this.s;
            if (aVar == null || (handler = (x31Var = wiv.this.R0).a) == null) {
                return;
            }
            handler.post(new Runnable() { // from class: m31
                @Override // java.lang.Runnable
                public final void run() {
                    d.a aVar2 = x31Var.b;
                    String str = jrh0.a;
                    d.this.s.G(j);
                }
            });
        }
    }

    public final class k {
        public final Handler a = new Handler(Looper.myLooper());
        public final a b = new a();

        public class a extends AudioTrack$StreamEventCallback {
            public a() {
            }

            public final void onDataRequest(AudioTrack audioTrack, int i) {
                tad tadVar;
                wiv.a aVar;
                androidx.media3.exoplayer.k.a aVar2;
                k kVar = k.this;
                if (audioTrack.equals(tad.this.w) && (aVar = (tadVar = tad.this).s) != null && tadVar.W && (aVar2 = wiv.this.U) != null) {
                    aVar2.b();
                }
            }

            public final void onPresentationEnded(AudioTrack audioTrack) {
                k kVar = k.this;
                if (audioTrack.equals(tad.this.w)) {
                    tad.this.V = true;
                }
            }

            public final void onTearDown(AudioTrack audioTrack) {
                tad tadVar;
                wiv.a aVar;
                androidx.media3.exoplayer.k.a aVar2;
                k kVar = k.this;
                if (audioTrack.equals(tad.this.w) && (aVar = (tadVar = tad.this).s) != null && tadVar.W && (aVar2 = wiv.this.U) != null) {
                    aVar2.b();
                }
            }
        }

        public k() {
        }

        public final void a(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.b);
            this.a.removeCallbacksAndMessages(null);
        }
    }

    public tad(d dVar) {
        int deviceId;
        Context context = dVar.a;
        Context applicationContext = context == null ? null : context.getApplicationContext();
        this.a = applicationContext;
        this.A = r21.d;
        this.x = applicationContext == null ? dVar.b : null;
        this.b = dVar.c;
        this.j = 0;
        this.n = dVar.e;
        oad oadVar = dVar.f;
        oadVar.getClass();
        this.o = oadVar;
        this.h = new h41(new j());
        f77 f77Var = new f77();
        this.c = f77Var;
        axg0 axg0Var = new axg0();
        axg0Var.m = jrh0.b;
        this.d = axg0Var;
        this.e = new oyf0();
        this.f = new nyf0();
        this.g = pcn.o(axg0Var, f77Var);
        this.P = 1.0f;
        this.Y = 0;
        this.a0 = new bm1();
        eo10 eo10Var = eo10.d;
        this.C = new g(eo10Var, 0L, 0L);
        this.D = eo10Var;
        this.E = false;
        this.i = new ArrayDeque<>();
        this.l = new i<>();
        this.m = new i<>();
        this.p = c.a;
        int i2 = -1;
        if (Build.VERSION.SDK_INT >= 34 && context != null && (deviceId = context.getDeviceId()) != 0 && deviceId != -1) {
            i2 = deviceId;
        }
        this.q = i2;
        this.m0 = true;
    }

    public static boolean p(AudioTrack audioTrack) {
        return Build.VERSION.SDK_INT >= 29 && audioTrack.isOffloadedPlayback();
    }

    public final void a(long j2) {
        eo10 eo10Var;
        e eVar = this.u;
        boolean z = false;
        f fVar = this.b;
        if (eVar == null || !eVar.j) {
            if (this.c0 || eVar.c != 0) {
                eo10Var = eo10.d;
            } else {
                int i2 = eVar.a.H;
                eo10Var = this.D;
                woa0 woa0Var = fVar.c;
                float f2 = eo10Var.a;
                ly0.b(f2 > 0.0f);
                if (woa0Var.b != f2) {
                    woa0Var.b = f2;
                    woa0Var.h = true;
                }
                float f3 = eo10Var.b;
                ly0.b(f3 > 0.0f);
                if (woa0Var.c != f3) {
                    woa0Var.c = f3;
                    woa0Var.h = true;
                }
            }
            this.D = eo10Var;
        } else {
            eo10Var = eo10.d;
        }
        eo10 eo10Var2 = eo10Var;
        if (!this.c0) {
            e eVar2 = this.u;
            if (eVar2.c == 0) {
                int i3 = eVar2.a.H;
                z = this.E;
                fVar.b.j = z;
            }
        }
        this.E = z;
        this.i.add(new g(eo10Var2, Math.max(0L, j2), jrh0.T(this.u.e, k())));
        i31 i31Var = this.u.i;
        this.v = i31Var;
        i31Var.a();
        wiv.a aVar = this.s;
        if (aVar != null) {
            final boolean z2 = this.E;
            final x31 x31Var = wiv.this.R0;
            Handler handler = x31Var.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: v31
                    @Override // java.lang.Runnable
                    public final void run() {
                        d.a aVar2 = x31Var.b;
                        String str = jrh0.a;
                        d dVar = d.this;
                        boolean z3 = dVar.d0;
                        final boolean z4 = z2;
                        if (z3 == z4) {
                            return;
                        }
                        dVar.d0 = z4;
                        dVar.m.f(23, new bjs.a() { // from class: iyg
                            @Override // bjs.a
                            public final void invoke(Object obj) {
                                ((so10.c) obj).D(z4);
                            }
                        });
                    }
                });
            }
        }
    }

    public final AudioTrack b(y31 y31Var, r21 r21Var, int i2, androidx.media3.common.a aVar, Context context) throws a41 {
        try {
            AudioTrack audioTrackA = this.p.a(y31Var, r21Var, i2, context);
            int state = audioTrackA.getState();
            if (state == 1) {
                return audioTrackA;
            }
            try {
                audioTrackA.release();
            } catch (Exception unused) {
            }
            throw new a41(state, y31Var.b, y31Var.c, y31Var.a, y31Var.f, aVar, y31Var.e, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e2) {
            throw new a41(0, y31Var.b, y31Var.c, y31Var.a, y31Var.f, aVar, y31Var.e, e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0024  */
    /* JADX WARN: Code duplicated, block: B:27:0x003f  */
    /* JADX WARN: Code duplicated, block: B:35:? A[SYNTHETIC] */
    public final AudioTrack c(e eVar) throws a41 {
        tad tadVar;
        a41 a41Var;
        wiv.a aVar;
        Context context;
        int i2;
        try {
            int i3 = this.Y;
            int i4 = this.q;
            if (i4 != -1) {
                try {
                    Context context2 = this.a;
                    if (context2 == null || Build.VERSION.SDK_INT < 34) {
                        i2 = i3;
                        context = null;
                    } else {
                        Context contextCreateDeviceContext = this.l0;
                        if (contextCreateDeviceContext == null) {
                            contextCreateDeviceContext = context2.createDeviceContext(i4);
                            this.l0 = contextCreateDeviceContext;
                        }
                        context = contextCreateDeviceContext;
                        i2 = 0;
                    }
                } catch (a41 e2) {
                    a41Var = e2;
                    tadVar = this;
                    aVar = tadVar.s;
                    if (aVar != null) {
                        throw a41Var;
                    }
                    aVar.a(a41Var);
                    throw a41Var;
                }
            } else {
                i2 = i3;
                context = null;
            }
            tadVar = this;
            try {
                return tadVar.b(eVar.a(), this.A, i2, eVar.a, context);
            } catch (a41 e3) {
                e = e3;
                a41Var = e;
                aVar = tadVar.s;
                if (aVar != null) {
                    throw a41Var;
                }
                aVar.a(a41Var);
                throw a41Var;
            }
        } catch (a41 e4) {
            e = e4;
            tadVar = this;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:82:0x01a7  */
    public final void d(androidx.media3.common.a aVar, int[] iArr) throws z31 {
        i31 i31Var;
        int iIntValue;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        int i6;
        boolean z2;
        int i7;
        int iB;
        q();
        String str = aVar.n;
        int i8 = aVar.G;
        int i9 = aVar.F;
        int i10 = aVar.H;
        boolean zEquals = "audio/raw".equals(str);
        xad xadVar = this.p;
        if (zEquals) {
            ly0.b(jrh0.K(i10));
            int iT = jrh0.t(i10) * i9;
            pcn.a aVar2 = new pcn.a();
            aVar2.e(this.g);
            aVar2.c(this.e);
            aVar2.d(this.b.a);
            i31Var = new i31(aVar2.g());
            if (i31Var.equals(this.v)) {
                i31Var = this.v;
            }
            int i11 = aVar.I;
            int i12 = aVar.J;
            axg0 axg0Var = this.d;
            axg0Var.i = i11;
            axg0Var.j = i12;
            this.c.i = iArr;
            j31.a aVar3 = new j31.a(i8, i9, i10);
            try {
                pcn<j31> pcnVar = i31Var.a;
                if (aVar3.equals(j31.a.e)) {
                    throw new j31.b(aVar3);
                }
                for (int i13 = 0; i13 < pcnVar.size(); i13++) {
                    j31 j31Var = pcnVar.get(i13);
                    j31.a aVarE = j31Var.e(aVar3);
                    if (j31Var.isActive()) {
                        ly0.f(!aVarE.equals(j31.a.e));
                        aVar3 = aVarE;
                    }
                }
                int i14 = aVar3.b;
                i3 = aVar3.c;
                int i15 = aVar3.a;
                xadVar.getClass();
                iIntValue = jrh0.s(i14);
                int iT2 = jrh0.t(i3) * i14;
                i4 = iT;
                i6 = 0;
                z2 = false;
                i2 = i15;
                i5 = iT2;
                z = false;
            } catch (j31.b e2) {
                throw new z31(e2, aVar);
            }
        } else {
            pcn.b bVar = pcn.b;
            i31Var = new i31(c150.e);
            h31 h31VarH = this.j != 0 ? h(aVar) : h31.d;
            if (this.j == 0 || !h31VarH.a) {
                Pair pairD = this.x.d(this.A, aVar);
                if (pairD == null) {
                    throw new z31("Unable to configure passthrough for: " + aVar, aVar);
                }
                int iIntValue2 = ((Integer) pairD.first).intValue();
                iIntValue = ((Integer) pairD.second).intValue();
                i2 = i8;
                i3 = iIntValue2;
                i4 = -1;
                i5 = -1;
                z = false;
                i6 = 2;
                z2 = false;
            } else {
                str.getClass();
                int iC = gqv.c(str, aVar.k);
                xadVar.getClass();
                iIntValue = jrh0.s(i9);
                z = h31VarH.b;
                i3 = iC;
                i6 = 1;
                z2 = true;
                i5 = -1;
                i2 = i8;
                i4 = -1;
            }
        }
        if (i3 == 0) {
            throw new z31("Invalid output encoding (mode=" + i6 + ") for: " + aVar, aVar);
        }
        if (iIntValue == 0) {
            throw new z31("Invalid output channel config (mode=" + i6 + ") for: " + aVar, aVar);
        }
        int i16 = aVar.j;
        if ("audio/vnd.dts.hd;profile=lbr".equals(str) && i16 == -1) {
            i16 = 768000;
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i2, iIntValue, i3);
        ly0.f(minBufferSize != -2);
        int i17 = i5 != -1 ? i5 : 1;
        double d2 = z2 ? 8.0d : 1.0d;
        this.n.getClass();
        if (i6 == 0) {
            i4 = i4;
            long j2 = i2;
            long j3 = i17;
            i7 = jrh0.i(minBufferSize * 4, c0p.q(((250000 * j2) * j3) / 1000000), c0p.q(((750000 * j2) * j3) / 1000000));
        } else if (i6 == 1) {
            int iB2 = n4h.b(i3);
            ly0.f(iB2 != -2147483647);
            i7 = c0p.q((50000000 * ((long) iB2)) / 1000000);
        } else {
            if (i6 != 2) {
                d580.a();
                return;
            }
            int i18 = i3 == 5 ? 500000 : i3 == 8 ? CashOut.BIG_NUMBER : 250000;
            if (i16 != -1) {
                RoundingMode roundingMode = RoundingMode.CEILING;
                roundingMode.getClass();
                int i19 = i16 / 8;
                int i20 = i16 - (8 * i19);
                if (i20 != 0) {
                    int i21 = ((i16 ^ 8) >> 31) | 1;
                    switch (ewo.a.a[roundingMode.ordinal()]) {
                        case 1:
                            if (i20 != 0) {
                                throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                            }
                            break;
                        case 2:
                            break;
                        case 3:
                            if (i21 < 0) {
                                i19 += i21;
                            }
                            break;
                        case 4:
                            i19 += i21;
                            break;
                        case 5:
                            if (i21 > 0) {
                                i19 += i21;
                            }
                            break;
                        case 6:
                        case 7:
                        case 8:
                            int iAbs = Math.abs(i20);
                            int iAbs2 = iAbs - (Math.abs(8) - iAbs);
                            if (iAbs2 == 0) {
                                RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                                RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                            } else if (iAbs2 > 0) {
                                i19 += i21;
                            }
                            break;
                        default:
                            x01.a();
                            return;
                    }
                }
                iB = i19;
            } else {
                iB = n4h.b(i3);
                ly0.f(iB != -2147483647);
            }
            i7 = c0p.q((((long) i18) * ((long) iB)) / 1000000);
        }
        int iMax = (((Math.max(minBufferSize, (int) (((double) i7) * d2)) + i17) - 1) / i17) * i17;
        this.f0 = false;
        e eVar = new e(aVar, i4, i6, i5, i2, iIntValue, i3, iMax, i31Var, z2, z, this.c0);
        if (o()) {
            this.t = eVar;
        } else {
            this.u = eVar;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: T */
    /* JADX WARN: Code duplicated, block: B:46:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b4  */
    public final void e(long j2) throws d41, T {
        int iWrite;
        wiv.a aVar;
        androidx.media3.exoplayer.k.a aVar2;
        boolean z;
        i<d41> iVar = this.m;
        if (this.S == null) {
            return;
        }
        boolean z2 = false;
        if (iVar.a != 0) {
            synchronized (n0) {
                z = p0 > 0;
            }
            if (z || SystemClock.elapsedRealtime() < iVar.c) {
                return;
            }
        }
        int iRemaining = this.S.remaining();
        if (this.c0) {
            ly0.f(j2 != -9223372036854775807L);
            if (j2 == Long.MIN_VALUE) {
                j2 = this.d0;
            } else {
                this.d0 = j2;
            }
            AudioTrack audioTrack = this.w;
            ByteBuffer byteBuffer = this.S;
            if (Build.VERSION.SDK_INT >= 26) {
                iWrite = audioTrack.write(byteBuffer, iRemaining, 1, 1000 * j2);
            } else {
                if (this.F == null) {
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
                    this.F = byteBufferAllocate;
                    byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
                    this.F.putInt(1431633921);
                }
                if (this.G == 0) {
                    this.F.putInt(4, iRemaining);
                    this.F.putLong(8, j2 * 1000);
                    this.F.position(0);
                    this.G = iRemaining;
                }
                int iRemaining2 = this.F.remaining();
                if (iRemaining2 <= 0) {
                    iWrite = audioTrack.write(byteBuffer, iRemaining, 1);
                    if (iWrite < 0) {
                        this.G = 0;
                    } else {
                        this.G -= iWrite;
                    }
                } else {
                    int iWrite2 = audioTrack.write(this.F, iRemaining2, 1);
                    if (iWrite2 < 0) {
                        this.G = 0;
                        iWrite = iWrite2;
                    } else if (iWrite2 < iRemaining2) {
                        iWrite = 0;
                    } else {
                        iWrite = audioTrack.write(byteBuffer, iRemaining, 1);
                        if (iWrite < 0) {
                            this.G = 0;
                        } else {
                            this.G -= iWrite;
                        }
                    }
                }
            }
        } else {
            iWrite = this.w.write(this.S, iRemaining, 1);
        }
        this.e0 = SystemClock.elapsedRealtime();
        if (iWrite < 0) {
            if (iWrite == -6 || iWrite == -32) {
                if (k() > 0) {
                    z2 = true;
                } else if (p(this.w)) {
                    if (this.u.c == 1) {
                        this.f0 = true;
                    }
                    z2 = true;
                }
            }
            d41 d41Var = new d41(iWrite, this.u.a, z2);
            wiv.a aVar3 = this.s;
            if (aVar3 != null) {
                aVar3.a(d41Var);
            }
            if (!d41Var.b || this.a == null) {
                iVar.a(d41Var);
                return;
            }
            u21 u21Var = u21.c;
            this.x = u21Var;
            this.y.a(u21Var);
            throw d41Var;
        }
        iVar.a = null;
        iVar.b = -9223372036854775807L;
        iVar.c = -9223372036854775807L;
        if (p(this.w)) {
            if (this.K > 0) {
                this.g0 = false;
            }
            if (this.W && (aVar = this.s) != null && iWrite < iRemaining && !this.g0 && (aVar2 = wiv.this.U) != null) {
                aVar2.a();
            }
        }
        int i2 = this.u.c;
        if (i2 == 0) {
            this.J += (long) iWrite;
        }
        if (iWrite == iRemaining) {
            if (i2 != 0) {
                ly0.f(this.S == this.Q);
                this.K = (((long) this.L) * ((long) this.R)) + this.K;
            }
            this.S = null;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: T */
    /* JADX WARN: Code duplicated, block: B:19:0x0043 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0044 A[RETURN] */
    public final boolean f() throws d41, T {
        ByteBuffer byteBuffer;
        if (!this.v.d()) {
            e(Long.MIN_VALUE);
            if (this.S == null) {
                return true;
            }
            return false;
        }
        i31 i31Var = this.v;
        if (i31Var.d() && !i31Var.d) {
            i31Var.d = true;
            ((j31) i31Var.b.get(0)).f();
        }
        t(Long.MIN_VALUE);
        if (!this.v.c() || ((byteBuffer = this.S) != null && byteBuffer.hasRemaining())) {
            return false;
        }
        return true;
    }

    public final void g() {
        if (o()) {
            this.H = 0L;
            this.I = 0L;
            this.J = 0L;
            this.K = 0L;
            this.g0 = false;
            this.L = 0;
            this.C = new g(this.D, 0L, 0L);
            this.O = 0L;
            this.B = null;
            this.i.clear();
            this.Q = null;
            this.R = 0;
            this.S = null;
            this.U = false;
            this.T = false;
            this.V = false;
            this.F = null;
            this.G = 0;
            this.d.o = 0L;
            i31 i31Var = this.u.i;
            this.v = i31Var;
            i31Var.a();
            AudioTrack audioTrack = this.h.c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.w.pause();
            }
            if (p(this.w)) {
                k kVar = this.k;
                kVar.getClass();
                kVar.a(this.w);
            }
            final y31 y31VarA = this.u.a();
            e eVar = this.t;
            if (eVar != null) {
                this.u = eVar;
                this.t = null;
            }
            h41 h41Var = this.h;
            h41Var.f();
            h41Var.c = null;
            h41Var.e = null;
            h hVar = this.z;
            if (hVar != null) {
                AudioTrack audioTrack2 = hVar.a;
                uad uadVar = hVar.c;
                uadVar.getClass();
                audioTrack2.removeOnRoutingChangedListener(uadVar);
                hVar.c = null;
                this.z = null;
            }
            final AudioTrack audioTrack3 = this.w;
            final wiv.a aVar = this.s;
            final Handler handler = new Handler(Looper.myLooper());
            synchronized (n0) {
                try {
                    ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = o0;
                    if (scheduledExecutorServiceNewSingleThreadScheduledExecutor == null) {
                        String str = jrh0.a;
                        scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new brh0());
                        o0 = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
                    }
                    p0++;
                    scheduledExecutorServiceNewSingleThreadScheduledExecutor.schedule(new Runnable() { // from class: pad
                        @Override // java.lang.Runnable
                        public final void run() {
                            AudioTrack audioTrack4 = audioTrack3;
                            final b41 b41Var = aVar;
                            Handler handler2 = handler;
                            final y31 y31Var = y31VarA;
                            try {
                                audioTrack4.flush();
                                audioTrack4.release();
                                if (b41Var != null && handler2.getLooper().getThread().isAlive()) {
                                    handler2.post(new Runnable() { // from class: sad
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            final x31 x31Var = wiv.this.R0;
                                            Handler handler3 = x31Var.a;
                                            if (handler3 != null) {
                                                final y31 y31Var2 = y31Var;
                                                handler3.post(new Runnable() { // from class: n31
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        d.a aVar2 = x31Var.b;
                                                        String str2 = jrh0.a;
                                                        d.this.s.w(y31Var2);
                                                    }
                                                });
                                            }
                                        }
                                    });
                                }
                                synchronized (tad.n0) {
                                    try {
                                        int i2 = tad.p0 - 1;
                                        tad.p0 = i2;
                                        if (i2 == 0) {
                                            tad.o0.shutdown();
                                            tad.o0 = null;
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            } catch (Throwable th2) {
                                if (b41Var != null && handler2.getLooper().getThread().isAlive()) {
                                    handler2.post(new Runnable() { // from class: sad
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            final x31 x31Var = wiv.this.R0;
                                            Handler handler3 = x31Var.a;
                                            if (handler3 != null) {
                                                final y31 y31Var2 = y31Var;
                                                handler3.post(new Runnable() { // from class: n31
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        d.a aVar2 = x31Var.b;
                                                        String str2 = jrh0.a;
                                                        d.this.s.w(y31Var2);
                                                    }
                                                });
                                            }
                                        }
                                    });
                                }
                                synchronized (tad.n0) {
                                    try {
                                        int i3 = tad.p0 - 1;
                                        tad.p0 = i3;
                                        if (i3 == 0) {
                                            tad.o0.shutdown();
                                            tad.o0 = null;
                                        }
                                        throw th2;
                                    } catch (Throwable th3) {
                                        throw th3;
                                    }
                                }
                            }
                        }
                    }, 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.w = null;
        }
        i<d41> iVar = this.m;
        iVar.a = null;
        iVar.b = -9223372036854775807L;
        iVar.c = -9223372036854775807L;
        i<a41> iVar2 = this.l;
        iVar2.a = null;
        iVar2.b = -9223372036854775807L;
        iVar2.c = -9223372036854775807L;
        this.i0 = 0L;
        this.j0 = 0L;
        Handler handler2 = this.k0;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    public final h31 h(androidx.media3.common.a aVar) {
        Boolean boolValueOf;
        boolean zBooleanValue;
        if (this.f0) {
            return h31.d;
        }
        r21 r21Var = this.A;
        oad oadVar = this.o;
        oadVar.getClass();
        aVar.getClass();
        int i2 = aVar.G;
        r21Var.getClass();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 29 || i2 == -1) {
            return h31.d;
        }
        Context context = oadVar.a;
        Boolean bool = oadVar.b;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            if (context != null) {
                String parameters = g31.b(context).getParameters("offloadVariableRateSupported");
                boolValueOf = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
                oadVar.b = boolValueOf;
            } else {
                boolValueOf = Boolean.FALSE;
                oadVar.b = boolValueOf;
            }
            zBooleanValue = boolValueOf.booleanValue();
        }
        String str = aVar.n;
        str.getClass();
        int iC = gqv.c(str, aVar.k);
        if (iC == 0 || i3 < jrh0.r(iC)) {
            return h31.d;
        }
        int iS = jrh0.s(aVar.F);
        if (iS == 0) {
            return h31.d;
        }
        try {
            AudioFormat audioFormatBuild = new AudioFormat.Builder().setSampleRate(i2).setChannelMask(iS).setEncoding(iC).build();
            return i3 >= 31 ? oad.b.a(audioFormatBuild, r21Var.a().a, zBooleanValue) : oad.a.a(audioFormatBuild, r21Var.a().a, zBooleanValue);
        } catch (IllegalArgumentException unused) {
            return h31.d;
        }
    }

    public final int i(androidx.media3.common.a aVar) {
        q();
        String str = aVar.n;
        int i2 = aVar.H;
        if ("audio/raw".equals(str)) {
            if (!jrh0.K(i2)) {
                h08.a(i2, "Invalid PCM encoding: ", "DefaultAudioSink");
                return 0;
            }
            if (i2 != 2) {
                return 1;
            }
        } else if (this.x.d(this.A, aVar) == null) {
            return 0;
        }
        return 2;
    }

    public final long j() {
        e eVar = this.u;
        return eVar.c == 0 ? this.H / ((long) eVar.b) : this.I;
    }

    public final long k() {
        e eVar = this.u;
        if (eVar.c != 0) {
            return this.K;
        }
        long j2 = this.J;
        long j3 = eVar.d;
        String str = jrh0.a;
        return ((j2 + j3) - 1) / j3;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: T */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x018d  */
    /* JADX WARN: Code duplicated, block: B:101:0x0191  */
    /* JADX WARN: Code duplicated, block: B:102:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:103:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:104:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:106:0x01be  */
    /* JADX WARN: Code duplicated, block: B:109:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:113:0x01de A[LOOP:0: B:105:0x01bc->B:113:0x01de, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:116:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:117:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:119:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:120:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:123:0x0207  */
    /* JADX WARN: Code duplicated, block: B:124:0x020a  */
    /* JADX WARN: Code duplicated, block: B:126:0x021d  */
    /* JADX WARN: Code duplicated, block: B:127:0x0221  */
    /* JADX WARN: Code duplicated, block: B:130:0x0234  */
    /* JADX WARN: Code duplicated, block: B:135:0x0243  */
    /* JADX WARN: Code duplicated, block: B:156:0x0273  */
    /* JADX WARN: Code duplicated, block: B:157:0x0276  */
    /* JADX WARN: Code duplicated, block: B:159:0x027a  */
    /* JADX WARN: Code duplicated, block: B:162:0x028a  */
    /* JADX WARN: Code duplicated, block: B:165:0x029b  */
    /* JADX WARN: Code duplicated, block: B:167:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:170:0x02be  */
    /* JADX WARN: Code duplicated, block: B:189:0x0331  */
    /* JADX WARN: Code duplicated, block: B:191:0x0338  */
    /* JADX WARN: Code duplicated, block: B:192:0x033a  */
    /* JADX WARN: Code duplicated, block: B:194:0x0346 A[LOOP:1: B:193:0x0344->B:194:0x0346, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:197:0x0359 A[LOOP:2: B:196:0x0357->B:197:0x0359, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:201:0x037a  */
    /* JADX WARN: Code duplicated, block: B:202:0x0380  */
    /* JADX WARN: Code duplicated, block: B:209:0x0397  */
    /* JADX WARN: Code duplicated, block: B:212:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:213:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:215:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:219:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:223:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:226:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:228:0x0407  */
    /* JADX WARN: Code duplicated, block: B:233:0x0415  */
    /* JADX WARN: Code duplicated, block: B:234:0x0420  */
    /* JADX WARN: Code duplicated, block: B:236:0x042e  */
    /* JADX WARN: Code duplicated, block: B:238:0x0439  */
    /* JADX WARN: Code duplicated, block: B:240:0x0440  */
    /* JADX WARN: Code duplicated, block: B:242:0x044a  */
    /* JADX WARN: Code duplicated, block: B:249:0x00af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:251:0x01e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:252:0x01dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:67:0x010b  */
    /* JADX WARN: Code duplicated, block: B:68:0x010d  */
    /* JADX WARN: Code duplicated, block: B:71:0x0112  */
    /* JADX WARN: Code duplicated, block: B:73:0x0122  */
    /* JADX WARN: Code duplicated, block: B:75:0x0136  */
    /* JADX WARN: Code duplicated, block: B:76:0x0145  */
    /* JADX WARN: Code duplicated, block: B:79:0x014b  */
    /* JADX WARN: Code duplicated, block: B:81:0x0153  */
    /* JADX WARN: Code duplicated, block: B:82:0x0155  */
    /* JADX WARN: Code duplicated, block: B:86:0x0161  */
    /* JADX WARN: Code duplicated, block: B:92:0x0173  */
    /* JADX WARN: Code duplicated, block: B:94:0x0179  */
    /* JADX WARN: Code duplicated, block: B:96:0x017e  */
    /* JADX WARN: Code duplicated, block: B:98:0x0183  */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0390, code lost:
    
        if (r15 == 0) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b3, code lost:
    
        if (n() == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l(long r28, java.nio.ByteBuffer r30, int r31) throws defpackage.d41, T, defpackage.a41 {
        /*
            Method dump skipped, instruction units count: 1164
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tad.l(long, java.nio.ByteBuffer, int):boolean");
    }

    public final boolean m() {
        if (!o()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29 && this.w.isOffloadedPlayback() && this.V) {
            return false;
        }
        long jK = k();
        h41 h41Var = this.h;
        long jA = h41Var.a();
        int i2 = h41Var.f;
        String str = jrh0.a;
        return jK > jrh0.V(jA, (long) i2, 1000000L, RoundingMode.UP);
    }

    /* JADX WARN: Code duplicated, block: B:74:0x018d  */
    /* JADX WARN: Code duplicated, block: B:85:? A[SYNTHETIC] */
    public final boolean n() throws a41 {
        AudioTrack audioTrackC;
        dpt dptVar;
        sp10 sp10Var;
        boolean z;
        i<a41> iVar = this.l;
        if (iVar.a != 0) {
            synchronized (n0) {
                z = p0 > 0;
            }
            if (z || SystemClock.elapsedRealtime() < iVar.c) {
                return false;
            }
        }
        try {
            e eVar = this.u;
            eVar.getClass();
            audioTrackC = c(eVar);
        } catch (a41 e2) {
            e eVar2 = this.u;
            if (eVar2.h > 1000000) {
                e eVar3 = new e(eVar2.a, eVar2.b, eVar2.c, eVar2.d, eVar2.e, eVar2.f, eVar2.g, CashOut.BIG_NUMBER, eVar2.i, eVar2.j, eVar2.k, eVar2.l);
                try {
                    audioTrackC = c(eVar3);
                    this.u = eVar3;
                } catch (a41 e3) {
                    e2.addSuppressed(e3);
                    if (this.u.c == 1) {
                        throw e2;
                    }
                    this.f0 = true;
                    throw e2;
                }
            }
            if (this.u.c == 1) {
                throw e2;
            }
            this.f0 = true;
            throw e2;
        }
        this.w = audioTrackC;
        if (p(audioTrackC)) {
            AudioTrack audioTrack = this.w;
            k kVar = this.k;
            if (kVar == null) {
                kVar = new k();
                this.k = kVar;
            }
            final Handler handler = kVar.a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new Executor() { // from class: vad
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    handler.post(runnable);
                }
            }, kVar.b);
            e eVar4 = this.u;
            if (eVar4.k) {
                AudioTrack audioTrack2 = this.w;
                androidx.media3.common.a aVar = eVar4.a;
                audioTrack2.setOffloadDelayPadding(aVar.I, aVar.J);
            }
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31 && (sp10Var = this.r) != null) {
            a.a(this.w, sp10Var);
        }
        h41 h41Var = this.h;
        AudioTrack audioTrack3 = this.w;
        e eVar5 = this.u;
        int i3 = eVar5.c;
        int i4 = eVar5.g;
        int i5 = eVar5.d;
        int i6 = eVar5.h;
        boolean z2 = this.m0;
        h41Var.c = audioTrack3;
        h41Var.d = i6;
        h41Var.e = new f41(audioTrack3, h41Var.a);
        h41Var.f = audioTrack3.getSampleRate();
        boolean zK = jrh0.K(i4);
        h41Var.p = zK;
        h41Var.g = zK ? jrh0.T(h41Var.f, i6 / i5) : -9223372036854775807L;
        h41Var.s = 0L;
        h41Var.t = 0L;
        h41Var.D = false;
        h41Var.E = 0L;
        h41Var.w = -9223372036854775807L;
        h41Var.x = -9223372036854775807L;
        h41Var.q = 0L;
        h41Var.o = 0L;
        h41Var.h = 1.0f;
        h41Var.k = 0;
        h41Var.j = -9223372036854775807L;
        h41Var.A = z2;
        if (o()) {
            this.w.setVolume(this.P);
        }
        this.a0.getClass();
        x21 x21Var = this.b0;
        if (x21Var != null) {
            this.w.setPreferredDevice(x21Var.a);
            w21 w21Var = this.y;
            if (w21Var != null) {
                w21Var.b(this.b0.a);
            }
        }
        w21 w21Var2 = this.y;
        if (w21Var2 != null) {
            this.z = new h(this.w, w21Var2);
        }
        this.N = true;
        int audioSessionId = this.w.getAudioSessionId();
        boolean z3 = audioSessionId != this.Y;
        this.Y = audioSessionId;
        wiv.a aVar2 = this.s;
        if (aVar2 != null) {
            final y31 y31VarA = this.u.a();
            final x31 x31Var = wiv.this.R0;
            Handler handler2 = x31Var.a;
            if (handler2 != null) {
                handler2.post(new Runnable() { // from class: s31
                    @Override // java.lang.Runnable
                    public final void run() {
                        d.a aVar3 = x31Var.b;
                        String str = jrh0.a;
                        d.this.s.B(y31VarA);
                    }
                });
            }
            if (z3) {
                this.Z = true;
                wiv.a aVar3 = this.s;
                final int i7 = this.Y;
                wiv wivVar = wiv.this;
                if (i2 >= 35 && (dptVar = wivVar.T0) != null) {
                    dptVar.d(i7);
                }
                final x31 x31Var2 = wivVar.R0;
                Handler handler3 = x31Var2.a;
                if (handler3 != null) {
                    handler3.post(new Runnable() { // from class: w31
                        @Override // java.lang.Runnable
                        public final void run() {
                            d.a aVar4 = x31Var2.b;
                            String str = jrh0.a;
                            final vs1<Integer> vs1Var = d.this.F;
                            int i8 = i7;
                            final hyg hygVar = new hyg(i8);
                            vs1Var.getClass();
                            ly0.f(Looper.myLooper() == vs1Var.b.f());
                            vs1Var.f++;
                            vs1Var.a(new Runnable() { // from class: ts1
                                /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
                                @Override // java.lang.Runnable
                                public final void run() {
                                    hyg hygVar2 = hygVar;
                                    final vs1 vs1Var2 = vs1Var;
                                    final ?? Apply = hygVar2.apply(vs1Var2.e);
                                    vs1Var2.e = Apply;
                                    Runnable runnable = new Runnable() { // from class: us1
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            vs1 vs1Var3 = vs1Var2;
                                            int i9 = vs1Var3.f - 1;
                                            vs1Var3.f = i9;
                                            if (i9 == 0) {
                                                vs1Var3.b(Apply);
                                            }
                                        }
                                    };
                                    cdl cdlVar = vs1Var2.b;
                                    if (cdlVar.f().getThread().isAlive()) {
                                        cdlVar.i(runnable);
                                    }
                                }
                            });
                            Integer num = vs1Var.d;
                            vs1Var.b(Integer.valueOf(i8));
                        }
                    });
                }
            }
        }
        return true;
    }

    public final boolean o() {
        return this.w != null;
    }

    public final void q() {
        Context context;
        u21 u21Var;
        Looper looperMyLooper = Looper.myLooper();
        boolean z = this.y == null || this.h0 == looperMyLooper;
        StringBuilder sb = new StringBuilder("DefaultAudioSink accessed on multiple threads: ");
        Looper looper = this.h0;
        sb.append(looper == null ? "null" : looper.getThread().getName());
        sb.append(" and ");
        sb.append(looperMyLooper != null ? looperMyLooper.getThread().getName() : "null");
        ly0.e(sb.toString(), z);
        if (this.y == null && (context = this.a) != null) {
            this.h0 = looperMyLooper;
            w21 w21Var = new w21(context, new qad(this), this.A, this.b0);
            this.y = w21Var;
            if (w21Var.j) {
                u21Var = w21Var.g;
                u21Var.getClass();
            } else {
                w21Var.j = true;
                w21.b bVar = w21Var.f;
                if (bVar != null) {
                    bVar.a.registerContentObserver(bVar.b, false, bVar);
                }
                Handler handler = w21Var.c;
                Context context2 = w21Var.a;
                w21.a aVar = w21Var.d;
                if (aVar != null) {
                    g31.b(context2).registerAudioDeviceCallback(aVar, handler);
                }
                u21 u21VarC = u21.c(context2, context2.registerReceiver(w21Var.e, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), w21Var.i, w21Var.h);
                w21Var.g = u21VarC;
                u21Var = u21VarC;
            }
            this.x = u21Var;
        }
        this.x.getClass();
    }

    public final void r() {
        this.W = true;
        if (o()) {
            h41 h41Var = this.h;
            if (h41Var.w != -9223372036854775807L) {
                h41Var.w = jrh0.O(h41Var.F.d());
            }
            h41Var.j = jrh0.T(h41Var.f, h41Var.b());
            f41 f41Var = h41Var.e;
            f41Var.getClass();
            f41Var.a(0);
            if (!this.U || p(this.w)) {
                this.w.play();
            }
        }
    }

    public final void s() {
        if (this.U) {
            return;
        }
        this.U = true;
        long jK = k();
        h41 h41Var = this.h;
        h41Var.y = h41Var.b();
        h41Var.w = jrh0.O(h41Var.F.d());
        h41Var.z = jK;
        if (p(this.w)) {
            this.V = false;
        }
        this.w.stop();
        this.G = 0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: T */
    public final void t(long j2) throws d41, T {
        ByteBuffer byteBuffer;
        e(j2);
        if (this.S != null) {
            return;
        }
        if (!this.v.d()) {
            ByteBuffer byteBuffer2 = this.Q;
            if (byteBuffer2 != null) {
                y(byteBuffer2);
                e(j2);
                return;
            }
            return;
        }
        while (!this.v.c()) {
            do {
                i31 i31Var = this.v;
                if (i31Var.d()) {
                    ByteBuffer byteBuffer3 = i31Var.c[i31Var.b()];
                    if (byteBuffer3.hasRemaining()) {
                        byteBuffer = byteBuffer3;
                    } else {
                        i31Var.e(j31.a);
                        byteBuffer = i31Var.c[i31Var.b()];
                    }
                } else {
                    byteBuffer = j31.a;
                }
                if (byteBuffer.hasRemaining()) {
                    y(byteBuffer);
                    e(j2);
                } else {
                    ByteBuffer byteBuffer4 = this.Q;
                    if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                        return;
                    }
                    i31 i31Var2 = this.v;
                    ByteBuffer byteBuffer5 = this.Q;
                    if (i31Var2.d() && !i31Var2.d) {
                        i31Var2.e(byteBuffer5);
                    }
                }
            } while (this.S == null);
            return;
        }
    }

    public final void u() {
        g();
        pcn.b bVarListIterator = this.g.listIterator(0);
        while (bVarListIterator.hasNext()) {
            ((j31) bVarListIterator.next()).reset();
        }
        this.e.reset();
        this.f.reset();
        i31 i31Var = this.v;
        if (i31Var != null) {
            pcn<j31> pcnVar = i31Var.a;
            for (int i2 = 0; i2 < pcnVar.size(); i2++) {
                j31 j31Var = pcnVar.get(i2);
                j31Var.flush();
                j31Var.reset();
            }
            i31Var.c = new ByteBuffer[0];
            j31.a aVar = j31.a.e;
            i31Var.d = false;
        }
        this.W = false;
        this.f0 = false;
    }

    public final void v() {
        if (o()) {
            try {
                this.w.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.D.a).setPitch(this.D.b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e2) {
                cft.h("DefaultAudioSink", "Failed to set playback params", e2);
            }
            eo10 eo10Var = new eo10(this.w.getPlaybackParams().getSpeed(), this.w.getPlaybackParams().getPitch());
            this.D = eo10Var;
            float f2 = eo10Var.a;
            h41 h41Var = this.h;
            h41Var.h = f2;
            f41 f41Var = h41Var.e;
            if (f41Var != null) {
                f41Var.a(0);
            }
            h41Var.f();
        }
    }

    public final void w(int i2, int i3) {
        e eVar;
        AudioTrack audioTrack = this.w;
        if (audioTrack == null || !p(audioTrack) || (eVar = this.u) == null || !eVar.k) {
            return;
        }
        this.w.setOffloadDelayPadding(i2, i3);
    }

    public final void x(int i2) {
        ly0.f(Build.VERSION.SDK_INT >= 29);
        this.j = i2;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0038  */
    /* JADX WARN: Code duplicated, block: B:47:0x013f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0142  */
    /* JADX WARN: Code duplicated, block: B:51:0x0145 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0147  */
    /* JADX WARN: Code duplicated, block: B:54:0x014b  */
    /* JADX WARN: Code duplicated, block: B:56:0x014f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0153  */
    /* JADX WARN: Code duplicated, block: B:60:0x0157  */
    /* JADX WARN: Code duplicated, block: B:63:0x0173  */
    /* JADX WARN: Code duplicated, block: B:64:0x0186  */
    /* JADX WARN: Code duplicated, block: B:65:0x0193  */
    /* JADX WARN: Code duplicated, block: B:66:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:67:0x01bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:70:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:71:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:81:0x016f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x01e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0057 A[SYNTHETIC] */
    public final void y(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferOrder;
        int i2;
        byte b2;
        int i3;
        int i4;
        int i5;
        ly0.f(this.S == null);
        if (byteBuffer.hasRemaining()) {
            if (this.u.c != 0) {
                byteBufferOrder = byteBuffer;
            } else {
                int iV = (int) jrh0.V(jrh0.O(20L), this.u.e, 1000000L, RoundingMode.UP);
                long jK = k();
                long j2 = iV;
                if (jK >= j2) {
                    byteBufferOrder = byteBuffer;
                } else {
                    e eVar = this.u;
                    int i6 = eVar.g;
                    int i7 = eVar.d;
                    int i8 = (int) jK;
                    byteBufferOrder = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
                    int iPosition = byteBuffer.position();
                    while (byteBuffer.hasRemaining() && i8 < iV) {
                        if (i6 != 2) {
                            if (i6 == 3) {
                                i4 = (byteBuffer.get() & 255) << 24;
                            } else if (i6 == 4) {
                                float fH = jrh0.h(byteBuffer.getFloat(), -1.0f, 1.0f);
                                i4 = (int) (fH < 0.0f ? (-fH) * (-2.1474836E9f) : fH * 2.1474836E9f);
                            } else if (i6 != 21) {
                                if (i6 == 22) {
                                    i2 = (byteBuffer.get() & 255) | ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
                                    b2 = byteBuffer.get();
                                } else if (i6 == 268435456) {
                                    i2 = (byteBuffer.get() & 255) << 24;
                                    i3 = (byteBuffer.get() & 255) << 16;
                                } else if (i6 == 1342177280) {
                                    i2 = ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16);
                                    i3 = (byteBuffer.get() & 255) << 8;
                                } else if (i6 != 1610612736) {
                                    fm20.a();
                                    return;
                                } else {
                                    i2 = ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 8);
                                    i3 = byteBuffer.get() & 255;
                                }
                                i4 = i2 | i3;
                            } else {
                                i2 = ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
                                b2 = byteBuffer.get();
                            }
                            i5 = (int) ((((long) i4) * ((long) i8)) / j2);
                            if (i6 != 2) {
                                byteBufferOrder.put((byte) (i5 >> 16));
                                byteBufferOrder.put((byte) (i5 >> 24));
                            } else if (i6 != 3) {
                                byteBufferOrder.put((byte) (i5 >> 24));
                            } else if (i6 != 4) {
                                if (i6 != 21) {
                                    byteBufferOrder.put((byte) (i5 >> 8));
                                    byteBufferOrder.put((byte) (i5 >> 16));
                                    byteBufferOrder.put((byte) (i5 >> 24));
                                } else if (i6 != 22) {
                                    byteBufferOrder.put((byte) i5);
                                    byteBufferOrder.put((byte) (i5 >> 8));
                                    byteBufferOrder.put((byte) (i5 >> 16));
                                    byteBufferOrder.put((byte) (i5 >> 24));
                                } else if (i6 != 268435456) {
                                    byteBufferOrder.put((byte) (i5 >> 24));
                                    byteBufferOrder.put((byte) (i5 >> 16));
                                } else if (i6 != 1342177280) {
                                    byteBufferOrder.put((byte) (i5 >> 24));
                                    byteBufferOrder.put((byte) (i5 >> 16));
                                    byteBufferOrder.put((byte) (i5 >> 8));
                                } else {
                                    if (i6 == 1610612736) {
                                        fm20.a();
                                        return;
                                    }
                                    byteBufferOrder.put((byte) (i5 >> 24));
                                    byteBufferOrder.put((byte) (i5 >> 16));
                                    byteBufferOrder.put((byte) (i5 >> 8));
                                    byteBufferOrder.put((byte) i5);
                                }
                            } else if (i5 < 0) {
                                byteBufferOrder.putFloat((-i5) / (-2.1474836E9f));
                            } else {
                                byteBufferOrder.putFloat(i5 / 2.1474836E9f);
                            }
                            if (byteBuffer.position() == iPosition + i7) {
                                i8++;
                                iPosition = byteBuffer.position();
                            }
                        } else {
                            i2 = (byteBuffer.get() & 255) << 16;
                            b2 = byteBuffer.get();
                        }
                        i3 = (b2 & 255) << 24;
                        i4 = i2 | i3;
                        i5 = (int) ((((long) i4) * ((long) i8)) / j2);
                        if (i6 != 2) {
                            byteBufferOrder.put((byte) (i5 >> 16));
                            byteBufferOrder.put((byte) (i5 >> 24));
                        } else if (i6 != 3) {
                            byteBufferOrder.put((byte) (i5 >> 24));
                        } else if (i6 != 4) {
                            if (i6 != 21) {
                                byteBufferOrder.put((byte) (i5 >> 8));
                                byteBufferOrder.put((byte) (i5 >> 16));
                                byteBufferOrder.put((byte) (i5 >> 24));
                            } else if (i6 != 22) {
                                byteBufferOrder.put((byte) i5);
                                byteBufferOrder.put((byte) (i5 >> 8));
                                byteBufferOrder.put((byte) (i5 >> 16));
                                byteBufferOrder.put((byte) (i5 >> 24));
                            } else if (i6 != 268435456) {
                                byteBufferOrder.put((byte) (i5 >> 24));
                                byteBufferOrder.put((byte) (i5 >> 16));
                            } else if (i6 != 1342177280) {
                                byteBufferOrder.put((byte) (i5 >> 24));
                                byteBufferOrder.put((byte) (i5 >> 16));
                                byteBufferOrder.put((byte) (i5 >> 8));
                            } else {
                                if (i6 == 1610612736) {
                                    fm20.a();
                                    return;
                                }
                                byteBufferOrder.put((byte) (i5 >> 24));
                                byteBufferOrder.put((byte) (i5 >> 16));
                                byteBufferOrder.put((byte) (i5 >> 8));
                                byteBufferOrder.put((byte) i5);
                            }
                        } else if (i5 < 0) {
                            byteBufferOrder.putFloat((-i5) / (-2.1474836E9f));
                        } else {
                            byteBufferOrder.putFloat(i5 / 2.1474836E9f);
                        }
                        if (byteBuffer.position() == iPosition + i7) {
                            i8++;
                            iPosition = byteBuffer.position();
                        }
                    }
                    byteBufferOrder.put(byteBuffer);
                    byteBufferOrder.flip();
                }
            }
            this.S = byteBufferOrder;
        }
    }

    public final boolean z(androidx.media3.common.a aVar) {
        return i(aVar) != 0;
    }
}
