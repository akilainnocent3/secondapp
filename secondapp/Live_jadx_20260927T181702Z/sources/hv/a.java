package hv;

import kotlin.jvm.internal.x;
import oy.l;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 hv.a, still in use, count: 1, list:
  (r0v1 hv.a) from 0x0032: SPUT (r0v1 hv.a) (LINE:51) hv.a.c hv.a
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
public final class a {
    SPARSE_ARRAY,
    HASH_MAP,
    NO_CACHE;


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ sr.a f88574h = sr.c.c(d());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @l
    public static final C0888a f88568b = new C0888a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @l
    public static final a f88569c = new a();

    /* JADX INFO: renamed from: hv.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class C0888a {
        public /* synthetic */ C0888a(x xVar) {
            this();
        }

        @l
        public final a a() {
            return a.f88569c;
        }

        public C0888a() {
        }
    }

    static {
    }

    public a() {
        super(str, i);
    }

    @l
    public static sr.a<a> h() {
        return f88574h;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f88573g.clone();
    }
}
