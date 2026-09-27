package com.inmobi.media;

import android.util.SparseArray;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v25 com.inmobi.media.a6[], still in use, count: 1, list:
  (r1v25 com.inmobi.media.a6[]) from 0x0262: INVOKE (r0v24 sr.a) = (r1v25 com.inmobi.media.a6[]) STATIC call: sr.c.c(java.lang.Enum[]):sr.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):sr.a<E extends java.lang.Enum<E>> (m)] (LINE:611)
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
/* JADX INFO: renamed from: com.inmobi.media.a6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC3530a6 {
    /* JADX INFO: Fake field, exist only in values array */
    EF0("NETWORK_UNAVAILABLE_ERROR"),
    f55935d("UNKNOWN_ERROR"),
    f55936e("NETWORK_IO_ERROR"),
    /* JADX INFO: Fake field, exist only in values array */
    EF4("OUT_OF_MEMORY_ERROR"),
    /* JADX INFO: Fake field, exist only in values array */
    EF6("INVALID_ENCRYPTED_RESPONSE_RECEIVED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF8("RESPONSE_EXCEEDS_SPECIFIED_SIZE_LIMIT"),
    /* JADX INFO: Fake field, exist only in values array */
    EF10("GZIP_DECOMPRESSION_FAILED"),
    f55937f("BAD_REQUEST"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("GDPR_COMPLIANCE_ENFORCED"),
    f55938g("GENERIC_HTTP_2XX"),
    /* JADX INFO: Fake field, exist only in values array */
    EF7("RESPONSE_PARSING_ERROR"),
    /* JADX INFO: Fake field, exist only in values array */
    EF9("RETRY_ATTEMPTED"),
    f55939h("NETWORK_UNAVAILABLE_CONTEXT_LOSS"),
    f55940i("NETWORK_UNAVAILABLE_IDLE_MODE"),
    f55941j("NETWORK_UNAVAILABLE_NO_CONNECTION_M_OR_ABOVE"),
    f55942k("NETWORK_UNAVAILABLE_NO_CONNECTION_BELOW_M"),
    f55943l("NETWORK_UNAVAILABLE_EXCEPTION"),
    f55944m("NETWORK_PREPARE_FAIL"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("NETWORK_REQUEST_GENERIC_DROPPED_BY_INTERCEPTOR"),
    f55945n("NETWORK_REQUEST_CANCELLED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("NETWORK_REQUEST_EXCEPTION"),
    f55946o("NETWORK_UNAVAILABLE_CUSTOM_VALIDATOR"),
    f55947p("NETWORK_REDIRECT_MALFORMED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("HTTP_NO_CONTENT"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("HTTP_NOT_MODIFIED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("HTTP_SEE_OTHER"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("HTTP_SERVER_NOT_FOUND"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("HTTP_MOVED_TEMP"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("HTTP_INTERNAL_SERVER_ERROR"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("HTTP_NOT_IMPLEMENTED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("HTTP_BAD_GATEWAY"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("HTTP_SERVER_NOT_AVAILABLE"),
    f55948q("HTTP_GATEWAY_TIMEOUT"),
    /* JADX INFO: Fake field, exist only in values array */
    EF475("HTTP_VERSION_NOT_SUPPORTED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF488("HTTP_UNAUTHORISED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF501("SERVER_ERROR_END_CODE");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Y5 f55933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final SparseArray f55934c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f55950a;

    static {
        sr.a<EnumC3530a6> aVarC = sr.c.c(enumC3530a6Arr);
        f55933b = new Y5();
        f55934c = new SparseArray();
        for (EnumC3530a6 enumC3530a6 : aVarC) {
            f55934c.put(enumC3530a6.f55950a, enumC3530a6);
        }
    }

    public EnumC3530a6(String str) {
        super(str, i);
        this.f55950a = i;
    }

    public static EnumC3530a6 valueOf(String str) {
        return (EnumC3530a6) Enum.valueOf(EnumC3530a6.class, str);
    }

    public static EnumC3530a6[] values() {
        return (EnumC3530a6[]) f55949r.clone();
    }
}
