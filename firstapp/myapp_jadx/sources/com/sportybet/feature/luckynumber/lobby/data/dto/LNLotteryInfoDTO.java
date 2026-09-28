package com.sportybet.feature.luckynumber.lobby.data.dto;

import com.appsflyer.internal.m;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.gmf0;
import defpackage.kwi;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nÊ\u0001\u0002\b\u001aÊ\u0001\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0019"}, d2 = {"Lcom/sportybet/feature/luckynumber/lobby/data/dto/LNLotteryInfoDTO;", "", AnalyticsParam.EVENT_PARAM_ID, "", "name", "categoryIsoCode", "logoUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "getCategoryIsoCode", "getLogoUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "luckynumber", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LNLotteryInfoDTO {
    public static final int $stable = 0;
    private final String categoryIsoCode;
    private final String id;
    private final String logoUrl;
    private final String name;

    public LNLotteryInfoDTO(String str, String str2, String str3, String str4) {
        m.a(str, str2, str3);
        this.id = str;
        this.name = str2;
        this.categoryIsoCode = str3;
        this.logoUrl = str4;
    }

    public static /* synthetic */ LNLotteryInfoDTO copy$default(LNLotteryInfoDTO lNLotteryInfoDTO, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lNLotteryInfoDTO.id;
        }
        if ((i & 2) != 0) {
            str2 = lNLotteryInfoDTO.name;
        }
        if ((i & 4) != 0) {
            str3 = lNLotteryInfoDTO.categoryIsoCode;
        }
        if ((i & 8) != 0) {
            str4 = lNLotteryInfoDTO.logoUrl;
        }
        return lNLotteryInfoDTO.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCategoryIsoCode() {
        return this.categoryIsoCode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLogoUrl() {
        return this.logoUrl;
    }

    public final LNLotteryInfoDTO copy(String id, String name, String categoryIsoCode, String logoUrl) {
        id.getClass();
        name.getClass();
        categoryIsoCode.getClass();
        return new LNLotteryInfoDTO(id, name, categoryIsoCode, logoUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LNLotteryInfoDTO)) {
            return false;
        }
        LNLotteryInfoDTO lNLotteryInfoDTO = (LNLotteryInfoDTO) other;
        return Intrinsics.g(this.id, lNLotteryInfoDTO.id) && Intrinsics.g(this.name, lNLotteryInfoDTO.name) && Intrinsics.g(this.categoryIsoCode, lNLotteryInfoDTO.categoryIsoCode) && Intrinsics.g(this.logoUrl, lNLotteryInfoDTO.logoUrl);
    }

    public final String getCategoryIsoCode() {
        return this.categoryIsoCode;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLogoUrl() {
        return this.logoUrl;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int iA = gmf0.a(gmf0.a(this.id.hashCode() * 31, 31, this.name), 31, this.categoryIsoCode);
        String str = this.logoUrl;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.id;
        String str2 = this.name;
        return kwi.a(ux5.a("LNLotteryInfoDTO(id=", str, ", name=", str2, ", categoryIsoCode="), this.categoryIsoCode, ", logoUrl=", this.logoUrl, ")");
    }
}
