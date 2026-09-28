package defpackage;

import com.sportybet.feature.loyalty.impl.challenge.presentation.model.ChallengeCardStatus;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class jz6 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ChallengeCardStatus.values().length];
        try {
            iArr[ChallengeCardStatus.Available.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ChallengeCardStatus.Conflicted.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ChallengeCardStatus.Ongoing.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ChallengeCardStatus.Completed.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ChallengeCardStatus.Upcoming.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ChallengeCardStatus.Cancelled.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[ChallengeCardStatus.Expired.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[ChallengeCardStatus.EntryClosed.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        a = iArr;
    }
}
