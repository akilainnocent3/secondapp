package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 l44[], still in use, count: 1, list:
  (r0v1 l44[]) from 0x0030: CONSTRUCTOR (r0v1 l44[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] (LINE:49) call: uag.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes7.dex */
public final class l44 {
    /* JADX INFO: Fake field, exist only in values array */
    UpgradeNotificationInit("LOYALTY_BETTING_STREAK_UPGRADE_NOTIFICATION_INIT"),
    /* JADX INFO: Fake field, exist only in values array */
    UpgradeNotification("LOYALTY_BETTING_STREAK_UPGRADE_NOTIFICATION"),
    /* JADX INFO: Fake field, exist only in values array */
    UpgradeNotification5070("LOYALTY_BETTING_STREAK_UPGRADE_NOTIFICATION_50_70"),
    /* JADX INFO: Fake field, exist only in values array */
    UpgradeNotification90Plus("LOYALTY_BETTING_STREAK_UPGRADE_NOTIFICATION_90_PLUS");

    public static final /* synthetic */ uag c;
    public final String a;

    static {
        c = new uag(l44VarArr);
    }

    public l44(String str) {
        super(str, i);
        this.a = str;
    }

    public static l44 valueOf(String str) {
        return (l44) Enum.valueOf(l44.class, str);
    }

    public static l44[] values() {
        return (l44[]) b.clone();
    }
}
