package defpackage;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import androidx.media3.exoplayer.d;
import androidx.media3.exoplayer.k;
import androidx.media3.exoplayer.l;
import com.sportygames.goldmine.data.dto.oBji.dLRYz;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: loaded from: classes.dex */
public final class wiv extends ejv implements uiv {
    public final x31 R0;
    public final tad S0;
    public final dpt T0;
    public int U0;
    public boolean V0;
    public androidx.media3.common.a W0;
    public androidx.media3.common.a X0;
    public long Y0;
    public boolean Z0;
    public boolean a1;
    public boolean b1;
    public int c1;
    public boolean d1;
    public long e1;

    public final class a implements b41 {
        public a() {
        }

        public final void a(final Exception exc) {
            cft.d("MediaCodecAudioRenderer", "Audio sink error", exc);
            final x31 x31Var = wiv.this.R0;
            Handler handler = x31Var.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: t31
                    @Override // java.lang.Runnable
                    public final void run() {
                        d.a aVar = x31Var.b;
                        String str = jrh0.a;
                        d.this.s.E(exc);
                    }
                });
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wiv(Context context, viv.b bVar, Handler handler, d.a aVar, tad tadVar) {
        super(1, bVar, 44100.0f);
        dpt dptVar = Build.VERSION.SDK_INT >= 35 ? new dpt() : null;
        context.getApplicationContext();
        this.S0 = tadVar;
        this.T0 = dptVar;
        this.c1 = -1000;
        this.R0 = new x31(handler, aVar);
        this.e1 = -9223372036854775807L;
        tadVar.s = new a();
    }

    @Override // androidx.media3.exoplayer.b, androidx.media3.exoplayer.k
    public final uiv C() {
        return this;
    }

    @Override // defpackage.ejv, androidx.media3.exoplayer.b
    public final void E() {
        x31 x31Var = this.R0;
        this.a1 = true;
        this.W0 = null;
        this.e1 = -9223372036854775807L;
        try {
            this.S0.g();
            try {
                super.E();
            } finally {
                x31Var.a(this.I0);
            }
        } catch (Throwable th) {
            try {
                super.E();
                throw th;
            } finally {
                x31Var.a(this.I0);
            }
        }
    }

    @Override // defpackage.ejv
    public final boolean E0(androidx.media3.common.a aVar) {
        d850 d850Var = this.d;
        d850Var.getClass();
        if (d850Var.a != 0) {
            int iJ0 = J0(aVar);
            if ((iJ0 & 512) != 0) {
                d850 d850Var2 = this.d;
                d850Var2.getClass();
                if (d850Var2.a == 2 || (iJ0 & 1024) != 0) {
                    return true;
                }
                if (aVar.I == 0 && aVar.J == 0) {
                    return true;
                }
            }
        }
        return this.S0.z(aVar);
    }

