package com.sporty.android.core.model.primaryphone;

import defpackage.tx5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bÊ\u0001\u0002\b\u0014¨\u0006\u0013"}, d2 = {"Lcom/sporty/android/core/model/primaryphone/UpdatePrimaryPhoneNumberBody;", "", "phone", "", "token", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPhone", "()Ljava/lang/String;", "getToken", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class UpdatePrimaryPhoneNumberBody {
    private final String phone;
    private final String token;

    public UpdatePrimaryPhoneNumberBody(String str, String str2) {
        str.getClass();
        this.phone = str;
        this.token = str2;
    }

    public static /* synthetic */ UpdatePrimaryPhoneNumberBody copy$default(UpdatePrimaryPhoneNumberBody updatePrimaryPhoneNumberBody, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = updatePrimaryPhoneNumberBody.phone;
        }
        if ((i & 2) != 0) {
            str2 = updatePrimaryPhoneNumberBody.token;
        }
        return updatePrimaryPhoneNumberBody.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    public final UpdatePrimaryPhoneNumberBody copy(String phone, String token) {
        phone.getClass();
        return new UpdatePrimaryPhoneNumberBody(phone, token);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdatePrimaryPhoneNumberBody)) {
            return false;
        }
        UpdatePrimaryPhoneNumberBody updatePrimaryPhoneNumberBody = (UpdatePrimaryPhoneNumberBody) other;
        return Intrinsics.g(this.phone, updatePrimaryPhoneNumberBody.phone) && Intrinsics.g(this.token, updatePrimaryPhoneNumberBody.token);
    }

    public final String getPhone() {
        return this.phone;
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        int iHashCode = this.phone.hashCode() * 31;
        String str = this.token;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return tx5.a("UpdatePrimaryPhoneNumberBody(phone=", this.phone, ", token=", this.token, ")");
    }
}
