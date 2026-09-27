package fx;

import androidx.media3.session.fe;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@s1({"SMAP\nPath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Path.kt\nokio/Path\n+ 2 Path.kt\nokio/internal/-Path\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,132:1\n39#2,3:133\n47#2,28:136\n53#2,22:168\n106#2:190\n111#2:191\n116#2,6:192\n133#2,5:198\n143#2:203\n148#2,25:204\n188#2:229\n193#2,11:230\n198#2,6:241\n193#2,11:247\n198#2,6:258\n222#2,41:264\n267#2:305\n281#2:306\n286#2:307\n291#2:308\n296#2:309\n1563#3:164\n1634#3,3:165\n*S KotlinDebug\n*F\n+ 1 Path.kt\nokio/Path\n*L\n44#1:133,3\n47#1:136,28\n50#1:168,22\n53#1:190\n56#1:191\n60#1:192,6\n64#1:198,5\n68#1:203\n72#1:204,25\n75#1:229\n78#1:230,11\n81#1:241,6\n87#1:247,11\n90#1:258,6\n95#1:264,41\n97#1:305\n104#1:306\n106#1:307\n108#1:308\n110#1:309\n47#1:164\n47#1:165,3\n*E\n"})
public final class t0 implements Comparable<t0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public static final a f85691c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final String f85692d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final o f85693b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }

        public static /* synthetic */ t0 g(a aVar, File file, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return aVar.b(file, z10);
        }

        public static /* synthetic */ t0 h(a aVar, String str, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return aVar.d(str, z10);
        }

        public static /* synthetic */ t0 i(a aVar, Path path, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return aVar.f(path, z10);
        }

        @cs.k
        @cs.j(name = "get")
        @oy.l
        @cs.o
        public final t0 a(@oy.l File file) {
            kotlin.jvm.internal.m0.p(file, "<this>");
            return g(this, file, false, 1, null);
        }

        @cs.k
        @cs.j(name = "get")
        @oy.l
        @cs.o
        public final t0 b(@oy.l File file, boolean z10) {
            kotlin.jvm.internal.m0.p(file, "<this>");
            String string = file.toString();
            kotlin.jvm.internal.m0.o(string, "toString(...)");
            return d(string, z10);
        }

        @cs.k
        @cs.j(name = "get")
        @oy.l
        @cs.o
        public final t0 c(@oy.l String str) {
            kotlin.jvm.internal.m0.p(str, "<this>");
            return h(this, str, false, 1, null);
        }

        @cs.k
        @cs.j(name = "get")
        @oy.l
        @cs.o
        public final t0 d(@oy.l String str, boolean z10) {
            kotlin.jvm.internal.m0.p(str, "<this>");
            return gx.f.B(str, z10);
        }

        @cs.k
        @cs.j(name = "get")
        @oy.l
        @cs.o
        public final t0 e(@oy.l Path path) {
            kotlin.jvm.internal.m0.p(path, "<this>");
            return i(this, path, false, 1, null);
        }

        @cs.k
        @cs.j(name = "get")
        @oy.l
        @cs.o
        public final t0 f(@oy.l Path path, boolean z10) {
            kotlin.jvm.internal.m0.p(path, "<this>");
            return d(path.toString(), z10);
        }

        public a() {
        }
    }

    static {
        String separator = File.separator;
        kotlin.jvm.internal.m0.o(separator, "separator");
        f85692d = separator;
    }

    public t0(@oy.l o bytes) {
        kotlin.jvm.internal.m0.p(bytes, "bytes");
        this.f85693b = bytes;
    }

    public static /* synthetic */ t0 A(t0 t0Var, o oVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return t0Var.v(oVar, z10);
    }

    public static /* synthetic */ t0 B(t0 t0Var, t0 t0Var2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return t0Var.x(t0Var2, z10);
    }

    public static /* synthetic */ t0 C(t0 t0Var, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return t0Var.z(str, z10);
    }

    @cs.k
    @cs.j(name = "get")
    @oy.l
    @cs.o
    public static final t0 b(@oy.l File file) {
        return f85691c.a(file);
    }

    @cs.k
    @cs.j(name = "get")
    @oy.l
    @cs.o
    public static final t0 c(@oy.l File file, boolean z10) {
        return f85691c.b(file, z10);
    }

    @cs.k
    @cs.j(name = "get")
    @oy.l
    @cs.o
    public static final t0 d(@oy.l String str) {
        return f85691c.c(str);
    }

    @cs.k
    @cs.j(name = "get")
    @oy.l
    @cs.o
    public static final t0 e(@oy.l String str, boolean z10) {
        return f85691c.d(str, z10);
    }

    @cs.k
    @cs.j(name = "get")
    @oy.l
    @cs.o
    public static final t0 f(@oy.l Path path) {
        return f85691c.e(path);
    }

    @cs.k
    @cs.j(name = "get")
    @oy.l
    @cs.o
    public static final t0 g(@oy.l Path path, boolean z10) {
        return f85691c.f(path, z10);
    }

    @oy.l
    public final Path E() {
        Path path = Paths.get(toString(), new String[0]);
        kotlin.jvm.internal.m0.o(path, "get(...)");
        return path;
    }

    @cs.j(name = "volumeLetter")
    @oy.m
    public final Character F() {
        if (o.M(h(), gx.f.f87464a, 0, 2, null) != -1 || h().k0() < 2 || h().v(1) != 58) {
            return null;
        }
        char cV = (char) h().v(0);
        if (('a' > cV || cV >= '{') && ('A' > cV || cV >= '[')) {
            return null;
        }
        return Character.valueOf(cV);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(@oy.l t0 other) {
        kotlin.jvm.internal.m0.p(other, "other");
        return h().compareTo(other.h());
    }

    public boolean equals(@oy.m Object obj) {
        return (obj instanceof t0) && kotlin.jvm.internal.m0.g(((t0) obj).h(), h());
    }

    @oy.l
    public final o h() {
        return this.f85693b;
    }

    public int hashCode() {
        return h().hashCode();
    }

    @oy.m
    public final t0 i() {
        int iH = gx.f.H(this);
        if (iH == -1) {
            return null;
        }
        return new t0(h().q0(0, iH));
    }

    public final boolean isAbsolute() {
        return gx.f.H(this) != -1;
    }

    @oy.l
    public final List<String> j() {
        ArrayList arrayList = new ArrayList();
        int iH = gx.f.H(this);
        if (iH == -1) {
            iH = 0;
        } else if (iH < h().k0() && h().v(iH) == 92) {
            iH++;
        }
        int iK0 = h().k0();
        int i10 = iH;
        while (iH < iK0) {
            if (h().v(iH) == 47 || h().v(iH) == 92) {
                arrayList.add(h().q0(i10, iH));
                i10 = iH + 1;
            }
            iH++;
        }
        if (i10 < h().k0()) {
            arrayList.add(h().q0(i10, h().k0()));
        }
        ArrayList arrayList2 = new ArrayList(fr.i0.d0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((o) it.next()).w0());
        }
        return arrayList2;
    }

    @oy.l
    public final List<o> k() {
        ArrayList arrayList = new ArrayList();
        int iH = gx.f.H(this);
        if (iH == -1) {
            iH = 0;
        } else if (iH < h().k0() && h().v(iH) == 92) {
            iH++;
        }
        int iK0 = h().k0();
        int i10 = iH;
        while (iH < iK0) {
            if (h().v(iH) == 47 || h().v(iH) == 92) {
                arrayList.add(h().q0(i10, iH));
                i10 = iH + 1;
            }
            iH++;
        }
        if (i10 < h().k0()) {
            arrayList.add(h().q0(i10, h().k0()));
        }
        return arrayList;
    }

    public final boolean l() {
        return gx.f.H(this) == -1;
    }

    public final boolean m() {
        return gx.f.H(this) == h().k0();
    }

    @cs.j(name = "name")
    @oy.l
    public final String n() {
        return o().w0();
    }

    @cs.j(name = "nameBytes")
    @oy.l
    public final o o() {
        int iE = gx.f.E(this);
        if (iE != -1) {
            return o.r0(h(), iE + 1, 0, 2, null);
        }
        return (F() == null || h().k0() != 2) ? h() : o.f85659g;
    }

    @oy.l
    public final t0 q() {
        return f85691c.d(toString(), true);
    }

    @cs.j(name = androidx.constraintlayout.widget.g.W1)
    @oy.m
    public final t0 s() {
        if (kotlin.jvm.internal.m0.g(h(), gx.f.f87467d) || kotlin.jvm.internal.m0.g(h(), gx.f.f87464a) || kotlin.jvm.internal.m0.g(h(), gx.f.f87465b) || gx.f.G(this)) {
            return null;
        }
        int iE = gx.f.E(this);
        if (iE == 2 && F() != null) {
            if (h().k0() == 3) {
                return null;
            }
            return new t0(o.r0(h(), 0, 3, 1, null));
        }
        if (iE == 1 && h().l0(gx.f.f87465b)) {
            return null;
        }
        if (iE != -1 || F() == null) {
            if (iE == -1) {
                return new t0(gx.f.f87467d);
            }
            return iE == 0 ? new t0(o.r0(h(), 0, 1, 1, null)) : new t0(o.r0(h(), 0, iE, 1, null));
        }
        if (h().k0() == 2) {
            return null;
        }
        return new t0(o.r0(h(), 0, 2, 1, null));
    }

    @oy.l
    public final t0 t(@oy.l t0 other) {
        kotlin.jvm.internal.m0.p(other, "other");
        if (!kotlin.jvm.internal.m0.g(i(), other.i())) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + other).toString());
        }
        List<o> listK = k();
        List<o> listK2 = other.k();
        int iMin = Math.min(listK.size(), listK2.size());
        int i10 = 0;
        while (i10 < iMin && kotlin.jvm.internal.m0.g(listK.get(i10), listK2.get(i10))) {
            i10++;
        }
        if (i10 == iMin && h().k0() == other.h().k0()) {
            return a.h(f85691c, fe.F, false, 1, null);
        }
        if (listK2.subList(i10, listK2.size()).indexOf(gx.f.f87468e) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + other).toString());
        }
        if (kotlin.jvm.internal.m0.g(other.h(), gx.f.f87467d)) {
            return this;
        }
        l lVar = new l();
        o oVarF = gx.f.F(other);
        if (oVarF == null && (oVarF = gx.f.F(this)) == null) {
            oVarF = gx.f.L(f85692d);
        }
        int size = listK2.size();
        for (int i11 = i10; i11 < size; i11++) {
            lVar.M(gx.f.f87468e);
            lVar.M(oVarF);
        }
        int size2 = listK.size();
        while (i10 < size2) {
            lVar.M(listK.get(i10));
            lVar.M(oVarF);
            i10++;
        }
        return gx.f.J(lVar, false);
    }

    @oy.l
    public final File toFile() {
        return new File(toString());
    }

    @oy.l
    public String toString() {
        return h().w0();
    }

    @cs.j(name = "resolve")
    @oy.l
    public final t0 u(@oy.l o child) {
        kotlin.jvm.internal.m0.p(child, "child");
        return gx.f.w(this, gx.f.J(new l().M(child), false), false);
    }

    @oy.l
    public final t0 v(@oy.l o child, boolean z10) {
        kotlin.jvm.internal.m0.p(child, "child");
        return gx.f.w(this, gx.f.J(new l().M(child), false), z10);
    }

    @cs.j(name = "resolve")
    @oy.l
    public final t0 w(@oy.l t0 child) {
        kotlin.jvm.internal.m0.p(child, "child");
        return gx.f.w(this, child, false);
    }

    @oy.l
    public final t0 x(@oy.l t0 child, boolean z10) {
        kotlin.jvm.internal.m0.p(child, "child");
        return gx.f.w(this, child, z10);
    }

    @cs.j(name = "resolve")
    @oy.l
    public final t0 y(@oy.l String child) {
        kotlin.jvm.internal.m0.p(child, "child");
        return gx.f.w(this, gx.f.J(new l().writeUtf8(child), false), false);
    }

    @oy.l
    public final t0 z(@oy.l String child, boolean z10) {
        kotlin.jvm.internal.m0.p(child, "child");
        return gx.f.w(this, gx.f.J(new l().writeUtf8(child), false), z10);
    }
}
