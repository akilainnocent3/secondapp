package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final class k0a {
    public static final op8 a = new op8(-18915507, a.a, false);
    public static final op8 b = new op8(510399044, c.a, false);
    public static final op8 c = new op8(568381317, d.a, false);
    public static final op8 d = new op8(-328257687, b.a, false);

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
                vsi0.a(h.f(androidx.compose.ui.d.a.b, 5.0f), com.sportygames.newcms.c.c(eyi0.v0.h, new String[0], aVar2), new imf0(j, i7f.b(10.0f, aVar2), new t9i(700), null, null, 0L, null, null, 0, i7f.b(10.0f, aVar2), null, null, 16646136), aVar2, 6);
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
                h9n.a(erz.a(R.drawable.wd_close_icon, 0, aVar2), AnalyticsParam.STORY_SKIP_REASON_CLOSE, j.r(androidx.compose.ui.d.a.b, 11.33f), null, null, 0.0f, new gf4(j, 5), aVar2, 432, 56);
            } else {
                aVar2.G();
            }
            return Unit.a;
        }
    }

    public static final class c implements gaj<j58, androidx.compose.runtime.a, Integer, Unit> {
        public static final c a = new c();

        @Override // defpackage.gaj
        public final Unit invoke(j58 j58Var, androidx.compose.runtime.a aVar, Integer num) {
            long j = j58Var.a;
            androidx.compose.runtime.a aVar2 = aVar;
            int iIntValue = num.intValue();
            if ((iIntValue & 6) == 0) {
                iIntValue |= aVar2.e(j) ? 4 : 2;
            }
            if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                h9n.a(erz.a(R.drawable.wd_minus, 0, aVar2), "-", j.r(androidx.compose.ui.d.a.b, 40.0f), null, null, 0.0f, new gf4(j, 5), aVar2, 432, 56);
            } else {
                aVar2.G();
            }
            return Unit.a;
        }
    }

    public static final class d implements gaj<j58, androidx.compose.runtime.a, Integer, Unit> {
        public static final d a = new d();

        @Override // defpackage.gaj
        public final Unit invoke(j58 j58Var, androidx.compose.runtime.a aVar, Integer num) {
            long j = j58Var.a;
            androidx.compose.runtime.a aVar2 = aVar;
            int iIntValue = num.intValue();
            if ((iIntValue & 6) == 0) {
                iIntValue |= aVar2.e(j) ? 4 : 2;
            }
            if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                h9n.a(erz.a(R.drawable.wd_plus, 0, aVar2), "-", j.r(androidx.compose.ui.d.a.b, 40.0f), null, null, 0.0f, new gf4(j, 5), aVar2, 432, 56);
            } else {
                aVar2.G();
            }
            return Unit.a;
        }
    }
}
