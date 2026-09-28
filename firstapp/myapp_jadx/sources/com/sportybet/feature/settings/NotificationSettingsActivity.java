package com.sportybet.feature.settings;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import com.sportybet.android.gp.tz.R;
import defpackage.bb40;
import defpackage.be00;
import defpackage.cyl;
import defpackage.ghx;
import defpackage.xe;
import defpackage.yfx;
import defpackage.z2f;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sportybet/feature/settings/NotificationSettingsActivity;", "Lpy1;", "Lbb40;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class NotificationSettingsActivity extends cyl implements bb40 {
    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(xe.a(getLayoutInflater()).a);
        Fragment fragmentG = getSupportFragmentManager().G(R.id.settings_nav_host_fragment);
        yfx yfxVarA = fragmentG != null ? NavHostFragment.a.a(fragmentG) : null;
        if (yfxVarA != null) {
            ghx ghxVar = new ghx(yfxVarA.b.t, "notification_settings_route", null);
            be00.b(ghxVar);
            z2f.b(ghxVar);
            yfxVarA.p(ghxVar.a());
        }
    }
}
