package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 cfd[], still in use, count: 1, list:
  (r0v1 cfd[]) from 0x0030: CONSTRUCTOR (r0v1 cfd[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] (LINE:49) call: uag.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class cfd {
    /* JADX INFO: Fake field, exist only in values array */
    CENTER_TAB_LINK("new_center_tab_link"),
    /* JADX INFO: Fake field, exist only in values array */
    CENTER_TAB_IMAGE("new_center_tab_image"),
    /* JADX INFO: Fake field, exist only in values array */
    CENTER_TAB_TEXT("new_center_tab_text"),
    /* JADX INFO: Fake field, exist only in values array */
    FIRST_TIME_LAUNCH_KEY("isFirst");

    public static final /* synthetic */ uag c;
    public final String a;

    static {
        c = new uag(cfdVarArr);
    }

    public cfd(String str) {
        super(str, i);
        this.a = str;
    }

    public static cfd valueOf(String str) {
        return (cfd) Enum.valueOf(cfd.class, str);
    }

    public static cfd[] values() {
        return (cfd[]) b.clone();
    }
}
