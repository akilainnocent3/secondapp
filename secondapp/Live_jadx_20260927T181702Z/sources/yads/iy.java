package yads;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class iy implements gf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f150855a;

    public iy(List list) {
        this.f150855a = list;
    }

    @Override // yads.gf
    public final void a(View view) {
        Iterator it = this.f150855a.iterator();
        while (it.hasNext()) {
            ((gf) it.next()).a(view);
        }
    }

    @Override // yads.gf
    public final void cancel() {
        Iterator it = this.f150855a.iterator();
        while (it.hasNext()) {
            ((gf) it.next()).cancel();
        }
    }
}
