package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.v;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
public final class y7w {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final float f, float f2, float f3, final boolean z, final String str, a aVar, final int i) {
        final float f4;
        final float f5;
        float f6;
        float f7;
        float fFloatValue;
        final ytw ytwVar;
        final float f8;
        int i2;
        int i3;
        float f9;
        str.getClass();
        b bVarI = aVar.i(1514220691);
        int i4 = i | (bVarI.c(f) ? 32 : 16) | 3456 | (bVarI.b(z) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.M(str) ? 131072 : 65536);
        if (bVarI.q(i4 & 1, (74899 & i4) != 74898)) {
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = m.b(0);
                bVarI.r(objY);
            }
            final ytw ytwVar2 = (ytw) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = m.b(0);
                bVarI.r(objY2);
            }
            final ytw ytwVar3 = (ytw) objY2;
            Context context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = m.b(Float.valueOf(0.0f));
                bVarI.r(objY3);
            }
            ytw ytwVar4 = (ytw) objY3;
            Boolean bool = Boolean.TRUE;
            boolean z2 = (i4 & 112) == 32;
            Object objY4 = bVarI.y();
            if (z2 || objY4 == c0042a) {
                objY4 = new x7w(f, ytwVar4, null);
                bVarI.r(objY4);
            }
            xvf.e(bVarI, bool, (Function2) objY4);
            Object objY5 = bVarI.y();
            if (objY5 == c0042a) {
                nan.a aVar2 = new nan.a(context);
                aVar2.c = str;
                abn.a(aVar2, false);
                p4h.b<List<osg0>> bVar = uan.a;
                aVar2.c().a(abn.a, ltg0.a.a);
                objY5 = aVar2.a();
                bVarI.r(objY5);
            }
            nan nanVar = (nan) objY5;
            d.a aVar3 = d.a.b;
            float f10 = 1.0f;
            d dVarE = j.e(aVar3, 1.0f);
            Object objY6 = bVarI.y();
            final float f11 = 1.2f;
            if (objY6 == c0042a) {
                objY6 = new Function1() { // from class: s7w
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        a7l a7lVar = (a7l) obj;
                        a7lVar.getClass();
                        float f12 = f11;
                        a7lVar.k(f12);
                        a7lVar.v(f12);
                        return Unit.a;
                    }
                };
                bVarI.r(objY6);
            }
            d dVarA = androidx.compose.ui.graphics.a.a(dVarE, (Function1) objY6);
            Object objY7 = bVarI.y();
            if (objY7 == c0042a) {
                objY7 = new Function1() { // from class: t7w
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        urr urrVar = (urr) obj;
                        urrVar.getClass();
                        ytwVar2.setValue(Integer.valueOf((int) (urrVar.a() >> 32)));
                        ytwVar3.setValue(Integer.valueOf((int) (urrVar.a() & 4294967295L)));
                        return Unit.a;
                    }
                };
                bVarI.r(objY7);
            }
            d dVarA2 = v.a(dVarA, (Function1) objY7);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarA2);
            yka.k.getClass();
            tsr.a aVar4 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            bVarI.N(60647275);
            if (((Number) ytwVar2.getValue()).intValue() == 0 || ((Number) ytwVar3.getValue()).intValue() == 0) {
                f6 = 1.2f;
                bVarI.X(false);
            } else {
                if (z) {
                    fFloatValue = -(((Number) ytwVar4.getValue()).floatValue() % ((Number) ytwVar3.getValue()).intValue());
                    f7 = 0.0f;
                } else {
                    f7 = -(((Number) ytwVar4.getValue()).floatValue() % ((Number) ytwVar2.getValue()).intValue());
                    fFloatValue = ((((Number) ytwVar4.getValue()).floatValue() * 0.35f) % ((Number) ytwVar3.getValue()).intValue()) - ((Number) ytwVar3.getValue()).intValue();
                }
                bVarI.N(417608373);
                int i5 = 0;
                while (true) {
                    int i6 = 2;
                    if (i5 >= 2) {
                        break;
                    }
                    bVarI.N(417609293);
                    int i7 = 0;
                    while (i7 < i6) {
                        d dVarE2 = j.e(aVar3, f10);
                        boolean zC = bVarI.c(f7) | bVarI.d(i5) | bVarI.c(fFloatValue) | bVarI.d(i7);
                        Object objY8 = bVarI.y();
                        if (zC || objY8 == c0042a) {
                            ytwVar = ytwVar2;
                            f8 = fFloatValue;
                            final int i8 = i5;
                            final float f12 = f7;
                            final int i9 = i7;
                            objY8 = new Function1() { // from class: u7w
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    a7l a7lVar = (a7l) obj;
                                    a7lVar.getClass();
                                    a7lVar.B(f12 + (((Number) ytwVar.getValue()).intValue() * i8));
                                    a7lVar.f(f8 + (((Number) ytwVar3.getValue()).intValue() * i9));
                                    a7lVar.b(0.8f);
                                    return Unit.a;
                                }
                            };
                            i2 = i9;
                            i3 = i8;
                            f9 = f12;
                            bVarI.r(objY8);
                        } else {
                            ytwVar = ytwVar2;
                            f8 = fFloatValue;
                            i3 = i5;
                            f9 = f7;
                            i2 = i7;
                        }
                        fn80.a(nanVar, null, androidx.compose.ui.graphics.a.a(dVarE2, (Function1) objY8), d0b.a.a, null, 0.0f, null, null, null, bVarI, 3120, 2032);
                        i7 = i2 + 1;
                        c0042a = c0042a;
                        f7 = f9;
                        fFloatValue = f8;
                        i5 = i3;
                        ytwVar2 = ytwVar;
                        i6 = i6;
                        f10 = 1.0f;
                    }
                    bVarI.X(false);
                    i5++;
                    f10 = 1.0f;
                }
                f6 = 1.2f;
                bVarI.X(false);
                bVarI.X(false);
            }
            bVarI.X(true);
            f5 = 0.35f;
            f4 = f6;
        } else {
            bVarI.G();
            f4 = f2;
            f5 = f3;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(f, f4, f5, z, str, i) { // from class: v7w
                public final /* synthetic */ float a;
                public final /* synthetic */ float b;
                public final /* synthetic */ float c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ String e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(7);
                    y7w.a(this.a, this.b, this.c, this.d, this.e, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
