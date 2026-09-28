package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.protobuf.Reader;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes.dex */
public final class bgd implements sv90 {
    public static final bgd a = new bgd();

    public static final class a implements PointerInputEventHandler {
        public static final a a = new a();

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(u020 u020Var, v1b<? super Unit> v1bVar) {
            return Unit.a;
        }
    }

    public static final class b implements Function2<androidx.compose.runtime.a, Integer, Unit> {
        public final /* synthetic */ tv90 a;

        public b(tv90 tv90Var) {
            this.a = tv90Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            int iIntValue = num.intValue();
            if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                gaj<e160, androidx.compose.runtime.a, Integer, Unit> gajVar = this.a.g;
                d160 d160VarA = b160.a(kw0.b, ht.a.k, aVar2, 54);
                int I = aVar2.I();
                ne00 ne00VarO = aVar2.o();
                d dVarC = androidx.compose.ui.c.c(aVar2, d.a.b);
                yka.k.getClass();
                tsr.a aVar3 = yka.a.b;
                if (aVar2.k() == null) {
                    l2a.b();
                    throw null;
                }
                aVar2.D();
                if (aVar2.g()) {
                    aVar2.F(aVar3);
                } else {
                    aVar2.p();
                }
                hlh0.a(aVar2, d160VarA, yka.a.f);
                hlh0.a(aVar2, ne00VarO, yka.a.e);
                yka.a.C1350a c1350a = yka.a.g;
                if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(I))) {
                    j3c.a(I, aVar2, I, c1350a);
                }
                hlh0.a(aVar2, dVarC, yka.a.d);
                gajVar.invoke(f160.a, aVar2, 6);
                aVar2.s();
            } else {
                aVar2.G();
            }
            return Unit.a;
        }
    }

    public static final class c implements Function0<j58> {
        public final /* synthetic */ tv90 a;

        public c(tv90 tv90Var) {
            this.a = tv90Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public final j58 invoke() {
            c1g0 c1g0Var = this.a.j;
            return new j58(r58.i(xkf.c.a(0.0f > 0.01f ? 1.0f : 0.0f), c1g0Var.a, c1g0Var.b));
        }
    }

    @Override // defpackage.sv90
    public final void a(final tv90 tv90Var, androidx.compose.runtime.a aVar, final int i) {
        float f = tv90Var.h;
        androidx.compose.runtime.b bVarI = aVar.i(2137486921);
        int i2 = (bVarI.M(tv90Var) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            c1g0 c1g0Var = tv90Var.j;
            if (Float.isNaN(f) || (Float.floatToRawIntBits(f) & Reader.READ_DONE) >= 2139095040) {
                hb5.a("The expandedHeight is expected to be specified and finite");
                return;
            }
            boolean zM = bVarI.M(c1g0Var) | bVarI.M(null);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (zM || objY == c0042a) {
                objY = a6a0.b(new c(tv90Var));
                bVarI.r(objY);
            }
            final twd0 twd0VarA = hw90.a(((j58) ((twd0) objY).getValue()).a, a6w.b(z5w.c, bVarI), null, bVarI, 0, 12);
            op8 op8VarB = pp8.b(-1658896622, new b(tv90Var), bVarI);
            bVarI.N(690108113);
            bVarI.X(false);
            d dVar = tv90Var.a;
            d.a aVar2 = d.a.b;
            d dVarN = dVar.n(aVar2);
            boolean zM2 = bVarI.M(twd0VarA);
            Object objY2 = bVarI.y();
            if (zM2 || objY2 == c0042a) {
                objY2 = new Function1() { // from class: wfd
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        tcf tcfVar = (tcf) obj;
                        long j = ((j58) twd0VarA.getValue()).a;
                        if (!nbh0.a(j, j58.m)) {
                            tcf.m0(tcfVar, j, 0L, 0L, 0.0f, null, 0, WebSocketProtocol.PAYLOAD_SHORT);
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(objY2);
            }
            d dVarA = androidx.compose.ui.draw.a.a(dVarN, (Function1) objY2);
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = new xfd();
                bVarI.r(objY3);
            }
            d dVarB = xa80.b(dVarA, false, (Function1) objY3);
            Unit unit = Unit.a;
            Object objY4 = bVarI.y();
            if (objY4 == c0042a) {
                objY4 = a.a;
                bVarI.r(objY4);
            }
            d dVarA2 = wje0.a(dVarB, unit, (PointerInputEventHandler) objY4);
            aiv aivVarC = g75.c(ht.a.a, false);
            int I = bVarI.I();
            ne00 ne00VarS = bVarI.S();
            d dVarC = androidx.compose.ui.c.c(bVarI, dVarA2);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(I))) {
                n30.a(I, bVarI, I, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            d dVarB2 = ls7.b(u8j0.a(aVar2, tv90Var.i));
            chf chfVar = vp0.a;
            boolean z = (i2 & 14) == 4;
            Object objY5 = bVarI.y();
            if (z || objY5 == c0042a) {
                objY5 = new yfd();
                bVarI.r(objY5);
            }
            fxh fxhVar = (fxh) objY5;
            long j = c1g0Var.c;
            long j2 = c1g0Var.d;
            long j3 = c1g0Var.e;
            long j4 = c1g0Var.f;
            op8 op8Var = tv90Var.b;
            imf0 imf0Var = tv90Var.c;
            imf0 imf0Var2 = tv90Var.d;
            n54.a aVar4 = tv90Var.e;
            Function2<androidx.compose.runtime.a, Integer, Unit> function2 = tv90Var.f;
            float f2 = tv90Var.h;
            Object objY6 = bVarI.y();
            if (objY6 == c0042a) {
                objY6 = new zfd();
                bVarI.r(objY6);
            }
            vp0.d(dVarB2, fxhVar, j, j2, j4, j3, op8Var, imf0Var, imf0Var2, (Function0) objY6, aVar4, function2, op8VarB, f2, bVarI, 0);
            bVarI = bVarI;
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(tv90Var, i) { // from class: agd
                public final /* synthetic */ tv90 b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    this.a.a(this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
