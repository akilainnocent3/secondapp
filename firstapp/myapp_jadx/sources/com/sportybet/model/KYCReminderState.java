package com.sportybet.model;

import com.sporty.android.core.model.patron.KYCReminder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/sportybet/model/KYCReminderState;", "", "Success", "Failure", "Loading", "Lcom/sportybet/model/KYCReminderState$Failure;", "Lcom/sportybet/model/KYCReminderState$Loading;", "Lcom/sportybet/model/KYCReminderState$Success;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface KYCReminderState {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004Ê\u0001\f\b\r\u0012\b\b\u000e\u0012\u0004\b\u0003\u0010\u0002¨\u0006\f"}, d2 = {"Lcom/sportybet/model/KYCReminderState$Failure;", "Lcom/sportybet/model/KYCReminderState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Failure implements KYCReminderState {
        public static final int $stable = 0;
        public static final Failure INSTANCE = new Failure();

        private Failure() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Failure);
        }

        public int hashCode() {
            return -362972070;
        }

        public String toString() {
            return "Failure";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004Ê\u0001\f\b\r\u0012\b\b\u000e\u0012\u0004\b\u0003\u0010\u0002¨\u0006\f"}, d2 = {"Lcom/sportybet/model/KYCReminderState$Loading;", "Lcom/sportybet/model/KYCReminderState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Loading implements KYCReminderState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 1060252684;
        }

        public String toString() {
            return "Loading";
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007Ê\u0001\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0012"}, d2 = {"Lcom/sportybet/model/KYCReminderState$Success;", "Lcom/sportybet/model/KYCReminderState;", "kycReminder", "Lcom/sporty/android/core/model/patron/KYCReminder;", "<init>", "(Lcom/sporty/android/core/model/patron/KYCReminder;)V", "getKycReminder", "()Lcom/sporty/android/core/model/patron/KYCReminder;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Success implements KYCReminderState {
        public static final int $stable = 8;
        private final KYCReminder kycReminder;

        public Success(KYCReminder kYCReminder) {
            kYCReminder.getClass();
            this.kycReminder = kYCReminder;
        }

        public static /* synthetic */ Success copy$default(Success success, KYCReminder kYCReminder, int i, Object obj) {
            if ((i & 1) != 0) {
                kYCReminder = success.kycReminder;
            }
            return success.copy(kYCReminder);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final KYCReminder getKycReminder() {
            return this.kycReminder;
        }

        public final Success copy(KYCReminder kycReminder) {
            kycReminder.getClass();
            return new Success(kycReminder);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.g(this.kycReminder, ((Success) other).kycReminder);
        }

        public final KYCReminder getKycReminder() {
            return this.kycReminder;
        }

        public int hashCode() {
            return this.kycReminder.hashCode();
        }

        public String toString() {
            return "Success(kycReminder=" + this.kycReminder + ")";
        }
    }
}
