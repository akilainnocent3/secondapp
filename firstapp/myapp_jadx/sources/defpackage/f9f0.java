package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v11 f9f0[], still in use, count: 1, list:
  (r0v11 f9f0[]) from 0x00e9: CONSTRUCTOR (r0v11 f9f0[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] (LINE:234) call: uag.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class f9f0 {
    /* JADX INFO: Fake field, exist only in values array */
    FOOTBALL("sr:sport:1"),
    /* JADX INFO: Fake field, exist only in values array */
    BASKETBALL("sr:sport:2"),
    /* JADX INFO: Fake field, exist only in values array */
    RUGBY("sr:sport:12"),
    /* JADX INFO: Fake field, exist only in values array */
    HANDBALL("sr:sport:6"),
    /* JADX INFO: Fake field, exist only in values array */
    BEACH_VOLLEY("sr:sport:34"),
    /* JADX INFO: Fake field, exist only in values array */
    CS("sr:sport:109"),
    /* JADX INFO: Fake field, exist only in values array */
    DOTA2("sr:sport:111"),
    /* JADX INFO: Fake field, exist only in values array */
    ICE_HOCKEY("sr:sport:4"),
    /* JADX INFO: Fake field, exist only in values array */
    LOL("sr:sport:110"),
    /* JADX INFO: Fake field, exist only in values array */
    VOLLEYBALL("sr:sport:23"),
    /* JADX INFO: Fake field, exist only in values array */
    VFOOTBALL("sr:sport:202120001"),
    /* JADX INFO: Fake field, exist only in values array */
    BASEBALL("sr:sport:3"),
    /* JADX INFO: Fake field, exist only in values array */
    E_BASKETBALL("sr:sport:153"),
    /* JADX INFO: Fake field, exist only in values array */
    BASKETBALL_3X3("sr:sport:2"),
    /* JADX INFO: Fake field, exist only in values array */
    E_FOOTBALL("sr:sport:137"),
    /* JADX INFO: Fake field, exist only in values array */
    E_ICE_HOCKEY("sr:sport:195"),
    /* JADX INFO: Fake field, exist only in values array */
    FUTSAL("sr:sport:29"),
    /* JADX INFO: Fake field, exist only in values array */
    AMERICAN_FOOTBALL("sr:sport:16"),
    /* JADX INFO: Fake field, exist only in values array */
    CRICKET("sr:sport:21");

    public static final a b = new a();
    public static final /* synthetic */ uag d = new uag(new f9f0[]{new f9f0("sr:sport:1"), new f9f0("sr:sport:2"), new f9f0("sr:sport:12"), new f9f0("sr:sport:6"), new f9f0("sr:sport:34"), new f9f0("sr:sport:109"), new f9f0("sr:sport:111"), new f9f0("sr:sport:4"), new f9f0("sr:sport:110"), new f9f0("sr:sport:23"), new f9f0("sr:sport:202120001"), new f9f0("sr:sport:3"), new f9f0("sr:sport:153"), new f9f0("sr:sport:2"), new f9f0("sr:sport:137"), new f9f0("sr:sport:195"), new f9f0("sr:sport:29"), new f9f0("sr:sport:16"), new f9f0("sr:sport:21")});
    public final String a;

    public static final class a {
    }

    static {
    }

    public f9f0(String str) {
        super(str, i);
        this.a = str;
    }

    public static f9f0 valueOf(String str) {
        return (f9f0) Enum.valueOf(f9f0.class, str);
    }

    public static f9f0[] values() {
        return (f9f0[]) c.clone();
    }
}
