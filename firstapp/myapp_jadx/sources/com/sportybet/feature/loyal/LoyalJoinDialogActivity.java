package com.sportybet.feature.loyal;

import android.os.Bundle;
import android.view.Window;
import defpackage.hvl;
import defpackage.op8;
import defpackage.rlf;
import defpackage.ym6;
import defpackage.zn8;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sportybet/feature/loyal/LoyalJoinDialogActivity;", "Lpy1;", "Lrlf;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class LoyalJoinDialogActivity extends hvl implements rlf {
    public static final /* synthetic */ int b = 0;

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zn8.a(this, new op8(-300316954, new ym6(this, 1), true));
    }

    @Override // defpackage.r1k, defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onStart() {
        super.onStart();
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
    }
}
