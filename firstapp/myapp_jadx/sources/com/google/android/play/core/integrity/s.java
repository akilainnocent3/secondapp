package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import defpackage.nm0;

/* JADX INFO: loaded from: classes4.dex */
public final class s implements t {
    @Override // com.google.android.play.core.integrity.t
    public final nm0 a(Bundle bundle) {
        int i = bundle.getInt(AnalyticsEvent.BI_TRACKING_KIND_ERROR);
        if (i == 0) {
            return null;
        }
        return new StandardIntegrityException(i, bundle.getBoolean("is.error.remediable"), null);
    }
}
