package ms;

import fr.f1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class j implements Iterable<Integer>, es.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.l
    public static final a f115138e = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f115139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f115140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f115141d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }

        @oy.l
        public final j a(int i10, int i11, int i12) {
            return new j(i10, i11, i12);
        }

        public a() {
        }
    }

    public j(int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i12 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f115139b = i10;
        this.f115140c = ur.o.c(i10, i11, i12);
        this.f115141d = i12;
    }

    public boolean equals(@oy.m Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        if (isEmpty() && ((j) obj).isEmpty()) {
            return true;
        }
        j jVar = (j) obj;
        return this.f115139b == jVar.f115139b && this.f115140c == jVar.f115140c && this.f115141d == jVar.f115141d;
    }

    public final int f() {
        return this.f115139b;
    }

    public final int g() {
        return this.f115140c;
    }

    public final int h() {
        return this.f115141d;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f115139b * 31) + this.f115140c) * 31) + this.f115141d;
    }

    @Override // java.lang.Iterable
    @oy.l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public f1 iterator() {
        return new k(this.f115139b, this.f115140c, this.f115141d);
    }

    public boolean isEmpty() {
        if (this.f115141d > 0) {
            return this.f115139b > this.f115140c;
        }
        return this.f115139b < this.f115140c;
    }

    @oy.l
    public String toString() {
        StringBuilder sb2;
        int i10;
        if (this.f115141d > 0) {
            sb2 = new StringBuilder();
            sb2.append(this.f115139b);
            sb2.append("..");
            sb2.append(this.f115140c);
            sb2.append(" step ");
            i10 = this.f115141d;
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.f115139b);
            sb2.append(" downTo ");
            sb2.append(this.f115140c);
            sb2.append(" step ");
            i10 = -this.f115141d;
        }
        sb2.append(i10);
        return sb2.toString();
    }
}
