package com.sportybet.feature.settings;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.fragment.a;
import androidx.navigation.fragment.b;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.limits.base.limitBase.LimitsActivity;
import com.sportybet.feature.timeAlert.TimeAlertActivity;
import defpackage.bb40;
import defpackage.be00;
import defpackage.bge;
import defpackage.cae0;
import defpackage.cw;
import defpackage.djx;
import defpackage.dq7;
import defpackage.ekt;
import defpackage.ffx;
import defpackage.gfx;
import defpackage.ghx;
import defpackage.haw;
import defpackage.hl80;
import defpackage.id;
import defpackage.ihx;
import defpackage.j84;
import defpackage.jd;
import defpackage.jq40;
import defpackage.lb4;
import defpackage.ncb;
import defpackage.o2g;
import defpackage.om3;
import defpackage.pa4;
import defpackage.pxf;
import defpackage.swf;
import defpackage.t64;
import defpackage.to20;
import defpackage.u2m;
import defpackage.w64;
import defpackage.wk;
import defpackage.wkx;
import defpackage.xe;
import defpackage.y94;
import defpackage.yfx;
import defpackage.ygx;
import defpackage.z2f;
import defpackage.zix;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/sportybet/feature/settings/SettingsActivity;", "Lpy1;", "Lto20;", "Lcw;", "Lbb40;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class SettingsActivity extends u2m implements to20, cw, bb40 {
    public static final /* synthetic */ int c = 0;
    public bge b;

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String string;
        zix zixVar;
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (extras == null || (string = extras.getString("destination_in_settings")) == null) {
            string = "settings_route";
        }
        setContentView(xe.a(getLayoutInflater()).a);
        Fragment fragmentG = getSupportFragmentManager().G(R.id.settings_nav_host_fragment);
        yfx yfxVarA = fragmentG != null ? NavHostFragment.a.a(fragmentG) : null;
        if (yfxVarA != null) {
            ghx ghxVar = new ghx(yfxVarA.b.t, "settings_route", null);
            wkx wkxVar = ghxVar.i;
            wkxVar.getClass();
            b bVar = new b((a) wkxVar.b(wkx.a.a(a.class)), "settings_route", jq40.a(hl80.class));
            bVar.e = "Settings";
            ygx ygxVarA = bVar.a();
            ArrayList arrayList = ghxVar.m;
            arrayList.add(ygxVarA);
            ghx ghxVar2 = new ghx(wkxVar, "multi_factor_auth_route", "multi_factor_auth_navigation");
            wkx wkxVar2 = ghxVar2.i;
            wkxVar2.getClass();
            b bVar2 = new b((a) wkxVar2.b(wkx.a.a(a.class)), "multi_factor_auth_route", jq40.a(haw.class));
            bVar2.e = "MultiFactorAuthFragment";
            ygx ygxVarA2 = bVar2.a();
            ArrayList arrayList2 = ghxVar2.m;
            arrayList2.add(ygxVarA2);
            dq7 dq7VarA = jq40.a(pxf.class);
            ncb ncbVar = new ncb(1);
            o2g o2gVar = o2g.a;
            o2gVar.getClass();
            zixVar = null;
            ihx.a(ghxVar2, jq40.a(swf.class), dq7VarA, o2gVar, ncbVar);
            b bVar3 = new b((a) wkxVar2.b(wkx.a.a(a.class)), "bio_auth_entry_route", jq40.a(t64.class));
            bVar3.e = "BioAuthEntryFragment";
            arrayList2.add(bVar3.a());
            b bVar4 = new b((a) wkxVar2.b(wkx.a.a(a.class)), "bio_auth_verify_identity_route/{bio_auth_verify_identity_purpose}", jq40.a(lb4.class));
            bVar4.e = "BioAuthVerifyIdentityFragment";
            ffx.a aVar = new gfx().a;
            cae0 cae0Var = djx.o;
            aVar.a = cae0Var;
            Unit unit = Unit.a;
            bVar4.f.put("bio_auth_verify_identity_purpose", aVar.a());
            arrayList2.add(bVar4.a());
            b bVar5 = new b((a) wkxVar2.b(wkx.a.a(a.class)), "bio_auth_verification_route/{bio_auth_token}", jq40.a(y94.class));
            bVar5.e = "BioAuthVerificationFragment";
            ffx.a aVar2 = new gfx().a;
            aVar2.a = cae0Var;
            bVar5.f.put("bio_auth_token", aVar2.a());
            arrayList2.add(bVar5.a());
            b bVar6 = new b((a) wkxVar2.b(wkx.a.a(a.class)), "bio_auth_verification_successful_route/{bio_auth_verified_successful_date}", jq40.a(pa4.class));
            bVar6.e = "BioAuthVerificationSuccessfulFragment";
            ffx.a aVar3 = new gfx().a;
            ekt ektVar = djx.f;
            aVar3.a = ektVar;
            bVar6.f.put("bio_auth_verified_successful_date", aVar3.a());
            arrayList2.add(bVar6.a());
            b bVar7 = new b((a) wkxVar2.b(wkx.a.a(a.class)), "bio_auth_settings_route/{bio_auth_verified_date}/{bio_auth_settings_entry_point}", jq40.a(j84.class));
            bVar7.e = "BioAuthSettingsFragment";
            ffx.a aVar4 = new gfx().a;
            aVar4.a = ektVar;
            ffx ffxVarA = aVar4.a();
            LinkedHashMap linkedHashMap = bVar7.f;
            linkedHashMap.put("bio_auth_verified_date", ffxVarA);
            ffx.a aVar5 = new gfx().a;
            aVar5.a = ektVar;
            linkedHashMap.put("bio_auth_settings_entry_point", aVar5.a());
            arrayList2.add(bVar7.a());
            arrayList.add(ghxVar2.a());
            bge bgeVar = this.b;
            if (bgeVar == null) {
                Intrinsics.n("deviceManagementNavigator");
                throw null;
            }
            bgeVar.a(ghxVar);
            b bVar8 = new b((a) wkxVar.b(wkx.a.a(a.class)), "add_widgets_route", jq40.a(wk.class));
            bVar8.e = "Add Widgets";
            arrayList.add(bVar8.a());
            be00.b(ghxVar);
            b bVar9 = new b((a) wkxVar.b(wkx.a.a(a.class)), "betslip_customization_route", jq40.a(om3.class));
            bVar9.e = "Betslip Customization";
            arrayList.add(bVar9.a());
            id idVar = (id) wkxVar.b(wkx.a.a(id.class));
            jd jdVar = new jd(idVar, -1, "limits_route");
            jdVar.i = idVar.c;
            jdVar.e = "Limits";
            jdVar.j = jq40.a(LimitsActivity.class);
            arrayList.add(jdVar.a());
            z2f.b(ghxVar);
            id idVar2 = (id) wkxVar.b(wkx.a.a(id.class));
            jd jdVar2 = new jd(idVar2, -1, "time_alert_route");
            jdVar2.i = idVar2.c;
            jdVar2.e = "Time Alerts";
            jdVar2.j = jq40.a(TimeAlertActivity.class);
            arrayList.add(jdVar2.a());
            yfxVarA.p(ghxVar.a());
        } else {
            zixVar = null;
        }
        int iHashCode = string.hashCode();
        if (iHashCode == -1546774916) {
            if (string.equals("bio_auth_entry_route") && yfxVarA != null) {
                w64.a(yfxVarA);
                return;
            }
            return;
        }
        if (iHashCode == -42525604) {
            if (string.equals("multi_factor_auth_route") && yfxVarA != null) {
                yfx.i(yfxVarA, "multi_factor_auth_route", zixVar, 4);
                return;
            }
            return;
        }
        if (iHashCode == 1193629924 && string.equals("notification_settings_match_alert_route") && yfxVarA != null) {
            z2f.c(yfxVarA);
        }
    }
}
