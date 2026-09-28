package defpackage;

import android.graphics.Color;
import android.graphics.Paint;
import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import androidx.recyclerview.widget.r;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
public final class xka {
    public static final void a(final boolean z, final Function1<? super Boolean, Unit> function1, final t290 t290Var, final boolean z2, final cj5 cj5Var, final float f, float f2, final d dVar, String str, boolean z3, boolean z4, boolean z5, boolean z6, a aVar, final int i, final int i2, final int i3) {
        int i4;
        String str2;
        boolean z7;
        int i5;
        int i6;
        final float f3;
        final boolean z8;
        final boolean z9;
        final boolean z10;
        final String str3;
        final boolean z11;
        b bVar;
        float f4;
        int i7;
        boolean z12;
        Object obj;
        long jW;
        function1.getClass();
        t290Var.getClass();
        cj5Var.getClass();
        b bVarI = aVar.i(1722017060);
        if ((i & 6) == 0) {
            i4 = (bVarI.b(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= bVarI.A(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= bVarI.A(t290Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= bVarI.b(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= bVarI.A(cj5Var) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= bVarI.c(f) ? 131072 : 65536;
        }
        if ((12582912 & i) == 0) {
            i4 |= bVarI.M(dVar) ? 8388608 : 4194304;
        }
        int i8 = i3 & 256;
        if (i8 != 0) {
            i4 |= 100663296;
            str2 = str;
        } else {
            str2 = str;
            if ((i & 100663296) == 0) {
                i4 |= bVarI.M(str2) ? 67108864 : 33554432;
            }
        }
        int i9 = i3 & 512;
        if (i9 != 0) {
            i4 |= 805306368;
            z7 = z3;
        } else {
            z7 = z3;
            if ((i & 805306368) == 0) {
                i4 |= bVarI.b(z7) ? 536870912 : 268435456;
            }
        }
        int i10 = i3 & 1024;
        if (i10 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = i2 | (bVarI.b(z4) ? 4 : 2);
        } else {
            i5 = i2;
        }
        int i11 = i3 & 2048;
        if (i11 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= bVarI.b(z5) ? 32 : 16;
        }
        int i12 = i5;
        int i13 = i4;
        int i14 = i3 & 4096;
        if (i14 != 0) {
            i6 = i12 | 384;
        } else if ((i2 & 384) == 0) {
            i6 = i12 | (bVarI.b(z6) ? 256 : 128);
        } else {
            i6 = i12;
        }
        if (bVarI.q(i13 & 1, ((i13 & 306259091) == 306259090 && (i6 & 147) == 146) ? false : true)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                if ((i3 & 64) != 0) {
                    f4 = f * 2.5f;
                    i7 = i13 & (-3670017);
                } else {
                    f4 = f2;
                    i7 = i13;
                }
                if (i8 != 0) {
                    str2 = null;
                }
                if (i9 != 0) {
                    z7 = false;
                }
                boolean z13 = i10 != 0 ? false : z4;
                z5 = i11 != 0 ? false : z5;
                if (i14 != 0) {
                    f2 = f4;
                    z12 = z7;
                    z4 = z13;
                    z6 = false;
                } else {
                    z6 = z6;
                    f2 = f4;
                    z12 = z7;
                    z4 = z13;
                }
            } else {
                bVarI.G();
                i7 = (i3 & 64) != 0 ? i13 & (-3670017) : i13;
                z12 = z7;
            }
            bVarI.Y();
            mmd mmdVar = (mmd) bVarI.O(kna.h);
            boolean zM = bVarI.M(mmdVar);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (zM || objY == c0042a) {
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setColor(-1);
                paint.setTextSize(mmdVar.D0(d2l.f(10)));
                paint.setTextAlign(Paint.Align.CENTER);
                paint.setShadowLayer(mmdVar.C1(1.5f), 0.0f, mmdVar.C1(0.5f), Color.argb(r.d.DEFAULT_DRAG_ANIMATION_DURATION, 0, 0, 0));
                bVarI.r(paint);
                obj = paint;
            } else {
                obj = objY;
            }
            final Paint paint2 = (Paint) obj;
            if (z && z6) {
                jW = cj5Var.b;
            } else if (z) {
                jW = cj5Var.v();
            } else {
                jW = (z12 && z4) ? cj5Var.d : cj5Var.w();
            }
            final twd0 twd0VarA = hw90.a(jW, yi0.e(r.d.DEFAULT_DRAG_ANIMATION_DURATION, 0, null, 6), "bgColor", bVarI, 432, 8);
            final twd0 twd0VarA2 = hw90.a(r58.d(z ? 4293901573L : 2986344448L), yi0.e(r.d.DEFAULT_DRAG_ANIMATION_DURATION, 0, null, 6), "bgColor", bVarI, 432, 8);
            long jY = (z || (z12 && z4)) ? cj5Var.y() : cj5Var.x();
            final long jD = r58.d(4285753359L);
            final long jD2 = r58.d(4288181177L);
            d dVarA = ls7.a(j.t(dVar, f * 2.5f, f), j060.b(50));
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = rzk.a(bVarI);
            }
            psw pswVar = (psw) objY2;
            boolean zA = bVarI.A(t290Var) | ((i7 & 112) == 32) | ((i7 & 14) == 4);
            Object objY3 = bVarI.y();
            if (zA || objY3 == c0042a) {
                objY3 = new Function0() { // from class: tka
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        if (t290Var.x1()) {
                            function1.invoke(Boolean.valueOf(!z));
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(objY3);
            }
            final boolean z14 = z5;
            final long j = jY;
            final String str4 = str2;
            q75.a(dw.a(androidx.compose.foundation.d.b(dVarA, pswVar, null, false, null, (Function0) objY3, 28), (!z2 || z) ? 1.0f : 0.6f), null, false, pp8.b(1863631374, new gaj(z, z14, str4, paint2, jD, jD2, j, twd0VarA2, twd0VarA) { // from class: uka
                public final /* synthetic */ boolean a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ String c;
                public final /* synthetic */ Paint d;
                public final /* synthetic */ long e;
                public final /* synthetic */ long f;
                public final /* synthetic */ twd0 i;
                public final /* synthetic */ twd0 v;

                {
                    this.f = j;
                    this.i = twd0VarA2;
                    this.v = twd0VarA;
                }

                @Override // defpackage.gaj
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    final String str5;
                    r75 r75Var = (r75) obj2;
                    a aVar2 = (a) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    r75Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar2.M(r75Var) ? 4 : 2;
                    }
                    if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        float fE = r75Var.e() * 0.15f;
                        float fE2 = r75Var.e() - (2.0f * fE);
                        boolean z15 = this.a;
                        if (z15) {
                            fE = (r75Var.d() - fE2) - fE;
                        }
                        twd0 twd0VarA3 = xe0.a(fE, yi0.e(r.d.DEFAULT_DRAG_ANIMATION_DURATION, 0, null, 6), "ThumbOffset", aVar2, 432, 8);
                        d.a aVar3 = d.a.b;
                        d dVarF = r75Var.f(aVar3);
                        boolean z16 = this.b;
                        d dVarB = androidx.compose.foundation.a.b(dVarF, z16 ? ((j58) this.i.getValue()).a : ((j58) this.v.getValue()).a, zk40.a);
                        if (!z15 || (str5 = this.c) == null || str5.length() == 0) {
                            aVar2.N(-1598236897);
                            g75.a(dVarB, aVar2, 0);
                            aVar2.H();
                        } else {
                            aVar2.N(-1599163208);
                            final Paint paint3 = this.d;
                            boolean zA2 = aVar2.A(paint3) | aVar2.M(str5);
                            Object objY4 = aVar2.y();
                            if (zA2 || objY4 == a.C0041a.a) {
                                objY4 = new Function1() { // from class: wka
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj5) {
                                        lza lzaVar = (lza) obj5;
                                        lzaVar.getClass();
                                        lzaVar.b2();
                                        float fIntBitsToFloat = Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L)) * 0.25f;
                                        float fIntBitsToFloat2 = ((Float.intBitsToFloat((int) (lzaVar.d() >> 32)) - (Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L)) - (fIntBitsToFloat * 2.0f))) - fIntBitsToFloat) / 2.0f;
                                        Paint paint4 = paint3;
                                        Paint.FontMetrics fontMetrics = paint4.getFontMetrics();
                                        i40.c(lzaVar.F1().a()).drawText(str5, fIntBitsToFloat2, ((Float.intBitsToFloat((int) (4294967295L & lzaVar.d())) / 2.0f) - ((fontMetrics.descent - fontMetrics.ascent) / 2.0f)) - fontMetrics.ascent, paint4);
                                        return Unit.a;
                                    }
                                };
                                aVar2.r(objY4);
                            }
                            g75.a(androidx.compose.ui.draw.a.c(dVarB, (Function1) objY4), aVar2, 0);
                            aVar2.H();
                        }
                        g75.a(androidx.compose.foundation.a.b(r75Var.b(g.d(j.r(aVar3, fE2), ((g7f) twd0VarA3.getValue()).a, 0.0f, 2), ht.a.d), z16 ? this.e : this.f, j060.a), aVar2, 0);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 3072, 6);
            bVar = bVarI;
            str3 = str4;
            f3 = f2;
            z10 = z12;
            z9 = z6;
            z11 = z14;
            z8 = z4;
        } else {
            b bVar2 = bVarI;
            bVar2.G();
            f3 = f2;
            z8 = z4;
            z9 = z6;
            z10 = z7;
            str3 = str2;
            z11 = z5;
            bVar = bVar2;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: vka
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iA = qj40.a(i | 1);
                    int iA2 = qj40.a(i2);
                    xka.a(z, function1, t290Var, z2, cj5Var, f, f3, dVar, str3, z10, z8, z11, z9, (a) obj2, iA, iA2, i3);
                    return Unit.a;
                }
            };
        }
    }
}
