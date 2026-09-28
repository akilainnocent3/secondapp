package com.sportybet.plugin.realsports.activities;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.fragment.a;
import androidx.navigation.fragment.b;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.home.MainActivity;
import defpackage.dq7;
import defpackage.erl;
import defpackage.fc50;
import defpackage.ghx;
import defpackage.jq40;
import defpackage.lit;
import defpackage.nnh;
import defpackage.o2g;
import defpackage.phx;
import defpackage.pnh;
import defpackage.qb50;
import defpackage.wkx;
import defpackage.ygx;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sportybet/plugin/realsports/activities/ForcedPasswordResetActivity;", "Lpy1;", "Llit;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ForcedPasswordResetActivity extends erl implements lit {
    public static final /* synthetic */ int b = 0;

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_forced_password_reset);
        Fragment fragmentG = getSupportFragmentManager().G(R.id.forced_password_reset_nav_host);
        fragmentG.getClass();
        phx phxVarJ0 = ((NavHostFragment) fragmentG).j0();
        nnh nnhVar = new nnh(false, false, getString(R.string.my_account__force_reset_password_title), getString(R.string.my_account__force_reset_password_body));
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        ghx ghxVar = new ghx(phxVarJ0.b.t, nnhVar, (dq7) null, o2gVar);
        wkx wkxVar = ghxVar.i;
        wkxVar.getClass();
        a aVar = (a) wkxVar.b(wkx.a.a(a.class));
        dq7 dq7VarA = jq40.a(nnh.class);
        dq7 dq7VarA2 = jq40.a(pnh.class);
        b bVar = new b(aVar, dq7VarA, o2gVar);
        bVar.i = dq7VarA2;
        bVar.e = "FindAccountFragment";
        ygx ygxVarA = bVar.a();
        ArrayList arrayList = ghxVar.m;
        arrayList.add(ygxVarA);
        a aVar2 = (a) wkxVar.b(wkx.a.a(a.class));
        dq7 dq7VarA3 = jq40.a(qb50.class);
        dq7 dq7VarA4 = jq40.a(fc50.class);
        b bVar2 = new b(aVar2, dq7VarA3, o2gVar);
        bVar2.i = dq7VarA4;
        bVar2.e = "ResetPasswordFragment";
        arrayList.add(bVar2.a());
        phxVarJ0.p(ghxVar.a());
        getAccountHelper().addLoginEventListener(this);
    }

    @Override // defpackage.py1, defpackage.hrl, defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        getAccountHelper().removeLoginEventListener(this);
    }

    @Override // defpackage.lit
    public final void onLogin() {
        Intent intent = new Intent(this, (Class<?>) MainActivity.class);
        intent.addFlags(268468224);
        startActivity(intent);
        finish();
    }
}
