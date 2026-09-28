package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class lss implements rss.a {
    public final /* synthetic */ Map<Integer, List<ess>> a;
    public final /* synthetic */ int b;
    public final /* synthetic */ kss c;

    /* JADX WARN: Multi-variable type inference failed */
    public lss(Map<Integer, ? extends List<? extends ess>> map, int i, kss kssVar) {
        this.a = map;
        this.b = i;
        this.c = kssVar;
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
