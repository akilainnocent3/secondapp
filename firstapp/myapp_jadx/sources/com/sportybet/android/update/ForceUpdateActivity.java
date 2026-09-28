package com.sportybet.android.update;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import androidx.fragment.app.g;
import com.sporty.android.core.model.config.VersionData;
import com.sportybet.android.gp.tz.R;
import defpackage.bb40;
import defpackage.ib5;
import defpackage.jti;
import defpackage.k9j;
import defpackage.oke;
import defpackage.py1;
import defpackage.sj5;

/* JADX INFO: loaded from: classes6.dex */
public class ForceUpdateActivity extends py1 implements k9j, bb40 {
    public static final /* synthetic */ int a = 0;

    @Override // defpackage.r1k
    public final boolean onBackPressedCompat() {
        return !getIntent().getBooleanExtra("extra_allow_back", false);
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_force_update);
        Intent intent = getIntent();
        intent.getClass();
        Bundle extras = intent.getExtras();
        VersionData versionData = (VersionData) (extras != null ? sj5.a(extras, "extra_version_data", VersionData.class) : null);
        if (versionData == null || !versionData.hasNewVersionRequired("1.82.2")) {
            finish();
            return;
        }
        if (bundle == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("arg_version_data", versionData);
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            a aVarA = oke.a(supportFragmentManager, supportFragmentManager);
            aVarA.r = true;
            g gVar = aVarA.a;
            if (gVar == null) {
                ib5.a("Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()");
                return;
            }
            if (aVarA.b == null) {
                ib5.a("The FragmentManager must be attached to itshost to create a Fragment");
                return;
            }
            Fragment fragmentA = gVar.a(jti.class.getName());
            fragmentA.setArguments(bundle2);
            aVarA.e(R.id.fragment_container, fragmentA, null, 1);
            aVarA.d();
        }
    }
}
