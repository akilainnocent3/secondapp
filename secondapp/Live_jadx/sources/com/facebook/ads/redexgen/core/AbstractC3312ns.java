package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import java.util.Comparator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ns, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractC3312ns {
    public static final AbstractC3312ns A00 = new C1856Be();
    public static final AbstractC3312ns A02 = new C1854Bc(-1);
    public static final AbstractC3312ns A01 = new C1854Bc(1);

    public abstract int A05();

    public abstract AbstractC3312ns A06(int left, int right);

    public abstract AbstractC3312ns A07(long left, long right);

    public abstract <T> AbstractC3312ns A08(@ParametricNullness T left, @ParametricNullness T right, Comparator<T> comparator);

    public abstract AbstractC3312ns A09(boolean left, boolean right);

    public abstract AbstractC3312ns A0A(boolean left, boolean right);

    public AbstractC3312ns() {
    }

    public /* synthetic */ AbstractC3312ns(C1856Be c1856Be) {
        this();
    }

    public static AbstractC3312ns A01() {
        return A00;
    }
}
