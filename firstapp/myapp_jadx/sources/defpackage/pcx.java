package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 pcx[], still in use, count: 1, list:
  (r0v1 pcx[]) from 0x0026: CONSTRUCTOR (r0v1 pcx[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] (LINE:39) call: uag.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class pcx {
    /* JADX INFO: Fake field, exist only in values array */
    KYC_BANNER("kyc_banner"),
    /* JADX INFO: Fake field, exist only in values array */
    PUSH("push"),
    /* JADX INFO: Fake field, exist only in values array */
    ANNOYING("annoying");

    public static final a b = new a();
    public static final /* synthetic */ uag d = new uag(new pcx[]{new pcx("kyc_banner"), new pcx("push"), new pcx("annoying")});
    public final String a;

    public static final class a {
        public static pcx a(String str) {
            Object next;
            uag uagVar = pcx.d;
            q3.b bVarA = ocx.a(uagVar, uagVar);
            while (bVarA.hasNext()) {
                next = bVarA.next();
                if (((pcx) next).a.equals(str)) {
                    return (pcx) next;
                }
            }
            next = null;
            return (pcx) next;
        }
    }

    static {
    }

    public pcx(String str) {
        super(str, i);
        this.a = str;
    }

    public static pcx valueOf(String str) {
        return (pcx) Enum.valueOf(pcx.class, str);
    }

    public static pcx[] values() {
        return (pcx[]) c.clone();
    }
}
