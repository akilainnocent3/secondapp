package defpackage;

import android.text.TextUtils;
import com.sporty.android.chat.data.CalculateTotalBonus;
import com.sportybet.plugin.realsports.event.comment.prematch.data.entity.ShareBetData;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes4.dex */
public final class rt5 {
    public static final DecimalFormat a = new DecimalFormat("#.##");

    public static final String a(ShareBetData shareBetData) {
        double d;
        double d2;
        shareBetData.getClass();
        String strValueOf = String.valueOf(shareBetData.getTotalBonus());
        double d3 = 0.0d;
        if (TextUtils.isEmpty(strValueOf)) {
            d = 0.0d;
        } else {
            try {
                d = Double.parseDouble(strValueOf);
            } catch (Exception unused) {
                d = 0.0d;
            }
        }
        String strValueOf2 = String.valueOf(shareBetData.getTotalStake());
        if (TextUtils.isEmpty(strValueOf2)) {
            d2 = 0.0d;
        } else {
            try {
                d2 = Double.parseDouble(strValueOf2);
            } catch (Exception unused2) {
                d2 = 0.0d;
            }
        }
        String strValueOf3 = String.valueOf(shareBetData.getTotalOdds());
        if (!TextUtils.isEmpty(strValueOf3)) {
            try {
                d3 = Double.parseDouble(strValueOf3);
            } catch (Exception unused3) {
            }
        }
        String str = b6y.a.format(((d / d2) / d3) * 100.0d);
        str.getClass();
        return str;
    }

    public static final String b(String str) {
        String str2 = a.format(CalculateTotalBonus.INSTANCE.parseString2Double(String.valueOf(str)));
        str2.getClass();
        return str2;
    }
}
