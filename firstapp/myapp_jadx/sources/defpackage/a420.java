package defpackage;

import android.os.Build;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a420 {

    public static final class a extends qlr implements iaj<Integer, Integer, Integer, Integer, Unit> {
        public final /* synthetic */ ViewStructure a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ViewStructure viewStructure) {
            super(4);
            this.a = viewStructure;
        }

        @Override // defpackage.iaj
        public final Unit d(Integer num, Integer num2, Integer num3, Integer num4) {
            int iIntValue = num.intValue();
            int iIntValue2 = num2.intValue();
            int iIntValue3 = num3.intValue();
            int iIntValue4 = num4.intValue() - iIntValue2;
            this.a.setDimens(iIntValue, iIntValue2, 0, 0, iIntValue3 - iIntValue, iIntValue4);
            return Unit.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0256  */
    /* JADX WARN: Code duplicated, block: B:128:0x0290  */
    /* JADX WARN: Code duplicated, block: B:135:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:138:0x02be  */
    /* JADX WARN: Code duplicated, block: B:140:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:141:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:143:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:158:0x0306  */
    /* JADX WARN: Code duplicated, block: B:160:0x030a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:164:0x0310  */
    /* JADX WARN: Code duplicated, block: B:168:0x031a  */
    /* JADX WARN: Code duplicated, block: B:171:0x0320  */
    /* JADX WARN: Code duplicated, block: B:173:0x0329 A[LOOP:5: B:172:0x0327->B:173:0x0329, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:177:0x0351 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:182:0x0360  */
    /* JADX WARN: Code duplicated, block: B:184:0x036b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:187:0x0376  */
    /* JADX WARN: Code duplicated, block: B:189:0x0381  */
    /* JADX WARN: Code duplicated, block: B:192:0x016d A[EDGE_INSN: B:192:0x016d->B:64:0x016d BREAK  A[LOOP:0: B:9:0x003c->B:62:0x014f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x014d A[DONT_INVERT, PHI: r7 r20 r21 r22 r23 r24 r25 r26 r27
      0x014d: PHI (r7v8 kza) = (r7v7 kza), (r7v9 kza) binds: [B:10:0x004b, B:60:0x014b] A[DONT_GENERATE, DONT_INLINE]
      0x014d: PHI (r20v6 boolean) = (r20v5 boolean), (r20v7 boolean) binds: [B:10:0x004b, B:60:0x014b] A[DONT_GENERATE, DONT_INLINE]
      0x014d: PHI (r21v4 kzf0) = (r21v3 kzf0), (r21v5 kzf0) binds: [B:10:0x004b, B:60:0x014b] A[DONT_GENERATE, DONT_INLINE]
      0x014d: PHI (r22v6 g0b) = (r22v5 g0b), (r22v7 g0b) binds: [B:10:0x004b, B:60:0x014b] A[DONT_GENERATE, DONT_INLINE]
      0x014d: PHI (r23v6 java.lang.Boolean) = (r23v5 java.lang.Boolean), (r23v7 java.lang.Boolean) binds: [B:10:0x004b, B:60:0x014b] A[DONT_GENERATE, DONT_INLINE]
      0x014d: PHI (r24v7 su50) = (r24v6 su50), (r24v8 su50) binds: [B:10:0x004b, B:60:0x014b] A[DONT_GENERATE, DONT_INLINE]
      0x014d: PHI (r25v6 boolean) = (r25v5 boolean), (r25v7 boolean) binds: [B:10:0x004b, B:60:0x014b] A[DONT_GENERATE, DONT_INLINE]
      0x014d: PHI (r26v6 java.lang.Integer) = (r26v5 java.lang.Integer), (r26v7 java.lang.Integer) binds: [B:10:0x004b, B:60:0x014b] A[DONT_GENERATE, DONT_INLINE]
      0x014d: PHI (r27v8 nk0) = (r27v7 nk0), (r27v9 nk0) binds: [B:10:0x004b, B:60:0x014b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x014f A[LOOP:0: B:9:0x003c->B:62:0x014f, LOOP_END] */
    public static final void a(ViewStructure viewStructure, ua80 ua80Var, AutofillId autofillId, String str, rk40 rk40Var) {
        long j;
        long j2;
        char c;
        long j3;
        kzf0 kzf0Var;
        su50 su50Var;
        nk0 nk0Var;
        kza kzaVar;
        boolean z;
        g0b g0bVar;
        Boolean bool;
        boolean z2;
        Integer num;
        Integer num2;
        List list;
        Integer num3;
        boolean z3;
        String strC;
        int size;
        String strA;
        int i;
        String[] strArrB;
        boolean z4;
        String[] strArrB2;
        rtw<ob80<?>, Object> rtwVar;
        int i2;
        int i3;
        int i4;
        rtw<ob80<?>, Object> rtwVar2;
        kzf0 kzf0Var2;
        su50 su50Var2;
        nk0 nk0Var2;
        Integer num4 = 1;
        ob80<List<String>> ob80Var = hb80.a;
        ob80<c6<Function1<List<ukf0>, Boolean>>> ob80Var2 = ra80.a;
        sa80 sa80VarF = ua80Var.f();
        int i5 = 8;
        if (sa80VarF == null || (rtwVar2 = sa80VarF.a) == null) {
            j = 128;
            j2 = 255;
            c = 7;
            j3 = -9187201950435737472L;
            kzf0Var = null;
            su50Var = null;
            nk0Var = null;
            kzaVar = null;
            z = false;
            g0bVar = null;
            bool = null;
            z2 = false;
            num = null;
        } else {
            Object[] objArr = rtwVar2.b;
            j = 128;
            Object[] objArr2 = rtwVar2.c;
            long[] jArr = rtwVar2.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i6 = 0;
                kzaVar = null;
                j2 = 255;
                z = false;
                kzf0Var2 = null;
                g0bVar = null;
                bool = null;
                su50Var2 = null;
                z2 = false;
                num = null;
                nk0Var2 = null;
                c = 7;
                while (true) {
                    long j4 = jArr[i6];
                    j3 = -9187201950435737472L;
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i6 != length) {
                            break;
                            break;
                        }
                        i6++;
                    } else {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        for (int i8 = 0; i8 < i7; i8++) {
                            if ((j4 & 255) < 128) {
                                int i9 = (i6 << 3) + i8;
                                Object obj = objArr[i9];
                                Object obj2 = objArr2[i9];
                                ob80 ob80Var3 = (ob80) obj;
                                if (Intrinsics.g(ob80Var3, hb80.r)) {
                                    obj2.getClass();
                                    kzaVar = (kza) obj2;
                                } else if (Intrinsics.g(ob80Var3, hb80.a)) {
                                    obj2.getClass();
                                    CharSequence charSequence = (String) CollectionsKt.firstOrNull((List) obj2);
                                    if (charSequence != null) {
                                        viewStructure.setContentDescription(charSequence);
                                    }
                                } else if (Intrinsics.g(ob80Var3, hb80.q)) {
                                    obj2.getClass();
                                    g0bVar = (g0b) obj2;
                                } else if (Intrinsics.g(ob80Var3, hb80.E)) {
                                    obj2.getClass();
                                    nk0Var2 = (nk0) obj2;
                                } else if (Intrinsics.g(ob80Var3, hb80.k)) {
                                    obj2.getClass();
                                    viewStructure.setFocused(((Boolean) obj2).booleanValue());
                                } else if (Intrinsics.g(ob80Var3, hb80.N)) {
                                    obj2.getClass();
                                    num = (Integer) obj2;
                                } else if (Intrinsics.g(ob80Var3, hb80.J)) {
                                    z2 = true;
                                } else if (Intrinsics.g(ob80Var3, hb80.x)) {
                                    obj2.getClass();
                                    su50Var2 = (su50) obj2;
                                } else if (Intrinsics.g(ob80Var3, hb80.H)) {
                                    obj2.getClass();
                                    bool = (Boolean) obj2;
                                } else if (Intrinsics.g(ob80Var3, hb80.I)) {
                                    obj2.getClass();
                                    kzf0Var2 = (kzf0) obj2;
                                } else if (Intrinsics.g(ob80Var3, ra80.b)) {
                                    viewStructure.setClickable(true);
                                } else if (Intrinsics.g(ob80Var3, ra80.c)) {
                                    viewStructure.setLongClickable(true);
                                } else if (Intrinsics.g(ob80Var3, ra80.v)) {
                                    viewStructure.setFocusable(true);
                                } else if (Intrinsics.g(ob80Var3, ra80.j)) {
                                    z = true;
                                }
                            }
                            j4 >>= 8;
                        }
                        if (i7 != 8) {
                            break;
                        } else if (i6 != length) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                }
            } else {
                j2 = 255;
                c = 7;
                j3 = -9187201950435737472L;
                kzaVar = null;
                z = false;
                kzf0Var2 = null;
                g0bVar = null;
                bool = null;
                su50Var2 = null;
                z2 = false;
                num = null;
                nk0Var2 = null;
            }
            kzf0Var = kzf0Var2;
            su50Var = su50Var2;
            nk0Var = nk0Var2;
        }
        sa80 sa80VarF2 = ua80Var.f();
        if (sa80VarF2 != null && sa80VarF2.c && !sa80VarF2.d) {
            sa80VarF2 = sa80VarF2.c();
            etw etwVar = new etw(ua80Var.m().size());
            etwVar.h(ua80Var.m());
            while (etwVar.e()) {
                ua80 ua80Var2 = (ua80) etwVar.k(etwVar.b - 1);
                sa80 sa80VarF3 = ua80Var2.f();
                if (sa80VarF3 != null && !sa80VarF3.c) {
                    sa80VarF2.f(sa80VarF3);
                    if (!sa80VarF3.d) {
                        etwVar.h(ua80Var2.m());
                    }
                }
            }
        }
        if (sa80VarF2 == null || (rtwVar = sa80VarF2.a) == null) {
            num2 = num4;
            list = null;
        } else {
            Object[] objArr3 = rtwVar.b;
            Object[] objArr4 = rtwVar.c;
            long[] jArr2 = rtwVar.a;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i10 = 0;
                list = null;
                while (true) {
                    long j5 = jArr2[i10];
                    num2 = num4;
                    if ((((~j5) << c) & j5 & j3) != j3) {
                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                        int i12 = 0;
                        while (i12 < i11) {
                            if ((j5 & j2) < j) {
                                int i13 = (i10 << 3) + i12;
                                Object obj3 = objArr3[i13];
                                Object obj4 = objArr4[i13];
                                i4 = i5;
                                ob80 ob80Var4 = (ob80) obj3;
                                i3 = i12;
                                if (Intrinsics.g(ob80Var4, hb80.i)) {
                                    viewStructure.setEnabled(false);
                                } else if (Intrinsics.g(ob80Var4, hb80.A)) {
                                    obj4.getClass();
                                    list = (List) obj4;
                                }
                            } else {
                                i3 = i12;
                                i4 = i5;
                            }
                            j5 >>= i4;
                            i12 = i3 + 1;
                            i5 = i4;
                        }
                        i2 = i5;
                        if (i11 != i2) {
                            break;
                        }
                    } else {
                        i2 = i5;
                    }
                    if (i10 == length2) {
                        break;
                    }
                    i10++;
                    i5 = i2;
                    num4 = num2;
                }
            } else {
                num2 = num4;
                list = null;
            }
        }
        Integer numValueOf = Integer.valueOf(ua80Var.b());
        if (ua80Var.g() == null) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : -1;
        pl1.c(viewStructure, autofillId, iIntValue);
        viewStructure.setId(iIntValue, str, null, null);
        if (kzaVar == null) {
            if (!z) {
                num3 = kzf0Var != null ? 2 : null;
            }
            if (num3 != null) {
                pl1.d(viewStructure, num3.intValue());
            }
            if (g0bVar != null && (strArrB2 = h0b.b(g0bVar)) != null) {
                pl1.b(viewStructure, strArrB2);
            }
            rk40Var.a.b(ua80Var.b(), new a(viewStructure));
            if (bool != null) {
                viewStructure.setSelected(bool.booleanValue());
            }
            if (kzf0Var != null) {
                viewStructure.setCheckable(true);
                if (kzf0Var == kzf0.a) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                viewStructure.setChecked(z4);
            } else if (bool != null && (su50Var == null || su50Var.a != 4)) {
                viewStructure.setCheckable(true);
                viewStructure.setChecked(bool.booleanValue());
            }
            g0b.a.getClass();
            String str2 = (String) ay0.w(h0b.b(g0b.a.b));
            if (g0bVar == null && (strArrB = h0b.b(g0bVar)) != null) {
                boolean zS = ay0.s(str2, strArrB);
                z3 = true;
                boolean z5 = zS;
                if (!z2 && !z5) {
                    z3 = false;
                }
                if (z3) {
                    pl1.f(viewStructure);
                }
                viewStructure.setVisibility(ua80Var.o() ? 4 : 0);
                if (list != null) {
                    size = list.size();
                    strA = "";
                    for (i = 0; i < size; i++) {
                        strA = j26.a(new StringBuilder(strA), ((nk0) list.get(i)).b, '\n');
                    }
                    viewStructure.setText(strA);
                    viewStructure.setClassName("android.widget.TextView");
                }
                if (ua80Var.m().isEmpty() && su50Var != null && (strC = vb80.c(su50Var.a)) != null) {
                    viewStructure.setClassName(strC);
                }
                if (z) {
                    viewStructure.setClassName("android.widget.EditText");
                    if (Build.VERSION.SDK_INT >= 28 && num != null) {
                        rl1.a(viewStructure, num.intValue());
                    }
                    if (nk0Var != null) {
                        pl1.e(viewStructure, pl1.a(nk0Var.b));
                    }
                    if (z3) {
                        pl1.g(viewStructure);
                    }
                }
            }
            z3 = true;
            if (!z2) {
                z3 = false;
            }
            if (z3) {
                pl1.f(viewStructure);
            }
            viewStructure.setVisibility(ua80Var.o() ? 4 : 0);
            if (list != null) {
                size = list.size();
                strA = "";
                while (i < size) {
                    strA = j26.a(new StringBuilder(strA), ((nk0) list.get(i)).b, '\n');
                }
                viewStructure.setText(strA);
                viewStructure.setClassName("android.widget.TextView");
            }
            if (ua80Var.m().isEmpty()) {
                viewStructure.setClassName(strC);
            }
            if (z) {
                viewStructure.setClassName("android.widget.EditText");
                if (Build.VERSION.SDK_INT >= 28) {
                    rl1.a(viewStructure, num.intValue());
                }
                if (nk0Var != null) {
                    pl1.e(viewStructure, pl1.a(nk0Var.b));
                }
                if (z3) {
                    pl1.g(viewStructure);
                }
            }
        }
        num3 = num2;
        if (num3 != null) {
            pl1.d(viewStructure, num3.intValue());
        }
        if (g0bVar != null) {
            pl1.b(viewStructure, strArrB2);
        }
        rk40Var.a.b(ua80Var.b(), new a(viewStructure));
        if (bool != null) {
            viewStructure.setSelected(bool.booleanValue());
        }
        if (kzf0Var != null) {
            viewStructure.setCheckable(true);
            if (kzf0Var == kzf0.a) {
                z4 = true;
            } else {
                z4 = false;
            }
            viewStructure.setChecked(z4);
        } else if (bool != null) {
            viewStructure.setCheckable(true);
            viewStructure.setChecked(bool.booleanValue());
        }
        g0b.a.getClass();
        String str3 = (String) ay0.w(h0b.b(g0b.a.b));
        if (g0bVar == null) {
            z3 = true;
        } else {
            z3 = true;
        }
        if (!z2) {
            z3 = false;
        }
        if (z3) {
            pl1.f(viewStructure);
        }
        viewStructure.setVisibility(ua80Var.o() ? 4 : 0);
        if (list != null) {
            size = list.size();
            strA = "";
            while (i < size) {
                strA = j26.a(new StringBuilder(strA), ((nk0) list.get(i)).b, '\n');
            }
            viewStructure.setText(strA);
            viewStructure.setClassName("android.widget.TextView");
        }
        if (ua80Var.m().isEmpty()) {
            viewStructure.setClassName(strC);
        }
        if (z) {
            viewStructure.setClassName("android.widget.EditText");
            if (Build.VERSION.SDK_INT >= 28) {
                rl1.a(viewStructure, num.intValue());
            }
            if (nk0Var != null) {
                pl1.e(viewStructure, pl1.a(nk0Var.b));
            }
            if (z3) {
                pl1.g(viewStructure);
            }
        }
    }
}
