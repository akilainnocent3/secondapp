package fx;

import java.util.Arrays;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@s1({"SMAP\nSegment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Segment.kt\nokio/Segment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,187:1\n1#2:188\n*E\n"})
public final class y0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @oy.l
    public static final a f85737h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f85738i = 8192;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f85739j = 1024;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    @cs.g
    public final byte[] f85740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @cs.g
    public int f85741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @cs.g
    public int f85742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @cs.g
    public boolean f85743d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @cs.g
    public boolean f85744e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @cs.g
    @oy.m
    public y0 f85745f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @cs.g
    @oy.m
    public y0 f85746g;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }

        public a() {
        }
    }

    public y0() {
        this.f85740a = new byte[8192];
        this.f85744e = true;
        this.f85743d = false;
    }

    public final void a() {
        int i10;
        y0 y0Var = this.f85746g;
        if (y0Var == this) {
            throw new IllegalStateException("cannot compact");
        }
        kotlin.jvm.internal.m0.m(y0Var);
        if (y0Var.f85744e) {
            int i11 = this.f85742c - this.f85741b;
            y0 y0Var2 = this.f85746g;
            kotlin.jvm.internal.m0.m(y0Var2);
            int i12 = 8192 - y0Var2.f85742c;
            y0 y0Var3 = this.f85746g;
            kotlin.jvm.internal.m0.m(y0Var3);
            if (y0Var3.f85743d) {
                i10 = 0;
            } else {
                y0 y0Var4 = this.f85746g;
                kotlin.jvm.internal.m0.m(y0Var4);
                i10 = y0Var4.f85741b;
            }
            if (i11 > i12 + i10) {
                return;
            }
            y0 y0Var5 = this.f85746g;
            kotlin.jvm.internal.m0.m(y0Var5);
            g(y0Var5, i11);
            b();
            z0.d(this);
        }
    }

    @oy.m
    public final y0 b() {
        y0 y0Var = this.f85745f;
        if (y0Var == this) {
            y0Var = null;
        }
        y0 y0Var2 = this.f85746g;
        kotlin.jvm.internal.m0.m(y0Var2);
        y0Var2.f85745f = this.f85745f;
        y0 y0Var3 = this.f85745f;
        kotlin.jvm.internal.m0.m(y0Var3);
        y0Var3.f85746g = this.f85746g;
        this.f85745f = null;
        this.f85746g = null;
        return y0Var;
    }

    @oy.l
    public final y0 c(@oy.l y0 segment) {
        kotlin.jvm.internal.m0.p(segment, "segment");
        segment.f85746g = this;
        segment.f85745f = this.f85745f;
        y0 y0Var = this.f85745f;
        kotlin.jvm.internal.m0.m(y0Var);
        y0Var.f85746g = segment;
        this.f85745f = segment;
        return segment;
    }

    @oy.l
    public final y0 d() {
        this.f85743d = true;
        return new y0(this.f85740a, this.f85741b, this.f85742c, true, false);
    }

    @oy.l
    public final y0 e(int i10) {
        y0 y0VarE;
        if (i10 <= 0 || i10 > this.f85742c - this.f85741b) {
            throw new IllegalArgumentException("byteCount out of range");
        }
        if (i10 >= 1024) {
            y0VarE = d();
        } else {
            y0VarE = z0.e();
            byte[] bArr = this.f85740a;
            byte[] bArr2 = y0VarE.f85740a;
            int i11 = this.f85741b;
            fr.q.E0(bArr, bArr2, 0, i11, i11 + i10, 2, null);
        }
        y0VarE.f85742c = y0VarE.f85741b + i10;
        this.f85741b += i10;
        y0 y0Var = this.f85746g;
        kotlin.jvm.internal.m0.m(y0Var);
        y0Var.c(y0VarE);
        return y0VarE;
    }

    @oy.l
    public final y0 f() {
        byte[] bArr = this.f85740a;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        kotlin.jvm.internal.m0.o(bArrCopyOf, "copyOf(...)");
        return new y0(bArrCopyOf, this.f85741b, this.f85742c, false, true);
    }

    public final void g(@oy.l y0 sink, int i10) {
        kotlin.jvm.internal.m0.p(sink, "sink");
        if (!sink.f85744e) {
            throw new IllegalStateException("only owner can write");
        }
        int i11 = sink.f85742c;
        if (i11 + i10 > 8192) {
            if (sink.f85743d) {
                throw new IllegalArgumentException();
            }
            int i12 = sink.f85741b;
            if ((i11 + i10) - i12 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = sink.f85740a;
            fr.q.E0(bArr, bArr, 0, i12, i11, 2, null);
            sink.f85742c -= sink.f85741b;
            sink.f85741b = 0;
        }
        byte[] bArr2 = this.f85740a;
        byte[] bArr3 = sink.f85740a;
        int i13 = sink.f85742c;
        int i14 = this.f85741b;
        fr.q.v0(bArr2, bArr3, i13, i14, i14 + i10);
        sink.f85742c += i10;
        this.f85741b += i10;
    }

    public y0(@oy.l byte[] data, int i10, int i11, boolean z10, boolean z11) {
        kotlin.jvm.internal.m0.p(data, "data");
        this.f85740a = data;
        this.f85741b = i10;
        this.f85742c = i11;
        this.f85743d = z10;
        this.f85744e = z11;
    }
}
