package com.yandex.mobile.ads.common;

import oy.l;
import sr.c;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v2 com.yandex.mobile.ads.common.AdType[], still in use, count: 1, list:
  (r11v2 com.yandex.mobile.ads.common.AdType[]) from 0x004d: INVOKE (r11v2 com.yandex.mobile.ads.common.AdType[]) STATIC call: sr.c.c(java.lang.Enum[]):sr.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):sr.a<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:78)
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
/* JADX INFO: loaded from: classes8.dex */
public final class AdType {
    UNKNOWN,
    BANNER,
    INTERSTITIAL,
    REWARDED,
    NATIVE,
    APP_OPEN_AD;


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ sr.a f76810c;

    static {
        f76810c = c.c(adTypeArr);
    }

    private AdType() {
        super(str, i);
    }

    @l
    public static sr.a<AdType> getEntries() {
        return f76810c;
    }

    public static AdType valueOf(String str) {
        return (AdType) Enum.valueOf(AdType.class, str);
    }

    public static AdType[] values() {
        return (AdType[]) f76809b.clone();
    }
}
