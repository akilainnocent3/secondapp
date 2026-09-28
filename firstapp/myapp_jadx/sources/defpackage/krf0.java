package defpackage;

import com.sportybet.android.gp.tz.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 krf0[], still in use, count: 1, list:
  (r0v1 krf0[]) from 0x0250: CONSTRUCTOR (r0v1 krf0[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] (LINE:593) call: uag.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class krf0 {
    TIER_0(0, R.string.page_loyalty__tier0, r58.d(4291878643L), "https://s.sporty.net/cms/Tier_Iron_Status_Actived_Size_Big_381ddeece1.png", new srf0(new usf0(0.249f, 0.3261f), new usf0(0.58f, 0.63f)), new srf0(new usf0(0.249f, 0.3261f), new usf0(0.58f, 0.63f)), new dgv("https://s.sporty.net/cms/tier_background_iron_3x_fe9544290b.png")),
    TIER_1(1, R.string.page_loyalty__tier1, r58.d(4293844072L), "https://s.sporty.net/cms/Tier_Copper_Status_Actived_Size_Big_7fa43b3f17.png", new srf0(new usf0(0.249f, 0.3261f), new usf0(0.58f, 0.63f)), new srf0(new usf0(0.249f, 0.3261f), new usf0(0.58f, 0.63f)), new dgv("https://s.sporty.net/cms/tier_background_copper_3x_a7d9d478f5.png")),
    TIER_2(2, R.string.page_loyalty__tier2, r58.d(4294822303L), "https://s.sporty.net/cms/Tier_Bronze_Status_Actived_Size_Big_975548babd.png", new srf0(new usf0(0.249f, 0.3261f), new usf0(0.58f, 0.63f)), new srf0(new usf0(0.249f, 0.3261f), new usf0(0.58f, 0.63f)), new dgv("https://s.sporty.net/cms/tier_background_bronze_3x_c23f41af42.png")),
    TIER_3(3, R.string.page_loyalty__tier3, r58.d(4293783021L), "https://s.sporty.net/cms/Tier_Silver_Status_Actived_Size_Big_46a092e020.png", new srf0(new usf0(0.249f, 0.3261f), new usf0(0.58f, 0.63f)), new srf0(new usf0(0.249f, 0.3261f), new usf0(0.58f, 0.63f)), false, new dgv("https://s.sporty.net/cms/tier_background_silver_3x_39420835f1.png"), true),
    TIER_4(4, R.string.page_loyalty__tier4, r58.d(4294956575L), "https://s.sporty.net/cms/Tier_Gold_Status_Actived_Size_Big_242123e31d.png", new srf0(new usf0(0.249f, 0.3261f), new usf0(0.588f, 0.58f)), new srf0(new usf0(0.249f, 0.3261f), new usf0(0.588f, 0.58f)), false, new dgv("https://s.sporty.net/cms/tier_background_gold_3x_16dff7d720.png"), true),
    TIER_5(5, R.string.page_loyalty__tier5, r58.d(4290624957L), "https://s.sporty.net/cms/Tier_Platimum_Status_Actived_Size_Big_afd2e40b92.png", new srf0(new usf0(0.249f, 0.3261f), new usf0(0.588f, 0.58f)), new srf0(new usf0(0.249f, 0.3261f), new usf0(0.588f, 0.58f)), false, new dgv("https://s.sporty.net/cms/tier_background_platinum_3x_27ee978834.png"), true),
    TIER_6(6, R.string.page_loyalty__tier_titanium, r58.d(4291545062L), "https://s.sporty.net/cms/tier_titanium_2643fc3d2d.png", new srf0(new usf0(0.249f, 0.3261f), new usf0(0.588f, 0.58f)), new srf0(new usf0(0.249f, 0.3261f), new usf0(0.588f, 0.58f)), false, new dgv("https://s.sporty.net/cms/tier_background_titanium_3x_87e994d3c4.png"), true),
    TIER_98(98, R.string.page_loyalty__tier98, r58.d(4289194495L), "https://s.sporty.net/cms/tier_diamond_c10593c472.png", new srf0(new usf0(0.249f, 0.3261f), new usf0(0.588f, 0.58f)), new srf0(new usf0(0.249f, 0.3261f), new usf0(0.588f, 0.58f)), true, new dgv("https://s.sporty.net/cms/tier_background_diamond_3x_e8b5b88bca.png"), true);

    public static final /* synthetic */ uag I;
    public static final a y = new a();
    public final int a;
    public final int b;
    public final long c;
    public final String d;
    public final srf0 e;
    public final srf0 f;
    public final boolean i;
    public final dgv v;
    public final boolean w;

    public static final class a {
    }

    static {
        I = new uag(new krf0[]{r0, r1, r2, r3, r4, r5, r6, r7});
    }

    public /* synthetic */ krf0(int i, int i2, long j, String str, srf0 srf0Var, srf0 srf0Var2, dgv dgvVar) {
        this(i, i2, j, str, srf0Var, srf0Var2, false, dgvVar, false);
    }

    public static krf0 valueOf(String str) {
        return (krf0) Enum.valueOf(krf0.class, str);
    }

    public static krf0[] values() {
        return (krf0[]) H.clone();
    }

    public krf0(int i, int i2, long j, String str, srf0 srf0Var, srf0 srf0Var2, boolean z, dgv dgvVar, boolean z2) {
        super(str, i);
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = str;
        this.e = srf0Var;
        this.f = srf0Var2;
        this.i = z;
        this.v = dgvVar;
        this.w = z2;
    }
}
