package com.inmobi.media;

import com.ironsource.C4235d4;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v3 com.inmobi.media.j8[], still in use, count: 1, list:
  (r10v3 com.inmobi.media.j8[]) from 0x004d: INVOKE (r10v3 com.inmobi.media.j8[]) STATIC call: sr.c.c(java.lang.Enum[]):sr.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):sr.a<E extends java.lang.Enum<E>> (m)] (LINE:78)
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
/* JADX INFO: renamed from: com.inmobi.media.j8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC3761j8 {
    /* JADX INFO: Fake field, exist only in values array */
    LOADING("loading"),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYING(C4235d4.i.f61413f0),
    /* JADX INFO: Fake field, exist only in values array */
    PAUSED(C4235d4.i.f61411e0),
    /* JADX INFO: Fake field, exist only in values array */
    STOPPED(C4235d4.i.f61417h0),
    /* JADX INFO: Fake field, exist only in values array */
    FAILED(C4235d4.i.f61440t),
    /* JADX INFO: Fake field, exist only in values array */
    READY(C4235d4.i.f61438s);

    static {
        sr.c.c(enumC3761j8Arr);
    }

    public EnumC3761j8(String str) {
        super(str, i);
    }

    public static EnumC3761j8 valueOf(String str) {
        return (EnumC3761j8) Enum.valueOf(EnumC3761j8.class, str);
    }

    public static EnumC3761j8[] values() {
        return (EnumC3761j8[]) f56721a.clone();
    }
}
