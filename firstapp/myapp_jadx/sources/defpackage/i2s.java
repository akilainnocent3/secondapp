package defpackage;

import com.sportybet.feature.loyalty.impl.challenge.presentation.model.ChallengeCardStatus;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class i2s {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ChallengeCardStatus.values().length];
        try {
            iArr[ChallengeCardStatus.Completed.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ChallengeCardStatus.Expired.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ChallengeCardStatus.Ongoing.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ChallengeCardStatus.Available.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ChallengeCardStatus.Conflicted.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ChallengeCardStatus.Upcoming.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[ChallengeCardStatus.Cancelled.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[ChallengeCardStatus.EntryClosed.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        a = iArr;
    }
}
