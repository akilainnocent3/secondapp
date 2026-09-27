package yads;

import com.ironsource.Y1;
import java.util.LinkedHashMap;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v3 yads.vn3[], still in use, count: 1, list:
  (r6v3 yads.vn3[]) from 0x0037: INVOKE (r0v1 sr.a) = (r6v3 yads.vn3[]) STATIC call: sr.c.c(java.lang.Enum[]):sr.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):sr.a<E extends java.lang.Enum<E>> (m)] (LINE:56)
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
public final class vn3 {
    f157024e("default"),
    /* JADX INFO: Fake field, exist only in values array */
    EF19("cache_else_network"),
    /* JADX INFO: Fake field, exist only in values array */
    EF29("cache_only"),
    /* JADX INFO: Fake field, exist only in values array */
    EF39(Y1.f60332e);


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final un3 f157022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f157023d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f157026b;

    static {
        sr.a aVarC = sr.c.c(vn3VarArr);
        f157022c = new un3();
        LinkedHashMap linkedHashMap = new LinkedHashMap(ms.u.u(fr.m1.j(fr.i0.d0(aVarC, 10)), 16));
        for (Object obj : aVarC) {
            linkedHashMap.put(((vn3) obj).f157026b, obj);
        }
        f157023d = linkedHashMap;
    }

    public vn3(String str) {
        super(str, i);
        this.f157026b = str;
    }

    public static vn3 valueOf(String str) {
        return (vn3) Enum.valueOf(vn3.class, str);
    }

    public static vn3[] values() {
        return (vn3[]) f157025f.clone();
    }
}
