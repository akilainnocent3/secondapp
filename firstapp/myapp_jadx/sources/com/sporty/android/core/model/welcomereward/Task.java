package com.sporty.android.core.model.welcomereward;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR'\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rÊ\u0001\u0002\b\u0018¨\u0006\u0017"}, d2 = {"Lcom/sporty/android/core/model/welcomereward/Task;", "", "completed", "", "type", "Lcom/sporty/android/core/model/welcomereward/NonFtdTaskType;", "<init>", "(ZLcom/sporty/android/core/model/welcomereward/NonFtdTaskType;)V", "getCompleted", "()Z", "Lcom/google/gson/annotations/SerializedName;", "value", "getType", "()Lcom/sporty/android/core/model/welcomereward/NonFtdTaskType;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class Task {

    @SerializedName("completed")
    private final boolean completed;

    @SerializedName("type")
    private final NonFtdTaskType type;

    public /* synthetic */ Task(boolean z, NonFtdTaskType nonFtdTaskType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : nonFtdTaskType);
    }

    public static /* synthetic */ Task copy$default(Task task, boolean z, NonFtdTaskType nonFtdTaskType, int i, Object obj) {
        if ((i & 1) != 0) {
            z = task.completed;
        }
        if ((i & 2) != 0) {
            nonFtdTaskType = task.type;
        }
        return task.copy(z, nonFtdTaskType);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getCompleted() {
        return this.completed;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final NonFtdTaskType getType() {
        return this.type;
    }

    public final Task copy(boolean completed, NonFtdTaskType type) {
        return new Task(completed, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Task)) {
            return false;
        }
        Task task = (Task) other;
        return this.completed == task.completed && this.type == task.type;
    }

    public final boolean getCompleted() {
        return this.completed;
    }

    public final NonFtdTaskType getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.completed) * 31;
        NonFtdTaskType nonFtdTaskType = this.type;
        return iHashCode + (nonFtdTaskType == null ? 0 : nonFtdTaskType.hashCode());
    }

    public String toString() {
        return "Task(completed=" + this.completed + ", type=" + this.type + ")";
    }

    public Task(boolean z, NonFtdTaskType nonFtdTaskType) {
        this.completed = z;
        this.type = nonFtdTaskType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Task() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }
}
