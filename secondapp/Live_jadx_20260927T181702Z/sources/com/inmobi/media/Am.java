package com.inmobi.media;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v3 com.inmobi.media.Am[], still in use, count: 1, list:
  (r10v3 com.inmobi.media.Am[]) from 0x0057: INVOKE (r10v3 com.inmobi.media.Am[]) STATIC call: sr.c.c(java.lang.Enum[]):sr.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):sr.a<E extends java.lang.Enum<E>> (m)] (LINE:88)
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
/* JADX INFO: loaded from: classes6.dex */
public final class Am {
    UNKNOWN(Y7.UNDEFINED_ERROR),
    MALFORMED_URL(Y7.MALFORMED_URL),
    /* JADX INFO: Fake field, exist only in values array */
    TIMEOUT(Y7.TIMEOUT),
    NETWORK(Y7.NETWORK),
    NO_URL_FOUND(Y7.NO_URL_FOUND),
    INVALID_STATE(Y7.INVALID_STATE);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y7 f54371a;

    static {
        sr.c.c(amArr);
    }

    public Am(Y7 y10) {
        super(str, i);
        this.f54371a = y10;
    }

    public static Am valueOf(String str) {
        return (Am) Enum.valueOf(Am.class, str);
    }

    public static Am[] values() {
        return (Am[]) f54370g.clone();
    }
}
