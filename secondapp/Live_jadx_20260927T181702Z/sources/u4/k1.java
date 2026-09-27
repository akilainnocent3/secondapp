package u4;

import androidx.annotation.Nullable;
import cj.v6;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@x4.m1
public final class k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a[] f138622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f138623b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        @Nullable
        byte[] G();

        @Nullable
        androidx.media3.common.a H();

        void a(i1.b bVar);
    }

    public k1(a... aVarArr) {
        this(-9223372036854775807L, aVarArr);
    }

    public k1 a(a... aVarArr) {
        return aVarArr.length == 0 ? this : new k1(this.f138623b, (a[]) x4.b2.S1(this.f138622a, aVarArr));
    }

    public k1 b(@Nullable k1 k1Var) {
        return k1Var == null ? this : a(k1Var.f138622a);
    }

    public k1 c(long j10) {
        return this.f138623b == j10 ? this : new k1(j10, this.f138622a);
    }

    @Nullable
    public final <T extends a> T d(a aVar, Class<T> cls, zi.m0<T> m0Var) {
        if (!cls.isAssignableFrom(aVar.getClass())) {
            return null;
        }
        T tCast = cls.cast(aVar);
        if (m0Var.apply(tCast)) {
            return tCast;
        }
        return null;
    }

    public a e(int i10) {
        return this.f138622a[i10];
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k1.class == obj.getClass()) {
            k1 k1Var = (k1) obj;
            if (Arrays.equals(this.f138622a, k1Var.f138622a) && this.f138623b == k1Var.f138623b) {
                return true;
            }
        }
        return false;
    }

    public <T extends a> v6<T> f(Class<T> cls) {
        v6.a aVarQ = v6.q();
        for (a aVar : this.f138622a) {
            if (cls.isAssignableFrom(aVar.getClass())) {
                aVarQ.g(cls.cast(aVar));
            }
        }
        return aVarQ.e();
    }

    @Nullable
    public <T extends a> T g(Class<T> cls) {
        return (T) h(cls, zi.n0.c());
    }

    @Nullable
    public <T extends a> T h(Class<T> cls, zi.m0<T> m0Var) {
        for (a aVar : this.f138622a) {
            T t10 = (T) d(aVar, cls, m0Var);
            if (t10 != null) {
                return t10;
            }
        }
        return null;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f138622a) * 31) + lj.n.l(this.f138623b);
    }

    public <T extends a> v6<T> i(Class<T> cls, zi.m0<T> m0Var) {
        v6.a aVarQ = v6.q();
        for (a aVar : this.f138622a) {
            a aVarD = d(aVar, cls, m0Var);
            if (aVarD != null) {
                aVarQ.g(aVarD);
            }
        }
        return aVarQ.e();
    }

    public int j() {
        return this.f138622a.length;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("entries=");
        sb2.append(Arrays.toString(this.f138622a));
        if (this.f138623b == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + this.f138623b;
        }
        sb2.append(str);
        return sb2.toString();
    }

    public k1(long j10, a... aVarArr) {
        this.f138623b = j10;
        this.f138622a = aVarArr;
    }

    public k1(List<? extends a> list) {
        this((a[]) list.toArray(new a[0]));
    }

    public k1(long j10, List<? extends a> list) {
        this(j10, (a[]) list.toArray(new a[0]));
    }
}
