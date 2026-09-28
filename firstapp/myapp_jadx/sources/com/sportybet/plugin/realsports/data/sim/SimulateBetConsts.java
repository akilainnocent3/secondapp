package com.sportybet.plugin.realsports.data.sim;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes7.dex */
public class SimulateBetConsts {
    public static final BigDecimal MAGIC_NUMBER = BigDecimal.valueOf(10000L);

    @Retention(RetentionPolicy.SOURCE)
    public @interface BetslipType {
        public static final String CUTBET = "cutbet";
        public static final String FLEX = "flexible";
        public static final String MULTIPLE = "multiple";
        public static final String SINGLE = "single";
    }
}
