package yads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class rh1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f154966b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d63 f154965a = new d63();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f154967c = new AtomicBoolean();

    public rh1(Context context) {
        this.f154966b = context.getApplicationContext();
    }

    public final void a() {
        if (ub.a(this.f154966b)) {
            this.f154965a.getClass();
            if (d63.a() || this.f154967c.getAndSet(true)) {
                return;
            }
            lc1.c("SDK API usage from a background thread detected. Please, use SDK API only from the main thread.", new Object[0]);
        }
    }
}
