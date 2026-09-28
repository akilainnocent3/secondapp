package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sportybet.android.gp.tz.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 bcr[], still in use, count: 1, list:
  (r0v1 bcr[]) from 0x008f: CONSTRUCTOR (r0v1 bcr[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] (LINE:144) call: uag.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class bcr {
    /* JADX INFO: Fake field, exist only in values array */
    COPY_LINK(null, new ResourceUiText(R.string.common_functions__copy_link), R.drawable.icon_share_link, cjr.d0.a),
    /* JADX INFO: Fake field, exist only in values array */
    X(aga0.d, new ResourceUiText(R.string.common_functions__x), R.drawable.ic_x, cjr.i0.a),
    /* JADX INFO: Fake field, exist only in values array */
    TELEGRAM(aga0.b, new ResourceUiText(R.string.common_functions__telegram), R.drawable.ic_telegram, cjr.g0.a),
    /* JADX INFO: Fake field, exist only in values array */
    WHATSAPP(aga0.c, new ResourceUiText(R.string.common_functions__whatsapp), R.drawable.ic_whatsapp, cjr.h0.a),
    /* JADX INFO: Fake field, exist only in values array */
    FACEBOOK(aga0.a, new ResourceUiText(R.string.common_functions__facebook), R.drawable.ic_facebook, cjr.e0.a),
    /* JADX INFO: Fake field, exist only in values array */
    MORE(null, new ResourceUiText(R.string.common_functions__more), R.drawable.ic_social_more, null);

    public static final /* synthetic */ uag f;
    public final aga0 a;
    public final ResourceUiText b;
    public final int c;
    public final cjr d;

    static {
        f = new uag(bcrVarArr);
    }

    public bcr(aga0 aga0Var, ResourceUiText resourceUiText, int i, cjr cjrVar) {
        super(str, i);
        this.a = aga0Var;
        this.b = resourceUiText;
        this.c = i;
        this.d = cjrVar;
    }

    public static bcr valueOf(String str) {
        return (bcr) Enum.valueOf(bcr.class, str);
    }

    public static bcr[] values() {
        return (bcr[]) e.clone();
    }
}
