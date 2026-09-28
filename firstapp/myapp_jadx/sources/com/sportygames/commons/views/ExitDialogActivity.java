package com.sportygames.commons.views;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.webcontainer.caipiao.jsplugin.JsPluginCommon;
import com.sportygames.commons.utils.CasinoLogger;
import com.sportygames.commons.views.ExitDialogActivity;
import com.twilio.voice.EventKeys;
import defpackage.a1s;
import defpackage.dq7;
import defpackage.elf;
import defpackage.g6i0;
import defpackage.hq0;
import defpackage.hwr;
import defpackage.jq40;
import defpackage.kwg;
import defpackage.l1z;
import defpackage.mvg;
import defpackage.nwg;
import defpackage.op5;
import defpackage.ovg;
import defpackage.pcg;
import defpackage.qlf;
import defpackage.qn70;
import defpackage.rrp;
import defpackage.sjj;
import defpackage.ttr;
import defpackage.uy1;
import defpackage.vj5;
import defpackage.wz;
import defpackage.xjj;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/sportygames/commons/views/ExitDialogActivity;", "Luy1;", "Lnwg;", "Lxjj;", "<init>", "()V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ExitDialogActivity extends uy1<nwg> implements xjj {
    public String d;
    public String f;
    public float i;
    public final ttr c = hwr.a(a1s.a, new a());
    public Integer e = 0;

    public static final class a implements Function0<l1z> {
        public a() {
        }

        /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, l1z] */
        @Override // kotlin.jvm.functions.Function0
        public final l1z invoke() {
            qn70 qn70VarJ;
            dq7 dq7VarA;
            hq0 hq0Var = ExitDialogActivity.this;
            if (hq0Var instanceof rrp) {
                qn70VarJ = ((rrp) hq0Var).j();
                dq7VarA = jq40.a(l1z.class);
                qn70VarJ.getClass();
            } else {
                qn70VarJ = sjj.b().c.d;
                dq7VarA = jq40.a(l1z.class);
            }
            return qn70VarJ.a(dq7VarA, null, null);
        }
    }

    @Override // defpackage.uy1
    public final boolean onBackPressedCompat() {
        setResult(-1, getIntent());
        return false;
    }

    @Override // defpackage.uy1, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ConstraintLayout constraintLayout;
        super.onCreate(bundle);
        Unit unit = null;
        elf.b(this, null, 3);
        nwg nwgVar = (nwg) this.a;
        if (nwgVar != null && (constraintLayout = nwgVar.a) != null) {
            qlf.b(constraintLayout);
        }
        int intExtra = getIntent().getIntExtra("color", 0);
        qlf.d(this);
        Window window = getWindow();
        window.getClass();
        qlf.c(window, getColor(intExtra));
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("ExitGameList");
        parcelableArrayListExtra.getClass();
        this.d = getIntent().getStringExtra(JsPluginCommon.GAMES_BET_PLACED_GAME_NAME_ARGUMENT);
        this.e = Integer.valueOf(getIntent().getIntExtra("gameId", 0));
        this.f = getIntent().getStringExtra(EventKeys.ERROR_MESSAGE);
        wz.a("RecommendationDialogShow", this.d, new String[0]);
        CasinoLogger.INSTANCE.logEventToCasino("RecommendationDialogShow", vj5.a(new Pair(JsPluginCommon.GAMES_BET_PLACED_GAME_NAME_ARGUMENT, this.d), new Pair("Platform", "ANDROID")));
        nwg nwgVar2 = (nwg) this.a;
        if (nwgVar2 != null) {
            nwgVar2.b.setOnClickListener(new mvg(this, 0));
        }
        nwg nwgVar3 = (nwg) this.a;
        if (nwgVar3 != null) {
            nwgVar3.e.setOnClickListener(new View.OnClickListener() { // from class: nvg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ExitDialogActivity exitDialogActivity = this.a;
                    wz.a("StayOnRecommendation", exitDialogActivity.d, new String[0]);
                    CasinoLogger.INSTANCE.logEventToCasino("StayOnRecommendation", vj5.a(new Pair(JsPluginCommon.GAMES_BET_PLACED_GAME_NAME_ARGUMENT, exitDialogActivity.d), new Pair("Platform", "ANDROID")));
                    exitDialogActivity.finish();
                }
            });
        }
        kwg kwgVar = new kwg(this.e, this.d, parcelableArrayListExtra, this, (l1z) this.c.getValue());
        nwg nwgVar4 = (nwg) this.a;
        if (nwgVar4 != null) {
            nwgVar4.v.setLayoutManager(new LinearLayoutManager(0, false));
        }
        nwg nwgVar5 = (nwg) this.a;
        if (nwgVar5 != null) {
            nwgVar5.v.setAdapter(kwgVar);
        }
        op5 op5Var = op5.a;
        nwg nwgVar6 = (nwg) this.a;
        op5.r(op5Var, b.f(nwgVar6 != null ? nwgVar6.c : null, nwgVar6 != null ? nwgVar6.y : null, nwgVar6 != null ? nwgVar6.d : null), null, 6);
        ovg ovgVar = new ovg(this);
        nwg nwgVar7 = (nwg) this.a;
        if (nwgVar7 != null) {
            nwgVar7.v.k(ovgVar);
        }
        String strB = this.f;
        if (strB != null) {
            String str = (String) pcg.a(this).get(strB);
            nwg nwgVar8 = (nwg) this.a;
            if (nwgVar8 != null) {
                TextView textView = nwgVar8.i;
                if (str != null) {
                    strB = op5.b(str, strB, null);
                }
                textView.setText(strB);
            }
            nwg nwgVar9 = (nwg) this.a;
            if (nwgVar9 != null) {
                nwgVar9.f.setVisibility(0);
            }
            nwg nwgVar10 = (nwg) this.a;
            if (nwgVar10 != null) {
                nwgVar10.e.setVisibility(8);
            }
            nwg nwgVar11 = (nwg) this.a;
            if (nwgVar11 != null) {
                nwgVar11.b.setBackgroundColor(getColor(R.color.use_gift_color));
                unit = Unit.a;
            }
            if (unit != null) {
                return;
            }
        }
        nwg nwgVar12 = (nwg) this.a;
        if (nwgVar12 != null) {
            nwgVar12.f.setVisibility(8);
        }
    }

    @Override // defpackage.uy1
    public final g6i0 w1() {
        return nwg.a(getLayoutInflater(), null);
    }
}
