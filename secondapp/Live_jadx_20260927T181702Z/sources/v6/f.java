package v6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import x4.m1;
import x4.v0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public final class f extends v6.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<c> f140229a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f140230a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f140231b;

        public b(int i10, long j10) {
            this.f140230a = i10;
            this.f140231b = j10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f140232a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f140233b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f140234c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f140235d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f140236e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final List<b> f140237f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f140238g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final long f140239h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f140240i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f140241j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f140242k;

        public c(long j10, boolean z10, boolean z11, boolean z12, List<b> list, long j11, boolean z13, long j12, int i10, int i11, int i12) {
            this.f140232a = j10;
            this.f140233b = z10;
            this.f140234c = z11;
            this.f140235d = z12;
            this.f140237f = Collections.unmodifiableList(list);
            this.f140236e = j11;
            this.f140238g = z13;
            this.f140239h = j12;
            this.f140240i = i10;
            this.f140241j = i11;
            this.f140242k = i12;
        }

        public static c b(v0 v0Var) {
            ArrayList arrayList;
            boolean z10;
            boolean z11;
            long j10;
            boolean z12;
            long j11;
            int i10;
            int i11;
            int iU;
            boolean z13;
            long jW;
            long jW2 = v0Var.W();
            boolean z14 = true;
            if ((v0Var.U() & 128) == 0) {
                z14 = false;
            }
            ArrayList arrayList2 = new ArrayList();
            if (z14) {
                arrayList = arrayList2;
                z10 = false;
                z11 = false;
                j10 = -9223372036854775807L;
                z12 = false;
                j11 = -9223372036854775807L;
                i10 = 0;
                i11 = 0;
                iU = 0;
            } else {
                int iU2 = v0Var.U();
                boolean z15 = (iU2 & 128) != 0;
                boolean z16 = (iU2 & 64) != 0 ? z14 : false;
                boolean z17 = (iU2 & 32) != 0 ? z14 : false;
                long jW3 = z16 ? v0Var.W() : -9223372036854775807L;
                if (!z16) {
                    int iU3 = v0Var.U();
                    ArrayList arrayList3 = new ArrayList(iU3);
                    int i12 = 0;
                    while (i12 < iU3) {
                        arrayList3.add(new b(v0Var.U(), v0Var.W()));
                        i12++;
                        iU3 = iU3;
                    }
                    arrayList2 = arrayList3;
                }
                if (z17) {
                    long jU = v0Var.U();
                    boolean z18 = (128 & jU) != 0;
                    jW = ((((jU & 1) << 32) | v0Var.W()) * 1000) / 90;
                    z13 = z18;
                } else {
                    z13 = false;
                    jW = -9223372036854775807L;
                }
                int iC0 = v0Var.c0();
                int iU4 = v0Var.U();
                boolean z19 = z15;
                z12 = z13;
                z10 = z19;
                iU = v0Var.U();
                long j12 = jW3;
                i10 = iC0;
                i11 = iU4;
                long j13 = jW;
                arrayList = arrayList2;
                z11 = z16;
                j10 = j12;
                j11 = j13;
            }
            return new c(jW2, z14, z10, z11, arrayList, j10, z12, j11, i10, i11, iU);
        }
    }

    public f(List<c> list) {
        this.f140229a = Collections.unmodifiableList(list);
    }

    public static f b(v0 v0Var) {
        int iU = v0Var.U();
        ArrayList arrayList = new ArrayList(iU);
        for (int i10 = 0; i10 < iU; i10++) {
            arrayList.add(c.b(v0Var));
        }
        return new f(arrayList);
    }
}
