package com.sporty.android.platform.features.userfeedback;

import android.os.Bundle;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import defpackage.azm;
import defpackage.bb40;
import defpackage.d0n;
import defpackage.f00;
import defpackage.k9j;
import defpackage.op8;
import defpackage.s6m;
import defpackage.tvw;
import defpackage.vgb0;
import defpackage.zn8;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/sporty/android/platform/features/userfeedback/UserFeedbackActivity;", "Lpy1;", "Lk9j;", "Lbb40;", "<init>", "()V", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class UserFeedbackActivity extends s6m implements k9j, bb40 {
    public static final /* synthetic */ int d = 0;
    public azm b;
    public d0n c;

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f00 f00Var = vgb0.a;
        vgb0.a(AnalyticsEvent.IN_APP_REVIEW_CS_SHOWN);
        zn8.a(this, new op8(613336745, new tvw(this, 3), true));
    }
}
