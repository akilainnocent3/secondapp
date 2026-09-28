package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Display;
import android.view.Surface;
import androidx.media3.exoplayer.k;
import androidx.media3.exoplayer.l;
import androidx.media3.exoplayer.video.PlaceholderSurface;
import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.RuntimeVersion;
import com.sporty.android.core.model.crypto.IURC.iKBWavCysVP;
import com.sporty.android.core.model.patron.KYCBannerItem;
import com.sporty.android.core.model.pocket.withdraw.partner.RX.oAudzpbdOhCI;
import com.sporty.android.permission.location.KN.qUnCRF;
import com.sportybet.ntespm.socket.protobuf.NP.tYcQsJyaojE;
import com.sportybet.plugin.realsports.home.featuredsection.lAly.lTGEJfVytU;
import com.twilio.voice.EventKeys;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
import mo10.c;
import okhttp3.internal.http.HttpStatusCodesKt;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes.dex */
public final class ljv extends ejv {
    public static final int[] H1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean I1;
    public static boolean J1;
    public int A1;
    public e B1;
    public s4i0 C1;
    public long D1;
    public long E1;
    public boolean F1;
    public int G1;
    public final Context R0;
    public final boolean S0;
    public final t5i0.a T0;
    public final int U0;
    public final boolean V0;
    public final u4i0 W0;
    public final u4i0.a X0;
    public final long Y0;
    public final PriorityQueue<Long> Z0;
    public d a1;
    public boolean b1;
    public boolean c1;
    public u5i0 d1;
    public boolean e1;
    public int f1;
    public List<Object> g1;
    public Surface h1;
    public PlaceholderSurface i1;
    public vw90 j1;
    public boolean k1;
    public int l1;
    public int m1;
    public long n1;
    public int o1;
    public int p1;
    public int q1;
    public zr70 r1;
    public boolean s1;
    public long t1;
    public int u1;
    public long v1;
    public v5i0 w1;
    public v5i0 x1;
    public int y1;
    public boolean z1;

    public class a implements u5i0.b {
        public final /* synthetic */ viv a;
        public final /* synthetic */ int b;

        public a(viv vivVar, int i, long j) {
            this.a = vivVar;
            this.b = i;
        }

        @Override // u5i0.b
        public final void a(long j) {
            ljv.this.S0(this.a, this.b, j);
        }

        @Override // u5i0.b
        public final void b() {
            ljv.this.W0(this.a, this.b);
        }
    }

    public static final class b {
        public static boolean a(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            Display display = displayManager != null ? displayManager.getDisplay(0) : null;
            if (display != null && display.isHdr()) {
                for (int i : display.getHdrCapabilities().getSupportedHdrTypes()) {
                    if (i == 1) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public static final class c {
        public final Context a;
        public boolean b;
        public aed c;
        public long d;
        public Handler e;
        public androidx.media3.exoplayer.d.a f;
        public int g;

        public c(Context context) {
            this.a = context;
            this.c = new aed(context);
        }
    }

    public static final class d {
        public final int a;
        public final int b;
        public final int c;

        public d(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }
    }

    public final class e implements Handler.Callback {
        public final Handler a;

        public e(viv vivVar) {
            Handler handlerP = jrh0.p(this);
            this.a = handlerP;
            vivVar.g(this, handlerP);
        }

        public final void a(long j) {
            Surface surface;
            ljv ljvVar = ljv.this;
            t5i0.a aVar = ljvVar.T0;
            if (this != ljvVar.B1 || ljvVar.Y == null) {
                return;
            }
            if (j == Long.MAX_VALUE) {
                ljvVar.G0 = true;
                return;
            }
            try {
                ljvVar.I0(j);
                v5i0 v5i0Var = ljvVar.w1;
                if (!v5i0Var.equals(v5i0.d) && !v5i0Var.equals(ljvVar.x1)) {
                    ljvVar.x1 = v5i0Var;
                    aVar.a(v5i0Var);
                }
                ljvVar.I0.e++;
                u4i0 u4i0Var = ljvVar.W0;
                boolean z = u4i0Var.e != 3;
                u4i0Var.e = 3;
                u4i0Var.g = jrh0.O(u4i0Var.l.d());
                if (z && (surface = ljvVar.h1) != null) {
                    Handler handler = aVar.a;
                    if (handler != null) {
                        handler.post(new l5i0(aVar, surface, SystemClock.elapsedRealtime()));
                    }
                    ljvVar.k1 = true;
                }
                ljvVar.n0(j);
            } catch (rwg e) {
                ljvVar.H0 = e;
            }
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            int i = message.arg1;
            int i2 = message.arg2;
            String str = jrh0.a;
            a(((((long) i) & 4294967295L) << 32) | (4294967295L & ((long) i2)));
            return true;
        }
    }

    public ljv(c cVar) {
        super(2, cVar.c, 30.0f);
        Context applicationContext = cVar.a.getApplicationContext();
        this.R0 = applicationContext;
        this.U0 = cVar.g;
        this.d1 = null;
        this.T0 = new t5i0.a(cVar.e, cVar.f);
        this.S0 = this.d1 == null;
        this.W0 = new u4i0(applicationContext, this, cVar.d);
        this.X0 = new u4i0.a();
        this.V0 = "NVIDIA".equals(Build.MANUFACTURER);
        this.j1 = vw90.c;
        this.l1 = 1;
        this.m1 = 0;
        this.w1 = v5i0.d;
        this.A1 = 0;
        this.x1 = null;
        this.y1 = -1000;
        this.D1 = -9223372036854775807L;
        this.E1 = -9223372036854775807L;
        this.Z0 = new PriorityQueue<>();
        this.Y0 = -9223372036854775807L;
        this.r1 = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:19:0x0041  */
    public static int K0(ziv zivVar, androidx.media3.common.a aVar) {
        int i = aVar.u;
        int i2 = aVar.v;
        if (i != -1 && i2 != -1) {
            String str = aVar.n;
            str.getClass();
            if ("video/dolby-vision".equals(str)) {
                HashMap<ijv.a, List<ziv>> map = ijv.a;
                Pair<Integer, Integer> pairB = j08.b(aVar);
                if (pairB == null) {
                    str = "video/hevc";
                } else {
                    int iIntValue = ((Integer) pairB.first).intValue();
                    if (iIntValue == 512 || iIntValue == 1 || iIntValue == 2) {
                        str = "video/avc";
                    } else if (iIntValue == 1024) {
                        str = "video/av01";
                    } else {
                        str = "video/hevc";
                    }
                }
            }
            switch (str) {
                case "video/3gpp":
                case "video/av01":
                case "video/mp4v-es":
                case "video/x-vnd.on2.vp8":
                    return ((i * i2) * 3) / 4;
                case "video/hevc":
                    return Math.max(2097152, ((i * i2) * 3) / 4);
                case "video/avc":
                    String str2 = Build.MODEL;
                    if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(Build.MANUFACTURER) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !zivVar.f)))) {
                        return ((jrh0.f(i2, 16) * jrh0.f(i, 16)) * 768) / 4;
                    }
                    break;
                case "video/x-vnd.on2.vp9":
                    return ((i * i2) * 3) / 8;
            }
        }
        return -1;
    }

    public static List L0(Context context, androidx.media3.common.a aVar, boolean z, boolean z2) {
        List listD;
        String str = aVar.n;
        if (str == null) {
            pcn.b bVar = pcn.b;
            return c150.e;
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !b.a(context)) {
            String strB = ijv.b(aVar);
            if (strB == null) {
                pcn.b bVar2 = pcn.b;
                listD = c150.e;
            } else {
                listD = ijv.d(strB, z, z2);
            }
            if (!listD.isEmpty()) {
                return listD;
            }
        }
        return ijv.f(aVar, z, z2);
    }

    public static int M0(ziv zivVar, androidx.media3.common.a aVar) {
        int i = aVar.o;
        List<byte[]> list = aVar.q;
        if (i == -1) {
            return K0(zivVar, aVar);
        }
        int size = list.size();
        int length = 0;
        for (int i2 = 0; i2 < size; i2++) {
            length += list.get(i2).length;
        }
        return aVar.o + length;
    }

    @Override // defpackage.ejv
    public final boolean A0(g5d g5dVar) {
        boolean z = false;
        if (!P0(g5dVar)) {
            boolean z2 = g5dVar.f < this.A;
            if (z2 && !g5dVar.i(268435456)) {
                if (g5dVar.i(67108864)) {
                    g5dVar.j();
                    z = true;
                }
                if (z) {
                    if (z2) {
                        this.I0.d++;
                    } else {
                        this.Z0.add(Long.valueOf(g5dVar.f));
                        this.G1++;
                    }
                }
                return z;
            }
        }
        return false;
    }

    @Override // defpackage.ejv
    public final boolean B0() {
        androidx.media3.common.a aVar = this.Z;
        if (this.r1 == null || this.s1 || this.z1) {
            return true;
        }
        return (aVar != null && aVar.p > 0) || this.N0 || this.C0 != -9223372036854775807L;
    }

    @Override // defpackage.ejv
    public final boolean C0(ziv zivVar) {
        return O0(zivVar);
    }

    @Override // defpackage.ejv
    public final boolean D0() {
        ziv zivVar = this.f0;
        if (this.d1 != null && zivVar != null) {
            String str = zivVar.a;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                return true;
            }
        }
        return super.D0();
    }

    @Override // defpackage.ejv, androidx.media3.exoplayer.b
    public final void E() {
        final e5d e5dVar;
        final t5i0.a aVar = this.T0;
        this.x1 = null;
        this.E1 = -9223372036854775807L;
        R0();
        this.k1 = false;
        this.B1 = null;
        this.s1 = true;
        try {
            super.E();
            e5dVar = this.I0;
            aVar.getClass();
            synchronized (e5dVar) {
            }
        } finally {
            e5dVar = this.I0;
            aVar.getClass();
            synchronized (e5dVar) {
                Handler handler = aVar.a;
                if (handler != null) {
                    handler.post(new Runnable() { // from class: s5i0
                        @Override // java.lang.Runnable
                        public final void run() {
                            t5i0.a aVar2 = aVar;
                            e5d e5dVar2 = e5dVar;
                            synchronized (e5dVar2) {
                            }
                            t5i0 t5i0Var = aVar2.b;
                            String str = jrh0.a;
                            t5i0Var.b(e5dVar2);
                        }
                    });
                }
                aVar.a(v5i0.d);
            }
        }
    }

