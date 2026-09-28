package defpackage;

import java.util.Locale;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes7.dex */
public final class qpc {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[jl4.values().length];
            try {
                iArr[jl4.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[jl4.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[jl4.f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[jl4.c.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[jl4.d.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[jl4.e.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            a = iArr;
        }
    }

    public static final oh4 a(aj4 aj4Var) {
        long sessionId = aj4Var.getSessionId();
        Long expiresAt = aj4Var.getExpiresAt();
        Double accumulatedReward = aj4Var.getAccumulatedReward();
        Double remainingBudget = aj4Var.getRemainingBudget();
        Integer yellowCards = aj4Var.getYellowCards();
        return new oh4(sessionId, expiresAt, accumulatedReward, remainingBudget, yellowCards != null ? yellowCards.intValue() : 0, aj4Var.getTimerSeconds());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x005d  */
    public static final fp4 b(gp4 gp4Var) {
        ek4 ek4Var;
        gp4Var.getClass();
        String upperCase = gp4Var.getObjectType().toUpperCase(Locale.ROOT);
        upperCase.getClass();
        switch (upperCase) {
            case "2":
                ek4Var = ek4.b;
                break;
            case "3":
                ek4Var = ek4.c;
                break;
            case "4":
                ek4Var = ek4.d;
                break;
            case "RED_CARD":
                ek4Var = ek4.d;
                break;
            case "GOLDEN_BALL":
                ek4Var = ek4.b;
                break;
            case "YELLOW_CARD":
                ek4Var = ek4.c;
                break;
            default:
                ek4Var = ek4.a;
                break;
        }
        ek4 ek4Var2 = ek4Var;
        int objectId = gp4Var.getObjectId();
        int columnNumber = gp4Var.getColumnNumber();
        if (ek4Var2 == ek4.c || ek4Var2 == ek4.d) {
            columnNumber = f.e(columnNumber - 1, 1, 5) + 1;
        }
        int i = columnNumber;
        float angle = gp4Var.getAngle();
        Float velocityMultiplier = gp4Var.getVelocityMultiplier();
        float fFloatValue = (velocityMultiplier == null || Math.abs(velocityMultiplier.floatValue()) > Float.MAX_VALUE) ? 1.0f : velocityMultiplier.floatValue() / 50.0f;
        Double rewardValue = gp4Var.getRewardValue();
        Boolean isGoldenBallAllowed = gp4Var.getIsGoldenBallAllowed();
        return new fp4(objectId, ek4Var2, i, angle, fFloatValue, rewardValue, isGoldenBallAllowed != null ? isGoldenBallAllowed.booleanValue() : true);
    }
}
