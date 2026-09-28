package com.sporty.android.core.model.notification;

import defpackage.gmf0;
import defpackage.gpp;
import defpackage.x9d;
import defpackage.zug0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0007HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\f¨\u0006\u001b"}, d2 = {"Lcom/sporty/android/core/model/notification/NotificationSetting;", "", "enabled", "", "notificationType", "", "notificationTypeDisplayName", "", "isNew", "<init>", "(ZILjava/lang/String;Z)V", "getEnabled", "()Z", "getNotificationType", "()I", "getNotificationTypeDisplayName", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "Companion", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NotificationSetting {
    public static final int NOTIFICATION_TYPE_AUTO_BET = 8;
    public static final int NOTIFICATION_TYPE_MATCH_ALERT = 1;
    public static final int NOTIFICATION_TYPE_PAYMENT = 5;
    private final boolean enabled;
    private final boolean isNew;
    private final int notificationType;
    private final String notificationTypeDisplayName;

    public NotificationSetting(boolean z, int i, String str, boolean z2) {
        str.getClass();
        this.enabled = z;
        this.notificationType = i;
        this.notificationTypeDisplayName = str;
        this.isNew = z2;
    }

    public static /* synthetic */ NotificationSetting copy$default(NotificationSetting notificationSetting, boolean z, int i, String str, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = notificationSetting.enabled;
        }
        if ((i2 & 2) != 0) {
            i = notificationSetting.notificationType;
        }
        if ((i2 & 4) != 0) {
            str = notificationSetting.notificationTypeDisplayName;
        }
        if ((i2 & 8) != 0) {
            z2 = notificationSetting.isNew;
        }
        return notificationSetting.copy(z, i, str, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getNotificationType() {
        return this.notificationType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNotificationTypeDisplayName() {
        return this.notificationTypeDisplayName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsNew() {
        return this.isNew;
    }

    public final NotificationSetting copy(boolean enabled, int notificationType, String notificationTypeDisplayName, boolean isNew) {
        notificationTypeDisplayName.getClass();
        return new NotificationSetting(enabled, notificationType, notificationTypeDisplayName, isNew);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationSetting)) {
            return false;
        }
        NotificationSetting notificationSetting = (NotificationSetting) other;
        return this.enabled == notificationSetting.enabled && this.notificationType == notificationSetting.notificationType && Intrinsics.g(this.notificationTypeDisplayName, notificationSetting.notificationTypeDisplayName) && this.isNew == notificationSetting.isNew;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final int getNotificationType() {
        return this.notificationType;
    }

    public final String getNotificationTypeDisplayName() {
        return this.notificationTypeDisplayName;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isNew) + gmf0.a(gpp.a(this.notificationType, Boolean.hashCode(this.enabled) * 31, 31), 31, this.notificationTypeDisplayName);
    }

    public final boolean isNew() {
        return this.isNew;
    }

    public String toString() {
        boolean z = this.enabled;
        int i = this.notificationType;
        return x9d.a(this.notificationTypeDisplayName, ", isNew=", ")", zug0.a("NotificationSetting(enabled=", ", notificationType=", ", notificationTypeDisplayName=", i, z), this.isNew);
    }
}
