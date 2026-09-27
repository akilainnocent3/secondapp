package com.yandex.div.core.font;

import android.graphics.Typeface;
import android.os.Build;
import androidx.annotation.Nullable;
import com.yandex.div.core.annotations.PublicApi;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@PublicApi
public interface DivTypefaceProvider {
    public static final DivTypefaceProvider DEFAULT = new DivTypefaceProvider() { // from class: com.yandex.div.core.font.DivTypefaceProvider.1
        @Override // com.yandex.div.core.font.DivTypefaceProvider
        @Nullable
        public Typeface getBold() {
            return null;
        }

        @Override // com.yandex.div.core.font.DivTypefaceProvider
        @Nullable
        public Typeface getLight() {
            return null;
        }

        @Override // com.yandex.div.core.font.DivTypefaceProvider
        @Nullable
        public Typeface getMedium() {
            return null;
        }

        @Override // com.yandex.div.core.font.DivTypefaceProvider
        @Nullable
        public Typeface getRegular() {
            return null;
        }

        @Override // com.yandex.div.core.font.DivTypefaceProvider
        @Nullable
        public Typeface getTypefaceFor(int i10) {
            return Build.VERSION.SDK_INT >= 28 ? Typeface.create(Typeface.DEFAULT, i10, false) : a.a(this, i10);
        }

        @Override // com.yandex.div.core.font.DivTypefaceProvider
        public /* synthetic */ boolean isVariable() {
            return a.b(this);
        }
    };

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface Weight {
        public static final int BOLD = 700;
        public static final int LIGHT = 300;
        public static final int MEDIUM = 500;
        public static final int REGULAR = 400;
    }

    @Nullable
    Typeface getBold();

    @Nullable
    Typeface getLight();

    @Nullable
    Typeface getMedium();

    @Nullable
    Typeface getRegular();

    @Nullable
    Typeface getTypefaceFor(int i10);

    boolean isVariable();
}
