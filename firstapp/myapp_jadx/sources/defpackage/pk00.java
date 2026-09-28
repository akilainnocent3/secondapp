package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes6.dex */
public final class pk00 {
    public static final void a(int i, a aVar) {
        b bVarI = aVar.i(-1407223745);
        if (bVarI.q(i & 1, i != 0)) {
            d.a aVar2 = d.a.b;
            d dVarH = g3w.h(h.g(androidx.compose.foundation.a.b(j.g(aVar2, 1.0f), c68.a(R.color.background_type1_primary, bVarI), zk40.a), 12.0f, 8.0f), "personal_code_one_up_two_up_hint");
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarH);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            h6n.b(erz.a(R.drawable.ic_check_circle_green_20dp, 0, bVarI), null, g3w.h(j.r(aVar2, 14.0f), "personal_code_one_up_two_up_hint_icon"), j58.m, bVarI, 3504, 0);
            lkf0.d(cb40.a(R.string.personal_page__one_up_two_up_reward_hint, new Object[0], bVarI), g3w.h(lt6.b(aVar2, 6.0f, bVarI, 1.0f, true), "personal_code_one_up_two_up_hint_text"), c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, mla.l(R.style.B2_M, bVarI), bVarI, 0, 24960, 110584);
            bVarI = bVarI;
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new mk00();
        }
    }

    public static final void b(final kl00 kl00Var, SimpleDateFormat simpleDateFormat, SimpleDateFormat simpleDateFormat2, List<j58> list, final Function1<? super jl00, Unit> function1, a aVar, final int i, final int i2) {
        int i3;
        SimpleDateFormat simpleDateFormat3;
        SimpleDateFormat simpleDateFormat4;
        b bVar;
        final SimpleDateFormat simpleDateFormat5;
        final SimpleDateFormat simpleDateFormat6;
        final List<j58> list2;
        int i4;
        final SimpleDateFormat simpleDateFormat7;
        final List<j58> listK;
        boolean z;
        boolean z2;
        List<jl00> list3;
        kl00Var.getClass();
        function1.getClass();
        b bVarI = aVar.i(1974694020);
        if ((i & 6) == 0) {
            i3 = (bVarI.M(kl00Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                simpleDateFormat3 = simpleDateFormat;
                int i5 = bVarI.A(simpleDateFormat3) ? 32 : 16;
                i3 |= i5;
            } else {
                simpleDateFormat3 = simpleDateFormat;
            }
            i3 |= i5;
        } else {
            simpleDateFormat3 = simpleDateFormat;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                simpleDateFormat4 = simpleDateFormat2;
                int i6 = bVarI.A(simpleDateFormat4) ? 256 : 128;
                i3 |= i6;
            } else {
                simpleDateFormat4 = simpleDateFormat2;
            }
            i3 |= i6;
        } else {
            simpleDateFormat4 = simpleDateFormat2;
        }
        if ((i & 3072) == 0) {
            i3 |= 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= bVarI.A(function1) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if (bVarI.q(i3 & 1, (i3 & 9363) != 9362)) {
            bVarI.A0();
            int i7 = i & 1;
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (i7 == 0 || bVarI.h0()) {
                if ((i2 & 2) != 0) {
                    Object objY = bVarI.y();
                    if (objY == c0042a) {
                        objY = new SimpleDateFormat("dd/MM EEE HH:mm", Locale.ENGLISH);
                        bVarI.r(objY);
                    }
                    simpleDateFormat3 = (SimpleDateFormat) objY;
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    Object objY2 = bVarI.y();
                    if (objY2 == c0042a) {
                        objY2 = new SimpleDateFormat("HH:mm", Locale.ENGLISH);
                        bVarI.r(objY2);
                    }
                    simpleDateFormat4 = (SimpleDateFormat) objY2;
                    i3 &= -897;
                }
                i4 = i3 & (-7169);
                simpleDateFormat7 = simpleDateFormat4;
                listK = kotlin.collections.b.k(new j58(c68.a(R.color.background_type1_quaternary, bVarI)), new j58(j58.l));
            } else {
                bVarI.G();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                i4 = i3 & (-7169);
                simpleDateFormat7 = simpleDateFormat4;
                listK = list;
            }
            bVarI.Y();
            d.a aVar2 = d.a.b;
            final SimpleDateFormat simpleDateFormat8 = simpleDateFormat3;
            d dVarB = androidx.compose.foundation.a.b(j.g(aVar2, 1.0f), c68.a(R.color.background_type1_quaternary, bVarI), zk40.a);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarB);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            if (kl00Var.c != 1 || ((list3 = kl00Var.n) != null && list3.isEmpty())) {
                z = false;
                bVarI.N(2014006100);
                bVarI.X(false);
            } else {
                Iterator<T> it = list3.iterator();
                while (true) {
                    if (it.hasNext()) {
                        jl00 jl00Var = (jl00) it.next();
                        int i8 = jl00Var.g;
                        String str = jl00Var.h;
                        String strValueOf = String.valueOf(i8);
                        if (Intrinsics.g(strValueOf, "60200") || Intrinsics.g(strValueOf, "60100") || StringsKt.M(str, "1UP", true) || StringsKt.M(str, "2UP", true)) {
                            bVarI.N(2013961894);
                            z = false;
                            a(0, bVarI);
                            bVarI.X(false);
                        }
                    } else {
                        z = false;
                        bVarI.N(2014006100);
                        bVarI.X(false);
                    }
                }
            }
            d dVarG = j.g(aVar2, 1.0f);
            aiv aivVarC = g75.c(ht.a.e, z);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarG);
            yka.k.getClass();
            tsr.a aVar4 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS2, yka.a.e);
            yka.a.C1350a c1350a2 = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a2);
            }
            hlh0.a(bVarI, dVarC2, yka.a.d);
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = h.g(j.j(j.g(aVar2, 1.0f), 0.0f, 146.0f), 8.0f, 8.0f);
                bVarI.r(objY3);
            }
            d dVarN = (d) objY3;
            Object objY4 = bVarI.y();
            if (objY4 == c0042a) {
                objY4 = androidx.compose.ui.draw.a.c(androidx.compose.ui.graphics.a.c(aVar2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, 458751), new Function1() { // from class: jk00
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        lza lzaVar = (lza) obj;
                        lzaVar.getClass();
                        lzaVar.b2();
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L)) - lzaVar.C1(34.0f);
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L));
                        if ((8 & 2) != 0) {
                            fIntBitsToFloat = 0.0f;
                        }
                        if ((8 & 4) != 0) {
                            fIntBitsToFloat2 = Float.POSITIVE_INFINITY;
                        }
                        tcf.V1(lzaVar, new hfs(listK, null, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2))), (8 & 8) != 0 ? 0 : 2), 0L, 0L, 0.0f, null, null, 6, 62);
                        return Unit.a;
                    }
                });
                bVarI.r(objY4);
            }
            d dVar = (d) objY4;
            zzr zzrVarA = e0s.a(0, 3, bVarI);
            Object objY5 = bVarI.y();
            if (objY5 == c0042a) {
                z2 = true;
                objY5 = a6a0.b(new oar(zzrVarA, 1 == true ? 1 : 0));
                bVarI.r(objY5);
            } else {
                z2 = true;
            }
            if (!((Boolean) ((twd0) objY5).getValue()).booleanValue()) {
                dVarN = dVarN.n(dVar);
            }
            kw0.i iVar = new kw0.i(4.0f, false, new jw0(ht.a.k));
            boolean zA = ((i4 & 14) == 4 ? z2 : false) | bVarI.A(simpleDateFormat8) | bVarI.A(simpleDateFormat7) | ((i4 & 57344) == 16384 ? z2 : false);
            Object objY6 = bVarI.y();
            if (zA != 0 || objY6 == c0042a) {
                objY6 = new Function1() { // from class: kk00
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        szr szrVar = (szr) obj;
                        szrVar.getClass();
                        final kl00 kl00Var2 = kl00Var;
                        int size = kl00Var2.n.size();
                        sar sarVar = new sar(kl00Var2, 2);
                        nk00 nk00Var = new nk00();
                        final SimpleDateFormat simpleDateFormat9 = simpleDateFormat8;
                        final SimpleDateFormat simpleDateFormat10 = simpleDateFormat7;
                        final Function1 function2 = function1;
                        szrVar.d(size, sarVar, nk00Var, new op8(-466647510, new iaj() { // from class: ok00
                            @Override // defpackage.iaj
                            public final Object d(Object obj2, Object obj3, Object obj4, Object obj5) {
                                int iIntValue = ((Integer) obj3).intValue();
                                a aVar5 = (a) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                ((gwr) obj2).getClass();
                                if ((iIntValue2 & 48) == 0) {
                                    iIntValue2 |= aVar5.d(iIntValue) ? 32 : 16;
                                }
                                if (aVar5.q(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                                    ui00.f(kl00Var2.n.get(iIntValue), simpleDateFormat9, simpleDateFormat10, function2, aVar5, 0);
                                } else {
                                    aVar5.G();
                                }
                                return Unit.a;
                            }
                        }, true));
                        return Unit.a;
                    }
                };
                bVarI.r(objY6);
            }
            aur.a(dVarN, zzrVarA, null, false, iVar, null, null, false, null, (Function1) objY6, bVarI, 24576, 492);
            bVar = bVarI;
            bVar.X(z2);
            bVar.X(z2);
            simpleDateFormat6 = simpleDateFormat7;
            simpleDateFormat5 = simpleDateFormat8;
            list2 = listK;
        } else {
            bVar = bVarI;
            bVar.G();
            simpleDateFormat5 = simpleDateFormat3;
            simpleDateFormat6 = simpleDateFormat4;
            list2 = list;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: lk00
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    pk00.b(kl00Var, simpleDateFormat5, simpleDateFormat6, list2, function1, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }
}
