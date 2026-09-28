package com.sportygames.commons.models;

import com.twilio.voice.EventKeys;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.ml5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/sportygames/commons/models/RainClaimErrorLegacyUi;", "", "<init>", "()V", "Error", "Lcom/sportygames/commons/models/RainClaimErrorLegacyUi$Error;", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class RainClaimErrorLegacyUi {
    public static final int $stable = 0;

    public /* synthetic */ RainClaimErrorLegacyUi(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private RainClaimErrorLegacyUi() {
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J8\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/sportygames/commons/models/RainClaimErrorLegacyUi$Error;", "Lcom/sportygames/commons/models/RainClaimErrorLegacyUi;", EventKeys.ERROR_MESSAGE, "", "colorRes", "", "toastType", "errorType", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;)V", "getMessage", "()Ljava/lang/String;", "getColorRes", "()I", "getToastType", "getErrorType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;)Lcom/sportygames/commons/models/RainClaimErrorLegacyUi$Error;", "equals", "", "other", "", "hashCode", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Error extends RainClaimErrorLegacyUi {
        public static final int $stable = 0;
        private final int colorRes;
        private final Integer errorType;
        private final String message;
        private final String toastType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(String str, int i, String str2, Integer num) {
            super(null);
            str.getClass();
            str2.getClass();
            this.message = str;
            this.colorRes = i;
            this.toastType = str2;
            this.errorType = num;
        }

        public static /* synthetic */ Error copy$default(Error error, String str, int i, String str2, Integer num, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = error.message;
            }
            if ((i2 & 2) != 0) {
                i = error.colorRes;
            }
            if ((i2 & 4) != 0) {
                str2 = error.toastType;
            }
            if ((i2 & 8) != 0) {
                num = error.errorType;
            }
            return error.copy(str, i, str2, num);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getColorRes() {
            return this.colorRes;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getToastType() {
            return this.toastType;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Integer getErrorType() {
            return this.errorType;
        }

        public final Error copy(String message, int colorRes, String toastType, Integer errorType) {
            message.getClass();
            toastType.getClass();
            return new Error(message, colorRes, toastType, errorType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return Intrinsics.g(this.message, error.message) && this.colorRes == error.colorRes && Intrinsics.g(this.toastType, error.toastType) && Intrinsics.g(this.errorType, error.errorType);
        }

        public final int getColorRes() {
            return this.colorRes;
        }

        public final Integer getErrorType() {
            return this.errorType;
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getToastType() {
            return this.toastType;
        }

        public int hashCode() {
            int iA = gmf0.a(gpp.a(this.colorRes, this.message.hashCode() * 31, 31), 31, this.toastType);
            Integer num = this.errorType;
            return iA + (num == null ? 0 : num.hashCode());
        }

        public String toString() {
            String str = this.message;
            int i = this.colorRes;
            String str2 = this.toastType;
            Integer num = this.errorType;
            StringBuilder sbA = ml5.a(i, "Error(message=", str, ", colorRes=", ", toastType=");
            sbA.append(str2);
            sbA.append(", errorType=");
            sbA.append(num);
            sbA.append(")");
            return sbA.toString();
        }

        public /* synthetic */ Error(String str, int i, String str2, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, (i2 & 8) != 0 ? null : num);
        }
    }
}
