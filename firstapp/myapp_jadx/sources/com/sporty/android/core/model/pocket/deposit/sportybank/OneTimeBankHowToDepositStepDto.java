package com.sporty.android.core.model.pocket.deposit.sportybank;

import com.google.gson.annotations.SerializedName;
import defpackage.tx5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bÊ\u0001\u0002\b\u0016¨\u0006\u0015"}, d2 = {"Lcom/sporty/android/core/model/pocket/deposit/sportybank/OneTimeBankHowToDepositStepDto;", "", "title", "", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getDescription", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class OneTimeBankHowToDepositStepDto {

    @SerializedName("description")
    private final String description;

    @SerializedName("title")
    private final String title;

    public /* synthetic */ OneTimeBankHowToDepositStepDto(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public static /* synthetic */ OneTimeBankHowToDepositStepDto copy$default(OneTimeBankHowToDepositStepDto oneTimeBankHowToDepositStepDto, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oneTimeBankHowToDepositStepDto.title;
        }
        if ((i & 2) != 0) {
            str2 = oneTimeBankHowToDepositStepDto.description;
        }
        return oneTimeBankHowToDepositStepDto.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final OneTimeBankHowToDepositStepDto copy(String title, String description) {
        return new OneTimeBankHowToDepositStepDto(title, description);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OneTimeBankHowToDepositStepDto)) {
            return false;
        }
        OneTimeBankHowToDepositStepDto oneTimeBankHowToDepositStepDto = (OneTimeBankHowToDepositStepDto) other;
        return Intrinsics.g(this.title, oneTimeBankHowToDepositStepDto.title) && Intrinsics.g(this.description, oneTimeBankHowToDepositStepDto.description);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.description;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return tx5.a("OneTimeBankHowToDepositStepDto(title=", this.title, ", description=", this.description, ")");
    }

    public OneTimeBankHowToDepositStepDto(String str, String str2) {
        this.title = str;
        this.description = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OneTimeBankHowToDepositStepDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
