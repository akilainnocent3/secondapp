package defpackage;

import android.content.Context;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes6.dex */
public final class pvf {
    public static final /* synthetic */ int a = 0;

    public static final String a(Context context, int i) {
        Integer numValueOf;
        if (context == null) {
            return null;
        }
        if (i == 1) {
            numValueOf = Integer.valueOf(R.string.common_functions__cash_gift);
        } else if (i == 2) {
            numValueOf = Integer.valueOf(R.string.common_functions__discount_gift);
        } else {
            numValueOf = i == 3 ? Integer.valueOf(R.string.common_functions__free_bet_gift) : null;
        }
        if (numValueOf != null) {
            return sn5.b(context, numValueOf.intValue(), new Object[0]);
        }
        return null;
    }
}
