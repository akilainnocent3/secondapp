package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public interface j00 {

    public static final class a {
        public final long a;
        public final qxf0 b;
        public final int c;
        public final ekv.b d;
        public final long e;
        public final qxf0 f;
        public final int g;
        public final ekv.b h;
        public final long i;
        public final long j;

        public a(long j, qxf0 qxf0Var, int i, ekv.b bVar, long j2, qxf0 qxf0Var2, int i2, ekv.b bVar2, long j3, long j4) {
            this.a = j;
            this.b = qxf0Var;
            this.c = i;
            this.d = bVar;
            this.e = j2;
            this.f = qxf0Var2;
            this.g = i2;
            this.h = bVar2;
            this.i = j3;
            this.j = j4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.a == aVar.a && this.c == aVar.c && this.e == aVar.e && this.g == aVar.g && this.i == aVar.i && this.j == aVar.j && Objects.equals(this.b, aVar.b) && Objects.equals(this.d, aVar.d) && Objects.equals(this.f, aVar.f) && Objects.equals(this.h, aVar.h)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, Long.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, Long.valueOf(this.i), Long.valueOf(this.j));
        }
    }

    public static final class b {
        public final iuh a;
        public final SparseArray<a> b;

        public b(iuh iuhVar, SparseArray<a> sparseArray) {
            this.a = iuhVar;
            SparseBooleanArray sparseBooleanArray = iuhVar.a;
            SparseArray<a> sparseArray2 = new SparseArray<>(sparseBooleanArray.size());
            for (int i = 0; i < sparseBooleanArray.size(); i++) {
                int iA = iuhVar.a(i);
                a aVar = sparseArray.get(iA);
                aVar.getClass();
                sparseArray2.append(iA, aVar);
            }
            this.b = sparseArray2;
        }

        public final boolean a(int i) {
            return this.a.a.get(i);
        }

        public final a b(int i) {
            a aVar = this.b.get(i);
            aVar.getClass();
            return aVar;
        }
    }

    default void a(v5i0 v5i0Var) {
    }

    default void b(e5d e5dVar) {
    }

    default void i(bo10 bo10Var) {
    }

    default void j(pjv pjvVar, IOException iOException) {
    }

    default void m(so10.d dVar, int i) {
    }

    default void n(a aVar, pjv pjvVar) {
    }

    default void p(so10 so10Var, b bVar) {
    }

    default void k(a aVar, int i, long j) {
    }

    default void l(a aVar, androidx.media3.common.a aVar2, i5d i5dVar) {
    }

    default void o(a aVar, int i, long j) {
    }
}
