package com.sportybet.android.account.international.data.model;

import com.appsflyer.internal.m;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.twilio.voice.EventKeys;
import defpackage.gmf0;
import defpackage.mng;
import defpackage.mtg0;
import defpackage.nyf;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003JG\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u001c\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0083\u0004J\n\u0010\u001f\u001a\u00020 HÖ\u0081\u0004J\n\u0010!\u001a\u00020\u0003HÖ\u0081\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000fR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u001a\u0010\b\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000f\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\rÊ\u0001\f\b#\u0012\b\b$\u0012\u0004\b\u0003\u0010\u0000¨\u0006\""}, d2 = {"Lcom/sportybet/android/account/international/data/model/WalletAddressDomainModel;", "Lcom/sportybet/android/account/international/data/model/DropdownData;", EventKeys.ERROR_CODE, "", "title", "isDefault", "", "flag", "selected", AnalyticsParam.EVENT_STATUS, "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getTitle", "()Z", "getFlag", "getSelected", "setSelected", "(Z)V", "getStatus", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class WalletAddressDomainModel implements DropdownData {
    public static final int $stable = 8;
    private final String code;
    private final String flag;
    private final boolean isDefault;
    private boolean selected;
    private final String status;
    private final String title;

    public WalletAddressDomainModel(String str, String str2, boolean z, String str3, boolean z2, String str4) {
        m.a(str, str2, str4);
        this.code = str;
        this.title = str2;
        this.isDefault = z;
        this.flag = str3;
        this.selected = z2;
        this.status = str4;
    }

    public static /* synthetic */ WalletAddressDomainModel copy$default(WalletAddressDomainModel walletAddressDomainModel, String str, String str2, boolean z, String str3, boolean z2, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = walletAddressDomainModel.code;
        }
        if ((i & 2) != 0) {
            str2 = walletAddressDomainModel.title;
        }
        if ((i & 4) != 0) {
            z = walletAddressDomainModel.isDefault;
        }
        if ((i & 8) != 0) {
            str3 = walletAddressDomainModel.flag;
        }
        if ((i & 16) != 0) {
            z2 = walletAddressDomainModel.selected;
        }
        if ((i & 32) != 0) {
            str4 = walletAddressDomainModel.status;
        }
        boolean z3 = z2;
        String str5 = str4;
        return walletAddressDomainModel.copy(str, str2, z, str3, z3, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsDefault() {
        return this.isDefault;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFlag() {
        return this.flag;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    public final WalletAddressDomainModel copy(String code, String title, boolean isDefault, String flag, boolean selected, String status) {
        code.getClass();
        title.getClass();
        status.getClass();
        return new WalletAddressDomainModel(code, title, isDefault, flag, selected, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WalletAddressDomainModel)) {
            return false;
        }
        WalletAddressDomainModel walletAddressDomainModel = (WalletAddressDomainModel) other;
        return Intrinsics.g(this.code, walletAddressDomainModel.code) && Intrinsics.g(this.title, walletAddressDomainModel.title) && this.isDefault == walletAddressDomainModel.isDefault && Intrinsics.g(this.flag, walletAddressDomainModel.flag) && this.selected == walletAddressDomainModel.selected && Intrinsics.g(this.status, walletAddressDomainModel.status);
    }

    @Override // com.sportybet.android.account.international.data.model.DropdownData
    public String getCode() {
        return this.code;
    }

    @Override // com.sportybet.android.account.international.data.model.DropdownData
    public String getFlag() {
        return this.flag;
    }

    @Override // com.sportybet.android.account.international.data.model.DropdownData
    public boolean getSelected() {
        return this.selected;
    }

    public final String getStatus() {
        return this.status;
    }

    @Override // com.sportybet.android.account.international.data.model.DropdownData
    public String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iA = mtg0.a(gmf0.a(this.code.hashCode() * 31, 31, this.title), 31, this.isDefault);
        String str = this.flag;
        return this.status.hashCode() + mtg0.a((iA + (str == null ? 0 : str.hashCode())) * 31, 31, this.selected);
    }

    @Override // com.sportybet.android.account.international.data.model.DropdownData
    public boolean isDefault() {
        return this.isDefault;
    }

    @Override // com.sportybet.android.account.international.data.model.DropdownData
    public void setSelected(boolean z) {
        this.selected = z;
    }

    public String toString() {
        String str = this.code;
        String str2 = this.title;
        boolean z = this.isDefault;
        String str3 = this.flag;
        boolean z2 = this.selected;
        String str4 = this.status;
        StringBuilder sbA = ux5.a("WalletAddressDomainModel(code=", str, ", title=", str2, ", isDefault=");
        mng.a(", flag=", str3, ", selected=", sbA, z);
        return nyf.a(", status=", str4, ")", sbA, z2);
    }
}
