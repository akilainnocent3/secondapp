package com.sporty.android.core.model.loyalty;

import defpackage.tx5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/sporty/android/core/model/loyalty/MissionTaskContent;", "", "taskCode", "", "typeDisplay", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTaskCode", "()Ljava/lang/String;", "getTypeDisplay", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class MissionTaskContent {
    private final String taskCode;
    private final String typeDisplay;

    public MissionTaskContent(String str, String str2) {
        str2.getClass();
        this.taskCode = str;
        this.typeDisplay = str2;
    }

    public static /* synthetic */ MissionTaskContent copy$default(MissionTaskContent missionTaskContent, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = missionTaskContent.taskCode;
        }
        if ((i & 2) != 0) {
            str2 = missionTaskContent.typeDisplay;
        }
        return missionTaskContent.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTaskCode() {
        return this.taskCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTypeDisplay() {
        return this.typeDisplay;
    }

    public final MissionTaskContent copy(String taskCode, String typeDisplay) {
        typeDisplay.getClass();
        return new MissionTaskContent(taskCode, typeDisplay);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MissionTaskContent)) {
            return false;
        }
        MissionTaskContent missionTaskContent = (MissionTaskContent) other;
        return Intrinsics.g(this.taskCode, missionTaskContent.taskCode) && Intrinsics.g(this.typeDisplay, missionTaskContent.typeDisplay);
    }

    public final String getTaskCode() {
        return this.taskCode;
    }

    public final String getTypeDisplay() {
        return this.typeDisplay;
    }

    public int hashCode() {
        String str = this.taskCode;
        return this.typeDisplay.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public String toString() {
        return tx5.a("MissionTaskContent(taskCode=", this.taskCode, ", typeDisplay=", this.typeDisplay, ")");
    }
}
