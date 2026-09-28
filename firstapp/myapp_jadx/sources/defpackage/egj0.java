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
public final class egj0 {
    public static final void a(final d dVar, yfj0.c cVar, Function0 function0, Function0 function1, Function0 function2, a aVar, final int i) throws FileNotFoundException {
        final yfj0.c cVar2;
        final Function0 function3;
        final Function0 function4;
        final Function0 function5;
        b bVar;
        cVar.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        b bVarI = aVar.i(737557710);
        int i2 = (bVarI.A(cVar) ? 32 : 16) | i | (bVarI.A(function0) ? 256 : 128) | (bVarI.A(function1) ? 2048 : 1024) | (bVarI.A(function2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            cVar2 = cVar;
            function3 = function0;
            function4 = function1;
            function5 = function2;
            bVar = bVarI;
            qfj0.a(dVar, true, pp8.b(1040518721, new gaj() { // from class: cgj0
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((m75) obj).getClass();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        qyd0 qyd0Var = ejb0.a;
                        d dVarG = h.g(dVar, ((cjb0) aVar2.O(qyd0Var)).h, ((cjb0) aVar2.O(qyd0Var)).i);
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
                        yka.a.b bVar2 = yka.a.f;
                        hlh0.a(aVar2, i78VarA, bVar2);
                        yka.a.d dVar2 = yka.a.e;
                        hlh0.a(aVar2, ne00VarO, dVar2);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        }
                        yka.a.c cVar3 = yka.a.d;
                        hlh0.a(aVar2, dVarC, cVar3);
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
                        hlh0.a(aVar2, i78VarA2, bVar2);
                        hlh0.a(aVar2, ne00VarO2, dVar2);
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode2))) {
                            j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                        }
                        hlh0.a(aVar2, dVarC2, cVar3);
                        String strA = cb40.a(R.string.common_functions__you_won, new Object[0], aVar2);
                        yfj0.c cVar4 = cVar2;
                        bgj0.a(0, aVar2, null, strA, cVar4.b);
                        if (cVar4.a == null) {
                            aVar2.N(-1170657595);
                            aVar2.H();
                        } else {
                            aVar2.N(-1170657594);
                            lfj0.d(null, cVar4.a, function3, function4, aVar2, 0);
                            aVar2.H();
                        }
                        aVar2.s();
                        ibj0.a(6, aVar2, j.g(aVar5, 1.0f), cVar4.b, function5);
                        aVar2.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVar, 438, 0);
        } else {
            cVar2 = cVar;
            function3 = function0;
            function4 = function1;
            function5 = function2;
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            final Function0 function6 = function5;
            final yfj0.c cVar3 = cVar2;
            eVarZ.d = new Function2(cVar3, function3, function4, function6, i) { // from class: dgj0
                public final /* synthetic */ yfj0.c b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ Function0 d;
                public final /* synthetic */ Function0 e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) throws FileNotFoundException {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(71);
                    egj0.a(this.a, this.b, this.c, this.d, this.e, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
