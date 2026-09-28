package com.sportybet.feature.luckynumber.placebet.data.data;

import defpackage.bt6;
import defpackage.gmf0;
import defpackage.ng1;
import defpackage.ux5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0007HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eÊ\u0001\u0002\b\u0019Ê\u0001\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0018"}, d2 = {"Lcom/sportybet/feature/luckynumber/placebet/data/data/LNAddMyNumberDTO;", "", "lotteryId", "", "title", "mainNumbers", "", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getLotteryId", "()Ljava/lang/String;", "getTitle", "getMainNumbers", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "luckynumber", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LNAddMyNumberDTO {
    public static final int $stable = 8;
    private final String lotteryId;
    private final List<Integer> mainNumbers;
    private final String title;

    public LNAddMyNumberDTO(String str, String str2, List<Integer> list) {
        bt6.a(str, str2, list);
        this.lotteryId = str;
        this.title = str2;
        this.mainNumbers = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LNAddMyNumberDTO copy$default(LNAddMyNumberDTO lNAddMyNumberDTO, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lNAddMyNumberDTO.lotteryId;
        }
        if ((i & 2) != 0) {
            str2 = lNAddMyNumberDTO.title;
        }
        if ((i & 4) != 0) {
            list = lNAddMyNumberDTO.mainNumbers;
        }
        return lNAddMyNumberDTO.copy(str, str2, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLotteryId() {
        return this.lotteryId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<Integer> component3() {
        return this.mainNumbers;
    }

    public final LNAddMyNumberDTO copy(String lotteryId, String title, List<Integer> mainNumbers) {
        lotteryId.getClass();
        title.getClass();
        mainNumbers.getClass();
        return new LNAddMyNumberDTO(lotteryId, title, mainNumbers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LNAddMyNumberDTO)) {
            return false;
        }
        LNAddMyNumberDTO lNAddMyNumberDTO = (LNAddMyNumberDTO) other;
        return Intrinsics.g(this.lotteryId, lNAddMyNumberDTO.lotteryId) && Intrinsics.g(this.title, lNAddMyNumberDTO.title) && Intrinsics.g(this.mainNumbers, lNAddMyNumberDTO.mainNumbers);
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
        return this.mainNumbers.hashCode() + gmf0.a(this.lotteryId.hashCode() * 31, 31, this.title);
    }

    public String toString() {
        String str = this.lotteryId;
        String str2 = this.title;
        return ng1.a(ux5.a("LNAddMyNumberDTO(lotteryId=", str, ", title=", str2, ", mainNumbers="), this.mainNumbers, ")");
    }
}
