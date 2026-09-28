package defpackage;

import com.sportybet.android.gp.tz.R;
import java.util.Locale;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 z320[], still in use, count: 1, list:
  (r0v1 z320[]) from 0x0043: CONSTRUCTOR (r0v1 z320[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] (LINE:68) call: uag.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class z320 {
    NEARLY_FULL(Integer.valueOf(R.color.text_warning), Integer.valueOf(R.string.component_assign_custom_code__nearly_full)),
    HIGH_DEMAND(Integer.valueOf(R.color.text_danger), Integer.valueOf(R.string.component_assign_custom_code__high_demand)),
    SAFE(null, null);

    public static final a c = new a();
    public static final /* synthetic */ uag v;
    public final Integer a;
    public final Integer b;

    /* JADX INFO: loaded from: classes6.dex */
    public static final class a {
        public static z320 a(String str) {
            String upperCase;
            if (str != null) {
                upperCase = str.toUpperCase(Locale.ROOT);
                upperCase.getClass();
            } else {
                upperCase = null;
            }
            if (upperCase != null) {
                int iHashCode = upperCase.hashCode();
                if (iHashCode != -117650552) {
                    if (iHashCode != 2537357) {
                        if (iHashCode == 1921989849 && upperCase.equals("NEARLY_FULL")) {
                            return z320.NEARLY_FULL;
                        }
                    } else if (upperCase.equals("SAFE")) {
                        return z320.SAFE;
                    }
                } else if (upperCase.equals("HIGH_DEMAND")) {
                    return z320.HIGH_DEMAND;
                }
            }
            return z320.SAFE;
        }
    }

    static {
        v = new uag(new z320[]{r0, r1, r2});
    }

    public z320(Integer num, Integer num2) {
        super(str, i);
        this.a = num;
        this.b = num2;
    }

    public static z320 valueOf(String str) {
        return (z320) Enum.valueOf(z320.class, str);
    }

    public static z320[] values() {
        return (z320[]) i.clone();
    }
}
