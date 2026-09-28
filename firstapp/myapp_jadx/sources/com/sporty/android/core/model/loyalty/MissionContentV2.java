package com.sporty.android.core.model.loyalty;

import defpackage.nf;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/sporty/android/core/model/loyalty/MissionContentV2;", "", "title", "", "taskContentList", "", "Lcom/sporty/android/core/model/loyalty/MissionTaskContent;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getTaskContentList", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class MissionContentV2 {
    private final List<MissionTaskContent> taskContentList;
    private final String title;

    public MissionContentV2(String str, List<MissionTaskContent> list) {
        str.getClass();
        list.getClass();
        this.title = str;
        this.taskContentList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MissionContentV2 copy$default(MissionContentV2 missionContentV2, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = missionContentV2.title;
        }
        if ((i & 2) != 0) {
            list = missionContentV2.taskContentList;
        }
        return missionContentV2.copy(str, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<MissionTaskContent> component2() {
        return this.taskContentList;
    }

    public final MissionContentV2 copy(String title, List<MissionTaskContent> taskContentList) {
        title.getClass();
        taskContentList.getClass();
        return new MissionContentV2(title, taskContentList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MissionContentV2)) {
            return false;
        }
        MissionContentV2 missionContentV2 = (MissionContentV2) other;
        return Intrinsics.g(this.title, missionContentV2.title) && Intrinsics.g(this.taskContentList, missionContentV2.taskContentList);
    }

    public final List<MissionTaskContent> getTaskContentList() {
        return this.taskContentList;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.taskContentList.hashCode() + (this.title.hashCode() * 31);
    }

    public String toString() {
        return nf.b("MissionContentV2(title=", this.title, ", taskContentList=", ")", this.taskContentList);
    }
}
