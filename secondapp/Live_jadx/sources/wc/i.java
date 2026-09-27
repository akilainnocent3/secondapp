package wc;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v2 wc.i[], still in use, count: 1, list:
  (r11v2 wc.i[]) from 0x004e: INVOKE (r11v2 wc.i[]) STATIC call: sr.c.c(java.lang.Enum[]):sr.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):sr.a<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:79)
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
/* JADX INFO: loaded from: classes3.dex */
public final class i {
    Banner(0),
    Interstitial(1),
    Rewarded(2),
    AppOpen(3),
    Native(4),
    None(7);


    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ sr.a f142756j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f142757b;

    static {
        f142756j = sr.c.c(iVarArr);
    }

    public i(int i10) {
        super(str, i);
        this.f142757b = i10;
    }

    @oy.l
    public static sr.a<i> d() {
        return f142756j;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f142755i.clone();
    }

    public final int g() {
        return this.f142757b;
    }

    public final int h() {
        int i10 = this.f142757b;
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 2;
        }
        if (i10 == 2) {
            return 4;
        }
        if (i10 != 3) {
            return i10 != 4 ? 0 : 8;
        }
        return 64;
    }
}
