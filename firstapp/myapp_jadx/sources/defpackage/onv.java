package defpackage;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class onv extends jma<Integer> {
    public static final njv s;
    public final ekv[] k;
    public final ArrayList l;
    public final qxf0[] m;
    public final ArrayList<ekv> n;
    public final jbd o;
    public int p;
    public long[][] q;
    public a r;

    public static final class a extends IOException {
    }

    public static final class b {
        public final ekv.b a;
        public final zjv b;

        public b(ekv.b bVar, zjv zjvVar) {
            this.a = bVar;
            this.b = zjvVar;
        }
    }

    static {
        njv.a.C0902a c0902a = new njv.a.C0902a();
        new njv.c.a();
        List list = Collections.EMPTY_LIST;
        pcn.b bVar = pcn.b;
        c150 c150Var = c150.e;
        njv.d.a aVar = new njv.d.a();
        s = new njv("MergingMediaSource", new njv.b(c0902a), null, new njv.d(aVar), qjv.B, njv.f.a);
    }

    public onv(ekv... ekvVarArr) {
        jbd jbdVar = new jbd();
        this.k = ekvVarArr;
        this.o = jbdVar;
        this.n = new ArrayList<>(Arrays.asList(ekvVarArr));
        this.p = -1;
        this.l = new ArrayList(ekvVarArr.length);
        for (int i = 0; i < ekvVarArr.length; i++) {
            this.l.add(new ArrayList());
        }
        this.m = new qxf0[ekvVarArr.length];
        this.q = new long[0][];
        new HashMap();
        s38.b(8, "expectedKeys");
        s38.b(2, "expectedValuesPerKey");
        ml8 ml8VarB = ml8.b(8);
        hmw hmwVar = new hmw();
        s38.b(2, "expectedValuesPerKey");
        new imw(ml8VarB).f = hmwVar;
    }

    @Override // defpackage.ekv
    public final zjv c(ekv.b bVar, tf tfVar, long j) {
        ekv[] ekvVarArr = this.k;
        int length = ekvVarArr.length;
        zjv[] zjvVarArr = new zjv[length];
        qxf0[] qxf0VarArr = this.m;
        int iB = qxf0VarArr[0].b(bVar.a);
        for (int i = 0; i < length; i++) {
            ekv.b bVarA = bVar.a(qxf0VarArr[i].l(iB));
            zjvVarArr[i] = ekvVarArr[i].c(bVarA, tfVar, j - this.q[iB][i]);
            ((List) this.l.get(i)).add(new b(bVarA, zjvVarArr[i]));
        }
        return new nnv(this.o, this.q[iB], zjvVarArr);
    }

    @Override // defpackage.ekv
    public final njv e() {
        ekv[] ekvVarArr = this.k;
        return ekvVarArr.length > 0 ? ekvVarArr[0].e() : s;
    }

    @Override // defpackage.ekv
    public final void g(njv njvVar) {
        this.k[0].g(njvVar);
    }

    @Override // defpackage.jma, defpackage.ekv
    public final void l() throws a {
        a aVar = this.r;
        if (aVar != null) {
            throw aVar;
        }
        super.l();
    }

    @Override // defpackage.ekv
    public final void o(zjv zjvVar) {
        nnv nnvVar = (nnv) zjvVar;
        int i = 0;
        while (true) {
            ekv[] ekvVarArr = this.k;
            if (i >= ekvVarArr.length) {
                return;
            }
            List list = (List) this.l.get(i);
            boolean[] zArr = nnvVar.b;
            zjv[] zjvVarArr = nnvVar.a;
            zjv zjvVar2 = zArr[i] ? ((nwf0) zjvVarArr[i]).a : zjvVarArr[i];
            for (int i2 = 0; i2 < list.size(); i2++) {
                if (((b) list.get(i2)).b.equals(zjvVar2)) {
                    list.remove(i2);
                    break;
                }
            }
            ekvVarArr[i].o(nnvVar.b[i] ? ((nwf0) zjvVarArr[i]).a : zjvVarArr[i]);
            i++;
        }
    }

    @Override // defpackage.h32
    public final void r(mrg0 mrg0Var) {
        this.j = mrg0Var;
        this.i = jrh0.p(null);
        int i = 0;
        while (true) {
            ekv[] ekvVarArr = this.k;
            if (i >= ekvVarArr.length) {
                return;
            }
            y(Integer.valueOf(i), ekvVarArr[i]);
            i++;
        }
    }

    @Override // defpackage.jma, defpackage.h32
    public final void t() {
        super.t();
        Arrays.fill(this.m, (Object) null);
        this.p = -1;
        this.r = null;
        ArrayList<ekv> arrayList = this.n;
        arrayList.clear();
        Collections.addAll(arrayList, this.k);
    }

    @Override // defpackage.jma
    public final ekv.b u(Integer num, ekv.b bVar) {
        int iIntValue = num.intValue();
        ArrayList arrayList = this.l;
        List list = (List) arrayList.get(iIntValue);
        for (int i = 0; i < list.size(); i++) {
            if (((b) list.get(i)).a.equals(bVar)) {
                return ((b) ((List) arrayList.get(0)).get(i)).a;
            }
        }
        return null;
    }

    @Override // defpackage.jma
    public final void x(Object obj, h32 h32Var, qxf0 qxf0Var) {
        int iH;
        Integer num = (Integer) obj;
        if (this.r != null) {
            return;
        }
        if (this.p == -1) {
            iH = qxf0Var.h();
            this.p = iH;
        } else {
            int iH2 = qxf0Var.h();
            int i = this.p;
            if (iH2 != i) {
                this.r = new a();
                return;
            }
            iH = i;
        }
        int length = this.q.length;
        qxf0[] qxf0VarArr = this.m;
        if (length == 0) {
            this.q = (long[][]) Array.newInstance((Class<?>) Long.TYPE, iH, qxf0VarArr.length);
        }
        ArrayList<ekv> arrayList = this.n;
        arrayList.remove(h32Var);
        qxf0VarArr[num.intValue()] = qxf0Var;
        if (arrayList.isEmpty()) {
            s(qxf0VarArr[0]);
        }
    }
}
