package re;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.gms.cast.MediaTrack;
import com.ironsource.C4235d4;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class n2 implements j {
    public static final int J = -1;
    public static final long K = Long.MAX_VALUE;
    public static final n2 L = new b().G();
    public static final String M = eh.o1.R0(0);
    public static final String N = eh.o1.R0(1);
    public static final String O = eh.o1.R0(2);
    public static final String P = eh.o1.R0(3);
    public static final String Q = eh.o1.R0(4);
    public static final String R = eh.o1.R0(5);
    public static final String S = eh.o1.R0(6);
    public static final String T = eh.o1.R0(7);
    public static final String U = eh.o1.R0(8);
    public static final String V = eh.o1.R0(9);
    public static final String W = eh.o1.R0(10);
    public static final String X = eh.o1.R0(11);
    public static final String Y = eh.o1.R0(12);
    public static final String Z = eh.o1.R0(13);

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final String f126219a0 = eh.o1.R0(14);

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final String f126220b0 = eh.o1.R0(15);

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final String f126221c0 = eh.o1.R0(16);

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final String f126222d0 = eh.o1.R0(17);

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final String f126223e0 = eh.o1.R0(18);

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final String f126224f0 = eh.o1.R0(19);

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final String f126225g0 = eh.o1.R0(20);

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final String f126226h0 = eh.o1.R0(21);

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final String f126227i0 = eh.o1.R0(22);

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final String f126228j0 = eh.o1.R0(23);

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final String f126229k0 = eh.o1.R0(24);

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final String f126230l0 = eh.o1.R0(25);

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final String f126231m0 = eh.o1.R0(26);

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final String f126232n0 = eh.o1.R0(27);

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final String f126233o0 = eh.o1.R0(28);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final String f126234p0 = eh.o1.R0(29);

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final String f126235q0 = eh.o1.R0(30);

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final String f126236r0 = eh.o1.R0(31);

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final j.a<n2> f126237s0 = new j.a() { // from class: re.m2
        @Override // re.j.a
        public final j fromBundle(Bundle bundle) {
            return n2.e(bundle);
        }
    };
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public int I;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f126238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f126239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f126240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f126241e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f126242f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f126243g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f126244h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f126245i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final String f126246j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final Metadata f126247k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public final String f126248l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public final String f126249m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f126250n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List<byte[]> f126251o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public final DrmInitData f126252p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f126253q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f126254r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f126255s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float f126256t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f126257u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float f126258v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    public final byte[] f126259w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f126260x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    public final fh.c f126261y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f126262z;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {
        public int A;
        public int B;
        public int C;
        public int D;
        public int E;
        public int F;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public String f126263a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public String f126264b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public String f126265c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f126266d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f126267e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f126268f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f126269g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        public String f126270h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        public Metadata f126271i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @Nullable
        public String f126272j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @Nullable
        public String f126273k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f126274l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @Nullable
        public List<byte[]> f126275m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @Nullable
        public DrmInitData f126276n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public long f126277o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f126278p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f126279q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public float f126280r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f126281s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public float f126282t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        @Nullable
        public byte[] f126283u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f126284v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        @Nullable
        public fh.c f126285w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f126286x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f126287y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f126288z;

        public n2 G() {
            return new n2(this);
        }

        @qj.a
        public b H(int i10) {
            this.C = i10;
            return this;
        }

        @qj.a
        public b I(int i10) {
            this.f126268f = i10;
            return this;
        }

        @qj.a
        public b J(int i10) {
            this.f126286x = i10;
            return this;
        }

        @qj.a
        public b K(@Nullable String str) {
            this.f126270h = str;
            return this;
        }

        @qj.a
        public b L(@Nullable fh.c cVar) {
            this.f126285w = cVar;
            return this;
        }

        @qj.a
        public b M(@Nullable String str) {
            this.f126272j = str;
            return this;
        }

        @qj.a
        public b N(int i10) {
            this.F = i10;
            return this;
        }

        @qj.a
        public b O(@Nullable DrmInitData drmInitData) {
            this.f126276n = drmInitData;
            return this;
        }

        @qj.a
        public b P(int i10) {
            this.A = i10;
            return this;
        }

        @qj.a
        public b Q(int i10) {
            this.B = i10;
            return this;
        }

        @qj.a
        public b R(float f10) {
            this.f126280r = f10;
            return this;
        }

        @qj.a
        public b S(int i10) {
            this.f126279q = i10;
            return this;
        }

        @qj.a
        public b T(int i10) {
            this.f126263a = Integer.toString(i10);
            return this;
        }

        @qj.a
        public b U(@Nullable String str) {
            this.f126263a = str;
            return this;
        }

        @qj.a
        public b V(@Nullable List<byte[]> list) {
            this.f126275m = list;
            return this;
        }

        @qj.a
        public b W(@Nullable String str) {
            this.f126264b = str;
            return this;
        }

        @qj.a
        public b X(@Nullable String str) {
            this.f126265c = str;
            return this;
        }

        @qj.a
        public b Y(int i10) {
            this.f126274l = i10;
            return this;
        }

        @qj.a
        public b Z(@Nullable Metadata metadata) {
            this.f126271i = metadata;
            return this;
        }

        @qj.a
        public b a0(int i10) {
            this.f126288z = i10;
            return this;
        }

        @qj.a
        public b b0(int i10) {
            this.f126269g = i10;
            return this;
        }

        @qj.a
        public b c0(float f10) {
            this.f126282t = f10;
            return this;
        }

        @qj.a
        public b d0(@Nullable byte[] bArr) {
            this.f126283u = bArr;
            return this;
        }

        @qj.a
        public b e0(int i10) {
            this.f126267e = i10;
            return this;
        }

        @qj.a
        public b f0(int i10) {
            this.f126281s = i10;
            return this;
        }

        @qj.a
        public b g0(@Nullable String str) {
            this.f126273k = str;
            return this;
        }

        @qj.a
        public b h0(int i10) {
            this.f126287y = i10;
            return this;
        }

        @qj.a
        public b i0(int i10) {
            this.f126266d = i10;
            return this;
        }

        @qj.a
        public b j0(int i10) {
            this.f126284v = i10;
            return this;
        }

        @qj.a
        public b k0(long j10) {
            this.f126277o = j10;
            return this;
        }

        @qj.a
        public b l0(int i10) {
            this.D = i10;
            return this;
        }

        @qj.a
        public b m0(int i10) {
            this.E = i10;
            return this;
        }

        @qj.a
        public b n0(int i10) {
            this.f126278p = i10;
            return this;
        }

        public b() {
            this.f126268f = -1;
            this.f126269g = -1;
            this.f126274l = -1;
            this.f126277o = Long.MAX_VALUE;
            this.f126278p = -1;
            this.f126279q = -1;
            this.f126280r = -1.0f;
            this.f126282t = 1.0f;
            this.f126284v = -1;
            this.f126286x = -1;
            this.f126287y = -1;
            this.f126288z = -1;
            this.C = -1;
            this.D = -1;
            this.E = -1;
            this.F = 0;
        }

        public b(n2 n2Var) {
            this.f126263a = n2Var.f126238b;
            this.f126264b = n2Var.f126239c;
            this.f126265c = n2Var.f126240d;
            this.f126266d = n2Var.f126241e;
            this.f126267e = n2Var.f126242f;
            this.f126268f = n2Var.f126243g;
            this.f126269g = n2Var.f126244h;
            this.f126270h = n2Var.f126246j;
            this.f126271i = n2Var.f126247k;
            this.f126272j = n2Var.f126248l;
            this.f126273k = n2Var.f126249m;
            this.f126274l = n2Var.f126250n;
            this.f126275m = n2Var.f126251o;
            this.f126276n = n2Var.f126252p;
            this.f126277o = n2Var.f126253q;
            this.f126278p = n2Var.f126254r;
            this.f126279q = n2Var.f126255s;
            this.f126280r = n2Var.f126256t;
            this.f126281s = n2Var.f126257u;
            this.f126282t = n2Var.f126258v;
            this.f126283u = n2Var.f126259w;
            this.f126284v = n2Var.f126260x;
            this.f126285w = n2Var.f126261y;
            this.f126286x = n2Var.f126262z;
            this.f126287y = n2Var.A;
            this.f126288z = n2Var.B;
            this.A = n2Var.C;
            this.B = n2Var.D;
            this.C = n2Var.E;
            this.D = n2Var.F;
            this.E = n2Var.G;
            this.F = n2Var.H;
        }
    }

    @Nullable
    public static <T> T d(@Nullable T t10, @Nullable T t11) {
        return t10 != null ? t10 : t11;
    }

    public static n2 e(Bundle bundle) {
        b bVar = new b();
        eh.g.c(bundle);
        String string = bundle.getString(M);
        n2 n2Var = L;
        bVar.U((String) d(string, n2Var.f126238b)).W((String) d(bundle.getString(N), n2Var.f126239c)).X((String) d(bundle.getString(O), n2Var.f126240d)).i0(bundle.getInt(P, n2Var.f126241e)).e0(bundle.getInt(Q, n2Var.f126242f)).I(bundle.getInt(R, n2Var.f126243g)).b0(bundle.getInt(S, n2Var.f126244h)).K((String) d(bundle.getString(T), n2Var.f126246j)).Z((Metadata) d((Metadata) bundle.getParcelable(U), n2Var.f126247k)).M((String) d(bundle.getString(V), n2Var.f126248l)).g0((String) d(bundle.getString(W), n2Var.f126249m)).Y(bundle.getInt(X, n2Var.f126250n));
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            byte[] byteArray = bundle.getByteArray(h(i10));
            if (byteArray == null) {
                break;
            }
            arrayList.add(byteArray);
            i10++;
        }
        b bVarO = bVar.V(arrayList).O((DrmInitData) bundle.getParcelable(Z));
        String str = f126219a0;
        n2 n2Var2 = L;
        bVarO.k0(bundle.getLong(str, n2Var2.f126253q)).n0(bundle.getInt(f126220b0, n2Var2.f126254r)).S(bundle.getInt(f126221c0, n2Var2.f126255s)).R(bundle.getFloat(f126222d0, n2Var2.f126256t)).f0(bundle.getInt(f126223e0, n2Var2.f126257u)).c0(bundle.getFloat(f126224f0, n2Var2.f126258v)).d0(bundle.getByteArray(f126225g0)).j0(bundle.getInt(f126226h0, n2Var2.f126260x));
        Bundle bundle2 = bundle.getBundle(f126227i0);
        if (bundle2 != null) {
            bVar.L((fh.c) fh.c.f84319m.fromBundle(bundle2));
        }
        bVar.J(bundle.getInt(f126228j0, n2Var2.f126262z)).h0(bundle.getInt(f126229k0, n2Var2.A)).a0(bundle.getInt(f126230l0, n2Var2.B)).P(bundle.getInt(f126231m0, n2Var2.C)).Q(bundle.getInt(f126232n0, n2Var2.D)).H(bundle.getInt(f126233o0, n2Var2.E)).l0(bundle.getInt(f126235q0, n2Var2.F)).m0(bundle.getInt(f126236r0, n2Var2.G)).N(bundle.getInt(f126234p0, n2Var2.H));
        return bVar.G();
    }

    public static String h(int i10) {
        return Y + lk.e.f104695m + Integer.toString(i10, 36);
    }

    public static String j(@Nullable n2 n2Var) {
        if (n2Var == null) {
            return fw.b.f85379f;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("id=");
        sb2.append(n2Var.f126238b);
        sb2.append(", mimeType=");
        sb2.append(n2Var.f126249m);
        if (n2Var.f126245i != -1) {
            sb2.append(", bitrate=");
            sb2.append(n2Var.f126245i);
        }
        if (n2Var.f126246j != null) {
            sb2.append(", codecs=");
            sb2.append(n2Var.f126246j);
        }
        if (n2Var.f126252p != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i10 = 0;
            while (true) {
                DrmInitData drmInitData = n2Var.f126252p;
                if (i10 >= drmInitData.f48284e) {
                    break;
                }
                UUID uuid = drmInitData.f(i10).f48286c;
                if (uuid.equals(k.f125814e2)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(k.f125819f2)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(k.f125829h2)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(k.f125824g2)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(k.f125809d2)) {
                    linkedHashSet.add("universal");
                } else {
                    linkedHashSet.add("unknown (" + uuid + gi.j.f86771d);
                }
                i10++;
            }
            sb2.append(", drm=[");
            zi.c0.o(fw.b.f85380g).f(sb2, linkedHashSet);
            sb2.append(fw.b.f85385l);
        }
        if (n2Var.f126254r != -1 && n2Var.f126255s != -1) {
            sb2.append(", res=");
            sb2.append(n2Var.f126254r);
            sb2.append("x");
            sb2.append(n2Var.f126255s);
        }
        fh.c cVar = n2Var.f126261y;
        if (cVar != null && cVar.g()) {
            sb2.append(", color=");
            sb2.append(n2Var.f126261y.j());
        }
        if (n2Var.f126256t != -1.0f) {
            sb2.append(", fps=");
            sb2.append(n2Var.f126256t);
        }
        if (n2Var.f126262z != -1) {
            sb2.append(", channels=");
            sb2.append(n2Var.f126262z);
        }
        if (n2Var.A != -1) {
            sb2.append(", sample_rate=");
            sb2.append(n2Var.A);
        }
        if (n2Var.f126240d != null) {
            sb2.append(", language=");
            sb2.append(n2Var.f126240d);
        }
        if (n2Var.f126239c != null) {
            sb2.append(", label=");
            sb2.append(n2Var.f126239c);
        }
        if (n2Var.f126241e != 0) {
            ArrayList arrayList = new ArrayList();
            if ((n2Var.f126241e & 4) != 0) {
                arrayList.add("auto");
            }
            if ((n2Var.f126241e & 1) != 0) {
                arrayList.add("default");
            }
            if ((n2Var.f126241e & 2) != 0) {
                arrayList.add("forced");
            }
            sb2.append(", selectionFlags=[");
            zi.c0.o(fw.b.f85380g).f(sb2, arrayList);
            sb2.append(C4235d4.j.f61462e);
        }
        if (n2Var.f126242f != 0) {
            ArrayList arrayList2 = new ArrayList();
            if ((n2Var.f126242f & 1) != 0) {
                arrayList2.add("main");
            }
            if ((n2Var.f126242f & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((n2Var.f126242f & 4) != 0) {
                arrayList2.add(MediaTrack.ROLE_SUPPLEMENTARY);
            }
            if ((n2Var.f126242f & 8) != 0) {
                arrayList2.add(MediaTrack.ROLE_COMMENTARY);
            }
            if ((n2Var.f126242f & 16) != 0) {
                arrayList2.add(MediaTrack.ROLE_DUB);
            }
            if ((n2Var.f126242f & 32) != 0) {
                arrayList2.add(MediaTrack.ROLE_EMERGENCY);
            }
            if ((n2Var.f126242f & 64) != 0) {
                arrayList2.add(MediaTrack.ROLE_CAPTION);
            }
            if ((n2Var.f126242f & 128) != 0) {
                arrayList2.add(MediaTrack.ROLE_SUBTITLE);
            }
            if ((n2Var.f126242f & 256) != 0) {
                arrayList2.add(MediaTrack.ROLE_SIGN);
            }
            if ((n2Var.f126242f & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((n2Var.f126242f & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((n2Var.f126242f & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((n2Var.f126242f & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((n2Var.f126242f & 8192) != 0) {
                arrayList2.add("easy-read");
            }
            if ((n2Var.f126242f & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            sb2.append(", roleFlags=[");
            zi.c0.o(fw.b.f85380g).f(sb2, arrayList2);
            sb2.append(C4235d4.j.f61462e);
        }
        return sb2.toString();
    }

    public b b() {
        return new b();
    }

    public n2 c(int i10) {
        return b().N(i10).G();
    }

    public boolean equals(@Nullable Object obj) {
        int i10;
        if (this == obj) {
            return true;
        }
        if (obj != null && n2.class == obj.getClass()) {
            n2 n2Var = (n2) obj;
            int i11 = this.I;
            if ((i11 == 0 || (i10 = n2Var.I) == 0 || i11 == i10) && this.f126241e == n2Var.f126241e && this.f126242f == n2Var.f126242f && this.f126243g == n2Var.f126243g && this.f126244h == n2Var.f126244h && this.f126250n == n2Var.f126250n && this.f126253q == n2Var.f126253q && this.f126254r == n2Var.f126254r && this.f126255s == n2Var.f126255s && this.f126257u == n2Var.f126257u && this.f126260x == n2Var.f126260x && this.f126262z == n2Var.f126262z && this.A == n2Var.A && this.B == n2Var.B && this.C == n2Var.C && this.D == n2Var.D && this.E == n2Var.E && this.F == n2Var.F && this.G == n2Var.G && this.H == n2Var.H && Float.compare(this.f126256t, n2Var.f126256t) == 0 && Float.compare(this.f126258v, n2Var.f126258v) == 0 && eh.o1.g(this.f126238b, n2Var.f126238b) && eh.o1.g(this.f126239c, n2Var.f126239c) && eh.o1.g(this.f126246j, n2Var.f126246j) && eh.o1.g(this.f126248l, n2Var.f126248l) && eh.o1.g(this.f126249m, n2Var.f126249m) && eh.o1.g(this.f126240d, n2Var.f126240d) && Arrays.equals(this.f126259w, n2Var.f126259w) && eh.o1.g(this.f126247k, n2Var.f126247k) && eh.o1.g(this.f126261y, n2Var.f126261y) && eh.o1.g(this.f126252p, n2Var.f126252p) && g(n2Var)) {
                return true;
            }
        }
        return false;
    }

    public int f() {
        int i10;
        int i11 = this.f126254r;
        if (i11 == -1 || (i10 = this.f126255s) == -1) {
            return -1;
        }
        return i11 * i10;
    }

    public boolean g(n2 n2Var) {
        if (this.f126251o.size() != n2Var.f126251o.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f126251o.size(); i10++) {
            if (!Arrays.equals(this.f126251o.get(i10), n2Var.f126251o.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (this.I == 0) {
            String str = this.f126238b;
            int iHashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f126239c;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f126240d;
            int iHashCode3 = (((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f126241e) * 31) + this.f126242f) * 31) + this.f126243g) * 31) + this.f126244h) * 31;
            String str4 = this.f126246j;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Metadata metadata = this.f126247k;
            int iHashCode5 = (iHashCode4 + (metadata == null ? 0 : metadata.hashCode())) * 31;
            String str5 = this.f126248l;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f126249m;
            this.I = ((((((((((((((((((((((((((((((((((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.f126250n) * 31) + ((int) this.f126253q)) * 31) + this.f126254r) * 31) + this.f126255s) * 31) + Float.floatToIntBits(this.f126256t)) * 31) + this.f126257u) * 31) + Float.floatToIntBits(this.f126258v)) * 31) + this.f126260x) * 31) + this.f126262z) * 31) + this.A) * 31) + this.B) * 31) + this.C) * 31) + this.D) * 31) + this.E) * 31) + this.F) * 31) + this.G) * 31) + this.H;
        }
        return this.I;
    }

    public Bundle i(boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putString(M, this.f126238b);
        bundle.putString(N, this.f126239c);
        bundle.putString(O, this.f126240d);
        bundle.putInt(P, this.f126241e);
        bundle.putInt(Q, this.f126242f);
        bundle.putInt(R, this.f126243g);
        bundle.putInt(S, this.f126244h);
        bundle.putString(T, this.f126246j);
        if (!z10) {
            bundle.putParcelable(U, this.f126247k);
        }
        bundle.putString(V, this.f126248l);
        bundle.putString(W, this.f126249m);
        bundle.putInt(X, this.f126250n);
        for (int i10 = 0; i10 < this.f126251o.size(); i10++) {
            bundle.putByteArray(h(i10), this.f126251o.get(i10));
        }
        bundle.putParcelable(Z, this.f126252p);
        bundle.putLong(f126219a0, this.f126253q);
        bundle.putInt(f126220b0, this.f126254r);
        bundle.putInt(f126221c0, this.f126255s);
        bundle.putFloat(f126222d0, this.f126256t);
        bundle.putInt(f126223e0, this.f126257u);
        bundle.putFloat(f126224f0, this.f126258v);
        bundle.putByteArray(f126225g0, this.f126259w);
        bundle.putInt(f126226h0, this.f126260x);
        fh.c cVar = this.f126261y;
        if (cVar != null) {
            bundle.putBundle(f126227i0, cVar.toBundle());
        }
        bundle.putInt(f126228j0, this.f126262z);
        bundle.putInt(f126229k0, this.A);
        bundle.putInt(f126230l0, this.B);
        bundle.putInt(f126231m0, this.C);
        bundle.putInt(f126232n0, this.D);
        bundle.putInt(f126233o0, this.E);
        bundle.putInt(f126235q0, this.F);
        bundle.putInt(f126236r0, this.G);
        bundle.putInt(f126234p0, this.H);
        return bundle;
    }

    public n2 k(n2 n2Var) {
        String str;
        if (this == n2Var) {
            return this;
        }
        int iL = eh.l0.l(this.f126249m);
        String str2 = n2Var.f126238b;
        String str3 = n2Var.f126239c;
        if (str3 == null) {
            str3 = this.f126239c;
        }
        String str4 = this.f126240d;
        if ((iL == 3 || iL == 1) && (str = n2Var.f126240d) != null) {
            str4 = str;
        }
        int i10 = this.f126243g;
        if (i10 == -1) {
            i10 = n2Var.f126243g;
        }
        int i11 = this.f126244h;
        if (i11 == -1) {
            i11 = n2Var.f126244h;
        }
        String str5 = this.f126246j;
        if (str5 == null) {
            String strY = eh.o1.Y(n2Var.f126246j, iL);
            if (eh.o1.L1(strY).length == 1) {
                str5 = strY;
            }
        }
        Metadata metadata = this.f126247k;
        Metadata metadataB = metadata == null ? n2Var.f126247k : metadata.b(n2Var.f126247k);
        float f10 = this.f126256t;
        if (f10 == -1.0f && iL == 2) {
            f10 = n2Var.f126256t;
        }
        return b().U(str2).W(str3).X(str4).i0(this.f126241e | n2Var.f126241e).e0(this.f126242f | n2Var.f126242f).I(i10).b0(i11).K(str5).Z(metadataB).O(DrmInitData.e(n2Var.f126252p, this.f126252p)).R(f10).G();
    }

    @Override // re.j
    public Bundle toBundle() {
        return i(false);
    }

    public String toString() {
        return "Format(" + this.f126238b + ", " + this.f126239c + ", " + this.f126248l + ", " + this.f126249m + ", " + this.f126246j + ", " + this.f126245i + ", " + this.f126240d + ", [" + this.f126254r + ", " + this.f126255s + ", " + this.f126256t + ", " + this.f126261y + "], [" + this.f126262z + ", " + this.A + "])";
    }

    public n2(b bVar) {
        this.f126238b = bVar.f126263a;
        this.f126239c = bVar.f126264b;
        this.f126240d = eh.o1.m1(bVar.f126265c);
        this.f126241e = bVar.f126266d;
        this.f126242f = bVar.f126267e;
        int i10 = bVar.f126268f;
        this.f126243g = i10;
        int i11 = bVar.f126269g;
        this.f126244h = i11;
        this.f126245i = i11 != -1 ? i11 : i10;
        this.f126246j = bVar.f126270h;
        this.f126247k = bVar.f126271i;
        this.f126248l = bVar.f126272j;
        this.f126249m = bVar.f126273k;
        this.f126250n = bVar.f126274l;
        this.f126251o = bVar.f126275m == null ? Collections.EMPTY_LIST : bVar.f126275m;
        DrmInitData drmInitData = bVar.f126276n;
        this.f126252p = drmInitData;
        this.f126253q = bVar.f126277o;
        this.f126254r = bVar.f126278p;
        this.f126255s = bVar.f126279q;
        this.f126256t = bVar.f126280r;
        this.f126257u = bVar.f126281s == -1 ? 0 : bVar.f126281s;
        this.f126258v = bVar.f126282t == -1.0f ? 1.0f : bVar.f126282t;
        this.f126259w = bVar.f126283u;
        this.f126260x = bVar.f126284v;
        this.f126261y = bVar.f126285w;
        this.f126262z = bVar.f126286x;
        this.A = bVar.f126287y;
        this.B = bVar.f126288z;
        this.C = bVar.A == -1 ? 0 : bVar.A;
        this.D = bVar.B != -1 ? bVar.B : 0;
        this.E = bVar.C;
        this.F = bVar.D;
        this.G = bVar.E;
        if (bVar.F != 0 || drmInitData == null) {
            this.H = bVar.F;
        } else {
            this.H = 1;
        }
    }
}
