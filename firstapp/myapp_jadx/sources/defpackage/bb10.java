package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
public final class bb10 {
    public static final void a(final String str, d dVar, final Function0 function0, final Function0 function1, final Function0 function2, a aVar, final int i) {
        final d dVar2;
        str.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        b bVarI = aVar.i(1590620333);
        int i2 = i | (bVarI.M(str) ? 4 : 2) | 48 | (bVarI.A(function0) ? 256 : 128) | (bVarI.A(function1) ? 2048 : 1024) | (bVarI.A(function2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            d.a aVar2 = d.a.b;
            d dVarB = androidx.compose.foundation.a.b(j.i(j.g(aVar2, 1.0f), 44.0f), c68.a(R.color.bg_primary_d_base, bVarI), zk40.a);
            i0b.a(bVarI, -1003410150, 212064437, false);
            mmd mmdVar = (mmd) bVarI.O(kna.h);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = rzj.a(mmdVar, bVarI);
            }
            niv nivVar = (niv) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = pzj.a(bVarI);
            }
            nwa nwaVar = (nwa) objY2;
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = m.b(Boolean.FALSE);
                bVarI.r(objY3);
            }
            ytw ytwVar = (ytw) objY3;
            Object objY4 = bVarI.y();
            if (objY4 == c0042a) {
                objY4 = qzj.a(nwaVar, bVarI);
            }
            twa twaVar = (twa) objY4;
            Object objY5 = bVarI.y();
            if (objY5 == c0042a) {
                objY5 = m.a(Unit.a, epx.a);
                bVarI.r(objY5);
            }
            ytw ytwVar2 = (ytw) objY5;
            boolean zD = bVarI.d(257) | bVarI.A(nivVar);
            Object objY6 = bVarI.y();
            if (zD || objY6 == c0042a) {
                objY6 = new sa10(ytwVar2, nivVar, twaVar, ytwVar);
                bVarI.r(objY6);
            }
            aiv aivVar = (aiv) objY6;
            Object objY7 = bVarI.y();
            if (objY7 == c0042a) {
                objY7 = new ta10(ytwVar, twaVar);
                bVarI.r(objY7);
            }
            Function0 function3 = (Function0) objY7;
            boolean zA = bVarI.A(nivVar);
            Object objY8 = bVarI.y();
            if (zA || objY8 == c0042a) {
                objY8 = new ua10(nivVar);
                bVarI.r(objY8);
            }
            lsr.a(xa80.b(dVarB, false, (Function1) objY8), pp8.b(1200550679, new va10(ytwVar2, nwaVar, function3, function0, str, function1, function2), bVarI), aivVar, bVarI, 48);
            bVarI.X(false);
            dVar2 = aVar2;
        } else {
            bVarI.G();
            dVar2 = dVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, dVar2, function0, function1, function2, i) { // from class: ra10
                public final /* synthetic */ String a;
                public final /* synthetic */ d b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ Function0 d;
                public final /* synthetic */ Function0 e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    bb10.a(this.a, this.b, this.c, this.d, this.e, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
