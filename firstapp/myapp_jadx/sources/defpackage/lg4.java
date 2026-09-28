package defpackage;

import androidx.compose.ui.d;
import androidx.compose.ui.graphics.a;

/* JADX INFO: loaded from: classes.dex */
public final class lg4 {
    public static final d a(d dVar, float f, float f2, zk40.a aVar) {
        boolean z;
        int i;
        if (aVar != null) {
            i = 0;
            z = true;
        } else {
            z = false;
            i = 3;
        }
        return ((Float.compare(f, 0.0f) <= 0 || Float.compare(f2, 0.0f) <= 0) && !z) ? dVar : a.a(dVar, new jg4(f, f2, i, aVar, z));
    }
}
