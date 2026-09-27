package yads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v14 yads.ab3[], still in use, count: 1, list:
  (r0v14 yads.ab3[]) from 0x0193: INVOKE (r0v14 yads.ab3[]) STATIC call: sr.c.c(java.lang.Enum[]):sr.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):sr.a<E extends java.lang.Enum<E>> (m)] (LINE:404)
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
public final class ab3 {
    /* JADX INFO: Fake field, exist only in values array */
    EF0("sms:"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2(t1.c.f135976b),
    /* JADX INFO: Fake field, exist only in values array */
    EF4("voicemail:"),
    /* JADX INFO: Fake field, exist only in values array */
    EF5("tel:"),
    /* JADX INFO: Fake field, exist only in values array */
    EF7("callto:"),
    /* JADX INFO: Fake field, exist only in values array */
    EF9("fax:"),
    /* JADX INFO: Fake field, exist only in values array */
    EF11("geo:"),
    /* JADX INFO: Fake field, exist only in values array */
    EF13("map:"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("maps:"),
    f146736d("market:"),
    f146737e("play:"),
    /* JADX INFO: Fake field, exist only in values array */
    EF10("google.streetview:"),
    f146738f("market.android"),
    f146739g("play.google"),
    /* JADX INFO: Fake field, exist only in values array */
    EF196("map"),
    /* JADX INFO: Fake field, exist only in values array */
    EF211("maps"),
    /* JADX INFO: Fake field, exist only in values array */
    EF226("mobile.maps"),
    /* JADX INFO: Fake field, exist only in values array */
    EF241("m.maps"),
    /* JADX INFO: Fake field, exist only in values array */
    EF256("message:"),
    /* JADX INFO: Fake field, exist only in values array */
    EF271("sip:"),
    /* JADX INFO: Fake field, exist only in values array */
    EF286("skype:"),
    /* JADX INFO: Fake field, exist only in values array */
    EF297("sms:"),
    /* JADX INFO: Fake field, exist only in values array */
    EF312("gtalk:"),
    /* JADX INFO: Fake field, exist only in values array */
    EF325("spotify:"),
    /* JADX INFO: Fake field, exist only in values array */
    EF338("lastfm:");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final za3 f146735c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f146741b;

    static {
        sr.c.c(ab3VarArr);
        f146735c = new za3();
    }

    public ab3(String str) {
        super(str, i);
        this.f146741b = str;
    }

    public static ab3 valueOf(String str) {
        return (ab3) Enum.valueOf(ab3.class, str);
    }

    public static ab3[] values() {
        return (ab3[]) f146740h.clone();
    }
}
