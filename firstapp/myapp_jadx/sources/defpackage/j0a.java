package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.ui.d;
import kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final class j0a {
    public static final op8 a = new op8(1555867581, b.a, false);
    public static final op8 b = new op8(-1455905676, a.a, false);

    public static final class a implements gaj<j58, androidx.compose.runtime.a, Integer, Unit> {
        public static final a a = new a();

        @Override // defpackage.gaj
        public final Unit invoke(j58 j58Var, androidx.compose.runtime.a aVar, Integer num) {
            long j = j58Var.a;
            androidx.compose.runtime.a aVar2 = aVar;
            int iIntValue = num.intValue();
            if ((iIntValue & 6) == 0) {
                iIntValue |= aVar2.e(j) ? 4 : 2;
            }
            if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                h9n.a(erz.a(2131233731, 0, aVar2), "Right", p1a.a(j.r(h.j(d.a.b, 8.0f, 0.0f, 0.0f, 0.0f, 14), 20.0f), 180.0f), null, null, 0.0f, new gf4(j, 5), aVar2, 432, 56);
            } else {
                aVar2.G();
            }
            return Unit.a;
        }
    }

    public static final class b implements gaj<j58, androidx.compose.runtime.a, Integer, Unit> {
        public static final b a = new b();

        @Override // defpackage.gaj
        public final Unit invoke(j58 j58Var, androidx.compose.runtime.a aVar, Integer num) {
            long j = j58Var.a;
            androidx.compose.runtime.a aVar2 = aVar;
            int iIntValue = num.intValue();
            if ((iIntValue & 6) == 0) {
                iIntValue |= aVar2.e(j) ? 4 : 2;
            }
            if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                h9n.a(erz.a(2131233731, 0, aVar2), "Left", j.r(h.j(d.a.b, 12.0f, 0.0f, 0.0f, 0.0f, 14), 20.0f), null, null, 0.0f, new gf4(j, 5), aVar2, 432, 56);
            } else {
                aVar2.G();
            }
            return Unit.a;
        }
    }
}
