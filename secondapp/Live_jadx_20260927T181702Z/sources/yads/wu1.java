package yads;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class wu1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f157511a = new AtomicBoolean(false);

    public static final void a() {
        if (f157511a.compareAndSet(false, true)) {
            lc1.b("Yandex Mobile Ads 7.18.1 initialized successfully", new Object[0]);
        }
    }
}
