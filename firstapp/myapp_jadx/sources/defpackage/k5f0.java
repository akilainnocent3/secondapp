package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class k5f0 implements gbs {
    public final Set<d5f0<?>> a = Collections.newSetFromMap(new WeakHashMap());

    @Override // defpackage.gbs
    public final void b() {
        ArrayList arrayListE = erh0.e(this.a);
        int size = arrayListE.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListE.get(i);
            i++;
            ((d5f0) obj).b();
        }
    }

    @Override // defpackage.gbs
    public final void c() {
        ArrayList arrayListE = erh0.e(this.a);
        int size = arrayListE.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListE.get(i);
            i++;
            ((d5f0) obj).c();
        }
    }

    @Override // defpackage.gbs
    public final void onDestroy() {
        ArrayList arrayListE = erh0.e(this.a);
        int size = arrayListE.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListE.get(i);
            i++;
            ((d5f0) obj).onDestroy();
        }
    }
}
