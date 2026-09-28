package com.sportybet.feature.luckynumber.lobby.data.dto;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.fsq;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.ng1;
import defpackage.ux5;
import defpackage.wxa;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0011J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ^\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0011J\u0010\u0010\u001e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0015J\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b&\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010\u0015R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b*\u0010\u0017R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b+\u0010\u0011R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b-\u0010\u001a¨\u0006."}, d2 = {"Lcom/sportybet/feature/luckynumber/lobby/data/dto/LNLotteryDTO;", "", "", AnalyticsParam.EVENT_PARAM_ID, "name", "categoryIsoCode", "", "tag", "Lcom/sportybet/feature/luckynumber/lobby/data/dto/LNDrawSummaryDTO;", "drawSummary", "logoUrl", "", "Lfsq;", "lotteryStreams", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/sportybet/feature/luckynumber/lobby/data/dto/LNDrawSummaryDTO;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()I", "component5", "()Lcom/sportybet/feature/luckynumber/lobby/data/dto/LNDrawSummaryDTO;", "component6", "component7", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/sportybet/feature/luckynumber/lobby/data/dto/LNDrawSummaryDTO;Ljava/lang/String;Ljava/util/List;)Lcom/sportybet/feature/luckynumber/lobby/data/dto/LNLotteryDTO;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getName", "getCategoryIsoCode", "I", "getTag", "Lcom/sportybet/feature/luckynumber/lobby/data/dto/LNDrawSummaryDTO;", "getDrawSummary", "getLogoUrl", "Ljava/util/List;", "getLotteryStreams", "luckynumber"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LNLotteryDTO {
    public static final int $stable = LNDrawSummaryDTO.$stable;

    @SerializedName("c")
    private final String categoryIsoCode;

    @SerializedName("ds")
    private final LNDrawSummaryDTO drawSummary;

    @SerializedName("i")
    private final String id;

    @SerializedName("lu")
    private final String logoUrl;

    @SerializedName("ls")
    private final List<fsq> lotteryStreams;

    @SerializedName("n")
    private final String name;

    @SerializedName("t")
    private final int tag;

    public LNLotteryDTO(String str, String str2, String str3, int i, LNDrawSummaryDTO lNDrawSummaryDTO, String str4, List<fsq> list) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        lNDrawSummaryDTO.getClass();
        list.getClass();
        this.id = str;
        this.name = str2;
        this.categoryIsoCode = str3;
        this.tag = i;
        this.drawSummary = lNDrawSummaryDTO;
        this.logoUrl = str4;
        this.lotteryStreams = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LNLotteryDTO copy$default(LNLotteryDTO lNLotteryDTO, String str, String str2, String str3, int i, LNDrawSummaryDTO lNDrawSummaryDTO, String str4, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = lNLotteryDTO.id;
        }
        if ((i2 & 2) != 0) {
            str2 = lNLotteryDTO.name;
        }
        if ((i2 & 4) != 0) {
            str3 = lNLotteryDTO.categoryIsoCode;
        }
        if ((i2 & 8) != 0) {
            i = lNLotteryDTO.tag;
        }
        if ((i2 & 16) != 0) {
            lNDrawSummaryDTO = lNLotteryDTO.drawSummary;
        }
        if ((i2 & 32) != 0) {
            str4 = lNLotteryDTO.logoUrl;
        }
        if ((i2 & 64) != 0) {
            list = lNLotteryDTO.lotteryStreams;
        }
        String str5 = str4;
        List list2 = list;
        LNDrawSummaryDTO lNDrawSummaryDTO2 = lNDrawSummaryDTO;
        String str6 = str3;
        return lNLotteryDTO.copy(str, str2, str6, i, lNDrawSummaryDTO2, str5, list2);
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
    public final int getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final LNDrawSummaryDTO getDrawSummary() {
        return this.drawSummary;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getLogoUrl() {
        return this.logoUrl;
    }

    public final List<fsq> component7() {
        return this.lotteryStreams;
    }

    public final LNLotteryDTO copy(String id, String name, String categoryIsoCode, int tag, LNDrawSummaryDTO drawSummary, String logoUrl, List<fsq> lotteryStreams) {
        id.getClass();
        name.getClass();
        categoryIsoCode.getClass();
        drawSummary.getClass();
        lotteryStreams.getClass();
        return new LNLotteryDTO(id, name, categoryIsoCode, tag, drawSummary, logoUrl, lotteryStreams);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LNLotteryDTO)) {
            return false;
        }
        LNLotteryDTO lNLotteryDTO = (LNLotteryDTO) other;
        return Intrinsics.g(this.id, lNLotteryDTO.id) && Intrinsics.g(this.name, lNLotteryDTO.name) && Intrinsics.g(this.categoryIsoCode, lNLotteryDTO.categoryIsoCode) && this.tag == lNLotteryDTO.tag && Intrinsics.g(this.drawSummary, lNLotteryDTO.drawSummary) && Intrinsics.g(this.logoUrl, lNLotteryDTO.logoUrl) && Intrinsics.g(this.lotteryStreams, lNLotteryDTO.lotteryStreams);
    }

    public final String getCategoryIsoCode() {
        return this.categoryIsoCode;
    }

    public final LNDrawSummaryDTO getDrawSummary() {
        return this.drawSummary;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLogoUrl() {
        return this.logoUrl;
    }

    public final List<fsq> getLotteryStreams() {
        return this.lotteryStreams;
    }

    public final String getName() {
        return this.name;
    }

    public final int getTag() {
        return this.tag;
    }

    public int hashCode() {
        int iHashCode = (this.drawSummary.hashCode() + gpp.a(this.tag, gmf0.a(gmf0.a(this.id.hashCode() * 31, 31, this.name), 31, this.categoryIsoCode), 31)) * 31;
        String str = this.logoUrl;
        return this.lotteryStreams.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.name;
        String str3 = this.categoryIsoCode;
        int i = this.tag;
        LNDrawSummaryDTO lNDrawSummaryDTO = this.drawSummary;
        String str4 = this.logoUrl;
        List<fsq> list = this.lotteryStreams;
        StringBuilder sbA = ux5.a("LNLotteryDTO(id=", str, ", name=", str2, ", categoryIsoCode=");
        wxa.b(i, str3, ", tag=", ", drawSummary=", sbA);
        sbA.append(lNDrawSummaryDTO);
        sbA.append(", logoUrl=");
        sbA.append(str4);
        sbA.append(", lotteryStreams=");
        return ng1.a(sbA, list, ")");
    }
}
