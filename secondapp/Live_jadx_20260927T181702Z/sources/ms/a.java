package ms;

import fr.e0;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class a implements Iterable<Character>, es.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.l
    public static final C1047a f115118e = new C1047a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char f115119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final char f115120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f115121d;

    /* JADX INFO: renamed from: ms.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class C1047a {
        public /* synthetic */ C1047a(kotlin.jvm.internal.x xVar) {
            this();
        }

        @oy.l
        public final a a(char c10, char c11, int i10) {
            return new a(c10, c11, i10);
        }

        public C1047a() {
        }
    }

    public a(char c10, char c11, int i10) {
        if (i10 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i10 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f115119b = c10;
        this.f115120c = (char) ur.o.c(c10, c11, i10);
        this.f115121d = i10;
    }

    public boolean equals(@oy.m Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (isEmpty() && ((a) obj).isEmpty()) {
            return true;
        }
        a aVar = (a) obj;
        return this.f115119b == aVar.f115119b && this.f115120c == aVar.f115120c && this.f115121d == aVar.f115121d;
    }

    public final char f() {
        return this.f115119b;
    }

    public final char g() {
        return this.f115120c;
    }

    public final int h() {
        return this.f115121d;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f115119b * pj.c.f120892b) + this.f115120c) * 31) + this.f115121d;
    }

    @Override // java.lang.Iterable
    @oy.l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public e0 iterator() {
        return new b(this.f115119b, this.f115120c, this.f115121d);
    }

    public boolean isEmpty() {
        if (this.f115121d > 0) {
            return m0.t(this.f115119b, this.f115120c) > 0;
        }
        return m0.t(this.f115119b, this.f115120c) < 0;
    }

    @oy.l
    public String toString() {
        StringBuilder sb2;
        int i10;
        if (this.f115121d > 0) {
            sb2 = new StringBuilder();
            sb2.append(this.f115119b);
            sb2.append("..");
            sb2.append(this.f115120c);
            sb2.append(" step ");
            i10 = this.f115121d;
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.f115119b);
            sb2.append(" downTo ");
            sb2.append(this.f115120c);
            sb2.append(" step ");
            i10 = -this.f115121d;
        }
        sb2.append(i10);
        return sb2.toString();
    }
}
