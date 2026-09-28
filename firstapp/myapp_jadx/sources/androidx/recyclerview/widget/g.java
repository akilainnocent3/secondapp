package androidx.recyclerview.widget;

import android.util.SparseArray;
import defpackage.hb5;
import defpackage.hce0;
import defpackage.nke;
import java.util.ArrayList;
import java.util.IdentityHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class g implements y.b {
    public final f a;
    public final o0 b;
    public final ArrayList c = new ArrayList();
    public final IdentityHashMap<RecyclerView.d0, y> d = new IdentityHashMap<>();
    public final ArrayList e = new ArrayList();
    public a f = new a();
    public final l0 g;

    public static class a {
        public y a;
        public int b;
        public boolean c;
    }

    public g(f fVar) {
        this.a = fVar;
        o0.a aVar = new o0.a();
        aVar.a = new SparseArray<>();
        aVar.b = 0;
        this.b = aVar;
        this.g = new l0.a();
    }

    public final void a() {
        RecyclerView.f.a aVar;
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                aVar = RecyclerView.f.a.a;
                break;
            }
            Object obj = arrayList.get(i);
            i++;
            y yVar = (y) obj;
            RecyclerView.f.a stateRestorationPolicy = yVar.c.getStateRestorationPolicy();
            aVar = RecyclerView.f.a.c;
            if (stateRestorationPolicy == aVar || (stateRestorationPolicy == RecyclerView.f.a.b && yVar.e == 0)) {
                break;
            }
        }
        f fVar = this.a;
        if (aVar != fVar.getStateRestorationPolicy()) {
            fVar.i(aVar);
        }
    }

    public final int b(y yVar) {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            y yVar2 = (y) obj;
            if (yVar2 == yVar) {
                break;
            }
            i += yVar2.e;
        }
        return i;
    }

    public final a c(int i) {
        a aVar = this.f;
        if (aVar.c) {
            aVar = new a();
        } else {
            aVar.c = true;
        }
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = i;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            y yVar = (y) obj;
            int i4 = yVar.e;
            if (i4 > i3) {
                aVar.a = yVar;
                aVar.b = i3;
                break;
            }
            i3 -= i4;
        }
        if (aVar.a != null) {
            return aVar;
        }
        hb5.a(hce0.a(i, "Cannot find wrapper for "));
        return null;
    }

    public final y d(RecyclerView.d0 d0Var) {
        y yVar = this.d.get(d0Var);
        if (yVar != null) {
            return yVar;
        }
        nke.a(d0Var, "Cannot find wrapper for ", ", seems like it is not bound by this adapter: ", this);
        return null;
    }
}
