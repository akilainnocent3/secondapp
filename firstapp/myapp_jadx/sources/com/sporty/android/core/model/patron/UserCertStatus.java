package com.sporty.android.core.model.patron;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Retention(RetentionPolicy.SOURCE)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000Ê\u0001\u000e\b\u0004\u0012\n\b\u0005\u0012\u0006\b\n0\u00068\u0007¨\u0006\u0003"}, d2 = {"Lcom/sporty/android/core/model/patron/UserCertStatus;", "", "Companion", "model", "Lkotlin/annotation/Retention;", "value", "Lkotlin/annotation/AnnotationRetention;", "SOURCE"}, k = 1, mv = {2, 4, 0}, xi = 48)
public @interface UserCertStatus {
    public static final int BVN_COMPLETED = 305;
    public static final int BVN_UNCONFIRMED = 320;
    public static final int CONFIRMED = 340;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int DEFAULT = 0;
    public static final int IGNORE = 360;
    public static final int INIT = 300;
    public static final int NOT_SUPPORTED = 399;
    public static final int SIMPLE_KEY_UNCONFIRMED = 325;
    public static final int SIMPLE_KEY_VERIFIED = 355;
    public static final int SUBMITTED = 310;
    public static final int UNBOUND = 370;
    public static final int VERIFIED = 350;
    public static final int WAITING_FOR_BANK = 330;
    public static final int ZA_APPROVED = 400;
    public static final int ZA_CPB_VERIFIED_REJECTED_SUBMISSION = 407;
    public static final int ZA_EMPTY_IDENTITY_AND_SUBMISSIONS = 401;
    public static final int ZA_EMPTY_PERSONAL_DETAILS = 404;
    public static final int ZA_NEEDS_PASSPORT_VERIFICATION = 409;
    public static final int ZA_PENDING_IDENTITY_AND_SUBMISSIONS = 403;
    public static final int ZA_REJECTED_IDENTITY_AND_SUBMISSIONS = 402;
    public static final int ZA_REJECTED_PASSPORT_VERIFICATION = 410;
    public static final int ZA_REJECTED_SUBMISSION_WITH_RETRY = 408;
    public static final int ZA_WAITING_FOR_KYC_EXTERNAL_VALIDATION = 405;
    public static final int ZA_WAITING_FOR_REVIEW_CPB_VERIFIED = 406;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0018\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/sporty/android/core/model/patron/UserCertStatus$Companion;", "", "<init>", "()V", "DEFAULT", "", "INIT", "BVN_COMPLETED", "SUBMITTED", "BVN_UNCONFIRMED", "SIMPLE_KEY_UNCONFIRMED", "WAITING_FOR_BANK", "CONFIRMED", "VERIFIED", "SIMPLE_KEY_VERIFIED", "IGNORE", "UNBOUND", "NOT_SUPPORTED", "ZA_APPROVED", "ZA_EMPTY_IDENTITY_AND_SUBMISSIONS", "ZA_REJECTED_IDENTITY_AND_SUBMISSIONS", "ZA_PENDING_IDENTITY_AND_SUBMISSIONS", "ZA_EMPTY_PERSONAL_DETAILS", "ZA_WAITING_FOR_KYC_EXTERNAL_VALIDATION", "ZA_WAITING_FOR_REVIEW_CPB_VERIFIED", "ZA_CPB_VERIFIED_REJECTED_SUBMISSION", "ZA_REJECTED_SUBMISSION_WITH_RETRY", "ZA_NEEDS_PASSPORT_VERIFICATION", "ZA_REJECTED_PASSPORT_VERIFICATION", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int BVN_COMPLETED = 305;
        public static final int BVN_UNCONFIRMED = 320;
        public static final int CONFIRMED = 340;
        public static final int DEFAULT = 0;
        public static final int IGNORE = 360;
        public static final int INIT = 300;
        public static final int NOT_SUPPORTED = 399;
        public static final int SIMPLE_KEY_UNCONFIRMED = 325;
        public static final int SIMPLE_KEY_VERIFIED = 355;
        public static final int SUBMITTED = 310;
        public static final int UNBOUND = 370;
        public static final int VERIFIED = 350;
        public static final int WAITING_FOR_BANK = 330;
        public static final int ZA_APPROVED = 400;
        public static final int ZA_CPB_VERIFIED_REJECTED_SUBMISSION = 407;
        public static final int ZA_EMPTY_IDENTITY_AND_SUBMISSIONS = 401;
        public static final int ZA_EMPTY_PERSONAL_DETAILS = 404;
        public static final int ZA_NEEDS_PASSPORT_VERIFICATION = 409;
        public static final int ZA_PENDING_IDENTITY_AND_SUBMISSIONS = 403;
        public static final int ZA_REJECTED_IDENTITY_AND_SUBMISSIONS = 402;
        public static final int ZA_REJECTED_PASSPORT_VERIFICATION = 410;
        public static final int ZA_REJECTED_SUBMISSION_WITH_RETRY = 408;
        public static final int ZA_WAITING_FOR_KYC_EXTERNAL_VALIDATION = 405;
        public static final int ZA_WAITING_FOR_REVIEW_CPB_VERIFIED = 406;

        private Companion() {
        }
    }
}
