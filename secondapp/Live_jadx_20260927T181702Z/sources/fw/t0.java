package fw;

import androidx.media3.session.fe;
import com.ironsource.C4235d4;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public Object[] f85518a = new Object[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public int[] f85519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f85520c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        public static final a f85521a = new a();
    }

    public t0() {
        int[] iArr = new int[8];
        for (int i10 = 0; i10 < 8; i10++) {
            iArr[i10] = -1;
        }
        this.f85519b = iArr;
        this.f85520c = -1;
    }

    @oy.l
    public final String a() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("$");
        int i10 = this.f85520c + 1;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = this.f85518a[i11];
            if (obj instanceof bw.f) {
                bw.f fVar = (bw.f) obj;
                if (!kotlin.jvm.internal.m0.g(fVar.getKind(), bw.o.b.f22018a)) {
                    int i12 = this.f85519b[i11];
                    if (i12 >= 0) {
                        sb2.append(fe.F);
                        sb2.append(fVar.f(i12));
                    }
                } else if (this.f85519b[i11] != -1) {
                    sb2.append(C4235d4.j.f61460d);
                    sb2.append(this.f85519b[i11]);
                    sb2.append(C4235d4.j.f61462e);
                }
            } else if (obj != a.f85521a) {
                sb2.append(C4235d4.j.f61460d);
                sb2.append("'");
                sb2.append(obj);
                sb2.append("'");
                sb2.append(C4235d4.j.f61462e);
            }
        }
        String string = sb2.toString();
        kotlin.jvm.internal.m0.o(string, "toString(...)");
        return string;
    }

    public final void b() {
        int i10 = this.f85520c;
        int[] iArr = this.f85519b;
        if (iArr[i10] == -2) {
            iArr[i10] = -1;
            this.f85520c = i10 - 1;
        }
        int i11 = this.f85520c;
        if (i11 != -1) {
            this.f85520c = i11 - 1;
        }
    }

    public final String c(Object obj) {
        String strH;
        bw.f fVar = obj instanceof bw.f ? (bw.f) obj : null;
        return (fVar == null || (strH = fVar.h()) == null) ? String.valueOf(obj) : strH;
    }

    public final void d(@oy.l bw.f sd2) {
        kotlin.jvm.internal.m0.p(sd2, "sd");
        int i10 = this.f85520c + 1;
        this.f85520c = i10;
        if (i10 == this.f85518a.length) {
            f();
        }
        this.f85518a[i10] = sd2;
    }

    public final void e() {
        int[] iArr = this.f85519b;
        int i10 = this.f85520c;
        if (iArr[i10] == -2) {
            this.f85518a[i10] = a.f85521a;
        }
    }

    public final void f() {
        int i10 = this.f85520c * 2;
        Object[] objArrCopyOf = Arrays.copyOf(this.f85518a, i10);
        kotlin.jvm.internal.m0.o(objArrCopyOf, "copyOf(...)");
        this.f85518a = objArrCopyOf;
        int[] iArrCopyOf = Arrays.copyOf(this.f85519b, i10);
        kotlin.jvm.internal.m0.o(iArrCopyOf, "copyOf(...)");
        this.f85519b = iArrCopyOf;
    }

    public final void g(@oy.m Object obj) {
        int[] iArr = this.f85519b;
        int i10 = this.f85520c;
        if (iArr[i10] != -2) {
            int i11 = i10 + 1;
            this.f85520c = i11;
            if (i11 == this.f85518a.length) {
                f();
            }
        }
        Object[] objArr = this.f85518a;
        int i12 = this.f85520c;
        objArr[i12] = obj;
        this.f85519b[i12] = -2;
    }

    public final void h(int i10) {
        this.f85519b[this.f85520c] = i10;
    }

    @oy.l
    public String toString() {
        return a();
    }
}
