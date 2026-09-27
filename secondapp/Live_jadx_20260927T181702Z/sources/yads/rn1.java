package yads;

import com.ironsource.C4235d4;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v3 yads.rn1[], still in use, count: 1, list:
  (r8v3 yads.rn1[]) from 0x004b: INVOKE (r8v3 yads.rn1[]) STATIC call: sr.c.c(java.lang.Enum[]):sr.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):sr.a<E extends java.lang.Enum<E>> (m)] (LINE:76)
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
public final class rn1 {
    f155051c(C4235d4.i.K),
    f155052d("video"),
    f155053e("multibanner"),
    f155054f("image"),
    f155055g("mediation");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f155057b;

    static {
        sr.c.c(rn1VarArr);
    }

    public rn1(String str) {
        super(str, i);
        this.f155057b = str;
    }

    public static rn1 valueOf(String str) {
        return (rn1) Enum.valueOf(rn1.class, str);
    }

    public static rn1[] values() {
        return (rn1[]) f155056h.clone();
    }
}
