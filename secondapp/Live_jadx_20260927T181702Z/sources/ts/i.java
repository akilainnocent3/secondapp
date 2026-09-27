package ts;

import dr.i0;
import dr.k0;
import fr.y1;
import java.util.Set;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.x;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ts.i, still in use, count: 1, list:
  (r0v1 ts.i) from 0x0070: FILLED_NEW_ARRAY (r0v1 ts.i), (r1v2 ts.i), (r2v3 ts.i), (r5v2 ts.i), (r7v2 ts.i), (r9v2 ts.i), (r11v2 ts.i) A[WRAPPED] (LINE:113) elemType: ts.i
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class i {
    BOOLEAN("Boolean"),
    CHAR("Char"),
    BYTE("Byte"),
    SHORT("Short"),
    INT("Int"),
    FLOAT("Float"),
    LONG("Long"),
    DOUBLE("Double");


    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final Set<i> f137201g = y1.u(new i("Char"), new i("Byte"), new i("Short"), new i("Int"), new i("Float"), new i("Long"), new i("Double"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final wt.f f137211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public final wt.f f137212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    public final i0 f137213d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.l
    public final i0 f137214e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oy.l
    public static final a f137200f = new a(null);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public /* synthetic */ a(x xVar) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends o0 implements ds.a<wt.c> {
        public b() {
            super(0);
        }

        @Override // ds.a
        @oy.l
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final wt.c invoke() {
            wt.c cVarC = k.f137252v.c(i.this.h());
            m0.o(cVarC, "BUILT_INS_PACKAGE_FQ_NAME.child(arrayTypeName)");
            return cVarC;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c extends o0 implements ds.a<wt.c> {
        public c() {
            super(0);
        }

        @Override // ds.a
        @oy.l
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final wt.c invoke() {
            wt.c cVarC = k.f137252v.c(i.this.j());
            m0.o(cVarC, "BUILT_INS_PACKAGE_FQ_NAME.child(this.typeName)");
            return cVarC;
        }
    }

    static {
    }

    public i(String str) {
        super(str, i);
        wt.f fVarF = wt.f.f(str);
        m0.o(fVarF, "identifier(typeName)");
        this.f137211b = fVarF;
        wt.f fVarF2 = wt.f.f(str + "Array");
        m0.o(fVarF2, "identifier(\"${typeName}Array\")");
        this.f137212c = fVarF2;
        dr.m0 m0Var = dr.m0.PUBLICATION;
        this.f137213d = k0.a(m0Var, new c());
        this.f137214e = k0.a(m0Var, new b());
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f137210p.clone();
    }

    @oy.l
    public final wt.c g() {
        return (wt.c) this.f137214e.getValue();
    }

    @oy.l
    public final wt.f h() {
        return this.f137212c;
    }

    @oy.l
    public final wt.c i() {
        return (wt.c) this.f137213d.getValue();
    }

    @oy.l
    public final wt.f j() {
        return this.f137211b;
    }
}
