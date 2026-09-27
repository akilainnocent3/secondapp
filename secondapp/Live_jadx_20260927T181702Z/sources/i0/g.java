package i0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f90224a = false;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a<T> {
        T a();

        boolean b(T t10);

        void c(T[] tArr, int i10);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b<T> implements a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object[] f90225a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f90226b;

        public b(int i10) {
            if (i10 <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.f90225a = new Object[i10];
        }

        @Override // i0.g.a
        public T a() {
            int i10 = this.f90226b;
            if (i10 <= 0) {
                return null;
            }
            int i11 = i10 - 1;
            Object[] objArr = this.f90225a;
            T t10 = (T) objArr[i11];
            objArr[i11] = null;
            this.f90226b = i10 - 1;
            return t10;
        }

        @Override // i0.g.a
        public boolean b(T t10) {
            int i10 = this.f90226b;
            Object[] objArr = this.f90225a;
            if (i10 >= objArr.length) {
                return false;
            }
            objArr[i10] = t10;
            this.f90226b = i10 + 1;
            return true;
        }

        @Override // i0.g.a
        public void c(T[] tArr, int i10) {
            if (i10 > tArr.length) {
                i10 = tArr.length;
            }
            for (int i11 = 0; i11 < i10; i11++) {
                T t10 = tArr[i11];
                int i12 = this.f90226b;
                Object[] objArr = this.f90225a;
                if (i12 < objArr.length) {
                    objArr[i12] = t10;
                    this.f90226b = i12 + 1;
                }
            }
        }

        public final boolean d(T t10) {
            for (int i10 = 0; i10 < this.f90226b; i10++) {
                if (this.f90225a[i10] == t10) {
                    return true;
                }
            }
            return false;
        }
    }
}
