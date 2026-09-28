package com.sportybet.plugin.realsports.data;

import android.graphics.drawable.Drawable;
import defpackage.mq0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\f\b\u0001\u0010\u0002\u001a\u00020\u0003:\u0002\b\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u000e\u001a\u00020\bHÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\f\b\u0003\u0010\u0002\u001a\u00020\u0003:\u0002\b\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0014\u0010\u0010\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\u0002\b\u0004\u0092\u0002\u0002\b\u000b¢\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u0092\u0002\u0002\b\u000b¢\u0006\u0002\n\u0000R\u0015\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u0092\u0002\u0002\b\u000b¢\u0006\u0002\n\u0000Ê\u0001\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0015"}, d2 = {"Lcom/sportybet/plugin/realsports/data/WinStatusDisplayData;", "", "title", "", "Landroidx/annotation/StringRes;", "iconDrawable", "Landroid/graphics/drawable/Drawable;", "isNormalSettled", "", "<init>", "(ILandroid/graphics/drawable/Drawable;Z)V", "Lkotlin/jvm/JvmField;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class WinStatusDisplayData {
    public static final int $stable = 8;
    public final Drawable iconDrawable;
    public final boolean isNormalSettled;
    public final int title;

    public WinStatusDisplayData(int i, Drawable drawable, boolean z) {
        this.title = i;
        this.iconDrawable = drawable;
        this.isNormalSettled = z;
    }

    public static /* synthetic */ WinStatusDisplayData copy$default(WinStatusDisplayData winStatusDisplayData, int i, Drawable drawable, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = winStatusDisplayData.title;
        }
        if ((i2 & 2) != 0) {
            drawable = winStatusDisplayData.iconDrawable;
        }
        if ((i2 & 4) != 0) {
            z = winStatusDisplayData.isNormalSettled;
        }
        return winStatusDisplayData.copy(i, drawable, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Drawable getIconDrawable() {
        return this.iconDrawable;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsNormalSettled() {
        return this.isNormalSettled;
    }

    public final WinStatusDisplayData copy(int title, Drawable iconDrawable, boolean isNormalSettled) {
        return new WinStatusDisplayData(title, iconDrawable, isNormalSettled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WinStatusDisplayData)) {
            return false;
        }
        WinStatusDisplayData winStatusDisplayData = (WinStatusDisplayData) other;
        return this.title == winStatusDisplayData.title && Intrinsics.g(this.iconDrawable, winStatusDisplayData.iconDrawable) && this.isNormalSettled == winStatusDisplayData.isNormalSettled;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.title) * 31;
        Drawable drawable = this.iconDrawable;
        return Boolean.hashCode(this.isNormalSettled) + ((iHashCode + (drawable == null ? 0 : drawable.hashCode())) * 31);
    }

    public String toString() {
        int i = this.title;
        Drawable drawable = this.iconDrawable;
        boolean z = this.isNormalSettled;
        StringBuilder sb = new StringBuilder("WinStatusDisplayData(title=");
        sb.append(i);
        sb.append(", iconDrawable=");
        sb.append(drawable);
        sb.append(", isNormalSettled=");
        return mq0.a(sb, z, ")");
    }
}
