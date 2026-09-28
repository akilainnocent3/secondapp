package com.sporty.android.core.model.config.bo;

import defpackage.gmf0;
import defpackage.kwi;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0006HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/sporty/android/core/model/config/bo/BOConfigResponse;", "", "commonConfigDtos", "", "Lcom/sporty/android/core/model/config/bo/BOConfigValueWrapper;", "countryCode", "", "currency", "languageCode", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCommonConfigDtos", "()Ljava/util/List;", "getCountryCode", "()Ljava/lang/String;", "getCurrency", "getLanguageCode", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BOConfigResponse {
    private final List<BOConfigValueWrapper> commonConfigDtos;
    private final String countryCode;
    private final String currency;
    private final String languageCode;

    public BOConfigResponse(List<BOConfigValueWrapper> list, String str, String str2, String str3) {
        list.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.commonConfigDtos = list;
        this.countryCode = str;
        this.currency = str2;
        this.languageCode = str3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BOConfigResponse copy$default(BOConfigResponse bOConfigResponse, List list, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = bOConfigResponse.commonConfigDtos;
        }
        if ((i & 2) != 0) {
            str = bOConfigResponse.countryCode;
        }
        if ((i & 4) != 0) {
            str2 = bOConfigResponse.currency;
        }
        if ((i & 8) != 0) {
            str3 = bOConfigResponse.languageCode;
        }
        return bOConfigResponse.copy(list, str, str2, str3);
    }

    public final List<BOConfigValueWrapper> component1() {
        return this.commonConfigDtos;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLanguageCode() {
        return this.languageCode;
    }

    public final BOConfigResponse copy(List<BOConfigValueWrapper> commonConfigDtos, String countryCode, String currency, String languageCode) {
        commonConfigDtos.getClass();
        countryCode.getClass();
        currency.getClass();
        languageCode.getClass();
        return new BOConfigResponse(commonConfigDtos, countryCode, currency, languageCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BOConfigResponse)) {
            return false;
        }
        BOConfigResponse bOConfigResponse = (BOConfigResponse) other;
        return Intrinsics.g(this.commonConfigDtos, bOConfigResponse.commonConfigDtos) && Intrinsics.g(this.countryCode, bOConfigResponse.countryCode) && Intrinsics.g(this.currency, bOConfigResponse.currency) && Intrinsics.g(this.languageCode, bOConfigResponse.languageCode);
    }

    public final List<BOConfigValueWrapper> getCommonConfigDtos() {
        return this.commonConfigDtos;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getLanguageCode() {
        return this.languageCode;
    }

    public int hashCode() {
        return this.languageCode.hashCode() + gmf0.a(gmf0.a(this.commonConfigDtos.hashCode() * 31, 31, this.countryCode), 31, this.currency);
    }

    public String toString() {
        List<BOConfigValueWrapper> list = this.commonConfigDtos;
        String str = this.countryCode;
        String str2 = this.currency;
        String str3 = this.languageCode;
        StringBuilder sb = new StringBuilder("BOConfigResponse(commonConfigDtos=");
        sb.append(list);
        sb.append(", countryCode=");
        sb.append(str);
        sb.append(", currency=");
        return kwi.a(sb, str2, ", languageCode=", str3, ")");
    }
}
