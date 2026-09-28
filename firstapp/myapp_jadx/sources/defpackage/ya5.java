package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public abstract class ya5 {
    public static final a a = new a();

    /* JADX INFO: loaded from: classes6.dex */
    public static final class a {
        public static hfs a(float f, float f2, int i, List list) {
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            if ((i & 4) != 0) {
                f2 = Float.POSITIVE_INFINITY;
            }
            return new hfs(list, null, (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (i & 8) != 0 ? 0 : 2);
        }

        public static hfs b(Pair[] pairArr) {
            return c((Pair[]) Arrays.copyOf(pairArr, pairArr.length), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static hfs c(Pair[] pairArr, long j, long j2) {
            ArrayList arrayList = new ArrayList(pairArr.length);
            for (Pair pair : pairArr) {
                j58 j58Var = (j58) pair.b;
                long j3 = j58Var.a;
                arrayList.add(j58Var);
            }
            ArrayList arrayList2 = new ArrayList(pairArr.length);
            for (Pair pair2 : pairArr) {
                arrayList2.add(Float.valueOf(((Number) pair2.a).floatValue()));
            }
            return new hfs(arrayList, arrayList2, j, j2, 0);
        }

        public static hfs d(List list, long j, long j2, int i) {
            if ((i & 2) != 0) {
                j = 0;
            }
            long j3 = j;
            if ((i & 4) != 0) {
                j2 = 9187343241974906880L;
            }
            return new hfs(list, null, j3, j2, 0);
        }

        public static hfs e(Pair[] pairArr, long j, long j2, int i) {
            if ((i & 2) != 0) {
                j = 0;
            }
            if ((i & 4) != 0) {
                j2 = 9187343241974906880L;
            }
            return c(pairArr, j, j2);
        }

        public static vu30 f(List list, long j, float f, int i) {
            if ((i & 2) != 0) {
                j = 9205357640488583168L;
            }
            long j2 = j;
            if ((i & 4) != 0) {
                f = Float.POSITIVE_INFINITY;
            }
            return new vu30(list, null, j2, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static vu30 g(Pair[] pairArr, long j, float f, int i) {
            if ((i & 2) != 0) {
                j = 9205357640488583168L;
            }
            long j2 = j;
            if ((i & 4) != 0) {
                f = Float.POSITIVE_INFINITY;
            }
            float f2 = f;
            ArrayList arrayList = new ArrayList(pairArr.length);
            for (Pair pair : pairArr) {
                j58 j58Var = (j58) pair.b;
                long j3 = j58Var.a;
                arrayList.add(j58Var);
            }
            ArrayList arrayList2 = new ArrayList(pairArr.length);
            for (Pair pair2 : pairArr) {
                arrayList2.add(Float.valueOf(((Number) pair2.a).floatValue()));
            }
            return new vu30(arrayList, arrayList2, j2, f2);
        }

        public static hfs h(a aVar, List list, float f, float f2, int i) {
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            if ((i & 4) != 0) {
                f2 = Float.POSITIVE_INFINITY;
            }
            return new hfs(list, null, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L), (i & 8) != 0 ? 0 : 2);
        }

        public static hfs i(Pair[] pairArr, int i) {
            float f = (i & 2) != 0 ? 0.0f : Float.POSITIVE_INFINITY;
            float f2 = (i & 4) == 0 ? 0.0f : Float.POSITIVE_INFINITY;
            return c((Pair[]) Arrays.copyOf(pairArr, pairArr.length), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32));
        }
    }

    public abstract void a(float f, long j, zqz zqzVar);
}
