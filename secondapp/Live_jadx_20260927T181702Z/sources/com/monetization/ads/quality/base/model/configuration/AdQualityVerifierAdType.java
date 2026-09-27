package com.monetization.ads.quality.base.model.configuration;

import sr.a;
import sr.c;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v2 com.monetization.ads.quality.base.model.configuration.AdQualityVerifierAdType[], still in use, count: 1, list:
  (r7v2 com.monetization.ads.quality.base.model.configuration.AdQualityVerifierAdType[]) from 0x0035: INVOKE (r7v2 com.monetization.ads.quality.base.model.configuration.AdQualityVerifierAdType[]) STATIC call: sr.c.c(java.lang.Enum[]):sr.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):sr.a<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:54)
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
public final class AdQualityVerifierAdType {
    BANNER,
    INTERSTITIAL,
    REWARDED,
    NATIVE;

    private static final /* synthetic */ a $ENTRIES;

    static {
        $ENTRIES = c.c(adQualityVerifierAdTypeArr);
    }

    private AdQualityVerifierAdType() {
        super(str, i);
    }

    public static AdQualityVerifierAdType valueOf(String str) {
        return (AdQualityVerifierAdType) Enum.valueOf(AdQualityVerifierAdType.class, str);
    }

    public static AdQualityVerifierAdType[] values() {
        return (AdQualityVerifierAdType[]) $VALUES.clone();
    }
}
