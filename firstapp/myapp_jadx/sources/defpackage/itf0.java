package defpackage;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class itf0 {
    public static final a a = new a();
    public static final ArrayList<b> b = new ArrayList<>();
    public static volatile b[] c = new b[0];

    /* JADX INFO: loaded from: classes8.dex */
    public static final class a extends b {
        @Override // itf0.b
        public final void a(String str, Object... objArr) {
            for (b bVar : itf0.c) {
                bVar.a(str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // itf0.b
        public final void b(Throwable th) {
            for (b bVar : itf0.c) {
                bVar.b(th);
            }
        }

        @Override // itf0.b
        public final void c(Throwable th, String str, Object... objArr) {
            for (b bVar : itf0.c) {
                bVar.c(th, str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // itf0.b
        public final void d(String str, Object... objArr) {
            for (b bVar : itf0.c) {
                bVar.d(str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // itf0.b
        public final void e(Throwable th) {
            for (b bVar : itf0.c) {
                bVar.e(th);
            }
        }

        @Override // itf0.b
        public final void f(Throwable th, String str, Object... objArr) {
            for (b bVar : itf0.c) {
                bVar.f(th, str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // itf0.b
        public final void g(String str, Object... objArr) {
            for (b bVar : itf0.c) {
                bVar.g(str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // itf0.b
        public final void h(Throwable th) {
            for (b bVar : itf0.c) {
                bVar.h(th);
            }
        }

        @Override // itf0.b
        public final void i(Throwable th, Object... objArr) {
            for (b bVar : itf0.c) {
                bVar.i(th, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // itf0.b
        public final void j(String str, int i, String str2, Throwable th) {
            str2.getClass();
            throw new AssertionError();
        }

        @Override // itf0.b
        public final void l(String str, Object... objArr) {
            for (b bVar : itf0.c) {
                bVar.l(str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // itf0.b
        public final void m(Throwable th) {
            for (b bVar : itf0.c) {
                bVar.m(th);
            }
        }

        @Override // itf0.b
        public final void n(String str, Object... objArr) {
            for (b bVar : itf0.c) {
                bVar.n(str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // itf0.b
        public final void o(Throwable th) {
            for (b bVar : itf0.c) {
                bVar.o(th);
            }
        }

        @Override // itf0.b
        public final void p(Throwable th, String str, Object... objArr) {
            for (b bVar : itf0.c) {
                bVar.p(th, str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        public final void q(String str) {
            str.getClass();
            b[] bVarArr = itf0.c;
            int length = bVarArr.length;
            int i = 0;
            while (i < length) {
                b bVar = bVarArr[i];
                i++;
                bVar.a.set(str);
            }
        }
    }

    /* JADX INFO: loaded from: classes8.dex */
    public static abstract class b {
        public final ThreadLocal<String> a = new ThreadLocal<>();

        public void a(String str, Object... objArr) {
            k(3, null, str, Arrays.copyOf(objArr, objArr.length));
        }

        public void b(Throwable th) {
            k(3, th, null, new Object[0]);
        }

        public void c(Throwable th, String str, Object... objArr) {
            k(3, th, str, Arrays.copyOf(objArr, objArr.length));
        }

        public void d(String str, Object... objArr) {
            k(6, null, str, Arrays.copyOf(objArr, objArr.length));
        }

        public void e(Throwable th) {
            k(6, th, null, new Object[0]);
        }

        public void f(Throwable th, String str, Object... objArr) {
            k(6, th, str, Arrays.copyOf(objArr, objArr.length));
        }

        public void g(String str, Object... objArr) {
            k(4, null, str, Arrays.copyOf(objArr, objArr.length));
        }

        public void h(Throwable th) {
            k(4, th, null, new Object[0]);
        }

        public void i(Throwable th, Object... objArr) {
            k(4, th, "stomp status: %s", Arrays.copyOf(objArr, objArr.length));
        }

        public abstract void j(String str, int i, String str2, Throwable th);

        public final void k(int i, Throwable th, String str, Object... objArr) {
            ThreadLocal<String> threadLocal = this.a;
            String str2 = threadLocal.get();
            if (str2 != null) {
                threadLocal.remove();
            }
            if (str != null && str.length() != 0) {
                if (objArr.length != 0) {
                    Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    str = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                }
                if (th != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append((Object) str);
                    sb.append('\n');
                    StringWriter stringWriter = new StringWriter(256);
                    PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
                    th.printStackTrace(printWriter);
                    printWriter.flush();
                    String string = stringWriter.toString();
                    string.getClass();
                    sb.append(string);
                    str = sb.toString();
                }
            } else {
                if (th == null) {
                    return;
                }
                StringWriter stringWriter2 = new StringWriter(256);
                PrintWriter printWriter2 = new PrintWriter((Writer) stringWriter2, false);
                th.printStackTrace(printWriter2);
                printWriter2.flush();
                str = stringWriter2.toString();
                str.getClass();
            }
            j(str2, i, str, th);
        }

        public void l(String str, Object... objArr) {
            k(2, null, str, Arrays.copyOf(objArr, objArr.length));
        }

        public void m(Throwable th) {
            k(2, th, null, new Object[0]);
        }

        public void n(String str, Object... objArr) {
            k(5, null, str, Arrays.copyOf(objArr, objArr.length));
        }

        public void o(Throwable th) {
            k(5, th, null, new Object[0]);
        }

        public void p(Throwable th, String str, Object... objArr) {
            k(5, th, str, Arrays.copyOf(objArr, objArr.length));
        }
    }
}
