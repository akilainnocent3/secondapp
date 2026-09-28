package defpackage;

import kotlin.time.b;
import kotlin.time.c;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'b' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes5.dex */
public final class s2d0 {
    public static final s2d0 b;
    public static final s2d0 c;
    public static final /* synthetic */ s2d0[] d;
    public final long a;

    static {
        b.a aVar = b.b;
        rgf rgfVar = rgf.MILLISECONDS;
        s2d0 s2d0Var = new s2d0("SCORE_SHIFTING", 0, c.h(500, rgfVar));
        b = s2d0Var;
        s2d0 s2d0Var2 = new s2d0("IDLE", 1, c.h(0, rgfVar));
        c = s2d0Var2;
        d = new s2d0[]{s2d0Var, s2d0Var2};
    }

    public s2d0(String str, int i, long j) {
        super(str, i);
        this.a = j;
    }

    public static s2d0 valueOf(String str) {
        return (s2d0) Enum.valueOf(s2d0.class, str);
    }

    public static s2d0[] values() {
        return (s2d0[]) d.clone();
    }
}
