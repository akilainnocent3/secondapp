package defpackage;

import com.sporty.android.core.model.loyalty.BetBuilderType;
import com.sporty.android.core.model.loyalty.MissionBetCategory;

/* JADX INFO: loaded from: classes7.dex */
public final class p53 {
    public final jrm a;
    public final j53 b;

    /* JADX INFO: loaded from: classes4.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[BetBuilderType.values().length];
            try {
                iArr[BetBuilderType.NO_LIMIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BetBuilderType.LEAST_ONE_BET_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BetBuilderType.ALL_BET_BUILDER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
            int[] iArr2 = new int[MissionBetCategory.values().length];
            try {
                iArr2[MissionBetCategory.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[MissionBetCategory.REAL_SPORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            b = iArr2;
        }
    }

    public p53(jrm jrmVar, j53 j53Var) {
        jrmVar.getClass();
        j53Var.getClass();
        this.a = jrmVar;
        this.b = j53Var;
    }
}
