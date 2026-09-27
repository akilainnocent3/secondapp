package pc;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class j<T, Y> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<T, a<Y>> f120684a = new LinkedHashMap(100, 0.75f, true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f120685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f120686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f120687d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a<Y> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Y f120688a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f120689b;

        public a(Y y10, int i10) {
            this.f120688a = y10;
            this.f120689b = i10;
        }
    }

    public j(long j10) {
        this.f120685b = j10;
        this.f120686c = j10;
    }

    public void b() {
        p(0L);
    }

    public synchronized void c(float f10) {
        try {
            if (f10 < 0.0f) {
                throw new IllegalArgumentException("Multiplier must be >= 0");
            }
            this.f120686c = Math.round(this.f120685b * f10);
            i();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized long d() {
        return this.f120687d;
    }

    public synchronized long getMaxSize() {
        return this.f120686c;
    }

    public synchronized boolean h(@NonNull T t10) {
        return this.f120684a.containsKey(t10);
    }

    public final void i() {
        p(this.f120686c);
    }

    @Nullable
    public synchronized Y j(@NonNull T t10) {
        a<Y> aVar;
        aVar = this.f120684a.get(t10);
        return aVar != null ? aVar.f120688a : null;
    }

    public synchronized int k() {
        return this.f120684a.size();
    }

    public int l(@Nullable Y y10) {
        return 1;
    }

    @Nullable
    public synchronized Y n(@NonNull T t10, @Nullable Y y10) {
        int iL = l(y10);
        long j10 = iL;
        if (j10 >= this.f120686c) {
            m(t10, y10);
            return null;
        }
        if (y10 != null) {
            this.f120687d += j10;
        }
        a<Y> aVarPut = this.f120684a.put(t10, y10 == null ? null : new a<>(y10, iL));
        if (aVarPut != null) {
            this.f120687d -= (long) aVarPut.f120689b;
            if (!aVarPut.f120688a.equals(y10)) {
                m(t10, aVarPut.f120688a);
            }
        }
        i();
        return aVarPut != null ? aVarPut.f120688a : null;
    }

    @Nullable
    public synchronized Y o(@NonNull T t10) {
        a<Y> aVarRemove = this.f120684a.remove(t10);
        if (aVarRemove == null) {
            return null;
        }
        this.f120687d -= (long) aVarRemove.f120689b;
        return aVarRemove.f120688a;
    }

    public synchronized void p(long j10) {
        while (this.f120687d > j10) {
            Iterator<Map.Entry<T, a<Y>>> it = this.f120684a.entrySet().iterator();
            Map.Entry<T, a<Y>> next = it.next();
            a<Y> value = next.getValue();
            this.f120687d -= (long) value.f120689b;
            T key = next.getKey();
            it.remove();
            m(key, value.f120688a);
        }
    }

    public void m(@NonNull T t10, @Nullable Y y10) {
    }
}
