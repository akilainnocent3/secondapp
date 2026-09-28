package defpackage;

import com.sporty.android.core.model.loyalty.BetType;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class fa90 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[BetType.values().length];
        try {
            iArr[BetType.SINGLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BetType.MULTIPLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BetType.SYSTEM.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
