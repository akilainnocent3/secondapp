package cj;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@yi.b
@j4
public abstract class w3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w3 f24626a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final w3 f24627b = new b(-1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w3 f24628c = new b(1);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends w3 {
        public a() {
            super(null);
        }

        @Override // cj.w3
        public w3 d(double left, double right) {
            return o(Double.compare(left, right));
        }

        @Override // cj.w3
        public w3 e(float left, float right) {
            return o(Float.compare(left, right));
        }

        @Override // cj.w3
        public w3 f(int left, int right) {
            return o(Integer.compare(left, right));
        }

        @Override // cj.w3
        public w3 g(long left, long right) {
            return o(Long.compare(left, right));
        }

        @Override // cj.w3
        public w3 i(Comparable<?> left, Comparable<?> right) {
            return o(left.compareTo(right));
        }

        @Override // cj.w3
        public <T> w3 j(@n9 T left, @n9 T right, Comparator<T> comparator) {
            return o(comparator.compare(left, right));
        }

        @Override // cj.w3
        public w3 k(boolean left, boolean right) {
            return o(Boolean.compare(left, right));
        }

        @Override // cj.w3
        public w3 l(boolean left, boolean right) {
            return o(Boolean.compare(right, left));
        }

        @Override // cj.w3
        public int m() {
            return 0;
        }

        public w3 o(int result) {
            if (result < 0) {
                return w3.f24627b;
            }
            return result > 0 ? w3.f24628c : w3.f24626a;
        }
    }

    public /* synthetic */ w3(a aVar) {
        this();
    }

    public static w3 n() {
        return f24626a;
    }

    public abstract w3 d(double left, double right);

    public abstract w3 e(float left, float right);

    public abstract w3 f(int left, int right);

    public abstract w3 g(long left, long right);

    @Deprecated
    public final w3 h(Boolean left, Boolean right) {
        return k(left.booleanValue(), right.booleanValue());
    }

    public abstract w3 i(Comparable<?> left, Comparable<?> right);

    public abstract <T> w3 j(@n9 T left, @n9 T right, Comparator<T> comparator);

    public abstract w3 k(boolean left, boolean right);

    public abstract w3 l(boolean left, boolean right);

    public abstract int m();

    public w3() {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends w3 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f24629d;

        public b(int result) {
            super(null);
            this.f24629d = result;
        }

        @Override // cj.w3
        public int m() {
            return this.f24629d;
        }

        @Override // cj.w3
        public w3 d(double left, double right) {
            return this;
        }

        @Override // cj.w3
        public w3 e(float left, float right) {
            return this;
        }

        @Override // cj.w3
        public w3 f(int left, int right) {
            return this;
        }

        @Override // cj.w3
        public w3 g(long left, long right) {
            return this;
        }

        @Override // cj.w3
        public w3 i(Comparable<?> left, Comparable<?> right) {
            return this;
        }

        @Override // cj.w3
        public w3 k(boolean left, boolean right) {
            return this;
        }

        @Override // cj.w3
        public w3 l(boolean left, boolean right) {
            return this;
        }

        @Override // cj.w3
        public <T> w3 j(@n9 T left, @n9 T right, Comparator<T> comparator) {
            return this;
        }
    }
}
