package com.sportybet.plugin.realsports.data;

import defpackage.f78;
import defpackage.gpp;
import defpackage.ml5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0019JP\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010&J\u0014\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010*\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010+\u001a\u00020\u0003HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000fR\u001e\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bÊ\u0001\f\b-\u0012\b\b.\u0012\u0004\b\u0003\u0010\u0000¨\u0006,"}, d2 = {"Lcom/sportybet/plugin/realsports/data/SearchRequestData;", "", "keyword", "", "offset", "", "pageSize", "sport", "keywordType", "prodId", "<init>", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getKeyword", "()Ljava/lang/String;", "setKeyword", "(Ljava/lang/String;)V", "getOffset", "()I", "setOffset", "(I)V", "getPageSize", "setPageSize", "getSport", "setSport", "getKeywordType", "()Ljava/lang/Integer;", "setKeywordType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getProdId", "setProdId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/sportybet/plugin/realsports/data/SearchRequestData;", "equals", "", "other", "hashCode", "toString", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SearchRequestData {
    public static final int $stable = 8;
    private String keyword;
    private Integer keywordType;
    private int offset;
    private int pageSize;
    private Integer prodId;
    private String sport;

    public /* synthetic */ SearchRequestData(String str, int i, int i2, String str2, Integer num, Integer num2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 20 : i2, (i3 & 8) != 0 ? null : str2, (i3 & 16) != 0 ? null : num, (i3 & 32) != 0 ? null : num2);
    }

    public static /* synthetic */ SearchRequestData copy$default(SearchRequestData searchRequestData, String str, int i, int i2, String str2, Integer num, Integer num2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = searchRequestData.keyword;
        }
        if ((i3 & 2) != 0) {
            i = searchRequestData.offset;
        }
        if ((i3 & 4) != 0) {
            i2 = searchRequestData.pageSize;
        }
        if ((i3 & 8) != 0) {
            str2 = searchRequestData.sport;
        }
        if ((i3 & 16) != 0) {
            num = searchRequestData.keywordType;
        }
        if ((i3 & 32) != 0) {
            num2 = searchRequestData.prodId;
        }
        Integer num3 = num;
        Integer num4 = num2;
        return searchRequestData.copy(str, i, i2, str2, num3, num4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKeyword() {
        return this.keyword;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getOffset() {
        return this.offset;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getPageSize() {
        return this.pageSize;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSport() {
        return this.sport;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getKeywordType() {
        return this.keywordType;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getProdId() {
        return this.prodId;
    }

    public final SearchRequestData copy(String keyword, int offset, int pageSize, String sport, Integer keywordType, Integer prodId) {
        keyword.getClass();
        return new SearchRequestData(keyword, offset, pageSize, sport, keywordType, prodId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchRequestData)) {
            return false;
        }
        SearchRequestData searchRequestData = (SearchRequestData) other;
        return Intrinsics.g(this.keyword, searchRequestData.keyword) && this.offset == searchRequestData.offset && this.pageSize == searchRequestData.pageSize && Intrinsics.g(this.sport, searchRequestData.sport) && Intrinsics.g(this.keywordType, searchRequestData.keywordType) && Intrinsics.g(this.prodId, searchRequestData.prodId);
    }

    public final String getKeyword() {
        return this.keyword;
    }

    public final Integer getKeywordType() {
        return this.keywordType;
    }

    public final int getOffset() {
        return this.offset;
    }

    public final int getPageSize() {
        return this.pageSize;
    }

    public final Integer getProdId() {
        return this.prodId;
    }

    public final String getSport() {
        return this.sport;
    }

    public int hashCode() {
        int iA = gpp.a(this.pageSize, gpp.a(this.offset, this.keyword.hashCode() * 31, 31), 31);
        String str = this.sport;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.keywordType;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.prodId;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final void setKeyword(String str) {
        str.getClass();
        this.keyword = str;
    }

    public final void setKeywordType(Integer num) {
        this.keywordType = num;
    }

    public final void setOffset(int i) {
        this.offset = i;
    }

    public final void setPageSize(int i) {
        this.pageSize = i;
    }

    public final void setProdId(Integer num) {
        this.prodId = num;
    }

    public final void setSport(String str) {
        this.sport = str;
    }

    public String toString() {
        String str = this.keyword;
        int i = this.offset;
        int i2 = this.pageSize;
        String str2 = this.sport;
        Integer num = this.keywordType;
        Integer num2 = this.prodId;
        StringBuilder sbA = ml5.a(i, "SearchRequestData(keyword=", str, ", offset=", ", pageSize=");
        f78.b(i2, ", sport=", str2, ", keywordType=", sbA);
        sbA.append(num);
        sbA.append(", prodId=");
        sbA.append(num2);
        sbA.append(")");
        return sbA.toString();
    }

    public SearchRequestData(String str, int i, int i2, String str2, Integer num, Integer num2) {
        str.getClass();
        this.keyword = str;
        this.offset = i;
        this.pageSize = i2;
        this.sport = str2;
        this.keywordType = num;
        this.prodId = num2;
    }

    public SearchRequestData() {
        this(null, 0, 0, null, null, null, 63, null);
    }
}
