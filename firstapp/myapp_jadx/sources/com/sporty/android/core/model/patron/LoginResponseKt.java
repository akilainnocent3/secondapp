package com.sporty.android.core.model.patron;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002¨\u0006\u0003"}, d2 = {"resolveLoginTimeOrNow", "", "Lcom/sporty/android/core/model/patron/LoginResponse$SelfExclusion;", "model"}, k = 2, mv = {2, 4, 0}, xi = 48)
public final class LoginResponseKt {
    public static final long resolveLoginTimeOrNow(LoginResponse.SelfExclusion selfExclusion) {
        return selfExclusion != null ? selfExclusion.resolveLoginTime() : System.currentTimeMillis();
    }
}
