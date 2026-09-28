package com.sporty.android.core.model.patron;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.rr1;

/* JADX INFO: loaded from: classes4.dex */
public class AccountInfoModel {

    @SerializedName("dataSource")
    public int dataSource;

    @SerializedName("email")
    public String email;
    public String errorMsg;

    @SerializedName("firstName")
    public String firstName;

    @SerializedName("lastName")
    public String lastName;

    @SerializedName(AnalyticsParam.EVENT_STATUS)
    public int status;

    @SerializedName("userId")
    public String userId;

    public AccountInfoModel(String str, String str2, String str3, int i, int i2, String str4) {
        this.firstName = str;
        this.lastName = str2;
        this.email = str3;
        this.dataSource = i;
        this.status = i2;
        this.userId = str4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NameConfirmationAccountInfo{userId='");
        sb.append(this.userId);
        sb.append("', firstName='");
        sb.append(this.firstName);
        sb.append("', lastName='");
        sb.append(this.lastName);
        sb.append("', email='");
        sb.append(this.email);
        sb.append("', dataSource=");
        sb.append(this.dataSource);
        sb.append(", status=");
        return rr1.b(sb, this.status, '}');
    }

    public AccountInfoModel(String str, String str2, String str3, int i) {
        this.firstName = str;
        this.lastName = str2;
        this.email = str3;
        this.dataSource = i;
    }

    public AccountInfoModel(int i, String str) {
        this.status = i;
        this.errorMsg = str;
    }
}
