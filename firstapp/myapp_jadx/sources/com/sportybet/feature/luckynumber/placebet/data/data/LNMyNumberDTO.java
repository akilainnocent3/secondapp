package com.sportybet.feature.luckynumber.placebet.data.data;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.ai50;
import defpackage.gmf0;
import defpackage.kya0;
import defpackage.uqe0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003JQ\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010 \u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010!\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010Ê\u0001\u0002\b#Ê\u0001\f\b$\u0012\b\b%\u0012\u0004\b\u0003\u0010\u0002¨\u0006\""}, d2 = {"Lcom/sportybet/feature/luckynumber/placebet/data/data/LNMyNumberDTO;", "", AnalyticsParam.EVENT_PARAM_ID, "", "lotteryId", "", "title", "mainNumbers", "", "bonusNumbers", "createTime", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "getId", "()I", "getLotteryId", "()Ljava/lang/String;", "getTitle", "getMainNumbers", "()Ljava/util/List;", "getBonusNumbers", "getCreateTime", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "luckynumber", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LNMyNumberDTO {
    public static final int $stable = 0;
    private final List<Integer> bonusNumbers;
    private final String createTime;
    private final int id;
    private final String lotteryId;
    private final List<Integer> mainNumbers;
    private final String title;

    public LNMyNumberDTO(int i, String str, String str2, List<Integer> list, List<Integer> list2, String str3) {
        str.getClass();
        str2.getClass();
        list.getClass();
        list2.getClass();
        str3.getClass();
        this.id = i;
        this.lotteryId = str;
        this.title = str2;
        this.mainNumbers = list;
        this.bonusNumbers = list2;
        this.createTime = str3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LNMyNumberDTO copy$default(LNMyNumberDTO lNMyNumberDTO, int i, String str, String str2, List list, List list2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = lNMyNumberDTO.id;
        }
        if ((i2 & 2) != 0) {
            str = lNMyNumberDTO.lotteryId;
        }
        if ((i2 & 4) != 0) {
            str2 = lNMyNumberDTO.title;
        }
        if ((i2 & 8) != 0) {
            list = lNMyNumberDTO.mainNumbers;
        }
        if ((i2 & 16) != 0) {
            list2 = lNMyNumberDTO.bonusNumbers;
        }
        if ((i2 & 32) != 0) {
            str3 = lNMyNumberDTO.createTime;
        }
        List list3 = list2;
        String str4 = str3;
        return lNMyNumberDTO.copy(i, str, str2, list, list3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLotteryId() {
        return this.lotteryId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<Integer> component4() {
        return this.mainNumbers;
    }

    public final List<Integer> component5() {
        return this.bonusNumbers;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCreateTime() {
        return this.createTime;
    }

    public final LNMyNumberDTO copy(int id, String lotteryId, String title, List<Integer> mainNumbers, List<Integer> bonusNumbers, String createTime) {
        lotteryId.getClass();
        title.getClass();
        mainNumbers.getClass();
        bonusNumbers.getClass();
        createTime.getClass();
        return new LNMyNumberDTO(id, lotteryId, title, mainNumbers, bonusNumbers, createTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LNMyNumberDTO)) {
            return false;
        }
        LNMyNumberDTO lNMyNumberDTO = (LNMyNumberDTO) other;
        return this.id == lNMyNumberDTO.id && Intrinsics.g(this.lotteryId, lNMyNumberDTO.lotteryId) && Intrinsics.g(this.title, lNMyNumberDTO.title) && Intrinsics.g(this.mainNumbers, lNMyNumberDTO.mainNumbers) && Intrinsics.g(this.bonusNumbers, lNMyNumberDTO.bonusNumbers) && Intrinsics.g(this.createTime, lNMyNumberDTO.createTime);
    }

    public final List<Integer> getBonusNumbers() {
        return this.bonusNumbers;
    }

    public final String getCreateTime() {
        return this.createTime;
    }

    public final int getId() {
        return this.id;
    }

    public final String getLotteryId() {
        return this.lotteryId;
    }

    public final List<Integer> getMainNumbers() {
        return this.mainNumbers;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.createTime.hashCode() + ai50.a(ai50.a(gmf0.a(gmf0.a(Integer.hashCode(this.id) * 31, 31, this.lotteryId), 31, this.title), 31, this.mainNumbers), 31, this.bonusNumbers);
    }

    public String toString() {
        int i = this.id;
        String str = this.lotteryId;
        String str2 = this.title;
        List<Integer> list = this.mainNumbers;
        List<Integer> list2 = this.bonusNumbers;
        String str3 = this.createTime;
        StringBuilder sbA = uqe0.a(i, "LNMyNumberDTO(id=", ", lotteryId=", str, ", title=");
        kya0.b(str2, ", mainNumbers=", ", bonusNumbers=", sbA, list);
        sbA.append(list2);
        sbA.append(", createTime=");
        sbA.append(str3);
        sbA.append(")");
        return sbA.toString();
    }
}
