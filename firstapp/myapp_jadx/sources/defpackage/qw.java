package defpackage;

import android.content.Context;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes8.dex */
public final class qw implements yxd0 {
    public static final qw a = new qw();

    public static String c(Double d, int i, boolean z, Context context) {
        if (d != null) {
            if (d.doubleValue() < 1.0d) {
                String str = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(d.doubleValue());
                str.getClass();
                return str;
            }
            if (z && context != null) {
                long jDoubleValue = ((long) d.doubleValue()) / 1000000;
                if (1 <= jDoubleValue && jDoubleValue < 1000) {
                    op5 op5Var = op5.a;
                    String string = context.getString(R.string.lobby_notification_million_cms);
                    return jDoubleValue + " " + at6.a(string, context, R.string.lobby_notification_million_text, op5Var, string);
                }
            }
        }
        String str2 = new DecimalFormat("###,###.00", SportyGamesManager.decimalFormatSymbols).format(d != null ? new BigDecimal(d.doubleValue()).setScale(2, RoundingMode.HALF_EVEN) : null);
        return str2.length() > i ? str2.substring(0, i).concat("..") : str2;
    }

    @Override // defpackage.yxd0
    public int a(Object obj, ptu ptuVar) {
        int i = cl0.b.c;
        ((Boolean) obj).getClass();
        int i2 = s08.a;
        return i + 1;
    }

    @Override // defpackage.yxd0
    public void b(me80 me80Var, Object obj, ptu ptuVar) {
        me80Var.Y(cl0.b, ((Boolean) obj).booleanValue());
    }
}
