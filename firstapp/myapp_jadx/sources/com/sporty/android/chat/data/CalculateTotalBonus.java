package com.sporty.android.chat.data;

import android.text.TextUtils;
import defpackage.b6y;
import java.text.DecimalFormat;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0007b\u0002\b\fJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/sporty/android/chat/data/CalculateTotalBonus;", "", "<init>", "()V", "decimalFormat", "Ljava/text/DecimalFormat;", "getTotalBonus", "", "shareBetData", "Lcom/sporty/android/chat/data/LiveShareBetData;", "getTotalOdds", "totalOdds", "Lkotlin/jvm/JvmStatic;", "parseString2Double", "", "value", "sportychat"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class CalculateTotalBonus {
    public static final CalculateTotalBonus INSTANCE = new CalculateTotalBonus();
    private static final DecimalFormat decimalFormat = new DecimalFormat("#.##");

    private CalculateTotalBonus() {
    }

    public static final String getTotalOdds(String totalOdds) {
        String str = decimalFormat.format(INSTANCE.parseString2Double(String.valueOf(totalOdds)));
        str.getClass();
        return str;
    }

    public final String getTotalBonus(LiveShareBetData shareBetData) {
        shareBetData.getClass();
        String str = b6y.a.format(((parseString2Double(String.valueOf(shareBetData.getTotalBonus())) / parseString2Double(String.valueOf(shareBetData.getTotalStake()))) / parseString2Double(String.valueOf(shareBetData.getTotalOdds()))) * 100.0d);
        str.getClass();
        return str;
    }

    public final double parseString2Double(String value) {
        value.getClass();
        if (TextUtils.isEmpty(value)) {
            return 0.0d;
        }
        try {
            return Double.parseDouble(value);
        } catch (Exception unused) {
            return 0.0d;
        }
    }
}
