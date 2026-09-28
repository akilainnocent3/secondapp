package defpackage;

import com.sporty.android.core.model.OrderBetType;
import com.sporty.android.core.model.loyalty.BetBuilderType;
import com.sporty.android.core.model.loyalty.EarlyGoalsType;
import com.sporty.android.core.model.loyalty.MissionBetCategory;
import com.sporty.android.core.model.loyalty.UpType;

/* JADX INFO: loaded from: classes7.dex */
public final class n53 {
    public final jrm a;
    public final lrm b;

    /* JADX INFO: loaded from: classes4.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;
        public static final /* synthetic */ int[] d;
        public static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[OrderBetType.values().length];
            try {
                iArr[OrderBetType.MULTIPLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderBetType.SYSTEM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
            int[] iArr2 = new int[MissionBetCategory.values().length];
            try {
                iArr2[MissionBetCategory.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[MissionBetCategory.REAL_SPORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            b = iArr2;
            int[] iArr3 = new int[BetBuilderType.values().length];
            try {
                iArr3[BetBuilderType.NO_LIMIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[BetBuilderType.LEAST_ONE_BET_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[BetBuilderType.ALL_BET_BUILDER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            c = iArr3;
            int[] iArr4 = new int[EarlyGoalsType.values().length];
            try {
                iArr4[EarlyGoalsType.NO_LIMIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr4[EarlyGoalsType.LEAST_ONE_EARLY_GOALS.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr4[EarlyGoalsType.ALL_EARLY_GOALS.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            d = iArr4;
            int[] iArr5 = new int[UpType.values().length];
            try {
                iArr5[UpType.NO_LIMIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr5[UpType.LEAST_ONE_ONE_UP.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr5[UpType.ALL_ONE_UP.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr5[UpType.LEAST_ONE_TWO_UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr5[UpType.ALL_TWO_UP.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
            e = iArr5;
        }
    }

    public n53(jrm jrmVar, lrm lrmVar) {
        jrmVar.getClass();
        lrmVar.getClass();
        this.a = jrmVar;
        this.b = lrmVar;
    }
}
