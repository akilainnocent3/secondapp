package com.sporty.android.core.model.pocket.globalpay.pix;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.gmf0;
import defpackage.hxa;
import defpackage.kwi;
import defpackage.qn4;
import defpackage.uqe0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001e\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006 "}, d2 = {"Lcom/sporty/android/core/model/pocket/globalpay/pix/PixBankAccount;", "", AnalyticsParam.EVENT_PARAM_ID, "", "ispb", "", "branch", "accountId", "accountType", AnalyticsParam.EVENT_STATUS, "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()I", "getIspb", "()Ljava/lang/String;", "getBranch", "getAccountId", "getAccountType", "getStatus", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class PixBankAccount {
    private final String accountId;
    private final String accountType;
    private final String branch;
    private final int id;
    private final String ispb;
    private final String status;

    public PixBankAccount(int i, String str, String str2, String str3, String str4, String str5) {
        qn4.b(str, str2, str3, str4, str5);
        this.id = i;
        this.ispb = str;
        this.branch = str2;
        this.accountId = str3;
        this.accountType = str4;
        this.status = str5;
    }

    public static /* synthetic */ PixBankAccount copy$default(PixBankAccount pixBankAccount, int i, String str, String str2, String str3, String str4, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = pixBankAccount.id;
        }
        if ((i2 & 2) != 0) {
            str = pixBankAccount.ispb;
        }
        if ((i2 & 4) != 0) {
            str2 = pixBankAccount.branch;
        }
        if ((i2 & 8) != 0) {
            str3 = pixBankAccount.accountId;
        }
        if ((i2 & 16) != 0) {
            str4 = pixBankAccount.accountType;
        }
        if ((i2 & 32) != 0) {
            str5 = pixBankAccount.status;
        }
        String str6 = str4;
        String str7 = str5;
        return pixBankAccount.copy(i, str, str2, str3, str6, str7);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIspb() {
        return this.ispb;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBranch() {
        return this.branch;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAccountType() {
        return this.accountType;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    public final PixBankAccount copy(int id, String ispb, String branch, String accountId, String accountType, String status) {
        ispb.getClass();
        branch.getClass();
        accountId.getClass();
        accountType.getClass();
        status.getClass();
        return new PixBankAccount(id, ispb, branch, accountId, accountType, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PixBankAccount)) {
            return false;
        }
        PixBankAccount pixBankAccount = (PixBankAccount) other;
        return this.id == pixBankAccount.id && Intrinsics.g(this.ispb, pixBankAccount.ispb) && Intrinsics.g(this.branch, pixBankAccount.branch) && Intrinsics.g(this.accountId, pixBankAccount.accountId) && Intrinsics.g(this.accountType, pixBankAccount.accountType) && Intrinsics.g(this.status, pixBankAccount.status);
    }

    public final String getAccountId() {
        return this.accountId;
    }

    public final String getAccountType() {
        return this.accountType;
    }

    public final String getBranch() {
        return this.branch;
    }

    public final int getId() {
        return this.id;
    }

    public final String getIspb() {
        return this.ispb;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return this.status.hashCode() + gmf0.a(gmf0.a(gmf0.a(gmf0.a(Integer.hashCode(this.id) * 31, 31, this.ispb), 31, this.branch), 31, this.accountId), 31, this.accountType);
    }

    public String toString() {
        int i = this.id;
        String str = this.ispb;
        String str2 = this.branch;
        String str3 = this.accountId;
        String str4 = this.accountType;
        String str5 = this.status;
        StringBuilder sbA = uqe0.a(i, "PixBankAccount(id=", ", ispb=", str, ", branch=");
        hxa.c(sbA, str2, ", accountId=", str3, ", accountType=");
        return kwi.a(sbA, str4, ", status=", str5, ")");
    }
}
