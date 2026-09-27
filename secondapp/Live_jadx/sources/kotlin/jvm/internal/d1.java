package kotlin.jvm.internal;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public abstract class d1<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f102721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f102722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public final T[] f102723c;

    public d1(int i10) {
        this.f102721a = i10;
        this.f102723c = (T[]) new Object[i10];
    }

    public final void a(@oy.l T spreadArgument) {
        m0.p(spreadArgument, "spreadArgument");
        T[] tArr = this.f102723c;
        int i10 = this.f102722b;
        this.f102722b = i10 + 1;
        tArr[i10] = spreadArgument;
    }

    public final int b() {
        return this.f102722b;
    }

    public abstract int c(@oy.l T t10);

    public final void e(int i10) {
        this.f102722b = i10;
    }

    public final int f() {
        int i10 = this.f102721a - 1;
        int iC = 0;
        if (i10 >= 0) {
            int i11 = 0;
            while (true) {
                T t10 = this.f102723c[i11];
                iC += t10 != null ? c(t10) : 1;
                if (i11 == i10) {
                    break;
                }
                i11++;
            }
        }
        return iC;
    }

    @oy.l
    public final T g(@oy.l T values, @oy.l T result) {
        int i10;
        m0.p(values, "values");
        m0.p(result, "result");
        int i11 = this.f102721a - 1;
        int i12 = 0;
        if (i11 >= 0) {
            int i13 = 0;
            int i14 = 0;
            i10 = 0;
            while (true) {
                T t10 = this.f102723c[i13];
                if (t10 != null) {
                    if (i14 < i13) {
                        int i15 = i13 - i14;
                        System.arraycopy(values, i14, result, i10, i15);
                        i10 += i15;
                    }
                    int iC = c(t10);
                    System.arraycopy(t10, 0, result, i10, iC);
                    i10 += iC;
                    i14 = i13 + 1;
                }
                if (i13 == i11) {
                    break;
                }
                i13++;
            }
            i12 = i14;
        } else {
            i10 = 0;
        }
        int i16 = this.f102721a;
        if (i12 < i16) {
            System.arraycopy(values, i12, result, i10, i16 - i12);
        }
        return result;
    }

    public static /* synthetic */ void d() {
    }
}
