package defpackage;

import android.os.Bundle;
import android.view.View;
import com.google.android.material.bottomsheet.b;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportygames.commons.SportyGamesManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class zh60 extends b {
    public String F;
    public int G;
    public int H;
    public wh60 I;
    public mn80 J;
    public String K;
    public String L;

    public static void i(String str, String str2, String str3) {
        zj60 bridge;
        String str4 = SportyGamesManager.getInstance().getUser() != null ? "logged-in" : "non logged-in";
        Bundle bundleA = whs.a("popup_name", str, "button_name", str2);
        bundleA.putString(AnalyticsParam.GAMES_RECOMMENDATION_GAME_NAME, str3);
        bundleA.putString("user_state", str4);
        SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
        if (sportyGamesManager == null || (bridge = sportyGamesManager.getBridge()) == null) {
            return;
        }
        ((bk60) bridge).a("popup_action", bundleA);
    }

    @Override // com.google.android.material.bottomsheet.b, defpackage.xq0, defpackage.bo8, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        mny.a(this.c, this, new v620(this, 1), 2);
        mn80 mn80VarA = mn80.a(getLayoutInflater(), null);
        this.J = mn80VarA;
        setContentView(mn80VarA.a);
        mn80 mn80Var = this.J;
        if (mn80Var == null) {
            Intrinsics.n("binding");
            throw null;
        }
        mn80Var.C.setText(this.F);
        mn80 mn80Var2 = this.J;
        if (mn80Var2 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        mn80Var2.c.setText(getContext().getResources().getString(this.H));
        mn80 mn80Var3 = this.J;
        if (mn80Var3 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        mn80Var3.d.setText(getContext().getResources().getString(this.G));
        mn80 mn80Var4 = this.J;
        if (mn80Var4 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        mn80Var4.c.setOnClickListener(new View.OnClickListener() { // from class: xh60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zh60 zh60Var = this.a;
                String str = zh60Var.L;
                mn80 mn80Var5 = zh60Var.J;
                if (mn80Var5 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                zh60.i(str, mn80Var5.c.getText().toString(), zh60Var.K);
                zh60Var.I.invoke(Boolean.FALSE);
                zh60Var.dismiss();
            }
        });
        mn80 mn80Var5 = this.J;
        if (mn80Var5 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        mn80Var5.d.setOnClickListener(new View.OnClickListener() { // from class: yh60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zh60 zh60Var = this.a;
                String str = zh60Var.L;
                mn80 mn80Var6 = zh60Var.J;
                if (mn80Var6 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                zh60.i(str, mn80Var6.d.getText().toString(), zh60Var.K);
                zh60Var.I.invoke(Boolean.TRUE);
                zh60Var.dismiss();
            }
        });
        mn80 mn80Var6 = this.J;
        if (mn80Var6 != null) {
            mn80Var6.A.setVisibility(8);
        } else {
            Intrinsics.n("binding");
            throw null;
        }
    }
}
