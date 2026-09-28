package defpackage;

import com.sportybet.android.router.Sender;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class dnj {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Sender.values().length];
        try {
            iArr[Sender.DIRECT_URL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Sender.HOMEPAGE_TOP_BANNER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Sender.HOMEPAGE_SPORTY_STORY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Sender.HOMEPAGE_SPORTY_BANNER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[Sender.HOMEPAGE_POPULAR_BANNER.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[Sender.HOMEPAGE_POPUP_BANNER.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[Sender.HOMEPAGE_FEATUREDGAMES_SECTION.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[Sender.GIFT.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        a = iArr;
    }
}
