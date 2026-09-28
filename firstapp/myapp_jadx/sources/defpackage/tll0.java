package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class tll0 extends bml0 {
    public tll0() {
        Map map = Collections.EMPTY_MAP;
        this.c = map;
        this.f = map;
    }

    @Override // defpackage.bml0
    public final void b() {
        if (!this.d) {
            if (this.b > 0) {
                ((lgl0) c(0).a).zzd();
                throw null;
            }
            Iterator it = d().iterator();
            if (it.hasNext()) {
                ((lgl0) ((Map.Entry) it.next()).getKey()).zzd();
                throw null;
            }
        }
        super.b();
    }
}
