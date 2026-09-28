package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 jrn[], still in use, count: 1, list:
  (r0v1 jrn[]) from 0x0020: CONSTRUCTOR (r0v1 jrn[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] (LINE:33) call: uag.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes5.dex */
public final class jrn {
    ONE_X_TWO_ONE_UP("121up"),
    ONE_X_TWO_TWO_UP("122up");

    public static final a b = new a();
    public static final /* synthetic */ uag f;
    public final String a;

    public static final class a {
        public static jrn a(String str) {
            Object next;
            uag uagVar = jrn.f;
            q3.b bVarA = ocx.a(uagVar, uagVar);
            while (bVarA.hasNext()) {
                next = bVarA.next();
                if (((jrn) next).a.equals(str)) {
                    return (jrn) next;
                }
            }
            next = null;
            return (jrn) next;
        }
    }

    static {
        f = new uag(new jrn[]{r0, r1});
    }

    public jrn(String str) {
        super(str, i);
        this.a = str;
    }

    public static jrn valueOf(String str) {
        return (jrn) Enum.valueOf(jrn.class, str);
    }

    public static jrn[] values() {
        return (jrn[]) e.clone();
    }
}
