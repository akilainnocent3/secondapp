package defpackage;

import android.content.res.Configuration;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes5.dex */
public final class m590 {
    public static final hfs a(List list, a aVar, int i) {
        if ((i & 1) != 0) {
            list = b.k(new j58(c68.a(R.color.skeleton_load_start, aVar)), new j58(c68.a(R.color.skeleton_load_end, aVar)), new j58(c68.a(R.color.skeleton_load_start, aVar)));
        }
        List list2 = list;
        float fY0 = ((mmd) aVar.O(kna.h)).y0(((Configuration) aVar.O(AndroidCompositionLocals_androidKt.a)).screenWidthDp);
        egn.a aVarA = kgn.a(kgn.b("", aVar, 0), -fY0, fY0, yi0.a(yi0.e(1200, 0, null, 6), l850.a, 0L, 4), "", aVar, 28680, 0);
        return new hfs(list2, null, (((long) Float.floatToRawIntBits(((Number) ((x5a0) aVarA.c).getValue()).floatValue())) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(((Number) ((x5a0) aVarA.c).getValue()).floatValue() + fY0)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), 0);
    }
}
