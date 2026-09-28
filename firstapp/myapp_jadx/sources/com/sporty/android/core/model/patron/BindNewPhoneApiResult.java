package com.sporty.android.core.model.patron;

import com.twilio.voice.EventKeys;
import defpackage.tug;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000b\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u000b\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001cÀ\u0006\u0003"}, d2 = {"Lcom/sporty/android/core/model/patron/BindNewPhoneApiResult;", "", EventKeys.ERROR_MESSAGE, "", "getMessage", "()Ljava/lang/String;", "Success", "InvalidPhoneNumber", "PhoneAlreadyRegisteredToAnotherAcc", "PhoneAlreadyBoundedToCurrentAcc", "MultiPhoneDisabled", "ReachedPhoneNumberLimit", "NameConfirmNotVerified", "NameUnverifiable", "NameMismatched", "HubtelApiFail", "UnknownError", "Lcom/sporty/android/core/model/patron/BindNewPhoneApiResult$HubtelApiFail;", "Lcom/sporty/android/core/model/patron/BindNewPhoneApiResult$InvalidPhoneNumber;", "Lcom/sporty/android/core/model/patron/BindNewPhoneApiResult$MultiPhoneDisabled;", "Lcom/sporty/android/core/model/patron/BindNewPhoneApiResult$NameConfirmNotVerified;", "Lcom/sporty/android/core/model/patron/BindNewPhoneApiResult$NameMismatched;", "Lcom/sporty/android/core/model/patron/BindNewPhoneApiResult$NameUnverifiable;", "Lcom/sporty/android/core/model/patron/BindNewPhoneApiResult$PhoneAlreadyBoundedToCurrentAcc;", "Lcom/sporty/android/core/model/patron/BindNewPhoneApiResult$PhoneAlreadyRegisteredToAnotherAcc;", "Lcom/sporty/android/core/model/patron/BindNewPhoneApiResult$ReachedPhoneNumberLimit;", "Lcom/sporty/android/core/model/patron/BindNewPhoneApiResult$Success;", "Lcom/sporty/android/core/model/patron/BindNewPhoneApiResult$UnknownError;", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface BindNewPhoneApiResult {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/sporty/android/core/model/patron/BindNewPhoneApiResult$HubtelApiFail;", "Lcom/sporty/android/core/model/patron/BindNewPhoneApiResult;", EventKeys.ERROR_MESSAGE, "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class HubtelApiFail implements BindNewPhoneApiResult {
        private final String message;

        public HubtelApiFail(String str) {
            this.message = str;
        }

        public static /* synthetic */ HubtelApiFail copy$default(HubtelApiFail hubtelApiFail, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = hubtelApiFail.message;
            }
            return hubtelApiFail.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public final HubtelApiFail copy(String message) {
            return new HubtelApiFail(message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof HubtelApiFail) && Intrinsics.g(this.message, ((HubtelApiFail) other).message);
        }

        @Override // com.sporty.android.core.model.patron.BindNewPhoneApiResult
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            String str = this.message;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return tug.a("HubtelApiFail(message=", this.message, ")");
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/sporty/android/core/model/patron/BindNewPhoneApiResult$InvalidPhoneNumber;", "Lcom/sporty/android/core/model/patron/BindNewPhoneApiResult;", EventKeys.ERROR_MESSAGE, "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class InvalidPhoneNumber implements BindNewPhoneApiResult {
        private final String message;

        public InvalidPhoneNumber(String str) {
            this.message = str;
        }

        public static /* synthetic */ InvalidPhoneNumber copy$default(InvalidPhoneNumber invalidPhoneNumber, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = invalidPhoneNumber.message;
            }
            return invalidPhoneNumber.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public final InvalidPhoneNumber copy(String message) {
            return new InvalidPhoneNumber(message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InvalidPhoneNumber) && Intrinsics.g(this.message, ((InvalidPhoneNumber) other).message);
        }

        @Override // com.sporty.android.core.model.patron.BindNewPhoneApiResult
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            String str = this.message;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return tug.a("InvalidPhoneNumber(message=", this.message, ")");
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/sporty/android/core/model/patron/BindNewPhoneApiResult$MultiPhoneDisabled;", "Lcom/sporty/android/core/model/patron/BindNewPhoneApiResult;", EventKeys.ERROR_MESSAGE, "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class MultiPhoneDisabled implements BindNewPhoneApiResult {
        private final String message;

        public MultiPhoneDisabled(String str) {
            this.message = str;
        }

        public static /* synthetic */ MultiPhoneDisabled copy$default(MultiPhoneDisabled multiPhoneDisabled, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = multiPhoneDisabled.message;
            }
            return multiPhoneDisabled.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public final MultiPhoneDisabled copy(String message) {
            return new MultiPhoneDisabled(message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MultiPhoneDisabled) && Intrinsics.g(this.message, ((MultiPhoneDisabled) other).message);
        }

        @Override // com.sporty.android.core.model.patron.BindNewPhoneApiResult
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            String str = this.message;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return tug.a("MultiPhoneDisabled(message=", this.message, ")");
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/sporty/android/core/model/patron/BindNewPhoneApiResult$NameConfirmNotVerified;", "Lcom/sporty/android/core/model/patron/BindNewPhoneApiResult;", EventKeys.ERROR_MESSAGE, "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class NameConfirmNotVerified implements BindNewPhoneApiResult {
        private final String message;

        public NameConfirmNotVerified(String str) {
            this.message = str;
        }

        public static /* synthetic */ NameConfirmNotVerified copy$default(NameConfirmNotVerified nameConfirmNotVerified, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = nameConfirmNotVerified.message;
            }
            return nameConfirmNotVerified.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public final NameConfirmNotVerified copy(String message) {
            return new NameConfirmNotVerified(message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NameConfirmNotVerified) && Intrinsics.g(this.message, ((NameConfirmNotVerified) other).message);
        }

        @Override // com.sporty.android.core.model.patron.BindNewPhoneApiResult
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            String str = this.message;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return tug.a("NameConfirmNotVerified(message=", this.message, ")");
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/sporty/android/core/model/patron/BindNewPhoneApiResult$NameMismatched;", "Lcom/sporty/android/core/model/patron/BindNewPhoneApiResult;", EventKeys.ERROR_MESSAGE, "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class NameMismatched implements BindNewPhoneApiResult {
        private final String message;

        public NameMismatched(String str) {
            this.message = str;
        }

        public static /* synthetic */ NameMismatched copy$default(NameMismatched nameMismatched, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = nameMismatched.message;
            }
            return nameMismatched.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public final NameMismatched copy(String message) {
            return new NameMismatched(message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NameMismatched) && Intrinsics.g(this.message, ((NameMismatched) other).message);
        }

        @Override // com.sporty.android.core.model.patron.BindNewPhoneApiResult
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            String str = this.message;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return tug.a("NameMismatched(message=", this.message, ")");
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/sporty/android/core/model/patron/BindNewPhoneApiResult$NameUnverifiable;", "Lcom/sporty/android/core/model/patron/BindNewPhoneApiResult;", EventKeys.ERROR_MESSAGE, "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class NameUnverifiable implements BindNewPhoneApiResult {
        private final String message;

        public NameUnverifiable(String str) {
            this.message = str;
        }

        public static /* synthetic */ NameUnverifiable copy$default(NameUnverifiable nameUnverifiable, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = nameUnverifiable.message;
            }
            return nameUnverifiable.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public final NameUnverifiable copy(String message) {
            return new NameUnverifiable(message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NameUnverifiable) && Intrinsics.g(this.message, ((NameUnverifiable) other).message);
        }

        @Override // com.sporty.android.core.model.patron.BindNewPhoneApiResult
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            String str = this.message;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return tug.a("NameUnverifiable(message=", this.message, ")");
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/sporty/android/core/model/patron/BindNewPhoneApiResult$PhoneAlreadyBoundedToCurrentAcc;", "Lcom/sporty/android/core/model/patron/BindNewPhoneApiResult;", EventKeys.ERROR_MESSAGE, "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class PhoneAlreadyBoundedToCurrentAcc implements BindNewPhoneApiResult {
        private final String message;

        public PhoneAlreadyBoundedToCurrentAcc(String str) {
            this.message = str;
        }

        public static /* synthetic */ PhoneAlreadyBoundedToCurrentAcc copy$default(PhoneAlreadyBoundedToCurrentAcc phoneAlreadyBoundedToCurrentAcc, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = phoneAlreadyBoundedToCurrentAcc.message;
            }
            return phoneAlreadyBoundedToCurrentAcc.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public final PhoneAlreadyBoundedToCurrentAcc copy(String message) {
            return new PhoneAlreadyBoundedToCurrentAcc(message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PhoneAlreadyBoundedToCurrentAcc) && Intrinsics.g(this.message, ((PhoneAlreadyBoundedToCurrentAcc) other).message);
        }

        @Override // com.sporty.android.core.model.patron.BindNewPhoneApiResult
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            String str = this.message;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return tug.a("PhoneAlreadyBoundedToCurrentAcc(message=", this.message, ")");
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/sporty/android/core/model/patron/BindNewPhoneApiResult$PhoneAlreadyRegisteredToAnotherAcc;", "Lcom/sporty/android/core/model/patron/BindNewPhoneApiResult;", EventKeys.ERROR_MESSAGE, "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class PhoneAlreadyRegisteredToAnotherAcc implements BindNewPhoneApiResult {
        private final String message;

        public PhoneAlreadyRegisteredToAnotherAcc(String str) {
            this.message = str;
        }

        public static /* synthetic */ PhoneAlreadyRegisteredToAnotherAcc copy$default(PhoneAlreadyRegisteredToAnotherAcc phoneAlreadyRegisteredToAnotherAcc, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = phoneAlreadyRegisteredToAnotherAcc.message;
            }
            return phoneAlreadyRegisteredToAnotherAcc.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public final PhoneAlreadyRegisteredToAnotherAcc copy(String message) {
            return new PhoneAlreadyRegisteredToAnotherAcc(message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PhoneAlreadyRegisteredToAnotherAcc) && Intrinsics.g(this.message, ((PhoneAlreadyRegisteredToAnotherAcc) other).message);
        }

        @Override // com.sporty.android.core.model.patron.BindNewPhoneApiResult
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            String str = this.message;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return tug.a("PhoneAlreadyRegisteredToAnotherAcc(message=", this.message, ")");
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/sporty/android/core/model/patron/BindNewPhoneApiResult$ReachedPhoneNumberLimit;", "Lcom/sporty/android/core/model/patron/BindNewPhoneApiResult;", EventKeys.ERROR_MESSAGE, "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class ReachedPhoneNumberLimit implements BindNewPhoneApiResult {
        private final String message;

        public ReachedPhoneNumberLimit(String str) {
            this.message = str;
        }

        public static /* synthetic */ ReachedPhoneNumberLimit copy$default(ReachedPhoneNumberLimit reachedPhoneNumberLimit, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = reachedPhoneNumberLimit.message;
            }
            return reachedPhoneNumberLimit.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public final ReachedPhoneNumberLimit copy(String message) {
            return new ReachedPhoneNumberLimit(message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ReachedPhoneNumberLimit) && Intrinsics.g(this.message, ((ReachedPhoneNumberLimit) other).message);
        }

        @Override // com.sporty.android.core.model.patron.BindNewPhoneApiResult
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            String str = this.message;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return tug.a("ReachedPhoneNumberLimit(message=", this.message, ")");
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/sporty/android/core/model/patron/BindNewPhoneApiResult$UnknownError;", "Lcom/sporty/android/core/model/patron/BindNewPhoneApiResult;", EventKeys.ERROR_MESSAGE, "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class UnknownError implements BindNewPhoneApiResult {
        private final String message;

        public UnknownError(String str) {
            this.message = str;
        }

        public static /* synthetic */ UnknownError copy$default(UnknownError unknownError, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = unknownError.message;
            }
            return unknownError.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public final UnknownError copy(String message) {
            return new UnknownError(message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UnknownError) && Intrinsics.g(this.message, ((UnknownError) other).message);
        }

        @Override // com.sporty.android.core.model.patron.BindNewPhoneApiResult
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            String str = this.message;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return tug.a("UnknownError(message=", this.message, ")");
        }
    }

    String getMessage();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/sporty/android/core/model/patron/BindNewPhoneApiResult$Success;", "Lcom/sporty/android/core/model/patron/BindNewPhoneApiResult;", "<init>", "()V", EventKeys.ERROR_MESSAGE, "", "getMessage", "()Ljava/lang/Void;", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Success implements BindNewPhoneApiResult {
        public static final Success INSTANCE = new Success();
        private static final Void message = null;

        private Success() {
        }

        @Override // com.sporty.android.core.model.patron.BindNewPhoneApiResult
        public /* bridge */ /* synthetic */ String getMessage() {
            return (String) m46getMessage();
        }

        /* JADX INFO: renamed from: getMessage, reason: collision with other method in class */
        public Void m46getMessage() {
            return message;
        }
    }
}
