package xr;

import dr.l1;
import java.io.InputStream;
import java.nio.charset.Charset;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@cs.j(name = "ConsoleKt")
public final class d {
    @ur.f
    public static final void a(byte b10) {
        System.out.print(Byte.valueOf(b10));
    }

    @ur.f
    public static final void b(char c10) {
        System.out.print(c10);
    }

    @ur.f
    public static final void c(double d10) {
        System.out.print(d10);
    }

    @ur.f
    public static final void d(float f10) {
        System.out.print(f10);
    }

    @ur.f
    public static final void e(int i10) {
        System.out.print(i10);
    }

    @ur.f
    public static final void f(long j10) {
        System.out.print(j10);
    }

    @ur.f
    public static final void g(Object obj) {
        System.out.print(obj);
    }

    @ur.f
    public static final void h(short s10) {
        System.out.print(Short.valueOf(s10));
    }

    @ur.f
    public static final void i(boolean z10) {
        System.out.print(z10);
    }

    @ur.f
    public static final void j(char[] message) {
        m0.p(message, "message");
        System.out.print(message);
    }

    @ur.f
    public static final void k() {
        System.out.println();
    }

    @ur.f
    public static final void l(byte b10) {
        System.out.println(Byte.valueOf(b10));
    }

    @ur.f
    public static final void m(char c10) {
        System.out.println(c10);
    }

    @ur.f
    public static final void n(double d10) {
        System.out.println(d10);
    }

    @ur.f
    public static final void o(float f10) {
        System.out.println(f10);
    }

    @ur.f
    public static final void p(int i10) {
        System.out.println(i10);
    }

    @ur.f
    public static final void q(long j10) {
        System.out.println(j10);
    }

    @ur.f
    public static final void r(Object obj) {
        System.out.println(obj);
    }

    @ur.f
    public static final void s(short s10) {
        System.out.println(Short.valueOf(s10));
    }

    @ur.f
    public static final void t(boolean z10) {
        System.out.println(z10);
    }

    @ur.f
    public static final void u(char[] message) {
        m0.p(message, "message");
        System.out.println(message);
    }

    @oy.m
    public static final String v() {
        t tVar = t.f145537a;
        InputStream in2 = System.in;
        m0.o(in2, "in");
        Charset charsetDefaultCharset = Charset.defaultCharset();
        m0.o(charsetDefaultCharset, "defaultCharset(...)");
        return tVar.d(in2, charsetDefaultCharset);
    }

    @oy.l
    @l1(version = "1.6")
    public static final String w() {
        String strX = x();
        if (strX != null) {
            return strX;
        }
        throw new x("EOF has already been reached");
    }

    @l1(version = "1.6")
    @oy.m
    public static final String x() {
        return v();
    }
}
