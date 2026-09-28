package com.sporty.android.core.model.pocket.deposit.sportybank;

import com.sporty.android.permission.location.KN.qUnCRF;
import defpackage.gmf0;
import defpackage.mtg0;
import defpackage.uf80;
import defpackage.uqe0;
import defpackage.uts;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003JZ\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\"J\u0014\u0010#\u001a\u00020\b2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010%\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010&\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011Ê\u0001\u0002\b(¨\u0006'"}, d2 = {"Lcom/sporty/android/core/model/pocket/deposit/sportybank/SportyBankDto;", "", "bankId", "", "displayName", "", "iconUrl", "needWithdrawFirst", "", "lastUsed", "recommended", "description", "<init>", "(ILjava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V", "getBankId", "()I", "getDisplayName", "()Ljava/lang/String;", "getIconUrl", "getNeedWithdrawFirst", "()Z", "getLastUsed", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getRecommended", "getDescription", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(ILjava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/sporty/android/core/model/pocket/deposit/sportybank/SportyBankDto;", "equals", "other", "hashCode", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SportyBankDto {
    private final int bankId;
    private final String description;
    private final String displayName;
    private final String iconUrl;
    private final Boolean lastUsed;
    private final boolean needWithdrawFirst;
    private final Boolean recommended;

    public /* synthetic */ SportyBankDto(int i, String str, String str2, boolean z, Boolean bool, Boolean bool2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, z, (i2 & 16) != 0 ? Boolean.FALSE : bool, (i2 & 32) != 0 ? null : bool2, (i2 & 64) != 0 ? null : str3);
    }

    public static /* synthetic */ SportyBankDto copy$default(SportyBankDto sportyBankDto, int i, String str, String str2, boolean z, Boolean bool, Boolean bool2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = sportyBankDto.bankId;
        }
        if ((i2 & 2) != 0) {
            str = sportyBankDto.displayName;
        }
        if ((i2 & 4) != 0) {
            str2 = sportyBankDto.iconUrl;
        }
        if ((i2 & 8) != 0) {
            z = sportyBankDto.needWithdrawFirst;
        }
        if ((i2 & 16) != 0) {
            bool = sportyBankDto.lastUsed;
        }
        if ((i2 & 32) != 0) {
            bool2 = sportyBankDto.recommended;
        }
        if ((i2 & 64) != 0) {
            str3 = sportyBankDto.description;
        }
        Boolean bool3 = bool2;
        String str4 = str3;
        Boolean bool4 = bool;
        String str5 = str2;
        return sportyBankDto.copy(i, str, str5, z, bool4, bool3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getBankId() {
        return this.bankId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getNeedWithdrawFirst() {
        return this.needWithdrawFirst;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getLastUsed() {
        return this.lastUsed;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getRecommended() {
        return this.recommended;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final SportyBankDto copy(int bankId, String displayName, String iconUrl, boolean needWithdrawFirst, Boolean lastUsed, Boolean recommended, String description) {
        displayName.getClass();
        iconUrl.getClass();
        return new SportyBankDto(bankId, displayName, iconUrl, needWithdrawFirst, lastUsed, recommended, description);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportyBankDto)) {
            return false;
        }
        SportyBankDto sportyBankDto = (SportyBankDto) other;
        return this.bankId == sportyBankDto.bankId && Intrinsics.g(this.displayName, sportyBankDto.displayName) && Intrinsics.g(this.iconUrl, sportyBankDto.iconUrl) && this.needWithdrawFirst == sportyBankDto.needWithdrawFirst && Intrinsics.g(this.lastUsed, sportyBankDto.lastUsed) && Intrinsics.g(this.recommended, sportyBankDto.recommended) && Intrinsics.g(this.description, sportyBankDto.description);
    }

    public final int getBankId() {
        return this.bankId;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final Boolean getLastUsed() {
        return this.lastUsed;
    }

    public final boolean getNeedWithdrawFirst() {
        return this.needWithdrawFirst;
    }

    public final Boolean getRecommended() {
        return this.recommended;
    }

    public int hashCode() {
        int iA = mtg0.a(gmf0.a(gmf0.a(Integer.hashCode(this.bankId) * 31, 31, this.displayName), 31, this.iconUrl), 31, this.needWithdrawFirst);
        Boolean bool = this.lastUsed;
        int iHashCode = (iA + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.recommended;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.description;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        int i = this.bankId;
        String str = this.displayName;
        String str2 = this.iconUrl;
        boolean z = this.needWithdrawFirst;
        Boolean bool = this.lastUsed;
        Boolean bool2 = this.recommended;
        String str3 = this.description;
        StringBuilder sbA = uqe0.a(i, "SportyBankDto(bankId=", ", displayName=", str, ", iconUrl=");
        uts.b(str2, ", needWithdrawFirst=", ", lastUsed=", sbA, z);
        sbA.append(bool);
        sbA.append(", recommended=");
        sbA.append(bool2);
        sbA.append(qUnCRF.DHyGTqRrDzFQHWA);
        return uf80.a(sbA, str3, ")");
    }

    public SportyBankDto(int i, String str, String str2, boolean z, Boolean bool, Boolean bool2, String str3) {
        str.getClass();
        str2.getClass();
        this.bankId = i;
        this.displayName = str;
        this.iconUrl = str2;
        this.needWithdrawFirst = z;
        this.lastUsed = bool;
        this.recommended = bool2;
        this.description = str3;
    }
}
