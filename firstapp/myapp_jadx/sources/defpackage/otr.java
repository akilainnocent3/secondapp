package defpackage;

import com.google.protobuf.Reader;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes.dex */
public final class otr {
    public static final long a(float f, int i, long j, boolean z) {
        int i2 = ((z || i == 2 || i == 4 || i == 5) && kxa.e(j)) ? kxa.i(j) : Reader.READ_DONE;
        if (kxa.k(j) != i2) {
            i2 = f.e(cff0.a(f), kxa.k(j), i2);
        }
        return kxa.a.b(0, i2, 0, kxa.h(j));
    }
}
