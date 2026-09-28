package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class s4c implements jee0 {
    public static final qk5 c;
    public final pcn<pcn<j4c>> a;
    public final long[] b;

    static {
        zex zexVar = zex.a;
        r4c r4cVar = new r4c();
        zexVar.getClass();
        c = new qk5(r4cVar, zexVar);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00cf  */
    public s4c(c150 c150Var) {
        int i = c150Var.d;
        long j = -9223372036854775807L;
        int i2 = 0;
        if (i == 1) {
            pcn.b bVarListIterator = c150Var.listIterator(0);
            Object next = bVarListIterator.next();
            if (bVarListIterator.hasNext()) {
                StringBuilder sb = new StringBuilder("expected one element but was: <");
                sb.append(next);
                while (i2 < 4 && bVarListIterator.hasNext()) {
                    sb.append(", ");
                    sb.append(bVarListIterator.next());
                    i2++;
                }
                if (bVarListIterator.hasNext()) {
                    sb.append(", ...");
                }
                sb.append('>');
                throw new IllegalArgumentException(sb.toString());
            }
            q4c q4cVar = (q4c) next;
            long j2 = q4cVar.b;
            long j3 = q4cVar.c;
            long j4 = j2 == -9223372036854775807L ? 0L : j2;
            pcn<j4c> pcnVar = q4cVar.a;
            if (j3 == -9223372036854775807L) {
                this.a = pcn.n(pcnVar);
                this.b = new long[]{j4};
                return;
            } else {
                pcn.b bVar = pcn.b;
                this.a = pcn.o(pcnVar, c150.e);
                this.b = new long[]{j4, j3 + j4};
                return;
            }
        }
        long[] jArr = new long[i * 2];
        this.b = jArr;
        Arrays.fill(jArr, Long.MAX_VALUE);
        ArrayList arrayList = new ArrayList();
        c150 c150VarQ = pcn.q(c, c150Var);
        int i3 = 0;
        while (i2 < c150VarQ.d) {
            q4c q4cVar2 = (q4c) c150VarQ.get(i2);
            long j5 = q4cVar2.b;
            long j6 = q4cVar2.c;
            pcn<j4c> pcnVar2 = q4cVar2.a;
            j5 = j5 == j ? 0L : j5;
            long j7 = j5 + j6;
            if (i3 != 0) {
                int i4 = i3 - 1;
                long j8 = this.b[i4];
                if (j8 < j5) {
                    this.b[i3] = j5;
                    arrayList.add(pcnVar2);
                    i3++;
                } else if (j8 == j5 && ((pcn) arrayList.get(i4)).isEmpty()) {
                    arrayList.set(i4, pcnVar2);
                } else {
                    cft.g("CuesWithTimingSubtitle", "Truncating unsupported overlapping cues.");
                    this.b[i4] = j5;
                    arrayList.set(i4, pcnVar2);
                }
            } else {
                this.b[i3] = j5;
                arrayList.add(pcnVar2);
                i3++;
            }
            if (j6 != j) {
                this.b[i3] = j7;
                arrayList.add(c150.e);
                i3++;
            }
            i2++;
            j = j;
        }
        this.a = pcn.j(arrayList);
    }

    @Override // defpackage.jee0
    public final int a(long j) {
        int iA = jrh0.a(this.b, j, false);
        if (iA < this.a.size()) {
            return iA;
        }
        return -1;
    }

    @Override // defpackage.jee0
    public final List b(long j) {
        int iE = jrh0.e(this.b, j, false);
        if (iE != -1) {
            return this.a.get(iE);
        }
        pcn.b bVar = pcn.b;
        return c150.e;
    }

    @Override // defpackage.jee0
    public final long c(int i) {
        ly0.b(i < this.a.size());
        return this.b[i];
    }

    @Override // defpackage.jee0
    public final int d() {
        return this.a.size();
    }
}
