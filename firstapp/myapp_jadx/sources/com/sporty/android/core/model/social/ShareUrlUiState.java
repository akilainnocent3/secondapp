package com.sporty.android.core.model.social;

import defpackage.tug;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/sporty/android/core/model/social/ShareUrlUiState;", "", "<init>", "()V", "Success", "Error", "Lcom/sporty/android/core/model/social/ShareUrlUiState$Error;", "Lcom/sporty/android/core/model/social/ShareUrlUiState$Success;", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class ShareUrlUiState {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/sporty/android/core/model/social/ShareUrlUiState$Error;", "Lcom/sporty/android/core/model/social/ShareUrlUiState;", "errorMessage", "", "<init>", "(Ljava/lang/String;)V", "getErrorMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Error extends ShareUrlUiState {
        private final String errorMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(String str) {
            super(null);
            str.getClass();
            this.errorMessage = str;
        }

        public static /* synthetic */ Error copy$default(Error error, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = error.errorMessage;
            }
            return error.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public final Error copy(String errorMessage) {
            errorMessage.getClass();
            return new Error(errorMessage);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.g(this.errorMessage, ((Error) other).errorMessage);
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public int hashCode() {
            return this.errorMessage.hashCode();
        }

        public String toString() {
            return tug.a("Error(errorMessage=", this.errorMessage, ")");
        }
    }

    public /* synthetic */ ShareUrlUiState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ShareUrlUiState() {
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/sporty/android/core/model/social/ShareUrlUiState$Success;", "Lcom/sporty/android/core/model/social/ShareUrlUiState;", "sth", "", "intentType", "Lcom/sporty/android/core/model/social/ShareIntentType;", "<init>", "(Ljava/lang/String;Lcom/sporty/android/core/model/social/ShareIntentType;)V", "getSth", "()Ljava/lang/String;", "getIntentType", "()Lcom/sporty/android/core/model/social/ShareIntentType;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Success extends ShareUrlUiState {
        private final ShareIntentType intentType;
        private final String sth;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(String str, ShareIntentType shareIntentType) {
            super(null);
            str.getClass();
            this.sth = str;
            this.intentType = shareIntentType;
        }

        public static /* synthetic */ Success copy$default(Success success, String str, ShareIntentType shareIntentType, int i, Object obj) {
            if ((i & 1) != 0) {
                str = success.sth;
            }
            if ((i & 2) != 0) {
                shareIntentType = success.intentType;
            }
            return success.copy(str, shareIntentType);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getSth() {
            return this.sth;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final ShareIntentType getIntentType() {
            return this.intentType;
        }

        public final Success copy(String sth, ShareIntentType intentType) {
            sth.getClass();
            return new Success(sth, intentType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Success)) {
                return false;
            }
            Success success = (Success) other;
            return Intrinsics.g(this.sth, success.sth) && this.intentType == success.intentType;
        }

        public final ShareIntentType getIntentType() {
            return this.intentType;
        }

        public final String getSth() {
            return this.sth;
        }

        public int hashCode() {
            int iHashCode = this.sth.hashCode() * 31;
            ShareIntentType shareIntentType = this.intentType;
            return iHashCode + (shareIntentType == null ? 0 : shareIntentType.hashCode());
        }

        public String toString() {
            return "Success(sth=" + this.sth + ", intentType=" + this.intentType + ")";
        }

        public /* synthetic */ Success(String str, ShareIntentType shareIntentType, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : shareIntentType);
        }
    }
}
