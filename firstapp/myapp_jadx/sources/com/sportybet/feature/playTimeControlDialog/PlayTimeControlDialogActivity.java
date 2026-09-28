package com.sportybet.feature.playTimeControlDialog;

import android.os.Bundle;
import androidx.compose.ui.platform.ComposeView;
import com.sportybet.android.gp.tz.R;
import defpackage.cw;
import defpackage.d0n;
import defpackage.dm10;
import defpackage.gh5;
import defpackage.op8;
import defpackage.u6i0;
import defpackage.yzl;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sportybet/feature/playTimeControlDialog/PlayTimeControlDialogActivity;", "Lty1;", "Lcw;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class PlayTimeControlDialogActivity extends yzl implements cw {
    public static final /* synthetic */ int c = 0;
    public d0n b;

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_play_time_control_dialog);
        ComposeView composeView = (ComposeView) findViewById(R.id.compose_view);
        int i = 1;
        if (composeView != null) {
            composeView.setViewCompositionStrategy(u6i0.c.a);
            composeView.setContent(new op8(-632523066, new gh5(this, i), true));
        }
        getOnBackPressedDispatcher().a(this, new dm10(true));
    }
}
