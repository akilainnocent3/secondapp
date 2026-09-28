package defpackage;

import androidx.media3.exoplayer.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class nnv implements zjv, zjv.a {
    public final zjv[] a;
    public final boolean[] b;
    public final IdentityHashMap<rs60, Integer> c;
    public final ArrayList<zjv> d = new ArrayList<>();
    public final HashMap<jjg0, jjg0> e = new HashMap<>();
    public zjv.a f;
    public ljg0 i;
    public zjv[] v;
    public kma w;

    public static final class a extends mui {
        public final jjg0 b;

        public a(oyg oygVar, jjg0 jjg0Var) {
            super(oygVar);
            this.b = jjg0Var;
        }

        @Override // defpackage.pjg0
        public final androidx.media3.common.a e(int i) {
            return this.b.d[this.a.f(i)];
        }

        @Override // defpackage.mui
        public final boolean equals(Object obj) {
            if (super.equals(obj) && (obj instanceof a)) {
                return this.b.equals(((a) obj).b);
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        @Override // defpackage.pjg0
        public final jjg0 m() {
            return this.b;
        }

        @Override // defpackage.oyg
        public final androidx.media3.common.a r() {
            return this.b.d[this.a.q()];
        }
    }

    public nnv(jbd jbdVar, long[] jArr, zjv... zjvVarArr) {
        this.a = zjvVarArr;
        pcn.b bVar = pcn.b;
        c150 c150Var = c150.e;
        this.w = new kma(c150Var, c150Var);
        this.c = new IdentityHashMap<>();
        this.v = new zjv[0];
        this.b = new boolean[zjvVarArr.length];
        for (int i = 0; i < zjvVarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.b[i] = true;
                this.a[i] = new nwf0(zjvVarArr[i], j);
            }
        }
    }

    @Override // defpackage.xc80
    public final boolean a() {
        return this.w.a();
    }

    @Override // defpackage.xc80
    public final boolean b(g gVar) {
        ArrayList<zjv> arrayList = this.d;
        if (arrayList.isEmpty()) {
            return this.w.b(gVar);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).b(gVar);
        }
        return false;
    }

    @Override // defpackage.zjv
    public final long c(oyg[] oygVarArr, boolean[] zArr, rs60[] rs60VarArr, boolean[] zArr2, long j) {
        IdentityHashMap<rs60, Integer> identityHashMap;
        int[] iArr = new int[oygVarArr.length];
        int[] iArr2 = new int[oygVarArr.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            int length = oygVarArr.length;
            identityHashMap = this.c;
            if (i2 >= length) {
                break;
            }
            rs60 rs60Var = rs60VarArr[i2];
            Integer num = rs60Var == null ? null : identityHashMap.get(rs60Var);
            iArr[i2] = num == null ? -1 : num.intValue();
            oyg oygVar = oygVarArr[i2];
            if (oygVar != null) {
                String str = oygVar.m().b;
                iArr2[i2] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i2] = -1;
            }
            i2++;
        }
        identityHashMap.clear();
        int length2 = oygVarArr.length;
        rs60[] rs60VarArr2 = new rs60[length2];
        rs60[] rs60VarArr3 = new rs60[oygVarArr.length];
        oyg[] oygVarArr2 = new oyg[oygVarArr.length];
        zjv[] zjvVarArr = this.a;
        ArrayList arrayList = new ArrayList(zjvVarArr.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < zjvVarArr.length) {
            int i4 = i;
            while (i4 < oygVarArr.length) {
                rs60VarArr3[i4] = iArr[i4] == i3 ? rs60VarArr[i4] : null;
                if (iArr2[i4] == i3) {
                    oyg oygVar2 = oygVarArr[i4];
                    oygVar2.getClass();
                    jjg0 jjg0Var = this.e.get(oygVar2.m());
                    jjg0Var.getClass();
                    oygVarArr2[i4] = new a(oygVar2, jjg0Var);
                } else {
                    oygVarArr2[i4] = null;
                }
                i4++;
                iArr = iArr;
            }
            int[] iArr3 = iArr;
            zjv[] zjvVarArr2 = zjvVarArr;
            int i5 = i3;
            long jC = zjvVarArr2[i3].c(oygVarArr2, zArr, rs60VarArr3, zArr2, j2);
            if (i5 == 0) {
                j2 = jC;
            } else if (jC != j2) {
                ib5.a("Children enabled at different positions.");
                return 0L;
            }
            boolean z = false;
            for (int i6 = 0; i6 < oygVarArr.length; i6++) {
                if (iArr2[i6] == i5) {
                    rs60 rs60Var2 = rs60VarArr3[i6];
                    rs60Var2.getClass();
                    rs60VarArr2[i6] = rs60VarArr3[i6];
                    identityHashMap.put(rs60Var2, Integer.valueOf(i5));
                    z = true;
                } else if (iArr3[i6] == i5) {
                    ly0.f(rs60VarArr3[i6] == null);
                }
            }
            if (z) {
                arrayList.add(zjvVarArr2[i5]);
            }
            i3 = i5 + 1;
            zjvVarArr = zjvVarArr2;
            iArr = iArr3;
            i = 0;
        }
        int i7 = i;
        System.arraycopy(rs60VarArr2, i7, rs60VarArr, i7, length2);
        this.v = (zjv[]) arrayList.toArray(new zjv[i7]);
        this.w = new kma(arrayList, cjs.a(arrayList, new mnv()));
        return j2;
    }

    @Override // defpackage.xc80
    public final long d() {
        return this.w.d();
    }

    @Override // xc80.a
    public final void e(xc80 xc80Var) {
        zjv.a aVar = this.f;
        aVar.getClass();
        aVar.e(this);
    }

    @Override // defpackage.zjv
    public final long f(long j, q480 q480Var) {
        zjv[] zjvVarArr = this.v;
        return (zjvVarArr.length > 0 ? zjvVarArr[0] : this.a[0]).f(j, q480Var);
    }

    @Override // zjv.a
    public final void g(zjv zjvVar) {
        ArrayList<zjv> arrayList = this.d;
        arrayList.remove(zjvVar);
        if (arrayList.isEmpty()) {
            zjv[] zjvVarArr = this.a;
            int i = 0;
            for (zjv zjvVar2 : zjvVarArr) {
                i += zjvVar2.q().a;
            }
            jjg0[] jjg0VarArr = new jjg0[i];
            int i2 = 0;
            for (int i3 = 0; i3 < zjvVarArr.length; i3++) {
                ljg0 ljg0VarQ = zjvVarArr[i3].q();
                int i4 = ljg0VarQ.a;
                int i5 = 0;
                while (i5 < i4) {
                    jjg0 jjg0VarA = ljg0VarQ.a(i5);
                    int i6 = jjg0VarA.a;
                    androidx.media3.common.a[] aVarArr = new androidx.media3.common.a[i6];
                    for (int i7 = 0; i7 < i6; i7++) {
                        androidx.media3.common.a aVar = jjg0VarA.d[i7];
                        androidx.media3.common.a.C0062a c0062aA = aVar.a();
                        StringBuilder sb = new StringBuilder();
                        sb.append(i3);
                        sb.append(":");
                        String str = aVar.a;
                        if (str == null) {
                            str = "";
                        }
                        sb.append(str);
                        c0062aA.a = sb.toString();
                        aVarArr[i7] = new androidx.media3.common.a(c0062aA);
                    }
                    jjg0 jjg0Var = new jjg0(i3 + ":" + jjg0VarA.b, aVarArr);
                    this.e.put(jjg0Var, jjg0VarA);
                    jjg0VarArr[i2] = jjg0Var;
                    i5++;
                    i2++;
                }
            }
            this.i = new ljg0(jjg0VarArr);
            zjv.a aVar2 = this.f;
            aVar2.getClass();
            aVar2.g(this);
        }
    }

    @Override // defpackage.zjv
    public final long h(long j) {
        long jH = this.v[0].h(j);
        int i = 1;
        while (true) {
            zjv[] zjvVarArr = this.v;
            if (i >= zjvVarArr.length) {
                return jH;
            }
            if (zjvVarArr[i].h(jH) != jH) {
                ib5.a("Unexpected child seekToUs result.");
                return 0L;
            }
            i++;
        }
    }

    @Override // defpackage.zjv
    public final long j() {
        long j;
        zjv zjvVar;
        zjv[] zjvVarArr = this.v;
        int length = zjvVarArr.length;
        long j2 = -9223372036854775807L;
        long j3 = -9223372036854775807L;
        int i = 0;
        while (i < length) {
            zjv zjvVar2 = zjvVarArr[i];
            long j4 = zjvVar2.j();
            if (j4 == j2) {
                j = j2;
                if (j3 != j && zjvVar2.h(j3) != j3) {
                    ib5.a("Unexpected child seekToUs result.");
                    return 0L;
                }
            } else if (j3 == j2) {
                zjv[] zjvVarArr2 = this.v;
                int length2 = zjvVarArr2.length;
                int i2 = 0;
                while (true) {
                    j = j2;
                    if (i2 >= length2 || (zjvVar = zjvVarArr2[i2]) == zjvVar2) {
                        break;
                    }
                    if (zjvVar.h(j4) != j4) {
                        ib5.a("Unexpected child seekToUs result.");
                        return 0L;
                    }
                    i2++;
                    j2 = j;
                }
                j3 = j4;
            } else {
                j = j2;
                if (j4 != j3) {
                    ib5.a("Conflicting discontinuities.");
                    return 0L;
                }
            }
            i++;
            j2 = j;
        }
        return j3;
    }

    @Override // defpackage.zjv
    public final void m() {
        for (zjv zjvVar : this.a) {
            zjvVar.m();
        }
    }

    @Override // defpackage.zjv
    public final void o(zjv.a aVar, long j) {
        this.f = aVar;
        ArrayList<zjv> arrayList = this.d;
        zjv[] zjvVarArr = this.a;
        Collections.addAll(arrayList, zjvVarArr);
        for (zjv zjvVar : zjvVarArr) {
            zjvVar.o(this, j);
        }
    }

    @Override // defpackage.zjv
    public final ljg0 q() {
        ljg0 ljg0Var = this.i;
        ljg0Var.getClass();
        return ljg0Var;
    }

    @Override // defpackage.xc80
    public final long s() {
        return this.w.s();
    }

    @Override // defpackage.zjv
    public final void u(long j, boolean z) {
        for (zjv zjvVar : this.v) {
            zjvVar.u(j, z);
        }
    }

    @Override // defpackage.xc80
    public final void v(long j) {
        this.w.v(j);
    }
}
