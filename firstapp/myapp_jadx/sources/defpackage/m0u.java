package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 m0u[], still in use, count: 1, list:
  (r0v1 m0u[]) from 0x004c: CONSTRUCTOR (r0v1 m0u[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] (LINE:77) call: uag.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class m0u {
    Tier0(0),
    /* JADX INFO: Fake field, exist only in values array */
    Tier1(1),
    /* JADX INFO: Fake field, exist only in values array */
    Tier2(2),
    /* JADX INFO: Fake field, exist only in values array */
    Tier3(3),
    /* JADX INFO: Fake field, exist only in values array */
    Tier4(4),
    /* JADX INFO: Fake field, exist only in values array */
    Tier5(5),
    /* JADX INFO: Fake field, exist only in values array */
    Tier6(6),
    /* JADX INFO: Fake field, exist only in values array */
    Tier98(98);

    public static final a b = new a();
    public static final /* synthetic */ uag e;
    public final int a;

    public static final class a {
        public static m0u a(int i) {
            Object next;
            uag uagVar = m0u.e;
            q3.b bVarA = ocx.a(uagVar, uagVar);
            while (bVarA.hasNext()) {
                next = bVarA.next();
                if (((m0u) next).a == i) {
                    return (m0u) next;
                }
            }
            next = null;
            return (m0u) next;
        }
    }

    static {
        e = new uag(new m0u[]{r0, new m0u(1), new m0u(2), new m0u(3), new m0u(4), new m0u(5), new m0u(6), new m0u(98)});
    }

    public m0u(int i) {
        super(str, i);
        this.a = i;
    }

    public static m0u valueOf(String str) {
        return (m0u) Enum.valueOf(m0u.class, str);
    }

    public static m0u[] values() {
        return (m0u[]) d.clone();
    }
}
