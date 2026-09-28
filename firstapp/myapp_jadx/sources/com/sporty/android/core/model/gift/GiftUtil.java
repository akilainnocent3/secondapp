package com.sporty.android.core.model.gift;

/* JADX INFO: loaded from: classes.dex */
public class GiftUtil {
    public static final String CLEARED_GIFT_VALUE = "Skip";

    public static SelectedGiftData newUnselectedGiftData(int i) {
        return new SelectedGiftData(CLEARED_GIFT_VALUE, 0, null, "0", i, null, false, false, false, null);
    }
}
