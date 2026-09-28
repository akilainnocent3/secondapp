package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 rcs[], still in use, count: 1, list:
  (r0v1 rcs[]) from 0x0038: CONSTRUCTOR (r0v1 rcs[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] (LINE:57) call: uag.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes.dex */
public final class rcs {
    BETTING("1"),
    DEPOSIT("2"),
    LOSS("3"),
    TIME("4");

    public static final a b = new a();
    public static final /* synthetic */ uag v;
    public final String a;

    public static final class a {
        public static rcs a(String str) {
            rcs rcsVar = rcs.BETTING;
            if (Intrinsics.g(str, "1")) {
                return rcsVar;
            }
            rcs rcsVar2 = rcs.DEPOSIT;
            if (Intrinsics.g(str, "2")) {
                return rcsVar2;
            }
            rcs rcsVar3 = rcs.LOSS;
            if (Intrinsics.g(str, "3")) {
                return rcsVar3;
            }
            rcs rcsVar4 = rcs.TIME;
            if (Intrinsics.g(str, "4")) {
                return rcsVar4;
            }
            return null;
        }
    }

    static {
        v = new uag(new rcs[]{r0, r1, r2, r3});
    }

    public rcs(String str) {
        super(str, i);
        this.a = str;
    }

    public static rcs valueOf(String str) {
        return (rcs) Enum.valueOf(rcs.class, str);
    }

    public static rcs[] values() {
        return (rcs[]) i.clone();
    }
}
