package com.yandex.mobile.ads.common;

import oy.l;
import sr.c;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v3 com.yandex.mobile.ads.common.AdTheme[], still in use, count: 1, list:
  (r2v3 com.yandex.mobile.ads.common.AdTheme[]) from 0x0021: INVOKE (r2v3 com.yandex.mobile.ads.common.AdTheme[]) STATIC call: sr.c.c(java.lang.Enum[]):sr.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):sr.a<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:34)
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
public final class AdTheme {
    LIGHT("light"),
    DARK("dark");


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ sr.a f76807d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f76808b;

    static {
        f76807d = c.c(adThemeArr);
    }

    private AdTheme(String str) {
        super(str, i);
        this.f76808b = str;
    }

    @l
    public static sr.a<AdTheme> getEntries() {
        return f76807d;
    }

    public static AdTheme valueOf(String str) {
        return (AdTheme) Enum.valueOf(AdTheme.class, str);
    }

    public static AdTheme[] values() {
        return (AdTheme[]) f76806c.clone();
    }

    @l
    public final String getValue() {
        return this.f76808b;
    }
}
