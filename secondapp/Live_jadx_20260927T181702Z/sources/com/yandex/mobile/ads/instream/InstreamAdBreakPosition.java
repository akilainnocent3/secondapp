package com.yandex.mobile.ads.instream;

import oy.l;
import sr.c;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class InstreamAdBreakPosition {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Type f76873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f76874b;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v2 com.yandex.mobile.ads.instream.InstreamAdBreakPosition$Type[], still in use, count: 1, list:
      (r5v2 com.yandex.mobile.ads.instream.InstreamAdBreakPosition$Type[]) from 0x0029: INVOKE (r5v2 com.yandex.mobile.ads.instream.InstreamAdBreakPosition$Type[]) STATIC call: sr.c.c(java.lang.Enum[]):sr.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):sr.a<E extends java.lang.Enum<E>> (m)] (LINE:42)
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
    public static final class Type {
        PERCENTS,
        MILLISECONDS,
        POSITION;

        static {
            c.c(typeArr);
        }

        private Type() {
            super(str, i);
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f76875b.clone();
        }
    }

    public InstreamAdBreakPosition(@l Type type, long j10) {
        this.f76873a = type;
        this.f76874b = j10;
    }

    @l
    public final Type getPositionType() {
        return this.f76873a;
    }

    public final long getValue() {
        return this.f76874b;
    }
}
