package kc;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import pc.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<l> f102132a = new AtomicReference<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0.a<l, List<Class<?>>> f102133b = new f0.a<>();

    public void a() {
        synchronized (this.f102133b) {
            this.f102133b.clear();
        }
    }

    @Nullable
    public List<Class<?>> b(@NonNull Class<?> cls, @NonNull Class<?> cls2, @NonNull Class<?> cls3) {
        List<Class<?>> list;
        l andSet = this.f102132a.getAndSet(null);
        if (andSet == null) {
            andSet = new l(cls, cls2, cls3);
        } else {
            andSet.b(cls, cls2, cls3);
        }
        synchronized (this.f102133b) {
            list = this.f102133b.get(andSet);
        }
        this.f102132a.set(andSet);
        return list;
    }

    public void c(@NonNull Class<?> cls, @NonNull Class<?> cls2, @NonNull Class<?> cls3, @NonNull List<Class<?>> list) {
        synchronized (this.f102133b) {
            this.f102133b.put(new l(cls, cls2, cls3), list);
        }
    }
}
