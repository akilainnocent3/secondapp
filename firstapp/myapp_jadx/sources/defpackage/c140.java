package defpackage;

import com.sportybet.android.gp.tz.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'c' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes8.dex */
public final class c140 {
    public static final /* synthetic */ uag A;
    public static final c140 c;
    public static final c140 d;
    public static final c140 e;
    public static final c140 f;
    public static final c140 i;
    public static final c140 v;
    public static final c140 w;
    public static final c140 y;
    public static final /* synthetic */ c140[] z;
    public final rcs a;
    public final int b;

    static {
        rcs rcsVar = rcs.TIME;
        c140 c140Var = new c140("DAILY_TIME", 0, rcsVar, R.string.common_functions__daily_time_limits);
        c = c140Var;
        c140 c140Var2 = new c140("WEEKLY_TIME", 1, rcsVar, R.string.common_functions__weekly_time_limits);
        d = c140Var2;
        rcs rcsVar2 = rcs.BETTING;
        c140 c140Var3 = new c140("DAILY_BETTING", 2, rcsVar2, R.string.common_functions__daily_betting_limits);
        e = c140Var3;
        c140 c140Var4 = new c140("WEEKLY_BETTING", 3, rcsVar2, R.string.common_functions__weekly_betting_limits);
        f = c140Var4;
        c140 c140Var5 = new c140("MONTHLY_BETTING", 4, rcsVar2, R.string.common_functions__monthly_betting_limits);
        i = c140Var5;
        rcs rcsVar3 = rcs.LOSS;
        c140 c140Var6 = new c140("DAILY_LOSS", 5, rcsVar3, R.string.common_functions__daily_loss_limits);
        v = c140Var6;
        c140 c140Var7 = new c140("WEEKLY_LOSS", 6, rcsVar3, R.string.common_functions__weekly_loss_limits);
        w = c140Var7;
        c140 c140Var8 = new c140("MONTHLY_LOSS", 7, rcsVar3, R.string.common_functions__monthly_loss_limits);
        y = c140Var8;
        c140[] c140VarArr = {c140Var, c140Var2, c140Var3, c140Var4, c140Var5, c140Var6, c140Var7, c140Var8};
        z = c140VarArr;
        A = new uag(c140VarArr);
    }

    public c140(String str, int i2, rcs rcsVar, int i3) {
        super(str, i2);
        this.a = rcsVar;
        this.b = i3;
    }

    public static c140 valueOf(String str) {
        return (c140) Enum.valueOf(c140.class, str);
    }

    public static c140[] values() {
        return (c140[]) z.clone();
    }
}
