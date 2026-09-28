package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 sj70[], still in use, count: 1, list:
  (r0v1 sj70[]) from 0x002c: CONSTRUCTOR (r0v1 sj70[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] (LINE:45) call: uag.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class sj70 {
    /* JADX INFO: Fake field, exist only in values array */
    UNSETTLED(0),
    WON(1),
    /* JADX INFO: Fake field, exist only in values array */
    LOST(2),
    VOID(3);

    public static final a b = new a();
    public static final /* synthetic */ uag f;
    public final int a;

    public static final class a {
        public static sj70 a(int i) {
            Object next;
            uag uagVar = sj70.f;
            q3.b bVarA = ocx.a(uagVar, uagVar);
            do {
                if (!bVarA.hasNext()) {
                    next = null;
                    break;
                }
                next = bVarA.next();
            } while (((sj70) next).a != i);
            sj70 sj70Var = (sj70) next;
            return sj70Var == null ? sj70.VOID : sj70Var;
        }
    }

    static {
        f = new uag(new sj70[]{r0, r1, r2, r3});
    }

    public sj70(int i) {
        super(str, i);
        this.a = i;
    }

    public static sj70 valueOf(String str) {
        return (sj70) Enum.valueOf(sj70.class, str);
    }

    public static sj70[] values() {
        return (sj70[]) e.clone();
    }
}
