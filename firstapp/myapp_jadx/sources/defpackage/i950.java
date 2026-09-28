package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class i950 implements p4c {
    public final ArrayList<q4c> a = new ArrayList<>();

    /* JADX WARN: Code duplicated, block: B:13:0x0023  */
    @Override // defpackage.p4c
    public final boolean a(q4c q4cVar, long j) {
        boolean z;
        long j2 = q4cVar.b;
        ly0.b(j2 != -9223372036854775807L);
        if (j2 <= j) {
            long j3 = q4cVar.d;
            if (j3 == -9223372036854775807L || j < j3) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        ArrayList<q4c> arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j2 >= arrayList.get(size).b) {
                arrayList.add(size + 1, q4cVar);
                return z;
            }
            if (arrayList.get(size).b <= j) {
                z = false;
            }
        }
        arrayList.add(0, q4cVar);
        return z;
    }

    @Override // defpackage.p4c
    public final pcn<j4c> b(long j) {
        int iF = f(j);
        if (iF == 0) {
            pcn.b bVar = pcn.b;
            return c150.e;
        }
        q4c q4cVar = this.a.get(iF - 1);
        long j2 = q4cVar.d;
        if (j2 == -9223372036854775807L || j < j2) {
            return q4cVar.a;
        }
        pcn.b bVar2 = pcn.b;
        return c150.e;
    }

    @Override // defpackage.p4c
    public final long c(long j) {
        ArrayList<q4c> arrayList = this.a;
        if (arrayList.isEmpty() || j < arrayList.get(0).b) {
            return -9223372036854775807L;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            long j2 = arrayList.get(i).b;
            if (j == j2) {
                return j2;
            }
            if (j < j2) {
                q4c q4cVar = arrayList.get(i - 1);
                long j3 = q4cVar.d;
                return (j3 == -9223372036854775807L || j3 > j) ? q4cVar.b : j3;
            }
        }
        q4c q4cVar2 = (q4c) t3p.a(arrayList);
        long j4 = q4cVar2.d;
        return (j4 == -9223372036854775807L || j < j4) ? q4cVar2.b : j4;
    }

    @Override // defpackage.p4c
    public final void clear() {
        this.a.clear();
    }

    @Override // defpackage.p4c
    public final long d(long j) {
        ArrayList<q4c> arrayList = this.a;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j < arrayList.get(0).b) {
            return arrayList.get(0).b;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            long j2 = arrayList.get(i).b;
            if (j < j2) {
                long j3 = arrayList.get(i - 1).d;
                return (j3 == -9223372036854775807L || j3 <= j || j3 >= j2) ? j2 : j3;
            }
        }
        long j4 = ((q4c) t3p.a(arrayList)).d;
        if (j4 == -9223372036854775807L || j >= j4) {
            return Long.MIN_VALUE;
        }
        return j4;
    }

    @Override // defpackage.p4c
    public final void e(long j) {
        int iF = f(j);
        if (iF == 0) {
            return;
        }
        ArrayList<q4c> arrayList = this.a;
        long j2 = arrayList.get(iF - 1).d;
        if (j2 == -9223372036854775807L || j2 >= j) {
            iF--;
        }
        arrayList.subList(0, iF).clear();
    }

    public final int f(long j) {
        int i = 0;
        while (true) {
            ArrayList<q4c> arrayList = this.a;
            if (i >= arrayList.size()) {
                return arrayList.size();
            }
            if (j < arrayList.get(i).b) {
                return i;
            }
            i++;
        }
    }
}
