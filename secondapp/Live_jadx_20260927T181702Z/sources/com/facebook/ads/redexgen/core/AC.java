package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import f6.q;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import r1.o;
import yr.a;
import zi.c;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class AC extends AbstractC3465qP implements InterfaceC3373os {
    public static byte[] A0m;
    public static String[] A0n = {"elvUyEpYiUQqaqvwUQo90L33x5mfGGF5", "x3rc7jsIv6nSbJc9JPlcAze5yGxzQZsd", "UU9CG9klJf", "SZBoHO9Iw1qJ", "kHgqOkYqcJ", "2J3DKpzV", "imAdJlgwdHrtl5IWv7XQyaTS97", "KGY40HmMWVqKFUFEVN2bB10ght87eGPu"};
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public C3466qQ A09;
    public C3444q2 A0A;
    public C3444q2 A0B;
    public C3444q2 A0C;
    public C3439px A0D;
    public C3437pv A0E;
    public C3413pW A0F;
    public C3408pR A0G;
    public C17114z A0H;
    public AD A0I;
    public C7Z A0J;
    public C17847u A0K;
    public InterfaceC1898Cx A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public final C3437pv A0T;
    public final long A0U;
    public final long A0V;
    public final long A0W;
    public final Handler A0X;
    public final Looper A0Y;
    public final InterfaceC16633b A0Z;
    public final C3427pl A0a;
    public final AnonymousClass45 A0b;
    public final AnonymousClass48 A0c;
    public final C3371oq A0d;
    public final AB A0e;
    public final InterfaceC3364oj A0f;
    public final AbstractC1949Ew A0g;
    public final C1950Ex A0h;
    public final CopyOnWriteArraySet<C6W> A0i;
    public final CopyOnWriteArraySet<C3U> A0j;
    public final boolean A0k;
    public final InterfaceC3369oo[] A0l;

    public static String A04(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0m, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 17);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A0m = new byte[]{102, c.G, 74, 119, 96, 95, 99, 110, 118, 106, 125, 70, 98, 127, 99, 0, a.f159811k, 42, c.f161647y, 41, 36, 60, 32, 55, 9, 44, 39, 106, 119, 107, 125, 107, 116, 70, 97, 102, 123, 47, 71, 123, 118, 110, 114, 101, 55, 126, q.f83619w, 55, 118, 116, 116, 114, q.f83619w, q.f83619w, 114, 115, 55, rg.a.f127263w, 121, 55, 99, 127, 114, 55, 96, 101, rg.a.f127263w, 121, 112, 55, 99, 127, 101, 114, 118, 115, 57, c.G, 84, 98, 101, 101, 114, 121, 99, 55, 99, 127, 101, 114, 118, 115, 45, 55, 48, 50, q.f83619w, 48, c.G, 82, 111, 103, 114, 116, 99, 114, 115, 55, 99, 127, 101, 114, 118, 115, 45, 55, 48, 50, q.f83619w, 48, c.G, 68, 114, 114, 55, 127, 99, 99, 103, q.f83619w, 45, 56, 56, 114, 111, rg.a.f127263w, 103, 123, 118, 110, 114, 101, 57, 115, 114, 97, 56, 126, q.f83619w, q.f83619w, 98, 114, q.f83619w, 56, 103, 123, 118, 110, 114, 101, 58, 118, 116, 116, 114, q.f83619w, q.f83619w, 114, 115, 58, rg.a.f127263w, 121, 58, 96, 101, rg.a.f127263w, 121, 112, 58, 99, 127, 101, 114, 118, 115, c.f161646x, 35, 42, 35, 39, 53, 35, 102, 122, 86, 43, 80, 99, 98, 92, 96, 109, 117, 105, 126, 95, rg.a.f127263w, 109, rg.a.f127263w, 105, 79, q.f83619w, 109, 98, 107, 105, 104, 93, 75, 75, 69, 122, 65, c.f161638p, 71, 73, 64, 65, 92, 75, 74, c.f161638p, 76, 75, 77, 79, 91, 93, 75, c.f161638p, 79, 64, c.f161638p, 79, 74, c.f161638p, 71, 93, c.f161638p, 94, 66, 79, 87, 71, 64, 73};
    }

    static {
        A06();
    }

    public AC(InterfaceC3369oo[] interfaceC3369ooArr, AbstractC1949Ew abstractC1949Ew, AnonymousClass74 anonymousClass74, F6 f10, AnonymousClass45 anonymousClass45) {
        this(interfaceC3369ooArr, abstractC1949Ew, anonymousClass74, f10, anonymousClass45, false, false, false, false, false, false, 0L, false, 0, false, false, false, false, false, false, false, null);
    }

    public AC(@MetaExoPlayerCustomization("qe_android_video_exoplayer2.update_loading_priority_exo2 is consistently false. We do not need to port this in the upgrade") InterfaceC3369oo[] interfaceC3369ooArr, @MetaExoPlayerCustomization("Introduced in D13513334 and also used in loop playing for IG: D38285740") AbstractC1949Ew abstractC1949Ew, @MetaExoPlayerCustomization("Currently used to load chunks while seeking on pause D13827150") AnonymousClass74 anonymousClass74, @MetaExoPlayerCustomization("D40987428 Brought in for clippingmediasource") F6 f10, @MetaExoPlayerCustomization("D45597293 for Oculus - allowing the start renderer offset to not be 0; Eventually changed in Exo: https://github.com/google/ExoPlayer/commit/9f352434c72da527d1fa7963447c3cf680db884f") AnonymousClass45 anonymousClass45, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, long j10, boolean z16, int i10, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, InterfaceC16633b interfaceC16633b) {
        InterfaceC16633b interfaceC16633b2 = interfaceC16633b;
        Log.i(A04(2, 13, 30), A04(33, 5, 30) + Integer.toHexString(System.identityHashCode(this)) + A04(0, 2, 87) + A04(15, 18, 84) + A04(194, 3, 26) + C5C.A04 + A04(o.f123455u, 1, 54));
        this.A0c = new AnonymousClass48();
        try {
            this.A0M = z22;
            AbstractC16843y.A08(interfaceC3369ooArr.length > 0);
            this.A0l = (InterfaceC3369oo[]) AbstractC16843y.A01(interfaceC3369ooArr);
            this.A0g = (AbstractC1949Ew) AbstractC16843y.A01(abstractC1949Ew);
            this.A0Q = false;
            this.A00 = 1.0f;
            this.A05 = 0;
            this.A0A = C3444q2.A0Z;
            this.A0B = C3444q2.A0Z;
            this.A0C = C3444q2.A0Z;
            this.A0S = false;
            this.A0V = 0L;
            this.A09 = C3466qQ.A07;
            this.A0W = 0L;
            this.A0j = new CopyOnWriteArraySet<>();
            this.A0U = 0L;
            InterfaceC3364oj analyticsCollector = InterfaceC3364oj.A00;
            this.A0f = analyticsCollector;
            this.A0K = C17847u.A03;
            this.A06 = 1;
            this.A0d = new C3371oq();
            this.A0h = new C1950Ex(new C17827s[interfaceC3369ooArr.length], new InterfaceC3272nE[interfaceC3369ooArr.length], C3415pY.A03, null);
            this.A0a = new C3427pl();
            this.A0T = new C3P().A03(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28).A01(29, abstractC1949Ew.A0Y()).A04();
            this.A0E = new C3P().A02(this.A0T).A00(4).A00(10).A04();
            this.A0G = C3408pR.A03;
            this.A0D = C3439px.A06;
            this.A0Y = Looper.myLooper();
            final Looper looperMyLooper = Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper();
            this.A0X = new Handler(looperMyLooper) { // from class: com.facebook.ads.redexgen.X.6c
                @Override // android.os.Handler
                public final void handleMessage(Message msg) throws Throwable {
                    if (WU.A02(this)) {
                        return;
                    }
                    try {
                        this.A00.A0N(msg);
                    } catch (Throwable th2) {
                        WU.A00(th2, this);
                    }
                }
            };
            this.A0b = anonymousClass45;
            this.A0Z = interfaceC16633b2 == null ? this : interfaceC16633b2;
            this.A0J = new C7Z(Timeline.A02, 0L, C3290nW.A06, this.A0h);
            this.A0e = new AB(interfaceC3369ooArr, abstractC1949Ew, this.A0h, anonymousClass74, f10, this.A0Q, this.A05, this.A0S, this.A0X, anonymousClass45, z10, z11, z12, z13, z14, z15, j10, z16, i10, z17, z18, z19, z20, z21, z23, C8O.A03);
            this.A0F = C3413pW.A06;
            this.A0H = C17114z.A03;
            this.A0i = new CopyOnWriteArraySet<>();
        } finally {
            this.A0c.A04();
        }
    }

    private long A00(long j10) {
        long jA01 = C2Y.A01(j10);
        if (!this.A0J.A05.A00()) {
            this.A0J.A03.A0J(this.A0J.A05.A04, this.A0a);
            long positionMs = this.A0a.A0B();
            return jA01 + positionMs;
        }
        return jA01;
    }

    private long A01(Timeline timeline, C3308no c3308no, long j10) {
        timeline.A0J(c3308no.A04, this.A0a);
        return j10 + this.A0a.A0C();
    }

    private C7Z A02(boolean z10, boolean z11, int i10) {
        C1950Ex c1950Ex;
        if (z10) {
            this.A02 = 0;
            this.A01 = 0;
            this.A08 = 0L;
            this.A07 = 0L;
        } else {
            this.A02 = A7h();
            this.A01 = A7c();
            this.A08 = A7e();
            this.A07 = A0J();
        }
        Timeline timeline = z11 ? Timeline.A02 : this.A0J.A03;
        C3308no c3308no = this.A0J.A05;
        long j10 = this.A0J.A02;
        long j11 = this.A0J.A01;
        C3290nW c3290nW = z11 ? C3290nW.A06 : this.A0J.A06;
        if (z11) {
            c1950Ex = this.A0h;
        } else {
            C7Z c7z = this.A0J;
            String[] strArr = A0n;
            if (strArr[7].charAt(29) != strArr[0].charAt(29)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0n;
            strArr2[3] = "Omd19LzmWdt3";
            strArr2[5] = "slTdP4Xe";
            c1950Ex = c7z.A07;
        }
        return new C7Z(timeline, c3308no, j10, j11, i10, false, c3290nW, c1950Ex, this.A0J.A05, this.A0J.A02, 0L, this.A0J.A02);
    }

    private C17677d A03(InterfaceC17667c interfaceC17667c) {
        int iA7h = A7h();
        AB ab2 = this.A0e;
        Timeline timeline = this.A0J.A03;
        if (iA7h == -1) {
            iA7h = 0;
        }
        return new C17677d(ab2, interfaceC17667c, timeline, iA7h, this.A0b, this.A0e.A1B());
    }

    private void A05() {
        if (!this.A0M) {
            return;
        }
        this.A0c.A01();
        if (Thread.currentThread() != A0K().getThread()) {
            String strA0n = C5C.A0n(A04(38, 147, 6), Thread.currentThread().getName(), A0K().getThread().getName());
            if (!this.A0k) {
                Log.w(A04(2, 13, 30), strA0n, this.A0N ? null : new IllegalStateException());
                if (A0n[6].length() == 12) {
                    throw new RuntimeException();
                }
                A0n[6] = "OHv4LuNWT";
                this.A0N = true;
                return;
            }
            throw new IllegalStateException(strA0n);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004d  */
    /* JADX WARN: Code duplicated, block: B:15:0x0055  */
    private void A07(C7Z c7z, int i10, boolean z10, int i11) {
        int i12;
        C7Z c7zA06 = c7z;
        this.A03 -= i10;
        if (this.A03 == 0) {
            if (c7zA06.A02 == -9223372036854775807L) {
                c7zA06 = c7zA06.A06(c7zA06.A05, 0L, c7zA06.A01, c7zA06.A0D);
            }
            C7Z playbackInfo = this.A0J;
            if (playbackInfo.A03.A0N()) {
                boolean z11 = this.A0O;
                String[] strArr = A0n;
                if (strArr[3].length() == strArr[5].length()) {
                    throw new RuntimeException();
                }
                A0n[6] = "E7I7Mej0S3DTzUCwep";
                if (z11) {
                    if (c7zA06.A03.A0N()) {
                        this.A01 = 0;
                        this.A02 = 0;
                        this.A08 = 0L;
                        this.A07 = 0L;
                    }
                }
            } else if (c7zA06.A03.A0N()) {
                this.A01 = 0;
                this.A02 = 0;
                this.A08 = 0L;
                this.A07 = 0L;
            }
            if (this.A0O) {
                i12 = 0;
            } else {
                i12 = 2;
            }
            boolean z12 = this.A0P;
            this.A0O = false;
            this.A0P = false;
            A08(c7zA06, z10, i11, i12, z12);
        }
    }

    private void A08(C7Z c7z, boolean z10, int i10, int i11, boolean z11) {
        Iterator<C3U> it;
        boolean isLoadingChanged = this.A0J.A03 != c7z.A03;
        int i12 = this.A0J.A00;
        String[] strArr = A0n;
        if (strArr[2].length() == strArr[4].length()) {
            String[] strArr2 = A0n;
            strArr2[7] = "RJsywmu9iXbSHAOSoooup4iB6ctJ9GEd";
            strArr2[0] = "je0JKUsqzBp1pj8TVGEWBsFZVePcLGnq";
            boolean z12 = i12 != c7z.A00;
            boolean playbackStateChanged = this.A0J.A0A;
            boolean timelineChanged = c7z.A0A;
            boolean z13 = playbackStateChanged != timelineChanged;
            boolean z14 = this.A0J.A07 != c7z.A07;
            this.A0J = c7z;
            if (isLoadingChanged || i11 == 0) {
                Iterator<C3U> it2 = this.A0j.iterator();
                while (timelineChanged) {
                    C3U next = it2.next();
                    Timeline timeline = this.A0J.A03;
                    String[] strArr3 = A0n;
                    if (strArr3[7].charAt(29) != strArr3[0].charAt(29)) {
                        throw new RuntimeException();
                    }
                    A0n[6] = "RAQE2IWZazAhX";
                    next.AGA(timeline, i11);
                }
            }
            if (z10) {
                Iterator<C3U> it3 = this.A0j.iterator();
                while (timelineChanged) {
                    it3.next();
                }
            }
            if (z14) {
                this.A0g.A0c(this.A0J.A07.A02);
                Iterator<C3U> it4 = this.A0j.iterator();
                while (timelineChanged) {
                    it4.next().AGE(this.A0J.A07.A01);
                }
            }
            if (z13) {
                Iterator<C3U> it5 = this.A0j.iterator();
                while (true) {
                    boolean zHasNext = it5.hasNext();
                    String[] strArr4 = A0n;
                    if (strArr4[2].length() == strArr4[4].length()) {
                        A0n[6] = "XRa";
                        if (!zHasNext) {
                            break;
                        } else {
                            it5.next();
                        }
                    }
                }
            }
            if (z12) {
                CopyOnWriteArraySet<C3U> copyOnWriteArraySet = this.A0j;
                if (A0n[1].charAt(28) != 'y') {
                    String[] strArr5 = A0n;
                    strArr5[3] = "HK22odgNy2pi";
                    strArr5[5] = "HFqBrVui";
                    it = copyOnWriteArraySet.iterator();
                } else {
                    it = copyOnWriteArraySet.iterator();
                }
                while (playbackStateChanged) {
                    C3U next2 = it.next();
                    boolean trackSelectorResultChanged = this.A0R;
                    next2.AFM(trackSelectorResultChanged, this.A0J.A00);
                }
            }
            if (z11) {
                Iterator<C3U> it6 = this.A0j.iterator();
                while (timelineChanged) {
                    it6.next().AFt();
                }
                return;
            }
            return;
        }
        throw new RuntimeException();
    }

    @MetaExoPlayerCustomization("D31846300; Custom MediaSessionEventListener")
    private final void A09(boolean z10, boolean z11) {
        if (this.A0Q != z10) {
            this.A0Q = z10;
            this.A04++;
            this.A0e.A1G(z10);
            C7Z c7z = this.A0J;
            if (!z10) {
                this.A0R = z10;
                for (C3U c3u : this.A0j) {
                    if (0 != 0) {
                        throw new NullPointerException(A04(197, 20, 29));
                    }
                    c3u.AFM(z10, c7z.A00);
                }
            }
        }
    }

    private boolean A0A() {
        return this.A0J.A03.A0N() || this.A03 > 0;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3465qP
    public final void A0H(int i10, long j10) {
        long jA00;
        Timeline timeline = this.A0J.A03;
        if (i10 >= 0) {
            boolean zA0N = timeline.A0N();
            if (A0n[6].length() == 12) {
                throw new RuntimeException();
            }
            String[] strArr = A0n;
            strArr[3] = "u5DgO7GwYyET";
            strArr[5] = "hfn3fs8A";
            if (zA0N || i10 < timeline.A07()) {
                this.A0P = true;
                this.A03++;
                if (AAd()) {
                    Log.w(A04(2, 13, 30), A04(217, 39, 63));
                    this.A0X.obtainMessage(0, 1, -1, this.A0J).sendToTarget();
                    return;
                }
                this.A02 = i10;
                if (timeline.A0N()) {
                    this.A08 = j10 == -9223372036854775807L ? 0L : j10;
                    this.A01 = 0;
                } else {
                    if (j10 == -9223372036854775807L) {
                        jA00 = timeline.A0K(i10, super.A00).A05();
                    } else {
                        jA00 = C2Y.A00(j10);
                    }
                    Pair<Object, Long> pairA0D = timeline.A0D(super.A00, this.A0a, i10, jA00);
                    this.A08 = C2Y.A01(jA00);
                    this.A01 = timeline.A0A(pairA0D.first);
                }
                this.A0e.A1D(timeline, i10, C2Y.A00(j10));
                Iterator<C3U> it = this.A0j.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                return;
            }
        }
        throw new C16522q(timeline, i10, j10);
    }

    public final long A0I() {
        if (A0A()) {
            return this.A08;
        }
        if (this.A0J.A04.A03 != this.A0J.A05.A03) {
            return this.A0J.A03.A0K(A7h(), super.A00).A06();
        }
        long jA0D = this.A0J.A0B;
        if (this.A0J.A04.A00()) {
            C3427pl c3427plA0J = this.A0J.A03.A0J(this.A0J.A04.A04, this.A0a);
            jA0D = c3427plA0J.A0D(this.A0J.A04.A00);
            if (jA0D == Long.MIN_VALUE) {
                jA0D = c3427plA0J.A01;
            }
        }
        long contentBufferedPositionUs = A01(this.A0J.A03, this.A0J.A04, jA0D);
        return C5C.A0P(contentBufferedPositionUs);
    }

    public final long A0J() {
        if (A0A()) {
            long j10 = this.A07;
            String[] strArr = A0n;
            if (strArr[7].charAt(29) != strArr[0].charAt(29)) {
                throw new RuntimeException();
            }
            A0n[1] = "SWSNQbytnn5JxmoGO3rxXNMtbmar9O4q";
            return j10;
        }
        C7Z c7z = this.A0J;
        if (A0n[1].charAt(28) == 'y') {
            throw new RuntimeException();
        }
        A0n[1] = "VYQpOR71WpATH6H66c6IUhHHWo1qZbHI";
        return C2Y.A01(c7z.A0C);
    }

    public final Looper A0K() {
        return this.A0Y;
    }

    public final C17677d A0L(InterfaceC17667c interfaceC17667c) {
        A05();
        return A03(interfaceC17667c);
    }

    public final void A0M() {
        StringBuilder sbAppend = new StringBuilder().append(A04(185, 8, 87)).append(Integer.toHexString(System.identityHashCode(this))).append(A04(0, 2, 87)).append(A04(15, 18, 84));
        String strA04 = A04(194, 3, 26);
        Log.i(A04(2, 13, 30), sbAppend.append(strA04).append(C5C.A04).append(strA04).append(AnonymousClass35.A00()).append(A04(o.f123455u, 1, 54)).toString());
        this.A0L = null;
        this.A0e.A1C();
        this.A0X.removeCallbacksAndMessages(null);
        this.A0J = A02(false, false, 1);
        this.A0G = C3408pR.A03;
    }

    public final void A0N(Message message) {
        switch (message.what) {
            case 0:
                A07((C7Z) message.obj, message.arg1, message.arg2 != -1, message.arg2);
                return;
            case 1:
                C3439px c3439px = (C3439px) message.obj;
                C3439px c3439px2 = this.A0D;
                String[] strArr = A0n;
                if (strArr[2].length() == strArr[4].length()) {
                    String[] strArr2 = A0n;
                    strArr2[2] = "M5Fz4bo4aU";
                    strArr2[4] = "jAP48pK2xI";
                    if (!c3439px2.equals(c3439px)) {
                        this.A0D = c3439px;
                        Iterator<C3U> it = this.A0j.iterator();
                        while (it.hasNext()) {
                            it.next().AFI(c3439px);
                        }
                        return;
                    }
                    return;
                }
                break;
            case 2:
                AD ad2 = (AD) message.obj;
                this.A0I = ad2;
                CopyOnWriteArraySet<C3U> copyOnWriteArraySet = this.A0j;
                String[] strArr3 = A0n;
                if (strArr3[7].charAt(29) != strArr3[0].charAt(29)) {
                    throw new RuntimeException();
                }
                String[] strArr4 = A0n;
                strArr4[3] = "qauhWK691fBn";
                strArr4[5] = "FsOQ1ovS";
                Iterator<C3U> it2 = copyOnWriteArraySet.iterator();
                while (true) {
                    boolean zHasNext = it2.hasNext();
                    String[] strArr5 = A0n;
                    if (strArr5[3].length() != strArr5[5].length()) {
                        A0n[6] = "DbAY1NxOkLRBmNTAZlCZyxXxDbYRxJk";
                        if (!zHasNext) {
                            return;
                        }
                    } else if (!zHasNext) {
                        return;
                    }
                    it2.next().AFK(ad2);
                }
                break;
            case 3:
                this.A04--;
                if (this.A04 == 0) {
                    this.A0R = ((Boolean) message.obj).booleanValue();
                    CopyOnWriteArraySet<C3U> copyOnWriteArraySet2 = this.A0j;
                    if (A0n[1].charAt(28) == 'y') {
                        throw new RuntimeException();
                    }
                    String[] strArr6 = A0n;
                    strArr6[3] = "yizDUJeCRugc";
                    strArr6[5] = "UffiDbl9";
                    for (C3U c3u : copyOnWriteArraySet2) {
                        if (this.A0R) {
                            c3u.AFM(this.A0R, this.A0J.A00);
                        }
                    }
                    return;
                }
                return;
            case 4:
                Iterator<C3U> it3 = this.A0j.iterator();
                while (it3.hasNext()) {
                    it3.next();
                }
                return;
            case 5:
                CopyOnWriteArraySet<C3U> copyOnWriteArraySet3 = this.A0j;
                String[] strArr7 = A0n;
                if (strArr7[7].charAt(29) == strArr7[0].charAt(29)) {
                    String[] strArr8 = A0n;
                    strArr8[3] = "QQxFLYRHq8rv";
                    strArr8[5] = "zDzShVZM";
                    Iterator<C3U> it4 = copyOnWriteArraySet3.iterator();
                    while (it4.hasNext()) {
                        it4.next();
                    }
                    return;
                }
                break;
            default:
                throw new IllegalStateException();
        }
        throw new RuntimeException();
    }

    public final void A0O(C3U c3u) {
        this.A0j.add(c3u);
    }

    public final void A0P(InterfaceC1898Cx interfaceC1898Cx, boolean z10, boolean z11) {
        this.A0I = null;
        this.A0L = interfaceC1898Cx;
        C7Z c7zA02 = A02(z10, z11, 2);
        this.A0O = true;
        this.A03++;
        this.A0e.A1F(interfaceC1898Cx, z10, z11);
        A08(c7zA02, false, 4, 1, false);
    }

    public final void A0Q(boolean z10) {
        A09(z10, false);
    }

    public final boolean A0R() {
        return this.A0Q;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC16633b
    public final long A77() {
        if (AAd()) {
            if (this.A0J.A04.equals(this.A0J.A05)) {
                return C2Y.A01(this.A0J.A0B);
            }
            return A7s();
        }
        return A0I();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC16633b
    public final long A7T() {
        if (AAd()) {
            this.A0J.A03.A0J(this.A0J.A05.A04, this.A0a);
            return this.A0a.A0B() + C2Y.A01(this.A0J.A01);
        }
        return A7e();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC16633b
    public final int A7Y() {
        if (AAd()) {
            return this.A0J.A05.A00;
        }
        return -1;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC16633b
    public final int A7Z() {
        if (AAd()) {
            return this.A0J.A05.A01;
        }
        return -1;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC16633b
    @MetaExoPlayerCustomization("getCurrentWindowIndex needs to be upgraded to getCurrentWindowIndexInternal")
    public final int A7b() {
        A05();
        int iA7h = A7h();
        if (iA7h == -1) {
            return 0;
        }
        return iA7h;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC16633b
    public final int A7c() {
        if (A0A()) {
            return this.A01;
        }
        Timeline timeline = this.A0J.A03;
        C3308no c3308no = this.A0J.A05;
        String[] strArr = A0n;
        if (strArr[3].length() == strArr[5].length()) {
            throw new RuntimeException();
        }
        A0n[1] = "6o1scJ9TwXJl7WSt7vZ9WMBcl2tfzHGN";
        return timeline.A0A(c3308no.A04);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC16633b
    public final long A7e() {
        if (A0A()) {
            return this.A08;
        }
        if (this.A0J.A05.A00()) {
            return C2Y.A01(this.A0J.A0C);
        }
        return A00(this.A0J.A0C);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC16633b
    public final Timeline A7g() {
        return this.A0J.A03;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC16633b
    public final int A7h() {
        if (A0A()) {
            int i10 = this.A02;
            String[] strArr = A0n;
            if (strArr[7].charAt(29) != strArr[0].charAt(29)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0n;
            strArr2[3] = "0i1iYNlUg7j9";
            strArr2[5] = "Koyujpdg";
            return i10;
        }
        return this.A0J.A03.A0J(this.A0J.A05.A04, this.A0a).A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC16633b
    public final long A7s() {
        Timeline timeline = this.A0J.A03;
        if (timeline.A0N()) {
            return -9223372036854775807L;
        }
        if (AAd()) {
            C3308no c3308no = this.A0J.A05;
            timeline.A0J(c3308no.A04, this.A0a);
            return C2Y.A01(this.A0a.A0E(c3308no.A00, c3308no.A01));
        }
        return timeline.A0K(A7h(), super.A00).A06();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC16633b
    public final long A9J() {
        return Math.max(0L, C2Y.A01(this.A0J.A0D));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC16633b
    public final boolean AAd() {
        return !A0A() && this.A0J.A05.A00();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC16633b
    public final void AKG(boolean z10) {
        if (z10) {
            this.A0I = null;
            this.A0L = null;
        }
        C7Z c7zA02 = A02(z10, z10, 1);
        this.A03++;
        this.A0e.A1H(z10);
        A08(c7zA02, false, 4, 1, false);
        this.A0G = new C3408pR(MetaExoPlayerCustomizedCollections.A01(), c7zA02.A0C);
    }
}
