package com.sportybet.feature.profile;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.fragment.a;
import androidx.navigation.fragment.b;
import com.sportybet.android.gp.tz.R;
import defpackage.bb40;
import defpackage.bmy;
import defpackage.bs20;
import defpackage.cae0;
import defpackage.d030;
import defpackage.djx;
import defpackage.dq7;
import defpackage.ds20;
import defpackage.ffx;
import defpackage.gfx;
import defpackage.ghx;
import defpackage.gz20;
import defpackage.h5e;
import defpackage.ihx;
import defpackage.iv20;
import defpackage.jq40;
import defpackage.ju20;
import defpackage.k9j;
import defpackage.kpu;
import defpackage.kt20;
import defpackage.ncb;
import defpackage.o2g;
import defpackage.or20;
import defpackage.pve;
import defpackage.pxf;
import defpackage.qve;
import defpackage.swf;
import defpackage.to20;
import defpackage.v0m;
import defpackage.wkx;
import defpackage.xwe;
import defpackage.yfx;
import defpackage.ygx;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/sportybet/feature/profile/ProfileActivity;", "Lpy1;", "Lk9j;", "Lbb40;", "Lto20;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ProfileActivity extends v0m implements k9j, bb40, to20 {
    public static final /* synthetic */ int b = 0;

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        yfx yfxVarA;
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_profile, (ViewGroup) null, false);
        if (((FragmentContainerView) h5e.a(R.id.profile_nav_host_fragment, viewInflate)) == null) {
            bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.profile_nav_host_fragment)));
            return;
        }
        setContentView((ConstraintLayout) viewInflate);
        String stringExtra = getIntent().getStringExtra("start_route");
        Fragment fragmentG = getSupportFragmentManager().G(R.id.profile_nav_host_fragment);
        if (fragmentG == null || (yfxVarA = NavHostFragment.a.a(fragmentG)) == null) {
            return;
        }
        Object obj = gz20.INSTANCE;
        Object obj2 = kpu.f(new Pair("profile", obj), new Pair("dob_graph", pve.INSTANCE)).get(stringExtra);
        if (obj2 != null) {
            obj = obj2;
        }
        dq7 dq7VarA = jq40.a(obj.getClass());
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        ghx ghxVar = new ghx(yfxVarA.b.t, dq7VarA, (dq7) null, o2gVar);
        wkx wkxVar = ghxVar.i;
        wkxVar.getClass();
        a aVar = (a) wkxVar.b(wkx.a.a(a.class));
        dq7 dq7VarA2 = jq40.a(gz20.class);
        dq7 dq7VarA3 = jq40.a(d030.class);
        b bVar = new b(aVar, dq7VarA2, o2gVar);
        bVar.i = dq7VarA3;
        bVar.e = "Profile";
        ygx ygxVarA = bVar.a();
        ArrayList arrayList = ghxVar.m;
        arrayList.add(ygxVarA);
        ghx ghxVar2 = new ghx(wkxVar, "primary_phone_instructions_route", "primary_phone_number_route");
        wkx wkxVar2 = ghxVar2.i;
        wkxVar2.getClass();
        b bVar2 = new b((a) wkxVar2.b(wkx.a.a(a.class)), "primary_phone_instructions_route/{config}", jq40.a(or20.class));
        bVar2.e = "PrimaryPhoneInstructionsFragment";
        ffx.a aVar2 = new gfx().a;
        bs20.a aVar3 = bs20.a;
        aVar2.a = aVar3;
        aVar2.b = false;
        Unit unit = Unit.a;
        bVar2.f.put("config", aVar2.a());
        ygx ygxVarA2 = bVar2.a();
        ArrayList arrayList2 = ghxVar2.m;
        arrayList2.add(ygxVarA2);
        b bVar3 = new b((a) wkxVar2.b(wkx.a.a(a.class)), "primary_phone_verify_identity_route/{withdraw_pin_status}/{config}", jq40.a(iv20.class));
        bVar3.e = "PrimaryPhoneVerifyIdentityFragment";
        ffx.a aVar4 = new gfx().a;
        cae0 cae0Var = djx.o;
        aVar4.a = cae0Var;
        aVar4.b = false;
        ffx ffxVarA = aVar4.a();
        LinkedHashMap linkedHashMap = bVar3.f;
        linkedHashMap.put("withdraw_pin_status", ffxVarA);
        ffx.a aVar5 = new gfx().a;
        aVar5.a = aVar3;
        aVar5.b = false;
        linkedHashMap.put("config", aVar5.a());
        arrayList2.add(bVar3.a());
        b bVar4 = new b((a) wkxVar2.b(wkx.a.a(a.class)), "primary_phone_update_phone_number_route/{verify_identity_token}/{config}", jq40.a(kt20.class));
        bVar4.e = "PrimaryPhoneVerifyPhoneNumberFragment";
        ffx.a aVar6 = new gfx().a;
        aVar6.a = cae0Var;
        aVar6.b = true;
        ffx ffxVarA2 = aVar6.a();
        LinkedHashMap linkedHashMap2 = bVar4.f;
        linkedHashMap2.put("verify_identity_token", ffxVarA2);
        ffx.a aVar7 = new gfx().a;
        aVar7.a = aVar3;
        aVar7.b = false;
        linkedHashMap2.put("config", aVar7.a());
        arrayList2.add(bVar4.a());
        b bVar5 = new b((a) wkxVar2.b(wkx.a.a(a.class)), "primary_phone_new_phone_verification_route/{new_phone}/{verify_name_token}", jq40.a(ds20.class));
        bVar5.e = "PrimaryPhoneNewPhoneVerificationFragment";
        ffx.a aVar8 = new gfx().a;
        aVar8.a = cae0Var;
        aVar8.b = false;
        ffx ffxVarA3 = aVar8.a();
        LinkedHashMap linkedHashMap3 = bVar5.f;
        linkedHashMap3.put("new_phone", ffxVarA3);
        ffx.a aVar9 = new gfx().a;
        aVar9.a = cae0Var;
        aVar9.b = false;
        linkedHashMap3.put("verify_name_token", aVar9.a());
        arrayList2.add(bVar5.a());
        b bVar6 = new b((a) wkxVar2.b(wkx.a.a(a.class)), "primary_phone_updated_successfully_route", jq40.a(ju20.class));
        bVar6.e = "PrimaryPhoneUpdatedSuccessfullyFragment";
        arrayList2.add(bVar6.a());
        arrayList.add(ghxVar2.a());
        dq7 dq7VarA4 = jq40.a(pxf.class);
        ncb ncbVar = new ncb(1);
        o2gVar.getClass();
        ihx.a(ghxVar, jq40.a(swf.class), dq7VarA4, o2gVar, ncbVar);
        ihx.a(ghxVar, jq40.a(pve.class), jq40.a(xwe.class), o2gVar, new qve());
        yfxVarA.p(ghxVar.a());
    }
}
