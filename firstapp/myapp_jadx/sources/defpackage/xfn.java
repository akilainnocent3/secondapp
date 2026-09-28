package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 xfn[], still in use, count: 1, list:
  (r0v1 xfn[]) from 0x004e: CONSTRUCTOR (r0v1 xfn[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] (LINE:79) call: uag.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes4.dex */
public final class xfn {
    /* JADX INFO: Fake field, exist only in values array */
    TENNIS("sr:sport:5"),
    /* JADX INFO: Fake field, exist only in values array */
    BOXING("sr:sport:10"),
    /* JADX INFO: Fake field, exist only in values array */
    TABLE_TENNIS("sr:sport:20"),
    /* JADX INFO: Fake field, exist only in values array */
    SNOOKER("sr:sport:19"),
    /* JADX INFO: Fake field, exist only in values array */
    DARTS("sr:sport:22"),
    /* JADX INFO: Fake field, exist only in values array */
    BADMINTON("sr:sport:31"),
    /* JADX INFO: Fake field, exist only in values array */
    MMA("sr:sport:117");

    public static final a b = new a();
    public static final /* synthetic */ uag d = new uag(new xfn[]{new xfn("sr:sport:5"), new xfn("sr:sport:10"), new xfn("sr:sport:20"), new xfn("sr:sport:19"), new xfn("sr:sport:22"), new xfn("sr:sport:31"), new xfn("sr:sport:117")});
    public final String a;

    public static final class a {
    }

    static {
    }

    public xfn(String str) {
        super(str, i);
        this.a = str;
    }

    public static xfn valueOf(String str) {
        return (xfn) Enum.valueOf(xfn.class, str);
    }

    public static xfn[] values() {
        return (xfn[]) c.clone();
    }
}
