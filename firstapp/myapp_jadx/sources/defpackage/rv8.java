package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.ui.d;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class rv8 {
    public static final op8 a = new op8(-355168742, a.a, false);

    public static final class a implements gaj<v0b, androidx.compose.runtime.a, Integer, Unit> {
        public static final a a = new a();

        @Override // defpackage.gaj
        public final Unit invoke(v0b v0bVar, androidx.compose.runtime.a aVar, Integer num) {
            v0b v0bVar2 = v0bVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int iIntValue = num.intValue();
            if ((iIntValue & 6) == 0) {
                iIntValue |= aVar2.M(v0bVar2) ? 4 : 2;
            }
            if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                g75.a(androidx.compose.foundation.a.b(j.i(j.g(h.h(d.a.b, 0.0f, b1b.g, 1), 1.0f), b1b.f), v0bVar2.c, zk40.a), aVar2, 0);
            } else {
                aVar2.G();
            }
            return Unit.a;
        }
    }
}
