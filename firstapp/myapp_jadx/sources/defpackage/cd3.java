package defpackage;

import androidx.transition.nfj.CaBJCMnsV;
import com.sportybet.plugin.realsports.data.sim.SimulateBetConsts;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 cd3[], still in use, count: 1, list:
  (r0v1 cd3[]) from 0x003f: CONSTRUCTOR (r0v1 cd3[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] (LINE:65) call: uag.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class cd3 {
    SINGLE(SimulateBetConsts.BetslipType.SINGLE),
    /* JADX INFO: Fake field, exist only in values array */
    MULTIPLE(SimulateBetConsts.BetslipType.MULTIPLE),
    /* JADX INFO: Fake field, exist only in values array */
    SYSTEM(CaBJCMnsV.ZDcMlq),
    /* JADX INFO: Fake field, exist only in values array */
    FLEXI(SimulateBetConsts.BetslipType.FLEX),
    ONE_CUT(SimulateBetConsts.BetslipType.CUTBET);

    public static final a b = new a();
    public static final /* synthetic */ uag f;
    public final String a;

    /* JADX INFO: loaded from: classes5.dex */
    public static final class a {
        public static cd3 a(String str) {
            Object next;
            str.getClass();
            uag uagVar = cd3.f;
            q3.b bVarA = ocx.a(uagVar, uagVar);
            while (bVarA.hasNext()) {
                next = bVarA.next();
                if (((cd3) next).a.equalsIgnoreCase(str)) {
                    return (cd3) next;
                }
            }
            next = null;
            return (cd3) next;
        }
    }

    public cd3(String str) {
        super(str, i);
        this.a = str;
    }

    public static cd3 valueOf(String str) {
        return (cd3) Enum.valueOf(cd3.class, str);
    }

    public static cd3[] values() {
        return (cd3[]) e.clone();
    }

    static {
        f = new uag(new cd3[]{r0, r1, r2, r3, r4});
    }
}
