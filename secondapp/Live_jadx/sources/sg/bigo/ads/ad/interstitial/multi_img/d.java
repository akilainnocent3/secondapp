package sg.bigo.ads.ad.interstitial.multi_img;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes7.dex */
public enum d {
    NONE(0, 3, 20, 0, 1.0f, 1.0f),
    LTR(1, 1, 20, 12, 1.0f, 1.0f),
    CENTER(2, 2, 30, 12, 0.8f, 0.9f),
    FULL(3, 3, 20, 0, 1.0f, 1.0f),
    TILE(Integer.MIN_VALUE, Integer.MIN_VALUE, 20, 12, 1.0f, 1.0f);


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f132078f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final float f132079g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final float f132080h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f132081i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f132082j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f132083k;

    d(int i10, int i11, int i12, int i13, float f10, float f11) {
        this.f132083k = i10;
        this.f132082j = i11;
        this.f132081i = i12;
        this.f132078f = i13;
        this.f132079g = f10;
        this.f132080h = f11;
    }

    @NonNull
    public static d a(int i10) {
        if (i10 == Integer.MIN_VALUE) {
            return TILE;
        }
        if (i10 == 1) {
            return LTR;
        }
        if (i10 != 2) {
            return i10 != 3 ? NONE : FULL;
        }
        return CENTER;
    }
}
