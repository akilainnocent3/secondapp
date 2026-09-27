package jw;

import dr.g1;
import dr.z0;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import kotlin.jvm.internal.s1;
import kotlin.jvm.internal.u1;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@s1({"SMAP\nHeaders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Headers.kt\nokhttp3/Headers\n+ 2 -UtilJvm.kt\nokhttp3/internal/_UtilJvmKt\n*L\n1#1,359:1\n252#2:360\n*S KotlinDebug\n*F\n+ 1 Headers.kt\nokhttp3/Headers\n*L\n110#1:360\n*E\n"})
public final class a0 implements Iterable<z0<? extends String, ? extends String>>, es.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public static final b f100983c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final a0 f100984d = new a0(new String[0]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final String[] f100985b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nHeaders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Headers.kt\nokhttp3/Headers$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,359:1\n1#2:360\n*E\n"})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        public final List<String> f100986a = new ArrayList(20);

        @oy.l
        public final a a(@oy.l String line) {
            kotlin.jvm.internal.m0.p(line, "line");
            int iI3 = cv.p0.I3(line, ':', 0, false, 6, null);
            if (iI3 == -1) {
                throw new IllegalArgumentException(("Unexpected header: " + line).toString());
            }
            String strSubstring = line.substring(0, iI3);
            kotlin.jvm.internal.m0.o(strSubstring, "substring(...)");
            String string = cv.p0.b6(strSubstring).toString();
            String strSubstring2 = line.substring(iI3 + 1);
            kotlin.jvm.internal.m0.o(strSubstring2, "substring(...)");
            b(string, strSubstring2);
            return this;
        }

        @oy.l
        public final a b(@oy.l String name, @oy.l String value) {
            kotlin.jvm.internal.m0.p(name, "name");
            kotlin.jvm.internal.m0.p(value, "value");
            return kw.g.b(this, name, value);
        }

        @oy.l
        @IgnoreJRERequirement
        public final a c(@oy.l String name, @oy.l Instant value) {
            kotlin.jvm.internal.m0.p(name, "name");
            kotlin.jvm.internal.m0.p(value, "value");
            Date dateFrom = Date.from(value);
            kotlin.jvm.internal.m0.o(dateFrom, "from(...)");
            return d(name, dateFrom);
        }

        @oy.l
        public final a d(@oy.l String name, @oy.l Date value) {
            kotlin.jvm.internal.m0.p(name, "name");
            kotlin.jvm.internal.m0.p(value, "value");
            return b(name, qw.c.b(value));
        }

        @oy.l
        public final a e(@oy.l a0 headers) {
            kotlin.jvm.internal.m0.p(headers, "headers");
            return kw.g.c(this, headers);
        }

        @oy.l
        public final a f(@oy.l String line) {
            kotlin.jvm.internal.m0.p(line, "line");
            int iI3 = cv.p0.I3(line, ':', 1, false, 4, null);
            if (iI3 != -1) {
                String strSubstring = line.substring(0, iI3);
                kotlin.jvm.internal.m0.o(strSubstring, "substring(...)");
                String strSubstring2 = line.substring(iI3 + 1);
                kotlin.jvm.internal.m0.o(strSubstring2, "substring(...)");
                g(strSubstring, strSubstring2);
                return this;
            }
            if (line.charAt(0) != ':') {
                g("", line);
                return this;
            }
            String strSubstring3 = line.substring(1);
            kotlin.jvm.internal.m0.o(strSubstring3, "substring(...)");
            g("", strSubstring3);
            return this;
        }

        @oy.l
        public final a g(@oy.l String name, @oy.l String value) {
            kotlin.jvm.internal.m0.p(name, "name");
            kotlin.jvm.internal.m0.p(value, "value");
            return kw.g.d(this, name, value);
        }

        @oy.l
        public final a h(@oy.l String name, @oy.l String value) {
            kotlin.jvm.internal.m0.p(name, "name");
            kotlin.jvm.internal.m0.p(value, "value");
            kw.g.t(name);
            g(name, value);
            return this;
        }

        @oy.l
        public final a0 i() {
            return kw.g.e(this);
        }

        @oy.m
        public final String j(@oy.l String name) {
            kotlin.jvm.internal.m0.p(name, "name");
            return kw.g.g(this, name);
        }

        @oy.l
        public final List<String> k() {
            return this.f100986a;
        }

        @oy.l
        public final a l(@oy.l String name) {
            kotlin.jvm.internal.m0.p(name, "name");
            return kw.g.n(this, name);
        }

        @oy.l
        public final a m(@oy.l String name, @oy.l String value) {
            kotlin.jvm.internal.m0.p(name, "name");
            kotlin.jvm.internal.m0.p(value, "value");
            return kw.g.o(this, name, value);
        }

        @oy.l
        @IgnoreJRERequirement
        public final a n(@oy.l String name, @oy.l Instant value) {
            kotlin.jvm.internal.m0.p(name, "name");
            kotlin.jvm.internal.m0.p(value, "value");
            Date dateFrom = Date.from(value);
            kotlin.jvm.internal.m0.o(dateFrom, "from(...)");
            return o(name, dateFrom);
        }

        @oy.l
        public final a o(@oy.l String name, @oy.l Date value) {
            kotlin.jvm.internal.m0.p(name, "name");
            kotlin.jvm.internal.m0.p(value, "value");
            return m(name, qw.c.b(value));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.x xVar) {
            this();
        }

        @cs.j(name = "-deprecated_of")
        @oy.l
        @dr.o(level = dr.q.ERROR, message = "function moved to extension", replaceWith = @g1(expression = "headers.toHeaders()", imports = {}))
        public final a0 a(@oy.l Map<String, String> headers) {
            kotlin.jvm.internal.m0.p(headers, "headers");
            return c(headers);
        }

        @cs.j(name = "-deprecated_of")
        @oy.l
        @dr.o(level = dr.q.ERROR, message = "function name changed", replaceWith = @g1(expression = "headersOf(*namesAndValues)", imports = {}))
        public final a0 b(@oy.l String... namesAndValues) {
            kotlin.jvm.internal.m0.p(namesAndValues, "namesAndValues");
            return d((String[]) Arrays.copyOf(namesAndValues, namesAndValues.length));
        }

        @cs.j(name = "of")
        @oy.l
        @cs.o
        public final a0 c(@oy.l Map<String, String> map) {
            kotlin.jvm.internal.m0.p(map, "<this>");
            return kw.g.p(map);
        }

        @cs.j(name = "of")
        @oy.l
        @cs.o
        public final a0 d(@oy.l String... namesAndValues) {
            kotlin.jvm.internal.m0.p(namesAndValues, "namesAndValues");
            return kw.g.j((String[]) Arrays.copyOf(namesAndValues, namesAndValues.length));
        }

        public b() {
        }
    }

    public a0(@oy.l String[] namesAndValues) {
        kotlin.jvm.internal.m0.p(namesAndValues, "namesAndValues");
        this.f100985b = namesAndValues;
    }

    @cs.j(name = "of")
    @oy.l
    @cs.o
    public static final a0 n(@oy.l Map<String, String> map) {
        return f100983c.c(map);
    }

    @cs.j(name = "of")
    @oy.l
    @cs.o
    public static final a0 p(@oy.l String... strArr) {
        return f100983c.d(strArr);
    }

    @cs.j(name = "-deprecated_size")
    @dr.o(level = dr.q.ERROR, message = "moved to val", replaceWith = @g1(expression = "size", imports = {}))
    public final int d() {
        return size();
    }

    public final long e() {
        String[] strArr = this.f100985b;
        long length = strArr.length * 2;
        int length2 = strArr.length;
        for (int i10 = 0; i10 < length2; i10++) {
            length += (long) this.f100985b[i10].length();
        }
        return length;
    }

    public boolean equals(@oy.m Object obj) {
        return kw.g.f(this, obj);
    }

    @oy.m
    public final String f(@oy.l String name) {
        kotlin.jvm.internal.m0.p(name, "name");
        return kw.g.i(this.f100985b, name);
    }

    @oy.m
    public final Date g(@oy.l String name) {
        kotlin.jvm.internal.m0.p(name, "name");
        String strF = f(name);
        if (strF != null) {
            return qw.c.a(strF);
        }
        return null;
    }

    @IgnoreJRERequirement
    @oy.m
    public final Instant h(@oy.l String name) {
        kotlin.jvm.internal.m0.p(name, "name");
        Date dateG = g(name);
        if (dateG != null) {
            return dateG.toInstant();
        }
        return null;
    }

    public int hashCode() {
        return kw.g.h(this);
    }

    @oy.l
    public final String[] i() {
        return this.f100985b;
    }

    @Override // java.lang.Iterable
    @oy.l
    public Iterator<z0<? extends String, ? extends String>> iterator() {
        return kw.g.k(this);
    }

    @oy.l
    public final String j(int i10) {
        return kw.g.l(this, i10);
    }

    @oy.l
    public final Set<String> l() {
        TreeSet treeSet = new TreeSet(cv.k0.i2(u1.f102789a));
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            treeSet.add(j(i10));
        }
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(treeSet);
        kotlin.jvm.internal.m0.o(setUnmodifiableSet, "unmodifiableSet(...)");
        return setUnmodifiableSet;
    }

    @oy.l
    public final a m() {
        return kw.g.m(this);
    }

    @oy.l
    public final Map<String, List<String>> q() {
        TreeMap treeMap = new TreeMap(cv.k0.i2(u1.f102789a));
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            String strJ = j(i10);
            Locale US = Locale.US;
            kotlin.jvm.internal.m0.o(US, "US");
            String lowerCase = strJ.toLowerCase(US);
            kotlin.jvm.internal.m0.o(lowerCase, "toLowerCase(...)");
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(r(i10));
        }
        return treeMap;
    }

    @oy.l
    public final String r(int i10) {
        return kw.g.r(this, i10);
    }

    @oy.l
    public final List<String> s(@oy.l String name) {
        kotlin.jvm.internal.m0.p(name, "name");
        return kw.g.s(this, name);
    }

    @cs.j(name = "size")
    public final int size() {
        return this.f100985b.length / 2;
    }

    @oy.l
    public String toString() {
        return kw.g.q(this);
    }
}
