package com.sporty.android.core.model.realsports.liabilitycheck;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\bg\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u0004\u0018\u00010\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0012Ê\u0001\u0002\b\u0017¨\u0006\u0016À\u0006\u0003"}, d2 = {"Lcom/sporty/android/core/model/realsports/liabilitycheck/LiabilityCheckResultDto;", "", "typeId", "", "getTypeId", "()Ljava/lang/Integer;", "rejectedSelections", "", "Lcom/sporty/android/core/model/realsports/liabilitycheck/LiabilityCheckDto;", "getRejectedSelections", "()Ljava/util/List;", "bookingCode", "", "getBookingCode", "()Ljava/lang/String;", "allSelectionsAreFootball", "", "getAllSelectionsAreFootball", "()Ljava/lang/Boolean;", "allowMultiMaker", "getAllowMultiMaker", "isSmartRemixAvailable", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface LiabilityCheckResultDto {

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static Boolean isSmartRemixAvailable(LiabilityCheckResultDto liabilityCheckResultDto) {
            return LiabilityCheckResultDto.super.isSmartRemixAvailable();
        }
    }

    Boolean getAllSelectionsAreFootball();

    Boolean getAllowMultiMaker();

    String getBookingCode();

    List<LiabilityCheckDto> getRejectedSelections();

    Integer getTypeId();

    default Boolean isSmartRemixAvailable() {
        return null;
    }
}
