package defpackage;

import android.content.Context;
import com.sportybet.android.gp.tz.R;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class chk {
    public final Context a;
    public final bnh0 b;

    public chk(Context context, bnh0 bnh0Var) {
        bnh0Var.getClass();
        this.a = context;
        this.b = bnh0Var;
    }

    public final String a() {
        String strV0 = StringsKt.v0(bnh0.d(this.b, new String[0], null, 6), '/');
        String string = this.a.getString(R.string.world_cup_mission__wc_promotion_url);
        string.getClass();
        return strV0 + string;
    }
}
