package wb;

import java.util.Queue;
import wb.n;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d<T extends n> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f142642b = 20;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Queue<T> f142643a = pc.o.g(20);

    public abstract T a();

    public T b() {
        T tPoll = this.f142643a.poll();
        return tPoll == null ? (T) a() : tPoll;
    }

    public void c(T t10) {
        if (this.f142643a.size() < 20) {
            this.f142643a.offer(t10);
        }
    }
}
