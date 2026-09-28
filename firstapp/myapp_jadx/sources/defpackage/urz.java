package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes8.dex */
public abstract class urz<T> {

    public static final class a<T> extends urz<T> {
        public final Method a;
        public final int b;
        public final y2b<T, RequestBody> c;

        public a(Method method, int i, y2b<T, RequestBody> y2bVar) {
            this.a = method;
            this.b = i;
            this.c = y2bVar;
        }

        @Override // defpackage.urz
        public final void a(fa50 fa50Var, T t) {
            int i = this.b;
            Method method = this.a;
            if (t == null) {
                throw urh0.j(method, i, "Body parameter value must not be null.", new Object[0]);
            }
            try {
                fa50Var.k = this.c.convert(t);
            } catch (IOException e) {
                throw urh0.k(method, e, i, aya.b(t, "Unable to convert ", " to RequestBody"), new Object[0]);
            }
        }
    }

    public static final class b<T> extends urz<T> {
        public final String a;
        public final boolean b;

        public b(String str, boolean z) {
            Objects.requireNonNull(str, "name == null");
            this.a = str;
            this.b = z;
        }

        @Override // defpackage.urz
        public final void a(fa50 fa50Var, T t) {
            String string;
            if (t == null || (string = t.toString()) == null) {
                return;
            }
            FormBody.Builder builder = fa50Var.j;
            String str = this.a;
            if (this.b) {
                builder.addEncoded(str, string);
            } else {
                builder.add(str, string);
            }
        }
    }

    public static final class c<T> extends urz<Map<String, T>> {
        public final Method a;
        public final int b;
        public final boolean c;

        public c(Method method, int i, boolean z) {
            this.a = method;
            this.b = i;
            this.c = z;
        }

        @Override // defpackage.urz
        public final void a(fa50 fa50Var, Object obj) {
            Map map = (Map) obj;
            int i = this.b;
            Method method = this.a;
            if (map == null) {
                throw urh0.j(method, i, "Field map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw urh0.j(method, i, "Field map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw urh0.j(method, i, tug.a("Field map contained null value for key '", str, "'."), new Object[0]);
                }
                String string = value.toString();
                if (string == null) {
                    throw urh0.j(method, i, "Field map value '" + value + "' converted to null by " + fj5.d.class.getName() + " for key '" + str + "'.", new Object[0]);
                }
                FormBody.Builder builder = fa50Var.j;
                if (this.c) {
                    builder.addEncoded(str, string);
                } else {
                    builder.add(str, string);
                }
            }
        }
    }

    public static final class d<T> extends urz<T> {
        public final String a;
        public final boolean b;

        public d(String str, boolean z) {
            Objects.requireNonNull(str, "name == null");
            this.a = str;
            this.b = z;
        }

        @Override // defpackage.urz
        public final void a(fa50 fa50Var, T t) {
            String string;
            if (t == null || (string = t.toString()) == null) {
                return;
            }
            fa50Var.a(this.a, string, this.b);
        }
    }

    public static final class e<T> extends urz<Map<String, T>> {
        public final Method a;
        public final int b;
        public final boolean c;

        public e(Method method, int i, boolean z) {
            this.a = method;
            this.b = i;
            this.c = z;
        }

        @Override // defpackage.urz
        public final void a(fa50 fa50Var, Object obj) {
            Map map = (Map) obj;
            int i = this.b;
            Method method = this.a;
            if (map == null) {
                throw urh0.j(method, i, "Header map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw urh0.j(method, i, "Header map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw urh0.j(method, i, tug.a("Header map contained null value for key '", str, "'."), new Object[0]);
                }
                fa50Var.a(str, value.toString(), this.c);
            }
        }
    }

    public static final class f extends urz<Headers> {
        public final Method a;
        public final int b;

        public f(int i, Method method) {
            this.a = method;
            this.b = i;
        }

        @Override // defpackage.urz
        public final void a(fa50 fa50Var, Headers headers) {
            Headers headers2 = headers;
            if (headers2 != null) {
                fa50Var.f.addAll(headers2);
            } else {
                throw urh0.j(this.a, this.b, "Headers parameter must not be null.", new Object[0]);
            }
        }
    }

    public static final class g<T> extends urz<T> {
        public final Method a;
        public final int b;
        public final Headers c;
        public final y2b<T, RequestBody> d;

        public g(Method method, int i, Headers headers, y2b<T, RequestBody> y2bVar) {
            this.a = method;
            this.b = i;
            this.c = headers;
            this.d = y2bVar;
        }

        @Override // defpackage.urz
        public final void a(fa50 fa50Var, T t) {
            if (t == null) {
                return;
            }
            try {
                RequestBody requestBodyConvert = this.d.convert(t);
                fa50Var.i.addPart(this.c, requestBodyConvert);
            } catch (IOException e) {
                throw urh0.j(this.a, this.b, aya.b(t, "Unable to convert ", " to RequestBody"), e);
            }
        }
    }

    public static final class h<T> extends urz<Map<String, T>> {
        public final Method a;
        public final int b;
        public final y2b<T, RequestBody> c;
        public final String d;

        public h(Method method, int i, y2b<T, RequestBody> y2bVar, String str) {
            this.a = method;
            this.b = i;
            this.c = y2bVar;
            this.d = str;
        }

        @Override // defpackage.urz
        public final void a(fa50 fa50Var, Object obj) {
            Map map = (Map) obj;
            int i = this.b;
            Method method = this.a;
            if (map == null) {
                throw urh0.j(method, i, "Part map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw urh0.j(method, i, "Part map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw urh0.j(method, i, tug.a("Part map contained null value for key '", str, "'."), new Object[0]);
                }
                fa50Var.i.addPart(Headers.of("Content-Disposition", tug.a("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", this.d), this.c.convert((T) value));
            }
        }
    }

