package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.dedicatedteampage.shared.ui.DedicatedTeamPageActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b6d implements a6d {
    public final lq1 a;
    public final yi5 b;

    public b6d(lq1 lq1Var, yi5 yi5Var) {
        lq1Var.getClass();
        yi5Var.getClass();
        this.a = lq1Var;
        this.b = yi5Var;
    }

    public final void a(Context context, String str, String str2, String str3, String str4) {
        context.getClass();
        str.getClass();
        if (qq1.c(this.a, BOConfigParam.DedicatedTeamPageEnabled, this.b.b().a())) {
            if (!Intrinsics.g(str3, "sr:sport:1")) {
                Toast.makeText(context, R.string.dedicated_team_pages__team_page_sport_not_supported, 0).show();
                return;
            }
            int i = DedicatedTeamPageActivity.c;
            Intent intent = new Intent(context, (Class<?>) DedicatedTeamPageActivity.class);
            intent.putExtra("team_id", str);
            if (str2 != null) {
                intent.putExtra("team_name", str2);
            }
            if (str4 != null) {
                intent.putExtra("entrance", str4);
            }
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            context.startActivity(intent);
        }
    }
}
