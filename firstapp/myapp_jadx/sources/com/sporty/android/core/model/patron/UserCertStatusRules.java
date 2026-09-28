package com.sporty.android.core.model.patron;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007b\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/sporty/android/core/model/patron/UserCertStatusRules;", "", "<init>", "()V", "isNgNameConfirmRequired", "", AnalyticsParam.EVENT_STATUS, "", "Lkotlin/jvm/JvmStatic;", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class UserCertStatusRules {
    public static final UserCertStatusRules INSTANCE = new UserCertStatusRules();

    private UserCertStatusRules() {
    }

    public static final boolean isNgNameConfirmRequired(int status) {
        return status == 310 || status == 320;
    }
}
