package com.sporty.android.core.model.patron;

import com.appsflyer.internal.m;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportygames.piggybash.data.model.http.PBBetHistoryItemDTO;
import defpackage.dy5;
import defpackage.f78;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.hxa;
import defpackage.om2;
import defpackage.tag;
import defpackage.uhc;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001:\u0003123BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010$\u001a\u00020\u001dJ\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0006HÆ\u0003J\t\u0010(\u001a\u00020\u0006HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0006HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u000bHÆ\u0003JQ\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0014\u0010-\u001a\u00020\u001d2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010/\u001a\u00020\u0003HÖ\u0081\u0004J\n\u00100\u001a\u00020\u0006HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u00064"}, d2 = {"Lcom/sporty/android/core/model/patron/KYCReminder;", "", "userLevel", "", "reminderLevel", "rejectReason", "", "reminderId", AnalyticsParam.EVENT_STATUS, "userId", "details", "Lcom/sporty/android/core/model/patron/KYCReminder$Details;", "<init>", "(IILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/sporty/android/core/model/patron/KYCReminder$Details;)V", "getUserLevel", "()I", "getReminderLevel", "getRejectReason", "()Ljava/lang/String;", "getReminderId", "getStatus", "getUserId", "getDetails", "()Lcom/sporty/android/core/model/patron/KYCReminder$Details;", "reminder", "Lcom/sporty/android/core/model/patron/KYCReminder$Reminder;", "getReminder", "()Lcom/sporty/android/core/model/patron/KYCReminder$Reminder;", "showWarning", "", "getShowWarning", "()Z", "verificationStatus", "Lcom/sporty/android/core/model/patron/KYCReminder$VerificationStatus;", "getVerificationStatus", "()Lcom/sporty/android/core/model/patron/KYCReminder$VerificationStatus;", "isPendingMXPhoneNumberVerification", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "Reminder", "VerificationStatus", "Details", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class KYCReminder {
    private final Details details;
    private final String rejectReason;
    private final String reminderId;
    private final int reminderLevel;
    private final int status;
    private final String userId;
    private final int userLevel;

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJ>\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/sporty/android/core/model/patron/KYCReminder$Details;", "", "bankAccountNumber", "", "bankName", "assetId", "", "submissionId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getBankAccountNumber", "()Ljava/lang/String;", "getBankName", "getAssetId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSubmissionId", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/sporty/android/core/model/patron/KYCReminder$Details;", "equals", "", "other", "hashCode", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Details {
        private final Integer assetId;
        private final String bankAccountNumber;
        private final String bankName;
        private final Integer submissionId;

        public Details(String str, String str2, Integer num, Integer num2) {
            this.bankAccountNumber = str;
            this.bankName = str2;
            this.assetId = num;
            this.submissionId = num2;
        }

        public static /* synthetic */ Details copy$default(Details details, String str, String str2, Integer num, Integer num2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = details.bankAccountNumber;
            }
            if ((i & 2) != 0) {
                str2 = details.bankName;
            }
            if ((i & 4) != 0) {
                num = details.assetId;
            }
            if ((i & 8) != 0) {
                num2 = details.submissionId;
            }
            return details.copy(str, str2, num, num2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getBankAccountNumber() {
            return this.bankAccountNumber;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getBankName() {
            return this.bankName;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Integer getAssetId() {
            return this.assetId;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Integer getSubmissionId() {
            return this.submissionId;
        }

        public final Details copy(String bankAccountNumber, String bankName, Integer assetId, Integer submissionId) {
            return new Details(bankAccountNumber, bankName, assetId, submissionId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Details)) {
                return false;
            }
            Details details = (Details) other;
            return Intrinsics.g(this.bankAccountNumber, details.bankAccountNumber) && Intrinsics.g(this.bankName, details.bankName) && Intrinsics.g(this.assetId, details.assetId) && Intrinsics.g(this.submissionId, details.submissionId);
        }

        public final Integer getAssetId() {
            return this.assetId;
        }

        public final String getBankAccountNumber() {
            return this.bankAccountNumber;
        }

        public final String getBankName() {
            return this.bankName;
        }

        public final Integer getSubmissionId() {
            return this.submissionId;
        }

        public int hashCode() {
            String str = this.bankAccountNumber;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.bankName;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.assetId;
            int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.submissionId;
            return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
        }

        public String toString() {
            String str = this.bankAccountNumber;
            String str2 = this.bankName;
            Integer num = this.assetId;
            Integer num2 = this.submissionId;
            StringBuilder sbA = ux5.a("Details(bankAccountNumber=", str, ", bankName=", str2, ", assetId=");
            sbA.append(num);
            sbA.append(", submissionId=");
            sbA.append(num2);
            sbA.append(")");
            return sbA.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/sporty/android/core/model/patron/KYCReminder$Reminder;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "NULL", "FIRST_USE", "VERIFICATION_FAIL", "USER_TIER_CHANGE", "DEPOSIT_PENDING", "FREE_GIFT_PIX", "FIRST_DEPOSIT_PIX", "SOUTH_AFRICA_IDENTITY_VERIFICATION", "SOUTH_AFRICA_FIRST_DEPOSIT", "SOUTH_AFRICA_BANK_ACCOUNT_VERIFICATION", "MX_PROMOTION", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public enum Reminder {
        NULL("Null"),
        FIRST_USE("Reminder01"),
        VERIFICATION_FAIL("Reminder02"),
        USER_TIER_CHANGE("Reminder03"),
        DEPOSIT_PENDING("Reminder04"),
        FREE_GIFT_PIX("Reminder05"),
        FIRST_DEPOSIT_PIX("Reminder06"),
        SOUTH_AFRICA_IDENTITY_VERIFICATION("Reminder07"),
        SOUTH_AFRICA_FIRST_DEPOSIT("Reminder08"),
        SOUTH_AFRICA_BANK_ACCOUNT_VERIFICATION("Reminder09"),
        MX_PROMOTION("Reminder10");

        private static final /* synthetic */ tag $ENTRIES = om2.a(values());
        private final String value;

        Reminder(String str) {
            this.value = str;
        }

        public static tag<Reminder> getEntries() {
            return $ENTRIES;
        }

        public final String getValue() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/sporty/android/core/model/patron/KYCReminder$VerificationStatus;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "SUCCESS", "FAILED", PBBetHistoryItemDTO.STATUS_PENDING, "UNDER_REVIEW", "PENDING_DATA", "WHO_YOU_VERIFICATION_PENDING", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public enum VerificationStatus {
        SUCCESS(20),
        FAILED(30),
        PENDING(40),
        UNDER_REVIEW(50),
        PENDING_DATA(60),
        WHO_YOU_VERIFICATION_PENDING(70);

        private static final /* synthetic */ tag $ENTRIES = om2.a(values());
        private final int value;

        VerificationStatus(int i) {
            this.value = i;
        }

        public static tag<VerificationStatus> getEntries() {
            return $ENTRIES;
        }

        public final int getValue() {
            return this.value;
        }
    }

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Reminder.values().length];
            try {
                iArr[Reminder.NULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Reminder.FIRST_USE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Reminder.VERIFICATION_FAIL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Reminder.USER_TIER_CHANGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Reminder.DEPOSIT_PENDING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Reminder.FREE_GIFT_PIX.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Reminder.FIRST_DEPOSIT_PIX.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Reminder.SOUTH_AFRICA_FIRST_DEPOSIT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[Reminder.SOUTH_AFRICA_IDENTITY_VERIFICATION.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[Reminder.MX_PROMOTION.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[Reminder.SOUTH_AFRICA_BANK_ACCOUNT_VERIFICATION.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public KYCReminder(int i, int i2, String str, String str2, int i3, String str3, Details details) {
        m.a(str, str2, str3);
        this.userLevel = i;
        this.reminderLevel = i2;
        this.rejectReason = str;
        this.reminderId = str2;
        this.status = i3;
        this.userId = str3;
        this.details = details;
    }

    public static /* synthetic */ KYCReminder copy$default(KYCReminder kYCReminder, int i, int i2, String str, String str2, int i3, String str3, Details details, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = kYCReminder.userLevel;
        }
        if ((i4 & 2) != 0) {
            i2 = kYCReminder.reminderLevel;
        }
        if ((i4 & 4) != 0) {
            str = kYCReminder.rejectReason;
        }
        if ((i4 & 8) != 0) {
            str2 = kYCReminder.reminderId;
        }
        if ((i4 & 16) != 0) {
            i3 = kYCReminder.status;
        }
        if ((i4 & 32) != 0) {
            str3 = kYCReminder.userId;
        }
        if ((i4 & 64) != 0) {
            details = kYCReminder.details;
        }
        String str4 = str3;
        Details details2 = details;
        int i5 = i3;
        String str5 = str;
        return kYCReminder.copy(i, i2, str5, str2, i5, str4, details2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getUserLevel() {
        return this.userLevel;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getReminderLevel() {
        return this.reminderLevel;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRejectReason() {
        return this.rejectReason;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getReminderId() {
        return this.reminderId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Details getDetails() {
        return this.details;
    }

    public final KYCReminder copy(int userLevel, int reminderLevel, String rejectReason, String reminderId, int status, String userId, Details details) {
        rejectReason.getClass();
        reminderId.getClass();
        userId.getClass();
        return new KYCReminder(userLevel, reminderLevel, rejectReason, reminderId, status, userId, details);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KYCReminder)) {
            return false;
        }
        KYCReminder kYCReminder = (KYCReminder) other;
        return this.userLevel == kYCReminder.userLevel && this.reminderLevel == kYCReminder.reminderLevel && Intrinsics.g(this.rejectReason, kYCReminder.rejectReason) && Intrinsics.g(this.reminderId, kYCReminder.reminderId) && this.status == kYCReminder.status && Intrinsics.g(this.userId, kYCReminder.userId) && Intrinsics.g(this.details, kYCReminder.details);
    }

    public final Details getDetails() {
        return this.details;
    }

    public final String getRejectReason() {
        return this.rejectReason;
    }

    public final Reminder getReminder() {
        String str = this.reminderId;
        Reminder reminder = Reminder.FIRST_USE;
        if (Intrinsics.g(str, reminder.getValue())) {
            return reminder;
        }
        Reminder reminder2 = Reminder.VERIFICATION_FAIL;
        if (Intrinsics.g(str, reminder2.getValue())) {
            return reminder2;
        }
        Reminder reminder3 = Reminder.USER_TIER_CHANGE;
        if (Intrinsics.g(str, reminder3.getValue())) {
            return reminder3;
        }
        Reminder reminder4 = Reminder.DEPOSIT_PENDING;
        if (Intrinsics.g(str, reminder4.getValue())) {
            return reminder4;
        }
        Reminder reminder5 = Reminder.FREE_GIFT_PIX;
        if (Intrinsics.g(str, reminder5.getValue())) {
            return reminder5;
        }
        Reminder reminder6 = Reminder.FIRST_DEPOSIT_PIX;
        if (Intrinsics.g(str, reminder6.getValue())) {
            return reminder6;
        }
        Reminder reminder7 = Reminder.SOUTH_AFRICA_IDENTITY_VERIFICATION;
        if (Intrinsics.g(str, reminder7.getValue())) {
            return reminder7;
        }
        Reminder reminder8 = Reminder.SOUTH_AFRICA_FIRST_DEPOSIT;
        if (Intrinsics.g(str, reminder8.getValue())) {
            return reminder8;
        }
        Reminder reminder9 = Reminder.SOUTH_AFRICA_BANK_ACCOUNT_VERIFICATION;
        if (Intrinsics.g(str, reminder9.getValue())) {
            return reminder9;
        }
        Reminder reminder10 = Reminder.MX_PROMOTION;
        return Intrinsics.g(str, reminder10.getValue()) ? reminder10 : Reminder.NULL;
    }

    public final String getReminderId() {
        return this.reminderId;
    }

    public final int getReminderLevel() {
        return this.reminderLevel;
    }

    public final boolean getShowWarning() {
        switch (WhenMappings.$EnumSwitchMapping$0[getReminder().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return this.status == VerificationStatus.FAILED.getValue();
            case 11:
                if (this.status != VerificationStatus.SUCCESS.getValue() && this.status != VerificationStatus.FAILED.getValue()) {
                    return false;
                }
            case 9:
            case 10:
                return true;
            default:
                uhc.a();
                return false;
        }
    }

    public final int getStatus() {
        return this.status;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final int getUserLevel() {
        return this.userLevel;
    }

    public final VerificationStatus getVerificationStatus() {
        int i = this.status;
        VerificationStatus verificationStatus = VerificationStatus.FAILED;
        if (i == verificationStatus.getValue()) {
            return verificationStatus;
        }
        VerificationStatus verificationStatus2 = VerificationStatus.PENDING;
        if (i == verificationStatus2.getValue()) {
            return verificationStatus2;
        }
        VerificationStatus verificationStatus3 = VerificationStatus.UNDER_REVIEW;
        if (i == verificationStatus3.getValue()) {
            return verificationStatus3;
        }
        VerificationStatus verificationStatus4 = VerificationStatus.PENDING_DATA;
        if (i == verificationStatus4.getValue()) {
            return verificationStatus4;
        }
        VerificationStatus verificationStatus5 = VerificationStatus.WHO_YOU_VERIFICATION_PENDING;
        return i == verificationStatus5.getValue() ? verificationStatus5 : VerificationStatus.SUCCESS;
    }

    public int hashCode() {
        int iA = gmf0.a(gpp.a(this.status, gmf0.a(gmf0.a(gpp.a(this.reminderLevel, Integer.hashCode(this.userLevel) * 31, 31), 31, this.rejectReason), 31, this.reminderId), 31), 31, this.userId);
        Details details = this.details;
        return iA + (details == null ? 0 : details.hashCode());
    }

    public final boolean isPendingMXPhoneNumberVerification() {
        return getReminder() == Reminder.MX_PROMOTION && getVerificationStatus() == VerificationStatus.PENDING;
    }

    public String toString() {
        int i = this.userLevel;
        int i2 = this.reminderLevel;
        String str = this.rejectReason;
        String str2 = this.reminderId;
        int i3 = this.status;
        String str3 = this.userId;
        Details details = this.details;
        StringBuilder sbA = dy5.a("KYCReminder(userLevel=", i, i2, ", reminderLevel=", ", rejectReason=");
        hxa.c(sbA, str, ", reminderId=", str2, ", status=");
        f78.b(i3, ", userId=", str3, ", details=", sbA);
        sbA.append(details);
        sbA.append(")");
        return sbA.toString();
    }

    public /* synthetic */ KYCReminder(int i, int i2, String str, String str2, int i3, String str3, Details details, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i4 & 4) != 0 ? "" : str, (i4 & 8) != 0 ? "" : str2, i3, str3, (i4 & 64) != 0 ? null : details);
    }
}
