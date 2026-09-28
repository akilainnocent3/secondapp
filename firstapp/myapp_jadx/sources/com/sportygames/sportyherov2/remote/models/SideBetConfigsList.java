package com.sportygames.sportyherov2.remote.models;

import com.appsflyer.internal.m;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0007\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\t\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u001eR\u001a\u0010\n\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001eR\u001a\u0010\u000b\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010\u001eR\u001a\u0010\f\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0016\"\u0004\b&\u0010\u0018R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010(\u001a\u0004\b\r\u0010'¨\u0006)"}, d2 = {"Lcom/sportygames/sportyherov2/remote/models/SideBetConfigsList;", "", AnalyticsParam.EVENT_PARAM_ID, "", "createdAt", "", "updatedAt", "minCoefficient", "", "maxCoefficient", "defaultCoefficient", "stepValue", "sideBetType", "isActive", "", "<init>", "(ILjava/lang/String;Ljava/lang/String;DDDDLjava/lang/String;Ljava/lang/Boolean;)V", "getId", "()I", "setId", "(I)V", "getCreatedAt", "()Ljava/lang/String;", "setCreatedAt", "(Ljava/lang/String;)V", "getUpdatedAt", "setUpdatedAt", "getMinCoefficient", "()D", "setMinCoefficient", "(D)V", "getMaxCoefficient", "setMaxCoefficient", "getDefaultCoefficient", "setDefaultCoefficient", "getStepValue", "setStepValue", "getSideBetType", "setSideBetType", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SideBetConfigsList {
    public static final int $stable = 8;
    private String createdAt;
    private double defaultCoefficient;
    private int id;
    private final Boolean isActive;
    private double maxCoefficient;
    private double minCoefficient;
    private String sideBetType;
    private double stepValue;
    private String updatedAt;

    public /* synthetic */ SideBetConfigsList(int i, String str, String str2, double d, double d2, double d3, double d4, String str3, Boolean bool, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, d, d2, d3, d4, str3, (i2 & 256) != 0 ? Boolean.FALSE : bool);
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final double getDefaultCoefficient() {
        return this.defaultCoefficient;
    }

    public final int getId() {
        return this.id;
    }

    public final double getMaxCoefficient() {
        return this.maxCoefficient;
    }

    public final double getMinCoefficient() {
        return this.minCoefficient;
    }

    public final String getSideBetType() {
        return this.sideBetType;
    }

    public final double getStepValue() {
        return this.stepValue;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    /* JADX INFO: renamed from: isActive, reason: from getter */
    public final Boolean getIsActive() {
        return this.isActive;
    }

    public final void setCreatedAt(String str) {
        str.getClass();
        this.createdAt = str;
    }

    public final void setDefaultCoefficient(double d) {
        this.defaultCoefficient = d;
    }

    public final void setId(int i) {
        this.id = i;
    }

    public final void setMaxCoefficient(double d) {
        this.maxCoefficient = d;
    }

    public final void setMinCoefficient(double d) {
        this.minCoefficient = d;
    }

    public final void setSideBetType(String str) {
        str.getClass();
        this.sideBetType = str;
    }

    public final void setStepValue(double d) {
        this.stepValue = d;
    }

    public final void setUpdatedAt(String str) {
        str.getClass();
        this.updatedAt = str;
    }

    public SideBetConfigsList(int i, String str, String str2, double d, double d2, double d3, double d4, String str3, Boolean bool) {
        m.a(str, str2, str3);
        this.id = i;
        this.createdAt = str;
        this.updatedAt = str2;
        this.minCoefficient = d;
        this.maxCoefficient = d2;
        this.defaultCoefficient = d3;
        this.stepValue = d4;
        this.sideBetType = str3;
        this.isActive = bool;
    }
}
