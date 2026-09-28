package com.sporty.android.core.model.pocket.deposit.sportybank;

import com.google.gson.annotations.SerializedName;
import defpackage.nf;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR-\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eÊ\u0001\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcom/sporty/android/core/model/pocket/deposit/sportybank/OneTimeBankHowToDepositDto;", "", "header", "", "steps", "", "Lcom/sporty/android/core/model/pocket/deposit/sportybank/OneTimeBankHowToDepositStepDto;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getHeader", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getSteps", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class OneTimeBankHowToDepositDto {

    @SerializedName("header")
    private final String header;

    @SerializedName("steps")
    private final List<OneTimeBankHowToDepositStepDto> steps;

    public /* synthetic */ OneTimeBankHowToDepositDto(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OneTimeBankHowToDepositDto copy$default(OneTimeBankHowToDepositDto oneTimeBankHowToDepositDto, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oneTimeBankHowToDepositDto.header;
        }
        if ((i & 2) != 0) {
            list = oneTimeBankHowToDepositDto.steps;
        }
        return oneTimeBankHowToDepositDto.copy(str, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getHeader() {
        return this.header;
    }

    public final List<OneTimeBankHowToDepositStepDto> component2() {
        return this.steps;
    }

    public final OneTimeBankHowToDepositDto copy(String header, List<OneTimeBankHowToDepositStepDto> steps) {
        return new OneTimeBankHowToDepositDto(header, steps);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OneTimeBankHowToDepositDto)) {
            return false;
        }
        OneTimeBankHowToDepositDto oneTimeBankHowToDepositDto = (OneTimeBankHowToDepositDto) other;
        return Intrinsics.g(this.header, oneTimeBankHowToDepositDto.header) && Intrinsics.g(this.steps, oneTimeBankHowToDepositDto.steps);
    }

    public final String getHeader() {
        return this.header;
    }

    public final List<OneTimeBankHowToDepositStepDto> getSteps() {
        return this.steps;
    }

    public int hashCode() {
        String str = this.header;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<OneTimeBankHowToDepositStepDto> list = this.steps;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return nf.b("OneTimeBankHowToDepositDto(header=", this.header, ", steps=", ")", this.steps);
    }

    public OneTimeBankHowToDepositDto(String str, List<OneTimeBankHowToDepositStepDto> list) {
        this.header = str;
        this.steps = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OneTimeBankHowToDepositDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
