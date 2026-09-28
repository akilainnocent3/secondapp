package defpackage;

import androidx.recyclerview.widget.IUw.QWvyvNzGsBpRT;
import com.sporty.android.core.model.crypto.IURC.iKBWavCysVP;
import com.sporty.android.core.model.service.CountryCodeName;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public class ctt {
    public static final a b;
    public static final /* synthetic */ ctt[] c;
    public static final /* synthetic */ uag d;
    public final String a;

    /* JADX INFO: Fake field, exist only in values array */
    ctt EF0;

    /* JADX INFO: Fake field, exist only in values array */
    ctt EF1;

    /* JADX INFO: Fake field, exist only in values array */
    ctt EF2;

    /* JADX INFO: Fake field, exist only in values array */
    ctt EF4;

    /* JADX INFO: Fake field, exist only in values array */
    ctt EF6;

    /* JADX INFO: Fake field, exist only in values array */
    ctt EF8;

    /* JADX INFO: Fake field, exist only in values array */
    ctt EF10;

    /* JADX INFO: Fake field, exist only in values array */
    ctt EF12;

    public ctt(String str, int i, String str2) {
        super(str, i);
        this.a = str2;
    }

    public static ctt valueOf(String str) {
        return (ctt) Enum.valueOf(ctt.class, str);
    }

    public static ctt[] values() {
        return (ctt[]) c.clone();
    }

    public String a(CountryCodeName countryCodeName) {
        countryCodeName.getClass();
        return this.a;
    }

    public static final class a extends ctt {

        /* JADX INFO: renamed from: ctt$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes5.dex */
        public static final /* synthetic */ class C0463a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[CountryCodeName.values().length];
                try {
                    iArr[CountryCodeName.GHANA.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CountryCodeName.BRAZIL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[CountryCodeName.MEXICO.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[CountryCodeName.NIGERIA.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[CountryCodeName.SOUTH_AFRICA.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                a = iArr;
            }
        }

        @Override // defpackage.ctt
        public final String a(CountryCodeName countryCodeName) {
            countryCodeName.getClass();
            int i = C0463a.a[countryCodeName.ordinal()];
            if (i != 1) {
                if (i != 2 && i != 3) {
                    if (i == 4) {
                        return iKBWavCysVP.ilTzUHyXCCR;
                    }
                    if (i != 5) {
                        return "https://s.sporty.net/cms/loyalty_intro_mccarthy_4x_11942045f4.png";
                    }
                    return "https://s.sporty.net/cms/loyalty_intro_mccarthy_kolbe_4x_5c815dc6b3.png";
                }
                return "https://s.sporty.net/cms/loyalty_intro_militao_mourinho_4x_3ee36feba3.png";
            }
            return "https://s.sporty.net/cms/Game_Amb_GH_db0190df34.png";
        }
    }

    static {
        ctt cttVar = new ctt("BACKGROUND", 0, "https://s.sporty.net/cms/Background_min_3ae4a20d96.png");
        ctt cttVar2 = new ctt("CARD_BALL", 1, "https://s.sporty.net/cms/Card_Ball_1c60686f1b.png");
        ctt cttVar3 = new ctt("CARD_GIFT", 2, "https://s.sporty.net/cms/Card_Gift_ad1bb7beb5.png");
        ctt cttVar4 = new ctt("CARD_TROPHY", 3, "https://s.sporty.net/cms/Card_Trophy_40b0dae64b.png");
        ctt cttVar5 = new ctt("CARD_FLIP", 4, "https://s.sporty.net/cms/Card_Flip_629a7040ac.png");
        ctt cttVar6 = new ctt("FOOTBALL", 5, "https://s.sporty.net/cms/football_33378df44d.gif");
        ctt cttVar7 = new ctt("BALL_BOARD_CARD", 6, "https://s.sporty.net/cms/card_2_34ed36d07c.png");
        ctt cttVar8 = new ctt("GESTURE", 7, "https://s.sporty.net/cms/Gesture_55c5db2b89.png");
        a aVar = new a("WELCOME_BANNER", 8, "https://s.sporty.net/cms/loyalty_intro_mccarthy_4x_11942045f4.png");
        b = aVar;
        ctt[] cttVarArr = {cttVar, cttVar2, cttVar3, cttVar4, cttVar5, cttVar6, cttVar7, cttVar8, aVar, new ctt("TREASURE_COIN1", 9, QWvyvNzGsBpRT.kGKYnPtZptcqjFW), new ctt("TREASURE_COIN2", 10, "https://s.sporty.net/cms/m02_8a126d0ace.png"), new ctt("TREASURE_COIN3", 11, "https://s.sporty.net/cms/m03_1460b0ba10.png"), new ctt("TREASURE_COIN4", 12, "https://s.sporty.net/cms/m04_f62aeccf8f.png"), new ctt("TREASURE_COIN5", 13, "https://s.sporty.net/cms/m05_9cb78dfd43.png"), new ctt("TREASURE_COIN6", 14, "https://s.sporty.net/cms/m06_fc097f231d.png"), new ctt("TREASURE_SHINE", 15, "https://s.sporty.net/cms/shimmer_7a9b5197af.png"), new ctt("TREASURE_STARTS", 16, "https://s.sporty.net/cms/starts_9a30e24058.png"), new ctt("TREASURE_BOX", 17, "https://s.sporty.net/cms/treasure_box_bc9af71d08.png"), new ctt("TREASURE_GIFT", 18, "https://s.sporty.net/cms/treasure_gift_2476651473.png"), new ctt("REWARD_BG", 19, "https://s.sporty.net/cms/Gift_Bg_a3fe47ed54.png")};
        c = cttVarArr;
        d = new uag(cttVarArr);
    }
}
