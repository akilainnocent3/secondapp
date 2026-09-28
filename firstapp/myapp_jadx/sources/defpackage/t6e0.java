package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 t6e0[], still in use, count: 1, list:
  (r0v1 t6e0[]) from 0x003a: CONSTRUCTOR (r0v1 t6e0[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] (LINE:59) call: uag.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes6.dex */
public final class t6e0 {
    Level0(0),
    /* JADX INFO: Fake field, exist only in values array */
    Level1(1),
    /* JADX INFO: Fake field, exist only in values array */
    Level2(2),
    /* JADX INFO: Fake field, exist only in values array */
    Level3(3),
    /* JADX INFO: Fake field, exist only in values array */
    Level4(4),
    /* JADX INFO: Fake field, exist only in values array */
    Level5(5);

    public static final a b = new a();
    public static final /* synthetic */ uag e;
    public final int a;

    public static final class a {
        public static t6e0 a(int i) {
            Object next;
            uag uagVar = t6e0.e;
            q3.b bVarA = ocx.a(uagVar, uagVar);
            do {
                if (!bVarA.hasNext()) {
                    next = null;
                    break;
                }
                next = bVarA.next();
            } while (((t6e0) next).a != i);
            t6e0 t6e0Var = (t6e0) next;
            return t6e0Var == null ? t6e0.Level0 : t6e0Var;
        }
    }

    static {
        e = new uag(new t6e0[]{r0, new t6e0(1), new t6e0(2), new t6e0(3), new t6e0(4), new t6e0(5)});
    }

    public t6e0(int i) {
        super(str, i);
        this.a = i;
    }

    public static t6e0 valueOf(String str) {
        return (t6e0) Enum.valueOf(t6e0.class, str);
    }

    public static t6e0[] values() {
        return (t6e0[]) d.clone();
    }
}
