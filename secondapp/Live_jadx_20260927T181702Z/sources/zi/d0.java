package zi;

import com.ironsource.G5;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@yi.b
@k
public final class d0 {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f161669a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C1581b f161670b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public C1581b f161671c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f161672d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f161673e;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class a extends C1581b {
            public a() {
            }
        }

        /* JADX INFO: renamed from: zi.d0$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static class C1581b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @zq.a
            public String f161674a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @zq.a
            public Object f161675b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @zq.a
            public C1581b f161676c;
        }

        public static boolean u(Object value) {
            if (value instanceof CharSequence) {
                return ((CharSequence) value).length() == 0;
            }
            if (value instanceof Collection) {
                return ((Collection) value).isEmpty();
            }
            if (value instanceof Map) {
                return ((Map) value).isEmpty();
            }
            if (value instanceof g0) {
                return !((g0) value).j();
            }
            return value.getClass().isArray() && Array.getLength(value) == 0;
        }

        @qj.a
        public b a(String name, char value) {
            return m(name, String.valueOf(value));
        }

        @qj.a
        public b b(String name, double value) {
            return m(name, String.valueOf(value));
        }

        @qj.a
        public b c(String name, float value) {
            return m(name, String.valueOf(value));
        }

        @qj.a
        public b d(String name, int value) {
            return m(name, String.valueOf(value));
        }

        @qj.a
        public b e(String name, long value) {
            return m(name, String.valueOf(value));
        }

        @qj.a
        public b f(String name, @zq.a Object value) {
            return j(name, value);
        }

        @qj.a
        public b g(String name, boolean value) {
            return m(name, String.valueOf(value));
        }

        public final C1581b h() {
            C1581b c1581b = new C1581b();
            this.f161671c.f161676c = c1581b;
            this.f161671c = c1581b;
            return c1581b;
        }

        @qj.a
        public final b i(@zq.a Object value) {
            h().f161675b = value;
            return this;
        }

        @qj.a
        public final b j(String name, @zq.a Object value) {
            C1581b c1581bH = h();
            c1581bH.f161675b = value;
            c1581bH.f161674a = (String) l0.E(name);
            return this;
        }

        public final a k() {
            a aVar = new a();
            this.f161671c.f161676c = aVar;
            this.f161671c = aVar;
            return aVar;
        }

        @qj.a
        public final b l(Object value) {
            k().f161675b = value;
            return this;
        }

        @qj.a
        public final b m(String name, Object value) {
            a aVarK = k();
            aVarK.f161675b = value;
            aVarK.f161674a = (String) l0.E(name);
            return this;
        }

        @qj.a
        public b n(char value) {
            return l(String.valueOf(value));
        }

        @qj.a
        public b o(double value) {
            return l(String.valueOf(value));
        }

        @qj.a
        public b p(float value) {
            return l(String.valueOf(value));
        }

        @qj.a
        public b q(int value) {
            return l(String.valueOf(value));
        }

        @qj.a
        public b r(long value) {
            return l(String.valueOf(value));
        }

        @qj.a
        public b s(@zq.a Object value) {
            return i(value);
        }

        @qj.a
        public b t(boolean value) {
            return l(String.valueOf(value));
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0030  */
        /* JADX WARN: Code duplicated, block: B:14:0x0037  */
        /* JADX WARN: Code duplicated, block: B:16:0x0041  */
        /* JADX WARN: Code duplicated, block: B:19:0x005e  */
        public String toString() {
            String str;
            boolean z10 = this.f161672d;
            boolean z11 = this.f161673e;
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append(this.f161669a);
            sb2.append(fw.b.f85382i);
            String str2 = "";
            for (C1581b c1581b = this.f161670b.f161676c; c1581b != null; c1581b = c1581b.f161676c) {
                Object obj = c1581b.f161675b;
                if (c1581b instanceof a) {
                    sb2.append(str2);
                    str = c1581b.f161674a;
                    if (str != null) {
                        sb2.append(str);
                        sb2.append(G5.T);
                    }
                    if (obj == null && obj.getClass().isArray()) {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb2.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    } else {
                        sb2.append(obj);
                    }
                    str2 = ", ";
                } else if (obj == null) {
                    if (!z10) {
                        sb2.append(str2);
                        str = c1581b.f161674a;
                        if (str != null) {
                            sb2.append(str);
                            sb2.append(G5.T);
                        }
                        if (obj == null) {
                            sb2.append(obj);
                        } else {
                            sb2.append(obj);
                        }
                        str2 = ", ";
                    }
                } else if (!z11 || !u(obj)) {
                    sb2.append(str2);
                    str = c1581b.f161674a;
                    if (str != null) {
                        sb2.append(str);
                        sb2.append(G5.T);
                    }
                    if (obj == null) {
                        sb2.append(obj);
                    } else {
                        sb2.append(obj);
                    }
                    str2 = ", ";
                }
            }
            sb2.append(fw.b.f85383j);
            return sb2.toString();
        }

        @qj.a
        public b v() {
            this.f161672d = true;
            return this;
        }

        public b(String className) {
            C1581b c1581b = new C1581b();
            this.f161670b = c1581b;
            this.f161671c = c1581b;
            this.f161672d = false;
            this.f161673e = false;
            this.f161669a = (String) l0.E(className);
        }
    }

    public static <T> T a(@zq.a T first, @zq.a T second) {
        if (first != null) {
            return first;
        }
        if (second != null) {
            return second;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static b b(Class<?> clazz) {
        return new b(clazz.getSimpleName());
    }

    public static b c(Object self) {
        return new b(self.getClass().getSimpleName());
    }

    public static b d(String className) {
        return new b(className);
    }
}
