package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import java.io.FileNotFoundException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
public final class dfj0 {
    public static final void a(d dVar, yfj0.b bVar, Function0 function0, Function0 function1, Function0 function2, a aVar, final int i) throws FileNotFoundException {
        final d dVar2;
        final yfj0.b bVar2;
        final Function0 function3;
        final Function0 function4;
        final Function0 function5;
        b bVar3;
        bVar.getClass();
        b bVarI = aVar.i(1864672139);
        int i2 = (bVarI.A(bVar) ? 32 : 16) | i | (bVarI.A(function0) ? 256 : 128) | (bVarI.A(function1) ? 2048 : 1024) | (bVarI.A(function2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            dVar2 = dVar;
            bVar2 = bVar;
            function3 = function0;
            function4 = function1;
            function5 = function2;
            bVar3 = bVarI;
            qfj0.a(null, false, pp8.b(-645105352, new gaj() { // from class: bfj0
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((m75) obj).getClass();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        qyd0 qyd0Var = ejb0.a;
                        d dVarG = h.g(dVar2, ((cjb0) aVar2.O(qyd0Var)).h, ((cjb0) aVar2.O(qyd0Var)).i);
                        kw0.i iVar = new kw0.i(((cjb0) aVar2.O(qyd0Var)).f, true, new hw0());
                        n54.a aVar3 = ht.a.n;
                        i78 i78VarA = g78.a(iVar, aVar3, aVar2, 48);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d dVarC = c.c(aVar2, dVarG);
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
                        yka.a.b bVar4 = yka.a.f;
                        hlh0.a(aVar2, i78VarA, bVar4);
                        yka.a.d dVar3 = yka.a.e;
                        hlh0.a(aVar2, ne00VarO, dVar3);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        }
                        yka.a.c cVar = yka.a.d;
                        hlh0.a(aVar2, dVarC, cVar);
                        zp70 zp70VarA = op70.a(aVar2);
                        d.a aVar5 = d.a.b;
                        d dVarA = zqu.a(1.0f, j.g(op70.c(aVar5, zp70VarA, 14), 1.0f), false);
                        i78 i78VarA2 = g78.a(new kw0.i(((cjb0) aVar2.O(qyd0Var)).f, true, new hw0()), aVar3, aVar2, 48);
                        int iHashCode2 = Long.hashCode(aVar2.m());
                        ne00 ne00VarO2 = aVar2.o();
                        d dVarC2 = c.c(aVar2, dVarA);
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
                        hlh0.a(aVar2, i78VarA2, bVar4);
                        hlh0.a(aVar2, ne00VarO2, dVar3);
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode2))) {
                            j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                        }
                        hlh0.a(aVar2, dVarC2, cVar);
                        lkf0.d(cb40.a(R.string.common_functions__results, new Object[0], aVar2), j.g(aVar5, 1.0f), ((lib0) aVar2.O(oib0.a)).o, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) aVar2.O(kjb0.a)).d, aVar2, 48, 0, 131064);
                        yfj0.b bVar5 = bVar2;
                        if (bVar5.a == null) {
                            aVar2.N(-778168554);
                            aVar2.H();
                        } else {
                            aVar2.N(-778168553);
                            lfj0.d(null, bVar5.a, function3, function4, aVar2, 0);
                            aVar2.H();
                        }
                        aVar2.s();
                        ibj0.a(6, aVar2, j.g(aVar5, 1.0f), bVar5.b, function5);
                        aVar2.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVar3, 384, 3);
        } else {
            dVar2 = dVar;
            bVar2 = bVar;
            function3 = function0;
            function4 = function1;
            function5 = function2;
            bVar3 = bVarI;
            bVar3.G();
        }
        e eVarZ = bVar3.Z();
        if (eVarZ != null) {
            final Function0 function6 = function5;
            final yfj0.b bVar4 = bVar2;
            final d dVar3 = dVar2;
            eVarZ.d = new Function2(bVar4, function3, function4, function6, i) { // from class: cfj0
                public final /* synthetic */ yfj0.b b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ Function0 d;
                public final /* synthetic */ Function0 e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) throws FileNotFoundException {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(71);
                    dfj0.a(this.a, this.b, this.c, this.d, this.e, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
