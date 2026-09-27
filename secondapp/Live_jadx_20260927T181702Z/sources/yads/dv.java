package yads;

import com.ironsource.C4235d4;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v3 yads.dv[], still in use, count: 1, list:
  (r2v3 yads.dv[]) from 0x001f: INVOKE (r2v3 yads.dv[]) STATIC call: sr.c.c(java.lang.Enum[]):sr.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):sr.a<E extends java.lang.Enum<E>> (m)] (LINE:32)
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
/* JADX INFO: loaded from: classes9.dex */
public final class dv {
    /* JADX INFO: Fake field, exist only in values array */
    EF0("browser"),
    f148371d(C4235d4.i.K);


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final cv f148370c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f148373b;

    static {
        sr.c.c(dvVarArr);
        f148370c = new cv();
    }

    public dv(String str) {
        super(str, i);
        this.f148373b = str;
    }

    public static dv valueOf(String str) {
        return (dv) Enum.valueOf(dv.class, str);
    }

    public static dv[] values() {
        return (dv[]) f148372e.clone();
    }
}
