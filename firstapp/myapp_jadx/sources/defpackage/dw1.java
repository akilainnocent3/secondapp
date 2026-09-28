package defpackage;

import androidx.compose.runtime.m;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class dw1 {
    public final uf00<uf00<ytw<ov1>>> a;
    public final uf00<ytw<ov1>> b;
    public final ytw<Boolean> c;
    public final ytw<Boolean> d;
    public final ytw<Boolean> e;
    public final ytw<fg60> f;

    public dw1() {
        ArrayList arrayList = new ArrayList(5);
        for (int i = 0; i < 5; i++) {
            ArrayList arrayList2 = new ArrayList(12);
            for (int i2 = 0; i2 < 12; i2++) {
                arrayList2.add(m.b(ov1.b.a));
            }
            arrayList.add(a4h.f(arrayList2));
        }
        this.a = a4h.f(arrayList);
        ArrayList arrayList3 = new ArrayList(5);
        for (int i3 = 0; i3 < 5; i3++) {
            arrayList3.add(m.b(ov1.b.a));
        }
        this.b = a4h.f(arrayList3);
        this.c = m.b(Boolean.TRUE);
        Boolean bool = Boolean.FALSE;
        this.d = m.b(bool);
        this.e = m.b(bool);
        this.f = m.b(fg60.Normal);
    }

    public final void a() {
        Iterator<uf00<ytw<ov1>>> it = this.a.iterator();
        while (it.hasNext()) {
            Iterator<ytw<ov1>> it2 = it.next().iterator();
            while (it2.hasNext()) {
                it2.next().setValue(ov1.b.a);
            }
        }
        Iterator<ytw<ov1>> it3 = this.b.iterator();
        while (it3.hasNext()) {
            it3.next().setValue(ov1.b.a);
        }
    }
}
