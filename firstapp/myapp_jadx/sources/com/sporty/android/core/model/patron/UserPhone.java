package com.sporty.android.core.model.patron;

import defpackage.gmf0;
import defpackage.lng;
import defpackage.mtg0;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\rÊ\u0001\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcom/sporty/android/core/model/patron/UserPhone;", "", "phone", "", "phoneCountryCode", "isPrimary", "", "isDefault", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZ)V", "getPhone", "()Ljava/lang/String;", "getPhoneCountryCode", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class UserPhone {
    private final boolean isDefault;
    private final boolean isPrimary;
    private final String phone;
    private final String phoneCountryCode;

    public UserPhone(String str, String str2, boolean z, boolean z2) {
        str.getClass();
        str2.getClass();
        this.phone = str;
        this.phoneCountryCode = str2;
        this.isPrimary = z;
        this.isDefault = z2;
    }

    public static /* synthetic */ UserPhone copy$default(UserPhone userPhone, String str, String str2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userPhone.phone;
        }
        if ((i & 2) != 0) {
            str2 = userPhone.phoneCountryCode;
        }
        if ((i & 4) != 0) {
            z = userPhone.isPrimary;
        }
        if ((i & 8) != 0) {
            z2 = userPhone.isDefault;
        }
        return userPhone.copy(str, str2, z, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPhoneCountryCode() {
        return this.phoneCountryCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsPrimary() {
        return this.isPrimary;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsDefault() {
        return this.isDefault;
    }

    public final UserPhone copy(String phone, String phoneCountryCode, boolean isPrimary, boolean isDefault) {
        phone.getClass();
        phoneCountryCode.getClass();
        return new UserPhone(phone, phoneCountryCode, isPrimary, isDefault);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserPhone)) {
            return false;
        }
        UserPhone userPhone = (UserPhone) other;
        return Intrinsics.g(this.phone, userPhone.phone) && Intrinsics.g(this.phoneCountryCode, userPhone.phoneCountryCode) && this.isPrimary == userPhone.isPrimary && this.isDefault == userPhone.isDefault;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final String getPhoneCountryCode() {
        return this.phoneCountryCode;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isDefault) + mtg0.a(gmf0.a(this.phone.hashCode() * 31, 31, this.phoneCountryCode), 31, this.isPrimary);
    }

    public final boolean isDefault() {
        return this.isDefault;
    }

    public final boolean isPrimary() {
        return this.isPrimary;
    }

    public String toString() {
        String str = this.phone;
        String str2 = this.phoneCountryCode;
        return lng.a(", isDefault=", ")", ux5.a("UserPhone(phone=", str, ", phoneCountryCode=", str2, ", isPrimary="), this.isPrimary, this.isDefault);
    }
}
