package defpackage;

import android.content.res.Resources;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: loaded from: classes4.dex */
public final class fw20 {
    public static final float a(int i, a aVar) {
        return ((Resources) aVar.O(AndroidCompositionLocals_androidKt.c)).getDimension(i) / ((mmd) aVar.O(kna.h)).getDensity();
    }
}
