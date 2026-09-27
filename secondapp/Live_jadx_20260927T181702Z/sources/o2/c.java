package o2;

import fr.h0;
import java.util.ArrayList;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @l
    public final ArrayList<b> f118614a = new ArrayList<>();

    public final void a(@l b listener) {
        m0.p(listener, "listener");
        this.f118614a.add(listener);
    }

    public final void b() {
        for (int iL = h0.L(this.f118614a); -1 < iL; iL--) {
            this.f118614a.get(iL).a();
        }
    }

    public final void c(@l b listener) {
        m0.p(listener, "listener");
        this.f118614a.remove(listener);
    }
}
