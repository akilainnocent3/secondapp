package com.google.android.gms.common.stats;

import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class StatsEvent extends AbstractSafeParcelable implements ReflectedParcelable {
    public abstract int G0();

    public abstract long K0();

    public abstract String O0();

    public final String toString() {
        return K0() + "\t" + G0() + "\t-1" + O0();
    }
}
