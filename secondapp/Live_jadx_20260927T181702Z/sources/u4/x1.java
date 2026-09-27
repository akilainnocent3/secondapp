package u4;

import com.ironsource.C4235d4;
import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@x4.m1
public final class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f139082a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PriorityQueue<Integer> f139083b = new PriorityQueue<>(10, Collections.reverseOrder());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f139084c = Integer.MIN_VALUE;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a extends IOException {
        public a(int i10, int i11) {
            super("Priority too low [priority=" + i10 + ", highest=" + i11 + C4235d4.j.f61462e);
        }
    }

    public void a(int i10) {
        synchronized (this.f139082a) {
            this.f139083b.add(Integer.valueOf(i10));
            this.f139084c = Math.max(this.f139084c, i10);
        }
    }

    public void b(int i10) throws InterruptedException {
        synchronized (this.f139082a) {
            while (this.f139084c != i10) {
                try {
                    this.f139082a.wait();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public boolean c(int i10) {
        boolean z10;
        synchronized (this.f139082a) {
            z10 = this.f139084c == i10;
        }
        return z10;
    }

    public void d(int i10) throws a {
        synchronized (this.f139082a) {
            try {
                if (this.f139084c != i10) {
                    throw new a(i10, this.f139084c);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void e(int i10) {
        synchronized (this.f139082a) {
            this.f139083b.remove(Integer.valueOf(i10));
            this.f139084c = this.f139083b.isEmpty() ? Integer.MIN_VALUE : ((Integer) x4.b2.o(this.f139083b.peek())).intValue();
            this.f139082a.notifyAll();
        }
    }
}
