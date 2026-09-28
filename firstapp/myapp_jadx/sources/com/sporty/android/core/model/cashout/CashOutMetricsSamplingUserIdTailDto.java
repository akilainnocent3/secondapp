package com.sporty.android.core.model.cashout;

import com.google.gson.annotations.SerializedName;
import defpackage.nf;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR-\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eÊ\u0001\u0002\b\u0018¨\u0006\u0017"}, d2 = {"Lcom/sporty/android/core/model/cashout/CashOutMetricsSamplingUserIdTailDto;", "", "countryCode", "", "includingUserIdTail", "", "", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getCountryCode", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getIncludingUserIdTail", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class CashOutMetricsSamplingUserIdTailDto {

    @SerializedName("countryCode")
    private final String countryCode;

    @SerializedName("includingUserIdTail")
    private final List<Integer> includingUserIdTail;

    public CashOutMetricsSamplingUserIdTailDto(String str, List<Integer> list) {
        this.countryCode = str;
        this.includingUserIdTail = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CashOutMetricsSamplingUserIdTailDto copy$default(CashOutMetricsSamplingUserIdTailDto cashOutMetricsSamplingUserIdTailDto, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cashOutMetricsSamplingUserIdTailDto.countryCode;
        }
        if ((i & 2) != 0) {
            list = cashOutMetricsSamplingUserIdTailDto.includingUserIdTail;
        }
        return cashOutMetricsSamplingUserIdTailDto.copy(str, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    public final List<Integer> component2() {
        return this.includingUserIdTail;
    }

    public final CashOutMetricsSamplingUserIdTailDto copy(String countryCode, List<Integer> includingUserIdTail) {
        return new CashOutMetricsSamplingUserIdTailDto(countryCode, includingUserIdTail);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CashOutMetricsSamplingUserIdTailDto)) {
            return false;
        }
        CashOutMetricsSamplingUserIdTailDto cashOutMetricsSamplingUserIdTailDto = (CashOutMetricsSamplingUserIdTailDto) other;
        return Intrinsics.g(this.countryCode, cashOutMetricsSamplingUserIdTailDto.countryCode) && Intrinsics.g(this.includingUserIdTail, cashOutMetricsSamplingUserIdTailDto.includingUserIdTail);
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final List<Integer> getIncludingUserIdTail() {
        return this.includingUserIdTail;
    }

    public int hashCode() {
        String str = this.countryCode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<Integer> list = this.includingUserIdTail;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return nf.b("CashOutMetricsSamplingUserIdTailDto(countryCode=", this.countryCode, ", includingUserIdTail=", ")", this.includingUserIdTail);
    }
}
