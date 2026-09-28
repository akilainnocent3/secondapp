package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 l91[], still in use, count: 1, list:
  (r0v1 l91[]) from 0x0070: CONSTRUCTOR (r0v1 l91[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] (LINE:113) call: uag.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class l91 {
    Ongoing(0, new ResourceUiText(R.string.component_betslip__ongoing), "ongoing"),
    Completed(1, new ResourceUiText(R.string.component_betslip__completed), "completed"),
    Failed(4, new ResourceUiText(R.string.component_betslip__failed), "failed"),
    Expired(3, new ResourceUiText(R.string.component_betslip__expired), "expired"),
    Unknown(-1, new StringUiText(""), "unknown");

    public static final a d = new a();
    public static final /* synthetic */ uag z;
    public final int a;
    public final UiText b;
    public final String c;

    public static final class a {
        public static l91 a(int i) {
            Object next;
            uag uagVar = l91.z;
            q3.b bVarA = ocx.a(uagVar, uagVar);
            do {
                if (!bVarA.hasNext()) {
                    next = null;
                    break;
                }
                next = bVarA.next();
            } while (((l91) next).a != i);
            l91 l91Var = (l91) next;
            return l91Var == null ? l91.Unknown : l91Var;
        }
    }

    static {
        z = new uag(new l91[]{r0, r1, r2, r3, r4});
    }

    public l91(int i, UiText uiText, String str) {
        super(str, i);
        this.a = i;
        this.b = uiText;
        this.c = str;
    }

    public static l91 valueOf(String str) {
        return (l91) Enum.valueOf(l91.class, str);
    }

    public static l91[] values() {
        return (l91[]) y.clone();
    }
}
