package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 v690[], still in use, count: 1, list:
  (r0v1 v690[]) from 0x0058: CONSTRUCTOR (r0v1 v690[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] (LINE:89) call: uag.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class v690 {
    /* JADX INFO: Fake field, exist only in values array */
    Sports("sports", R.string.component_sporty_banner__group_sports),
    /* JADX INFO: Fake field, exist only in values array */
    Games("games", R.string.component_sporty_banner__group_games),
    /* JADX INFO: Fake field, exist only in values array */
    Virtual("virtuals", R.string.component_sporty_banner__group_virtuals),
    /* JADX INFO: Fake field, exist only in values array */
    Media(AnalyticsParam.SOCIAL_ACTION_TYPE_MEDIA, R.string.component_sporty_banner__group_media),
    /* JADX INFO: Fake field, exist only in values array */
    Numbers("numbers", R.string.component_sporty_banner__group_numbers),
    Others("others", R.string.component_sporty_banner__group_others);

    public static final /* synthetic */ uag e;
    public final String a;
    public final int b;

    static {
        e = new uag(v690VarArr);
    }

    public v690(String str, int i) {
        super(str, i);
        this.a = str;
        this.b = i;
    }

    public static v690 valueOf(String str) {
        return (v690) Enum.valueOf(v690.class, str);
    }

    public static v690[] values() {
        return (v690[]) d.clone();
    }
}
