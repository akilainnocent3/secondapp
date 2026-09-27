package v6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import x4.g1;
import x4.m1;
import x4.v0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public final class d extends v6.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f140213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f140214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f140215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f140216d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f140217e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f140218f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f140219g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<b> f140220h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f140221i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f140222j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f140223k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f140224l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f140225m;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f140226a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f140227b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f140228c;

        public b(int i10, long j10, long j11) {
            this.f140226a = i10;
            this.f140227b = j10;
            this.f140228c = j11;
        }
    }

    public d(long j10, boolean z10, boolean z11, boolean z12, boolean z13, long j11, long j12, List<b> list, boolean z14, long j13, int i10, int i11, int i12) {
        this.f140213a = j10;
        this.f140214b = z10;
        this.f140215c = z11;
        this.f140216d = z12;
        this.f140217e = z13;
        this.f140218f = j11;
        this.f140219g = j12;
        this.f140220h = Collections.unmodifiableList(list);
        this.f140221i = z14;
        this.f140222j = j13;
        this.f140223k = i10;
        this.f140224l = i11;
        this.f140225m = i12;
    }

    public static d b(v0 v0Var, long j10, g1 g1Var) {
        List list;
        long j11;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        int iU;
        int iU2;
        boolean z14;
        long jW = v0Var.W();
        boolean z15 = (v0Var.U() & 128) != 0;
        List list2 = Collections.EMPTY_LIST;
        long jW2 = -9223372036854775807L;
        if (z15) {
            list = list2;
            j11 = -9223372036854775807L;
            z10 = false;
            z11 = false;
            z12 = false;
            z13 = false;
            i10 = 0;
            iU = 0;
            iU2 = 0;
        } else {
            int iU3 = v0Var.U();
            boolean z16 = (iU3 & 128) != 0;
            boolean z17 = (iU3 & 64) != 0;
            boolean z18 = (iU3 & 32) != 0;
            boolean z19 = (iU3 & 16) != 0;
            long jC = (!z17 || z19) ? -9223372036854775807L : g.c(v0Var, j10);
            if (!z17) {
                int iU4 = v0Var.U();
                ArrayList arrayList = new ArrayList(iU4);
                int i11 = 0;
                while (i11 < iU4) {
                    int iU5 = v0Var.U();
                    long jC2 = !z19 ? g.c(v0Var, j10) : -9223372036854775807L;
                    arrayList.add(new b(iU5, jC2, g1Var.b(jC2)));
                    i11++;
                    iU4 = iU4;
                }
                list2 = arrayList;
            }
            if (z18) {
                long jU = v0Var.U();
                boolean z20 = (128 & jU) != 0;
                jW2 = ((((jU & 1) << 32) | v0Var.W()) * 1000) / 90;
                z14 = z20;
            } else {
                z14 = false;
            }
            int iC0 = v0Var.c0();
            long j12 = jC;
            j11 = jW2;
            jW2 = j12;
            iU = v0Var.U();
            iU2 = v0Var.U();
            i10 = iC0;
            z13 = z14;
            z10 = z16;
            z11 = z17;
            list = list2;
            z12 = z19;
        }
        return new d(jW, z15, z10, z11, z12, jW2, g1Var.b(jW2), list, z13, j11, i10, iU, iU2);
    }

    @Override // v6.b
    public String toString() {
        return "SCTE-35 SpliceInsertCommand { programSplicePts=" + this.f140218f + ", programSplicePlaybackPositionUs= " + this.f140219g + " }";
    }
}
