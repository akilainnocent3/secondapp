package defpackage;

import androidx.compose.animation.f;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class sk7 implements Function2<a, Integer, Unit> {
    public final /* synthetic */ float a;
    public final /* synthetic */ tmz b;
    public final /* synthetic */ long c;
    public final /* synthetic */ op8 d;
    public final /* synthetic */ long e;

    public sk7(float f, tmz tmzVar, long j, op8 op8Var, long j2) {
        this.a = f;
        this.b = tmzVar;
        this.c = j;
        this.d = op8Var;
        this.e = j2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            goh gohVarB = a6w.b(z5w.e, aVar2);
            goh gohVarB2 = a6w.b(z5w.d, aVar2);
            goh gohVarB3 = a6w.b(z5w.b, aVar2);
            goh gohVarB4 = a6w.b(z5w.c, aVar2);
            float f = this.a;
            d.a aVar3 = d.a.b;
            d dVarE = h.e(j.b(aVar3, 0.0f, f, 1), this.b);
            Object objY = aVar2.y();
            if (objY == a.C0041a.a) {
                objY = new wk7();
                aVar2.r(objY);
            }
            wk7 wk7Var = (wk7) objY;
            int I = aVar2.I();
            ne00 ne00VarO = aVar2.o();
            d dVarC = c.c(aVar2, dVarE);
            yka.k.getClass();
            tsr.a aVar4 = yka.a.b;
            if (aVar2.k() == null) {
                l2a.b();
                throw null;
            }
            aVar2.D();
            if (aVar2.g()) {
                aVar2.F(aVar4);
            } else {
                aVar2.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(aVar2, wk7Var, bVar);
            yka.a.d dVar = yka.a.e;
            hlh0.a(aVar2, ne00VarO, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(I))) {
                j3c.a(I, aVar2, I, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(aVar2, dVarC, cVar);
            d dVarB = i.b(aVar3, "leadingIcon");
            n54.a aVar5 = ht.a.m;
            hh0.e(false, dVarB, f.b(gohVarB3, aVar5, 12).b(f.f(gohVarB, 2)), f.j(gohVarB4, aVar5, 12).b(f.g(gohVarB2, 2)), null, pp8.b(687705959, new qk7(), aVar2), aVar2, 196656, 16);
            d dVarB2 = i.b(aVar3, "label");
            umz umzVar = uk7.a;
            d dVarH = h.h(dVarB2, 8.0f, 0.0f, 2);
            d160 d160VarA = b160.a(kw0.a, ht.a.k, aVar2, 54);
            int I2 = aVar2.I();
            ne00 ne00VarO2 = aVar2.o();
            d dVarC2 = c.c(aVar2, dVarH);
            if (aVar2.k() == null) {
                l2a.b();
                throw null;
            }
            aVar2.D();
            if (aVar2.g()) {
                aVar2.F(aVar4);
            } else {
                aVar2.p();
            }
            hlh0.a(aVar2, d160VarA, bVar);
            hlh0.a(aVar2, ne00VarO2, dVar);
            if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(I2))) {
                j3c.a(I2, aVar2, I2, c1350a);
            }
            hlh0.a(aVar2, dVarC2, cVar);
            this.d.invoke(aVar2, 0);
            aVar2.s();
            d dVarB3 = i.b(aVar3, "trailingIcon");
            n54.a aVar6 = ht.a.o;
            hh0.e(false, dVarB3, f.b(gohVarB3, aVar6, 12).b(f.f(gohVarB, 2)), f.j(gohVarB4, aVar6, 12).b(f.g(gohVarB2, 2)), null, pp8.b(1905252304, new rk7(), aVar2), aVar2, 196656, 16);
            aVar2.s();
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
