package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes7.dex */
public final class kt2 implements b2 {
    public static final kt2 a = new kt2();

    public static String b(double d) {
        return qw.c(Double.valueOf(d), 12, false, null);
    }

    public static String c(double d, Context context) {
        context.getClass();
        DecimalFormat decimalFormat = new DecimalFormat("#,###,###.##", SportyGamesManager.decimalFormatSymbols);
        decimalFormat.setMinimumFractionDigits(2);
        String string = context.getString(R.string.bet_amount, decimalFormat.format(d));
        string.getClass();
        return string;
    }

    public static String d(String str) {
        str.getClass();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("HH:mm  dd/MM/yy");
        try {
            Date date = simpleDateFormat.parse(str);
            date.getClass();
            String str2 = simpleDateFormat2.format(date);
            str2.getClass();
            return str2;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    @Override // defpackage.b2
    public final void a(String str) {
        str.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("KEY_TICKET_ID", str);
        SportyGamesManager.getInstance().gotoSportyBet(xae.d, bundle);
    }
}
