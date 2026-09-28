package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.media3.exoplayer.l;
import com.google.protobuf.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.concurrent.Executor;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes.dex */
public final class pid extends fpu implements l.a {
    public static final f3z<Integer> k = new pl8(new fid());
    public final Object c;
    public final Context d;
    public final zf.b e;
    public d f;
    public Thread g;
    public f h;
    public r21 i;
    public Boolean j;

    public static final class a extends h<a> implements Comparable<a> {
        public final int A;
        public final boolean B;
        public final boolean C;
        public final int D;
        public final int E;
        public final boolean F;
        public final int G;
        public final int H;
        public final int I;
        public final int J;
        public final boolean K;
        public final boolean L;
        public final boolean M;
        public final int e;
        public final boolean f;
        public final String i;
        public final d v;
        public final boolean w;
        public final int y;
        public final int z;

        /* JADX WARN: Code duplicated, block: B:111:0x0173  */
        /* JADX WARN: Code duplicated, block: B:32:0x0077  */
        /* JADX WARN: Code duplicated, block: B:85:0x012d  */
        /* JADX WARN: Code duplicated, block: B:86:0x012f  */
        /* JADX WARN: Code duplicated, block: B:89:0x0138  */
        /* JADX WARN: Code duplicated, block: B:90:0x013a  */
        public a(int i, jjg0 jjg0Var, int i2, d dVar, int i3, boolean z, oid oidVar, int i4) {
            int i5;
            int i6;
            boolean z2;
            int i7;
            boolean z3;
            boolean z4;
            boolean z5;
            rjg0.a aVar;
            super(i, jjg0Var, i2);
            this.v = dVar;
            boolean z6 = dVar.z;
            pcn<String> pcnVar = dVar.n;
            pcn<String> pcnVar2 = dVar.k;
            int i8 = z6 ? 24 : 16;
            int i9 = 0;
            this.B = false;
            this.i = pid.k(this.d.d);
            this.w = l.g(i3, false);
            int i10 = 0;
            while (true) {
                int size = pcnVar2.size();
                i5 = Reader.READ_DONE;
                if (i10 >= size) {
                    i6 = 0;
                    i10 = Integer.MAX_VALUE;
                    break;
                } else {
                    i6 = pid.i(this.d, pcnVar2.get(i10), false);
                    if (i6 > 0) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            this.z = i10;
            this.y = i6;
            int i11 = this.d.f;
            this.A = (i11 == 0 || i11 != 0) ? Integer.bitCount(0) : Integer.MAX_VALUE;
            androidx.media3.common.a aVar2 = this.d;
            int i12 = aVar2.f;
            this.C = i12 == 0 || (i12 & 1) != 0;
            this.F = (aVar2.e & 1) != 0;
            String str = aVar2.n;
            if (str != null) {
                switch (str) {
                    case "audio/eac3-joc":
                    case "audio/ac4":
                    case "audio/iamf":
                        z2 = true;
                        break;
                    default:
                        z2 = false;
                        break;
                }
            } else {
                z2 = false;
            }
            this.M = z2;
            int i13 = aVar2.F;
            this.G = i13;
            this.H = aVar2.G;
            int i14 = aVar2.j;
            this.I = i14;
            this.f = (i14 == -1 || i14 <= dVar.m) && (i13 == -1 || i13 <= dVar.l) && oidVar.apply(aVar2);
            String[] strArrSplit = Resources.getSystem().getConfiguration().getLocales().toLanguageTags().split(",", -1);
            for (int i15 = 0; i15 < strArrSplit.length; i15++) {
                strArrSplit[i15] = jrh0.P(strArrSplit[i15]);
            }
            int i16 = 0;
            while (true) {
                if (i16 < strArrSplit.length) {
                    i7 = pid.i(this.d, strArrSplit[i16], false);
                    if (i7 <= 0) {
                        i16++;
                    }
                } else {
                    i7 = 0;
                    i16 = Integer.MAX_VALUE;
                }
            }
            this.D = i16;
            this.E = i7;
            for (int i17 = 0; i17 < pcnVar.size(); i17++) {
                String str2 = this.d.n;
                if (str2 != null && str2.equals(pcnVar.get(i17))) {
                    i5 = i17;
                    this.J = i5;
                    if ((i3 & 384) == 128) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    this.K = z3;
                    if ((i3 & 64) == 64) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    this.L = z4;
                    boolean z7 = this.f;
                    d dVar2 = this.v;
                    z5 = dVar2.B;
                    aVar = dVar2.o;
                    if (l.g(i3, z5) && (z7 || dVar2.y)) {
                        aVar.getClass();
                        if (l.g(i3, false) || !z7 || this.d.j == -1 || dVar2.s || ((!dVar2.C && z) || (i8 & i3) == 0)) {
                            i9 = 1;
                        } else {
                            i9 = 2;
                        }
                    }
                    this.e = i9;
                }
            }
            this.J = i5;
            if ((i3 & 384) == 128) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.K = z3;
            if ((i3 & 64) == 64) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.L = z4;
            boolean z8 = this.f;
            d dVar3 = this.v;
            z5 = dVar3.B;
            aVar = dVar3.o;
            if (l.g(i3, z5)) {
                aVar.getClass();
                if (l.g(i3, false)) {
                    i9 = 1;
                } else {
                    i9 = 1;
                }
            }
            this.e = i9;
        }

        @Override // pid.h
        public final int a() {
            return this.e;
        }

        @Override // pid.h
        public final boolean b(h hVar) {
            int i;
            String str;
            a aVar = (a) hVar;
            androidx.media3.common.a aVar2 = aVar.d;
            this.v.getClass();
            androidx.media3.common.a aVar3 = this.d;
            int i2 = aVar3.F;
            if (i2 == -1 || i2 != aVar2.F) {
                return false;
            }
            return (this.B || ((str = aVar3.n) != null && TextUtils.equals(str, aVar2.n))) && (i = aVar3.G) != -1 && i == aVar2.G && this.K == aVar.K && this.L == aVar.L;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final int compareTo(a aVar) {
            boolean z = this.w;
            boolean z2 = this.f;
            Object objA = (z2 && z) ? pid.k : pid.k.a();
            boolean z3 = aVar.w;
            int i = aVar.I;
            rl8 rl8VarC = rl8.a.c(z, z3);
            Integer numValueOf = Integer.valueOf(this.z);
            Integer numValueOf2 = Integer.valueOf(aVar.z);
            zex.a.getClass();
            xo50 xo50Var = xo50.a;
            rl8 rl8VarB = rl8VarC.b(numValueOf, numValueOf2, xo50Var).a(this.y, aVar.y).a(this.A, aVar.A).c(this.F, aVar.F).c(this.C, aVar.C).b(Integer.valueOf(this.D), Integer.valueOf(aVar.D), xo50Var).a(this.E, aVar.E).c(z2, aVar.f).b(Integer.valueOf(this.J), Integer.valueOf(aVar.J), xo50Var);
            this.v.getClass();
            rl8 rl8VarB2 = rl8VarB.c(this.K, aVar.K).c(this.L, aVar.L).c(this.M, aVar.M).b(Integer.valueOf(this.G), Integer.valueOf(aVar.G), objA).b(Integer.valueOf(this.H), Integer.valueOf(aVar.H), objA);
            if (Objects.equals(this.i, aVar.i)) {
                rl8VarB2 = rl8VarB2.b(Integer.valueOf(this.I), Integer.valueOf(i), objA);
            }
            return rl8VarB2.e();
        }
    }

    public static final class b extends h<b> implements Comparable<b> {
        public final int e;
        public final int f;

        public b(int i, jjg0 jjg0Var, int i2, d dVar, int i3) {
            int i4;
            super(i, jjg0Var, i2);
            this.e = l.g(i3, dVar.B) ? 1 : 0;
            androidx.media3.common.a aVar = this.d;
            int i5 = aVar.u;
            int i6 = -1;
            if (i5 != -1 && (i4 = aVar.v) != -1) {
                i6 = i5 * i4;
            }
            this.f = i6;
        }

        @Override // pid.h
        public final int a() {
            return this.e;
        }

        @Override // pid.h
        public final boolean b(h hVar) {
            return false;
        }

        @Override // java.lang.Comparable
        public final int compareTo(b bVar) {
            return Integer.compare(this.f, bVar.f);
        }
    }

    public static final class c implements Comparable<c> {
        public final boolean a;
        public final boolean b;

        public c(androidx.media3.common.a aVar, int i) {
            this.a = (aVar.e & 1) != 0;
            this.b = l.g(i, false);
        }

        @Override // java.lang.Comparable
        public final int compareTo(c cVar) {
            c cVar2 = cVar;
            return rl8.a.c(this.b, cVar2.b).c(this.a, cVar2.a).e();
        }
    }

    public static final class e {
        static {
            jrh0.J(0);
            jrh0.J(1);
            jrh0.J(2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && e.class == obj.getClass()) {
                if (Arrays.equals((int[]) null, (int[]) null)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode((int[]) null) * 31;
        }
    }

    public static class f {
        public final Spatializer a;
        public final boolean b;
        public final Handler c;
        public final a d;

        public class a implements Spatializer$OnSpatializerStateChangedListener {
            public final /* synthetic */ pid a;

            public a(pid pidVar) {
                this.a = pidVar;
            }

            public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
                f3z<Integer> f3zVar = pid.k;
                this.a.j();
            }

            public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
                f3z<Integer> f3zVar = pid.k;
                this.a.j();
            }
        }

        public f(Context context, pid pidVar, Boolean bool) {
            AudioManager audioManagerB = context == null ? null : g31.b(context);
            if (audioManagerB == null || (bool != null && bool.booleanValue())) {
                this.a = null;
                this.b = false;
                this.c = null;
                this.d = null;
                return;
            }
            Spatializer spatializer = audioManagerB.getSpatializer();
            this.a = spatializer;
            this.b = spatializer.getImmersiveAudioLevel() != 0;
            a aVar = new a(pidVar);
            this.d = aVar;
            Looper looperMyLooper = Looper.myLooper();
            ly0.g(looperMyLooper);
            final Handler handler = new Handler(looperMyLooper);
            this.c = handler;
            spatializer.addOnSpatializerStateChangedListener(new Executor() { // from class: qid
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    handler.post(runnable);
                }
            }, aVar);
        }

        public final boolean a(r21 r21Var, androidx.media3.common.a aVar) {
            String str = aVar.n;
            int i = aVar.F;
            if (Objects.equals(str, "audio/eac3-joc")) {
                if (i == 16) {
                    i = 12;
                }
            } else if (Objects.equals(str, "audio/iamf")) {
                if (i == -1) {
                    i = 6;
                }
            } else if (Objects.equals(str, "audio/ac4") && (i == 18 || i == 21)) {
                i = 24;
            }
            int iS = jrh0.s(i);
            if (iS == 0) {
                return false;
            }
            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(iS);
            int i2 = aVar.G;
            if (i2 != -1) {
                channelMask.setSampleRate(i2);
            }
            Spatializer spatializer = this.a;
            spatializer.getClass();
            return spatializer.canBeSpatialized(r21Var.a().a, channelMask.build());
        }

        public final boolean b() {
            Spatializer spatializer = this.a;
            spatializer.getClass();
            return spatializer.isAvailable();
        }

        public final boolean c() {
            Spatializer spatializer = this.a;
            spatializer.getClass();
            return spatializer.isEnabled();
        }

        public final void d() {
            a aVar;
            Handler handler;
            Spatializer spatializer = this.a;
            if (spatializer == null || (aVar = this.d) == null || (handler = this.c) == null) {
                return;
            }
            spatializer.removeOnSpatializerStateChangedListener(aVar);
            handler.removeCallbacksAndMessages(null);
        }
    }

    public static final class g extends h<g> implements Comparable<g> {
        public final int A;
        public final boolean B;
        public final int e;
        public final boolean f;
        public final boolean i;
        public final boolean v;
        public final int w;
        public final int y;
        public final int z;

        public g(int i, jjg0 jjg0Var, int i2, d dVar, int i3, String str, String str2) {
            int iBitCount;
            int i4;
            super(i, jjg0Var, i2);
            int i5 = 0;
            this.f = l.g(i3, false);
            int i6 = this.d.e;
            int i7 = dVar.r;
            pcn<String> pcnVar = dVar.p;
            int i8 = i6 & (~i7);
            this.i = (i8 & 1) != 0;
            this.v = (i8 & 2) != 0;
            pcn<String> pcnVarN = str2 != null ? pcn.n(str2) : pcnVar.isEmpty() ? pcn.n("") : pcnVar;
            int i9 = 0;
            while (true) {
                int size = pcnVarN.size();
                iBitCount = Reader.READ_DONE;
                if (i9 >= size) {
                    i4 = 0;
                    i9 = Integer.MAX_VALUE;
                    break;
                } else {
                    i4 = pid.i(this.d, pcnVarN.get(i9), false);
                    if (i4 > 0) {
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            this.w = i9;
            this.y = i4;
            int i10 = str2 != null ? 1088 : 0;
            int i11 = this.d.f;
            f3z<Integer> f3zVar = pid.k;
            iBitCount = (i11 == 0 || i11 != i10) ? Integer.bitCount(i10 & i11) : iBitCount;
            this.z = iBitCount;
            this.B = (1088 & this.d.f) != 0;
            int i12 = pid.i(this.d, str, pid.k(str) == null);
            this.A = i12;
            boolean z = i4 > 0 || (pcnVar.isEmpty() && iBitCount > 0) || this.i || (this.v && i12 > 0);
            if (l.g(i3, dVar.B) && z) {
                i5 = 1;
            }
            this.e = i5;
        }

        @Override // pid.h
        public final int a() {
            return this.e;
        }

        @Override // pid.h
        public final boolean b(h hVar) {
            return false;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final int compareTo(g gVar) {
            rl8 rl8VarC = rl8.a.c(this.f, gVar.f);
            Integer numValueOf = Integer.valueOf(this.w);
            Integer numValueOf2 = Integer.valueOf(gVar.w);
            Object obj = zex.a;
            obj.getClass();
            xo50 xo50Var = xo50.a;
            rl8 rl8VarB = rl8VarC.b(numValueOf, numValueOf2, xo50Var);
            int i = gVar.y;
            int i2 = this.y;
            rl8 rl8VarA = rl8VarB.a(i2, i);
            int i3 = gVar.z;
            int i4 = this.z;
            rl8 rl8VarC2 = rl8VarA.a(i4, i3).c(this.i, gVar.i);
            Boolean boolValueOf = Boolean.valueOf(this.v);
            Boolean boolValueOf2 = Boolean.valueOf(gVar.v);
            if (i2 != 0) {
                obj = xo50Var;
            }
            rl8 rl8VarA2 = rl8VarC2.b(boolValueOf, boolValueOf2, obj).a(this.A, gVar.A);
            if (i4 == 0) {
                rl8VarA2 = rl8VarA2.d(this.B, gVar.B);
            }
            return rl8VarA2.e();
        }
    }

    public static abstract class h<T extends h<T>> {
        public final int a;
        public final jjg0 b;
        public final int c;
        public final androidx.media3.common.a d;

        public interface a<T extends h<T>> {
            c150 a(int i, jjg0 jjg0Var, int[] iArr);
        }

        public h(int i, jjg0 jjg0Var, int i2) {
            this.a = i;
            this.b = jjg0Var;
            this.c = i2;
            this.d = jjg0Var.d[i2];
        }

        public abstract int a();

        public abstract boolean b(T t);
    }

    public static final class i extends h<i> {
        public final int A;
        public final int B;
        public final int C;
        public final int D;
        public final boolean E;
        public final int F;
        public final boolean G;
        public final int H;
        public final boolean I;
        public final boolean J;
        public final int K;
        public final boolean e;
        public final d f;
        public final boolean i;
        public final boolean v;
        public final boolean w;
        public final int y;
        public final int z;

        /* JADX WARN: Code duplicated, block: B:25:0x0044  */
        /* JADX WARN: Code duplicated, block: B:42:0x006a  */
        /* JADX WARN: Code duplicated, block: B:99:0x0127  */
        public i(int i, jjg0 jjg0Var, int i2, d dVar, int i3, String str, int i4, boolean z) {
            boolean z2;
            boolean z3;
            int i5;
            int i6;
            int i7;
            int i8;
            androidx.media3.common.a aVar;
            int i9;
            int i10;
            int i11;
            androidx.media3.common.a aVar2;
            int i12;
            int i13;
            int i14;
            super(i, jjg0Var, i2);
            this.f = dVar;
            boolean z4 = dVar.x;
            pcn<String> pcnVar = dVar.i;
            pcn<String> pcnVar2 = dVar.j;
            int i15 = z4 ? 24 : 16;
            int i16 = 0;
            this.G = false;
            if (!z || (((i12 = (aVar2 = this.d).u) != -1 && i12 > dVar.a) || ((i13 = aVar2.v) != -1 && i13 > dVar.b))) {
                z2 = false;
            } else {
                float f = aVar2.y;
                if ((f == -1.0f || f <= dVar.c) && ((i14 = aVar2.j) == -1 || i14 <= dVar.d)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            this.e = z2;
            if (!z || (((i9 = (aVar = this.d).u) != -1 && i9 < 0) || ((i10 = aVar.v) != -1 && i10 < 0))) {
                z3 = false;
            } else {
                float f2 = aVar.y;
                if ((f2 == -1.0f || f2 >= 0.0f) && ((i11 = aVar.j) == -1 || i11 >= 0)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            }
            this.i = z3;
            this.v = l.g(i3, false);
            androidx.media3.common.a aVar3 = this.d;
            float f3 = aVar3.y;
            this.w = f3 != -1.0f && f3 >= 10.0f;
            this.y = aVar3.j;
            int i17 = aVar3.u;
            this.z = (i17 == -1 || (i8 = aVar3.v) == -1) ? -1 : i17 * i8;
            int i18 = 0;
            while (true) {
                int size = pcnVar2.size();
                i5 = Reader.READ_DONE;
                if (i18 >= size) {
                    i6 = 0;
                    i18 = Integer.MAX_VALUE;
                    break;
                } else {
                    i6 = pid.i(this.d, pcnVar2.get(i18), false);
                    if (i6 > 0) {
                        break;
                    } else {
                        i18++;
                    }
                }
            }
            this.B = i18;
            this.C = i6;
            int i19 = this.d.f;
            f3z<Integer> f3zVar = pid.k;
            this.D = (i19 == 0 || i19 != 0) ? Integer.bitCount(0) : Integer.MAX_VALUE;
            int i20 = this.d.f;
            this.E = i20 == 0 || (i20 & 1) != 0;
            this.F = pid.i(this.d, str, pid.k(str) == null);
            for (int i21 = 0; i21 < pcnVar.size(); i21++) {
                String str2 = this.d.n;
                if (str2 != null && str2.equals(pcnVar.get(i21))) {
                    i5 = i21;
                    break;
                }
            }
            this.A = i5;
            this.I = (i3 & 384) == 128;
            this.J = (i3 & 64) == 64;
            androidx.media3.common.a aVar4 = this.d;
            String str3 = aVar4.n;
            if (str3 != null) {
                i7 = 4;
                switch (str3) {
                    case "video/dolby-vision":
                        i7 = 5;
                        break;
                    case "video/av01":
                        break;
                    case "video/hevc":
                        i7 = 3;
                        break;
                    case "video/avc":
                        i7 = 1;
                        break;
                    case "video/x-vnd.on2.vp9":
                        i7 = 2;
                        break;
                    default:
                        i7 = 0;
                        break;
                }
            } else {
                i7 = 0;
            }
            this.K = i7;
            boolean z5 = this.e;
            d dVar2 = this.f;
            if ((aVar4.f & Http2.INITIAL_MAX_FRAME_SIZE) == 0 && l.g(i3, dVar2.B) && (z5 || dVar2.w)) {
                i16 = (!l.g(i3, false) || !this.i || !z5 || aVar4.j == -1 || dVar2.s || (i15 & i3) == 0) ? 1 : 2;
            }
            this.H = i16;
        }

        public static int c(i iVar, i iVar2) {
            rl8 rl8VarC = rl8.a.c(iVar.v, iVar2.v);
            Integer numValueOf = Integer.valueOf(iVar.B);
            Integer numValueOf2 = Integer.valueOf(iVar2.B);
            zex.a.getClass();
            xo50 xo50Var = xo50.a;
            rl8 rl8VarB = rl8VarC.b(numValueOf, numValueOf2, xo50Var).a(iVar.C, iVar2.C).a(iVar.D, iVar2.D).c(iVar.E, iVar2.E).a(iVar.F, iVar2.F).c(iVar.w, iVar2.w).c(iVar.e, iVar2.e).c(iVar.i, iVar2.i).b(Integer.valueOf(iVar.A), Integer.valueOf(iVar2.A), xo50Var);
            boolean z = iVar.I;
            rl8 rl8VarC2 = rl8VarB.c(z, iVar2.I);
            boolean z2 = iVar.J;
            rl8 rl8VarC3 = rl8VarC2.c(z2, iVar2.J);
            if (z && z2) {
                rl8VarC3 = rl8VarC3.a(iVar.K, iVar2.K);
            }
            return rl8VarC3.e();
        }

        @Override // pid.h
        public final int a() {
            return this.H;
        }

        @Override // pid.h
        public final boolean b(h hVar) {
            i iVar = (i) hVar;
            if (!this.G && !Objects.equals(this.d.n, iVar.d.n)) {
                return false;
            }
            this.f.getClass();
            return this.I == iVar.I && this.J == iVar.J;
        }
    }

    public pid(Context context, zf.b bVar) {
        d dVar = d.F;
        this.c = new Object();
        this.d = context != null ? context.getApplicationContext() : null;
        this.e = bVar;
        if (dVar != null) {
            this.f = dVar;
        } else {
            dVar.getClass();
            d.a aVar = new d.a(dVar);
            aVar.c(dVar);
            dVar = new d(aVar);
            this.f = dVar;
        }
        this.i = r21.d;
        if (dVar.A && context == null) {
            cft.g("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static void h(ljg0 ljg0Var, rjg0 rjg0Var, HashMap map) {
        for (int i2 = 0; i2 < ljg0Var.a; i2++) {
            qjg0 qjg0Var = rjg0Var.t.get(ljg0Var.a(i2));
            if (qjg0Var != null) {
                jjg0 jjg0Var = qjg0Var.a;
                qjg0 qjg0Var2 = (qjg0) map.get(Integer.valueOf(jjg0Var.c));
                if (qjg0Var2 == null || (qjg0Var2.b.isEmpty() && !qjg0Var.b.isEmpty())) {
                    map.put(Integer.valueOf(jjg0Var.c), qjg0Var);
                }
            }
        }
    }

    public static int i(androidx.media3.common.a aVar, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(aVar.d)) {
            return 4;
        }
        String strK = k(str);
        String strK2 = k(aVar.d);
        if (strK2 == null || strK == null) {
            return (z && strK2 == null) ? 1 : 0;
        }
        if (strK2.startsWith(strK) || strK.startsWith(strK2)) {
            return 3;
        }
        String str2 = jrh0.a;
        return strK2.split("-", 2)[0].equals(strK.split("-", 2)[0]) ? 2 : 0;
    }

    public static String k(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static Pair l(int i2, fpu.a aVar, int[][][] iArr, h.a aVar2, Comparator comparator) {
        int i3;
        RandomAccess randomAccessN;
        fpu.a aVar3 = aVar;
        ArrayList arrayList = new ArrayList();
        int i4 = aVar3.a;
        int i5 = 0;
        while (i5 < i4) {
            if (i2 == aVar3.b[i5]) {
                ljg0 ljg0Var = aVar3.c[i5];
                for (int i6 = 0; i6 < ljg0Var.a; i6++) {
                    jjg0 jjg0VarA = ljg0Var.a(i6);
                    c150 c150VarA = aVar2.a(i5, jjg0VarA, iArr[i5][i6]);
                    int i7 = jjg0VarA.a;
                    boolean[] zArr = new boolean[i7];
                    int i8 = 0;
                    while (i8 < i7) {
                        h hVar = (h) c150VarA.get(i8);
                        int iA = hVar.a();
                        if (zArr[i8] || iA == 0) {
                            i3 = i4;
                        } else {
                            if (iA == 1) {
                                randomAccessN = pcn.n(hVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(hVar);
                                int i9 = i8 + 1;
                                while (i9 < i7) {
                                    h hVar2 = (h) c150VarA.get(i9);
                                    int i10 = i4;
                                    if (hVar2.a() == 2 && hVar.b(hVar2)) {
                                        arrayList2.add(hVar2);
                                        zArr[i9] = true;
                                    }
                                    i9++;
                                    i4 = i10;
                                }
                                randomAccessN = arrayList2;
                            }
                            i3 = i4;
                            arrayList.add(randomAccessN);
                        }
                        i8++;
                        i4 = i3;
                    }
                }
            }
            i5++;
            aVar3 = aVar;
            i4 = i4;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i11 = 0; i11 < list.size(); i11++) {
            iArr2[i11] = ((h) list.get(i11)).c;
        }
        h hVar3 = (h) list.get(0);
        return Pair.create(new oyg.a(0, hVar3.b, iArr2), Integer.valueOf(hVar3.a));
    }

    @Override // defpackage.tjg0
    public final rjg0 a() {
        d dVar;
        synchronized (this.c) {
            dVar = this.f;
        }
        return dVar;
    }

    @Override // defpackage.tjg0
    public final void d() {
        f fVar;
        synchronized (this.c) {
            try {
                Thread thread = this.g;
                if (thread != null) {
                    ly0.e("DefaultTrackSelector is accessed on the wrong thread.", thread == Thread.currentThread());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (fVar = this.h) != null) {
            fVar.d();
            this.h = null;
        }
        super.d();
    }

    @Override // defpackage.tjg0
    public final void f(r21 r21Var) {
        if (this.i.equals(r21Var)) {
            return;
        }
        this.i = r21Var;
        j();
    }

    @Override // defpackage.tjg0
    public final void g(rjg0 rjg0Var) {
        d dVar;
        if (rjg0Var instanceof d) {
            m((d) rjg0Var);
        }
        synchronized (this.c) {
            dVar = this.f;
        }
        d.a aVar = new d.a(dVar);
        aVar.c(rjg0Var);
        m(new d(aVar));
    }

    public final void j() {
        boolean z;
        androidx.media3.exoplayer.e eVar;
        f fVar;
        synchronized (this.c) {
            try {
                z = this.f.A && Build.VERSION.SDK_INT >= 32 && (fVar = this.h) != null && fVar.b;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z || (eVar = this.a) == null) {
            return;
        }
        eVar.v.k(10);
    }

    public final void m(d dVar) {
        boolean zEquals;
        synchronized (this.c) {
            zEquals = this.f.equals(dVar);
            this.f = dVar;
        }
        if (zEquals) {
            return;
        }
        if (dVar.A && this.d == null) {
            cft.g("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        androidx.media3.exoplayer.e eVar = this.a;
        if (eVar != null) {
            eVar.v.k(10);
        }
    }

    @Override // defpackage.tjg0
    public final l.a b() {
        return this;
    }

    public pid(Context context) {
        this(context, new zf.b());
    }

    public static final class d extends rjg0 {
        public static final d F = new d(new a());
        public final boolean A;
        public final boolean B;
        public final boolean C;
        public final SparseArray<Map<ljg0, e>> D;
        public final SparseBooleanArray E;
        public final boolean w;
        public final boolean x;
        public final boolean y;
        public final boolean z;

        static {
            jf.a(1000, WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY, 1002, 1003, 1004);
            jf.a(WebSocketProtocol.CLOSE_NO_STATUS_CODE, 1006, 1007, 1008, 1009);
            jf.a(1010, 1011, 1012, 1013, 1014);
            jrh0.J(1015);
            jrh0.J(1016);
            jrh0.J(1017);
            jrh0.J(1018);
        }

        public d(a aVar) {
            super(aVar);
            this.w = aVar.v;
            this.x = aVar.w;
            this.y = aVar.x;
            this.z = aVar.y;
            this.A = aVar.z;
            this.B = aVar.A;
            this.C = aVar.B;
            this.D = aVar.C;
            this.E = aVar.D;
        }

        @Override // defpackage.rjg0
        public final rjg0.b a() {
            return new a(this);
        }

        @Override // defpackage.rjg0
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class == obj.getClass()) {
                d dVar = (d) obj;
                if (super.equals(dVar) && this.w == dVar.w && this.x == dVar.x && this.y == dVar.y && this.z == dVar.z && this.A == dVar.A && this.B == dVar.B && this.C == dVar.C) {
                    SparseBooleanArray sparseBooleanArray = dVar.E;
                    SparseBooleanArray sparseBooleanArray2 = this.E;
                    int size = sparseBooleanArray2.size();
                    if (sparseBooleanArray.size() == size) {
                        for (int i = 0; i < size; i++) {
                            if (sparseBooleanArray.indexOfKey(sparseBooleanArray2.keyAt(i)) >= 0) {
                            }
                        }
                        SparseArray<Map<ljg0, e>> sparseArray = dVar.D;
                        SparseArray<Map<ljg0, e>> sparseArray2 = this.D;
                        int size2 = sparseArray2.size();
                        if (sparseArray.size() == size2) {
                            for (int i2 = 0; i2 < size2; i2++) {
                                int iIndexOfKey = sparseArray.indexOfKey(sparseArray2.keyAt(i2));
                                if (iIndexOfKey >= 0) {
                                    Map<ljg0, e> mapValueAt = sparseArray2.valueAt(i2);
                                    Map<ljg0, e> mapValueAt2 = sparseArray.valueAt(iIndexOfKey);
                                    if (mapValueAt2.size() == mapValueAt.size()) {
                                        for (Map.Entry<ljg0, e> entry : mapValueAt.entrySet()) {
                                            ljg0 key = entry.getKey();
                                            if (!mapValueAt2.containsKey(key) || !Objects.equals(entry.getValue(), mapValueAt2.get(key))) {
                                            }
                                        }
                                    }
                                }
                            }
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        @Override // defpackage.rjg0
        public final int hashCode() {
            return (((((((((((((((super.hashCode() + 31) * 31) + (this.w ? 1 : 0)) * 961) + (this.x ? 1 : 0)) * 961) + (this.y ? 1 : 0)) * 28629151) + (this.z ? 1 : 0)) * 31) + (this.A ? 1 : 0)) * 31) + (this.B ? 1 : 0)) * 961) + (this.C ? 1 : 0)) * 31;
        }

        public static final class a extends rjg0.b {
            public final boolean A;
            public final boolean B;
            public final SparseArray<Map<ljg0, e>> C;
            public final SparseBooleanArray D;
            public final boolean v;
            public final boolean w;
            public final boolean x;
            public final boolean y;
            public final boolean z;

            public a(d dVar) {
                c(dVar);
                this.v = dVar.w;
                this.w = dVar.x;
                this.x = dVar.y;
                this.y = dVar.z;
                this.z = dVar.A;
                this.A = dVar.B;
                this.B = dVar.C;
                SparseArray<Map<ljg0, e>> sparseArray = dVar.D;
                SparseArray<Map<ljg0, e>> sparseArray2 = new SparseArray<>();
                for (int i = 0; i < sparseArray.size(); i++) {
                    sparseArray2.put(sparseArray.keyAt(i), new HashMap(sparseArray.valueAt(i)));
                }
                this.C = sparseArray2;
                this.D = dVar.E.clone();
            }

            @Override // rjg0.b
            public final rjg0 a() {
                return new d(this);
            }

            @Override // rjg0.b
            public final rjg0.b b(int i) {
                super.b(i);
                return this;
            }

            @Override // rjg0.b
            public final rjg0.b d(Set set) {
                super.d(set);
                return this;
            }

            @Override // rjg0.b
            public final rjg0.b e() {
                this.r = -3;
                return this;
            }

            @Override // rjg0.b
            public final rjg0.b f(qjg0 qjg0Var) {
                super.f(qjg0Var);
                return this;
            }

            @Override // rjg0.b
            public final rjg0.b g() {
                super.g();
                return this;
            }

            @Override // rjg0.b
            public final rjg0.b h(String[] strArr) {
                super.h(strArr);
                return this;
            }

            @Override // rjg0.b
            public final rjg0.b i() {
                this.q = false;
                return this;
            }

            @Override // rjg0.b
            public final rjg0.b j(int i, boolean z) {
                super.j(i, z);
                return this;
            }

            public final void k() {
                super.b(2);
            }

            public final void l() {
                SparseBooleanArray sparseBooleanArray = this.D;
                if (sparseBooleanArray.get(2)) {
                    return;
                }
                sparseBooleanArray.put(2, true);
            }

            public a() {
                this.C = new SparseArray<>();
                this.D = new SparseBooleanArray();
                this.v = true;
                this.w = true;
                this.x = true;
                this.y = true;
                this.z = true;
                this.A = true;
                this.B = true;
            }
        }
    }
}
