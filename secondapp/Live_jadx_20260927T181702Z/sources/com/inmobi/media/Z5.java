package com.inmobi.media;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v3 com.inmobi.media.Z5[], still in use, count: 1, list:
  (r7v3 com.inmobi.media.Z5[]) from 0x007c: INVOKE (r7v3 com.inmobi.media.Z5[]) STATIC call: sr.c.c(java.lang.Enum[]):sr.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):sr.a<E extends java.lang.Enum<E>> (m)] (LINE:125)
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
public final class Z5 {
    /* JADX INFO: Fake field, exist only in values array */
    EF9("PING_V2_DISABLED", "Ping V2 is disabled from SDK config"),
    /* JADX INFO: Fake field, exist only in values array */
    EF21("PING_ID_MISSING", "Ping ID is missing"),
    /* JADX INFO: Fake field, exist only in values array */
    EF33("PING_URL_INVALID", "Ping url is invalid"),
    /* JADX INFO: Fake field, exist only in values array */
    EF45("PING_URL_MISSING", "Ping URL is missing"),
    /* JADX INFO: Fake field, exist only in values array */
    EF57("PING_JSON_INVALID", "Ping JSON is invalid"),
    /* JADX INFO: Fake field, exist only in values array */
    EF69("PING_ARRAY_EMPTY", "Ping array is empty"),
    /* JADX INFO: Fake field, exist only in values array */
    EF83("PING_UNKNOWN_RESPONSE", "Ping response is unknown"),
    /* JADX INFO: Fake field, exist only in values array */
    EF99("PING_EXCEPTION", "Ping exception occurred");

    static {
        sr.c.c(z5Arr);
    }

    public Z5(String str, String str2) {
        super(str, i);
    }

    public static Z5 valueOf(String str) {
        return (Z5) Enum.valueOf(Z5.class, str);
    }

    public static Z5[] values() {
        return (Z5[]) f55873a.clone();
    }
}
