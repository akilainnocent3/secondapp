package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sportybet.android.gp.tz.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'd' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes5.dex */
public final class wlc0 {
    public static final wlc0 d;
    public static final wlc0 e;
    public static final wlc0 f;
    public static final wlc0 i;
    public static final /* synthetic */ wlc0[] v;
    public final a a;
    public final a b;
    public final int c;

    public static final class a {
        public final ResourceUiText a;
        public final int b;
        public final Integer c;
        public final Integer d;

        public a(ResourceUiText resourceUiText, int i, Integer num, Integer num2) {
            this.a = resourceUiText;
            this.b = i;
            this.c = num;
            this.d = num2;
        }
    }

    static {
        a aVar = new a(new ResourceUiText(R.string.page_instant_virtual__playing), R.color.bg_brand_sub_primary_d_lightest, null, null);
        ResourceUiText resourceUiText = new ResourceUiText(R.string.page_instant_virtual__1st_half);
        Integer numValueOf = Integer.valueOf(R.drawable.ic__stopwatch);
        Integer numValueOf2 = Integer.valueOf(R.color.icon_primary);
        wlc0 wlc0Var = new wlc0("PLAYING_1ST_HALF", 0, aVar, new a(resourceUiText, R.color.text_primary, numValueOf, numValueOf2), R.color.bg_brand_sub_secondary_d_base);
        d = wlc0Var;
        wlc0 wlc0Var2 = new wlc0("PLAYING_2ND_HALF", 1, new a(new ResourceUiText(R.string.page_instant_virtual__playing), R.color.bg_brand_sub_primary_d_lightest, null, null), new a(new ResourceUiText(R.string.page_instant_virtual__2nd_half), R.color.text_primary, numValueOf, numValueOf2), R.color.bg_brand_sub_secondary_d_base);
        e = wlc0Var2;
        wlc0 wlc0Var3 = new wlc0("HALF_TIME", 2, new a(new ResourceUiText(R.string.page_instant_virtual__half_time), R.color.text_primary, numValueOf, numValueOf2), null, R.color.bg_primary_d_base);
        f = wlc0Var3;
        wlc0 wlc0Var4 = new wlc0("GAME_ENDS", 3, new a(new ResourceUiText(R.string.page_instant_virtual__game_ends), R.color.text_primary, Integer.valueOf(R.drawable.ic__feature__match_status_won), null), null, R.color.bg_primary_d_base);
        i = wlc0Var4;
        v = new wlc0[]{wlc0Var, wlc0Var2, wlc0Var3, wlc0Var4};
    }

    public wlc0(String str, int i2, a aVar, a aVar2, int i3) {
        super(str, i2);
        this.a = aVar;
        this.b = aVar2;
        this.c = i3;
    }

    public static wlc0 valueOf(String str) {
        return (wlc0) Enum.valueOf(wlc0.class, str);
    }

    public static wlc0[] values() {
        return (wlc0[]) v.clone();
    }
}
