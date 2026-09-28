package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class p1a0 extends s1a0<Object, Object> {
    @Override // defpackage.s1a0
    public final void g() {
        if (!this.d) {
            for (int i = 0; i < this.b.size(); i++) {
                ((njh.a) d(i).getKey()).getClass();
            }
            Iterator<Map.Entry<Object, Object>> it = e().iterator();
            while (it.hasNext()) {
                ((njh.a) it.next().getKey()).getClass();
            }
        }
        super.g();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return h((Comparable) obj, obj2);
    }
}