    @Override // androidx.media3.exoplayer.b
    public final void F(boolean z, boolean z2) {
        mo10.c cVar;
        this.I0 = new e5d();
        d850 d850Var = this.d;
        d850Var.getClass();
        boolean z3 = d850Var.b;
        ly0.f((z3 && this.A1 == 0) ? false : true);
        if (this.z1 != z3) {
            this.z1 = z3;
            t0();
        }
        final e5d e5dVar = this.I0;
        final t5i0.a aVar = this.T0;
        Handler handler = aVar.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: q5i0
                @Override // java.lang.Runnable
                public final void run() {
                    t5i0 t5i0Var = aVar.b;
                    String str = jrh0.a;
                    t5i0Var.h(e5dVar);
                }
            });
        }
        boolean z4 = this.e1;
        u4i0 u4i0Var = this.W0;
        if (!z4) {
            if (this.g1 != null && this.d1 == null) {
                mo10.a aVar2 = new mo10.a(this.R0, u4i0Var);
                aVar2.d = true;
                vs7 vs7Var = this.i;
                vs7Var.getClass();
                aVar2.e = vs7Var;
                ly0.f(!aVar2.f);
                if (aVar2.c == null) {
                    aVar2.c = new mo10.f();
                }
                mo10 mo10Var = new mo10(aVar2);
                aVar2.f = true;
                mo10Var.q = 1;
                SparseArray<mo10.c> sparseArray = mo10Var.c;
                if (sparseArray.indexOfKey(0) >= 0) {
                    cVar = sparseArray.get(0);
                } else {
                    mo10.c cVar2 = mo10Var.new c(mo10Var.a);
                    mo10Var.g.add(cVar2);
                    sparseArray.put(0, cVar2);
                    cVar = cVar2;
                }
                this.d1 = cVar;
            }
            this.e1 = true;
        }
        u5i0 u5i0Var = this.d1;
        if (u5i0Var == null) {
            vs7 vs7Var2 = this.i;
            vs7Var2.getClass();
            u4i0Var.l = vs7Var2;
            u4i0Var.f(!z2 ? 1 : 0);
            return;
        }
        u5i0Var.k(new kjv(this));
        s4i0 s4i0Var = this.C1;
        if (s4i0Var != null) {
            this.d1.y(s4i0Var);
        }
        if (this.h1 != null && !this.j1.equals(vw90.c)) {
            this.d1.o(this.h1, this.j1);
        }
        this.d1.t(this.m1);
        this.d1.f(this.W);
        List<Object> list = this.g1;
        if (list != null) {
            this.d1.m(list);
        }
        this.f1 = !z2 ? 1 : 0;
        this.M0 = true;
    }

    @Override // defpackage.ejv
    public final int F0(androidx.media3.common.a aVar) {
        boolean z;
        int i = 0;
        if (!gqv.l(aVar.n)) {
            return l.k(0, 0, 0, 0);
        }
        boolean z2 = aVar.r != null;
        Context context = this.R0;
        List listL0 = L0(context, aVar, z2, false);
        if (z2 && listL0.isEmpty()) {
            listL0 = L0(context, aVar, false, false);
        }
        if (listL0.isEmpty()) {
            return l.k(1, 0, 0, 0);
        }
        int i2 = aVar.O;
        if (i2 != 0 && i2 != 2) {
            return l.k(2, 0, 0, 0);
        }
        ziv zivVar = (ziv) listL0.get(0);
        boolean zE = zivVar.e(aVar);
        if (!zE) {
            int i3 = 1;
            while (true) {
                if (i3 >= listL0.size()) {
                    z = true;
                    break;
                }
                ziv zivVar2 = (ziv) listL0.get(i3);
                if (zivVar2.e(aVar)) {
                    z = false;
                    zE = true;
                    zivVar = zivVar2;
                    break;
                }
                i3++;
            }
        } else {
            z = true;
            break;
        }
        int i4 = zE ? 4 : 3;
        int i5 = zivVar.f(aVar) ? 16 : 8;
        int i6 = zivVar.g ? 64 : 0;
        int i7 = z ? 128 : 0;
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(aVar.n) && !b.a(context)) {
            i7 = 256;
        }
        if (zE) {
            List listL1 = L0(context, aVar, z2, true);
            if (!listL1.isEmpty()) {
                HashMap<ijv.a, List<ziv>> map = ijv.a;
                ArrayList arrayList = new ArrayList(listL1);
                Collections.sort(arrayList, new hjv(new gjv(aVar)));
                ziv zivVar3 = (ziv) arrayList.get(0);
                if (zivVar3.e(aVar) && zivVar3.f(aVar)) {
                    i = 32;
                }
            }
        }
        return i4 | i5 | i | i6 | i7;
    }

    @Override // defpackage.ejv, androidx.media3.exoplayer.b
    public final void G(long j, boolean z) {
        u5i0 u5i0Var = this.d1;
        if (u5i0Var != null && !z) {
            u5i0Var.w(true);
        }
        super.G(j, z);
        u5i0 u5i0Var2 = this.d1;
        u4i0 u4i0Var = this.W0;
        if (u5i0Var2 == null) {
            w4i0 w4i0Var = u4i0Var.b;
            w4i0Var.m = 0L;
            w4i0Var.p = -1L;
            w4i0Var.n = -1L;
            u4i0Var.h = -9223372036854775807L;
            u4i0Var.f = -9223372036854775807L;
            u4i0Var.e = Math.min(u4i0Var.e, 1);
            u4i0Var.i = -9223372036854775807L;
        }
        if (z) {
            u5i0 u5i0Var3 = this.d1;
            if (u5i0Var3 != null) {
                u5i0Var3.x(false);
            } else {
                u4i0Var.c(false);
            }
        }
        R0();
        this.p1 = 0;
    }

    @Override // androidx.media3.exoplayer.b
    public final void H() {
        u5i0 u5i0Var = this.d1;
        if (u5i0Var == null || !this.S0) {
            return;
        }
        u5i0Var.release();
    }

    @Override // androidx.media3.exoplayer.b
    public final void I() {
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
                this.e1 = false;
                this.D1 = -9223372036854775807L;
                PlaceholderSurface placeholderSurface = this.i1;
                if (placeholderSurface != null) {
                    placeholderSurface.release();
                    this.i1 = null;
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
            this.e1 = false;
            this.D1 = -9223372036854775807L;
            PlaceholderSurface placeholderSurface2 = this.i1;
            if (placeholderSurface2 != null) {
                placeholderSurface2.release();
                this.i1 = null;
            }
            throw th2;
        }
    }

    @Override // androidx.media3.exoplayer.b
    public final void J() {
        this.o1 = 0;
        vs7 vs7Var = this.i;
        vs7Var.getClass();
        this.n1 = vs7Var.d();
        this.t1 = 0L;
        this.u1 = 0;
        u5i0 u5i0Var = this.d1;
        if (u5i0Var != null) {
            u5i0Var.s();
        } else {
            this.W0.d();
        }
    }

    @Override // androidx.media3.exoplayer.b
    public final void K() {
        Q0();
        final int i = this.u1;
        if (i != 0) {
            final long j = this.t1;
            final t5i0.a aVar = this.T0;
            Handler handler = aVar.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: p5i0
                    @Override // java.lang.Runnable
                    public final void run() {
                        t5i0 t5i0Var = aVar.b;
                        String str = jrh0.a;
                        t5i0Var.g(i, j);
                    }
                });
            }
            this.t1 = 0L;
            this.u1 = 0;
        }
        u5i0 u5i0Var = this.d1;
        if (u5i0Var != null) {
            u5i0Var.r();
        } else {
            this.W0.e();
        }
    }

    @Override // defpackage.ejv, androidx.media3.exoplayer.b
    public final void L(androidx.media3.common.a[] aVarArr, long j, long j2, ekv.b bVar) {
        super.L(aVarArr, j, j2, bVar);
        qxf0 qxf0Var = this.E;
        if (qxf0Var.p()) {
            this.E1 = -9223372036854775807L;
        } else {
            this.E1 = qxf0Var.g(bVar.a, new qxf0.b()).d;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x005a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091  */
    /* JADX WARN: Code duplicated, block: B:54:0x009c  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:65:0x0071 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final Surface N0(ziv zivVar) {
        boolean z;
        PlaceholderSurface.a aVar;
        int i;
        RuntimeException runtimeException;
        Error error;
        u5i0 u5i0Var = this.d1;
        if (u5i0Var != null) {
            return u5i0Var.e();
        }
        Surface surface = this.h1;
        if (surface != null) {
            return surface;
        }
        PlaceholderSurface placeholderSurface = null;
        if (Build.VERSION.SDK_INT >= 35 && zivVar.h) {
            return null;
        }
        ly0.f(V0(zivVar));
        PlaceholderSurface placeholderSurface2 = this.i1;
        if (placeholderSurface2 != null && placeholderSurface2.a != zivVar.f) {
            if (placeholderSurface2 != null) {
                placeholderSurface2.release();
                this.i1 = null;
            } else {
                placeholderSurface = placeholderSurface2;
            }
            placeholderSurface2 = placeholderSurface;
        }
        if (placeholderSurface2 != null) {
            return placeholderSurface2;
        }
        Context context = this.R0;
        boolean z2 = zivVar.f;
        boolean z3 = false;
        if (z2) {
            if (!PlaceholderSurface.e(context)) {
                z = false;
            }
            ly0.f(z);
            aVar = new PlaceholderSurface.a("ExoPlayer:PlaceholderSurface");
            if (z2) {
                i = PlaceholderSurface.d;
            } else {
                i = 0;
            }
            aVar.start();
            Handler handler = new Handler(aVar.getLooper(), aVar);
            aVar.b = handler;
            aVar.a = new vif(handler);
            synchronized (aVar) {
                aVar.b.obtainMessage(1, i, 0).sendToTarget();
                while (aVar.e == null && aVar.d == null && aVar.c == null) {
                    try {
                        aVar.wait();
                    } catch (InterruptedException unused) {
                        z3 = true;
                    }
                }
            }
            if (z3) {
                Thread.currentThread().interrupt();
            }
            runtimeException = aVar.d;
            if (runtimeException == null) {
                throw runtimeException;
            }
            error = aVar.c;
            if (error == null) {
                throw error;
            }
            PlaceholderSurface placeholderSurface3 = aVar.e;
            placeholderSurface3.getClass();
            this.i1 = placeholderSurface3;
            return placeholderSurface3;
        }
        int i2 = PlaceholderSurface.d;
        z = true;
        ly0.f(z);
        aVar = new PlaceholderSurface.a("ExoPlayer:PlaceholderSurface");
        if (z2) {
            i = PlaceholderSurface.d;
        } else {
            i = 0;
        }
        aVar.start();
        Handler handler2 = new Handler(aVar.getLooper(), aVar);
        aVar.b = handler2;
        aVar.a = new vif(handler2);
        synchronized (aVar) {
            aVar.b.obtainMessage(1, i, 0).sendToTarget();
            while (aVar.e == null) {
                aVar.wait();
            }
            if (z3) {
                Thread.currentThread().interrupt();
            }
            runtimeException = aVar.d;
            if (runtimeException == null) {
                throw runtimeException;
            }
            error = aVar.c;
            if (error == null) {
                throw error;
            }
            PlaceholderSurface placeholderSurface4 = aVar.e;
            placeholderSurface4.getClass();
            this.i1 = placeholderSurface4;
            return placeholderSurface4;
        }
    }

    @Override // defpackage.ejv
    public final i5d O(ziv zivVar, androidx.media3.common.a aVar, androidx.media3.common.a aVar2) {
        i5d i5dVarB = zivVar.b(aVar, aVar2);
        int i = i5dVarB.e;
        d dVar = this.a1;
        dVar.getClass();
        if (aVar2.u > dVar.a || aVar2.v > dVar.b) {
            i |= 256;
        }
        if (M0(zivVar, aVar2) > dVar.c) {
            i |= 64;
        }
        int i2 = i;
        return new i5d(zivVar.a, aVar, aVar2, i2 != 0 ? 0 : i5dVarB.d, i2);
    }

    public final boolean O0(ziv zivVar) {
        if (this.d1 != null) {
            return true;
        }
        Surface surface = this.h1;
        if (surface == null || !surface.isValid()) {
            return (Build.VERSION.SDK_INT >= 35 && zivVar.h) || V0(zivVar);
        }
        return true;
    }

    @Override // defpackage.ejv
    public final yiv P(IllegalStateException illegalStateException, ziv zivVar) {
        Surface surface = this.h1;
        jjv jjvVar = new jjv(illegalStateException, zivVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return jjvVar;
    }

    public final boolean P0(g5d g5dVar) {
        if (f() || g5dVar.i(536870912)) {
            return true;
        }
        long j = this.E1;
        return j == -9223372036854775807L || j - (g5dVar.f - this.J0.c) <= 100000;
    }

    public final void Q0() {
        if (this.o1 > 0) {
            vs7 vs7Var = this.i;
            vs7Var.getClass();
            long jD = vs7Var.d();
            final long j = jD - this.n1;
            final int i = this.o1;
            final t5i0.a aVar = this.T0;
            Handler handler = aVar.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o5i0
                    @Override // java.lang.Runnable
                    public final void run() {
                        t5i0 t5i0Var = aVar.b;
                        String str = jrh0.a;
                        t5i0Var.j(i, j);
                    }
                });
            }
            this.o1 = 0;
            this.n1 = jD;
        }
    }

    public final void R0() {
        viv vivVar;
        if (!this.z1 || (vivVar = this.Y) == null) {
            return;
        }
        this.B1 = new e(vivVar);
        if (Build.VERSION.SDK_INT >= 33) {
            Bundle bundle = new Bundle();
            bundle.putInt("tunnel-peek", 1);
            vivVar.b(bundle);
        }
    }

    public final void S0(viv vivVar, int i, long j) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        vivVar.l(i, j);
        Trace.endSection();
        this.I0.e++;
        this.p1 = 0;
        if (this.d1 == null) {
            v5i0 v5i0Var = this.w1;
            boolean zEquals = v5i0Var.equals(v5i0.d);
            t5i0.a aVar = this.T0;
            if (!zEquals && !v5i0Var.equals(this.x1)) {
                this.x1 = v5i0Var;
                aVar.a(v5i0Var);
            }
            u4i0 u4i0Var = this.W0;
            boolean z = u4i0Var.e != 3;
            u4i0Var.e = 3;
            u4i0Var.g = jrh0.O(u4i0Var.l.d());
            if (!z || (surface = this.h1) == null) {
                return;
            }
            Handler handler = aVar.a;
            if (handler != null) {
                handler.post(new l5i0(aVar, surface, SystemClock.elapsedRealtime()));
            }
            this.k1 = true;
        }
    }

    public final void T0(Object obj) {
        Handler handler;
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        Surface surface2 = this.h1;
        t5i0.a aVar = this.T0;
        if (surface2 == surface) {
            if (surface != null) {
                v5i0 v5i0Var = this.x1;
                if (v5i0Var != null) {
                    aVar.a(v5i0Var);
                }
                Surface surface3 = this.h1;
                if (surface3 == null || !this.k1 || (handler = aVar.a) == null) {
                    return;
                }
                handler.post(new l5i0(aVar, surface3, SystemClock.elapsedRealtime()));
                return;
            }
            return;
        }
        this.h1 = surface;
        u5i0 u5i0Var = this.d1;
        u4i0 u4i0Var = this.W0;
        if (u5i0Var == null) {
            u4i0Var.h(surface);
        }
        this.k1 = false;
        int i = this.v;
        viv vivVar = this.Y;
        if (vivVar != null && this.d1 == null) {
            ziv zivVar = this.f0;
            zivVar.getClass();
            if (!O0(zivVar) || this.b1) {
                t0();
                e0();
            } else {
                Surface surfaceN0 = N0(zivVar);
                if (surfaceN0 != null) {
                    vivVar.j(surfaceN0);
                } else {
                    if (Build.VERSION.SDK_INT < 35) {
                        fm20.a();
                        return;
                    }
                    vivVar.f();
                }
            }
        }
        if (surface != null) {
            v5i0 v5i0Var2 = this.x1;
            if (v5i0Var2 != null) {
                aVar.a(v5i0Var2);
            }
        } else {
            this.x1 = null;
            u5i0 u5i0Var2 = this.d1;
            if (u5i0Var2 != null) {
                u5i0Var2.u();
            }
        }
        if (i == 2) {
            u5i0 u5i0Var3 = this.d1;
            if (u5i0Var3 != null) {
                u5i0Var3.x(true);
            } else {
                u4i0Var.c(true);
            }
        }
        R0();
    }

    public final boolean U0(boolean z, long j, long j2, boolean z2) {
        if (this.d1 != null && this.S0) {
            j2 -= -this.D1;
        }
        if (j < -500000 && !z) {
            rs60 rs60Var = this.w;
            rs60Var.getClass();
            int iC = rs60Var.c(j2 - this.z);
            if (iC != 0) {
                e5d e5dVar = this.I0;
                PriorityQueue<Long> priorityQueue = this.Z0;
                if (z2) {
                    int i = e5dVar.d + iC;
                    e5dVar.d = i;
                    e5dVar.f += this.q1;
                    e5dVar.d = priorityQueue.size() + i;
                } else {
                    e5dVar.j++;
                    X0(priorityQueue.size() + iC, this.q1);
                }
                if (U()) {
                    e0();
                }
                u5i0 u5i0Var = this.d1;
                if (u5i0Var != null) {
                    u5i0Var.w(false);
                }
                return true;
            }
        }
        return false;
    }

    public final boolean V0(ziv zivVar) {
        if (this.z1 || J0(zivVar.a)) {
            return false;
        }
        return !zivVar.f || PlaceholderSurface.e(this.R0);
    }

    @Override // defpackage.ejv
    public final int W(g5d g5dVar) {
        if (Build.VERSION.SDK_INT >= 34) {
            return ((this.r1 == null && !this.z1) || g5dVar.f >= this.A || P0(g5dVar)) ? 0 : 32;
        }
        return 0;
    }

    public final void W0(viv vivVar, int i) {
        Trace.beginSection("skipVideoBuffer");
        vivVar.k(i);
        Trace.endSection();
        this.I0.f++;
    }

    @Override // defpackage.ejv
    public final float X(float f, androidx.media3.common.a aVar, androidx.media3.common.a[] aVarArr) {
        ziv zivVar;
        float fMax = -1.0f;
        for (androidx.media3.common.a aVar2 : aVarArr) {
            float f2 = aVar2.y;
            if (f2 != -1.0f) {
                fMax = Math.max(fMax, f2);
            }
        }
        float f3 = fMax == -1.0f ? -1.0f : fMax * f;
        if (this.r1 == null || (zivVar = this.f0) == null) {
            return f3;
        }
        int i = aVar.u;
        int i2 = aVar.v;
        float f4 = -3.4028235E38f;
        if (zivVar.i) {
            float f5 = zivVar.l;
            if (f5 != -3.4028235E38f && zivVar.j == i && zivVar.k == i2) {
                f4 = f5;
            } else {
                f4 = 1024.0f;
                if (!zivVar.g(i, i2, 1024.0d)) {
                    float f6 = 0.0f;
                    while (true) {
                        float f7 = f4 - f6;
                        if (Math.abs(f7) <= 5.0f) {
                            break;
                        }
                        float f8 = (f7 / 2.0f) + f6;
                        if (zivVar.g(i, i2, f8)) {
                            f6 = f8;
                        } else {
                            f4 = f8;
                        }
                    }
                    f4 = f6;
                }
                zivVar.l = f4;
                zivVar.j = i;
                zivVar.k = i2;
            }
        }
        return f3 != -1.0f ? Math.max(f3, f4) : f4;
    }

    public final void X0(int i, int i2) {
        e5d e5dVar = this.I0;
        e5dVar.h += i;
        int i3 = i + i2;
        e5dVar.g += i3;
        this.o1 += i3;
        int i4 = this.p1 + i3;
        this.p1 = i4;
        e5dVar.i = Math.max(i4, e5dVar.i);
        int i5 = this.U0;
        if (i5 <= 0 || this.o1 < i5) {
            return;
        }
        Q0();
    }

    @Override // defpackage.ejv
    public final ArrayList Y(androidx.media3.common.a aVar, boolean z) {
        List listL0 = L0(this.R0, aVar, z, this.z1);
        HashMap<ijv.a, List<ziv>> map = ijv.a;
        ArrayList arrayList = new ArrayList(listL0);
        Collections.sort(arrayList, new hjv(new gjv(aVar)));
        return arrayList;
    }

    public final void Y0(long j) {
        e5d e5dVar = this.I0;
        e5dVar.k += j;
        e5dVar.l++;
        this.t1 += j;
        this.u1++;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x013c  */
    /* JADX WARN: Instruction removed from duplicated block: B:69:0x013c, please report this as an issue */
    @Override // defpackage.ejv
    public final viv.a a0(ziv zivVar, androidx.media3.common.a aVar, MediaCrypto mediaCrypto, float f) {
        n58 n58Var;
        int i;
        d dVar;
        Point point;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        byte b2;
        boolean z;
        int iK0;
        String str = zivVar.c;
        androidx.media3.common.a[] aVarArr = this.y;
        aVarArr.getClass();
        int i2 = aVar.u;
        float f2 = aVar.y;
        n58 n58Var2 = aVar.D;
        int i3 = aVar.v;
        int iM0 = M0(zivVar, aVar);
        if (aVarArr.length == 1) {
            if (iM0 != -1 && (iK0 = K0(zivVar, aVar)) != -1) {
                iM0 = Math.min((int) (iM0 * 1.5f), iK0);
            }
            dVar = new d(i2, i3, iM0);
            n58Var = n58Var2;
            i = i3;
        } else {
            int length = aVarArr.length;
            int iMax = i2;
            int iMax2 = i3;
            int i4 = 0;
            boolean z2 = false;
            while (i4 < length) {
                androidx.media3.common.a aVar2 = aVarArr[i4];
                androidx.media3.common.a[] aVarArr2 = aVarArr;
                if (n58Var2 != null && aVar2.D == null) {
                    androidx.media3.common.a.C0062a c0062aA = aVar2.a();
                    c0062aA.C = n58Var2;
                    aVar2 = new androidx.media3.common.a(c0062aA);
                }
                i5d i5dVarB = zivVar.b(aVar, aVar2);
                int i5 = length;
                int i6 = aVar2.v;
                if (i5dVarB.d != 0) {
                    int i7 = aVar2.u;
                    b2 = -1;
                    z2 |= i7 == -1 || i6 == -1;
                    iMax = Math.max(iMax, i7);
                    iMax2 = Math.max(iMax2, i6);
                    iM0 = Math.max(iM0, M0(zivVar, aVar2));
                } else {
                    b2 = -1;
                }
                length = i5;
                i4++;
                aVarArr = aVarArr2;
            }
            if (z2) {
                cft.g("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
                boolean z3 = i3 > i2;
                int i8 = z3 ? i3 : i2;
                boolean z4 = z3;
                int i9 = z3 ? i2 : i3;
                float f3 = i9 / i8;
                int i10 = 0;
                while (true) {
                    n58Var = n58Var2;
                    if (i10 < 9) {
                        int i11 = H1[i10];
                        int i12 = i10;
                        int i13 = (int) (i11 * f3);
                        if (i11 > i8 && i13 > i9) {
                            if (!z4) {
                                i13 = i11;
                            }
                            if (!z4) {
                                i11 = i13;
                            }
                            int i14 = i9;
                            MediaCodecInfo.CodecCapabilities codecCapabilities = zivVar.d;
                            if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                                point = null;
                            } else {
                                int widthAlignment = videoCapabilities.getWidthAlignment();
                                int heightAlignment = videoCapabilities.getHeightAlignment();
                                point = new Point(jrh0.f(i13, widthAlignment) * widthAlignment, jrh0.f(i11, heightAlignment) * heightAlignment);
                            }
                            if (point != null) {
                                i = i3;
                                if (zivVar.g(point.x, point.y, f2)) {
                                }
                            } else {
                                i = i3;
                            }
                            i10 = i12 + 1;
                            i3 = i;
                            n58Var2 = n58Var;
                            i9 = i14;
                            i8 = i8;
                        }
                        if (point != null) {
                            iMax = Math.max(iMax, point.x);
                            iMax2 = Math.max(iMax2, point.y);
                            androidx.media3.common.a.C0062a c0062aA2 = aVar.a();
                            c0062aA2.t = iMax;
                            c0062aA2.u = iMax2;
                            iM0 = Math.max(iM0, K0(zivVar, new androidx.media3.common.a(c0062aA2)));
                            cft.g("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                        }
                    }
                    i = i3;
                    point = null;
                    if (point != null) {
                        iMax = Math.max(iMax, point.x);
                        iMax2 = Math.max(iMax2, point.y);
                        androidx.media3.common.a.C0062a c0062aA3 = aVar.a();
                        c0062aA3.t = iMax;
                        c0062aA3.u = iMax2;
                        iM0 = Math.max(iM0, K0(zivVar, new androidx.media3.common.a(c0062aA3)));
                        cft.g("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                    }
                }
            } else {
                n58Var = n58Var2;
                i = i3;
            }
            dVar = new d(iMax, iMax2, iM0);
        }
        this.a1 = dVar;
        int i15 = this.z1 ? this.A1 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i2);
        mediaFormat.setInteger("height", i);
        mjv.b(mediaFormat, aVar.q);
        if (f2 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f2);
        }
        mjv.a(mediaFormat, "rotation-degrees", aVar.z);
        if (n58Var != null) {
            n58 n58Var3 = n58Var;
            mjv.a(mediaFormat, "color-transfer", n58Var3.c);
            mjv.a(mediaFormat, "color-standard", n58Var3.a);
            mjv.a(mediaFormat, "color-range", n58Var3.b);
            byte[] bArr = n58Var3.d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(aVar.n)) {
            HashMap<ijv.a, List<ziv>> map = ijv.a;
            Pair<Integer, Integer> pairB = j08.b(aVar);
            if (pairB != null) {
                mjv.a(mediaFormat, "profile", ((Integer) pairB.first).intValue());
            }
        }
        mediaFormat.setInteger("max-width", dVar.a);
        mediaFormat.setInteger("max-height", dVar.b);
        mjv.a(mediaFormat, "max-input-size", dVar.c);
        mediaFormat.setInteger(EventKeys.PRIORITY, 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        if (this.V0) {
            z = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z = true;
        }
        if (i15 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z);
            mediaFormat.setInteger("audio-session-id", i15);
        }
        if (Build.VERSION.SDK_INT >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.y1));
        }
        Surface surfaceN0 = N0(zivVar);
        if (this.d1 != null && !jrh0.L(this.R0)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return new viv.a(zivVar, mediaFormat, aVar, surfaceN0, mediaCrypto, null);
    }

    @Override // androidx.media3.exoplayer.b, androidx.media3.exoplayer.k
    public final boolean b() {
        if (!this.E0) {
            return false;
        }
        u5i0 u5i0Var = this.d1;
        return u5i0Var == null || u5i0Var.b();
    }

    @Override // defpackage.ejv
    public final void b0(g5d g5dVar) {
        if (this.c1) {
            ByteBuffer byteBuffer = g5dVar.i;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b2 = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b3 = byteBuffer.get();
                byte b4 = byteBuffer.get();
                byteBuffer.position(0);
                if (b2 == -75 && s == 60 && s2 == 1 && b3 == 4) {
                    if (b4 == 0 || b4 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        viv vivVar = this.Y;
                        vivVar.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        vivVar.b(bundle);
                    }
                }
            }
        }
    }

    @Override // defpackage.ejv
    public final boolean g0(androidx.media3.common.a aVar) throws rwg {
        u5i0 u5i0Var = this.d1;
        if (u5i0Var == null || u5i0Var.isInitialized()) {
            return true;
        }
        try {
            return this.d1.p(aVar);
        } catch (u5i0.c e2) {
            throw D(e2, aVar, false, 7000);
        }
    }

    @Override // androidx.media3.exoplayer.k, androidx.media3.exoplayer.l
    public final String getName() {
        return "MediaCodecVideoRenderer";
    }

    @Override // defpackage.ejv, androidx.media3.exoplayer.k
    public final void h(long j, long j2) throws rwg {
        u5i0 u5i0Var = this.d1;
        if (u5i0Var != null) {
            try {
                u5i0Var.h(j, j2);
            } catch (u5i0.c e2) {
                throw D(e2, e2.a, false, 7001);
            }
        }
        super.h(j, j2);
    }

    @Override // defpackage.ejv
    public final void h0(final Exception exc) {
        cft.d("MediaCodecVideoRenderer", "Video codec error", exc);
        final t5i0.a aVar = this.T0;
        Handler handler = aVar.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: m5i0
                @Override // java.lang.Runnable
                public final void run() {
                    t5i0 t5i0Var = aVar.b;
                    String str = jrh0.a;
                    t5i0Var.f(exc);
                }
            });
        }
    }

    @Override // androidx.media3.exoplayer.k
    public final void i() {
        u5i0 u5i0Var = this.d1;
        if (u5i0Var == null) {
            u4i0 u4i0Var = this.W0;
            if (u4i0Var.e == 0) {
                u4i0Var.e = 1;
                return;
            }
            return;
        }
        int i = this.f1;
        if (i == 0 || i == 1) {
            this.f1 = 0;
        } else {
            u5i0Var.q();
        }
    }

    @Override // defpackage.ejv
    public final void i0(final long j, String str, final long j2) {
        final String str2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        final t5i0.a aVar = this.T0;
        Handler handler = aVar.a;
        if (handler != null) {
            str2 = str;
            handler.post(new Runnable() { // from class: j5i0
                @Override // java.lang.Runnable
                public final void run() {
                    t5i0 t5i0Var = aVar.b;
                    String str3 = jrh0.a;
                    t5i0Var.e(j, str2, j2);
                }
            });
        } else {
            str2 = str;
        }
        this.b1 = J0(str2);
        ziv zivVar = this.f0;
        zivVar.getClass();
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(zivVar.b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = zivVar.d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                if (codecProfileLevel.profile == 16384) {
                    z = true;
                    break;
                }
            }
        }
        this.c1 = z;
        R0();
    }

    @Override // defpackage.ejv, androidx.media3.exoplayer.k
    public final boolean isReady() {
        boolean zIsReady = super.isReady();
        u5i0 u5i0Var = this.d1;
        if (u5i0Var != null) {
            return u5i0Var.n(zIsReady);
        }
        if (zIsReady && (this.Y == null || this.z1)) {
            return true;
        }
        return this.W0.b(zIsReady);
    }

    @Override // defpackage.ejv
    public final void j0(final String str) {
        final t5i0.a aVar = this.T0;
        Handler handler = aVar.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: n5i0
                @Override // java.lang.Runnable
                public final void run() {
                    t5i0 t5i0Var = aVar.b;
                    String str2 = jrh0.a;
                    t5i0Var.d(str);
                }
            });
        }
    }

    @Override // defpackage.ejv
    public final i5d k0(yti ytiVar) {
        final i5d i5dVarK0 = super.k0(ytiVar);
        final androidx.media3.common.a aVar = ytiVar.b;
        aVar.getClass();
        final t5i0.a aVar2 = this.T0;
        Handler handler = aVar2.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: r5i0
                @Override // java.lang.Runnable
                public final void run() {
                    t5i0 t5i0Var = aVar2.b;
                    String str = jrh0.a;
                    t5i0Var.c(aVar, i5dVarK0);
                }
            });
        }
        return i5dVarK0;
    }

    @Override // defpackage.ejv
    public final void l0(androidx.media3.common.a aVar, MediaFormat mediaFormat) {
        int integer;
        int i;
        viv vivVar = this.Y;
        if (vivVar != null) {
            vivVar.h(this.l1);
        }
        if (this.z1) {
            i = aVar.u;
            integer = aVar.v;
        } else {
            mediaFormat.getClass();
            boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            integer = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
            i = integer2;
        }
        float f = aVar.A;
        int i2 = aVar.z;
        if (i2 == 90 || i2 == 270) {
            f = 1.0f / f;
            int i3 = integer;
            integer = i;
            i = i3;
        }
        this.w1 = new v5i0(f, i, integer);
        u5i0 u5i0Var = this.d1;
        if (u5i0Var == null || !this.F1) {
            this.W0.g(aVar.y);
        } else {
            androidx.media3.common.a.C0062a c0062aA = aVar.a();
            c0062aA.t = i;
            c0062aA.u = integer;
            c0062aA.z = f;
            androidx.media3.common.a aVar2 = new androidx.media3.common.a(c0062aA);
            int i4 = this.f1;
            List list = this.g1;
            if (list == null) {
                pcn.b bVar = pcn.b;
                list = c150.e;
            }
            u5i0Var.l(aVar2, this.J0.b, i4, list);
            this.f1 = 2;
        }
        this.F1 = false;
    }

    @Override // androidx.media3.exoplayer.b, androidx.media3.exoplayer.j.b
    public final void m(int i, Object obj) {
        if (i == 1) {
            T0(obj);
            return;
        }
        if (i == 7) {
            obj.getClass();
            s4i0 s4i0Var = (s4i0) obj;
            this.C1 = s4i0Var;
            u5i0 u5i0Var = this.d1;
            if (u5i0Var != null) {
                u5i0Var.y(s4i0Var);
                return;
            }
            return;
        }
        if (i == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (this.A1 != iIntValue) {
                this.A1 = iIntValue;
                if (this.z1) {
                    t0();
                    return;
                }
                return;
            }
            return;
        }
        if (i == 4) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            this.l1 = iIntValue2;
            viv vivVar = this.Y;
            if (vivVar != null) {
                vivVar.h(iIntValue2);
                return;
            }
            return;
        }
        if (i == 5) {
            obj.getClass();
            int iIntValue3 = ((Integer) obj).intValue();
            this.m1 = iIntValue3;
            u5i0 u5i0Var2 = this.d1;
            if (u5i0Var2 != null) {
                u5i0Var2.t(iIntValue3);
                return;
            }
            w4i0 w4i0Var = this.W0.b;
            if (w4i0Var.j == iIntValue3) {
                return;
            }
            w4i0Var.j = iIntValue3;
            w4i0Var.d(true);
            return;
        }
        if (i == 13) {
            obj.getClass();
            List<Object> list = (List) obj;
            if (list.equals(t4i0.a)) {
                u5i0 u5i0Var3 = this.d1;
                if (u5i0Var3 == null || !u5i0Var3.isInitialized()) {
                    return;
                }
                this.d1.d();
                return;
            }
            this.g1 = list;
            u5i0 u5i0Var4 = this.d1;
            if (u5i0Var4 != null) {
                u5i0Var4.m(list);
                return;
            }
            return;
        }
        if (i == 14) {
            obj.getClass();
            vw90 vw90Var = (vw90) obj;
            if (vw90Var.a == 0 || vw90Var.b == 0) {
                return;
            }
            this.j1 = vw90Var;
            u5i0 u5i0Var5 = this.d1;
            if (u5i0Var5 != null) {
                Surface surface = this.h1;
                ly0.g(surface);
                u5i0Var5.o(surface, vw90Var);
                return;
            }
            return;
        }
        switch (i) {
            case 16:
                obj.getClass();
                this.y1 = ((Integer) obj).intValue();
                viv vivVar2 = this.Y;
                if (vivVar2 != null && Build.VERSION.SDK_INT >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.y1));
                    vivVar2.b(bundle);
                }
                break;
            case 17:
                Surface surface2 = this.h1;
                T0(null);
                obj.getClass();
                ((ljv) obj).m(1, surface2);
                break;
            case 18:
                boolean z = this.r1 != null;
                zr70 zr70Var = (zr70) obj;
                this.r1 = zr70Var;
                if (z != (zr70Var != null)) {
                    G0(this.Z);
                }
                break;
            default:
                if (i == 11) {
                    k.a aVar = (k.a) obj;
                    aVar.getClass();
                    this.U = aVar;
                }
                break;
        }
    }

    @Override // defpackage.ejv
    public final void n0(long j) {
        super.n0(j);
        if (this.z1) {
            return;
        }
        this.q1--;
    }

    @Override // defpackage.ejv
    public final void o0() {
        u5i0 u5i0Var = this.d1;
        if (u5i0Var != null) {
            u5i0Var.j();
            long j = this.D1;
            if (j == -9223372036854775807L) {
                j = this.J0.b;
                this.D1 = j;
            }
            this.d1.i(-j);
        } else {
            this.W0.f(2);
        }
        this.F1 = true;
        R0();
    }

    @Override // defpackage.ejv
    public final void p0(g5d g5dVar) {
        this.G1 = 0;
        int iW = W(g5dVar);
        if ((Build.VERSION.SDK_INT < 34 || (iW & 32) == 0) && !this.z1) {
            this.q1++;
        }
    }

    @Override // defpackage.ejv
    public final boolean r0(long j, long j2, viv vivVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, androidx.media3.common.a aVar) {
        int i4;
        vivVar.getClass();
        long j4 = j3 - this.J0.c;
        int i5 = 0;
        while (true) {
            PriorityQueue<Long> priorityQueue = this.Z0;
            Long lPeek = priorityQueue.peek();
            if (lPeek == null || lPeek.longValue() >= j3) {
                break;
            }
            i5++;
            priorityQueue.poll();
        }
        X0(i5, 0);
        u5i0 u5i0Var = this.d1;
        if (u5i0Var != null) {
            if (!z || z2) {
                return u5i0Var.v(j3, new a(vivVar, i, j4));
            }
            W0(vivVar, i);
            return true;
        }
        int iA = this.W0.a(j3, j, j2, this.J0.b, z, z2, this.X0);
        u4i0.a aVar2 = this.X0;
        if (iA == 0) {
            vs7 vs7Var = this.i;
            vs7Var.getClass();
            long jNanoTime = vs7Var.nanoTime();
            s4i0 s4i0Var = this.C1;
            if (s4i0Var != null) {
                s4i0Var.k(j4, jNanoTime, aVar, this.a0);
            }
            S0(vivVar, i, jNanoTime);
            Y0(aVar2.a);
            return true;
        }
        if (iA == 1) {
            long j5 = aVar2.b;
            long j6 = aVar2.a;
            if (j5 == this.v1) {
                W0(vivVar, i);
            } else {
                s4i0 s4i0Var2 = this.C1;
                if (s4i0Var2 != null) {
                    i4 = i;
                    s4i0Var2.k(j4, j5, aVar, this.a0);
                } else {
                    i4 = i;
                }
                S0(vivVar, i4, j5);
            }
            Y0(j6);
            this.v1 = j5;
            return true;
        }
        if (iA == 2) {
            Trace.beginSection("dropVideoBuffer");
            vivVar.k(i);
            Trace.endSection();
            X0(0, 1);
            Y0(aVar2.a);
            return true;
        }
        if (iA == 3) {
            W0(vivVar, i);
            Y0(aVar2.a);
            return true;
        }
        if (iA != 4 && iA != 5) {
            ib5.a(String.valueOf(iA));
        }
        return false;
    }

    @Override // defpackage.ejv
    public final void u0() {
        u5i0 u5i0Var = this.d1;
        if (u5i0Var != null) {
            u5i0Var.j();
        }
    }

    @Override // defpackage.ejv, androidx.media3.exoplayer.k
    public final void w(float f, float f2) {
        super.w(f, f2);
        u5i0 u5i0Var = this.d1;
        if (u5i0Var != null) {
            u5i0Var.f(f);
        } else {
            this.W0.i(f);
        }
    }

    @Override // defpackage.ejv
    public final void w0() {
        super.w0();
        this.Z0.clear();
        this.q1 = 0;
        this.G1 = 0;
        this.s1 = false;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0124  */
    /* JADX WARN: Code duplicated, block: B:102:0x0127  */
    /* JADX WARN: Code duplicated, block: B:105:0x0130  */
    /* JADX WARN: Code duplicated, block: B:106:0x0134  */
    /* JADX WARN: Code duplicated, block: B:109:0x013d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0141  */
    /* JADX WARN: Code duplicated, block: B:113:0x014a  */
    /* JADX WARN: Code duplicated, block: B:114:0x014e  */
    /* JADX WARN: Code duplicated, block: B:117:0x0157  */
    /* JADX WARN: Code duplicated, block: B:118:0x015b  */
    /* JADX WARN: Code duplicated, block: B:121:0x0164  */
    /* JADX WARN: Code duplicated, block: B:122:0x0168  */
    /* JADX WARN: Code duplicated, block: B:125:0x0171  */
    /* JADX WARN: Code duplicated, block: B:126:0x0175  */
    /* JADX WARN: Code duplicated, block: B:129:0x017e  */
    /* JADX WARN: Code duplicated, block: B:130:0x0182  */
    /* JADX WARN: Code duplicated, block: B:133:0x018b  */
    /* JADX WARN: Code duplicated, block: B:134:0x018f  */
    /* JADX WARN: Code duplicated, block: B:137:0x0199  */
    /* JADX WARN: Code duplicated, block: B:138:0x019d  */
    /* JADX WARN: Code duplicated, block: B:141:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:142:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:145:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:146:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:149:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:150:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:153:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:154:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:157:0x01df  */
    /* JADX WARN: Code duplicated, block: B:158:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:161:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:162:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:165:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:166:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:169:0x0209  */
    /* JADX WARN: Code duplicated, block: B:170:0x020d  */
    /* JADX WARN: Code duplicated, block: B:173:0x0217  */
    /* JADX WARN: Code duplicated, block: B:174:0x021b  */
    /* JADX WARN: Code duplicated, block: B:177:0x0225  */
    /* JADX WARN: Code duplicated, block: B:178:0x0229  */
    /* JADX WARN: Code duplicated, block: B:181:0x0233  */
    /* JADX WARN: Code duplicated, block: B:182:0x0237  */
    /* JADX WARN: Code duplicated, block: B:185:0x0241  */
    /* JADX WARN: Code duplicated, block: B:186:0x0245  */
    /* JADX WARN: Code duplicated, block: B:189:0x024f  */
    /* JADX WARN: Code duplicated, block: B:190:0x0253  */
    /* JADX WARN: Code duplicated, block: B:193:0x025d  */
    /* JADX WARN: Code duplicated, block: B:194:0x0261  */
    /* JADX WARN: Code duplicated, block: B:197:0x026b  */
    /* JADX WARN: Code duplicated, block: B:198:0x026f  */
    /* JADX WARN: Code duplicated, block: B:201:0x0279  */
    /* JADX WARN: Code duplicated, block: B:202:0x027d  */
    /* JADX WARN: Code duplicated, block: B:205:0x0287  */
    /* JADX WARN: Code duplicated, block: B:206:0x028b  */
    /* JADX WARN: Code duplicated, block: B:209:0x0295  */
    /* JADX WARN: Code duplicated, block: B:210:0x0299  */
    /* JADX WARN: Code duplicated, block: B:213:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:214:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:217:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:218:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:221:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:222:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:225:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:226:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:229:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:230:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:233:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:234:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:237:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:238:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:241:0x0306  */
    /* JADX WARN: Code duplicated, block: B:242:0x030a  */
    /* JADX WARN: Code duplicated, block: B:245:0x0314  */
    /* JADX WARN: Code duplicated, block: B:246:0x0318  */
    /* JADX WARN: Code duplicated, block: B:249:0x0322  */
    /* JADX WARN: Code duplicated, block: B:250:0x0326  */
    /* JADX WARN: Code duplicated, block: B:253:0x0330  */
    /* JADX WARN: Code duplicated, block: B:254:0x0334  */
    /* JADX WARN: Code duplicated, block: B:257:0x033e  */
    /* JADX WARN: Code duplicated, block: B:258:0x0342  */
    /* JADX WARN: Code duplicated, block: B:261:0x034c  */
    /* JADX WARN: Code duplicated, block: B:262:0x0350  */
    /* JADX WARN: Code duplicated, block: B:265:0x035a  */
    /* JADX WARN: Code duplicated, block: B:266:0x035e  */
    /* JADX WARN: Code duplicated, block: B:269:0x0368  */
    /* JADX WARN: Code duplicated, block: B:270:0x036c  */
    /* JADX WARN: Code duplicated, block: B:273:0x0376  */
    /* JADX WARN: Code duplicated, block: B:274:0x037a  */
    /* JADX WARN: Code duplicated, block: B:277:0x0384  */
    /* JADX WARN: Code duplicated, block: B:278:0x0388  */
    /* JADX WARN: Code duplicated, block: B:281:0x0392  */
    /* JADX WARN: Code duplicated, block: B:282:0x0396  */
    /* JADX WARN: Code duplicated, block: B:285:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:286:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:289:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:290:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:293:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:294:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:297:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:298:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:301:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:302:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:305:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:306:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:309:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:310:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:313:0x0403  */
    /* JADX WARN: Code duplicated, block: B:314:0x0407  */
    /* JADX WARN: Code duplicated, block: B:317:0x0411  */
    /* JADX WARN: Code duplicated, block: B:318:0x0415  */
    /* JADX WARN: Code duplicated, block: B:321:0x041f  */
    /* JADX WARN: Code duplicated, block: B:322:0x0423  */
    /* JADX WARN: Code duplicated, block: B:325:0x042d  */
    /* JADX WARN: Code duplicated, block: B:326:0x0431  */
    /* JADX WARN: Code duplicated, block: B:329:0x043b  */
    /* JADX WARN: Code duplicated, block: B:330:0x043f  */
    /* JADX WARN: Code duplicated, block: B:333:0x0449  */
    /* JADX WARN: Code duplicated, block: B:334:0x044d  */
    /* JADX WARN: Code duplicated, block: B:337:0x0457  */
    /* JADX WARN: Code duplicated, block: B:338:0x045b  */
    /* JADX WARN: Code duplicated, block: B:341:0x0465  */
    /* JADX WARN: Code duplicated, block: B:342:0x0469  */
    /* JADX WARN: Code duplicated, block: B:345:0x0473  */
    /* JADX WARN: Code duplicated, block: B:346:0x0477  */
    /* JADX WARN: Code duplicated, block: B:349:0x0481  */
    /* JADX WARN: Code duplicated, block: B:350:0x0485  */
    /* JADX WARN: Code duplicated, block: B:353:0x048f  */
    /* JADX WARN: Code duplicated, block: B:354:0x0493  */
    /* JADX WARN: Code duplicated, block: B:357:0x049d  */
    /* JADX WARN: Code duplicated, block: B:358:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:361:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:362:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:365:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:366:0x04be  */
    /* JADX WARN: Code duplicated, block: B:369:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:370:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:373:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:374:0x04da  */
    /* JADX WARN: Code duplicated, block: B:377:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:378:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:381:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:382:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:385:0x0500  */
    /* JADX WARN: Code duplicated, block: B:386:0x0504  */
    /* JADX WARN: Code duplicated, block: B:389:0x050e  */
    /* JADX WARN: Code duplicated, block: B:390:0x0512  */
    /* JADX WARN: Code duplicated, block: B:393:0x051c  */
    /* JADX WARN: Code duplicated, block: B:394:0x0520  */
    /* JADX WARN: Code duplicated, block: B:397:0x052a  */
    /* JADX WARN: Code duplicated, block: B:398:0x052e  */
    /* JADX WARN: Code duplicated, block: B:401:0x0538  */
    /* JADX WARN: Code duplicated, block: B:402:0x053c  */
    /* JADX WARN: Code duplicated, block: B:405:0x0546  */
    /* JADX WARN: Code duplicated, block: B:406:0x054a  */
    /* JADX WARN: Code duplicated, block: B:409:0x0554  */
    /* JADX WARN: Code duplicated, block: B:410:0x0558  */
    /* JADX WARN: Code duplicated, block: B:413:0x0562  */
    /* JADX WARN: Code duplicated, block: B:414:0x0566  */
    /* JADX WARN: Code duplicated, block: B:417:0x0570  */
    /* JADX WARN: Code duplicated, block: B:418:0x0574  */
    /* JADX WARN: Code duplicated, block: B:421:0x057e  */
    /* JADX WARN: Code duplicated, block: B:422:0x0582  */
    /* JADX WARN: Code duplicated, block: B:425:0x058c  */
    /* JADX WARN: Code duplicated, block: B:426:0x0590  */
    /* JADX WARN: Code duplicated, block: B:429:0x059a  */
    /* JADX WARN: Code duplicated, block: B:430:0x059e  */
    /* JADX WARN: Code duplicated, block: B:433:0x05a8  */
    /* JADX WARN: Code duplicated, block: B:434:0x05ac  */
    /* JADX WARN: Code duplicated, block: B:437:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:438:0x05ba  */
    /* JADX WARN: Code duplicated, block: B:441:0x05c4  */
    /* JADX WARN: Code duplicated, block: B:442:0x05c8  */
    /* JADX WARN: Code duplicated, block: B:445:0x05d2  */
    /* JADX WARN: Code duplicated, block: B:446:0x05d6  */
    /* JADX WARN: Code duplicated, block: B:449:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:450:0x05e4  */
    /* JADX WARN: Code duplicated, block: B:453:0x05ee  */
    /* JADX WARN: Code duplicated, block: B:454:0x05f2  */
    /* JADX WARN: Code duplicated, block: B:457:0x05fc  */
    /* JADX WARN: Code duplicated, block: B:458:0x0600  */
    /* JADX WARN: Code duplicated, block: B:461:0x060a  */
    /* JADX WARN: Code duplicated, block: B:462:0x060e  */
    /* JADX WARN: Code duplicated, block: B:465:0x0618  */
    /* JADX WARN: Code duplicated, block: B:466:0x061c  */
    /* JADX WARN: Code duplicated, block: B:469:0x0626  */
    /* JADX WARN: Code duplicated, block: B:470:0x062a  */
    /* JADX WARN: Code duplicated, block: B:473:0x0634  */
    /* JADX WARN: Code duplicated, block: B:474:0x0638  */
    /* JADX WARN: Code duplicated, block: B:477:0x0642  */
    /* JADX WARN: Code duplicated, block: B:478:0x0646  */
    /* JADX WARN: Code duplicated, block: B:481:0x0650  */
    /* JADX WARN: Code duplicated, block: B:482:0x0654  */
    /* JADX WARN: Code duplicated, block: B:485:0x065e  */
    /* JADX WARN: Code duplicated, block: B:486:0x0662  */
    /* JADX WARN: Code duplicated, block: B:489:0x066c  */
    /* JADX WARN: Code duplicated, block: B:490:0x0670  */
    /* JADX WARN: Code duplicated, block: B:493:0x067a  */
    /* JADX WARN: Code duplicated, block: B:494:0x067e  */
    /* JADX WARN: Code duplicated, block: B:497:0x0688  */
    /* JADX WARN: Code duplicated, block: B:498:0x068c  */
    /* JADX WARN: Code duplicated, block: B:49:0x008b A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:501:0x0696  */
    /* JADX WARN: Code duplicated, block: B:502:0x069a  */
    /* JADX WARN: Code duplicated, block: B:505:0x06a4  */
    /* JADX WARN: Code duplicated, block: B:506:0x06a8  */
    /* JADX WARN: Code duplicated, block: B:509:0x06b2  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e  */
    /* JADX WARN: Code duplicated, block: B:510:0x06b6  */
    /* JADX WARN: Code duplicated, block: B:513:0x06c0  */
    /* JADX WARN: Code duplicated, block: B:514:0x06c4  */
    /* JADX WARN: Code duplicated, block: B:517:0x06ce  */
    /* JADX WARN: Code duplicated, block: B:518:0x06d2  */
    /* JADX WARN: Code duplicated, block: B:521:0x06dc  */
    /* JADX WARN: Code duplicated, block: B:522:0x06e0  */
    /* JADX WARN: Code duplicated, block: B:525:0x06ea  */
    /* JADX WARN: Code duplicated, block: B:526:0x06ee  */
    /* JADX WARN: Code duplicated, block: B:529:0x06f8  */
    /* JADX WARN: Code duplicated, block: B:530:0x06fc  */
    /* JADX WARN: Code duplicated, block: B:533:0x0706  */
    /* JADX WARN: Code duplicated, block: B:534:0x070a  */
    /* JADX WARN: Code duplicated, block: B:537:0x0714  */
    /* JADX WARN: Code duplicated, block: B:538:0x0718  */
    /* JADX WARN: Code duplicated, block: B:541:0x0722  */
    /* JADX WARN: Code duplicated, block: B:542:0x0726  */
    /* JADX WARN: Code duplicated, block: B:545:0x0730  */
    /* JADX WARN: Code duplicated, block: B:546:0x0734  */
    /* JADX WARN: Code duplicated, block: B:549:0x073e  */
    /* JADX WARN: Code duplicated, block: B:552:0x0748  */
    /* JADX WARN: Code duplicated, block: B:553:0x074b  */
    /* JADX WARN: Code duplicated, block: B:556:0x0755  */
    /* JADX WARN: Code duplicated, block: B:557:0x0758  */
    /* JADX WARN: Code duplicated, block: B:55:0x009d A[Catch: all -> 0x08c4, TRY_LEAVE, TryCatch #0 {all -> 0x08c4, blocks: (B:7:0x000f, B:9:0x0013, B:11:0x0021, B:664:0x08bf, B:52:0x0092, B:55:0x009d, B:98:0x0118, B:667:0x08c6), top: B:672:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:560:0x0762  */
    /* JADX WARN: Code duplicated, block: B:561:0x0766  */
    /* JADX WARN: Code duplicated, block: B:564:0x0770  */
    /* JADX WARN: Code duplicated, block: B:565:0x0774  */
    /* JADX WARN: Code duplicated, block: B:568:0x077e  */
    /* JADX WARN: Code duplicated, block: B:569:0x0782  */
    /* JADX WARN: Code duplicated, block: B:572:0x078c  */
    /* JADX WARN: Code duplicated, block: B:573:0x0790  */
    /* JADX WARN: Code duplicated, block: B:576:0x079a  */
    /* JADX WARN: Code duplicated, block: B:577:0x079e  */
    /* JADX WARN: Code duplicated, block: B:580:0x07a9  */
    /* JADX WARN: Code duplicated, block: B:581:0x07ad  */
    /* JADX WARN: Code duplicated, block: B:584:0x07b7  */
    /* JADX WARN: Code duplicated, block: B:585:0x07bb  */
    /* JADX WARN: Code duplicated, block: B:588:0x07c5  */
    /* JADX WARN: Code duplicated, block: B:589:0x07c9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:592:0x07d3  */
    /* JADX WARN: Code duplicated, block: B:593:0x07d7  */
    /* JADX WARN: Code duplicated, block: B:596:0x07e1  */
    /* JADX WARN: Code duplicated, block: B:597:0x07e5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:600:0x07ef  */
    /* JADX WARN: Code duplicated, block: B:601:0x07f3  */
    /* JADX WARN: Code duplicated, block: B:604:0x07fd  */
    /* JADX WARN: Code duplicated, block: B:605:0x0801  */
    /* JADX WARN: Code duplicated, block: B:608:0x080b  */
    /* JADX WARN: Code duplicated, block: B:609:0x080f  */
    /* JADX WARN: Code duplicated, block: B:612:0x0819  */
    /* JADX WARN: Code duplicated, block: B:613:0x081d  */
    /* JADX WARN: Code duplicated, block: B:616:0x0827  */
    /* JADX WARN: Code duplicated, block: B:617:0x082b  */
    /* JADX WARN: Code duplicated, block: B:620:0x0835  */
    /* JADX WARN: Code duplicated, block: B:621:0x0839  */
    /* JADX WARN: Code duplicated, block: B:624:0x0843  */
    /* JADX WARN: Code duplicated, block: B:625:0x0847  */
    /* JADX WARN: Code duplicated, block: B:628:0x0851  */
    /* JADX WARN: Code duplicated, block: B:629:0x0854  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:632:0x085e  */
    /* JADX WARN: Code duplicated, block: B:633:0x0860  */
    /* JADX WARN: Code duplicated, block: B:636:0x086b  */
    /* JADX WARN: Code duplicated, block: B:637:0x086d  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:640:0x0877  */
    /* JADX WARN: Code duplicated, block: B:641:0x0879  */
    /* JADX WARN: Code duplicated, block: B:644:0x0883  */
    /* JADX WARN: Code duplicated, block: B:645:0x0885  */
    /* JADX WARN: Code duplicated, block: B:648:0x088f  */
    /* JADX WARN: Code duplicated, block: B:649:0x0891  */
    /* JADX WARN: Code duplicated, block: B:652:0x089b  */
    /* JADX WARN: Code duplicated, block: B:653:0x089d  */
    /* JADX WARN: Code duplicated, block: B:656:0x08a7  */
    /* JADX WARN: Code duplicated, block: B:657:0x08a9  */
    /* JADX WARN: Code duplicated, block: B:660:0x08b3  */
    /* JADX WARN: Code duplicated, block: B:662:0x08b7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:682:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:683:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:684:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:685:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:686:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:687:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:688:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:689:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:690:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:691:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:692:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:693:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:694:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:695:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:696:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:697:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:698:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:699:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:700:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:701:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:702:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:703:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:704:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:705:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:706:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:707:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:708:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:709:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:710:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:711:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:712:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:713:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:714:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:715:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:716:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:717:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:718:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:719:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:720:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:721:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:722:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:723:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:724:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:725:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:726:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:727:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:728:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:729:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:730:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:731:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:732:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:733:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:734:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:735:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:736:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:737:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:738:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:739:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:740:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:741:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:742:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:743:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:744:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:745:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:746:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:747:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:748:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:749:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:750:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:751:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:752:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:753:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:754:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:755:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:756:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:757:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:758:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:759:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00db  */
    /* JADX WARN: Code duplicated, block: B:760:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:761:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:762:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:763:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:764:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:765:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:766:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:767:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:768:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:769:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:770:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:771:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:772:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:773:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:774:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:775:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:776:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:777:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:778:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:779:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:780:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:781:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:782:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:783:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:784:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:785:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:786:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:787:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:788:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:789:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:790:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:791:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:792:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:793:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:794:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:795:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:796:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:797:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:798:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:799:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:800:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:801:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:802:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:803:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:804:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:805:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:806:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:807:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:808:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:809:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:810:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:811:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:812:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:813:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:814:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:815:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:816:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:817:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:818:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:819:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:820:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:821:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:822:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:823:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:824:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:825:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:826:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:827:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:828:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:829:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:830:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:90:0x0105  */
    /* JADX WARN: Code duplicated, block: B:91:0x0107  */
    /* JADX WARN: Code duplicated, block: B:94:0x0110  */
    /* JADX WARN: Code duplicated, block: B:96:0x0114  */
    /* JADX WARN: Code duplicated, block: B:98:0x0118 A[Catch: all -> 0x08c4, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x08c4, blocks: (B:7:0x000f, B:9:0x0013, B:11:0x0021, B:664:0x08bf, B:52:0x0092, B:55:0x009d, B:98:0x0118, B:667:0x08c6), top: B:672:0x000f }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static boolean J0(String str) {
        String str2;
        byte b2;
        String str3;
        byte b3;
        boolean z = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (ljv.class) {
            try {
                if (!I1) {
                    int i = Build.VERSION.SDK_INT;
                    byte b4 = 28;
                    if (i <= 28) {
                        String str4 = Build.DEVICE;
                        str4.getClass();
                        switch (str4.hashCode()) {
                            case -1339091551:
                                b3 = !str4.equals("dangal") ? (byte) -1 : (byte) 0;
                                break;
                            case -1220081023:
                                b3 = !str4.equals("dangalFHD") ? (byte) -1 : (byte) 1;
                                break;
                            case -1220066608:
                                b3 = !str4.equals("dangalUHD") ? (byte) -1 : (byte) 2;
                                break;
                            case -1012436106:
                                b3 = !str4.equals("oneday") ? (byte) -1 : (byte) 3;
                                break;
                            case -760312546:
                                b3 = !str4.equals("aquaman") ? (byte) -1 : (byte) 4;
                                break;
                            case -64886864:
                                b3 = !str4.equals("magnolia") ? (byte) -1 : (byte) 5;
                                break;
                            case 3415681:
                                b3 = !str4.equals("once") ? (byte) -1 : (byte) 6;
                                break;
                            case 825323514:
                                b3 = !str4.equals("machuca") ? (byte) -1 : (byte) 7;
                                break;
                            default:
                                b3 = -1;
                                break;
                        }
                        switch (b3) {
                            default:
                                if (i <= 27 || !"HWEML".equals(Build.DEVICE)) {
                                    str2 = Build.MODEL;
                                    str2.getClass();
                                    switch (str2.hashCode()) {
                                        case -349662828:
                                            if (!str2.equals("AFTJMST12")) {
                                                b2 = 0;
                                            } else {
                                                b2 = -1;
                                            }
                                            break;
                                        case -321033677:
                                            if (!str2.equals("AFTKMST12")) {
                                                b2 = 1;
                                            } else {
                                                b2 = -1;
                                            }
                                            break;
                                        case 2006354:
                                            if (!str2.equals("AFTA")) {
                                                b2 = 2;
                                            } else {
                                                b2 = -1;
                                            }
                                            break;
                                        case 2006367:
                                            if (!str2.equals("AFTN")) {
                                                b2 = 3;
                                            } else {
                                                b2 = -1;
                                            }
                                            break;
                                        case 2006371:
                                            if (!str2.equals("AFTR")) {
                                                b2 = 4;
                                            } else {
                                                b2 = -1;
                                            }
                                            break;
                                        case 1785421873:
                                            if (!str2.equals("AFTEU011")) {
                                                b2 = 5;
                                            } else {
                                                b2 = -1;
                                            }
                                            break;
                                        case 1785421876:
                                            if (!str2.equals("AFTEU014")) {
                                                b2 = 6;
                                            } else {
                                                b2 = -1;
                                            }
                                            break;
                                        case 1798172390:
                                            if (!str2.equals("AFTSO001")) {
                                                b2 = 7;
                                            } else {
                                                b2 = -1;
                                            }
                                            break;
                                        case 2119412532:
                                            if (!str2.equals("AFTEUFF014")) {
                                                b2 = 8;
                                            } else {
                                                b2 = -1;
                                            }
                                            break;
                                        default:
                                            b2 = -1;
                                            break;
                                    }
                                    switch (b2) {
                                        default:
                                            if (i <= 26) {
                                                str3 = Build.DEVICE;
                                                str3.getClass();
                                                switch (str3.hashCode()) {
                                                    case -2144781245:
                                                        if (!str3.equals("GIONEE_SWW1609")) {
                                                            b4 = 0;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -2144781185:
                                                        if (!str3.equals("GIONEE_SWW1627")) {
                                                            b4 = 1;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -2144781160:
                                                        if (!str3.equals("GIONEE_SWW1631")) {
                                                            b4 = 2;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -2097309513:
                                                        if (!str3.equals("K50a40")) {
                                                            b4 = 3;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -2022874474:
                                                        if (!str3.equals("CP8676_I02")) {
                                                            b4 = 4;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -1978993182:
                                                        if (!str3.equals("NX541J")) {
                                                            b4 = 5;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -1978990237:
                                                        if (!str3.equals(oAudzpbdOhCI.iABjyKVXDCY)) {
                                                            b4 = 6;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -1936688988:
                                                        if (!str3.equals("PGN528")) {
                                                            b4 = 7;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -1936688066:
                                                        if (!str3.equals("PGN610")) {
                                                            b4 = 8;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -1936688065:
                                                        if (!str3.equals("PGN611")) {
                                                            b4 = 9;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -1931988508:
                                                        if (!str3.equals("AquaPowerM")) {
                                                            b4 = 10;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -1885099851:
                                                        if (!str3.equals("RAIJIN")) {
                                                            b4 = 11;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -1696512866:
                                                        if (!str3.equals("XT1663")) {
                                                            b4 = 12;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -1680025915:
                                                        if (!str3.equals("ComioS1")) {
                                                            b4 = 13;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -1615810839:
                                                        if (!str3.equals("Phantom6")) {
                                                            b4 = 14;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -1600724499:
                                                        if (!str3.equals("pacificrim")) {
                                                            b4 = 15;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -1554255044:
                                                        if (!str3.equals("vernee_M5")) {
                                                            b4 = 16;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -1481772737:
                                                        if (!str3.equals("panell_dl")) {
                                                            b4 = 17;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -1481772730:
                                                        if (!str3.equals("panell_ds")) {
                                                            b4 = 18;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -1481772729:
                                                        if (!str3.equals("panell_dt")) {
                                                            b4 = 19;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -1320080169:
                                                        if (!str3.equals(iKBWavCysVP.CMhRNyTGj)) {
                                                            b4 = 20;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -1217592143:
                                                        if (!str3.equals("BRAVIA_ATV2")) {
                                                            b4 = 21;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -1180384755:
                                                        if (!str3.equals("iris60")) {
                                                            b4 = 22;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -1139198265:
                                                        if (!str3.equals("Slate_Pro")) {
                                                            b4 = 23;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -1052835013:
                                                        if (!str3.equals("namath")) {
                                                            b4 = 24;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -993250464:
                                                        if (!str3.equals("A10-70F")) {
                                                            b4 = 25;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -993250458:
                                                        if (!str3.equals("A10-70L")) {
                                                            b4 = 26;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -965403638:
                                                        if (!str3.equals("s905x018")) {
                                                            b4 = 27;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -958336948:
                                                        if (!str3.equals("ELUGA_Ray_X")) {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -879245230:
                                                        if (!str3.equals("tcl_eu")) {
                                                            b4 = 29;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -842500323:
                                                        if (!str3.equals("nicklaus_f")) {
                                                            b4 = 30;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -821392978:
                                                        if (!str3.equals("A7000-a")) {
                                                            b4 = 31;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -797483286:
                                                        if (!str3.equals("SVP-DTV15")) {
                                                            b4 = 32;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -794946968:
                                                        if (!str3.equals("watson")) {
                                                            b4 = 33;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -788334647:
                                                        if (!str3.equals("whyred")) {
                                                            b4 = 34;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -782144577:
                                                        if (!str3.equals("OnePlus5T")) {
                                                            b4 = 35;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -575125681:
                                                        if (!str3.equals("GiONEE_CBL7513")) {
                                                            b4 = 36;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -521118391:
                                                        if (!str3.equals("GIONEE_GBL7360")) {
                                                            b4 = 37;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -430914369:
                                                        if (!str3.equals("Pixi4-7_3G")) {
                                                            b4 = 38;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -290434366:
                                                        if (!str3.equals("taido_row")) {
                                                            b4 = 39;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -282781963:
                                                        if (!str3.equals("BLACK-1X")) {
                                                            b4 = 40;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -277133239:
                                                        if (!str3.equals("Z12_PRO")) {
                                                            b4 = 41;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -173639913:
                                                        if (!str3.equals("ELUGA_A3_Pro")) {
                                                            b4 = 42;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -56598463:
                                                        if (!str3.equals("woods_fn")) {
                                                            b4 = 43;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 2126:
                                                        if (!str3.equals("C1")) {
                                                            b4 = 44;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 2564:
                                                        if (!str3.equals("Q5")) {
                                                            b4 = 45;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 2715:
                                                        if (!str3.equals("V1")) {
                                                            b4 = 46;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 2719:
                                                        if (!str3.equals("V5")) {
                                                            b4 = 47;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 3091:
                                                        if (!str3.equals("b5")) {
                                                            b4 = 48;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 3483:
                                                        if (!str3.equals("mh")) {
                                                            b4 = 49;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 73405:
                                                        if (!str3.equals("JGZ")) {
                                                            b4 = 50;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 75537:
                                                        if (!str3.equals("M04")) {
                                                            b4 = 51;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 75739:
                                                        if (!str3.equals("M5c")) {
                                                            b4 = 52;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 76779:
                                                        if (!str3.equals("MX6")) {
                                                            b4 = 53;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 78669:
                                                        if (!str3.equals("P85")) {
                                                            b4 = 54;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 79305:
                                                        if (!str3.equals("PLE")) {
                                                            b4 = 55;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 80618:
                                                        if (!str3.equals("QX1")) {
                                                            b4 = 56;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 88274:
                                                        if (!str3.equals("Z80")) {
                                                            b4 = 57;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 98846:
                                                        if (!str3.equals("cv1")) {
                                                            b4 = 58;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 98848:
                                                        if (!str3.equals("cv3")) {
                                                            b4 = 59;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 99329:
                                                        if (!str3.equals("deb")) {
                                                            b4 = 60;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 101481:
                                                        if (!str3.equals("flo")) {
                                                            b4 = 61;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 1513190:
                                                        if (!str3.equals("1601")) {
                                                            b4 = 62;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 1514184:
                                                        if (!str3.equals("1713")) {
                                                            b4 = 63;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 1514185:
                                                        if (!str3.equals("1714")) {
                                                            b4 = 64;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 2133089:
                                                        if (!str3.equals("F01H")) {
                                                            b4 = 65;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 2133091:
                                                        if (!str3.equals("F01J")) {
                                                            b4 = 66;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 2133120:
                                                        if (!str3.equals("F02H")) {
                                                            b4 = 67;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 2133151:
                                                        if (!str3.equals("F03H")) {
                                                            b4 = 68;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 2133182:
                                                        if (!str3.equals("F04H")) {
                                                            b4 = 69;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 2133184:
                                                        if (!str3.equals("F04J")) {
                                                            b4 = 70;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 2436959:
                                                        if (!str3.equals("P681")) {
                                                            b4 = 71;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 2463773:
                                                        if (!str3.equals("Q350")) {
                                                            b4 = 72;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 2464648:
                                                        if (!str3.equals("Q427")) {
                                                            b4 = 73;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 2689555:
                                                        if (!str3.equals("XE2X")) {
                                                            b4 = 74;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 3154429:
                                                        if (!str3.equals(iKBWavCysVP.EFePeFeBEMYQwqA)) {
                                                            b4 = 75;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 3284551:
                                                        if (!str3.equals("kate")) {
                                                            b4 = 76;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 3351335:
                                                        if (!str3.equals("mido")) {
                                                            b4 = 77;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 3386211:
                                                        if (!str3.equals("p212")) {
                                                            b4 = 78;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 41325051:
                                                        if (!str3.equals("MEIZU_M5")) {
                                                            b4 = 79;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 51349633:
                                                        if (!str3.equals("601LV")) {
                                                            b4 = 80;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 51350594:
                                                        if (!str3.equals("602LV")) {
                                                            b4 = 81;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 55178625:
                                                        if (!str3.equals("Aura_Note_2")) {
                                                            b4 = 82;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 61542055:
                                                        if (!str3.equals("A1601")) {
                                                            b4 = 83;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 65355429:
                                                        if (!str3.equals("E5643")) {
                                                            b4 = 84;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 66214468:
                                                        if (!str3.equals("F3111")) {
                                                            b4 = 85;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 66214470:
                                                        if (!str3.equals("F3113")) {
                                                            b4 = 86;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 66214473:
                                                        if (!str3.equals("F3116")) {
                                                            b4 = 87;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 66215429:
                                                        if (!str3.equals("F3211")) {
                                                            b4 = 88;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 66215431:
                                                        if (!str3.equals("F3213")) {
                                                            b4 = 89;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 66215433:
                                                        if (!str3.equals("F3215")) {
                                                            b4 = 90;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 66216390:
                                                        if (!str3.equals("F3311")) {
                                                            b4 = 91;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 76402249:
                                                        if (!str3.equals(qUnCRF.GyPjHm)) {
                                                            b4 = 92;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 76404105:
                                                        if (!str3.equals("Q4260")) {
                                                            b4 = 93;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 76404911:
                                                        if (!str3.equals("Q4310")) {
                                                            b4 = 94;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 80963634:
                                                        if (!str3.equals("V23GB")) {
                                                            b4 = 95;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 82882791:
                                                        if (!str3.equals("X3_HK")) {
                                                            b4 = 96;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 98715550:
                                                        if (!str3.equals("i9031")) {
                                                            b4 = 97;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 101370885:
                                                        if (!str3.equals("l5460")) {
                                                            b4 = 98;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 102844228:
                                                        if (!str3.equals("le_x6")) {
                                                            b4 = 99;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 165221241:
                                                        if (!str3.equals("A2016a40")) {
                                                            b4 = 100;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 182191441:
                                                        if (!str3.equals("CPY83_I00")) {
                                                            b4 = 101;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 245388979:
                                                        if (!str3.equals("marino_f")) {
                                                            b4 = 102;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 287431619:
                                                        if (!str3.equals("griffin")) {
                                                            b4 = 103;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 307593612:
                                                        if (!str3.equals("A7010a48")) {
                                                            b4 = 104;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 308517133:
                                                        if (!str3.equals("A7020a48")) {
                                                            b4 = 105;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 316215098:
                                                        if (!str3.equals("TB3-730F")) {
                                                            b4 = 106;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 316215116:
                                                        if (!str3.equals("TB3-730X")) {
                                                            b4 = 107;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 316246811:
                                                        if (!str3.equals("TB3-850F")) {
                                                            b4 = 108;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 316246818:
                                                        if (!str3.equals("TB3-850M")) {
                                                            b4 = 109;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 407160593:
                                                        if (!str3.equals("Pixi5-10_4G")) {
                                                            b4 = 110;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 507412548:
                                                        if (!str3.equals(tYcQsJyaojE.hdZoOqSvpEiKQ)) {
                                                            b4 = 111;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 793982701:
                                                        if (!str3.equals("GIONEE_WBL5708")) {
                                                            b4 = 112;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 794038622:
                                                        if (!str3.equals("GIONEE_WBL7365")) {
                                                            b4 = 113;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 794040393:
                                                        if (!str3.equals("GIONEE_WBL7519")) {
                                                            b4 = 114;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 835649806:
                                                        if (!str3.equals("manning")) {
                                                            b4 = 115;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 917340916:
                                                        if (!str3.equals("A7000plus")) {
                                                            b4 = 116;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 958008161:
                                                        if (!str3.equals("j2xlteins")) {
                                                            b4 = 117;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 1060579533:
                                                        if (!str3.equals("panell_d")) {
                                                            b4 = 118;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 1150207623:
                                                        if (!str3.equals("LS-5017")) {
                                                            b4 = 119;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 1176899427:
                                                        if (!str3.equals("itel_S41")) {
                                                            b4 = 120;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 1280332038:
                                                        if (!str3.equals("hwALE-H")) {
                                                            b4 = 121;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 1306947716:
                                                        if (!str3.equals("EverStar_S")) {
                                                            b4 = 122;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 1349174697:
                                                        if (!str3.equals("htc_e56ml_dtul")) {
                                                            b4 = 123;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 1522194893:
                                                        if (!str3.equals("woods_f")) {
                                                            b4 = 124;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 1691543273:
                                                        if (!str3.equals("CPH1609")) {
                                                            b4 = 125;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 1691544261:
                                                        if (!str3.equals("CPH1715")) {
                                                            b4 = 126;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 1709443163:
                                                        if (!str3.equals("iball8735_9806")) {
                                                            b4 = 127;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 1865889110:
                                                        if (!str3.equals("santoni")) {
                                                            b4 = 128;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 1906253259:
                                                        if (!str3.equals("PB2-670M")) {
                                                            b4 = 129;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 1977196784:
                                                        if (!str3.equals("Infinix-X572")) {
                                                            b4 = 130;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 2006372676:
                                                        if (!str3.equals(lTGEJfVytU.imkfaJQNBGYMgn)) {
                                                            b4 = 131;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 2019281702:
                                                        if (!str3.equals("DM-01K")) {
                                                            b4 = 132;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 2029784656:
                                                        if (!str3.equals("HWBLN-H")) {
                                                            b4 = 133;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 2030379515:
                                                        if (!str3.equals("HWCAM-H")) {
                                                            b4 = 134;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 2033393791:
                                                        if (!str3.equals("ASUS_X00AD_2")) {
                                                            b4 = 135;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 2047190025:
                                                        if (!str3.equals("ELUGA_Note")) {
                                                            b4 = 136;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 2047252157:
                                                        if (!str3.equals("ELUGA_Prim")) {
                                                            b4 = 137;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 2048319463:
                                                        if (!str3.equals("HWVNS-H")) {
                                                            b4 = 138;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 2048855701:
                                                        if (!str3.equals("HWWAS-H")) {
                                                            b4 = 139;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    default:
                                                        b4 = -1;
                                                        break;
                                                }
                                                switch (b4) {
                                                    default:
                                                        if (str2.equals("JSN-L21")) {
                                                        }
                                                    case 0:
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                    case 7:
                                                    case 8:
                                                    case 9:
                                                    case 10:
                                                    case 11:
                                                    case 12:
                                                    case 13:
                                                    case 14:
                                                    case 15:
                                                    case 16:
                                                    case 17:
                                                    case 18:
                                                    case 19:
                                                    case 20:
                                                    case 21:
                                                    case 22:
                                                    case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                                                    case 24:
                                                    case KYCBannerItem.STATUS_DEPRECATE /* 25 */:
                                                    case RuntimeVersion.MINOR /* 26 */:
                                                    case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                                                    case 28:
                                                    case 29:
                                                    case 30:
                                                    case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                                                    case 32:
                                                    case 33:
                                                    case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                                                    case 35:
                                                    case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                                                    case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                                                    case 38:
                                                    case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                                    case 40:
                                                    case 41:
                                                    case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                                                    case 43:
                                                    case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                                    case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                    case 46:
                                                    case 47:
                                                    case 48:
                                                    case 49:
                                                    case 50:
                                                    case 51:
                                                    case 52:
                                                    case 53:
                                                    case 54:
                                                    case 55:
                                                    case 56:
                                                    case 57:
                                                    case 58:
                                                    case 59:
                                                    case 60:
                                                    case 61:
                                                    case 62:
                                                    case 63:
                                                    case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
                                                    case 65:
                                                    case 66:
                                                    case 67:
                                                    case 68:
                                                    case 69:
                                                    case 70:
                                                    case 71:
                                                    case 72:
                                                    case 73:
                                                    case 74:
                                                    case 75:
                                                    case 76:
                                                    case 77:
                                                    case 78:
                                                    case 79:
                                                    case 80:
                                                    case 81:
                                                    case 82:
                                                    case 83:
                                                    case 84:
                                                    case 85:
                                                    case 86:
                                                    case 87:
                                                    case 88:
                                                    case 89:
                                                    case 90:
                                                    case 91:
                                                    case 92:
                                                    case 93:
                                                    case 94:
                                                    case 95:
                                                    case 96:
                                                    case 97:
                                                    case 98:
                                                    case 99:
                                                    case 100:
                                                    case HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS /* 101 */:
                                                    case HttpStatusCodesKt.HTTP_PROCESSING /* 102 */:
                                                    case HttpStatusCodesKt.HTTP_EARLY_HINTS /* 103 */:
                                                    case 104:
                                                    case 105:
                                                    case 106:
                                                    case 107:
                                                    case 108:
                                                    case 109:
                                                    case 110:
                                                    case 111:
                                                    case 112:
                                                    case 113:
                                                    case 114:
                                                    case 115:
                                                    case 116:
                                                    case 117:
                                                    case 118:
                                                    case 119:
                                                    case 120:
                                                    case 121:
                                                    case 122:
                                                    case 123:
                                                    case 124:
                                                    case 125:
                                                    case WebSocketProtocol.PAYLOAD_SHORT /* 126 */:
                                                    case 127:
                                                    case 128:
                                                    case 129:
                                                    case 130:
                                                    case 131:
                                                    case 132:
                                                    case 133:
                                                    case 134:
                                                    case 135:
                                                    case 136:
                                                    case 137:
                                                    case 138:
                                                    case 139:
                                                        z = true;
                                                        break;
                                                }
                                            }
                                        case 0:
                                        case 1:
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                            z = true;
                                            break;
                                    }
                                }
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                z = true;
                                break;
                        }
                    } else if (i <= 27) {
                        str2 = Build.MODEL;
                        str2.getClass();
                        switch (str2.hashCode()) {
                            case -349662828:
                                if (!str2.equals("AFTJMST12")) {
                                    b2 = 0;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case -321033677:
                                if (!str2.equals("AFTKMST12")) {
                                    b2 = 1;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case 2006354:
                                if (!str2.equals("AFTA")) {
                                    b2 = 2;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case 2006367:
                                if (!str2.equals("AFTN")) {
                                    b2 = 3;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case 2006371:
                                if (!str2.equals("AFTR")) {
                                    b2 = 4;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case 1785421873:
                                if (!str2.equals("AFTEU011")) {
                                    b2 = 5;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case 1785421876:
                                if (!str2.equals("AFTEU014")) {
                                    b2 = 6;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case 1798172390:
                                if (!str2.equals("AFTSO001")) {
                                    b2 = 7;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case 2119412532:
                                if (!str2.equals("AFTEUFF014")) {
                                    b2 = 8;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            default:
                                b2 = -1;
                                break;
                        }
                        switch (b2) {
                            default:
                                if (i <= 26) {
                                    str3 = Build.DEVICE;
                                    str3.getClass();
                                    switch (str3.hashCode()) {
                                        case -2144781245:
                                            if (!str3.equals("GIONEE_SWW1609")) {
                                                b4 = 0;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -2144781185:
                                            if (!str3.equals("GIONEE_SWW1627")) {
                                                b4 = 1;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -2144781160:
                                            if (!str3.equals("GIONEE_SWW1631")) {
                                                b4 = 2;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -2097309513:
                                            if (!str3.equals("K50a40")) {
                                                b4 = 3;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -2022874474:
                                            if (!str3.equals("CP8676_I02")) {
                                                b4 = 4;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -1978993182:
                                            if (!str3.equals("NX541J")) {
                                                b4 = 5;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -1978990237:
                                            if (!str3.equals(oAudzpbdOhCI.iABjyKVXDCY)) {
                                                b4 = 6;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -1936688988:
                                            if (!str3.equals("PGN528")) {
                                                b4 = 7;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -1936688066:
                                            if (!str3.equals("PGN610")) {
                                                b4 = 8;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -1936688065:
                                            if (!str3.equals("PGN611")) {
                                                b4 = 9;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -1931988508:
                                            if (!str3.equals("AquaPowerM")) {
                                                b4 = 10;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -1885099851:
                                            if (!str3.equals("RAIJIN")) {
                                                b4 = 11;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -1696512866:
                                            if (!str3.equals("XT1663")) {
                                                b4 = 12;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -1680025915:
                                            if (!str3.equals("ComioS1")) {
                                                b4 = 13;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -1615810839:
                                            if (!str3.equals("Phantom6")) {
                                                b4 = 14;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -1600724499:
                                            if (!str3.equals("pacificrim")) {
                                                b4 = 15;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -1554255044:
                                            if (!str3.equals("vernee_M5")) {
                                                b4 = 16;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -1481772737:
                                            if (!str3.equals("panell_dl")) {
                                                b4 = 17;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -1481772730:
                                            if (!str3.equals("panell_ds")) {
                                                b4 = 18;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -1481772729:
                                            if (!str3.equals("panell_dt")) {
                                                b4 = 19;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -1320080169:
                                            if (!str3.equals(iKBWavCysVP.CMhRNyTGj)) {
                                                b4 = 20;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -1217592143:
                                            if (!str3.equals("BRAVIA_ATV2")) {
                                                b4 = 21;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -1180384755:
                                            if (!str3.equals("iris60")) {
                                                b4 = 22;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -1139198265:
                                            if (!str3.equals("Slate_Pro")) {
                                                b4 = 23;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -1052835013:
                                            if (!str3.equals("namath")) {
                                                b4 = 24;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -993250464:
                                            if (!str3.equals("A10-70F")) {
                                                b4 = 25;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -993250458:
                                            if (!str3.equals("A10-70L")) {
                                                b4 = 26;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -965403638:
                                            if (!str3.equals("s905x018")) {
                                                b4 = 27;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -958336948:
                                            if (!str3.equals("ELUGA_Ray_X")) {
                                                b4 = -1;
                                            }
                                            break;
                                        case -879245230:
                                            if (!str3.equals("tcl_eu")) {
                                                b4 = 29;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -842500323:
                                            if (!str3.equals("nicklaus_f")) {
                                                b4 = 30;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -821392978:
                                            if (!str3.equals("A7000-a")) {
                                                b4 = 31;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -797483286:
                                            if (!str3.equals("SVP-DTV15")) {
                                                b4 = 32;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -794946968:
                                            if (!str3.equals("watson")) {
                                                b4 = 33;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -788334647:
                                            if (!str3.equals("whyred")) {
                                                b4 = 34;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -782144577:
                                            if (!str3.equals("OnePlus5T")) {
                                                b4 = 35;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -575125681:
                                            if (!str3.equals("GiONEE_CBL7513")) {
                                                b4 = 36;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -521118391:
                                            if (!str3.equals("GIONEE_GBL7360")) {
                                                b4 = 37;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -430914369:
                                            if (!str3.equals("Pixi4-7_3G")) {
                                                b4 = 38;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -290434366:
                                            if (!str3.equals("taido_row")) {
                                                b4 = 39;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -282781963:
                                            if (!str3.equals("BLACK-1X")) {
                                                b4 = 40;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -277133239:
                                            if (!str3.equals("Z12_PRO")) {
                                                b4 = 41;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -173639913:
                                            if (!str3.equals("ELUGA_A3_Pro")) {
                                                b4 = 42;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -56598463:
                                            if (!str3.equals("woods_fn")) {
                                                b4 = 43;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 2126:
                                            if (!str3.equals("C1")) {
                                                b4 = 44;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 2564:
                                            if (!str3.equals("Q5")) {
                                                b4 = 45;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 2715:
                                            if (!str3.equals("V1")) {
                                                b4 = 46;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 2719:
                                            if (!str3.equals("V5")) {
                                                b4 = 47;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 3091:
                                            if (!str3.equals("b5")) {
                                                b4 = 48;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 3483:
                                            if (!str3.equals("mh")) {
                                                b4 = 49;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 73405:
                                            if (!str3.equals("JGZ")) {
                                                b4 = 50;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 75537:
                                            if (!str3.equals("M04")) {
                                                b4 = 51;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 75739:
                                            if (!str3.equals("M5c")) {
                                                b4 = 52;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 76779:
                                            if (!str3.equals("MX6")) {
                                                b4 = 53;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 78669:
                                            if (!str3.equals("P85")) {
                                                b4 = 54;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 79305:
                                            if (!str3.equals("PLE")) {
                                                b4 = 55;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 80618:
                                            if (!str3.equals("QX1")) {
                                                b4 = 56;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 88274:
                                            if (!str3.equals("Z80")) {
                                                b4 = 57;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 98846:
                                            if (!str3.equals("cv1")) {
                                                b4 = 58;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 98848:
                                            if (!str3.equals("cv3")) {
                                                b4 = 59;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 99329:
                                            if (!str3.equals("deb")) {
                                                b4 = 60;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 101481:
                                            if (!str3.equals("flo")) {
                                                b4 = 61;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 1513190:
                                            if (!str3.equals("1601")) {
                                                b4 = 62;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 1514184:
                                            if (!str3.equals("1713")) {
                                                b4 = 63;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 1514185:
                                            if (!str3.equals("1714")) {
                                                b4 = 64;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 2133089:
                                            if (!str3.equals("F01H")) {
                                                b4 = 65;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 2133091:
                                            if (!str3.equals("F01J")) {
                                                b4 = 66;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 2133120:
                                            if (!str3.equals("F02H")) {
                                                b4 = 67;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 2133151:
                                            if (!str3.equals("F03H")) {
                                                b4 = 68;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 2133182:
                                            if (!str3.equals("F04H")) {
                                                b4 = 69;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 2133184:
                                            if (!str3.equals("F04J")) {
                                                b4 = 70;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 2436959:
                                            if (!str3.equals("P681")) {
                                                b4 = 71;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 2463773:
                                            if (!str3.equals("Q350")) {
                                                b4 = 72;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 2464648:
                                            if (!str3.equals("Q427")) {
                                                b4 = 73;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 2689555:
                                            if (!str3.equals("XE2X")) {
                                                b4 = 74;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 3154429:
                                            if (!str3.equals(iKBWavCysVP.EFePeFeBEMYQwqA)) {
                                                b4 = 75;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 3284551:
                                            if (!str3.equals("kate")) {
                                                b4 = 76;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 3351335:
                                            if (!str3.equals("mido")) {
                                                b4 = 77;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 3386211:
                                            if (!str3.equals("p212")) {
                                                b4 = 78;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 41325051:
                                            if (!str3.equals("MEIZU_M5")) {
                                                b4 = 79;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 51349633:
                                            if (!str3.equals("601LV")) {
                                                b4 = 80;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 51350594:
                                            if (!str3.equals("602LV")) {
                                                b4 = 81;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 55178625:
                                            if (!str3.equals("Aura_Note_2")) {
                                                b4 = 82;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 61542055:
                                            if (!str3.equals("A1601")) {
                                                b4 = 83;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 65355429:
                                            if (!str3.equals("E5643")) {
                                                b4 = 84;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 66214468:
                                            if (!str3.equals("F3111")) {
                                                b4 = 85;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 66214470:
                                            if (!str3.equals("F3113")) {
                                                b4 = 86;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 66214473:
                                            if (!str3.equals("F3116")) {
                                                b4 = 87;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 66215429:
                                            if (!str3.equals("F3211")) {
                                                b4 = 88;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 66215431:
                                            if (!str3.equals("F3213")) {
                                                b4 = 89;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 66215433:
                                            if (!str3.equals("F3215")) {
                                                b4 = 90;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 66216390:
                                            if (!str3.equals("F3311")) {
                                                b4 = 91;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 76402249:
                                            if (!str3.equals(qUnCRF.GyPjHm)) {
                                                b4 = 92;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 76404105:
                                            if (!str3.equals("Q4260")) {
                                                b4 = 93;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 76404911:
                                            if (!str3.equals("Q4310")) {
                                                b4 = 94;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 80963634:
                                            if (!str3.equals("V23GB")) {
                                                b4 = 95;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 82882791:
                                            if (!str3.equals("X3_HK")) {
                                                b4 = 96;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 98715550:
                                            if (!str3.equals("i9031")) {
                                                b4 = 97;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 101370885:
                                            if (!str3.equals("l5460")) {
                                                b4 = 98;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 102844228:
                                            if (!str3.equals("le_x6")) {
                                                b4 = 99;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 165221241:
                                            if (!str3.equals("A2016a40")) {
                                                b4 = 100;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 182191441:
                                            if (!str3.equals("CPY83_I00")) {
                                                b4 = 101;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 245388979:
                                            if (!str3.equals("marino_f")) {
                                                b4 = 102;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 287431619:
                                            if (!str3.equals("griffin")) {
                                                b4 = 103;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 307593612:
                                            if (!str3.equals("A7010a48")) {
                                                b4 = 104;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 308517133:
                                            if (!str3.equals("A7020a48")) {
                                                b4 = 105;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 316215098:
                                            if (!str3.equals("TB3-730F")) {
                                                b4 = 106;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 316215116:
                                            if (!str3.equals("TB3-730X")) {
                                                b4 = 107;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 316246811:
                                            if (!str3.equals("TB3-850F")) {
                                                b4 = 108;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 316246818:
                                            if (!str3.equals("TB3-850M")) {
                                                b4 = 109;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 407160593:
                                            if (!str3.equals("Pixi5-10_4G")) {
                                                b4 = 110;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 507412548:
                                            if (!str3.equals(tYcQsJyaojE.hdZoOqSvpEiKQ)) {
                                                b4 = 111;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 793982701:
                                            if (!str3.equals("GIONEE_WBL5708")) {
                                                b4 = 112;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 794038622:
                                            if (!str3.equals("GIONEE_WBL7365")) {
                                                b4 = 113;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 794040393:
                                            if (!str3.equals("GIONEE_WBL7519")) {
                                                b4 = 114;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 835649806:
                                            if (!str3.equals("manning")) {
                                                b4 = 115;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 917340916:
                                            if (!str3.equals("A7000plus")) {
                                                b4 = 116;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 958008161:
                                            if (!str3.equals("j2xlteins")) {
                                                b4 = 117;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 1060579533:
                                            if (!str3.equals("panell_d")) {
                                                b4 = 118;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 1150207623:
                                            if (!str3.equals("LS-5017")) {
                                                b4 = 119;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 1176899427:
                                            if (!str3.equals("itel_S41")) {
                                                b4 = 120;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 1280332038:
                                            if (!str3.equals("hwALE-H")) {
                                                b4 = 121;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 1306947716:
                                            if (!str3.equals("EverStar_S")) {
                                                b4 = 122;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 1349174697:
                                            if (!str3.equals("htc_e56ml_dtul")) {
                                                b4 = 123;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 1522194893:
                                            if (!str3.equals("woods_f")) {
                                                b4 = 124;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 1691543273:
                                            if (!str3.equals("CPH1609")) {
                                                b4 = 125;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 1691544261:
                                            if (!str3.equals("CPH1715")) {
                                                b4 = 126;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 1709443163:
                                            if (!str3.equals("iball8735_9806")) {
                                                b4 = 127;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 1865889110:
                                            if (!str3.equals("santoni")) {
                                                b4 = 128;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 1906253259:
                                            if (!str3.equals("PB2-670M")) {
                                                b4 = 129;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 1977196784:
                                            if (!str3.equals("Infinix-X572")) {
                                                b4 = 130;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 2006372676:
                                            if (!str3.equals(lTGEJfVytU.imkfaJQNBGYMgn)) {
                                                b4 = 131;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 2019281702:
                                            if (!str3.equals("DM-01K")) {
                                                b4 = 132;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 2029784656:
                                            if (!str3.equals("HWBLN-H")) {
                                                b4 = 133;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 2030379515:
                                            if (!str3.equals("HWCAM-H")) {
                                                b4 = 134;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 2033393791:
                                            if (!str3.equals("ASUS_X00AD_2")) {
                                                b4 = 135;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 2047190025:
                                            if (!str3.equals("ELUGA_Note")) {
                                                b4 = 136;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 2047252157:
                                            if (!str3.equals("ELUGA_Prim")) {
                                                b4 = 137;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 2048319463:
                                            if (!str3.equals("HWVNS-H")) {
                                                b4 = 138;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 2048855701:
                                            if (!str3.equals("HWWAS-H")) {
                                                b4 = 139;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        default:
                                            b4 = -1;
                                            break;
                                    }
                                    switch (b4) {
                                        default:
                                            if (str2.equals("JSN-L21")) {
                                            }
                                        case 0:
                                        case 1:
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                        case 9:
                                        case 10:
                                        case 11:
                                        case 12:
                                        case 13:
                                        case 14:
                                        case 15:
                                        case 16:
                                        case 17:
                                        case 18:
                                        case 19:
                                        case 20:
                                        case 21:
                                        case 22:
                                        case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                                        case 24:
                                        case KYCBannerItem.STATUS_DEPRECATE /* 25 */:
                                        case RuntimeVersion.MINOR /* 26 */:
                                        case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                                        case 28:
                                        case 29:
                                        case 30:
                                        case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                                        case 32:
                                        case 33:
                                        case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                                        case 35:
                                        case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                                        case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                                        case 38:
                                        case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                        case 40:
                                        case 41:
                                        case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                                        case 43:
                                        case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                        case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                        case 46:
                                        case 47:
                                        case 48:
                                        case 49:
                                        case 50:
                                        case 51:
                                        case 52:
                                        case 53:
                                        case 54:
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 59:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
                                        case 65:
                                        case 66:
                                        case 67:
                                        case 68:
                                        case 69:
                                        case 70:
                                        case 71:
                                        case 72:
                                        case 73:
                                        case 74:
                                        case 75:
                                        case 76:
                                        case 77:
                                        case 78:
                                        case 79:
                                        case 80:
                                        case 81:
                                        case 82:
                                        case 83:
                                        case 84:
                                        case 85:
                                        case 86:
                                        case 87:
                                        case 88:
                                        case 89:
                                        case 90:
                                        case 91:
                                        case 92:
                                        case 93:
                                        case 94:
                                        case 95:
                                        case 96:
                                        case 97:
                                        case 98:
                                        case 99:
                                        case 100:
                                        case HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS /* 101 */:
                                        case HttpStatusCodesKt.HTTP_PROCESSING /* 102 */:
                                        case HttpStatusCodesKt.HTTP_EARLY_HINTS /* 103 */:
                                        case 104:
                                        case 105:
                                        case 106:
                                        case 107:
                                        case 108:
                                        case 109:
                                        case 110:
                                        case 111:
                                        case 112:
                                        case 113:
                                        case 114:
                                        case 115:
                                        case 116:
                                        case 117:
                                        case 118:
                                        case 119:
                                        case 120:
                                        case 121:
                                        case 122:
                                        case 123:
                                        case 124:
                                        case 125:
                                        case WebSocketProtocol.PAYLOAD_SHORT /* 126 */:
                                        case 127:
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                        case 136:
                                        case 137:
                                        case 138:
                                        case 139:
                                            z = true;
                                            break;
                                    }
                                }
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                z = true;
                                break;
                        }
                    } else {
                        str2 = Build.MODEL;
                        str2.getClass();
                        switch (str2.hashCode()) {
                            case -349662828:
                                if (!str2.equals("AFTJMST12")) {
                                    b2 = -1;
                                } else {
                                    b2 = 0;
                                }
                                break;
                            case -321033677:
                                if (!str2.equals("AFTKMST12")) {
                                    b2 = -1;
                                } else {
                                    b2 = 1;
                                }
                                break;
                            case 2006354:
                                if (!str2.equals("AFTA")) {
                                    b2 = -1;
                                } else {
                                    b2 = 2;
                                }
                                break;
                            case 2006367:
                                if (!str2.equals("AFTN")) {
                                    b2 = -1;
                                } else {
                                    b2 = 3;
                                }
                                break;
                            case 2006371:
                                if (!str2.equals("AFTR")) {
                                    b2 = -1;
                                } else {
                                    b2 = 4;
                                }
                                break;
                            case 1785421873:
                                if (!str2.equals("AFTEU011")) {
                                    b2 = -1;
                                } else {
                                    b2 = 5;
                                }
                                break;
                            case 1785421876:
                                if (!str2.equals("AFTEU014")) {
                                    b2 = -1;
                                } else {
                                    b2 = 6;
                                }
                                break;
                            case 1798172390:
                                if (!str2.equals("AFTSO001")) {
                                    b2 = -1;
                                } else {
                                    b2 = 7;
                                }
                                break;
                            case 2119412532:
                                if (!str2.equals("AFTEUFF014")) {
                                    b2 = -1;
                                } else {
                                    b2 = 8;
                                }
                                break;
                            default:
                                b2 = -1;
                                break;
                        }
                        switch (b2) {
                            default:
                                if (i <= 26) {
                                    str3 = Build.DEVICE;
                                    str3.getClass();
                                    switch (str3.hashCode()) {
                                        case -2144781245:
                                            if (!str3.equals("GIONEE_SWW1609")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 0;
                                            }
                                            break;
                                        case -2144781185:
                                            if (!str3.equals("GIONEE_SWW1627")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 1;
                                            }
                                            break;
                                        case -2144781160:
                                            if (!str3.equals("GIONEE_SWW1631")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 2;
                                            }
                                            break;
                                        case -2097309513:
                                            if (!str3.equals("K50a40")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 3;
                                            }
                                            break;
                                        case -2022874474:
                                            if (!str3.equals("CP8676_I02")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 4;
                                            }
                                            break;
                                        case -1978993182:
                                            if (!str3.equals("NX541J")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 5;
                                            }
                                            break;
                                        case -1978990237:
                                            if (!str3.equals(oAudzpbdOhCI.iABjyKVXDCY)) {
                                                b4 = -1;
                                            } else {
                                                b4 = 6;
                                            }
                                            break;
                                        case -1936688988:
                                            if (!str3.equals("PGN528")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 7;
                                            }
                                            break;
                                        case -1936688066:
                                            if (!str3.equals("PGN610")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 8;
                                            }
                                            break;
                                        case -1936688065:
                                            if (!str3.equals("PGN611")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 9;
                                            }
                                            break;
                                        case -1931988508:
                                            if (!str3.equals("AquaPowerM")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 10;
                                            }
                                            break;
                                        case -1885099851:
                                            if (!str3.equals("RAIJIN")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 11;
                                            }
                                            break;
                                        case -1696512866:
                                            if (!str3.equals("XT1663")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 12;
                                            }
                                            break;
                                        case -1680025915:
                                            if (!str3.equals("ComioS1")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 13;
                                            }
                                            break;
                                        case -1615810839:
                                            if (!str3.equals("Phantom6")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 14;
                                            }
                                            break;
                                        case -1600724499:
                                            if (!str3.equals("pacificrim")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 15;
                                            }
                                            break;
                                        case -1554255044:
                                            if (!str3.equals("vernee_M5")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 16;
                                            }
                                            break;
                                        case -1481772737:
                                            if (!str3.equals("panell_dl")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 17;
                                            }
                                            break;
                                        case -1481772730:
                                            if (!str3.equals("panell_ds")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 18;
                                            }
                                            break;
                                        case -1481772729:
                                            if (!str3.equals("panell_dt")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 19;
                                            }
                                            break;
                                        case -1320080169:
                                            if (!str3.equals(iKBWavCysVP.CMhRNyTGj)) {
                                                b4 = -1;
                                            } else {
                                                b4 = 20;
                                            }
                                            break;
                                        case -1217592143:
                                            if (!str3.equals("BRAVIA_ATV2")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 21;
                                            }
                                            break;
                                        case -1180384755:
                                            if (!str3.equals("iris60")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 22;
                                            }
                                            break;
                                        case -1139198265:
                                            if (!str3.equals("Slate_Pro")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 23;
                                            }
                                            break;
                                        case -1052835013:
                                            if (!str3.equals("namath")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 24;
                                            }
                                            break;
                                        case -993250464:
                                            if (!str3.equals("A10-70F")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 25;
                                            }
                                            break;
                                        case -993250458:
                                            if (!str3.equals("A10-70L")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 26;
                                            }
                                            break;
                                        case -965403638:
                                            if (!str3.equals("s905x018")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 27;
                                            }
                                            break;
                                        case -958336948:
                                            if (!str3.equals("ELUGA_Ray_X")) {
                                                b4 = -1;
                                            }
                                            break;
                                        case -879245230:
                                            if (!str3.equals("tcl_eu")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 29;
                                            }
                                            break;
                                        case -842500323:
                                            if (!str3.equals("nicklaus_f")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 30;
                                            }
                                            break;
                                        case -821392978:
                                            if (!str3.equals("A7000-a")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 31;
                                            }
                                            break;
                                        case -797483286:
                                            if (!str3.equals("SVP-DTV15")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 32;
                                            }
                                            break;
                                        case -794946968:
                                            if (!str3.equals("watson")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 33;
                                            }
                                            break;
                                        case -788334647:
                                            if (!str3.equals("whyred")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 34;
                                            }
                                            break;
                                        case -782144577:
                                            if (!str3.equals("OnePlus5T")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 35;
                                            }
                                            break;
                                        case -575125681:
                                            if (!str3.equals("GiONEE_CBL7513")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 36;
                                            }
                                            break;
                                        case -521118391:
                                            if (!str3.equals("GIONEE_GBL7360")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 37;
                                            }
                                            break;
                                        case -430914369:
                                            if (!str3.equals("Pixi4-7_3G")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 38;
                                            }
                                            break;
                                        case -290434366:
                                            if (!str3.equals("taido_row")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 39;
                                            }
                                            break;
                                        case -282781963:
                                            if (!str3.equals("BLACK-1X")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 40;
                                            }
                                            break;
                                        case -277133239:
                                            if (!str3.equals("Z12_PRO")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 41;
                                            }
                                            break;
                                        case -173639913:
                                            if (!str3.equals("ELUGA_A3_Pro")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 42;
                                            }
                                            break;
                                        case -56598463:
                                            if (!str3.equals("woods_fn")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 43;
                                            }
                                            break;
                                        case 2126:
                                            if (!str3.equals("C1")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 44;
                                            }
                                            break;
                                        case 2564:
                                            if (!str3.equals("Q5")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 45;
                                            }
                                            break;
                                        case 2715:
                                            if (!str3.equals("V1")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 46;
                                            }
                                            break;
                                        case 2719:
                                            if (!str3.equals("V5")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 47;
                                            }
                                            break;
                                        case 3091:
                                            if (!str3.equals("b5")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 48;
                                            }
                                            break;
                                        case 3483:
                                            if (!str3.equals("mh")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 49;
                                            }
                                            break;
                                        case 73405:
                                            if (!str3.equals("JGZ")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 50;
                                            }
                                            break;
                                        case 75537:
                                            if (!str3.equals("M04")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 51;
                                            }
                                            break;
                                        case 75739:
                                            if (!str3.equals("M5c")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 52;
                                            }
                                            break;
                                        case 76779:
                                            if (!str3.equals("MX6")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 53;
                                            }
                                            break;
                                        case 78669:
                                            if (!str3.equals("P85")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 54;
                                            }
                                            break;
                                        case 79305:
                                            if (!str3.equals("PLE")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 55;
                                            }
                                            break;
                                        case 80618:
                                            if (!str3.equals("QX1")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 56;
                                            }
                                            break;
                                        case 88274:
                                            if (!str3.equals("Z80")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 57;
                                            }
                                            break;
                                        case 98846:
                                            if (!str3.equals("cv1")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 58;
                                            }
                                            break;
                                        case 98848:
                                            if (!str3.equals("cv3")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 59;
                                            }
                                            break;
                                        case 99329:
                                            if (!str3.equals("deb")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 60;
                                            }
                                            break;
                                        case 101481:
                                            if (!str3.equals("flo")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 61;
                                            }
                                            break;
                                        case 1513190:
                                            if (!str3.equals("1601")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 62;
                                            }
                                            break;
                                        case 1514184:
                                            if (!str3.equals("1713")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 63;
                                            }
                                            break;
                                        case 1514185:
                                            if (!str3.equals("1714")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 64;
                                            }
                                            break;
                                        case 2133089:
                                            if (!str3.equals("F01H")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 65;
                                            }
                                            break;
                                        case 2133091:
                                            if (!str3.equals("F01J")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 66;
                                            }
                                            break;
                                        case 2133120:
                                            if (!str3.equals("F02H")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 67;
                                            }
                                            break;
                                        case 2133151:
                                            if (!str3.equals("F03H")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 68;
                                            }
                                            break;
                                        case 2133182:
                                            if (!str3.equals("F04H")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 69;
                                            }
                                            break;
                                        case 2133184:
                                            if (!str3.equals("F04J")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 70;
                                            }
                                            break;
                                        case 2436959:
                                            if (!str3.equals("P681")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 71;
                                            }
                                            break;
                                        case 2463773:
                                            if (!str3.equals("Q350")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 72;
                                            }
                                            break;
                                        case 2464648:
                                            if (!str3.equals("Q427")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 73;
                                            }
                                            break;
                                        case 2689555:
                                            if (!str3.equals("XE2X")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 74;
                                            }
                                            break;
                                        case 3154429:
                                            if (!str3.equals(iKBWavCysVP.EFePeFeBEMYQwqA)) {
                                                b4 = -1;
                                            } else {
                                                b4 = 75;
                                            }
                                            break;
                                        case 3284551:
                                            if (!str3.equals("kate")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 76;
                                            }
                                            break;
                                        case 3351335:
                                            if (!str3.equals("mido")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 77;
                                            }
                                            break;
                                        case 3386211:
                                            if (!str3.equals("p212")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 78;
                                            }
                                            break;
                                        case 41325051:
                                            if (!str3.equals("MEIZU_M5")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 79;
                                            }
                                            break;
                                        case 51349633:
                                            if (!str3.equals("601LV")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 80;
                                            }
                                            break;
                                        case 51350594:
                                            if (!str3.equals("602LV")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 81;
                                            }
                                            break;
                                        case 55178625:
                                            if (!str3.equals("Aura_Note_2")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 82;
                                            }
                                            break;
                                        case 61542055:
                                            if (!str3.equals("A1601")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 83;
                                            }
                                            break;
                                        case 65355429:
                                            if (!str3.equals("E5643")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 84;
                                            }
                                            break;
                                        case 66214468:
                                            if (!str3.equals("F3111")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 85;
                                            }
                                            break;
                                        case 66214470:
                                            if (!str3.equals("F3113")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 86;
                                            }
                                            break;
                                        case 66214473:
                                            if (!str3.equals("F3116")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 87;
                                            }
                                            break;
                                        case 66215429:
                                            if (!str3.equals("F3211")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 88;
                                            }
                                            break;
                                        case 66215431:
                                            if (!str3.equals("F3213")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 89;
                                            }
                                            break;
                                        case 66215433:
                                            if (!str3.equals("F3215")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 90;
                                            }
                                            break;
                                        case 66216390:
                                            if (!str3.equals("F3311")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 91;
                                            }
                                            break;
                                        case 76402249:
                                            if (!str3.equals(qUnCRF.GyPjHm)) {
                                                b4 = -1;
                                            } else {
                                                b4 = 92;
                                            }
                                            break;
                                        case 76404105:
                                            if (!str3.equals("Q4260")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 93;
                                            }
                                            break;
                                        case 76404911:
                                            if (!str3.equals("Q4310")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 94;
                                            }
                                            break;
                                        case 80963634:
                                            if (!str3.equals("V23GB")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 95;
                                            }
                                            break;
                                        case 82882791:
                                            if (!str3.equals("X3_HK")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 96;
                                            }
                                            break;
                                        case 98715550:
                                            if (!str3.equals("i9031")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 97;
                                            }
                                            break;
                                        case 101370885:
                                            if (!str3.equals("l5460")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 98;
                                            }
                                            break;
                                        case 102844228:
                                            if (!str3.equals("le_x6")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 99;
                                            }
                                            break;
                                        case 165221241:
                                            if (!str3.equals("A2016a40")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 100;
                                            }
                                            break;
                                        case 182191441:
                                            if (!str3.equals("CPY83_I00")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 101;
                                            }
                                            break;
                                        case 245388979:
                                            if (!str3.equals("marino_f")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 102;
                                            }
                                            break;
                                        case 287431619:
                                            if (!str3.equals("griffin")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 103;
                                            }
                                            break;
                                        case 307593612:
                                            if (!str3.equals("A7010a48")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 104;
                                            }
                                            break;
                                        case 308517133:
                                            if (!str3.equals("A7020a48")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 105;
                                            }
                                            break;
                                        case 316215098:
                                            if (!str3.equals("TB3-730F")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 106;
                                            }
                                            break;
                                        case 316215116:
                                            if (!str3.equals("TB3-730X")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 107;
                                            }
                                            break;
                                        case 316246811:
                                            if (!str3.equals("TB3-850F")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 108;
                                            }
                                            break;
                                        case 316246818:
                                            if (!str3.equals("TB3-850M")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 109;
                                            }
                                            break;
                                        case 407160593:
                                            if (!str3.equals("Pixi5-10_4G")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 110;
                                            }
                                            break;
                                        case 507412548:
                                            if (!str3.equals(tYcQsJyaojE.hdZoOqSvpEiKQ)) {
                                                b4 = -1;
                                            } else {
                                                b4 = 111;
                                            }
                                            break;
                                        case 793982701:
                                            if (!str3.equals("GIONEE_WBL5708")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 112;
                                            }
                                            break;
                                        case 794038622:
                                            if (!str3.equals("GIONEE_WBL7365")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 113;
                                            }
                                            break;
                                        case 794040393:
                                            if (!str3.equals("GIONEE_WBL7519")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 114;
                                            }
                                            break;
                                        case 835649806:
                                            if (!str3.equals("manning")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 115;
                                            }
                                            break;
                                        case 917340916:
                                            if (!str3.equals("A7000plus")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 116;
                                            }
                                            break;
                                        case 958008161:
                                            if (!str3.equals("j2xlteins")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 117;
                                            }
                                            break;
                                        case 1060579533:
                                            if (!str3.equals("panell_d")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 118;
                                            }
                                            break;
                                        case 1150207623:
                                            if (!str3.equals("LS-5017")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 119;
                                            }
                                            break;
                                        case 1176899427:
                                            if (!str3.equals("itel_S41")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 120;
                                            }
                                            break;
                                        case 1280332038:
                                            if (!str3.equals("hwALE-H")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 121;
                                            }
                                            break;
                                        case 1306947716:
                                            if (!str3.equals("EverStar_S")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 122;
                                            }
                                            break;
                                        case 1349174697:
                                            if (!str3.equals("htc_e56ml_dtul")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 123;
                                            }
                                            break;
                                        case 1522194893:
                                            if (!str3.equals("woods_f")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 124;
                                            }
                                            break;
                                        case 1691543273:
                                            if (!str3.equals("CPH1609")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 125;
                                            }
                                            break;
                                        case 1691544261:
                                            if (!str3.equals("CPH1715")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 126;
                                            }
                                            break;
                                        case 1709443163:
                                            if (!str3.equals("iball8735_9806")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 127;
                                            }
                                            break;
                                        case 1865889110:
                                            if (!str3.equals("santoni")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 128;
                                            }
                                            break;
                                        case 1906253259:
                                            if (!str3.equals("PB2-670M")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 129;
                                            }
                                            break;
                                        case 1977196784:
                                            if (!str3.equals("Infinix-X572")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 130;
                                            }
                                            break;
                                        case 2006372676:
                                            if (!str3.equals(lTGEJfVytU.imkfaJQNBGYMgn)) {
                                                b4 = -1;
                                            } else {
                                                b4 = 131;
                                            }
                                            break;
                                        case 2019281702:
                                            if (!str3.equals("DM-01K")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 132;
                                            }
                                            break;
                                        case 2029784656:
                                            if (!str3.equals("HWBLN-H")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 133;
                                            }
                                            break;
                                        case 2030379515:
                                            if (!str3.equals("HWCAM-H")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 134;
                                            }
                                            break;
                                        case 2033393791:
                                            if (!str3.equals("ASUS_X00AD_2")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 135;
                                            }
                                            break;
                                        case 2047190025:
                                            if (!str3.equals("ELUGA_Note")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 136;
                                            }
                                            break;
                                        case 2047252157:
                                            if (!str3.equals("ELUGA_Prim")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 137;
                                            }
                                            break;
                                        case 2048319463:
                                            if (!str3.equals("HWVNS-H")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 138;
                                            }
                                            break;
                                        case 2048855701:
                                            if (!str3.equals("HWWAS-H")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 139;
                                            }
                                            break;
                                        default:
                                            b4 = -1;
                                            break;
                                    }
                                    switch (b4) {
                                        default:
                                            if (str2.equals("JSN-L21")) {
                                            }
                                        case 0:
                                        case 1:
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                        case 9:
                                        case 10:
                                        case 11:
                                        case 12:
                                        case 13:
                                        case 14:
                                        case 15:
                                        case 16:
                                        case 17:
                                        case 18:
                                        case 19:
                                        case 20:
                                        case 21:
                                        case 22:
                                        case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                                        case 24:
                                        case KYCBannerItem.STATUS_DEPRECATE /* 25 */:
                                        case RuntimeVersion.MINOR /* 26 */:
                                        case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                                        case 28:
                                        case 29:
                                        case 30:
                                        case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                                        case 32:
                                        case 33:
                                        case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                                        case 35:
                                        case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                                        case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                                        case 38:
                                        case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                        case 40:
                                        case 41:
                                        case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                                        case 43:
                                        case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                        case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                        case 46:
                                        case 47:
                                        case 48:
                                        case 49:
                                        case 50:
                                        case 51:
                                        case 52:
                                        case 53:
                                        case 54:
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 59:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
                                        case 65:
                                        case 66:
                                        case 67:
                                        case 68:
                                        case 69:
                                        case 70:
                                        case 71:
                                        case 72:
                                        case 73:
                                        case 74:
                                        case 75:
                                        case 76:
                                        case 77:
                                        case 78:
                                        case 79:
                                        case 80:
                                        case 81:
                                        case 82:
                                        case 83:
                                        case 84:
                                        case 85:
                                        case 86:
                                        case 87:
                                        case 88:
                                        case 89:
                                        case 90:
                                        case 91:
                                        case 92:
                                        case 93:
                                        case 94:
                                        case 95:
                                        case 96:
                                        case 97:
                                        case 98:
                                        case 99:
                                        case 100:
                                        case HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS /* 101 */:
                                        case HttpStatusCodesKt.HTTP_PROCESSING /* 102 */:
                                        case HttpStatusCodesKt.HTTP_EARLY_HINTS /* 103 */:
                                        case 104:
                                        case 105:
                                        case 106:
                                        case 107:
                                        case 108:
                                        case 109:
                                        case 110:
                                        case 111:
                                        case 112:
                                        case 113:
                                        case 114:
                                        case 115:
                                        case 116:
                                        case 117:
                                        case 118:
                                        case 119:
                                        case 120:
                                        case 121:
                                        case 122:
                                        case 123:
                                        case 124:
                                        case 125:
                                        case WebSocketProtocol.PAYLOAD_SHORT /* 126 */:
                                        case 127:
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                        case 136:
                                        case 137:
                                        case 138:
                                        case 139:
                                            z = true;
                                            break;
                                    }
                                }
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                z = true;
                                break;
                        }
                    }
                    J1 = z;
                    I1 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return J1;
    }
}
