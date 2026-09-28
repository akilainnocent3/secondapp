package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes8.dex */
public final class flw implements m3h {
    public final ArrayList a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;
    public final AtomicBoolean e = new AtomicBoolean(false);

    public flw(ArrayList arrayList) {
        int i = 0;
        this.d = arrayList;
        this.a = new ArrayList(arrayList.size());
        this.c = new ArrayList(arrayList.size());
        this.b = new ArrayList(arrayList.size());
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            fra0 fra0Var = (fra0) obj;
            if (fra0Var.C()) {
                this.a.add(fra0Var);
            }
            if (fra0Var instanceof m3h) {
                m3h m3hVar = (m3h) fra0Var;
                if (m3hVar.U()) {
                    this.b.add(m3hVar);
                }
            }
            if (fra0Var.B1()) {
                this.c.add(fra0Var);
            }
        }
    }

    @Override // defpackage.fra0
    public final boolean B1() {
        return !this.c.isEmpty();
    }

    @Override // defpackage.fra0
    public final boolean C() {
        return !this.a.isEmpty();
    }

    @Override // defpackage.m3h
    public final void T(at70 at70Var) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((m3h) obj).T(at70Var);
        }
    }

    @Override // defpackage.m3h
    public final boolean U() {
        return !this.b.isEmpty();
    }

    @Override // defpackage.fra0
    public final rm8 j() {
        ArrayList arrayList = this.d;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            arrayList2.add(((fra0) obj).j());
        }
        return rm8.e(arrayList2);
    }

    @Override // defpackage.fra0
    public final void r0(at70 at70Var) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((fra0) obj).r0(at70Var);
        }
    }

    @Override // defpackage.fra0
    public final void r1(m0b m0bVar, at70 at70Var) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((fra0) obj).r1(m0bVar, at70Var);
        }
    }

    @Override // defpackage.fra0
    public final rm8 shutdown() {
        if (this.e.getAndSet(true)) {
            return rm8.e;
        }
        ArrayList arrayList = this.d;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            arrayList2.add(((fra0) obj).shutdown());
        }
        return rm8.e(arrayList2);
    }

    public final String toString() {
        return "MultiSpanProcessor{spanProcessorsStart=" + this.a + ", spanProcessorsEnding=" + this.b + ", spanProcessorsEnd=" + this.c + ", spanProcessorsAll=" + this.d + '}';
    }
}
