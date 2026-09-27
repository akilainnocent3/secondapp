package yads;

import com.unity3d.ads.core.data.model.exception.GatewayException;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v3 yads.q61[], still in use, count: 1, list:
  (r6v3 yads.q61[]) from 0x003d: INVOKE (r6v3 yads.q61[]) STATIC call: sr.c.c(java.lang.Enum[]):sr.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):sr.a<E extends java.lang.Enum<E>> (m)] (LINE:62)
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
public final class q61 {
    f154285c(GatewayException.GATEWAY_RESPONSE_DEPTH_INITIALIZATION),
    f154286d("ad"),
    f154287e("instream"),
    f154288f("bidder_token");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f154290b;

    static {
        sr.c.c(q61VarArr);
    }

    public q61(String str) {
        super(str, i);
        this.f154290b = str;
    }

    public static q61 valueOf(String str) {
        return (q61) Enum.valueOf(q61.class, str);
    }

    public static q61[] values() {
        return (q61[]) f154289g.clone();
    }
}
