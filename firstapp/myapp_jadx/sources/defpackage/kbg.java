package defpackage;

import android.content.Context;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes8.dex */
public final class kbg extends mb5 {
    public final Throwable b;

    public kbg(int i, Throwable th) {
        super(i);
        this.b = th;
    }

    @Override // defpackage.mb5
    public final String f(Context context) {
        int i = this.a;
        if (i == -1000) {
            return context.getString(R.string.sg_common_feedback__please_check_your_internet_connection_and_try_again);
        }
        String strValueOf = String.valueOf(i);
        Throwable th = this.b;
        return context.getString(R.string.sg_sporty_soccer__error_message_internal, strValueOf, th != null ? th.getMessage() : "");
    }

    @Override // defpackage.mb5
    public final String h(Context context) {
        return this.a == -1000 ? context.getString(R.string.sg_common_feedback_connection_error) : "";
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ErrorApp{errorCode=");
        sb.append(this.a);
        sb.append(", throwable=");
        return vt5.b(sb, this.b, '}');
    }
}
