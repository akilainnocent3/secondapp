package defpackage;

import com.sportybet.android.gp.tz.R;
import com.twilio.voice.EventKeys;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 f4x[], still in use, count: 1, list:
  (r0v1 f4x[]) from 0x003e: CONSTRUCTOR (r0v1 f4x[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] (LINE:63) call: uag.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class f4x {
    e(R.string.page_notification_center__tab_system, "SYSTEM", "notification_center_system_read", "system"),
    f(R.string.page_notification_center__tab_promotion, "PROMOTIONS", "notification_center_promotion_read", "promotion"),
    i(R.string.page_notification_center__tab_message, "MESSAGE", "notification_center_message_read", EventKeys.ERROR_MESSAGE);

    public static final /* synthetic */ uag w;
    public final int a;
    public final int b;
    public final String c;
    public final String d;

    static {
        w = new uag(f4xVarArr);
    }

    public f4x(int i2, String str, String str2, String str3) {
        super(str, i);
        this.a = i;
        this.b = i2;
        this.c = str2;
        this.d = str3;
    }

    public static f4x valueOf(String str) {
        return (f4x) Enum.valueOf(f4x.class, str);
    }

    public static f4x[] values() {
        return (f4x[]) v.clone();
    }
}
