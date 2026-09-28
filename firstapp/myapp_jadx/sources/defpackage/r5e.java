package defpackage;

import coil3.compose.internal.CBvK.lobGSRIlnSGJY;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 r5e[], still in use, count: 1, list:
  (r0v1 r5e[]) from 0x0083: CONSTRUCTOR (r0v1 r5e[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] (LINE:133) call: uag.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes2.dex */
public final class r5e {
    OPAY("opay"),
    PALM_PAY("palmpay"),
    KUDA("kuda"),
    GT("gt"),
    ZENITH(lobGSRIlnSGJY.UlW),
    ACCESS("access"),
    MONIEPOINT("moniepoint"),
    FAIRMONEY("fairmoney"),
    CORAL_PAY("coralpay"),
    QUICKTELLER("quickteller");

    public static final /* synthetic */ uag C;
    public static final a b = new a();
    public final String a;

    /* JADX INFO: loaded from: classes6.dex */
    public static final class a {
    }

    public r5e(String str) {
        super(str, i);
        this.a = str;
    }

    public static r5e valueOf(String str) {
        return (r5e) Enum.valueOf(r5e.class, str);
    }

    public static r5e[] values() {
        return (r5e[]) B.clone();
    }

    static {
        C = new uag(new r5e[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9});
    }
}
