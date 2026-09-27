package com.inmobi.media;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v4 com.inmobi.media.s8[], still in use, count: 1, list:
  (r2v4 com.inmobi.media.s8[]) from 0x0079: INVOKE (r2v4 com.inmobi.media.s8[]) STATIC call: sr.c.c(java.lang.Enum[]):sr.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):sr.a<E extends java.lang.Enum<E>> (m)] (LINE:122)
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
/* JADX INFO: renamed from: com.inmobi.media.s8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC3985s8 {
    INIT,
    LOADING,
    LOADED,
    LOAD_FAILED,
    PLAYING,
    PAUSED,
    COMPLETED,
    ERROR,
    DESTROYED;

    static {
        sr.c.c(enumC3985s8Arr);
    }

    public EnumC3985s8() {
        super(str, i);
    }

    public static EnumC3985s8 valueOf(String str) {
        return (EnumC3985s8) Enum.valueOf(EnumC3985s8.class, str);
    }

    public static EnumC3985s8[] values() {
        return (EnumC3985s8[]) f57612j.clone();
    }
}
