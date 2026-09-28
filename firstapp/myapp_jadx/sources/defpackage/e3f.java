package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e3f {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final d dVar, final f3f f3fVar, final Function0 function0, final Function0 function1, a aVar, final int i) {
        float f;
        b bVarA = v2g.a(function0, function1, aVar, 1920737847);
        int i2 = i | (bVarA.M(dVar) ? 4 : 2) | (bVarA.d(f3fVar.ordinal()) ? 32 : 16) | (bVarA.A(function0) ? 256 : 128) | (bVarA.A(function1) ? 2048 : 1024);
        if (bVarA.q(i2 & 1, (i2 & 1171) != 1170)) {
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objY = bVarA.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (z || objY == c0042a) {
                objY = m.b(Boolean.FALSE);
                bVarA.r(objY);
            }
            ytw ytwVar = (ytw) objY;
            boolean z2 = i3 == 32;
            Object objY2 = bVarA.y();
            if (z2 || objY2 == c0042a) {
                objY2 = m.b(Boolean.FALSE);
                bVarA.r(objY2);
            }
            ytw ytwVar2 = (ytw) objY2;
            ytw ytwVarC = m.c(function0, bVarA);
            f4c f4cVar = new f4c(0.25f, 0.1f, 0.25f, 1.0f);
            float f2 = 0.0f;
            if (((Boolean) ytwVar.getValue()).booleanValue()) {
                f = 1.0f;
            } else {
                f = f3fVar == f3f.GOAL ? 0.0f : 0.5f;
            }
            int i4 = ((Boolean) ytwVar.getValue()).booleanValue() ? 500 : 300;
            f3f f3fVar2 = f3f.GOAL;
            twd0 twd0VarB = xe0.b(f, yi0.e(i4, 0, f3fVar == f3fVar2 ? new f4c(0.175f, 0.885f, 0.32f, 1.275f) : f4cVar, 2), "don_post_image_scale", null, bVarA, 3072, 20);
            twd0 twd0VarB2 = xe0.b((((Boolean) ytwVar.getValue()).booleanValue() || f3fVar == f3fVar2) ? 1.0f : 0.0f, yi0.e(300, 0, f4cVar, 2), "don_post_image_alpha", null, bVarA, 3120, 20);
            twd0 twd0VarB3 = xe0.b(((Boolean) ytwVar2.getValue()).booleanValue() ? 0.5f : 0.0f, yi0.e(300, 0, xkf.d, 2), "don_post_overlay_alpha", null, bVarA, 3072, 20);
            boolean zM = ((i2 & 7168) == 2048) | bVarA.M(ytwVarC) | bVarA.M(ytwVar) | bVarA.M(ytwVar2);
            Object objY3 = bVarA.y();
            if (zM || objY3 == c0042a) {
                objY3 = new d3f(function1, ytwVarC, ytwVar, ytwVar2, null);
                bVarA.r(objY3);
            }
            xvf.e(bVarA, f3fVar, (Function2) objY3);
            d dVarE = j.e(dVar, 1.0f);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarA.T);
            ne00 ne00VarS = bVarA.S();
            d dVarC = c.c(bVarA, dVarE);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarA.D();
            if (bVarA.S) {
                bVarA.F(aVar2);
            } else {
                bVarA.p();
            }
            hlh0.a(bVarA, aivVarC, yka.a.f);
            hlh0.a(bVarA, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarA.S || !Intrinsics.g(bVarA.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarA, iHashCode, c1350a);
            }
            hlh0.a(bVarA, dVarC, yka.a.d);
            d.a aVar3 = d.a.b;
            g75.a(androidx.compose.foundation.a.b(androidx.compose.ui.graphics.a.c(j.e(aVar3, 1.0f), 0.0f, 0.0f, ((Number) twd0VarB3.getValue()).floatValue(), 0.0f, 0.0f, 0.0f, 0L, null, 524283), j58.b, zk40.a), bVarA, 0);
            String strA = cb40.a(f3fVar == f3fVar2 ? R.string.page_instant_virtual__sporty_penalty_image_goal : R.string.page_instant_virtual__sporty_penalty_image_no_goal, new Object[0], bVarA);
            d dVarG = j.g(aVar3, 1.0f);
            float fFloatValue = ((Number) twd0VarB.getValue()).floatValue();
            float fFloatValue2 = ((Number) twd0VarB.getValue()).floatValue();
            float fFloatValue3 = ((Number) twd0VarB2.getValue()).floatValue();
            if (f3fVar == f3fVar2 && !((Boolean) ytwVar.getValue()).booleanValue()) {
                f2 = -45.0f;
            }
            mw90.a(strA, null, androidx.compose.ui.graphics.a.c(dVarG, fFloatValue, fFloatValue2, fFloatValue3, 0.0f, 0.0f, f2, 0L, null, 524024), null, null, d0b.a.d, null, bVarA, 1572912, 1976);
            bVarA = bVarA;
            bVarA.X(true);
        } else {
            bVarA.G();
        }
        e eVarZ = bVarA.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(f3fVar, function0, function1, i) { // from class: c3f
                public final /* synthetic */ f3f b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ Function0 d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    e3f.a(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
