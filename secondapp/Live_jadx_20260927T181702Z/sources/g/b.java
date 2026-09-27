package g;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @l
    public final Set<d> f85752a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @m
    public volatile Context f85753b;

    public final void a(@l d listener) {
        m0.p(listener, "listener");
        Context context = this.f85753b;
        if (context != null) {
            listener.a(context);
        }
        this.f85752a.add(listener);
    }

    public final void b() {
        this.f85753b = null;
    }

    public final void c(@l Context context) {
        m0.p(context, "context");
        this.f85753b = context;
        Iterator<d> it = this.f85752a.iterator();
        while (it.hasNext()) {
            it.next().a(context);
        }
    }

    @m
    public final Context d() {
        return this.f85753b;
    }

    public final void e(@l d listener) {
        m0.p(listener, "listener");
        this.f85752a.remove(listener);
    }
}
