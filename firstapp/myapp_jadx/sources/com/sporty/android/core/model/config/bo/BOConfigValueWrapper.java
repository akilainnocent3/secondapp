package com.sporty.android.core.model.config.bo;

import com.sporty.android.core.model.config.bo.enums.BOConfigAppId;
import com.sporty.android.core.model.config.bo.enums.BOConfigNamespace;
import defpackage.ay0;
import defpackage.eal;
import defpackage.gmf0;
import defpackage.m2g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u001aJ\u0010\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u0005J\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u001dJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J3\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0014\u0010#\u001a\u00020\u00152\b\u0010$\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010%\u001a\u00020\u001aHÖ\u0081\u0004J\n\u0010&\u001a\u00020\u0005HÖ\u0081\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006'"}, d2 = {"Lcom/sporty/android/core/model/config/bo/BOConfigValueWrapper;", "Lcom/sporty/android/core/model/config/bo/BOConfigId;", "appId", "Lcom/sporty/android/core/model/config/bo/enums/BOConfigAppId;", "configKey", "", "configValue", "", "namespace", "Lcom/sporty/android/core/model/config/bo/enums/BOConfigNamespace;", "<init>", "(Lcom/sporty/android/core/model/config/bo/enums/BOConfigAppId;Ljava/lang/String;Ljava/lang/Object;Lcom/sporty/android/core/model/config/bo/enums/BOConfigNamespace;)V", "getAppId", "()Lcom/sporty/android/core/model/config/bo/enums/BOConfigAppId;", "getConfigKey", "()Ljava/lang/String;", "getConfigValue", "()Ljava/lang/Object;", "getNamespace", "()Lcom/sporty/android/core/model/config/bo/enums/BOConfigNamespace;", "configValueAsBool", "", "default", "configValueAsDouble", "", "configValueAsInt", "", "configValueAsString", "configValueAsStringList", "", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BOConfigValueWrapper implements BOConfigId {
    private final BOConfigAppId appId;
    private final String configKey;
    private final Object configValue;
    private final BOConfigNamespace namespace;

    public BOConfigValueWrapper(BOConfigAppId bOConfigAppId, String str, Object obj, BOConfigNamespace bOConfigNamespace) {
        bOConfigAppId.getClass();
        str.getClass();
        bOConfigNamespace.getClass();
        this.appId = bOConfigAppId;
        this.configKey = str;
        this.configValue = obj;
        this.namespace = bOConfigNamespace;
    }

    public static /* synthetic */ String configValueAsString$default(BOConfigValueWrapper bOConfigValueWrapper, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return bOConfigValueWrapper.configValueAsString(str);
    }

    public static /* synthetic */ BOConfigValueWrapper copy$default(BOConfigValueWrapper bOConfigValueWrapper, BOConfigAppId bOConfigAppId, String str, Object obj, BOConfigNamespace bOConfigNamespace, int i, Object obj2) {
        if ((i & 1) != 0) {
            bOConfigAppId = bOConfigValueWrapper.appId;
        }
        if ((i & 2) != 0) {
            str = bOConfigValueWrapper.configKey;
        }
        if ((i & 4) != 0) {
            obj = bOConfigValueWrapper.configValue;
        }
        if ((i & 8) != 0) {
            bOConfigNamespace = bOConfigValueWrapper.namespace;
        }
        return bOConfigValueWrapper.copy(bOConfigAppId, str, obj, bOConfigNamespace);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BOConfigAppId getAppId() {
        return this.appId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getConfigKey() {
        return this.configKey;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Object getConfigValue() {
        return this.configValue;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BOConfigNamespace getNamespace() {
        return this.namespace;
    }

    public final boolean configValueAsBool(boolean z) {
        Boolean boolR0;
        Object obj = this.configValue;
        if (obj != null) {
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue();
            }
            if ((obj instanceof String) && (boolR0 = StringsKt.r0((String) obj)) != null) {
                return boolR0.booleanValue();
            }
        }
        return z;
    }

    public final double configValueAsDouble(double d) {
        Double dH;
        Object obj = this.configValue;
        if (obj != null) {
            if (obj instanceof Double) {
                return ((Number) obj).doubleValue();
            }
            if ((obj instanceof String) && (dH = b.h((String) obj)) != null) {
                return dH.doubleValue();
            }
        }
        return d;
    }

    public final int configValueAsInt(int i) {
        Integer intOrNull;
        Object obj = this.configValue;
        if (obj != null) {
            if (obj instanceof Integer) {
                return ((Number) obj).intValue();
            }
            if ((obj instanceof String) && (intOrNull = StringsKt.toIntOrNull((String) obj)) != null) {
                return intOrNull.intValue();
            }
        }
        return i;
    }

    public final String configValueAsString(String str) {
        str.getClass();
        Object obj = this.configValue;
        return (obj != null && (obj instanceof String)) ? (String) obj : str;
    }

    public final List<String> configValueAsStringList() {
        if (this.configValue == null) {
            return m2g.a;
        }
        try {
            Object objE = new eal().e(this.configValue.toString(), String[].class);
            objE.getClass();
            return ay0.S((Object[]) objE);
        } catch (Exception unused) {
            return m2g.a;
        }
    }

    public final BOConfigValueWrapper copy(BOConfigAppId appId, String configKey, Object configValue, BOConfigNamespace namespace) {
        appId.getClass();
        configKey.getClass();
        namespace.getClass();
        return new BOConfigValueWrapper(appId, configKey, configValue, namespace);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BOConfigValueWrapper)) {
            return false;
        }
        BOConfigValueWrapper bOConfigValueWrapper = (BOConfigValueWrapper) other;
        return this.appId == bOConfigValueWrapper.appId && Intrinsics.g(this.configKey, bOConfigValueWrapper.configKey) && Intrinsics.g(this.configValue, bOConfigValueWrapper.configValue) && this.namespace == bOConfigValueWrapper.namespace;
    }

    @Override // com.sporty.android.core.model.config.bo.BOConfigId
    public BOConfigAppId getAppId() {
        return this.appId;
    }

    @Override // com.sporty.android.core.model.config.bo.BOConfigId
    public String getConfigKey() {
        return this.configKey;
    }

    public final Object getConfigValue() {
        return this.configValue;
    }

    @Override // com.sporty.android.core.model.config.bo.BOConfigId
    public BOConfigNamespace getNamespace() {
        return this.namespace;
    }

    public int hashCode() {
        int iA = gmf0.a(this.appId.hashCode() * 31, 31, this.configKey);
        Object obj = this.configValue;
        return this.namespace.hashCode() + ((iA + (obj == null ? 0 : obj.hashCode())) * 31);
    }

    public String toString() {
        return "BOConfigValueWrapper(appId=" + this.appId + ", configKey=" + this.configKey + ", configValue=" + this.configValue + ", namespace=" + this.namespace + ")";
    }
}
