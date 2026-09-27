package dr;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class t {
    @ur.e
    @l1(version = "1.1")
    public static void a(@oy.l Throwable th2, @oy.l Throwable exception) throws IllegalAccessException, InvocationTargetException {
        kotlin.jvm.internal.m0.p(th2, "<this>");
        kotlin.jvm.internal.m0.p(exception, "exception");
        if (th2 != exception) {
            ur.n.f139648a.a(th2, exception);
        }
    }

    @oy.l
    public static final StackTraceElement[] b(@oy.l Throwable th2) {
        kotlin.jvm.internal.m0.p(th2, "<this>");
        StackTraceElement[] stackTrace = th2.getStackTrace();
        kotlin.jvm.internal.m0.m(stackTrace);
        return stackTrace;
    }

    @oy.l
    public static final List<Throwable> d(@oy.l Throwable th2) {
        kotlin.jvm.internal.m0.p(th2, "<this>");
        return ur.n.f139648a.d(th2);
    }

    @ur.f
    public static final void f(Throwable th2) {
        kotlin.jvm.internal.m0.p(th2, "<this>");
        th2.printStackTrace();
    }

    @ur.f
    public static final void g(Throwable th2, PrintStream stream) {
        kotlin.jvm.internal.m0.p(th2, "<this>");
        kotlin.jvm.internal.m0.p(stream, "stream");
        th2.printStackTrace(stream);
    }

    @ur.f
    public static final void h(Throwable th2, PrintWriter writer) {
        kotlin.jvm.internal.m0.p(th2, "<this>");
        kotlin.jvm.internal.m0.p(writer, "writer");
        th2.printStackTrace(writer);
    }

    @oy.l
    @l1(version = sc.k.f129877g)
    public static String i(@oy.l Throwable th2) {
        kotlin.jvm.internal.m0.p(th2, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th2.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        kotlin.jvm.internal.m0.o(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ void c(Throwable th2) {
    }

    @l1(version = sc.k.f129877g)
    public static /* synthetic */ void e(Throwable th2) {
    }
}
