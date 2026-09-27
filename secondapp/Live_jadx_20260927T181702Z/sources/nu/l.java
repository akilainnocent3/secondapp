package nu;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class l<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f117642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Thread f117643b = Thread.currentThread();

    public l(T t10) {
        this.f117642a = t10;
    }

    public T a() {
        if (b()) {
            return this.f117642a;
        }
        throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
    }

    public boolean b() {
        return this.f117643b == Thread.currentThread();
    }
}
