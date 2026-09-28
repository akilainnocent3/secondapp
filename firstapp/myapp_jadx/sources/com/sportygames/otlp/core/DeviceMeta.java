package com.sportygames.otlp.core;

import com.appsflyer.internal.m;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.gmf0;
import defpackage.j26;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/sportygames/otlp/core/DeviceMeta;", "", AnalyticsParam.EVENT_PARAM_ID, "", "modelName", "manufacturer", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getModelName", "getManufacturer", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "logger-otlp_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DeviceMeta {
    private final String id;
    private final String manufacturer;
    private final String modelName;

    public DeviceMeta(String str, String str2, String str3) {
        m.a(str, str2, str3);
        this.id = str;
        this.modelName = str2;
        this.manufacturer = str3;
    }

    public static /* synthetic */ DeviceMeta copy$default(DeviceMeta deviceMeta, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceMeta.id;
        }
        if ((i & 2) != 0) {
            str2 = deviceMeta.modelName;
        }
        if ((i & 4) != 0) {
            str3 = deviceMeta.manufacturer;
        }
        return deviceMeta.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getModelName() {
        return this.modelName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getManufacturer() {
        return this.manufacturer;
    }

    public final DeviceMeta copy(String id, String modelName, String manufacturer) {
        id.getClass();
        modelName.getClass();
        manufacturer.getClass();
        return new DeviceMeta(id, modelName, manufacturer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceMeta)) {
            return false;
        }
        DeviceMeta deviceMeta = (DeviceMeta) other;
        return Intrinsics.g(this.id, deviceMeta.id) && Intrinsics.g(this.modelName, deviceMeta.modelName) && Intrinsics.g(this.manufacturer, deviceMeta.manufacturer);
    }

    public final String getId() {
        return this.id;
    }

    public final String getManufacturer() {
        return this.manufacturer;
    }

    public final String getModelName() {
        return this.modelName;
    }

    public int hashCode() {
        return this.manufacturer.hashCode() + gmf0.a(this.id.hashCode() * 31, 31, this.modelName);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DeviceMeta(id=");
        sb.append(this.id);
        sb.append(", modelName=");
        sb.append(this.modelName);
        sb.append(", manufacturer=");
        return j26.a(sb, this.manufacturer, ')');
    }
}
