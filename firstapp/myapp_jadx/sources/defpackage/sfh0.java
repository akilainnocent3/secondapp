package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 sfh0[], still in use, count: 1, list:
  (r0v1 sfh0[]) from 0x001c: CONSTRUCTOR (r0v1 sfh0[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] (LINE:29) call: uag.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class sfh0 {
    /* JADX INFO: Fake field, exist only in values array */
    NEAR("near"),
    /* JADX INFO: Fake field, exist only in values array */
    FAR("far");

    public static final a b = new a();
    public static final /* synthetic */ uag d = new uag(new sfh0[]{new sfh0("near"), new sfh0("far")});
    public final String a;

    public static final class a {
        public static sfh0 a(String str) {
            Object next;
            uag uagVar = sfh0.d;
            q3.b bVarA = ocx.a(uagVar, uagVar);
            while (bVarA.hasNext()) {
                next = bVarA.next();
                if (((sfh0) next).a.equalsIgnoreCase(str)) {
                    return (sfh0) next;
                }
            }
            next = null;
            return (sfh0) next;
        }
    }

    static {
    }

    public sfh0(String str) {
        super(str, i);
        this.a = str;
    }

    public static sfh0 valueOf(String str) {
        return (sfh0) Enum.valueOf(sfh0.class, str);
    }

    public static sfh0[] values() {
        return (sfh0[]) c.clone();
    }
}
