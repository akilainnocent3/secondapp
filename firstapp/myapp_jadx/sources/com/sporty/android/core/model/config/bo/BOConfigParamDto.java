package com.sporty.android.core.model.config.bo;

import com.sporty.android.core.model.config.bo.enums.BOConfigAppId;
import com.sporty.android.core.model.config.bo.enums.BOConfigNamespace;
import defpackage.gmf0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0014\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0083\u0004J\n\u0010\u001d\u001a\u00020\u001eHÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020\u0007HÖ\u0081\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/sporty/android/core/model/config/bo/BOConfigParamDto;", "Lcom/sporty/android/core/model/config/bo/IBOConfigParam;", "appId", "Lcom/sporty/android/core/model/config/bo/enums/BOConfigAppId;", "namespace", "Lcom/sporty/android/core/model/config/bo/enums/BOConfigNamespace;", "configKey", "", "deserializeOption", "Lcom/sporty/android/core/model/config/bo/BOConfigDeserializeOption;", "<init>", "(Lcom/sporty/android/core/model/config/bo/enums/BOConfigAppId;Lcom/sporty/android/core/model/config/bo/enums/BOConfigNamespace;Ljava/lang/String;Lcom/sporty/android/core/model/config/bo/BOConfigDeserializeOption;)V", "getAppId", "()Lcom/sporty/android/core/model/config/bo/enums/BOConfigAppId;", "getNamespace", "()Lcom/sporty/android/core/model/config/bo/enums/BOConfigNamespace;", "getConfigKey", "()Ljava/lang/String;", "getDeserializeOption", "()Lcom/sporty/android/core/model/config/bo/BOConfigDeserializeOption;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BOConfigParamDto implements IBOConfigParam {
    private final BOConfigAppId appId;
    private final String configKey;
    private final transient BOConfigDeserializeOption deserializeOption;
    private final BOConfigNamespace namespace;

    public BOConfigParamDto(BOConfigAppId bOConfigAppId, BOConfigNamespace bOConfigNamespace, String str, BOConfigDeserializeOption bOConfigDeserializeOption) {
        bOConfigAppId.getClass();
        bOConfigNamespace.getClass();
        str.getClass();
        bOConfigDeserializeOption.getClass();
        this.appId = bOConfigAppId;
        this.namespace = bOConfigNamespace;
        this.configKey = str;
        this.deserializeOption = bOConfigDeserializeOption;
    }

    public static /* synthetic */ BOConfigParamDto copy$default(BOConfigParamDto bOConfigParamDto, BOConfigAppId bOConfigAppId, BOConfigNamespace bOConfigNamespace, String str, BOConfigDeserializeOption bOConfigDeserializeOption, int i, Object obj) {
        if ((i & 1) != 0) {
            bOConfigAppId = bOConfigParamDto.appId;
        }
        if ((i & 2) != 0) {
            bOConfigNamespace = bOConfigParamDto.namespace;
        }
        if ((i & 4) != 0) {
            str = bOConfigParamDto.configKey;
        }
        if ((i & 8) != 0) {
            bOConfigDeserializeOption = bOConfigParamDto.deserializeOption;
        }
        return bOConfigParamDto.copy(bOConfigAppId, bOConfigNamespace, str, bOConfigDeserializeOption);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BOConfigAppId getAppId() {
        return this.appId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BOConfigNamespace getNamespace() {
        return this.namespace;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getConfigKey() {
        return this.configKey;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BOConfigDeserializeOption getDeserializeOption() {
        return this.deserializeOption;
    }

    public final BOConfigParamDto copy(BOConfigAppId appId, BOConfigNamespace namespace, String configKey, BOConfigDeserializeOption deserializeOption) {
        appId.getClass();
        namespace.getClass();
        configKey.getClass();
        deserializeOption.getClass();
        return new BOConfigParamDto(appId, namespace, configKey, deserializeOption);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BOConfigParamDto)) {
            return false;
        }
        BOConfigParamDto bOConfigParamDto = (BOConfigParamDto) other;
        return this.appId == bOConfigParamDto.appId && this.namespace == bOConfigParamDto.namespace && Intrinsics.g(this.configKey, bOConfigParamDto.configKey) && Intrinsics.g(this.deserializeOption, bOConfigParamDto.deserializeOption);
    }

    @Override // com.sporty.android.core.model.config.bo.BOConfigId
    public BOConfigAppId getAppId() {
        return this.appId;
    }

    @Override // com.sporty.android.core.model.config.bo.BOConfigId
    public String getConfigKey() {
        return this.configKey;
    }

    @Override // com.sporty.android.core.model.config.bo.BOConfigDeserializable
    public BOConfigDeserializeOption getDeserializeOption() {
        return this.deserializeOption;
    }

    @Override // com.sporty.android.core.model.config.bo.BOConfigId
    public BOConfigNamespace getNamespace() {
        return this.namespace;
    }

    public int hashCode() {
        return this.deserializeOption.hashCode() + gmf0.a((this.namespace.hashCode() + (this.appId.hashCode() * 31)) * 31, 31, this.configKey);
    }

    public String toString() {
        return "BOConfigParamDto(appId=" + this.appId + ", namespace=" + this.namespace + ", configKey=" + this.configKey + ", deserializeOption=" + this.deserializeOption + ")";
    }

    public /* synthetic */ BOConfigParamDto(BOConfigAppId bOConfigAppId, BOConfigNamespace bOConfigNamespace, String str, BOConfigDeserializeOption bOConfigDeserializeOption, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bOConfigAppId, bOConfigNamespace, str, (i & 8) != 0 ? BOConfigDeserializeOption.Primitive.INSTANCE : bOConfigDeserializeOption);
    }
}
