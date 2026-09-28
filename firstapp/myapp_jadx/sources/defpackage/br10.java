package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class br10 extends t2 {
    public final int e;
    public final int f;
    public final int[] g;
    public final int[] h;
    public final qxf0[] i;
    public final Object[] j;
    public final HashMap<Object, Integer> k;

    public br10(qxf0[] qxf0VarArr, Object[] objArr, tb90 tb90Var) {
        super(tb90Var);
        int length = qxf0VarArr.length;
        this.i = qxf0VarArr;
        this.g = new int[length];
        this.h = new int[length];
        this.j = objArr;
        this.k = new HashMap<>();
        int length2 = qxf0VarArr.length;
        int i = 0;
        int iO = 0;
        int iH = 0;
        int i2 = 0;
        while (i < length2) {
            qxf0 qxf0Var = qxf0VarArr[i];
            this.i[i2] = qxf0Var;
            this.h[i2] = iO;
            this.g[i2] = iH;
            iO += qxf0Var.o();
            iH += this.i[i2].h();
            this.k.put(objArr[i2], Integer.valueOf(i2));
            i++;
            i2++;
        }
        this.e = iO;
        this.f = iH;
    }

    @Override // defpackage.qxf0
    public final int h() {
        return this.f;
    }

    @Override // defpackage.qxf0
    public final int o() {
        return this.e;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public br10(ArrayList arrayList, tb90 tb90Var) {
        qxf0[] qxf0VarArr = new qxf0[arrayList.size()];
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            qxf0VarArr[i2] = ((nkv) obj).b();
            i2++;
        }
        Object[] objArr = new Object[arrayList.size()];
        int size2 = arrayList.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList.get(i4);
            i4++;
            objArr[i] = ((nkv) obj2).a();
            i++;
        }
        this(qxf0VarArr, objArr, tb90Var);
    }
}
