package com.sporty.android.core.model.pocket.deposit;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0017\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019Ê\u0001\u0002\b\u001b¨\u0006\u001a"}, d2 = {"Lcom/sporty/android/core/model/pocket/deposit/DepositAlertConfigDto;", "", "payChannelId", "", "displayAlert", "", "displayCreditDelaysHint", "alertContent", "", "displayMaintenanceAlert", "placeholderValues", "Lcom/sporty/android/core/model/pocket/deposit/PlaceholderValuesDto;", "<init>", "(Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Lcom/sporty/android/core/model/pocket/deposit/PlaceholderValuesDto;)V", "getPayChannelId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDisplayAlert", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDisplayCreditDelaysHint", "getAlertContent", "()Ljava/lang/String;", "getDisplayMaintenanceAlert", "getPlaceholderValues", "()Lcom/sporty/android/core/model/pocket/deposit/PlaceholderValuesDto;", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class DepositAlertConfigDto {
    private final String alertContent;
    private final Boolean displayAlert;
    private final Boolean displayCreditDelaysHint;
    private final Boolean displayMaintenanceAlert;
    private final Integer payChannelId;
    private final PlaceholderValuesDto placeholderValues;

    public DepositAlertConfigDto(Integer num, Boolean bool, Boolean bool2, String str, Boolean bool3, PlaceholderValuesDto placeholderValuesDto) {
        this.payChannelId = num;
        this.displayAlert = bool;
        this.displayCreditDelaysHint = bool2;
        this.alertContent = str;
        this.displayMaintenanceAlert = bool3;
        this.placeholderValues = placeholderValuesDto;
    }

    public final String getAlertContent() {
        return this.alertContent;
    }

    public final Boolean getDisplayAlert() {
        return this.displayAlert;
    }

    public final Boolean getDisplayCreditDelaysHint() {
        return this.displayCreditDelaysHint;
    }

    public final Boolean getDisplayMaintenanceAlert() {
        return this.displayMaintenanceAlert;
    }

    public final Integer getPayChannelId() {
        return this.payChannelId;
    }

    public final PlaceholderValuesDto getPlaceholderValues() {
        return this.placeholderValues;
    }
}