    @Override // androidx.media3.exoplayer.b
    public final void F(boolean z, boolean z2) {
        final e5d e5dVar = new e5d();
        this.I0 = e5dVar;
        final x31 x31Var = this.R0;
        Handler handler = x31Var.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: q31
                @Override // java.lang.Runnable
                public final void run() {
                    d.a aVar = x31Var.b;
                    String str = jrh0.a;
                    d.this.s.i0(e5dVar);
                }
            });
        }
        d850 d850Var = this.d;
        d850Var.getClass();
        boolean z3 = d850Var.b;
        tad tadVar = this.S0;
        if (z3) {
            ly0.f(tadVar.X);
            if (!tadVar.c0) {
                tadVar.c0 = true;
                tadVar.g();
            }
        } else if (tadVar.c0) {
            tadVar.c0 = false;
            tadVar.g();
        }
        sp10 sp10Var = this.f;
        sp10Var.getClass();
        tadVar.r = sp10Var;
        vs7 vs7Var = this.i;
        vs7Var.getClass();
        tadVar.h.F = vs7Var;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005a  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b1  */
    @Override // defpackage.ejv
    public final int F0(androidx.media3.common.a aVar) {
        int iJ0;
        c150 c150VarF;
        boolean z;
        boolean z2;
        int iK = l.k(1, 0, 0, 0);
        String str = aVar.n;
        String str2 = aVar.n;
        if (!gqv.i(str)) {
            return l.k(0, 0, 0, 0);
        }
        int i = aVar.O;
        boolean z3 = i != 0;
        boolean z4 = i == 0 || i == 2;
        int i2 = 8;
        tad tadVar = this.S0;
        if (z4) {
            if (z3) {
                List<ziv> listD = ijv.d("audio/raw", false, false);
                if ((listD.isEmpty() ? null : listD.get(0)) == null) {
                    iJ0 = 0;
                }
            }
            iJ0 = J0(aVar);
            if (tadVar.z(aVar)) {
                return l.k(4, 8, 32, iJ0);
            }
        } else {
            iJ0 = 0;
        }
        if (!"audio/raw".equals(str2) || tadVar.z(aVar)) {
            int i3 = aVar.F;
            int i4 = aVar.G;
            androidx.media3.common.a.C0062a c0062a = new androidx.media3.common.a.C0062a();
            c0062a.m = gqv.m("audio/raw");
            c0062a.E = i3;
            c0062a.F = i4;
            c0062a.G = 2;
            if (tadVar.z(new androidx.media3.common.a(c0062a))) {
                if (str2 == null) {
                    pcn.b bVar = pcn.b;
                    c150VarF = c150.e;
                } else if (tadVar.z(aVar)) {
                    List<ziv> listD2 = ijv.d("audio/raw", false, false);
                    ziv zivVar = listD2.isEmpty() ? null : listD2.get(0);
                    if (zivVar != null) {
                        c150VarF = pcn.n(zivVar);
                    } else {
                        c150VarF = ijv.f(aVar, false, false);
                    }
                } else {
                    c150VarF = ijv.f(aVar, false, false);
                }
                if (!c150VarF.isEmpty()) {
                    if (!z4) {
                        return l.k(2, 0, 0, 0);
                    }
                    ziv zivVar2 = (ziv) c150VarF.get(0);
                    boolean zE = zivVar2.e(aVar);
                    if (!zE) {
                        int i5 = 1;
                        while (true) {
                            if (i5 >= c150VarF.d) {
                                z = zE;
                                z2 = true;
                                break;
                            }
                            ziv zivVar3 = (ziv) c150VarF.get(i5);
                            if (zivVar3.e(aVar)) {
                                z2 = false;
                                zivVar2 = zivVar3;
                                z = true;
                                break;
                            }
                            i5++;
                        }
                    } else {
                        z = zE;
                        z2 = true;
                        break;
                    }
                    int i6 = z ? 4 : 3;
                    if (z && zivVar2.f(aVar)) {
                        i2 = 16;
                    }
                    return (zivVar2.g ? 64 : 0) | i6 | i2 | 32 | (z2 ? 128 : 0) | iJ0;
                }
            }
        }
        return iK;
    }

    @Override // defpackage.ejv, androidx.media3.exoplayer.b
    public final void G(long j, boolean z) {
        super.G(j, z);
        this.S0.g();
        this.Y0 = j;
        this.e1 = -9223372036854775807L;
        this.b1 = false;
        this.Z0 = true;
    }

    @Override // androidx.media3.exoplayer.b
    public final void H() {
        dpt dptVar;
        w21 w21Var = this.S0.y;
        if (w21Var != null) {
            Context context = w21Var.a;
            if (w21Var.j) {
                w21Var.g = null;
                w21.a aVar = w21Var.d;
                if (aVar != null) {
                    g31.b(context).unregisterAudioDeviceCallback(aVar);
                }
                context.unregisterReceiver(w21Var.e);
                w21.b bVar = w21Var.f;
                if (bVar != null) {
                    bVar.a.unregisterContentObserver(bVar);
                }
                w21Var.j = false;
            }
        }
        if (Build.VERSION.SDK_INT < 35 || (dptVar = this.T0) == null) {
            return;
        }
        dptVar.b();
    }

    @Override // androidx.media3.exoplayer.b
    public final void I() {
        tad tadVar = this.S0;
        this.b1 = false;
        this.e1 = -9223372036854775807L;
        try {
            try {
                this.r0 = false;
                v0();
                t0();
                lef lefVar = this.T;
                if (lefVar != null) {
                    lefVar.i(null);
                }
                this.T = null;
                if (this.a1) {
                    this.a1 = false;
                    tadVar.u();
                }
            } catch (Throwable th) {
                lef lefVar2 = this.T;
                if (lefVar2 != null) {
                    lefVar2.i(null);
                }
                this.T = null;
                throw th;
            }
        } catch (Throwable th2) {
            if (this.a1) {
                this.a1 = false;
                tadVar.u();
            }
            throw th2;
        }
    }

    @Override // androidx.media3.exoplayer.b
    public final void J() {
        this.S0.r();
        this.d1 = true;
    }

    public final int J0(androidx.media3.common.a aVar) {
        h31 h31VarH = this.S0.h(aVar);
        if (!h31VarH.a) {
            return 0;
        }
        int i = h31VarH.b ? 1536 : 512;
        return h31VarH.c ? i | 2048 : i;
    }

    @Override // androidx.media3.exoplayer.b
    public final void K() {
        K0();
        this.d1 = false;
        tad tadVar = this.S0;
        tadVar.W = false;
        if (tadVar.o()) {
            h41 h41Var = tadVar.h;
            h41Var.f();
            if (h41Var.w == -9223372036854775807L) {
                f41 f41Var = h41Var.e;
                f41Var.getClass();
                f41Var.a(0);
            }
            h41Var.y = h41Var.b();
            if (!tadVar.U || tad.p(tadVar.w)) {
                tadVar.w.pause();
            }
        }
    }

    public final void K0() {
        long j;
        long jMax;
        long j2;
        b();
        final tad tadVar = this.S0;
        tad.f fVar = tadVar.b;
        if (!tadVar.o() || tadVar.N) {
            j = Long.MIN_VALUE;
            jMax = Long.MIN_VALUE;
        } else {
            long jMin = Math.min(tadVar.h.a(), jrh0.T(tadVar.u.e, tadVar.k()));
            ArrayDeque<tad.g> arrayDeque = tadVar.i;
            while (!arrayDeque.isEmpty() && jMin >= arrayDeque.getFirst().c) {
                tadVar.C = arrayDeque.remove();
            }
            tad.g gVar = tadVar.C;
            long jV = jMin - gVar.c;
            long jZ = jrh0.z(gVar.a.a, jV);
            if (arrayDeque.isEmpty()) {
                woa0 woa0Var = fVar.c;
                if (!woa0Var.isActive()) {
                    j = Long.MIN_VALUE;
                } else if (woa0Var.n >= RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
                    long j3 = woa0Var.m;
                    voa0 voa0Var = woa0Var.i;
                    voa0Var.getClass();
                    long j4 = j3 - ((long) ((voa0Var.k * voa0Var.b) * 2));
                    int i = woa0Var.g.a;
                    int i2 = woa0Var.f.a;
                    j = Long.MIN_VALUE;
                    long j5 = woa0Var.n;
                    jV = i == i2 ? jrh0.V(jV, j4, j5, RoundingMode.DOWN) : jrh0.V(jV, j4 * ((long) i), j5 * ((long) i2), RoundingMode.DOWN);
                } else {
                    j = Long.MIN_VALUE;
                    jV = (long) (((double) woa0Var.b) * jV);
                }
                tad.g gVar2 = tadVar.C;
                j2 = gVar2.b + jV;
                gVar2.d = jV - jZ;
            } else {
                j = Long.MIN_VALUE;
                tad.g gVar3 = tadVar.C;
                j2 = gVar3.b + jZ + gVar3.d;
            }
            long j6 = fVar.b.l;
            jMax = jrh0.T(tadVar.u.e, j6) + j2;
            long j7 = tadVar.i0;
            if (j6 > j7) {
                long jT = jrh0.T(tadVar.u.e, j6 - j7);
                tadVar.i0 = j6;
                tadVar.j0 += jT;
                Handler handler = tadVar.k0;
                if (handler == null) {
                    handler = new Handler(Looper.myLooper());
                    tadVar.k0 = handler;
                }
                handler.removeCallbacksAndMessages(null);
                tadVar.k0.postDelayed(new Runnable() { // from class: rad
                    @Override // java.lang.Runnable
                    public final void run() {
                        tad tadVar2 = tadVar;
                        if (tadVar2.j0 >= 300000) {
                            wiv.this.b1 = true;
                            tadVar2.j0 = 0L;
                        }
                    }
                }, 100L);
            }
        }
        if (jMax != j) {
            if (!this.Z0) {
                jMax = Math.max(this.Y0, jMax);
            }
            this.Y0 = jMax;
            this.Z0 = false;
        }
    }

    @Override // defpackage.ejv
    public final i5d O(ziv zivVar, androidx.media3.common.a aVar, androidx.media3.common.a aVar2) {
        i5d i5dVarB = zivVar.b(aVar, aVar2);
        int i = i5dVarB.e;
        if (this.T == null && E0(aVar2)) {
            i |= 32768;
        }
        "OMX.google.raw.decoder".equals(zivVar.a);
        if (aVar2.o > this.U0) {
            i |= 64;
        }
        int i2 = i;
        return new i5d(zivVar.a, aVar, aVar2, i2 != 0 ? 0 : i5dVarB.d, i2);
    }

    @Override // defpackage.ejv
    public final float X(float f, androidx.media3.common.a aVar, androidx.media3.common.a[] aVarArr) {
        int iMax = -1;
        for (androidx.media3.common.a aVar2 : aVarArr) {
            int i = aVar2.G;
            if (i != -1) {
                iMax = Math.max(iMax, i);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002d  */
    @Override // defpackage.ejv
    public final ArrayList Y(androidx.media3.common.a aVar, boolean z) {
        c150 c150VarF;
        if (aVar.n == null) {
            pcn.b bVar = pcn.b;
            c150VarF = c150.e;
        } else if (this.S0.z(aVar)) {
            List<ziv> listD = ijv.d("audio/raw", false, false);
            ziv zivVar = listD.isEmpty() ? null : listD.get(0);
            if (zivVar != null) {
                c150VarF = pcn.n(zivVar);
            } else {
                c150VarF = ijv.f(aVar, z, false);
            }
        } else {
            c150VarF = ijv.f(aVar, z, false);
        }
        HashMap<ijv.a, List<ziv>> map = ijv.a;
        ArrayList arrayList = new ArrayList(c150VarF);
        Collections.sort(arrayList, new hjv(new gjv(aVar)));
        return arrayList;
    }

    @Override // defpackage.ejv
    public final long Z(long j, long j2) {
        long jV;
        boolean z = this.e1 != -9223372036854775807L;
        if (this.d1) {
            tad tadVar = this.S0;
            if (tadVar.o()) {
                AudioTrack audioTrack = tadVar.w;
                tad.e eVar = tadVar.u;
                if (eVar.c == 0) {
                    jV = jrh0.T(eVar.e, audioTrack.getBufferSizeInFrames());
                } else {
                    long bufferSizeInFrames = audioTrack.getBufferSizeInFrames();
                    int iB = n4h.b(eVar.g);
                    ly0.f(iB != -2147483647);
                    jV = jrh0.V(bufferSizeInFrames, 1000000L, iB, RoundingMode.DOWN);
                }
            } else {
                jV = -9223372036854775807L;
            }
            if (z && jV != -9223372036854775807L) {
                float fMin = Math.min(jV, this.e1 - j);
                eo10 eo10Var = tadVar.D;
                float f = eo10Var != null ? eo10Var.a : 1.0f;
                vs7 vs7Var = this.i;
                vs7Var.getClass();
                return Math.max(10000L, ((long) ((fMin / f) / 2.0f)) - (jrh0.O(vs7Var.d()) - j2));
            }
        } else if (z || this.E0) {
            return 1000000L;
        }
        return 10000L;
    }

    @Override // androidx.media3.exoplayer.b, androidx.media3.exoplayer.k
    public final boolean b() {
        if (!this.E0) {
            return false;
        }
        tad tadVar = this.S0;
        if (tadVar.o()) {
            return tadVar.T && !tadVar.m();
        }
        return true;
    }

    @Override // defpackage.ejv
    public final void b0(g5d g5dVar) {
        androidx.media3.common.a aVar;
        if (Build.VERSION.SDK_INT < 29 || (aVar = g5dVar.b) == null || !Objects.equals(aVar.n, "audio/opus") || !this.r0) {
            return;
        }
        ByteBuffer byteBuffer = g5dVar.i;
        byteBuffer.getClass();
        androidx.media3.common.a aVar2 = g5dVar.b;
        aVar2.getClass();
        int i = aVar2.I;
        if (byteBuffer.remaining() == 8) {
            this.S0.w(i, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
        }
    }

    @Override // defpackage.uiv
    public final eo10 c() {
        return this.S0.D;
    }

    @Override // defpackage.uiv
    public final void e(eo10 eo10Var) {
        tad tadVar = this.S0;
        tadVar.getClass();
        tadVar.D = new eo10(jrh0.h(eo10Var.a, 0.1f, 8.0f), jrh0.h(eo10Var.b, 0.1f, 8.0f));
        tad.e eVar = tadVar.u;
        if (eVar != null && eVar.j) {
            tadVar.v();
            return;
        }
        tad.g gVar = new tad.g(eo10Var, -9223372036854775807L, -9223372036854775807L);
        if (tadVar.o()) {
            tadVar.B = gVar;
        } else {
            tadVar.C = gVar;
        }
    }

    @Override // androidx.media3.exoplayer.k, androidx.media3.exoplayer.l
    public final String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // defpackage.ejv
    public final void h0(final Exception exc) {
        cft.d("MediaCodecAudioRenderer", "Audio codec error", exc);
        final x31 x31Var = this.R0;
        Handler handler = x31Var.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: k31
                @Override // java.lang.Runnable
                public final void run() {
                    d.a aVar = x31Var.b;
                    String str = jrh0.a;
                    d.this.s.e0(exc);
                }
            });
        }
    }

    @Override // defpackage.ejv
    public final void i0(final long j, final String str, final long j2) {
        final x31 x31Var = this.R0;
        Handler handler = x31Var.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: o31
                @Override // java.lang.Runnable
                public final void run() {
                    d.a aVar = x31Var.b;
                    String str2 = jrh0.a;
                    d.this.s.b0(j, str, j2);
                }
            });
        }
    }

    @Override // defpackage.ejv, androidx.media3.exoplayer.k
    public final boolean isReady() {
        return this.S0.m() || super.isReady();
    }

    @Override // defpackage.ejv
    public final void j0(final String str) {
        final x31 x31Var = this.R0;
        Handler handler = x31Var.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: p31
                @Override // java.lang.Runnable
                public final void run() {
                    d.a aVar = x31Var.b;
                    String str2 = jrh0.a;
                    d.this.s.t(str);
                }
            });
        }
    }

    @Override // defpackage.ejv
    public final i5d k0(yti ytiVar) {
        final androidx.media3.common.a aVar = ytiVar.b;
        aVar.getClass();
        this.W0 = aVar;
        final i5d i5dVarK0 = super.k0(ytiVar);
        final x31 x31Var = this.R0;
        Handler handler = x31Var.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: u31
                @Override // java.lang.Runnable
                public final void run() {
                    d.a aVar2 = x31Var.b;
                    String str = jrh0.a;
                    d.this.s.y(aVar, i5dVarK0);
                }
            });
        }
        return i5dVarK0;
    }

    @Override // defpackage.uiv
    public final boolean l() {
        boolean z = this.b1;
        this.b1 = false;
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00e1 A[Catch: z31 -> 0x00df, TryCatch #0 {z31 -> 0x00df, blocks: (B:36:0x00bf, B:39:0x00c7, B:41:0x00cb, B:43:0x00d4, B:46:0x00e1, B:47:0x00e4), top: B:51:0x00bf }] */
    @Override // defpackage.ejv
    public final void l0(androidx.media3.common.a aVar, MediaFormat mediaFormat) throws rwg {
        int iA;
        androidx.media3.common.a aVar2 = this.X0;
        int[] iArr = null;
        if (aVar2 != null) {
            aVar = aVar2;
        } else if (this.Y != null) {
            mediaFormat.getClass();
            if ("audio/raw".equals(aVar.n)) {
                iA = aVar.H;
            } else if (mediaFormat.containsKey("pcm-encoding")) {
                iA = mediaFormat.getInteger("pcm-encoding");
            } else {
                iA = mediaFormat.containsKey("v-bits-per-sample") ? jrh0.A(mediaFormat.getInteger("v-bits-per-sample"), ByteOrder.LITTLE_ENDIAN) : 2;
            }
            androidx.media3.common.a.C0062a c0062a = new androidx.media3.common.a.C0062a();
            c0062a.m = gqv.m("audio/raw");
            c0062a.G = iA;
            c0062a.H = aVar.I;
            c0062a.I = aVar.J;
            c0062a.k = aVar.l;
            c0062a.a = aVar.a;
            c0062a.b = aVar.b;
            c0062a.c = pcn.j(aVar.c);
            c0062a.d = aVar.d;
            c0062a.e = aVar.e;
            c0062a.f = aVar.f;
            c0062a.E = mediaFormat.getInteger("channel-count");
            c0062a.F = mediaFormat.getInteger("sample-rate");
            aVar = new androidx.media3.common.a(c0062a);
            if (this.V0) {
                int i = aVar.F;
                if (i == 3) {
                    iArr = new int[]{0, 2, 1};
                } else if (i == 5) {
                    iArr = new int[]{0, 2, 1, 3, 4};
                } else if (i == 6) {
                    iArr = new int[]{0, 2, 1, 5, 3, 4};
                } else if (i == 7) {
                    iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                } else if (i == 8) {
                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                }
            }
        }
        try {
            int i2 = Build.VERSION.SDK_INT;
            tad tadVar = this.S0;
            if (i2 >= 29) {
                if (this.r0) {
                    d850 d850Var = this.d;
                    d850Var.getClass();
                    if (d850Var.a != 0) {
                        d850 d850Var2 = this.d;
                        d850Var2.getClass();
                        tadVar.x(d850Var2.a);
                    } else {
                        tadVar.x(0);
                    }
                } else {
                    tadVar.x(0);
                }
            }
            tadVar.d(aVar, iArr);
        } catch (z31 e) {
            throw D(e, e.a, false, 5001);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0041  */
    /* JADX WARN: Code duplicated, block: B:29:0x0045  */
    @Override // androidx.media3.exoplayer.b, androidx.media3.exoplayer.j.b
    public final void m(int i, Object obj) {
        x21 x21Var;
        dpt dptVar;
        tad tadVar = this.S0;
        if (i == 2) {
            obj.getClass();
            float fFloatValue = ((Float) obj).floatValue();
            if (tadVar.P != fFloatValue) {
                tadVar.P = fFloatValue;
                if (tadVar.o()) {
                    tadVar.w.setVolume(tadVar.P);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 3) {
            r21 r21Var = (r21) obj;
            r21Var.getClass();
            if (tadVar.A.equals(r21Var)) {
                return;
            }
            tadVar.A = r21Var;
            if (tadVar.c0) {
                return;
            }
            w21 w21Var = tadVar.y;
            if (w21Var != null) {
                w21Var.i = r21Var;
                w21Var.a(u21.b(w21Var.a, r21Var, w21Var.h));
            }
            tadVar.g();
            return;
        }
        if (i == 6) {
            bm1 bm1Var = (bm1) obj;
            bm1Var.getClass();
            if (tadVar.a0.equals(bm1Var)) {
                return;
            }
            if (tadVar.w != null) {
                tadVar.a0.getClass();
            }
            tadVar.a0 = bm1Var;
            return;
        }
        if (i == 12) {
            AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
            if (audioDeviceInfo == null) {
                x21Var = null;
            } else {
                tadVar.getClass();
                x21Var = new x21(audioDeviceInfo);
            }
            tadVar.b0 = x21Var;
            w21 w21Var2 = tadVar.y;
            if (w21Var2 != null) {
                w21Var2.b(audioDeviceInfo);
            }
            AudioTrack audioTrack = tadVar.w;
            if (audioTrack != null) {
                x21 x21Var2 = tadVar.b0;
                audioTrack.setPreferredDevice(x21Var2 != null ? x21Var2.a : null);
                return;
            }
            return;
        }
        if (i == 16) {
            obj.getClass();
            this.c1 = ((Integer) obj).intValue();
            viv vivVar = this.Y;
            if (vivVar != null && Build.VERSION.SDK_INT >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt("importance", Math.max(0, -this.c1));
                vivVar.b(bundle);
                return;
            }
            return;
        }
        if (i == 9) {
            obj.getClass();
            tadVar.E = ((Boolean) obj).booleanValue();
            tad.e eVar = tadVar.u;
            tad.g gVar = new tad.g((eVar == null || !eVar.j) ? tadVar.D : eo10.d, -9223372036854775807L, -9223372036854775807L);
            if (tadVar.o()) {
                tadVar.B = gVar;
                return;
            } else {
                tadVar.C = gVar;
                return;
            }
        }
        if (i != 10) {
            if (i == 11) {
                k.a aVar = (k.a) obj;
                aVar.getClass();
                this.U = aVar;
                return;
            }
            return;
        }
        obj.getClass();
        int iIntValue = ((Integer) obj).intValue();
        if (tadVar.Z) {
            if (tadVar.Y == iIntValue) {
                tadVar.Z = false;
                if (tadVar.Y != iIntValue) {
                    tadVar.Y = iIntValue;
                    tadVar.X = iIntValue != 0;
                    tadVar.g();
                }
            }
        } else if (tadVar.Y != iIntValue) {
            tadVar.Y = iIntValue;
            tadVar.X = iIntValue != 0;
            tadVar.g();
        }
        if (Build.VERSION.SDK_INT < 35 || (dptVar = this.T0) == null) {
            return;
        }
        dptVar.d(iIntValue);
    }

    @Override // defpackage.ejv
    public final void m0(long j) {
        this.S0.getClass();
    }

    @Override // defpackage.ejv
    public final void o0() {
        this.S0.M = true;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    /* JADX WARN: Code duplicated, block: B:37:0x0071  */
    @Override // defpackage.ejv
    public final boolean r0(long j, long j2, viv vivVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, androidx.media3.common.a aVar) throws rwg {
        int i4;
        int i5;
        byteBuffer.getClass();
        this.e1 = -9223372036854775807L;
        if (this.X0 != null && (i2 & 2) != 0) {
            vivVar.getClass();
            vivVar.k(i);
            return true;
        }
        tad tadVar = this.S0;
        if (z) {
            if (vivVar != null) {
                vivVar.k(i);
            }
            this.I0.f += i3;
            tadVar.M = true;
            return true;
        }
        try {
            if (!tadVar.l(j3, byteBuffer, i3)) {
                this.e1 = j3;
                return false;
            }
            if (vivVar != null) {
                vivVar.k(i);
            }
            this.I0.e += i3;
            return true;
        } catch (a41 e) {
            androidx.media3.common.a aVar2 = this.W0;
            if (this.r0) {
                d850 d850Var = this.d;
                d850Var.getClass();
                if (d850Var.a != 0) {
                    i5 = 5004;
                } else {
                    i5 = 5001;
                }
            } else {
                i5 = 5001;
            }
            throw D(e, aVar2, e.b, i5);
        } catch (d41 e2) {
            if (this.r0) {
                d850 d850Var2 = this.d;
                d850Var2.getClass();
                if (d850Var2.a != 0) {
                    i4 = 5003;
                } else {
                    i4 = 5002;
                }
            } else {
                i4 = 5002;
            }
            throw D(e2, aVar, e2.b, i4);
        }
    }

    @Override // defpackage.ejv
    public final void u0() throws rwg {
        try {
            tad tadVar = this.S0;
            if (!tadVar.T && tadVar.o() && tadVar.f()) {
                tadVar.s();
                tadVar.T = true;
            }
            long j = this.C0;
            if (j != -9223372036854775807L) {
                this.e1 = j;
            }
        } catch (d41 e) {
            throw D(e, e.c, e.b, this.r0 ? 5003 : 5002);
        }
    }

    @Override // defpackage.uiv
    public final long v() {
        if (this.v == 2) {
            K0();
        }
        return this.Y0;
    }

    @Override // defpackage.ejv
    public final viv.a a0(ziv zivVar, androidx.media3.common.a aVar, MediaCrypto mediaCrypto, float f) {
        androidx.media3.common.a[] aVarArr = this.y;
        aVarArr.getClass();
        String str = zivVar.a;
        "OMX.google.raw.decoder".equals(str);
        int iMax = aVar.o;
        String str2 = aVar.n;
        int i = aVar.F;
        if (aVarArr.length != 1) {
            for (androidx.media3.common.a aVar2 : aVarArr) {
                if (zivVar.b(aVar, aVar2).d != 0) {
                    "OMX.google.raw.decoder".equals(str);
                    iMax = Math.max(iMax, aVar2.o);
                }
            }
        }
        this.U0 = iMax;
        this.V0 = str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
        String str3 = zivVar.c;
        int i2 = this.U0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str3);
        mediaFormat.setInteger("channel-count", i);
        int i3 = aVar.G;
        mediaFormat.setInteger("sample-rate", i3);
        mjv.b(mediaFormat, aVar.q);
        mjv.a(mediaFormat, "max-input-size", i2);
        mediaFormat.setInteger(dLRYz.NGjaBCJikNX, 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        if ("audio/ac4".equals(str2)) {
            Pair<Integer, Integer> pairB = j08.b(aVar);
            if (pairB != null) {
                mjv.a(mediaFormat, "profile", ((Integer) pairB.first).intValue());
                mjv.a(mediaFormat, "level", ((Integer) pairB.second).intValue());
            }
            if (Build.VERSION.SDK_INT <= 28) {
                mediaFormat.setInteger("ac4-is-sync", 1);
            }
        }
        androidx.media3.common.a.C0062a c0062a = new androidx.media3.common.a.C0062a();
        c0062a.m = gqv.m("audio/raw");
        c0062a.E = i;
        c0062a.F = i3;
        c0062a.G = 4;
        if (this.S0.i(new androidx.media3.common.a(c0062a)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i4 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.c1));
        }
        this.X0 = (!"audio/raw".equals(zivVar.b) || "audio/raw".equals(str2)) ? null : aVar;
        return new viv.a(zivVar, mediaFormat, aVar, null, mediaCrypto, this.T0);
    }
}
