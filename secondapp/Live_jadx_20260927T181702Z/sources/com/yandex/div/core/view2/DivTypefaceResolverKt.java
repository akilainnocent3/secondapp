package com.yandex.div.core.view2;

import android.graphics.Typeface;
import com.yandex.div.core.font.DivTypefaceProvider;
import mq.ba;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class DivTypefaceResolverKt {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ba.values().length];
            try {
                iArr[ba.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ba.REGULAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ba.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ba.BOLD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Typeface getTypeface(int i10, @oy.l DivTypefaceProvider divTypefaceProvider) {
        Typeface typefaceFor = divTypefaceProvider.getTypefaceFor(i10);
        return typefaceFor == null ? Typeface.DEFAULT : typefaceFor;
    }

    public static final int getTypefaceValue(@oy.m ba baVar, @oy.m Integer num) {
        if (num != null) {
            return num.intValue();
        }
        int i10 = baVar == null ? -1 : WhenMappings.$EnumSwitchMapping$0[baVar.ordinal()];
        if (i10 == 1) {
            return 300;
        }
        if (i10 == 2) {
            return 400;
        }
        if (i10 != 3) {
            return i10 != 4 ? 400 : 700;
        }
        return 500;
    }

    public static final Typeface getTypeface(@oy.m ba baVar, @oy.m Integer num, @oy.l DivTypefaceProvider divTypefaceProvider) {
        return getTypeface(getTypefaceValue(baVar, num), divTypefaceProvider);
    }
}
