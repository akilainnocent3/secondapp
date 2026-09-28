package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes5.dex */
public final class f2u {
    public static final /* synthetic */ f2u[] f;
    public final krf0 a;
    public final uf00<j58> b;
    public final uf00<j58> c;
    public final String d;
    public final klh0 e;

    /* JADX INFO: Fake field, exist only in values array */
    f2u EF0;

    static {
        krf0 krf0Var = krf0.TIER_1;
        uf00 uf00VarA = a4h.a(new j58(r58.d(4284174639L)), new j58(r58.d(4294967295L)), new j58(r58.d(4284240433L)));
        uf00 uf00VarA2 = a4h.a(new j58(r58.d(4287923283L)), new j58(r58.d(4282333214L)));
        klh0 klh0Var = klh0.f;
        f2u f2uVar = new f2u("Tier1", 0, krf0Var, uf00VarA, uf00VarA2, "https://s.sporty.net/cms/Upgrade_Base_Copper_9202538e1c.png", klh0Var);
        f2u f2uVar2 = new f2u("Tier2", 1, krf0.TIER_2, a4h.a(new j58(r58.d(4289356079L)), new j58(r58.d(4294967295L)), new j58(r58.d(4286332946L))), a4h.a(new j58(r58.d(4294963653L)), new j58(r58.d(4290539322L)), new j58(r58.d(4284492545L))), "https://s.sporty.net/cms/Upgrade_Base_Bronze_cad659590b.png", klh0Var);
        krf0 krf0Var2 = krf0.TIER_3;
        uf00 uf00VarA3 = a4h.a(new j58(r58.d(4281090135L)), new j58(r58.d(4293651435L)), new j58(r58.d(4281090135L)));
        uf00 uf00VarA4 = a4h.a(new j58(r58.d(4287997873L)), new j58(r58.d(4280758333L)));
        klh0 klh0Var2 = klh0.i;
        f = new f2u[]{f2uVar, f2uVar2, new f2u("Tier3", 2, krf0Var2, uf00VarA3, uf00VarA4, "https://s.sporty.net/cms/Upgrade_Base_Silver_0ef432f1af.png", klh0Var2), new f2u("Tier4", 3, krf0.TIER_4, a4h.a(new j58(r58.d(4288100874L)), new j58(r58.d(4294967295L)), new j58(r58.d(4287640586L))), a4h.a(new j58(r58.d(4294955264L)), new j58(r58.d(4289284362L))), "https://s.sporty.net/cms/Upgrade_Base_Gold_d590473971.png", klh0Var), new f2u("Tier5", 4, krf0.TIER_5, a4h.a(new j58(r58.d(4281090135L)), new j58(r58.d(4293651435L)), new j58(r58.d(4281090135L))), a4h.a(new j58(r58.d(4287997873L)), new j58(r58.d(4280758333L))), "https://s.sporty.net/cms/Upgrade_Base_Platinum_445dcd7fac.png", klh0Var2), new f2u("Tier6", 5, krf0.TIER_6, a4h.a(new j58(r58.d(4286083491L)), new j58(r58.d(4294769917L)), new j58(r58.d(4286083491L))), a4h.a(new j58(r58.d(4290492623L)), new j58(r58.d(4283649397L))), "https://s.sporty.net/cms/Upgrade_Base_Titanium_4acf781978.png", klh0Var2), new f2u("Tier7", 6, krf0.TIER_98, a4h.a(new j58(r58.d(4278200957L)), new j58(r58.d(4292736767L)), new j58(r58.d(4278201471L))), a4h.a(new j58(r58.d(4287618550L)), new j58(r58.d(4278203788L))), "https://s.sporty.net/cms/Upgrade_Base_Diamond_9faef2aba4.png", klh0Var2)};
    }

    public f2u(String str, int i, krf0 krf0Var, uf00 uf00Var, uf00 uf00Var2, String str2, klh0 klh0Var) {
        super(str, i);
        this.a = krf0Var;
        this.b = uf00Var;
        this.c = uf00Var2;
        this.d = str2;
        this.e = klh0Var;
    }

    public static f2u valueOf(String str) {
        return (f2u) Enum.valueOf(f2u.class, str);
    }

    public static f2u[] values() {
        return (f2u[]) f.clone();
    }
}
