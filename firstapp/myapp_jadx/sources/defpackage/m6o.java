package defpackage;

import com.sportybet.plugin.realsports.data.sim.SimulateBetConsts;
import java.util.Comparator;

/* JADX INFO: loaded from: classes5.dex */
public final class m6o<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return Boolean.valueOf(((w8z) t2).b.equals(SimulateBetConsts.BetslipType.SINGLE)).compareTo(Boolean.valueOf(((w8z) t).b.equals(SimulateBetConsts.BetslipType.SINGLE)));
    }
}
