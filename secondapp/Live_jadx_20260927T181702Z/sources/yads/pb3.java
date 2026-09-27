package yads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r12v3 yads.pb3[], still in use, count: 1, list:
  (r12v3 yads.pb3[]) from 0x0067: INVOKE (r12v3 yads.pb3[]) STATIC call: sr.c.c(java.lang.Enum[]):sr.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):sr.a<E extends java.lang.Enum<E>> (m)] (LINE:104)
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
public final class pb3 {
    f153854c("no_ad_view"),
    f153855d("no_visible_ads"),
    f153856e("not_visible_for_percent"),
    f153857f("required_asset_can_not_be_visible"),
    f153858g("superview_null"),
    f153859h("superview_hidden"),
    f153860i("visible_area_too_small");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f153862b;

    static {
        sr.c.c(pb3VarArr);
    }

    public pb3(String str) {
        super(str, i);
        this.f153862b = str;
    }

    public static pb3 valueOf(String str) {
        return (pb3) Enum.valueOf(pb3.class, str);
    }

    public static pb3[] values() {
        return (pb3[]) f153861j.clone();
    }
}
