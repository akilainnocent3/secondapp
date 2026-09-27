package yads;

import com.vungle.ads.internal.model.Cookie;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v4 yads.sw[], still in use, count: 1, list:
  (r10v4 yads.sw[]) from 0x0058: INVOKE (r10v4 yads.sw[]) STATIC call: sr.c.c(java.lang.Enum[]):sr.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):sr.a<E extends java.lang.Enum<E>> (m)] (LINE:89)
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
public final class sw {
    /* JADX INFO: Fake field, exist only in values array */
    EF9("IABConsent_ConsentString", "IABTCF_TCString"),
    /* JADX INFO: Fake field, exist only in values array */
    EF21("IABConsent_SubjectToGDPR", Cookie.IABTCF_GDPR_APPLIES),
    /* JADX INFO: Fake field, exist only in values array */
    EF33("IABConsent_CMPPresent", "IABTCF_CmpSdkID"),
    /* JADX INFO: Fake field, exist only in values array */
    EF45("IABConsent_ParsedPurposeConsents", "IABTCF_PurposeConsents"),
    /* JADX INFO: Fake field, exist only in values array */
    EF57("IABConsent_ParsedVendorConsents", "IABTCF_VendorConsents"),
    /* JADX INFO: Fake field, exist only in values array */
    EF68(null, "IABTCF_AddtlConsent");


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final rw f155578d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f155580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f155581c;

    static {
        sr.c.c(swVarArr);
        f155578d = new rw();
    }

    public sw(String str, String str2) {
        super(str, i);
        this.f155580b = str;
        this.f155581c = str2;
    }

    public static sw valueOf(String str) {
        return (sw) Enum.valueOf(sw.class, str);
    }

    public static sw[] values() {
        return (sw[]) f155579e.clone();
    }
}
