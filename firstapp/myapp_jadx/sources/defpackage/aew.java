package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes8.dex */
public final class aew implements tft {
    public final ArrayList a;
    public final AtomicBoolean b = new AtomicBoolean(false);

    public aew(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // defpackage.tft
    public final rm8 j() {
        ArrayList arrayList = this.a;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            arrayList2.add(((tft) obj).j());
        }
        return rm8.e(arrayList2);
    }

    @Override // defpackage.tft
    public final void s1(m0b m0bVar, p340 p340Var) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((tft) obj).s1(m0bVar, p340Var);
        }
    }

    @Override // defpackage.tft
    public final rm8 shutdown() {
        if (this.b.getAndSet(true)) {
            return rm8.e;
        }
        ArrayList arrayList = this.a;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            arrayList2.add(((tft) obj).shutdown());
        }
        return rm8.e(arrayList2);
    }
}
