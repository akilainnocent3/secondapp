package defpackage;

import android.content.Context;
import android.os.Build;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class vhd {
    public static final x420 a = new x420(14, true);

    public static final class a implements Function2<androidx.compose.runtime.a, Integer, String> {
        public final /* synthetic */ ief0 a;

        public a(ief0 ief0Var) {
            this.a = ief0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final String invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            num.intValue();
            aVar2.N(666084174);
            String str = this.a.b;
            aVar2.H();
            return str;
        }
    }

    public static final class b implements gaj<j58, androidx.compose.runtime.a, Integer, Unit> {
        public final /* synthetic */ ief0 a;

        public b(ief0 ief0Var) {
            this.a = ief0Var;
        }

        @Override // defpackage.gaj
        public final Unit invoke(j58 j58Var, androidx.compose.runtime.a aVar, Integer num) {
            long j = j58Var.a;
            androidx.compose.runtime.a aVar2 = aVar;
            int iIntValue = num.intValue();
            if ((iIntValue & 6) == 0) {
                iIntValue |= aVar2.e(j) ? 4 : 2;
            }
            if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                vhd.b(this.a.c, (iIntValue << 3) & 112, j, aVar2);
            } else {
                aVar2.G();
            }
            return Unit.a;
        }
    }

    public static final class c implements Function2<androidx.compose.runtime.a, Integer, Unit> {
        public final /* synthetic */ bef0 a;
        public final /* synthetic */ tef0 b;

        public c(bef0 bef0Var, tef0 tef0Var) {
            this.a = bef0Var;
            this.b = tef0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            int iIntValue = num.intValue();
            if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                bef0 bef0Var = this.a;
                boolean zM = aVar2.M(bef0Var);
                Object objY = aVar2.y();
                if (zM || objY == androidx.compose.runtime.a.C0041a.a) {
                    objY = a6a0.b(new whd(0, bef0Var, bef0.class, "data", "data()Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;", 0));
                    aVar2.r(objY);
                }
                vhd.a(this.b, (aef0) ((twd0) objY).getValue(), aVar2, 0);
            } else {
                aVar2.G();
            }
            return Unit.a;
        }
    }

    public static final void a(final tef0 tef0Var, final aef0 aef0Var, androidx.compose.runtime.a aVar, final int i) {
        final Context context;
        androidx.compose.runtime.b bVarI = aVar.i(1904307118);
        int i2 = (bVarI.M(tef0Var) ? 4 : 2) | i | (bVarI.A(aef0Var) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            if (Build.VERSION.SDK_INT >= 28) {
                bVarI.N(-1009462744);
                context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
                bVarI.X(false);
            } else {
                bVarI.N(-1009413640);
                bVarI.X(false);
                context = null;
            }
            boolean zA = bVarI.A(aef0Var) | ((i2 & 14) == 4) | bVarI.A(context);
            Object objY = bVarI.y();
            if (zA || objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new Function1() { // from class: qhd
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        a1b a1bVar = (a1b) obj;
                        List<ydf0> list = aef0Var.a;
                        int size = list.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            ydf0 ydf0Var = list.get(i3);
                            if (ydf0Var instanceof ief0) {
                                final ief0 ief0Var = (ief0) ydf0Var;
                                vhd.a aVar2 = new vhd.a(ief0Var);
                                op8 op8Var = ief0Var.c == 0 ? null : new op8(-1930700965, new vhd.b(ief0Var), true);
                                final tef0 tef0Var2 = tef0Var;
                                a1b.b(a1bVar, aVar2, op8Var, new Function0() { // from class: shd
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        ief0Var.d.invoke(tef0Var2);
                                        return Unit.a;
                                    }
                                }, 6);
                            } else if (ydf0Var instanceof uef0) {
                                if (Build.VERSION.SDK_INT >= 28) {
                                    hef0.c(a1bVar, context, (uef0) ydf0Var);
                                }
                            } else if (ydf0Var instanceof sef0) {
                                a1bVar.a.add(rv8.a);
                            }
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            g1b.b(null, null, (Function1) objY, bVarI, 0, 3);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(aef0Var, i) { // from class: rhd
                public final /* synthetic */ aef0 b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    vhd.a(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final int i, final int i2, final long j, androidx.compose.runtime.a aVar) {
        int i3;
        e eVarZ;
        Function2<? super androidx.compose.runtime.a, ? super Integer, Unit> function2;
        androidx.compose.runtime.b bVarI = aVar.i(-1240244237);
        if ((i2 & 6) == 0) {
            i3 = (bVarI.d(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= bVarI.e(j) ? 32 : 16;
        }
        if (bVarI.q(i3 & 1, (i3 & 19) != 18)) {
            Context context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
            boolean zM = ((i3 & 14) == 4) | bVarI.M(context);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (zM || objY == c0042a) {
                objY = Integer.valueOf(context.obtainStyledAttributes(new int[]{i}).getResourceId(0, -1));
                bVarI.r(objY);
            }
            int iIntValue = ((Number) objY).intValue();
            if (iIntValue == -1) {
                eVarZ = bVarI.Z();
                if (eVarZ == null) {
                    return;
                } else {
                    function2 = new Function2() { // from class: thd
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = qj40.a(i2 | 1);
                            vhd.b(i, iA, j, (a) obj);
                            return Unit.a;
                        }
                    };
                }
            } else {
                crz crzVarA = erz.a(iIntValue, 0, bVarI);
                boolean z = (i3 & 112) == 32;
                Object objY2 = bVarI.y();
                if (z || objY2 == c0042a) {
                    objY2 = j == 16 ? null : new gf4(j, 5);
                    bVarI.r(objY2);
                }
                g75.a(androidx.compose.ui.draw.b.a(j.r(d.a.b, b1b.e), crzVarA, null, d0b.a.b, 0.0f, (l58) objY2, 22), bVarI, 0);
            }
            eVarZ.d = function2;
        }
        bVarI.G();
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            function2 = new Function2() { // from class: uhd
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i2 | 1);
                    vhd.b(i, iA, j, (a) obj);
                    return Unit.a;
                }
            };
            eVarZ.d = function2;
        }
    }

    public static final void c(tef0 tef0Var, bef0 bef0Var, Function0<? extends urr> function0, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.b bVarI = aVar.i(-2040393164);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bVarI.M(tef0Var) : bVarI.A(tef0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? bVarI.M(bef0Var) : bVarI.A(bef0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function0) ? 256 : 128;
        }
        int i3 = 0;
        boolean z = true;
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = (i2 & 112) == 32 || ((i2 & 64) != 0 && bVarI.M(bef0Var));
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (z2 || objY == c0042a) {
                objY = new llu(new w0b(new nhd(bef0Var, function0)));
                bVarI.r(objY);
            }
            llu lluVar = (llu) objY;
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !bVarI.A(tef0Var))) {
                z = false;
            }
            Object objY2 = bVarI.y();
            if (z || objY2 == c0042a) {
                objY2 = new ohd(tef0Var, i3);
                bVarI.r(objY2);
            }
            u90.a(lluVar, (Function0) objY2, a, pp8.b(1315155414, new c(bef0Var, tef0Var), bVarI), bVarI, 3456, 0);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new phd(tef0Var, bef0Var, function0, i);
        }
    }

    public static final void d(final d dVar, final op8 op8Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.b bVarI = aVar.i(1392105195);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(op8Var) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            chf chfVar = ref0.a;
            op8 op8Var2 = ky8.a;
            sa2.a(dVar, chfVar, op8Var, bVarI, ((i2 << 6) & 7168) | (i2 & 14) | 432);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: mhd
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    vhd.d(dVar, op8Var, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
