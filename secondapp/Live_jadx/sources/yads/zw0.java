package yads;

import com.yandex.mobile.ads.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v2 yads.zw0[], still in use, count: 1, list:
  (r1v2 yads.zw0[]) from 0x0015: INVOKE (r1v2 yads.zw0[]) STATIC call: sr.c.c(java.lang.Enum[]):sr.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):sr.a<E extends java.lang.Enum<E>> (m)] (LINE:22)
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
public final class zw0 {
    /* JADX INFO: Fake field, exist only in values array */
    EF10(R.font.monetization_ads_internal_font_medium, R.font.monetization_ads_internal_font_bold);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f159070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f159071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f159072d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f159073e;

    static {
        sr.c.c(zw0VarArr);
    }

    public zw0(int i10, int i11) {
        super("YSText", 0);
        this.f159070b = i;
        this.f159071c = i;
        this.f159072d = i10;
        this.f159073e = i11;
    }

    public static zw0 valueOf(String str) {
        return (zw0) Enum.valueOf(zw0.class, str);
    }

    public static zw0[] values() {
        return (zw0[]) f159069f.clone();
    }
}
