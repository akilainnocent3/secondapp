package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j630 implements xpe0.c {
    public final ArrayList<i630> a = new ArrayList<>();
    public final xpe0 b;
    public int c;
    public boolean d;

    public j630(xpe0 xpe0Var, ArrayList arrayList) {
        b(arrayList, false);
        b(arrayList, true);
        ArrayList<xpe0.c> arrayList2 = xpe0Var.b;
        if (!arrayList2.contains(this)) {
            arrayList2.add(this);
            d(xpe0Var.c, xpe0Var.d);
            e();
        }
        this.b = xpe0Var;
    }

    @Override // xpe0.c
    public final void a() {
        int i = this.c;
        boolean z = i > 0;
        int i2 = i - 1;
        this.c = i2;
        if (z && i2 == 0) {
            ArrayList<i630> arrayList = this.a;
            int size = arrayList.size() - 1;
            if (size < 0) {
                return;
            }
            arrayList.get(size).getClass();
            throw null;
        }
    }

    public final void b(List<i630> list, boolean z) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            i630 i630Var = list.get(i);
            i630Var.getClass();
            if (!z) {
                j630 j630Var = i630Var.a;
                if (j630Var != null) {
                    throw new IllegalStateException(i630Var + " is already controlled by " + j630Var);
                }
                i630Var.a = this;
                this.a.add(i630Var);
            }
        }
    }

    @Override // xpe0.c
    public final void c() {
        this.c++;
    }

    @Override // xpe0.c
    public final void d(ymn ymnVar, ymn ymnVar2) {
        ArrayList<i630> arrayList = this.a;
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        arrayList.get(size).getClass();
        throw null;
    }

    @Override // xpe0.c
    public final void e() {
        ArrayList<i630> arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).getClass();
        }
    }

    @Override // xpe0.c
    public final void f() {
        ArrayList<i630> arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).getClass();
        }
    }
}
