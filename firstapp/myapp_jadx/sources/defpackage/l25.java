package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 l25[], still in use, count: 1, list:
  (r0v1 l25[]) from 0x0027: CONSTRUCTOR (r0v1 l25[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] (LINE:40) call: uag.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class l25 {
    Unknown(-1),
    Wager(1),
    RakeBack(2);

    public static final a b = new a();
    public static final /* synthetic */ uag i;
    public final int a;

    public static final class a {
        public static l25 a(int i) {
            Object next;
            uag uagVar = l25.i;
            q3.b bVarA = ocx.a(uagVar, uagVar);
            do {
                if (!bVarA.hasNext()) {
                    next = null;
                    break;
                }
                next = bVarA.next();
            } while (((l25) next).a != i);
            l25 l25Var = (l25) next;
            return l25Var == null ? l25.Unknown : l25Var;
        }
    }

    static {
        i = new uag(new l25[]{r0, r1, r2});
    }

    public l25(int i2) {
        super(str, i);
        this.a = i2;
    }

    public static l25 valueOf(String str) {
        return (l25) Enum.valueOf(l25.class, str);
    }

    public static l25[] values() {
        return (l25[]) f.clone();
    }
}
