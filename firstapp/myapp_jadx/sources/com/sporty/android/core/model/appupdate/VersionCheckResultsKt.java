package com.sporty.android.core.model.appupdate;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"isUpdatable", "", "Lcom/sporty/android/core/model/appupdate/VersionCheckResults;", "model"}, k = 2, mv = {2, 4, 0}, xi = 48)
public final class VersionCheckResultsKt {
    public static final boolean isUpdatable(VersionCheckResults versionCheckResults) {
        versionCheckResults.getClass();
        return (versionCheckResults instanceof VersionCheckResults.UpdateAvailable) || (versionCheckResults instanceof VersionCheckResults.UpdateRequired);
    }
}
