package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class u0j0 implements jee0 {
    public final List<m0j0> a;
    public final long[] b;
    public final long[] c;

    public u0j0(ArrayList arrayList) {
        this.a = Collections.unmodifiableList(new ArrayList(arrayList));
        this.b = new long[arrayList.size() * 2];
        for (int i = 0; i < arrayList.size(); i++) {
            m0j0 m0j0Var = (m0j0) arrayList.get(i);
            int i2 = i * 2;
            long[] jArr = this.b;
            jArr[i2] = m0j0Var.b;
            jArr[i2 + 1] = m0j0Var.c;
        }
        long[] jArr2 = this.b;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.c = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // defpackage.jee0
    public final int a(long j) {
        long[] jArr = this.c;
        int iA = jrh0.a(jArr, j, false);
        if (iA < jArr.length) {
            return iA;
        }
        return -1;
    }

    @Override // defpackage.jee0
    public final List<j4c> b(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        while (true) {
            List<m0j0> list = this.a;
            if (i >= list.size()) {
                break;
            }
            int i2 = i * 2;
            long[] jArr = this.b;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                m0j0 m0j0Var = list.get(i);
                j4c j4cVar = m0j0Var.a;
                if (j4cVar.e == -3.4028235E38f) {
                    arrayList2.add(m0j0Var);
                } else {
                    arrayList.add(j4cVar);
                }
            }
            i++;
        }
        Collections.sort(arrayList2, new t0j0());
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            j4c.a aVarA = ((m0j0) arrayList2.get(i3)).a.a();
            aVarA.e = (-1) - i3;
            aVarA.f = 1;
            arrayList.add(aVarA.a());
        }
        return arrayList;
    }

    @Override // defpackage.jee0
    public final long c(int i) {
        ly0.b(i >= 0);
        long[] jArr = this.c;
        ly0.b(i < jArr.length);
        return jArr[i];
    }

    @Override // defpackage.jee0
    public final int d() {
        return this.c.length;
    }
}
