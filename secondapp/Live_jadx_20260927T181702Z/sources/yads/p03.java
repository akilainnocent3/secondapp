package yads;

import com.yandex.div.core.ScrollDirection;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v3 yads.p03[], still in use, count: 1, list:
  (r2v3 yads.p03[]) from 0x001f: INVOKE (r2v3 yads.p03[]) STATIC call: sr.c.c(java.lang.Enum[]):sr.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):sr.a<E extends java.lang.Enum<E>> (m)] (LINE:32)
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
public final class p03 {
    /* JADX INFO: Fake field, exist only in values array */
    EF0(ScrollDirection.NEXT),
    f153675c("last");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f153677b;

    static {
        sr.c.c(p03VarArr);
    }

    public p03(String str) {
        super(str, i);
        this.f153677b = str;
    }

    public static p03 valueOf(String str) {
        return (p03) Enum.valueOf(p03.class, str);
    }

    public static p03[] values() {
        return (p03[]) f153676d.clone();
    }
}
