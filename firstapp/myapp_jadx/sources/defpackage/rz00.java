package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.f;
import kotlin.text.StringsKt;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes4.dex */
public final class rz00 {
    public static final void a(final d dVar, final ijf0 ijf0Var, final gop gopVar, final Function1 function1, uni0 uni0Var, a aVar, final int i) {
        int i2;
        b bVarI = aVar.i(847479412);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(ijf0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.M(gopVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(function1) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if (bVarI.q(i3 & 1, (i3 & 9363) != 9362)) {
            long j = j58.l;
            hna.a(cmf0.a.a(new bmf0(j, j)), pp8.b(-1378032204, new Function2() { // from class: mz00
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        long jA = c68.a(R.color.brand_secondary, aVar2);
                        long jA2 = c68.a(R.color.line_type1_secondary, aVar2);
                        long j2 = j58.l;
                        final lff0 lff0VarD = t9z.d(0L, 0L, 0L, 0L, 0L, 0L, 0L, j2, jA, jA2, c68.a(R.color.background_type1_primary, aVar2), c68.a(R.color.warning_primary, aVar2), 0L, 0L, 0L, aVar2, 2147452671);
                        Object objY = aVar2.y();
                        if (objY == a.C0041a.a) {
                            objY = pr7.a(aVar2);
                        }
                        final psw pswVar = (psw) objY;
                        ab2.a(ijf0Var, function1, j.t(dVar, 40.0f, 44.0f), false, false, imf0.b(mla.l(R.style.H4_M, aVar2), c68.a(R.color.text_type1_primary, aVar2), 0L, null, null, null, 0L, null, null, null, 3, 0L, null, null, 16744446), gopVar, null, true, 0, 0, uni0.a.a, null, pswVar, new soa0(j2), pp8.b(-736659689, new gaj() { // from class: oz00
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                final Function2 function2 = (Function2) obj3;
                                a aVar3 = (a) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                function2.getClass();
                                if ((iIntValue2 & 6) == 0) {
                                    iIntValue2 |= aVar3.A(function2) ? 4 : 2;
                                }
                                if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                    umz umzVar = new umz(0.0f, 0.0f, 0.0f, 0.0f);
                                    op8 op8VarB = pp8.b(-1967164984, new Function2() { // from class: iz00
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj6, Object obj7) {
                                            a aVar4 = (a) obj6;
                                            int iIntValue3 = ((Integer) obj7).intValue();
                                            if (aVar4.q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                function2.invoke(aVar4, 0);
                                            } else {
                                                aVar4.G();
                                            }
                                            return Unit.a;
                                        }
                                    }, aVar3);
                                    final psw pswVar2 = pswVar;
                                    final lff0 lff0Var = lff0VarD;
                                    t9z.a.c("text", op8VarB, true, true, uni0.a.a, pswVar2, false, null, null, null, null, null, lff0Var, umzVar, pp8.b(326941732, new Function2() { // from class: jz00
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj6, Object obj7) {
                                            a aVar4 = (a) obj6;
                                            int iIntValue3 = ((Integer) obj7).intValue();
                                            if (aVar4.q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                t9z.a.b(true, false, pswVar2, lff0Var, j060.c(2.0f), 1.0f, 0.0f, aVar4, 12779958);
                                            } else {
                                                aVar4.G();
                                            }
                                            return Unit.a;
                                        }
                                    }, aVar3), aVar3, 1797558, 16256);
                                } else {
                                    aVar3.G();
                                }
                                return Unit.a;
                            }
                        }, aVar2), aVar2, 100663296, 224256, 5784);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 56);
            uni0Var = uni0.a.a;
        } else {
            bVarI.G();
        }
        final uni0 uni0Var2 = uni0Var;
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: nz00
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    rz00.a(dVar, ijf0Var, gopVar, function1, uni0Var2, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final d dVar, final uf00 uf00Var, gz00 gz00Var, final gop gopVar, final Function1 function1, final Function1 function2, final Function1 function3, a aVar, final int i) {
        int i2;
        final Function1 function4;
        final Function1 function5;
        final gz00 gz00Var2;
        b bVar;
        final String strValueOf;
        Object obj;
        uf00 uf00Var2 = uf00Var;
        uf00Var2.getClass();
        b bVarI = aVar.i(1033171067);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? bVarI.M(uf00Var2) : bVarI.A(uf00Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? bVarI.M(gz00Var) : bVarI.A(gz00Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.M(gopVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            function4 = function1;
            i2 |= bVarI.A(function4) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        } else {
            function4 = function1;
        }
        if ((196608 & i) == 0) {
            i2 |= bVarI.A(function2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            function5 = function3;
            i2 |= bVarI.A(function5) ? 1048576 : 524288;
        } else {
            function5 = function3;
        }
        if (bVarI.q(i2 & 1, (i2 & 599187) != 599186)) {
            a8j0 a8j0Var = (a8j0) bVarI.O(kna.t);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = m.b(new b5i[uf00Var2.size()]);
                bVarI.r(objY);
            }
            final ytw ytwVar = (ytw) objY;
            d160 d160VarA = b160.a(new kw0.i(10.0f, true, new hw0()), ht.a.j, bVarI, 6);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVar);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            int i3 = i2;
            if (bVarI.S) {
                bVarI.F(aVar2);
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
            bVarI.N(-152086618);
            Iterator it = uf00Var2.iterator();
            int i4 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i5 = i4 + 1;
                if (i4 < 0) {
                    kotlin.collections.b.q();
                    throw null;
                }
                d08 d08Var = (d08) next;
                if (d08Var instanceof d08.b) {
                    strValueOf = String.valueOf(((d08.b) d08Var).a);
                } else {
                    if (!(d08Var instanceof d08.a)) {
                        uhc.a();
                        return;
                    }
                    strValueOf = " ";
                }
                b5i b5iVar = ((b5i[]) ytwVar.getValue())[i4];
                if (b5iVar == null) {
                    b5iVar = new b5i();
                    ((b5i[]) ytwVar.getValue())[i4] = b5iVar;
                }
                d dVarA = androidx.compose.ui.focus.b.a(d.a.b, b5iVar);
                int length = strValueOf.length();
                final int i6 = i4;
                ijf0 ijf0Var = new ijf0(strValueOf, vlf0.a(length, length), 4);
                Iterator it2 = it;
                boolean zM = bVarI.M(strValueOf) | ((i3 & 57344) == 16384) | ((i3 & 112) == 32 || ((i3 & 64) != 0 && bVarI.A(uf00Var2))) | bVarI.d(i6) | ((i3 & 458752) == 131072) | ((i3 & 3670016) == 1048576);
                Object objY2 = bVarI.y();
                if (zM || objY2 == c0042a) {
                    obj = new Function1() { // from class: kz00
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            String string;
                            ijf0 ijf0Var2 = (ijf0) obj2;
                            ijf0Var2.getClass();
                            nk0 nk0Var = ijf0Var2.a;
                            String str = nk0Var.b;
                            String str2 = nk0Var.b;
                            if (Intrinsics.g(str, strValueOf)) {
                                return Unit.a;
                            }
                            String str3 = str2.length() > 0 ? str2 : null;
                            if (str3 == null || (string = StringsKt.b0(0, 1, str3).toString()) == null) {
                                string = str2;
                            }
                            char[] charArray = string.toCharArray();
                            charArray.getClass();
                            List<Character> listN = ay0.N(charArray);
                            ArrayList arrayList = new ArrayList();
                            for (Object obj3 : listN) {
                                if (((Boolean) function4.invoke(obj3)).booleanValue()) {
                                    arrayList.add(obj3);
                                }
                            }
                            d08.a aVar3 = d08.a.a;
                            uf00 uf00Var3 = uf00Var;
                            int i7 = i6;
                            uf00 uf00Var4 = uf00Var3.set(i7, aVar3);
                            ArrayList arrayList2 = new ArrayList(l48.r(uf00Var4, 10));
                            Iterator itListIterator = ((n4) uf00Var4).listIterator(0);
                            int i8 = 0;
                            while (itListIterator.hasNext()) {
                                Object next2 = itListIterator.next();
                                int i9 = i8 + 1;
                                if (i8 < 0) {
                                    kotlin.collections.b.q();
                                    throw null;
                                }
                                Object bVar2 = (d08) next2;
                                Character ch = (Character) CollectionsKt.V(i8 - i7, arrayList);
                                if (ch != null) {
                                    bVar2 = new d08.b(ch.charValue());
                                }
                                arrayList2.add(bVar2);
                                i8 = i9;
                            }
                            function2.invoke(a4h.f(arrayList2));
                            int size = str2.length() == 0 ? -1 : arrayList.size();
                            b5i[] b5iVarArr = (b5i[]) ytwVar.getValue();
                            b5iVarArr.getClass();
                            function5.invoke(new gz00.b(f.f(i7 + size, new IntRange(0, ay0.A(b5iVarArr), 1))));
                            return Unit.a;
                        }
                    };
                    bVarI.r(obj);
                } else {
                    obj = objY2;
                }
                b bVar2 = bVarI;
                a(dVarA, ijf0Var, gopVar, (Function1) obj, null, bVar2, (i3 >> 3) & 896);
                uf00Var2 = uf00Var;
                function5 = function3;
                i3 = i3;
                a8j0Var = a8j0Var;
                c0042a = c0042a;
                bVarI = bVar2;
                it = it2;
                i4 = i5;
                function4 = function1;
            }
            a.C0041a.C0042a c0042a2 = c0042a;
            bVar = bVarI;
            a8j0 a8j0Var2 = a8j0Var;
            int i7 = i3;
            bVar.X(false);
            bVar.X(true);
            boolean zM2 = bVar.M(a8j0Var2) | ((i7 & 896) == 256 || ((i7 & 512) != 0 && bVar.A(gz00Var))) | ((i7 & 3670016) == 1048576);
            Object objY3 = bVar.y();
            if (zM2 || objY3 == c0042a2) {
                gz00Var2 = gz00Var;
                objY3 = new qz00(gz00Var2, a8j0Var2, function3, ytwVar, null);
                bVar.r(objY3);
            } else {
                gz00Var2 = gz00Var;
            }
            xvf.e(bVar, gz00Var2, (Function2) objY3);
        } else {
            gz00Var2 = gz00Var;
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: lz00
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    rz00.b(dVar, uf00Var, gz00Var2, gopVar, function1, function2, function3, (a) obj2, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
