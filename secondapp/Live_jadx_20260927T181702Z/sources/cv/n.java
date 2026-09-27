package cv;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class n implements Iterator<String>, es.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @oy.l
    public static final a f77269g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final int f77270h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    public static final int f77271i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Deprecated
    public static final int f77272j = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final CharSequence f77273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f77274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f77275d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f77276e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f77277f;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }

        public a() {
        }
    }

    public n(@oy.l CharSequence string) {
        kotlin.jvm.internal.m0.p(string, "string");
        this.f77273b = string;
    }

    @Override // java.util.Iterator
    @oy.l
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f77274c = 0;
        int i10 = this.f77276e;
        int i11 = this.f77275d;
        this.f77275d = this.f77277f + i10;
        return this.f77273b.subSequence(i11, i10).toString();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i10;
        int i11;
        int i12 = this.f77274c;
        if (i12 != 0) {
            return i12 == 1;
        }
        if (this.f77277f < 0) {
            this.f77274c = 2;
            return false;
        }
        int length = this.f77273b.length();
        int length2 = this.f77273b.length();
        for (int i13 = this.f77275d; i13 < length2; i13++) {
            char cCharAt = this.f77273b.charAt(i13);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i10 = (cCharAt == '\r' && (i11 = i13 + 1) < this.f77273b.length() && this.f77273b.charAt(i11) == '\n') ? 2 : 1;
                length = i13;
                this.f77274c = 1;
                this.f77277f = i10;
                this.f77276e = length;
                return true;
            }
        }
        i10 = -1;
        this.f77274c = 1;
        this.f77277f = i10;
        this.f77276e = length;
        return true;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
