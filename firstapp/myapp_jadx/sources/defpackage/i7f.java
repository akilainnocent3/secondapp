package defpackage;

import android.content.res.Configuration;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: loaded from: classes7.dex */
public final class i7f {
    public static final float a(float f, a aVar) {
        mmd mmdVar = (mmd) aVar.O(kna.h);
        mmdVar.getClass();
        return mmdVar.C1(f);
    }

    public static final long b(float f, a aVar) {
        return d2l.g(f / ((Configuration) aVar.O(AndroidCompositionLocals_androidKt.a)).fontScale, 4294967296L);
    }
}
