package com.sporty.android.core.model.social;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bÊ\u0001\u0002\b\u0015¨\u0006\u0014"}, d2 = {"Lcom/sporty/android/core/model/social/CodeChatBOConfigModel;", "", "enabled", "", "minVersion", "", "<init>", "(ZLjava/lang/String;)V", "getEnabled", "()Z", "getMinVersion", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class CodeChatBOConfigModel {
    private final boolean enabled;
    private final String minVersion;

    public /* synthetic */ CodeChatBOConfigModel(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str);
    }

    public static /* synthetic */ CodeChatBOConfigModel copy$default(CodeChatBOConfigModel codeChatBOConfigModel, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = codeChatBOConfigModel.enabled;
        }
        if ((i & 2) != 0) {
            str = codeChatBOConfigModel.minVersion;
        }
        return codeChatBOConfigModel.copy(z, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMinVersion() {
        return this.minVersion;
    }

    public final CodeChatBOConfigModel copy(boolean enabled, String minVersion) {
        minVersion.getClass();
        return new CodeChatBOConfigModel(enabled, minVersion);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CodeChatBOConfigModel)) {
            return false;
        }
        CodeChatBOConfigModel codeChatBOConfigModel = (CodeChatBOConfigModel) other;
        return this.enabled == codeChatBOConfigModel.enabled && Intrinsics.g(this.minVersion, codeChatBOConfigModel.minVersion);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final String getMinVersion() {
        return this.minVersion;
    }

    public int hashCode() {
        return this.minVersion.hashCode() + (Boolean.hashCode(this.enabled) * 31);
    }

    public String toString() {
        return "CodeChatBOConfigModel(enabled=" + this.enabled + ", minVersion=" + this.minVersion + ")";
    }

    public CodeChatBOConfigModel(boolean z, String str) {
        str.getClass();
        this.enabled = z;
        this.minVersion = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CodeChatBOConfigModel() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }
}
