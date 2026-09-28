package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class lnv implements p4c {
    public static final pna b;
    public final ArrayList a = new ArrayList();

    static {
        zex zexVar = zex.a;
        ufc ufcVar = new ufc();
        zexVar.getClass();
        qk5 qk5Var = new qk5(ufcVar, zexVar);
        xo50 xo50Var = xo50.a;
        knv knvVar = new knv();
        xo50Var.getClass();
        b = new pna(qk5Var, new qk5(knvVar, xo50Var));
    }

    @Override // defpackage.p4c
    public final boolean a(q4c q4cVar, long j) {
        long j2 = q4cVar.b;
        ly0.b(j2 != -9223372036854775807L);
        ly0.b(q4cVar.c != -9223372036854775807L);
        boolean z = j2 <= j && j < q4cVar.d;
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j2 >= ((q4c) arrayList.get(size)).b) {
                arrayList.add(size + 1, q4cVar);
                return z;
            }
        }
        arrayList.add(0, q4cVar);
        return z;
    }

    @Override // defpackage.p4c
    public final pcn<j4c> b(long j) {
        ArrayList arrayList = this.a;
        if (!arrayList.isEmpty()) {
            if (j >= ((q4c) arrayList.get(0)).b) {
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < arrayList.size(); i++) {
                    q4c q4cVar = (q4c) arrayList.get(i);
                    if (j >= q4cVar.b && j < q4cVar.d) {
                        arrayList2.add(q4cVar);
                    }
                    if (j < q4cVar.b) {
                        break;
                    }
                }
                c150 c150VarQ = pcn.q(b, arrayList2);
                pcn.a aVar = new pcn.a();
                for (int i2 = 0; i2 < c150VarQ.d; i2++) {
                    aVar.e(((q4c) c150VarQ.get(i2)).a);
                }
                return aVar.g();
            }
        }
        pcn.b bVar = pcn.b;
        return c150.e;
    }

    @Override // defpackage.p4c
    public final long c(long j) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j < ((q4c) arrayList.get(0)).b) {
            return -9223372036854775807L;
        }
        long jMax = ((q4c) arrayList.get(0)).b;
        for (int i = 0; i < arrayList.size(); i++) {
            long j2 = ((q4c) arrayList.get(i)).b;
            long j3 = ((q4c) arrayList.get(i)).d;
            if (j3 > j) {
                if (j2 > j) {
                    break;
                }
                jMax = Math.max(jMax, j2);
            } else {
                jMax = Math.max(jMax, j3);
            }
        }
        return jMax;
    }

    @Override // defpackage.p4c
    public final void clear() {
        this.a.clear();
    }

    @Override // defpackage.p4c
    public final long d(long j) {
        int i = 0;
        long jMin = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                break;
            }
            long j2 = ((q4c) arrayList.get(i)).b;
            long j3 = ((q4c) arrayList.get(i)).d;
            if (j < j2) {
                if (jMin != -9223372036854775807L) {
                    jMin = Math.min(jMin, j2);
                    break;
                }
                jMin = j2;
                break;
            }
            if (j < j3) {
                jMin = jMin == -9223372036854775807L ? j3 : Math.min(jMin, j3);
            }
            i++;
        }
        if (jMin != -9223372036854775807L) {
            return jMin;
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.p4c
    public final void e(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return;
            }
            long j2 = ((q4c) arrayList.get(i)).b;
            if (j > j2 && j > ((q4c) arrayList.get(i)).d) {
                arrayList.remove(i);
                i--;
            } else if (j < j2) {
                return;
            }
            i++;
        }
    }
}
