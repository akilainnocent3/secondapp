package defpackage;

import com.sportybet.core.segmentation.HomeSegment;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class k580 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[HomeSegment.values().length];
        try {
            iArr[HomeSegment.Sports.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[HomeSegment.Games.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[HomeSegment.SportsDominant.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[HomeSegment.GamesDominant.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
