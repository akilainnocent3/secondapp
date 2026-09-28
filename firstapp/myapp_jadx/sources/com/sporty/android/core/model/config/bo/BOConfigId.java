package com.sporty.android.core.model.config.bo;

import com.sporty.android.core.model.config.bo.enums.BOConfigAppId;
import com.sporty.android.core.model.config.bo.enums.BOConfigNamespace;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/sporty/android/core/model/config/bo/BOConfigId;", "", "appId", "Lcom/sporty/android/core/model/config/bo/enums/BOConfigAppId;", "getAppId", "()Lcom/sporty/android/core/model/config/bo/enums/BOConfigAppId;", "configKey", "", "getConfigKey", "()Ljava/lang/String;", "namespace", "Lcom/sporty/android/core/model/config/bo/enums/BOConfigNamespace;", "getNamespace", "()Lcom/sporty/android/core/model/config/bo/enums/BOConfigNamespace;", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface BOConfigId {
    BOConfigAppId getAppId();

    String getConfigKey();

    BOConfigNamespace getNamespace();
}
