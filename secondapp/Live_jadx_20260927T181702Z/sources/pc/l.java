package pc;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Class<?> f120693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Class<?> f120694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Class<?> f120695c;

    public l() {
    }

    public void a(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
        b(cls, cls2, null);
    }

    public void b(@NonNull Class<?> cls, @NonNull Class<?> cls2, @Nullable Class<?> cls3) {
        this.f120693a = cls;
        this.f120694b = cls2;
        this.f120695c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        return this.f120693a.equals(lVar.f120693a) && this.f120694b.equals(lVar.f120694b) && o.e(this.f120695c, lVar.f120695c);
    }

    public int hashCode() {
        int iHashCode = ((this.f120693a.hashCode() * 31) + this.f120694b.hashCode()) * 31;
        Class<?> cls = this.f120695c;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f120693a + ", second=" + this.f120694b + fw.b.f85383j;
    }

    public l(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
        a(cls, cls2);
    }

    public l(@NonNull Class<?> cls, @NonNull Class<?> cls2, @Nullable Class<?> cls3) {
        b(cls, cls2, cls3);
    }
}
