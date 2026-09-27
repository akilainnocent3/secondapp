package xk;

import java.lang.annotation.Annotation;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f145307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d.a f145308b = d.a.DEFAULT;

    /* JADX INFO: renamed from: xk.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class C1528a implements d {

        /* JADX INFO: renamed from: y2, reason: collision with root package name */
        public final int f145309y2;

        /* JADX INFO: renamed from: z2, reason: collision with root package name */
        public final d.a f145310z2;

        public C1528a(int i10, d.a aVar) {
            this.f145309y2 = i10;
            this.f145310z2 = aVar;
        }

        @Override // java.lang.annotation.Annotation
        public Class<? extends Annotation> annotationType() {
            return d.class;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f145309y2 == dVar.tag() && this.f145310z2.equals(dVar.intEncoding());
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (14552422 ^ this.f145309y2) + (this.f145310z2.hashCode() ^ 2041407134);
        }

        @Override // xk.d
        public d.a intEncoding() {
            return this.f145310z2;
        }

        @Override // xk.d
        public int tag() {
            return this.f145309y2;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f145309y2 + "intEncoding=" + this.f145310z2 + ')';
        }
    }

    public static a b() {
        return new a();
    }

    public d a() {
        return new C1528a(this.f145307a, this.f145308b);
    }

    public a c(d.a aVar) {
        this.f145308b = aVar;
        return this;
    }

    public a d(int i10) {
        this.f145307a = i10;
        return this;
    }
}
