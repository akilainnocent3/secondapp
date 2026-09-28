package defpackage;

import com.twilio.voice.EventGroupType;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 q7h[], still in use, count: 1, list:
  (r0v1 q7h[]) from 0x005c: CONSTRUCTOR (r0v1 q7h[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] (LINE:93) call: uag.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class q7h {
    REGISTRATION(EventGroupType.REGISTRATION_EVENT_GROUP),
    SEVEN_DAYS_LOGIN("7-days-login"),
    BANK_ACCOUNT("bank-account"),
    PASSWORD_RESET("password-reset"),
    WITHDRAW("withdraw"),
    SELF_EXCLUSION("self-exclusion"),
    UNKNOWN("unknown");

    public static final a b = new a();
    public static final /* synthetic */ uag z;
    public final String a;

    public static final class a {
        public static q7h a(String str) {
            Object next;
            uag uagVar = q7h.z;
            q3.b bVarA = ocx.a(uagVar, uagVar);
            do {
                if (!bVarA.hasNext()) {
                    next = null;
                    break;
                }
                next = bVarA.next();
            } while (!((q7h) next).a.equals(str));
            q7h q7hVar = (q7h) next;
            return q7hVar == null ? q7h.UNKNOWN : q7hVar;
        }
    }

    static {
        z = new uag(new q7h[]{r0, r1, r2, r3, r4, r5, r6});
    }

    public q7h(String str) {
        super(str, i);
        this.a = str;
    }

    public static q7h valueOf(String str) {
        return (q7h) Enum.valueOf(q7h.class, str);
    }

    public static q7h[] values() {
        return (q7h[]) y.clone();
    }
}
