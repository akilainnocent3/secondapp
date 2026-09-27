package za;

import bb.q;
import java.util.List;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@y0({y0.a.LIBRARY})
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<q> f160928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char f160929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f160930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f160931d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f160932e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f160933f;

    public d(List<q> list, char c10, double d10, double d11, String str, String str2) {
        this.f160928a = list;
        this.f160929b = c10;
        this.f160930c = d10;
        this.f160931d = d11;
        this.f160932e = str;
        this.f160933f = str2;
    }

    public static int c(char c10, String str, String str2) {
        return (((c10 * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public List<q> a() {
        return this.f160928a;
    }

    public double b() {
        return this.f160931d;
    }

    public int hashCode() {
        return c(this.f160929b, this.f160933f, this.f160932e);
    }
}
