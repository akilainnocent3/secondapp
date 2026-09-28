package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 pxq[], still in use, count: 1, list:
  (r0v1 pxq[]) from 0x0046: CONSTRUCTOR (r0v1 pxq[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] (LINE:71) call: uag.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class pxq {
    SINGLE(1, new ResourceUiText(R.string.component_betslip__single)),
    /* JADX INFO: Fake field, exist only in values array */
    MULTIPLE(2, new ResourceUiText(R.string.bet_history__multiple)),
    /* JADX INFO: Fake field, exist only in values array */
    SYSTEM(3, new ResourceUiText(R.string.component_betslip__system)),
    UNKNOWN(0, vch0.a);

    public static final a c = new a();
    public static final /* synthetic */ uag i;
    public final int a;
    public final UiText b;

    public static final class a {
        public static pxq a(Integer num) {
            Object next;
            uag uagVar = pxq.i;
            q3.b bVarA = ocx.a(uagVar, uagVar);
            while (true) {
                if (!bVarA.hasNext()) {
                    next = null;
                    break;
                }
                next = bVarA.next();
                int i = ((pxq) next).a;
                if (num != null && i == num.intValue()) {
                    break;
                }
            }
            pxq pxqVar = (pxq) next;
            return pxqVar == null ? pxq.UNKNOWN : pxqVar;
        }
    }

    static {
        i = new uag(new pxq[]{r0, r1, r2, r4});
    }

    public pxq(int i2, UiText uiText) {
        super(str, i);
        this.a = i2;
        this.b = uiText;
    }

    public static pxq valueOf(String str) {
        return (pxq) Enum.valueOf(pxq.class, str);
    }

    public static pxq[] values() {
        return (pxq[]) f.clone();
    }
}
