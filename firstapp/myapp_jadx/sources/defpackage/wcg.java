package defpackage;

import android.content.Context;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes.dex */
public final class wcg extends mb5 {
    public final String b;
    public final String c;

    public wcg(int i, String str, String str2) {
        super(i);
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.mb5
    public final String f(Context context) {
        int i = this.a;
        if (i >= 11000 && i < 20000) {
            return context.getString(R.string.sg_sporty_soccer_error_message_server_internal, String.valueOf(i));
        }
        if (i == 61100) {
            return context.getString(R.string.sg_sporty_soccer_game_canceled_msg);
        }
        if (i == 62101) {
            return context.getString(R.string.sg_sporty_soccer_insufficient_balance_msg);
        }
        if (i != 63100) {
            return context.getString(R.string.sg_sporty_soccer_error_message_server_internal, String.valueOf(i));
        }
        return this.c.contains("globally") ? context.getString(R.string.error_game_is_not_available_country) : context.getString(R.string.sg_common_feedback_account_error_msg);
    }

    @Override // defpackage.mb5
    public final String h(Context context) {
        int i = this.a;
        if (i >= 11000 && i < 20000) {
            return context.getString(R.string.sg_common_functions_error);
        }
        if (i == 61100) {
            return context.getString(R.string.sg_sporty_soccer_game_canceled);
        }
        if (i != 62101) {
            return i != 63100 ? context.getString(R.string.sg_common_functions_error) : context.getString(R.string.sg_common_functions_error);
        }
        return context.getString(R.string.sg_common_functions_error);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ErrorServer{errorCode=");
        sb.append(this.a);
        sb.append(", errorName='");
        sb.append(this.b);
        sb.append("', causeMsg='");
        return uf80.a(sb, this.c, "', resp=''}");
    }
}
