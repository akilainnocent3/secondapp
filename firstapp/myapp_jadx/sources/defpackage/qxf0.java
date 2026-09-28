package defpackage;

import android.net.Uri;
import android.util.Pair;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class qxf0 {
    public static final a a = new a();

    public class a extends qxf0 {
        @Override // defpackage.qxf0
        public final int b(Object obj) {
            return -1;
        }

        @Override // defpackage.qxf0
        public final b f(int i, b bVar, boolean z) {
            throw new IndexOutOfBoundsException();
        }

        @Override // defpackage.qxf0
        public final int h() {
            return 0;
        }

        @Override // defpackage.qxf0
        public final Object l(int i) {
            throw new IndexOutOfBoundsException();
        }

        @Override // defpackage.qxf0
        public final c m(int i, c cVar, long j) {
            throw new IndexOutOfBoundsException();
        }

        @Override // defpackage.qxf0
        public final int o() {
            return 0;
        }
    }

    public static final class b {
        public Object a;
        public Object b;
        public int c;
        public long d;
        public long e;
        public boolean f;
        public kf g = kf.c;

        static {
            jf.a(0, 1, 2, 3, 4);
        }

        public final long a(int i, int i2) {
            kf.a aVarA = this.g.a(i);
            if (aVarA.a != -1) {
                return aVarA.e[i2];
            }
            return -9223372036854775807L;
        }

        public final int b(long j) {
            kf.a aVarA;
            int i;
            kf kfVar = this.g;
            long j2 = this.d;
            int i2 = kfVar.a;
            if (j != Long.MIN_VALUE && (j2 == -9223372036854775807L || j < j2)) {
                int i3 = 0;
                while (i3 < i2) {
                    kfVar.a(i3).getClass();
                    kfVar.a(i3).getClass();
                    if (0 > j && ((i = (aVarA = kfVar.a(i3)).a) == -1 || aVarA.a(-1) < i)) {
                        break;
                    }
                    i3++;
                }
                if (i3 < i2) {
                    if (j2 != -9223372036854775807L) {
                        kfVar.a(i3).getClass();
                        if (0 <= j2) {
                        }
                    }
                    return i3;
                }
            }
            return -1;
        }

        public final int c(long j) {
            kf kfVar = this.g;
            int i = kfVar.a;
            int i2 = i - 1;
            if (i2 == i - 1) {
                kfVar.a(i2).getClass();
            }
            while (i2 >= 0 && j != Long.MIN_VALUE) {
                kfVar.a(i2).getClass();
                if (j >= 0) {
                    break;
                }
                i2--;
            }
            if (i2 >= 0) {
                kf.a aVarA = kfVar.a(i2);
                int i3 = aVarA.a;
                if (i3 != -1) {
                    for (int i4 = 0; i4 < i3; i4++) {
                        int i5 = aVarA.d[i4];
                        if (i5 != 0 && i5 != 1) {
                        }
                    }
                }
                return i2;
            }
            return -1;
        }

        public final long d(int i) {
            this.g.a(i).getClass();
            return 0L;
        }

        public final int e(int i) {
            return this.g.a(i).a(-1);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !b.class.equals(obj.getClass())) {
                return false;
            }
            b bVar = (b) obj;
            return Objects.equals(this.a, bVar.a) && Objects.equals(this.b, bVar.b) && this.c == bVar.c && this.d == bVar.d && this.e == bVar.e && this.f == bVar.f && Objects.equals(this.g, bVar.g);
        }

        public final boolean f(int i) {
            kf kfVar = this.g;
            int i2 = kfVar.a;
            if (i != i2 - 1 || i != i2 - 1) {
                return false;
            }
            kfVar.a(i).getClass();
            return false;
        }

        public final boolean g(int i) {
            this.g.a(i).getClass();
            return false;
        }

        public final void h(Object obj, Object obj2, int i, long j, long j2, kf kfVar, boolean z) {
            this.a = obj;
            this.b = obj2;
            this.c = i;
            this.d = j;
            this.e = j2;
            this.g = kfVar;
            this.f = z;
        }

        public final int hashCode() {
            Object obj = this.a;
            int iHashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.b;
            int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.c) * 31;
            long j = this.d;
            int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.e;
            return this.g.hashCode() + ((((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f ? 1 : 0)) * 31);
        }
    }

    public static final class c {
        public static final Object p = new Object();
        public static final njv q;
        public Object a = p;
        public njv b = q;
        public Object c;
        public long d;
        public long e;
        public long f;
        public boolean g;
        public boolean h;
        public njv.d i;
        public boolean j;
        public long k;
        public long l;
        public int m;
        public int n;
        public long o;

        static {
            njv.a.C0902a c0902a = new njv.a.C0902a();
            new njv.c.a();
            List list = Collections.EMPTY_LIST;
            pcn.b bVar = pcn.b;
            c150 c150Var = c150.e;
            njv.d.a aVar = new njv.d.a();
            njv.f fVar = njv.f.a;
            Uri uri = Uri.EMPTY;
            q = new njv("androidx.media3.common.Timeline", new njv.b(c0902a), uri != null ? new njv.e(uri, null, null, list, c150Var, -9223372036854775807L) : null, new njv.d(aVar), qjv.B, fVar);
            jf.a(1, 2, 3, 4, 5);
            jf.a(6, 7, 8, 9, 10);
            jrh0.J(11);
            jrh0.J(12);
            jrh0.J(13);
        }

        public final boolean a() {
            return this.i != null;
        }

        public final void b(njv njvVar, Object obj, long j, long j2, long j3, boolean z, boolean z2, njv.d dVar, long j4, long j5, long j6) {
            this.a = p;
            this.b = njvVar != null ? njvVar : q;
            if (njvVar != null) {
                njv.e eVar = njvVar.b;
            }
            this.c = obj;
            this.d = j;
            this.e = j2;
            this.f = j3;
            this.g = z;
            this.h = z2;
            this.i = dVar;
            this.k = j4;
            this.l = j5;
            this.m = 0;
            this.n = 0;
            this.o = j6;
            this.j = false;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !c.class.equals(obj.getClass())) {
                return false;
            }
            c cVar = (c) obj;
            return Objects.equals(this.a, cVar.a) && Objects.equals(this.b, cVar.b) && Objects.equals(this.c, cVar.c) && Objects.equals(this.i, cVar.i) && this.d == cVar.d && this.e == cVar.e && this.f == cVar.f && this.g == cVar.g && this.h == cVar.h && this.j == cVar.j && this.k == cVar.k && this.l == cVar.l && this.m == cVar.m && this.n == cVar.n && this.o == cVar.o;
        }

        public final int hashCode() {
            int iHashCode = (this.b.hashCode() + ((this.a.hashCode() + 217) * 31)) * 31;
            Object obj = this.c;
            int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            njv.d dVar = this.i;
            int iHashCode3 = (iHashCode2 + (dVar != null ? dVar.hashCode() : 0)) * 31;
            long j = this.d;
            int i = (iHashCode3 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.e;
            int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.f;
            int i3 = (((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.j ? 1 : 0)) * 31;
            long j4 = this.k;
            int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
            long j5 = this.l;
            int i5 = (((((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.m) * 31) + this.n) * 31;
            long j6 = this.o;
            return i5 + ((int) (j6 ^ (j6 >>> 32)));
        }
    }

    static {
        jrh0.J(0);
        jrh0.J(1);
        jrh0.J(2);
    }

    public int a(boolean z) {
        return p() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z) {
        if (p()) {
            return -1;
        }
        return o() - 1;
    }

    public final int d(int i, b bVar, c cVar, int i2, boolean z) {
        int i3 = f(i, bVar, false).c;
        if (m(i3, cVar, 0L).n != i) {
            return i + 1;
        }
        int iE = e(i3, i2, z);
        if (iE == -1) {
            return -1;
        }
        return m(iE, cVar, 0L).m;
    }

    public int e(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == c(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == c(z) ? a(z) : i + 1;
        }
        fm20.a();
        return 0;
    }

    public boolean equals(Object obj) {
        int iC;
        if (this != obj) {
            if (obj instanceof qxf0) {
                qxf0 qxf0Var = (qxf0) obj;
                if (qxf0Var.o() == o() && qxf0Var.h() == h()) {
                    c cVar = new c();
                    b bVar = new b();
                    c cVar2 = new c();
                    b bVar2 = new b();
                    for (int i = 0; i < o(); i++) {
                        if (m(i, cVar, 0L).equals(qxf0Var.m(i, cVar2, 0L))) {
                        }
                    }
                    for (int i2 = 0; i2 < h(); i2++) {
                        if (f(i2, bVar, true).equals(qxf0Var.f(i2, bVar2, true))) {
                        }
                    }
                    int iA = a(true);
                    if (iA == qxf0Var.a(true) && (iC = c(true)) == qxf0Var.c(true)) {
                        while (iA != iC) {
                            int iE = e(iA, 0, true);
                            if (iE == qxf0Var.e(iA, 0, true)) {
                                iA = iE;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public abstract b f(int i, b bVar, boolean z);

    public b g(Object obj, b bVar) {
        return f(b(obj), bVar, true);
    }

    public abstract int h();

    public int hashCode() {
        c cVar = new c();
        b bVar = new b();
        int iO = o() + 217;
        for (int i = 0; i < o(); i++) {
            iO = (iO * 31) + m(i, cVar, 0L).hashCode();
        }
        int iH = h() + (iO * 31);
        for (int i2 = 0; i2 < h(); i2++) {
            iH = (iH * 31) + f(i2, bVar, true).hashCode();
        }
        int iA = a(true);
        while (iA != -1) {
            iH = (iH * 31) + iA;
            iA = e(iA, 0, true);
        }
        return iH;
    }

    public final Pair<Object, Long> i(c cVar, b bVar, int i, long j) {
        Pair<Object, Long> pairJ = j(cVar, bVar, i, j, 0L);
        pairJ.getClass();
        return pairJ;
    }

    public final Pair<Object, Long> j(c cVar, b bVar, int i, long j, long j2) {
        ly0.c(i, o());
        m(i, cVar, j2);
        if (j == -9223372036854775807L) {
            j = cVar.k;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = cVar.m;
        f(i2, bVar, false);
        while (i2 < cVar.n && bVar.e != j) {
            int i3 = i2 + 1;
            if (f(i3, bVar, false).e > j) {
                break;
            }
            i2 = i3;
        }
        f(i2, bVar, true);
        long jMin = j - bVar.e;
        long j3 = bVar.d;
        if (j3 != -9223372036854775807L) {
            jMin = Math.min(jMin, j3 - 1);
        }
        long jMax = Math.max(0L, jMin);
        Object obj = bVar.b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public int k(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == a(z)) {
                return -1;
            }
            return i - 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == a(z) ? c(z) : i - 1;
        }
        fm20.a();
        return 0;
    }

    public abstract Object l(int i);

    public abstract c m(int i, c cVar, long j);

    public final void n(int i, c cVar) {
        m(i, cVar, 0L);
    }

    public abstract int o();

    public final boolean p() {
        return o() == 0;
    }
}
