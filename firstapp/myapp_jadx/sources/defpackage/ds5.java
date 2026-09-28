package defpackage;

import java.util.ArrayList;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
public final class ds5 {
    public final int a;
    public final String b;
    public final TreeSet<qj90> c = new TreeSet<>();
    public final ArrayList<a> d = new ArrayList<>();
    public mbd e;

    public static final class a {
        public final long a;
        public final long b;

        public a(long j, long j2) {
            this.a = j;
            this.b = j2;
        }
    }

    public ds5(int i, String str, mbd mbdVar) {
        this.a = i;
        this.b = str;
        this.e = mbdVar;
    }

    public final long a(long j, long j2) {
        ly0.b(j >= 0);
        ly0.b(j2 >= 0);
        qj90 qj90VarB = b(j, j2);
        long j3 = qj90VarB.c;
        if (!qj90VarB.d) {
            if (j3 == -1) {
                j3 = Long.MAX_VALUE;
            }
            return -Math.min(j3, j2);
        }
        long j4 = j + j2;
        long j5 = j4 >= 0 ? j4 : Long.MAX_VALUE;
        long jMax = qj90VarB.b + j3;
        if (jMax < j5) {
            for (qj90 qj90Var : this.c.tailSet(qj90VarB, false)) {
                long j6 = qj90Var.b;
                if (j6 > jMax) {
                    break;
                }
                jMax = Math.max(jMax, j6 + qj90Var.c);
                if (jMax >= j5) {
                    break;
                }
            }
        }
        return Math.min(jMax - j, j2);
    }

    public final qj90 b(long j, long j2) {
        long jMin = j2;
        qj90 qj90Var = new qj90(this.b, j, -1L, -9223372036854775807L, null);
        TreeSet<qj90> treeSet = this.c;
        qj90 qj90VarFloor = treeSet.floor(qj90Var);
        if (qj90VarFloor != null && qj90VarFloor.b + qj90VarFloor.c > j) {
            return qj90VarFloor;
        }
        qj90 qj90VarCeiling = treeSet.ceiling(qj90Var);
        if (qj90VarCeiling != null) {
            long j3 = qj90VarCeiling.b - j;
            jMin = jMin == -1 ? j3 : Math.min(j3, jMin);
        }
        return new qj90(this.b, j, jMin, -9223372036854775807L, null);
    }

    public final boolean c(long j, long j2) {
        int i = 0;
        while (true) {
            ArrayList<a> arrayList = this.d;
            if (i >= arrayList.size()) {
                return false;
            }
            a aVar = arrayList.get(i);
            long j3 = aVar.a;
            long j4 = aVar.b;
            if (j4 == -1) {
                if (j >= j3) {
                    return true;
                }
            } else if (j2 != -1 && j3 <= j && j + j2 <= j3 + j4) {
                return true;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ds5.class != obj.getClass()) {
            return false;
        }
        ds5 ds5Var = (ds5) obj;
        return this.a == ds5Var.a && this.b.equals(ds5Var.b) && this.c.equals(ds5Var.c) && this.e.equals(ds5Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + gmf0.a(this.a * 31, 31, this.b);
    }
}
