package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class tf5 implements rss.a {
    public final /* synthetic */ Map<Integer, List<ess>> a;
    public final /* synthetic */ int b;
    public final /* synthetic */ rf5 c;

    /* JADX WARN: Multi-variable type inference failed */
    public tf5(Map<Integer, ? extends List<? extends ess>> map, int i, rf5 rf5Var) {
        this.a = map;
        this.b = i;
        this.c = rf5Var;
    }

    @Override // rss.a
    public final void a(int i) {
        List<ess> list = this.a.get(Integer.valueOf(i));
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((ess) it.next()).execute();
            }
        }
        if (i == this.b) {
            this.c.p0();
        }
    }
}
