package com.sporty.android.core.model.loyalty;

import defpackage.tx5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/sporty/android/core/model/loyalty/MissionDetails;", "", "title", "", "typeDisplay", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getTypeDisplay", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class MissionDetails {
    private final String title;
    private final String typeDisplay;

    public MissionDetails(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.title = str;
        this.typeDisplay = str2;
    }

    public static /* synthetic */ MissionDetails copy$default(MissionDetails missionDetails, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = missionDetails.title;
        }
        if ((i & 2) != 0) {
            str2 = missionDetails.typeDisplay;
        }
        return missionDetails.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTypeDisplay() {
        return this.typeDisplay;
    }

    public final MissionDetails copy(String title, String typeDisplay) {
        title.getClass();
        typeDisplay.getClass();
        return new MissionDetails(title, typeDisplay);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MissionDetails)) {
            return false;
        }
        MissionDetails missionDetails = (MissionDetails) other;
        return Intrinsics.g(this.title, missionDetails.title) && Intrinsics.g(this.typeDisplay, missionDetails.typeDisplay);
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTypeDisplay() {
        return this.typeDisplay;
    }

    public int hashCode() {
        return this.typeDisplay.hashCode() + (this.title.hashCode() * 31);
    }

    public String toString() {
        return tx5.a("MissionDetails(title=", this.title, ", typeDisplay=", this.typeDisplay, ")");
    }
}
