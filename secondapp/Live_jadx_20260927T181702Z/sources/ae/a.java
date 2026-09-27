package ae;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class a<T> extends f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f4833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f4834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f4835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f4836d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f4837e;

    public a(@Nullable Integer num, T t10, h hVar, @Nullable i iVar, @Nullable g gVar) {
        this.f4833a = num;
        if (t10 == null) {
            throw new NullPointerException("Null payload");
        }
        this.f4834b = t10;
        if (hVar == null) {
            throw new NullPointerException("Null priority");
        }
        this.f4835c = hVar;
        this.f4836d = iVar;
        this.f4837e = gVar;
    }

    @Override // ae.f
    @Nullable
    public Integer a() {
        return this.f4833a;
    }

    @Override // ae.f
    @Nullable
    public g b() {
        return this.f4837e;
    }

    @Override // ae.f
    public T c() {
        return this.f4834b;
    }

    @Override // ae.f
    public h d() {
        return this.f4835c;
    }

    @Override // ae.f
    @Nullable
    public i e() {
        return this.f4836d;
    }

    public boolean equals(Object obj) {
        i iVar;
        g gVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            Integer num = this.f4833a;
            if (num != null ? num.equals(fVar.a()) : fVar.a() == null) {
                if (this.f4834b.equals(fVar.c()) && this.f4835c.equals(fVar.d()) && ((iVar = this.f4836d) != null ? iVar.equals(fVar.e()) : fVar.e() == null) && ((gVar = this.f4837e) != null ? gVar.equals(fVar.b()) : fVar.b() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f4833a;
        int iHashCode = ((((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f4834b.hashCode()) * 1000003) ^ this.f4835c.hashCode()) * 1000003;
        i iVar = this.f4836d;
        int iHashCode2 = (iHashCode ^ (iVar == null ? 0 : iVar.hashCode())) * 1000003;
        g gVar = this.f4837e;
        return iHashCode2 ^ (gVar != null ? gVar.hashCode() : 0);
    }

    public String toString() {
        return "Event{code=" + this.f4833a + ", payload=" + this.f4834b + ", priority=" + this.f4835c + ", productData=" + this.f4836d + ", eventContext=" + this.f4837e + "}";
    }
}
