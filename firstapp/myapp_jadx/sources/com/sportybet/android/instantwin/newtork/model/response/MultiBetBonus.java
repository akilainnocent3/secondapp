package com.sportybet.android.instantwin.newtork.model.response;

import defpackage.geo;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class MultiBetBonus {
    public List<BonusRatio> bonusRatios;
    public boolean enable;
    public int maxSelections;
    public int minSelections;
    public long qualifyingOddsLimit;

    public static class BonusRatio {
        public long ratio;
        public int selections;
    }

    public BigDecimal getOddsThreshold() {
        return BigDecimal.valueOf(this.qualifyingOddsLimit).divide(geo.a, 2, RoundingMode.HALF_UP);
    }

    public BigDecimal getRatio(int i) {
        List<BonusRatio> list = this.bonusRatios;
        if (list != null && i > 0) {
            for (BonusRatio bonusRatio : list) {
                if (bonusRatio.selections == i) {
                    return BigDecimal.valueOf(bonusRatio.ratio).divide(geo.a, 2, RoundingMode.HALF_UP);
                }
            }
        }
        return BigDecimal.ZERO;
    }
}
