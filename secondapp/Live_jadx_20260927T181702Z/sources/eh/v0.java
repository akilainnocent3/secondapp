package eh;

import com.ironsource.C4235d4;
import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f81234a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PriorityQueue<Integer> f81235b = new PriorityQueue<>(10, Collections.reverseOrder());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f81236c = Integer.MIN_VALUE;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a extends IOException {
        public a(int i10, int i11) {
            super("Priority too low [priority=" + i10 + ", highest=" + i11 + C4235d4.j.f61462e);
        }
    }

    public void a(int i10) {
        synchronized (this.f81234a) {
            this.f81235b.add(Integer.valueOf(i10));
            this.f81236c = Math.max(this.f81236c, i10);
        }
    }

    public void b(int i10) throws InterruptedException {
        synchronized (this.f81234a) {
            while (this.f81236c != i10) {
                try {
                    this.f81234a.wait();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public boolean c(int i10) {
        boolean z10;
        synchronized (this.f81234a) {
            z10 = this.f81236c == i10;
        }
        return z10;
    }

    public void d(int i10) throws a {
        synchronized (this.f81234a) {
            try {
                if (this.f81236c != i10) {
                    throw new a(i10, this.f81236c);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void e(int i10) {
        synchronized (this.f81234a) {
            this.f81235b.remove(Integer.valueOf(i10));
            this.f81236c = this.f81235b.isEmpty() ? Integer.MIN_VALUE : ((Integer) o1.o(this.f81235b.peek())).intValue();
            this.f81234a.notifyAll();
        }
    }
}
