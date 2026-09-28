package defpackage;

import android.content.Context;
import androidx.fragment.app.e;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes7.dex */
public final class dby {
    public static final String a(Context context, String str, String str2) {
        context.getClass();
        str.getClass();
        str2.getClass();
        aby abyVarD = yay.d(str, str2);
        return abyVarD == null ? "" : tug.a(sn5.b(context, R.string.component_betslip__early_goals, new Object[0]), ": ", sn5.b(context, R.string.component_betslip__early_goal_desc, abyVarD.f(), abyVarD.b()));
    }

    public static final String b(e eVar, String str, String str2) {
        str.getClass();
        str2.getClass();
        aby abyVarD = yay.d(str, str2);
        return abyVarD == null ? "" : sn5.b(eVar, R.string.component_betslip__early_goal_desc, abyVarD.f(), abyVarD.b());
    }
}
