package com.sporty.android.core.model.welcomereward;

import com.google.gson.annotations.SerializedName;
import defpackage.ai50;
import defpackage.m2g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0003J?\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0014\u0010\u001b\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001d\u001a\u00020\u001eHÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020 HÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR+\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R+\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R'\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015Ê\u0001\u0002\b\"¨\u0006!"}, d2 = {"Lcom/sporty/android/core/model/welcomereward/NonFtdEngagement;", "", "enabled", "", "tasks", "", "Lcom/sporty/android/core/model/welcomereward/Task;", "rewards", "Lcom/sporty/android/core/model/welcomereward/Reward;", "uiConfig", "Lcom/sporty/android/core/model/welcomereward/UiConfig;", "<init>", "(ZLjava/util/List;Ljava/util/List;Lcom/sporty/android/core/model/welcomereward/UiConfig;)V", "getEnabled", "()Z", "Lcom/google/gson/annotations/SerializedName;", "value", "getTasks", "()Ljava/util/List;", "getRewards", "getUiConfig", "()Lcom/sporty/android/core/model/welcomereward/UiConfig;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NonFtdEngagement {

    @SerializedName("enabled")
    private final boolean enabled;

    @SerializedName("rewards")
    private final List<Reward> rewards;

    @SerializedName("tasks")
    private final List<Task> tasks;

    @SerializedName("uiConfig")
    private final UiConfig uiConfig;

    public NonFtdEngagement(boolean z, List list, List list2, UiConfig uiConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? m2g.a : list, (i & 4) != 0 ? m2g.a : list2, (i & 8) != 0 ? null : uiConfig);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NonFtdEngagement copy$default(NonFtdEngagement nonFtdEngagement, boolean z, List list, List list2, UiConfig uiConfig, int i, Object obj) {
        if ((i & 1) != 0) {
            z = nonFtdEngagement.enabled;
        }
        if ((i & 2) != 0) {
            list = nonFtdEngagement.tasks;
        }
        if ((i & 4) != 0) {
            list2 = nonFtdEngagement.rewards;
        }
        if ((i & 8) != 0) {
            uiConfig = nonFtdEngagement.uiConfig;
        }
        return nonFtdEngagement.copy(z, list, list2, uiConfig);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    public final List<Task> component2() {
        return this.tasks;
    }

    public final List<Reward> component3() {
        return this.rewards;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final UiConfig getUiConfig() {
        return this.uiConfig;
    }

    public final NonFtdEngagement copy(boolean enabled, List<Task> tasks, List<Reward> rewards, UiConfig uiConfig) {
        tasks.getClass();
        rewards.getClass();
        return new NonFtdEngagement(enabled, tasks, rewards, uiConfig);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NonFtdEngagement)) {
            return false;
        }
        NonFtdEngagement nonFtdEngagement = (NonFtdEngagement) other;
        return this.enabled == nonFtdEngagement.enabled && Intrinsics.g(this.tasks, nonFtdEngagement.tasks) && Intrinsics.g(this.rewards, nonFtdEngagement.rewards) && Intrinsics.g(this.uiConfig, nonFtdEngagement.uiConfig);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final List<Reward> getRewards() {
        return this.rewards;
    }

    public final List<Task> getTasks() {
        return this.tasks;
    }

    public final UiConfig getUiConfig() {
        return this.uiConfig;
    }

    public int hashCode() {
        int iA = ai50.a(ai50.a(Boolean.hashCode(this.enabled) * 31, 31, this.tasks), 31, this.rewards);
        UiConfig uiConfig = this.uiConfig;
        return iA + (uiConfig == null ? 0 : uiConfig.hashCode());
    }

    public String toString() {
        return "NonFtdEngagement(enabled=" + this.enabled + ", tasks=" + this.tasks + ", rewards=" + this.rewards + ", uiConfig=" + this.uiConfig + ")";
    }

    public NonFtdEngagement(boolean z, List<Task> list, List<Reward> list2, UiConfig uiConfig) {
        list.getClass();
        list2.getClass();
        this.enabled = z;
        this.tasks = list;
        this.rewards = list2;
        this.uiConfig = uiConfig;
    }

    public NonFtdEngagement() {
        this(false, null, null, null, 15, null);
    }
}
