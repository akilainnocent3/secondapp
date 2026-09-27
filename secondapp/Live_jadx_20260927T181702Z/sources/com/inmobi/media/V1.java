package com.inmobi.media;

import android.util.SparseArray;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v2 com.inmobi.media.V1[], still in use, count: 1, list:
  (r7v2 com.inmobi.media.V1[]) from 0x0031: INVOKE (r7v2 com.inmobi.media.V1[]) STATIC call: sr.c.c(java.lang.Enum[]):sr.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):sr.a<E extends java.lang.Enum<E>> (m)] (LINE:50)
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
public final class V1 {
    f55648d("UNKNOWN"),
    f55649e("PLAYING"),
    /* JADX INFO: Fake field, exist only in values array */
    EF25("PAUSED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF33("COMPLETED");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final U1 f55646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final SparseArray f55647c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f55651a;

    static {
        sr.c.c(new V1[]{r0, r1, new V1("PAUSED"), new V1("COMPLETED")});
        f55646b = new U1();
        f55647c = new SparseArray();
        for (V1 v10 : values()) {
            f55647c.put(v10.f55651a, v10);
        }
    }

    public V1(String str) {
        super(str, i);
        this.f55651a = i;
    }

    public static V1 valueOf(String str) {
        return (V1) Enum.valueOf(V1.class, str);
    }

    public static V1[] values() {
        return (V1[]) f55650f.clone();
    }
}
