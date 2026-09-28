package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class n92 {
    public final ArrayList<ixa> a = new ArrayList<>();
    public final a b = new a();
    public final jxa c;

    public static class a {
        public ixa.a a;
        public ixa.a b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public boolean h;
        public boolean i;
        public int j;
    }

    public interface b {
        void a();

        void b(ixa ixaVar, a aVar);
    }

    public n92(jxa jxaVar) {
        this.c = jxaVar;
    }

    public final boolean a(int i, b bVar, ixa ixaVar) {
        ixa.a[] aVarArr = ixaVar.V;
        int[] iArr = ixaVar.u;
        ixa.a aVar = aVarArr[0];
        a aVar2 = this.b;
        aVar2.a = aVar;
        aVar2.b = aVarArr[1];
        aVar2.c = ixaVar.s();
        aVar2.d = ixaVar.m();
        aVar2.i = false;
        aVar2.j = i;
        ixa.a aVar3 = aVar2.a;
        ixa.a aVar4 = ixa.a.c;
        boolean z = aVar3 == aVar4;
        boolean z2 = aVar2.b == aVar4;
        boolean z3 = z && ixaVar.Z > 0.0f;
        boolean z4 = z2 && ixaVar.Z > 0.0f;
        ixa.a aVar5 = ixa.a.a;
        if (z3 && iArr[0] == 4) {
            aVar2.a = aVar5;
        }
        if (z4 && iArr[1] == 4) {
            aVar2.b = aVar5;
        }
        bVar.b(ixaVar, aVar2);
        ixaVar.T(aVar2.e);
        ixaVar.O(aVar2.f);
        ixaVar.F = aVar2.h;
        ixaVar.K(aVar2.g);
        aVar2.j = 0;
        return aVar2.i;
    }

    public final void b(jxa jxaVar, int i, int i2, int i3) {
        int i4 = jxaVar.e0;
        int i5 = jxaVar.f0;
        jxaVar.e0 = 0;
        jxaVar.f0 = 0;
        jxaVar.T(i2);
        jxaVar.O(i3);
        if (i4 < 0) {
            jxaVar.e0 = 0;
        } else {
            jxaVar.e0 = i4;
        }
        if (i5 < 0) {
            jxaVar.f0 = 0;
        } else {
            jxaVar.f0 = i5;
        }
        jxa jxaVar2 = this.c;
        jxaVar2.y0 = i;
        jxaVar2.X();
    }

    public final void c(jxa jxaVar) {
        ArrayList<ixa> arrayList = this.a;
        arrayList.clear();
        int size = jxaVar.v0.size();
        for (int i = 0; i < size; i++) {
            ixa ixaVar = jxaVar.v0.get(i);
            ixa.a[] aVarArr = ixaVar.V;
            ixa.a aVar = aVarArr[0];
            ixa.a aVar2 = ixa.a.c;
            if (aVar == aVar2 || aVarArr[1] == aVar2) {
                arrayList.add(ixaVar);
            }
        }
        jxaVar.x0.b = true;
    }
}
