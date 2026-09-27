package com.ironsource.sdk.controller;

import android.os.Bundle;
import com.ironsource.C4235d4;
import com.ironsource.sdk.utils.Logger;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class InterstitialActivity extends ControllerActivity {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f63617s = "InterstitialActivity";

    @Override // com.ironsource.sdk.controller.ControllerActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Logger.i(f63617s, "onCreate");
    }

    @Override // com.ironsource.sdk.controller.ControllerActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        Logger.i(f63617s, C4235d4.i.f61441t0);
    }

    @Override // com.ironsource.sdk.controller.ControllerActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        Logger.i(f63617s, C4235d4.i.f61443u0);
    }
}
