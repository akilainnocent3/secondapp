package defpackage;

import com.sportybet.plugin.realsports.data.sim.SimulateBetConsts;

/* JADX INFO: loaded from: classes5.dex */
public enum bz3 {
    SINGLE(SimulateBetConsts.BetslipType.SINGLE),
    MULTIPLE(SimulateBetConsts.BetslipType.MULTIPLE),
    SYSTEM("system");

    public final String a;

    bz3(String str) {
        this.a = str;
    }
}
