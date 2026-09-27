package yads;

import java.util.Arrays;
import org.json.JSONObject;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v3 yads.gl3[], still in use, count: 1, list:
  (r4v3 yads.gl3[]) from 0x002f: INVOKE (r4v3 yads.gl3[]) STATIC call: sr.c.c(java.lang.Enum[]):sr.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):sr.a<E extends java.lang.Enum<E>> (m)] (LINE:48)
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
public final class gl3 implements de1 {
    f149679c("default"),
    f149680d("loading"),
    f149681e("hidden");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f149683b;

    static {
        sr.c.c(gl3VarArr);
    }

    public gl3(String str) {
        super(str, i);
        this.f149683b = str;
    }

    public static gl3 valueOf(String str) {
        return (gl3) Enum.valueOf(gl3.class, str);
    }

    public static gl3[] values() {
        return (gl3[]) f149682f.clone();
    }

    @Override // yads.de1
    public final String a() {
        String strQuote = JSONObject.quote(this.f149683b);
        kotlin.jvm.internal.u1 u1Var = kotlin.jvm.internal.u1.f102789a;
        String str = String.format("state: %s", Arrays.copyOf(new Object[]{strQuote}, 1));
        kotlin.jvm.internal.m0.o(str, "format(...)");
        return str;
    }
}