    public static final class i<T> extends urz<T> {
        public final Method a;
        public final int b;
        public final String c;
        public final boolean d;

        public i(Method method, int i, String str, boolean z) {
            this.a = method;
            this.b = i;
            Objects.requireNonNull(str, "name == null");
            this.c = str;
            this.d = z;
        }

        @Override // defpackage.urz
        public final void a(fa50 fa50Var, T t) throws EOFException {
            String strY;
            String str = this.c;
            if (t == null) {
                throw urh0.j(this.a, this.b, tug.a("Path parameter \"", str, "\" value must not be null."), new Object[0]);
            }
            String string = t.toString();
            if (fa50Var.c == null) {
                x01.a();
                return;
            }
            int length = string.length();
            int iCharCount = 0;
            while (true) {
                if (iCharCount >= length) {
                    strY = string;
                    break;
                }
                int iCodePointAt = string.codePointAt(iCharCount);
                boolean z = this.d;
                int i = 47;
                int i2 = -1;
                int i3 = 127;
                int i4 = 32;
                if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z && (iCodePointAt == 47 || iCodePointAt == 37))) {
                    lb5 lb5Var = new lb5();
                    lb5Var.u0(0, iCharCount, string);
                    lb5 lb5Var2 = null;
                    while (iCharCount < length) {
                        int iCodePointAt2 = string.codePointAt(iCharCount);
                        if (!z || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                            if (iCodePointAt2 < i4 || iCodePointAt2 >= i3 || " \"<>^`{}|\\?#".indexOf(iCodePointAt2) != i2 || (!z && (iCodePointAt2 == i || iCodePointAt2 == 37))) {
                                if (lb5Var2 == null) {
                                    lb5Var2 = new lb5();
                                }
                                lb5Var2.A0(iCodePointAt2);
                                long j = lb5Var2.b;
                                long j2 = 0;
                                while (j2 < j) {
                                    byte bM = lb5Var2.m(j2);
                                    lb5Var.d0(37);
                                    char[] cArr = fa50.l;
                                    lb5Var.d0(cArr[((bM & 255) >> 4) & 15]);
                                    lb5Var.d0(cArr[bM & 15]);
                                    j2++;
                                    lb5Var2 = lb5Var2;
                                }
                                lb5Var2.d();
                            } else {
                                lb5Var.A0(iCodePointAt2);
                            }
                        }
                        iCharCount += Character.charCount(iCodePointAt2);
                        i = 47;
                        i2 = -1;
                        i3 = 127;
                        i4 = 32;
                    }
                    strY = lb5Var.Y();
                    break;
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
            String strReplace = fa50Var.c.replace("{" + str + "}", strY);
            if (fa50.m.matcher(strReplace).matches()) {
                hb5.a("@Path parameters shouldn't perform path traversal ('.' or '..'): ".concat(string));
            } else {
                fa50Var.c = strReplace;
            }
        }
    }

    public static final class j<T> extends urz<T> {
        public final String a;
        public final boolean b;

        public j(String str, boolean z) {
            Objects.requireNonNull(str, "name == null");
            this.a = str;
            this.b = z;
        }

        @Override // defpackage.urz
        public final void a(fa50 fa50Var, T t) {
            String string;
            if (t == null || (string = t.toString()) == null) {
                return;
            }
            fa50Var.b(this.a, string, this.b);
        }
    }

    public static final class k<T> extends urz<Map<String, T>> {
        public final Method a;
        public final int b;
        public final boolean c;

        public k(Method method, int i, boolean z) {
            this.a = method;
            this.b = i;
            this.c = z;
        }

        @Override // defpackage.urz
        public final void a(fa50 fa50Var, Object obj) {
            Map map = (Map) obj;
            int i = this.b;
            Method method = this.a;
            if (map == null) {
                throw urh0.j(method, i, "Query map was null", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw urh0.j(method, i, "Query map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw urh0.j(method, i, tug.a("Query map contained null value for key '", str, "'."), new Object[0]);
                }
                String string = value.toString();
                if (string == null) {
                    throw urh0.j(method, i, "Query map value '" + value + "' converted to null by " + fj5.d.class.getName() + " for key '" + str + "'.", new Object[0]);
                }
                fa50Var.b(str, string, this.c);
            }
        }
    }

    public static final class l<T> extends urz<T> {
        public final boolean a;

        public l(boolean z) {
            this.a = z;
        }

        @Override // defpackage.urz
        public final void a(fa50 fa50Var, T t) {
            if (t == null) {
                return;
            }
            fa50Var.b(t.toString(), null, this.a);
        }
    }

    public static final class m extends urz<MultipartBody.Part> {
        public static final m a = new m();

        @Override // defpackage.urz
        public final void a(fa50 fa50Var, MultipartBody.Part part) {
            MultipartBody.Part part2 = part;
            if (part2 != null) {
                fa50Var.i.addPart(part2);
            }
        }
    }

    public static final class n extends urz<Object> {
        public final Method a;
        public final int b;

        public n(int i, Method method) {
            this.a = method;
            this.b = i;
        }

        @Override // defpackage.urz
        public final void a(fa50 fa50Var, Object obj) {
            if (obj != null) {
                fa50Var.c = obj.toString();
            } else {
                throw urh0.j(this.a, this.b, "@Url parameter is null.", new Object[0]);
            }
        }
    }

    public static final class o<T> extends urz<T> {
        public final Class<T> a;

        public o(Class<T> cls) {
            this.a = cls;
        }

        @Override // defpackage.urz
        public final void a(fa50 fa50Var, T t) {
            fa50Var.e.tag(this.a, t);
        }
    }

    public abstract void a(fa50 fa50Var, T t);
}
