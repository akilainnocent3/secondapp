package yads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v4 yads.zg2[], still in use, count: 1, list:
  (r6v4 yads.zg2[]) from 0x0045: INVOKE (r6v4 yads.zg2[]) STATIC call: sr.c.c(java.lang.Enum[]):sr.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):sr.a<E extends java.lang.Enum<E>> (m)] (LINE:70)
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
public final class zg2 {
    f158807d("TIMEOUT", "The request failed to load due to a timeout"),
    f158808e("INVALID_CONFIGURATION", "The provided configuration is invalid"),
    f158809f("EMPTY_MEDIATION_DATA", "No mediation data was received. Possibly, Client Bidding adapters are not connected"),
    f158810g("INVALID_FETCHED_DATA", "The fetched data is invalid");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f158812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f158813c;

    static {
        sr.c.c(zg2VarArr);
    }

    public zg2(String str, String str2) {
        super(str, i);
        this.f158812b = i;
        this.f158813c = str2;
    }

    public static zg2 valueOf(String str) {
        return (zg2) Enum.valueOf(zg2.class, str);
    }

    public static zg2[] values() {
        return (zg2[]) f158811h.clone();
    }

    public final int a() {
        return this.f158812b;
    }

    public final String b() {
        return this.f158813c;
    }
}
