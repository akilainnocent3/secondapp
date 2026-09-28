package com.sporty.android.core.model.captcha;

import defpackage.tug;
import defpackage.tx5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/sporty/android/core/model/captcha/CaptchaData;", "", "<init>", "()V", "Phone", "Email", "Lcom/sporty/android/core/model/captcha/CaptchaData$Email;", "Lcom/sporty/android/core/model/captcha/CaptchaData$Phone;", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class CaptchaData {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/sporty/android/core/model/captcha/CaptchaData$Email;", "Lcom/sporty/android/core/model/captcha/CaptchaData;", "email", "", "<init>", "(Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Email extends CaptchaData {
        private final String email;

        public Email(String str) {
            super(null);
            this.email = str;
        }

        public static /* synthetic */ Email copy$default(Email email, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = email.email;
            }
            return email.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        public final Email copy(String email) {
            return new Email(email);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Email) && Intrinsics.g(this.email, ((Email) other).email);
        }

        public final String getEmail() {
            return this.email;
        }

        public int hashCode() {
            String str = this.email;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return tug.a("Email(email=", this.email, ")");
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/sporty/android/core/model/captcha/CaptchaData$Phone;", "Lcom/sporty/android/core/model/captcha/CaptchaData;", "phone", "", "phoneCountryCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPhone", "()Ljava/lang/String;", "getPhoneCountryCode", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Phone extends CaptchaData {
        private final String phone;
        private final String phoneCountryCode;

        public Phone(String str, String str2) {
            super(null);
            this.phone = str;
            this.phoneCountryCode = str2;
        }

        public static /* synthetic */ Phone copy$default(Phone phone, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = phone.phone;
            }
            if ((i & 2) != 0) {
                str2 = phone.phoneCountryCode;
            }
            return phone.copy(str, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPhone() {
            return this.phone;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getPhoneCountryCode() {
            return this.phoneCountryCode;
        }

        public final Phone copy(String phone, String phoneCountryCode) {
            return new Phone(phone, phoneCountryCode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Phone)) {
                return false;
            }
            Phone phone = (Phone) other;
            return Intrinsics.g(this.phone, phone.phone) && Intrinsics.g(this.phoneCountryCode, phone.phoneCountryCode);
        }

        public final String getPhone() {
            return this.phone;
        }

        public final String getPhoneCountryCode() {
            return this.phoneCountryCode;
        }

        public int hashCode() {
            String str = this.phone;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.phoneCountryCode;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return tx5.a("Phone(phone=", this.phone, ", phoneCountryCode=", this.phoneCountryCode, ")");
        }
    }

    public /* synthetic */ CaptchaData(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CaptchaData() {
    }
}
