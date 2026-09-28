package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sportybet.android.gp.tz.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 sk3[], still in use, count: 1, list:
  (r0v1 sk3[]) from 0x003c: CONSTRUCTOR (r0v1 sk3[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] (LINE:61) call: uag.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes5.dex */
public final class sk3 {
    LITE(new ResourceUiText(R.string.page_instant_virtual__animation_controller_label_lite), new ResourceUiText(R.string.page_instant_virtual__animation_controller_desc_lite)),
    PLAYER(new ResourceUiText(R.string.page_instant_virtual__animation_controller_label_player), new ResourceUiText(R.string.page_instant_virtual__animation_controller_desc_player));

    public static final a c;
    public static final sk3 d;
    public static final /* synthetic */ uag v;
    public final ResourceUiText a;
    public final ResourceUiText b;

    public static final class a {
    }

    static {
        sk3 sk3Var = PLAYER;
        v = new uag(sk3VarArr);
        c = new a();
        d = sk3Var;
    }

    public sk3(ResourceUiText resourceUiText, ResourceUiText resourceUiText2) {
        super(str, i);
        this.a = resourceUiText;
        this.b = resourceUiText2;
    }

    public static sk3 valueOf(String str) {
        return (sk3) Enum.valueOf(sk3.class, str);
    }

    public static sk3[] values() {
        return (sk3[]) i.clone();
    }
}
