package com.startapp.sdk.adsbase.adrules;

import com.startapp.sdk.internal.si;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class ProbabilityRule extends AdRule implements Serializable {
    private static final long serialVersionUID = 3331748489661622124L;
    private double probability;

    public ProbabilityRule() {
        super(false);
    }

    @Override // com.startapp.sdk.adsbase.adrules.AdRule
    public final boolean a(List list) {
        return ((Random) si.f75517d.a()).nextDouble() < this.probability;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && Double.compare(((ProbabilityRule) obj).probability, this.probability) == 0;
    }

    public final int hashCode() {
        Object[] objArr = {Double.valueOf(this.probability)};
        WeakHashMap weakHashMap = si.f75514a;
        return Arrays.deepHashCode(objArr);
    }
}
