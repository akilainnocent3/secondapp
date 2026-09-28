package defpackage;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sportygames.newcms.b;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
public final class sw00 {

    public static final /* synthetic */ class a extends saj implements Function1<uw00, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(uw00 uw00Var) {
            uw00 uw00Var2 = uw00Var;
            uw00Var2.getClass();
            vx00 vx00Var = (vx00) this.receiver;
            vx00Var.getClass();
            if (uw00Var2 instanceof uw00.a) {
                ej5.c(o8i0.d(vx00Var), null, null, new yx00(null, uw00Var2, vx00Var), 3);
            } else {
                if (!(uw00Var2 instanceof uw00.b)) {
                    uhc.a();
                    return null;
                }
                ej5.c(o8i0.d(vx00Var), null, null, new zx00(null, uw00Var2, vx00Var), 3);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.piggybash.presentation.screens.PiggyBashScreenContainerKt$PiggyBashScreenContainer$11$1", f = "PiggyBashScreenContainer.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ Context a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(v1b v1bVar, Context context, String str) {
            super(2, v1bVar);
            this.a = context;
            this.b = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(v1bVar, this.a, this.b);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            Toast.makeText(this.a, this.b, 0).show();
            return Unit.a;
        }
    }

    public static final /* synthetic */ class c extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            wwd0 wwd0Var = ((vx00) this.receiver).b0;
            vxi0 vxi0Var = (vxi0) wwd0Var.getValue();
            double d = vxi0Var.a;
            String str = vxi0Var.b;
            str.getClass();
            wwd0Var.k(null, new vxi0(d, str, 0.0d));
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.piggybash.presentation.screens.PiggyBashScreenContainerKt$PiggyBashScreenContainer$16$4$1", f = "PiggyBashScreenContainer.kt", l = {216}, m = "invokeSuspend", v = 1)
    public static final class d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ vx00 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(vx00 vx00Var, v1b<? super d> v1bVar) {
            super(2, v1bVar);
            this.b = vx00Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new d(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (this.b.z1(this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.piggybash.presentation.screens.PiggyBashScreenContainerKt$PiggyBashScreenContainer$16$8$1", f = "PiggyBashScreenContainer.kt", l = {246}, m = "invokeSuspend", v = 1)
    public static final class e extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ vx00 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(vx00 vx00Var, v1b<? super e> v1bVar) {
            super(2, v1bVar);
            this.b = vx00Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new e(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((e) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (this.b.z1(this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    public static final /* synthetic */ class f extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((vx00) this.receiver).C1();
            return Unit.a;
        }
    }

    public static final class g implements tse {
        public final /* synthetic */ vx00 a;

        public g(vx00 vx00Var) {
            this.a = vx00Var;
        }

        @Override // defpackage.tse
        public final void dispose() {
            vx00 vx00Var = this.a;
            jvd0 jvd0Var = vx00Var.K;
            if (jvd0Var != null) {
                jvd0Var.cancel((CancellationException) null);
            }
            vx00Var.y.g();
        }
    }

    public static final class h implements tse {
        public final /* synthetic */ vx00 a;

        public h(vx00 vx00Var) {
            this.a = vx00Var;
        }

        @Override // defpackage.tse
        public final void dispose() {
            jvd0 jvd0Var = this.a.L;
            if (jvd0Var != null) {
                jvd0Var.cancel((CancellationException) null);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:131:0x0444  */
    /* JADX WARN: Code duplicated, block: B:134:0x0456  */
    /* JADX WARN: Code duplicated, block: B:136:0x0469  */
    /* JADX WARN: Code duplicated, block: B:138:0x0471  */
    /* JADX WARN: Code duplicated, block: B:141:0x0483  */
    /* JADX WARN: Code duplicated, block: B:145:0x0499  */
    /* JADX WARN: Code duplicated, block: B:147:0x04ab  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v20 */
    public static final void a(final nu00 nu00Var, vx00 vx00Var, final String str, final com.sportygames.newcms.b bVar, final Function0<Unit> function0, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.b bVar2;
        com.sportygames.newcms.b bVar3;
        ytw ytwVar;
        int i2;
        ytw ytwVar2;
        Object obj;
        final ytw ytwVar3;
        boolean z;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        androidx.compose.runtime.b bVar4;
        lx00 lx00Var;
        boolean zA;
        Object objY;
        Object obj7;
        boolean zA2;
        Object obj8;
        boolean zA3;
        Object objY2;
        Object obj9;
        androidx.compose.runtime.b bVar5;
        boolean z2;
        mx00 mx00Var;
        int i3;
        final vx00 vx00Var2 = vx00Var;
        nu00Var.getClass();
        vx00Var2.getClass();
        str.getClass();
        bVar.getClass();
        function0.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(-691545761);
        int i4 = i | (bVarI.M(nu00Var) ? 4 : 2) | (bVarI.A(vx00Var2) ? 32 : 16) | (bVarI.M(str) ? 256 : 128) | (bVarI.M(bVar) ? 2048 : 1024) | (bVarI.A(function0) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if (bVarI.q(i4 & 1, (i4 & 9363) != 9362)) {
            com.sportygames.newcms.b bVar6 = (com.sportygames.newcms.b) bVarI.O(com.sportygames.newcms.c.a);
            ytw ytwVarC = wyh.c(vx00Var2.N, bVarI, 0, 7);
            ytw ytwVarC2 = wyh.c(vx00Var2.P, bVarI, 0, 7);
            ytw ytwVarC3 = wyh.c(vx00Var2.V, bVarI, 0, 7);
            ju00 ju00Var = (ju00) wyh.c(vx00Var2.W, bVarI, 0, 7).getValue();
            if (Intrinsics.g(ju00Var, ju00.b.a)) {
                bVarI.N(1144475587);
                bVarI.X(false);
            } else {
                if (!(ju00Var instanceof ju00.a)) {
                    throw igf0.a(bVarI, 1144473494, false);
                }
                bVarI.N(1144477053);
                com.sportygames.newcms.c.b(((ju00.a) ju00Var).a, bVarI, 0);
                bVarI.X(false);
            }
            boolean zG = Intrinsics.g((lx00) ytwVarC2.getValue(), lx00.d.a);
            Object obj10 = androidx.compose.runtime.a.C0041a.a;
            if (zG) {
                bVarI.N(1119164450);
                mx00 mx00Var2 = (mx00) wyh.c(vx00Var2.R, bVarI, 0, 7).getValue();
                boolean z3 = ((sx00) ytwVarC.getValue()) instanceof xzs;
                boolean zA4 = bVarI.A(vx00Var2);
                Object objY3 = bVarI.y();
                if (zA4 || objY3 == obj10) {
                    ytwVar2 = ytwVarC3;
                    z2 = z3;
                    ytwVar = ytwVarC;
                    bVar3 = bVar6;
                    mx00Var = mx00Var2;
                    i3 = 0;
                    Object aVar2 = new a(1, vx00Var2, vx00.class, "handleSidePanelEvent", "handleSidePanelEvent(Lcom/sportygames/piggybash/presentation/model/sidepanel/PiggyBashSidePanelEvent;)V", 0);
                    bVarI.r(aVar2);
                    objY3 = aVar2;
                } else {
                    bVar3 = bVar6;
                    ytwVar = ytwVarC;
                    mx00Var = mx00Var2;
                    ytwVar2 = ytwVarC3;
                    i3 = 0;
                    z2 = z3;
                }
                kx00.e(mx00Var, z2, (Function1) ((chp) objY3), bVarI, i3);
                i2 = i3;
            } else {
                bVar3 = bVar6;
                ytwVar = ytwVarC;
                i2 = 0;
                ytwVar2 = ytwVarC3;
                i4 = i4;
                bVarI.N(1115297603);
            }
            bVarI.X(i2);
            boolean zA5 = bVarI.A(vx00Var2);
            Object objY4 = bVarI.y();
            if (zA5 || objY4 == obj10) {
                Object fVar = new f(0, vx00Var2, vx00.class, "onLoadResources", "onLoadResources()V", 0);
                bVarI.r(fVar);
                objY4 = fVar;
            }
            int i5 = (i4 >> 12) & 14;
            fit.a(function0, (Function0) ((chp) objY4), bVarI, i5);
            if (nu00Var.equals(nu00.h.a)) {
                bVarI.N(1144494371);
                bVarI.X(i2);
            } else if (nu00Var instanceof nu00.g) {
                bVarI.N(1144496511);
                int i6 = (bVarI.A(vx00Var2) ? 1 : 0) | ((i4 & 14) == 4 ? 1 : i2);
                Object objY5 = bVarI.y();
                Object obj11 = objY5;
                if (i6 != 0 || objY5 == obj10) {
                    Object ycwVar = new ycw(1, vx00Var2, nu00Var);
                    bVarI.r(ycwVar);
                    obj11 = ycwVar;
                }
                smx.c((Function0) obj11, function0, bVarI, (i4 >> 9) & 112);
                bVarI.X(i2);
            } else if (nu00Var instanceof nu00.i) {
                bVarI.N(1144505773);
                lu00 lu00Var = lu00.b2;
                String strC = com.sportygames.newcms.c.c(lu00Var.h0, new String[i2], bVarI);
                String strC2 = com.sportygames.newcms.c.c(lu00Var.i0, new String[i2], bVarI);
                nu00.i iVar = (nu00.i) nu00Var;
                String str2 = iVar.a;
                NumberFormat numberFormat = d6f.a;
                String str3 = String.format(strC2, Arrays.copyOf(new Object[]{str2, d6f.a(iVar.b)}, 2));
                String strC3 = com.sportygames.newcms.c.c(lu00Var.j0, new String[i2], bVarI);
                boolean zA6 = bVarI.A(vx00Var2);
                Object objY6 = bVarI.y();
                if (zA6 || objY6 == obj10) {
                    obj6 = objY6;
                    Object ow00Var = new ow00(vx00Var2, i2);
                    bVarI.r(ow00Var);
                    obj6 = ow00Var;
                }
                ey50.c(strC, str3, strC3, (Function0) obj6, bVarI, 0);
                bVarI.X(i2);
            } else {
                if (nu00Var.equals(nu00.f.a)) {
                    bVarI.N(1144521652);
                    bys.a(function0, bVarI, i5);
                    bVarI.X(i2);
                } else if (nu00Var.equals(nu00.e.a)) {
                    bVarI.N(1144524669);
                    lu00 lu00Var2 = lu00.b2;
                    String strC4 = com.sportygames.newcms.c.c(lu00Var2.y0, new String[i2], bVarI);
                    String strC5 = com.sportygames.newcms.c.c(lu00Var2.z0, new String[i2], bVarI);
                    String strC6 = com.sportygames.newcms.c.c(lu00Var2.T, new String[i2], bVarI);
                    String strC7 = com.sportygames.newcms.c.c(lu00Var2.A0, new String[i2], bVarI);
                    boolean zA7 = bVarI.A(vx00Var2);
                    Object objY7 = bVarI.y();
                    if (zA7 || objY7 == obj10) {
                        obj5 = objY7;
                        Object pw00Var = new pw00(vx00Var2, i2);
                        bVarI.r(pw00Var);
                        obj5 = pw00Var;
                    }
                    Function0 function1 = (Function0) obj5;
                    boolean zA8 = bVarI.A(vx00Var2);
                    Object objY8 = bVarI.y();
                    Object obj12 = objY8;
                    if (zA8 || objY8 == obj10) {
                        Object qw00Var = new qw00(vx00Var2, i2);
                        bVarI.r(qw00Var);
                        obj12 = qw00Var;
                    }
                    obj = obj10;
                    vx00Var2 = vx00Var2;
                    szg0.a(strC4, strC5, strC6, strC7, function1, (Function0) obj12, null, bVarI, 0, 64);
                    androidx.compose.runtime.b bVar7 = bVarI;
                    bVar7.X(i2);
                    bVar5 = bVar7;
                    ytwVar3 = ytwVar2;
                    bVar4 = bVar5;
                } else {
                    obj = obj10;
                    int i7 = i2;
                    if (nu00Var instanceof nu00.b) {
                        bVarI.N(1144544219);
                        lu00 lu00Var3 = lu00.b2;
                        String strC8 = com.sportygames.newcms.c.c(lu00Var3.S, new String[i7], bVarI);
                        nu00.b bVar8 = (nu00.b) nu00Var;
                        String str4 = bVar8.e;
                        NumberFormat numberFormat2 = d6f.a;
                        String str5 = String.format(strC8, Arrays.copyOf(new Object[]{str4, d6f.a(bVar8.b), bVar8.f}, 3));
                        String strC9 = com.sportygames.newcms.c.c(lu00Var3.T, new String[i7], bVarI);
                        String strC10 = com.sportygames.newcms.c.c(lu00Var3.U, new String[i7], bVarI);
                        boolean zA9 = bVarI.A(vx00Var2);
                        Object objY9 = bVarI.y();
                        if (zA9 || objY9 == obj) {
                            vx00Var2 = vx00Var2;
                            obj4 = objY9;
                            Object kqrVar = new kqr(vx00Var2, 1);
                            bVarI.r(kqrVar);
                            obj4 = kqrVar;
                        }
                        Function0 function2 = (Function0) obj4;
                        ytwVar3 = ytwVar2;
                        final com.sportygames.newcms.b bVar9 = bVar3;
                        boolean zM = bVarI.M(ytwVar3) | bVarI.A(bVar9) | bVarI.A(vx00Var2) | ((i4 & 14) == 4);
                        Object objY10 = bVarI.y();
                        Object obj13 = objY10;
                        if (zM || objY10 == obj) {
                            Object obj14 = new Function0() { // from class: rw00
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    if (((Boolean) ytwVar3.getValue()).booleanValue()) {
                                        bVar9.c(lu00.b2.Q1);
                                    }
                                    vx00 vx00Var3 = vx00Var2;
                                    vx00Var3.y1();
                                    nu00.b bVar10 = (nu00.b) nu00Var;
                                    double d2 = bVar10.b;
                                    long j = bVar10.c;
                                    ap20 ap20Var = bVar10.d;
                                    ej5.c(o8i0.d(vx00Var3), null, null, new dy00(vx00Var3, j, bVar10.a, d2, ap20Var, null), 3);
                                    return Unit.a;
                                }
                            };
                            bVarI.r(obj14);
                            obj13 = obj14;
                        }
                        szg0.a(null, str5, strC9, strC10, function2, (Function0) obj13, null, bVarI, 0, 65);
                        androidx.compose.runtime.b bVar10 = bVarI;
                        bVar10.X(false);
                        bVar4 = bVar10;
                    } else {
                        ytwVar3 = ytwVar2;
                        if (nu00Var instanceof nu00.c) {
                            bVarI.N(1144575728);
                            boolean zA10 = bVarI.A(vx00Var2);
                            Object objY11 = bVarI.y();
                            if (zA10 || objY11 == obj) {
                                vx00Var2 = vx00Var2;
                                obj3 = objY11;
                                Object bw00Var = new bw00(vx00Var2, 0);
                                bVarI.r(bw00Var);
                                obj3 = bw00Var;
                            }
                            Function0 function3 = (Function0) obj3;
                            boolean zA11 = bVarI.A(vx00Var2);
                            Object objY12 = bVarI.y();
                            Object obj15 = objY12;
                            if (zA11 || objY12 == obj) {
                                Object e1dVar = new e1d(vx00Var2, 1);
                                bVarI.r(e1dVar);
                                obj15 = e1dVar;
                            }
                            szg0.a(null, null, null, null, function3, (Function0) obj15, null, bVarI, 0, 65);
                            throw null;
                        }
                        if (nu00Var instanceof nu00.d) {
                            vx00Var2 = vx00Var2;
                            bVarI.N(1144587221);
                            ot90.c(com.sportygames.newcms.c.c(lu00.b2.a2, new String[0], bVarI), "OK", function0, bVarI, 48 | ((i4 >> 6) & 896));
                            bVarI.X(false);
                            bVar4 = bVarI;
                        } else {
                            if (!(nu00Var instanceof nu00.a)) {
                                vx00Var2 = vx00Var2;
                                throw igf0.a(bVarI, 1144496221, false);
                            }
                            bVarI.N(1122682020);
                            ku00 ku00Var = ((nu00.a) nu00Var).a;
                            if (ku00Var == null) {
                                bVarI.N(1122754405);
                                Context context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
                                String strC11 = com.sportygames.newcms.c.c(lu00.b2.z, new String[0], bVarI);
                                Unit unit = Unit.a;
                                boolean zA12 = bVarI.A(context) | bVarI.M(strC11);
                                Object objY13 = bVarI.y();
                                if (zA12 || objY13 == obj) {
                                    vx00Var2 = vx00Var2;
                                    obj2 = objY13;
                                    Object bVar11 = new b(null, context, strC11);
                                    bVarI.r(bVar11);
                                    obj2 = bVar11;
                                }
                                xvf.e(bVarI, unit, (Function2) obj2);
                                z = false;
                                bVarI.X(false);
                            } else {
                                vx00Var2 = vx00Var2;
                                bVarI.N(1123044007);
                                com.sportygames.newcms.c.a(bVar, pp8.b(1055641873, new npr(ku00Var, vx00Var2, str), bVarI), bVarI, 48 | ((i4 >> 9) & 14));
                                z = false;
                                bVarI.X(false);
                            }
                            bVarI.X(z);
                            bVar4 = bVarI;
                        }
                    }
                }
                lx00Var = (lx00) ytwVarC2.getValue();
                if (Intrinsics.g(lx00Var, lx00.a.a)) {
                    bVar4.N(1144617980);
                    zA3 = bVar4.A(vx00Var2);
                    objY2 = bVar4.y();
                    if (zA3 || objY2 == obj) {
                        obj9 = objY2;
                        Object g1dVar = new g1d(vx00Var2, 2);
                        bVar4.r(g1dVar);
                        obj9 = g1dVar;
                    }
                    lkz.j((Function0) obj9, bVar4, 0);
                    bVar4.X(false);
                } else if (Intrinsics.g(lx00Var, lx00.b.a)) {
                    bVar4.N(1144622710);
                    zA = bVar4.A(vx00Var2);
                    objY = bVar4.y();
                    if (zA || objY == obj) {
                        obj7 = objY;
                        Object obj16 = new Function0() { // from class: fw00
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                vx00Var2.G1(pu00.HOW_TO_PLAY_VISIT);
                                return Unit.a;
                            }
                        };
                        bVar4.r(obj16);
                        obj7 = obj16;
                    }
                    Function0 function4 = (Function0) obj7;
                    zA2 = bVar4.A(vx00Var2);
                    Object objY14 = bVar4.y();
                    obj8 = objY14;
                    if (zA2 || objY14 == obj) {
                        Object obj17 = new Function0() { // from class: lw00
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                vx00Var2.P.setValue(lx00.c.a);
                                return Unit.a;
                            }
                        };
                        bVar4.r(obj17);
                        obj8 = obj17;
                    }
                    klm.c(function4, (Function0) obj8, bVar4, 0);
                    bVar4.X(false);
                } else {
                    bVar4.N(1144629955);
                    bVar4.X(false);
                }
                final ytw ytwVar4 = ytwVar;
                q75.a(j.e(androidx.compose.ui.d.a.b, 1.0f), null, false, pp8.b(1326382281, new gaj() { // from class: mw00
                    /* JADX WARN: Code duplicated, block: B:100:0x033b  */
                    /* JADX WARN: Code duplicated, block: B:103:0x035f  */
                    /* JADX WARN: Code duplicated, block: B:111:0x0388  */
                    /* JADX WARN: Code duplicated, block: B:113:0x03b9  */
                    /* JADX WARN: Code duplicated, block: B:115:0x03be  */
                    /* JADX WARN: Code duplicated, block: B:118:0x03dc  */
                    /* JADX WARN: Code duplicated, block: B:121:0x03e1  */
                    /* JADX WARN: Code duplicated, block: B:125:0x03f9 A[ADDED_TO_REGION] */
                    /* JADX WARN: Code duplicated, block: B:126:0x03fb  */
                    /* JADX WARN: Code duplicated, block: B:79:0x0275  */
                    /* JADX WARN: Code duplicated, block: B:81:0x02a6  */
                    /* JADX WARN: Code duplicated, block: B:82:0x02aa  */
                    /* JADX WARN: Code duplicated, block: B:86:0x02c4  */
                    /* JADX WARN: Code duplicated, block: B:90:0x02da  */
                    /* JADX WARN: Code duplicated, block: B:96:0x030d  */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj18, Object obj19, Object obj20) {
                        a.C0041a.C0042a c0042a;
                        int i8;
                        vx00 vx00Var3;
                        a aVar3;
                        float fD;
                        float fE;
                        float f2;
                        boolean zA13;
                        Object objY15;
                        a.C0041a.C0042a c0042a2;
                        boolean zA14;
                        Object objY16;
                        float fD2;
                        float fE2;
                        float f3;
                        final Function0 function5;
                        boolean zM2;
                        Object objY17;
                        boolean zA15;
                        Object objY18;
                        boolean zA16;
                        Object objY19;
                        final vx00 vx00Var4;
                        boolean zM3;
                        Object objY20;
                        r75 r75Var = (r75) obj18;
                        a aVar4 = (a) obj19;
                        int iIntValue = ((Integer) obj20).intValue();
                        r75Var.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= aVar4.M(r75Var) ? 4 : 2;
                        }
                        int i9 = 1;
                        if (aVar4.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                            final twd0 twd0Var = ytwVar4;
                            sx00 sx00Var = (sx00) twd0Var.getValue();
                            boolean zG2 = Intrinsics.g(sx00Var, sxs.a);
                            final vx00 vx00Var5 = vx00Var2;
                            a.C0041a.C0042a c0042a3 = a.C0041a.a;
                            if (zG2) {
                                aVar4.N(-951913156);
                                zys.d(((Number) wyh.c(vx00Var5.c.g(), aVar4, 0, 7).getValue()).floatValue(), aVar4, 0);
                                aVar4.H();
                            } else {
                                boolean zG3 = Intrinsics.g(sx00Var, xzs.a);
                                twd0 twd0Var2 = ytwVar3;
                                if (zG3) {
                                    aVar4.N(-951908113);
                                    uf00 uf00Var = (uf00) n95.b(vx00Var5.S, aVar4).getValue();
                                    boolean zBooleanValue = ((Boolean) twd0Var2.getValue()).booleanValue();
                                    boolean zA17 = aVar4.A(vx00Var5);
                                    Object objY21 = aVar4.y();
                                    if (zA17 || objY21 == c0042a3) {
                                        objY21 = new h1d(vx00Var5, 1);
                                        aVar4.r(objY21);
                                    }
                                    Function0 function6 = (Function0) objY21;
                                    boolean zA18 = aVar4.A(vx00Var5);
                                    Object objY22 = aVar4.y();
                                    if (zA18 || objY22 == c0042a3) {
                                        objY22 = new jaj() { // from class: ew00
                                            @Override // defpackage.jaj
                                            public final Object l(Object obj21, Object obj22, Object obj23, Object obj24, Object obj25) {
                                                double dDoubleValue = ((Double) obj21).doubleValue();
                                                long jLongValue = ((Long) obj22).longValue();
                                                String str6 = (String) obj23;
                                                String str7 = (String) obj24;
                                                ap20 ap20Var = (ap20) obj25;
                                                str6.getClass();
                                                str7.getClass();
                                                ap20Var.getClass();
                                                vx00Var5.B1(dDoubleValue, jLongValue, ap20Var, str6, str7, false);
                                                return Unit.a;
                                            }
                                        };
                                        aVar4.r(objY22);
                                    }
                                    cv00.a(uf00Var, zBooleanValue, function6, (jaj) objY22, aVar4, 0);
                                    aVar4.H();
                                } else {
                                    if (Intrinsics.g(sx00Var, g7v.a)) {
                                        aVar4.N(556384558);
                                        Unit unit2 = Unit.a;
                                        boolean zA19 = aVar4.A(vx00Var5);
                                        Object objY23 = aVar4.y();
                                        if (zA19 || objY23 == c0042a3) {
                                            objY23 = new m4(vx00Var5, 2);
                                            aVar4.r(objY23);
                                        }
                                        xvf.c(unit2, (Function1) objY23, aVar4);
                                        boolean zA20 = aVar4.A(vx00Var5);
                                        Object objY24 = aVar4.y();
                                        if (zA20 || objY24 == c0042a3) {
                                            objY24 = new sw00.d(vx00Var5, null);
                                            aVar4.r(objY24);
                                        }
                                        xvf.e(aVar4, unit2, (Function2) objY24);
                                        ytw ytwVarC4 = wyh.c(vx00Var5.J, aVar4, 0, 7);
                                        nx00 nx00VarB = vx00Var5.i.b();
                                        xav.a(nx00VarB != null ? new iav(nx00VarB.a, nx00VarB.b, v57.b(nx00VarB.g)) : null, (yav) ytwVarC4.getValue(), ((Boolean) twd0Var2.getValue()).booleanValue(), aVar4, 0);
                                        aVar4.H();
                                    } else if (Intrinsics.g(sx00Var, noj.a)) {
                                        aVar4.N(557155993);
                                        Unit unit3 = Unit.a;
                                        boolean zA21 = aVar4.A(vx00Var5);
                                        Object objY25 = aVar4.y();
                                        if (zA21 || objY25 == c0042a3) {
                                            objY25 = new p99(vx00Var5, i9);
                                            aVar4.r(objY25);
                                        }
                                        xvf.c(unit3, (Function1) objY25, aVar4);
                                        nx00 nx00VarB2 = vx00Var5.i.b();
                                        poj pojVar = nx00VarB2 != null ? new poj(nx00VarB2.a, nx00VarB2.b, nx00VarB2.c, nx00VarB2.d, nx00VarB2.e, nx00VarB2.f, v57.b(nx00VarB2.g)) : null;
                                        b390 b390Var = vx00Var5.Z;
                                        b390 b390Var2 = vx00Var5.Y;
                                        drj drjVar = (drj) wyh.c(vx00Var5.X, aVar4, 0, 7).getValue();
                                        boolean zBooleanValue2 = ((Boolean) twd0Var2.getValue()).booleanValue();
                                        boolean zA22 = aVar4.A(vx00Var5);
                                        Object objY26 = aVar4.y();
                                        if (zA22 || objY26 == c0042a3) {
                                            objY26 = new p1d(vx00Var5, 1);
                                            aVar4.r(objY26);
                                        }
                                        Function0 function7 = (Function0) objY26;
                                        boolean zA23 = aVar4.A(vx00Var5);
                                        Object objY27 = aVar4.y();
                                        if (zA23 || objY27 == c0042a3) {
                                            objY27 = new Function1() { // from class: gw00
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj21) {
                                                    ap20 ap20Var = (ap20) obj21;
                                                    ap20Var.getClass();
                                                    vx00 vx00Var6 = vx00Var5;
                                                    vx00Var6.getClass();
                                                    wwd0 wwd0Var = vx00Var6.U;
                                                    Boolean bool = Boolean.FALSE;
                                                    wwd0Var.getClass();
                                                    wwd0Var.k(null, bool);
                                                    ej5.c(o8i0.d(vx00Var6), null, null, new my00(vx00Var6, ap20Var, null), 3);
                                                    return Unit.a;
                                                }
                                            };
                                            aVar4.r(objY27);
                                        }
                                        c0042a = c0042a3;
                                        eqj.c(r75Var, pojVar, b390Var, b390Var2, drjVar, zBooleanValue2, function7, (Function1) objY27, aVar4, iIntValue & 14);
                                        aVar4 = aVar4;
                                        aVar4.H();
                                    } else {
                                        c0042a = c0042a3;
                                        if (!Intrinsics.g(sx00Var, yi50.a)) {
                                            throw rg.a(-951910579, aVar4);
                                        }
                                        aVar4.N(558081777);
                                        Unit unit4 = Unit.a;
                                        boolean zA24 = aVar4.A(vx00Var5);
                                        Object objY28 = aVar4.y();
                                        if (zA24 || objY28 == c0042a) {
                                            objY28 = new sw00.e(vx00Var5, null);
                                            aVar4.r(objY28);
                                        }
                                        xvf.e(aVar4, unit4, (Function2) objY28);
                                        zj50 zj50Var = (zj50) wyh.c(vx00Var5.a0, aVar4, 0, 7).getValue();
                                        boolean zBooleanValue3 = ((Boolean) twd0Var2.getValue()).booleanValue();
                                        boolean zA25 = aVar4.A(vx00Var5);
                                        Object objY29 = aVar4.y();
                                        if (zA25 || objY29 == c0042a) {
                                            objY29 = new jaj() { // from class: hw00
                                                @Override // defpackage.jaj
                                                public final Object l(Object obj21, Object obj22, Object obj23, Object obj24, Object obj25) {
                                                    double dDoubleValue = ((Double) obj21).doubleValue();
                                                    long jLongValue = ((Long) obj22).longValue();
                                                    String str6 = (String) obj23;
                                                    String str7 = (String) obj24;
                                                    ap20 ap20Var = (ap20) obj25;
                                                    str6.getClass();
                                                    str7.getClass();
                                                    ap20Var.getClass();
                                                    vx00Var5.B1(dDoubleValue, jLongValue, ap20Var, str6, str7, true);
                                                    return Unit.a;
                                                }
                                            };
                                            aVar4.r(objY29);
                                        }
                                        jaj jajVar = (jaj) objY29;
                                        boolean zA26 = aVar4.A(vx00Var5);
                                        Object objY30 = aVar4.y();
                                        if (zA26 || objY30 == c0042a) {
                                            objY30 = new jaj() { // from class: iw00
                                                @Override // defpackage.jaj
                                                public final Object l(Object obj21, Object obj22, Object obj23, Object obj24, Object obj25) {
                                                    double dDoubleValue = ((Double) obj21).doubleValue();
                                                    long jLongValue = ((Long) obj22).longValue();
                                                    String str6 = (String) obj23;
                                                    String str7 = (String) obj24;
                                                    ap20 ap20Var = (ap20) obj25;
                                                    str6.getClass();
                                                    str7.getClass();
                                                    ap20Var.getClass();
                                                    vx00Var5.B1(dDoubleValue, jLongValue, ap20Var, str6, str7, false);
                                                    return Unit.a;
                                                }
                                            };
                                            aVar4.r(objY30);
                                        }
                                        dk50.a(zj50Var, zBooleanValue3, jajVar, (jaj) objY30, aVar4, 0);
                                        aVar4.H();
                                    }
                                    if (((sx00) twd0Var.getValue()) instanceof sxs) {
                                        i8 = 546848121;
                                        vx00Var3 = vx00Var5;
                                        aVar4.N(546848121);
                                    } else {
                                        aVar4.N(559474421);
                                        d dVarB = sw00.b(r75Var, (sx00) twd0Var.getValue(), true, r75Var.d(), r75Var.e(), aVar4);
                                        ytw ytwVarC5 = wyh.c(vx00Var5.b0, aVar4, 0, 7);
                                        fD2 = r75Var.d();
                                        fE2 = r75Var.e();
                                        if (fD2 / fE2 <= 0.5625f) {
                                            f3 = (fD2 / 0.5625f) * 0.07f;
                                        } else {
                                            f3 = fE2 * 0.07f;
                                        }
                                        boolean zA27 = aVar4.A(vx00Var5) | aVar4.M(twd0Var);
                                        function5 = function0;
                                        zM2 = zA27 | aVar4.M(function5);
                                        objY17 = aVar4.y();
                                        if (zM2 || objY17 == c0042a) {
                                            objY17 = new Function0() { // from class: jw00
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    vx00 vx00Var6 = vx00Var5;
                                                    sx00 sx00Var2 = (sx00) vx00Var6.N.getValue();
                                                    if (sx00Var2 instanceof xzs) {
                                                        ej5.c(o8i0.d(vx00Var6), null, null, new by00(vx00Var6, null), 3);
                                                    } else if (sx00Var2 instanceof noj) {
                                                        ej5.c(o8i0.d(vx00Var6), null, null, new fy00(vx00Var6, null), 3);
                                                    } else if (sx00Var2 instanceof yi50) {
                                                        ej5.c(o8i0.d(vx00Var6), null, null, new cy00(vx00Var6, null), 3);
                                                    }
                                                    if (!(((sx00) twd0Var.getValue()) instanceof noj)) {
                                                        function5.invoke();
                                                    }
                                                    return Unit.a;
                                                }
                                            };
                                            aVar4.r(objY17);
                                        }
                                        Function0 function8 = (Function0) objY17;
                                        zA15 = aVar4.A(vx00Var5);
                                        objY18 = aVar4.y();
                                        if (zA15 || objY18 == c0042a) {
                                            objY18 = new Function0() { // from class: kw00
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    vx00Var5.P.setValue(lx00.d.a);
                                                    return Unit.a;
                                                }
                                            };
                                            aVar4.r(objY18);
                                        }
                                        Function0 function9 = (Function0) objY18;
                                        double d2 = ((vxi0) ytwVarC5.getValue()).a;
                                        String str6 = ((vxi0) ytwVarC5.getValue()).b;
                                        double d3 = ((vxi0) ytwVarC5.getValue()).c;
                                        zA16 = aVar4.A(vx00Var5);
                                        objY19 = aVar4.y();
                                        if (!zA16 || objY19 == c0042a) {
                                            objY19 = new sw00.c(0, vx00Var5, vx00.class, "resetDiff", "resetDiff()V", 0);
                                            vx00Var4 = vx00Var5;
                                            aVar4.r(objY19);
                                        } else {
                                            vx00Var4 = vx00Var5;
                                        }
                                        Function0 function10 = (Function0) ((chp) objY19);
                                        zM3 = aVar4.M(twd0Var) | aVar4.A(vx00Var4);
                                        objY20 = aVar4.y();
                                        if (zM3 || objY20 == c0042a) {
                                            objY20 = new Function0() { // from class: cw00
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    boolean z4 = ((sx00) twd0Var.getValue()) instanceof xzs;
                                                    vx00 vx00Var6 = vx00Var4;
                                                    if (z4) {
                                                        vx00Var6.G1(pu00.SESSION_LOBBY_CHAT_CLICK);
                                                    }
                                                    wwd0 wwd0Var = vx00Var6.O;
                                                    nu00.a aVar5 = new nu00.a(vx00Var6.F.invoke());
                                                    wwd0Var.getClass();
                                                    wwd0Var.k(null, aVar5);
                                                    return Unit.a;
                                                }
                                            };
                                            aVar4.r(objY20);
                                        }
                                        a aVar5 = aVar4;
                                        vx00Var3 = vx00Var4;
                                        i8 = 546848121;
                                        mjj.b(f3, function8, function9, d2, str6, d3, function10, dVarB, (Function0) objY20, aVar5, 0);
                                        aVar4 = aVar5;
                                    }
                                    aVar4.H();
                                    if (!(((sx00) twd0Var.getValue()) instanceof g7v) || (((sx00) twd0Var.getValue()) instanceof noj)) {
                                        aVar4.N(560700688);
                                        aVar3 = aVar4;
                                        d dVarB2 = sw00.b(r75Var, (sx00) twd0Var.getValue(), false, r75Var.d(), r75Var.e(), aVar3);
                                        fD = r75Var.d();
                                        fE = r75Var.e();
                                        if (fD / fE <= 0.5625f) {
                                            f2 = (fD / 0.5625f) * 0.06f;
                                        } else {
                                            f2 = fE * 0.06f;
                                        }
                                        float f4 = f2;
                                        boolean zBooleanValue4 = ((Boolean) wyh.c(vx00Var3.I, aVar3, 0, 7).getValue()).booleanValue();
                                        zA13 = aVar3.A(vx00Var3);
                                        objY15 = aVar3.y();
                                        if (zA13) {
                                            c0042a2 = c0042a;
                                        } else {
                                            c0042a2 = c0042a;
                                            if (objY15 == c0042a2) {
                                            }
                                            Function0 function11 = (Function0) objY15;
                                            zA14 = aVar3.A(vx00Var3);
                                            objY16 = aVar3.y();
                                            if (zA14 || objY16 == c0042a2) {
                                                objY16 = new dw00(vx00Var3, 0);
                                                aVar3.r(objY16);
                                            }
                                            l240.c(dVarB2, f4, zBooleanValue4, function11, (Function1) objY16, aVar3, 0);
                                            aVar4 = aVar3;
                                        }
                                        objY15 = new j1d(vx00Var3, 1);
                                        aVar3.r(objY15);
                                        Function0 function12 = (Function0) objY15;
                                        zA14 = aVar3.A(vx00Var3);
                                        objY16 = aVar3.y();
                                        if (zA14) {
                                            objY16 = new dw00(vx00Var3, 0);
                                            aVar3.r(objY16);
                                        } else {
                                            objY16 = new dw00(vx00Var3, 0);
                                            aVar3.r(objY16);
                                        }
                                        l240.c(dVarB2, f4, zBooleanValue4, function12, (Function1) objY16, aVar3, 0);
                                        aVar4 = aVar3;
                                    } else {
                                        aVar4.N(i8);
                                    }
                                    aVar4.H();
                                }
                            }
                            c0042a = c0042a3;
                            if (((sx00) twd0Var.getValue()) instanceof sxs) {
                                aVar4.N(559474421);
                                d dVarB3 = sw00.b(r75Var, (sx00) twd0Var.getValue(), true, r75Var.d(), r75Var.e(), aVar4);
                                ytw ytwVarC6 = wyh.c(vx00Var5.b0, aVar4, 0, 7);
                                fD2 = r75Var.d();
                                fE2 = r75Var.e();
                                if (fD2 / fE2 <= 0.5625f) {
                                    f3 = (fD2 / 0.5625f) * 0.07f;
                                } else {
                                    f3 = fE2 * 0.07f;
                                }
                                boolean zA28 = aVar4.A(vx00Var5) | aVar4.M(twd0Var);
                                function5 = function0;
                                zM2 = zA28 | aVar4.M(function5);
                                objY17 = aVar4.y();
                                if (zM2) {
                                    objY17 = new Function0() { // from class: jw00
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            vx00 vx00Var6 = vx00Var5;
                                            sx00 sx00Var2 = (sx00) vx00Var6.N.getValue();
                                            if (sx00Var2 instanceof xzs) {
                                                ej5.c(o8i0.d(vx00Var6), null, null, new by00(vx00Var6, null), 3);
                                            } else if (sx00Var2 instanceof noj) {
                                                ej5.c(o8i0.d(vx00Var6), null, null, new fy00(vx00Var6, null), 3);
                                            } else if (sx00Var2 instanceof yi50) {
                                                ej5.c(o8i0.d(vx00Var6), null, null, new cy00(vx00Var6, null), 3);
                                            }
                                            if (!(((sx00) twd0Var.getValue()) instanceof noj)) {
                                                function5.invoke();
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    aVar4.r(objY17);
                                } else {
                                    objY17 = new Function0() { // from class: jw00
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            vx00 vx00Var6 = vx00Var5;
                                            sx00 sx00Var2 = (sx00) vx00Var6.N.getValue();
                                            if (sx00Var2 instanceof xzs) {
                                                ej5.c(o8i0.d(vx00Var6), null, null, new by00(vx00Var6, null), 3);
                                            } else if (sx00Var2 instanceof noj) {
                                                ej5.c(o8i0.d(vx00Var6), null, null, new fy00(vx00Var6, null), 3);
                                            } else if (sx00Var2 instanceof yi50) {
                                                ej5.c(o8i0.d(vx00Var6), null, null, new cy00(vx00Var6, null), 3);
                                            }
                                            if (!(((sx00) twd0Var.getValue()) instanceof noj)) {
                                                function5.invoke();
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    aVar4.r(objY17);
                                }
                                Function0 function13 = (Function0) objY17;
                                zA15 = aVar4.A(vx00Var5);
                                objY18 = aVar4.y();
                                if (zA15) {
                                    objY18 = new Function0() { // from class: kw00
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            vx00Var5.P.setValue(lx00.d.a);
                                            return Unit.a;
                                        }
                                    };
                                    aVar4.r(objY18);
                                } else {
                                    objY18 = new Function0() { // from class: kw00
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            vx00Var5.P.setValue(lx00.d.a);
                                            return Unit.a;
                                        }
                                    };
                                    aVar4.r(objY18);
                                }
                                Function0 function14 = (Function0) objY18;
                                double d4 = ((vxi0) ytwVarC6.getValue()).a;
                                String str7 = ((vxi0) ytwVarC6.getValue()).b;
                                double d5 = ((vxi0) ytwVarC6.getValue()).c;
                                zA16 = aVar4.A(vx00Var5);
                                objY19 = aVar4.y();
                                if (zA16) {
                                    objY19 = new sw00.c(0, vx00Var5, vx00.class, "resetDiff", "resetDiff()V", 0);
                                    vx00Var4 = vx00Var5;
                                    aVar4.r(objY19);
                                } else {
                                    objY19 = new sw00.c(0, vx00Var5, vx00.class, "resetDiff", "resetDiff()V", 0);
                                    vx00Var4 = vx00Var5;
                                    aVar4.r(objY19);
                                }
                                Function0 function15 = (Function0) ((chp) objY19);
                                zM3 = aVar4.M(twd0Var) | aVar4.A(vx00Var4);
                                objY20 = aVar4.y();
                                if (zM3) {
                                    objY20 = new Function0() { // from class: cw00
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            boolean z4 = ((sx00) twd0Var.getValue()) instanceof xzs;
                                            vx00 vx00Var6 = vx00Var4;
                                            if (z4) {
                                                vx00Var6.G1(pu00.SESSION_LOBBY_CHAT_CLICK);
                                            }
                                            wwd0 wwd0Var = vx00Var6.O;
                                            nu00.a aVar6 = new nu00.a(vx00Var6.F.invoke());
                                            wwd0Var.getClass();
                                            wwd0Var.k(null, aVar6);
                                            return Unit.a;
                                        }
                                    };
                                    aVar4.r(objY20);
                                } else {
                                    objY20 = new Function0() { // from class: cw00
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            boolean z4 = ((sx00) twd0Var.getValue()) instanceof xzs;
                                            vx00 vx00Var6 = vx00Var4;
                                            if (z4) {
                                                vx00Var6.G1(pu00.SESSION_LOBBY_CHAT_CLICK);
                                            }
                                            wwd0 wwd0Var = vx00Var6.O;
                                            nu00.a aVar6 = new nu00.a(vx00Var6.F.invoke());
                                            wwd0Var.getClass();
                                            wwd0Var.k(null, aVar6);
                                            return Unit.a;
                                        }
                                    };
                                    aVar4.r(objY20);
                                }
                                a aVar6 = aVar4;
                                vx00Var3 = vx00Var4;
                                i8 = 546848121;
                                mjj.b(f3, function13, function14, d4, str7, d5, function15, dVarB3, (Function0) objY20, aVar6, 0);
                                aVar4 = aVar6;
                            } else {
                                i8 = 546848121;
                                vx00Var3 = vx00Var5;
                                aVar4.N(546848121);
                            }
                            aVar4.H();
                            if (((sx00) twd0Var.getValue()) instanceof g7v) {
                                aVar4.N(560700688);
                                aVar3 = aVar4;
                                d dVarB4 = sw00.b(r75Var, (sx00) twd0Var.getValue(), false, r75Var.d(), r75Var.e(), aVar3);
                                fD = r75Var.d();
                                fE = r75Var.e();
                                if (fD / fE <= 0.5625f) {
                                    f2 = (fD / 0.5625f) * 0.06f;
                                } else {
                                    f2 = fE * 0.06f;
                                }
                                float f5 = f2;
                                boolean zBooleanValue5 = ((Boolean) wyh.c(vx00Var3.I, aVar3, 0, 7).getValue()).booleanValue();
                                zA13 = aVar3.A(vx00Var3);
                                objY15 = aVar3.y();
                                if (zA13) {
                                    c0042a2 = c0042a;
                                    if (objY15 == c0042a2) {
                                    }
                                    Function0 function16 = (Function0) objY15;
                                    zA14 = aVar3.A(vx00Var3);
                                    objY16 = aVar3.y();
                                    if (zA14) {
                                        objY16 = new dw00(vx00Var3, 0);
                                        aVar3.r(objY16);
                                    } else {
                                        objY16 = new dw00(vx00Var3, 0);
                                        aVar3.r(objY16);
                                    }
                                    l240.c(dVarB4, f5, zBooleanValue5, function16, (Function1) objY16, aVar3, 0);
                                    aVar4 = aVar3;
                                } else {
                                    c0042a2 = c0042a;
                                }
                                objY15 = new j1d(vx00Var3, 1);
                                aVar3.r(objY15);
                                Function0 function17 = (Function0) objY15;
                                zA14 = aVar3.A(vx00Var3);
                                objY16 = aVar3.y();
                                if (zA14) {
                                    objY16 = new dw00(vx00Var3, 0);
                                    aVar3.r(objY16);
                                } else {
                                    objY16 = new dw00(vx00Var3, 0);
                                    aVar3.r(objY16);
                                }
                                l240.c(dVarB4, f5, zBooleanValue5, function17, (Function1) objY16, aVar3, 0);
                                aVar4 = aVar3;
                            } else {
                                aVar4.N(560700688);
                                aVar3 = aVar4;
                                d dVarB5 = sw00.b(r75Var, (sx00) twd0Var.getValue(), false, r75Var.d(), r75Var.e(), aVar3);
                                fD = r75Var.d();
                                fE = r75Var.e();
                                if (fD / fE <= 0.5625f) {
                                    f2 = (fD / 0.5625f) * 0.06f;
                                } else {
                                    f2 = fE * 0.06f;
                                }
                                float f6 = f2;
                                boolean zBooleanValue6 = ((Boolean) wyh.c(vx00Var3.I, aVar3, 0, 7).getValue()).booleanValue();
                                zA13 = aVar3.A(vx00Var3);
                                objY15 = aVar3.y();
                                if (zA13) {
                                    c0042a2 = c0042a;
                                    if (objY15 == c0042a2) {
                                    }
                                    Function0 function18 = (Function0) objY15;
                                    zA14 = aVar3.A(vx00Var3);
                                    objY16 = aVar3.y();
                                    if (zA14) {
                                        objY16 = new dw00(vx00Var3, 0);
                                        aVar3.r(objY16);
                                    } else {
                                        objY16 = new dw00(vx00Var3, 0);
                                        aVar3.r(objY16);
                                    }
                                    l240.c(dVarB5, f6, zBooleanValue6, function18, (Function1) objY16, aVar3, 0);
                                    aVar4 = aVar3;
                                } else {
                                    c0042a2 = c0042a;
                                }
                                objY15 = new j1d(vx00Var3, 1);
                                aVar3.r(objY15);
                                Function0 function19 = (Function0) objY15;
                                zA14 = aVar3.A(vx00Var3);
                                objY16 = aVar3.y();
                                if (zA14) {
                                    objY16 = new dw00(vx00Var3, 0);
                                    aVar3.r(objY16);
                                } else {
                                    objY16 = new dw00(vx00Var3, 0);
                                    aVar3.r(objY16);
                                }
                                l240.c(dVarB5, f6, zBooleanValue6, function19, (Function1) objY16, aVar3, 0);
                                aVar4 = aVar3;
                            }
                            aVar4.H();
                        } else {
                            aVar4.G();
                        }
                        return Unit.a;
                    }
                }, bVar4), bVar4, 3078, 6);
                bVar2 = bVar4;
            }
            obj = obj10;
            vx00Var2 = vx00Var2;
            bVar5 = bVarI;
            ytwVar3 = ytwVar2;
            bVar4 = bVar5;
            lx00Var = (lx00) ytwVarC2.getValue();
            if (Intrinsics.g(lx00Var, lx00.a.a)) {
                bVar4.N(1144617980);
                zA3 = bVar4.A(vx00Var2);
                objY2 = bVar4.y();
                if (zA3) {
                    obj9 = objY2;
                    Object g1dVar2 = new g1d(vx00Var2, 2);
                    bVar4.r(g1dVar2);
                    obj9 = g1dVar2;
                } else {
                    obj9 = objY2;
                    Object g1dVar3 = new g1d(vx00Var2, 2);
                    bVar4.r(g1dVar3);
                    obj9 = g1dVar3;
                }
                lkz.j((Function0) obj9, bVar4, 0);
                bVar4.X(false);
            } else if (Intrinsics.g(lx00Var, lx00.b.a)) {
                bVar4.N(1144622710);
                zA = bVar4.A(vx00Var2);
                objY = bVar4.y();
                if (zA) {
                    obj7 = objY;
                    Object obj18 = new Function0() { // from class: fw00
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            vx00Var2.G1(pu00.HOW_TO_PLAY_VISIT);
                            return Unit.a;
                        }
                    };
                    bVar4.r(obj18);
                    obj7 = obj18;
                } else {
                    obj7 = objY;
                    Object obj19 = new Function0() { // from class: fw00
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            vx00Var2.G1(pu00.HOW_TO_PLAY_VISIT);
                            return Unit.a;
                        }
                    };
                    bVar4.r(obj19);
                    obj7 = obj19;
                }
                Function0 function5 = (Function0) obj7;
                zA2 = bVar4.A(vx00Var2);
                Object objY15 = bVar4.y();
                obj8 = objY15;
                if (zA2) {
                    Object obj110 = new Function0() { // from class: lw00
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            vx00Var2.P.setValue(lx00.c.a);
                            return Unit.a;
                        }
                    };
                    bVar4.r(obj110);
                    obj8 = obj110;
                } else {
                    Object obj111 = new Function0() { // from class: lw00
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            vx00Var2.P.setValue(lx00.c.a);
                            return Unit.a;
                        }
                    };
                    bVar4.r(obj111);
                    obj8 = obj111;
                }
                klm.c(function5, (Function0) obj8, bVar4, 0);
                bVar4.X(false);
            } else {
                bVar4.N(1144629955);
                bVar4.X(false);
            }
            final ytw ytwVar5 = ytwVar;
            q75.a(j.e(androidx.compose.ui.d.a.b, 1.0f), null, false, pp8.b(1326382281, new gaj() { // from class: mw00
                /* JADX WARN: Code duplicated, block: B:100:0x033b  */
                /* JADX WARN: Code duplicated, block: B:103:0x035f  */
                /* JADX WARN: Code duplicated, block: B:111:0x0388  */
                /* JADX WARN: Code duplicated, block: B:113:0x03b9  */
                /* JADX WARN: Code duplicated, block: B:115:0x03be  */
                /* JADX WARN: Code duplicated, block: B:118:0x03dc  */
                /* JADX WARN: Code duplicated, block: B:121:0x03e1  */
                /* JADX WARN: Code duplicated, block: B:125:0x03f9 A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:126:0x03fb  */
                /* JADX WARN: Code duplicated, block: B:79:0x0275  */
                /* JADX WARN: Code duplicated, block: B:81:0x02a6  */
                /* JADX WARN: Code duplicated, block: B:82:0x02aa  */
                /* JADX WARN: Code duplicated, block: B:86:0x02c4  */
                /* JADX WARN: Code duplicated, block: B:90:0x02da  */
                /* JADX WARN: Code duplicated, block: B:96:0x030d  */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.gaj
                public final Object invoke(Object obj112, Object obj113, Object obj20) {
                    a.C0041a.C0042a c0042a;
                    int i8;
                    vx00 vx00Var3;
                    a aVar3;
                    float fD;
                    float fE;
                    float f2;
                    boolean zA13;
                    Object objY16;
                    a.C0041a.C0042a c0042a2;
                    boolean zA14;
                    Object objY17;
                    float fD2;
                    float fE2;
                    float f3;
                    final Function0 function6;
                    boolean zM2;
                    Object objY18;
                    boolean zA15;
                    Object objY19;
                    boolean zA16;
                    Object objY110;
                    final vx00 vx00Var4;
                    boolean zM3;
                    Object objY20;
                    r75 r75Var = (r75) obj112;
                    a aVar4 = (a) obj113;
                    int iIntValue = ((Integer) obj20).intValue();
                    r75Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar4.M(r75Var) ? 4 : 2;
                    }
                    int i9 = 1;
                    if (aVar4.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        final twd0 twd0Var = ytwVar5;
                        sx00 sx00Var = (sx00) twd0Var.getValue();
                        boolean zG2 = Intrinsics.g(sx00Var, sxs.a);
                        final vx00 vx00Var5 = vx00Var2;
                        a.C0041a.C0042a c0042a3 = a.C0041a.a;
                        if (zG2) {
                            aVar4.N(-951913156);
                            zys.d(((Number) wyh.c(vx00Var5.c.g(), aVar4, 0, 7).getValue()).floatValue(), aVar4, 0);
                            aVar4.H();
                        } else {
                            boolean zG3 = Intrinsics.g(sx00Var, xzs.a);
                            twd0 twd0Var2 = ytwVar3;
                            if (zG3) {
                                aVar4.N(-951908113);
                                uf00 uf00Var = (uf00) n95.b(vx00Var5.S, aVar4).getValue();
                                boolean zBooleanValue = ((Boolean) twd0Var2.getValue()).booleanValue();
                                boolean zA17 = aVar4.A(vx00Var5);
                                Object objY21 = aVar4.y();
                                if (zA17 || objY21 == c0042a3) {
                                    objY21 = new h1d(vx00Var5, 1);
                                    aVar4.r(objY21);
                                }
                                Function0 function7 = (Function0) objY21;
                                boolean zA18 = aVar4.A(vx00Var5);
                                Object objY22 = aVar4.y();
                                if (zA18 || objY22 == c0042a3) {
                                    objY22 = new jaj() { // from class: ew00
                                        @Override // defpackage.jaj
                                        public final Object l(Object obj21, Object obj22, Object obj23, Object obj24, Object obj25) {
                                            double dDoubleValue = ((Double) obj21).doubleValue();
                                            long jLongValue = ((Long) obj22).longValue();
                                            String str6 = (String) obj23;
                                            String str7 = (String) obj24;
                                            ap20 ap20Var = (ap20) obj25;
                                            str6.getClass();
                                            str7.getClass();
                                            ap20Var.getClass();
                                            vx00Var5.B1(dDoubleValue, jLongValue, ap20Var, str6, str7, false);
                                            return Unit.a;
                                        }
                                    };
                                    aVar4.r(objY22);
                                }
                                cv00.a(uf00Var, zBooleanValue, function7, (jaj) objY22, aVar4, 0);
                                aVar4.H();
                            } else {
                                if (Intrinsics.g(sx00Var, g7v.a)) {
                                    aVar4.N(556384558);
                                    Unit unit2 = Unit.a;
                                    boolean zA19 = aVar4.A(vx00Var5);
                                    Object objY23 = aVar4.y();
                                    if (zA19 || objY23 == c0042a3) {
                                        objY23 = new m4(vx00Var5, 2);
                                        aVar4.r(objY23);
                                    }
                                    xvf.c(unit2, (Function1) objY23, aVar4);
                                    boolean zA20 = aVar4.A(vx00Var5);
                                    Object objY24 = aVar4.y();
                                    if (zA20 || objY24 == c0042a3) {
                                        objY24 = new sw00.d(vx00Var5, null);
                                        aVar4.r(objY24);
                                    }
                                    xvf.e(aVar4, unit2, (Function2) objY24);
                                    ytw ytwVarC4 = wyh.c(vx00Var5.J, aVar4, 0, 7);
                                    nx00 nx00VarB = vx00Var5.i.b();
                                    xav.a(nx00VarB != null ? new iav(nx00VarB.a, nx00VarB.b, v57.b(nx00VarB.g)) : null, (yav) ytwVarC4.getValue(), ((Boolean) twd0Var2.getValue()).booleanValue(), aVar4, 0);
                                    aVar4.H();
                                } else if (Intrinsics.g(sx00Var, noj.a)) {
                                    aVar4.N(557155993);
                                    Unit unit3 = Unit.a;
                                    boolean zA21 = aVar4.A(vx00Var5);
                                    Object objY25 = aVar4.y();
                                    if (zA21 || objY25 == c0042a3) {
                                        objY25 = new p99(vx00Var5, i9);
                                        aVar4.r(objY25);
                                    }
                                    xvf.c(unit3, (Function1) objY25, aVar4);
                                    nx00 nx00VarB2 = vx00Var5.i.b();
                                    poj pojVar = nx00VarB2 != null ? new poj(nx00VarB2.a, nx00VarB2.b, nx00VarB2.c, nx00VarB2.d, nx00VarB2.e, nx00VarB2.f, v57.b(nx00VarB2.g)) : null;
                                    b390 b390Var = vx00Var5.Z;
                                    b390 b390Var2 = vx00Var5.Y;
                                    drj drjVar = (drj) wyh.c(vx00Var5.X, aVar4, 0, 7).getValue();
                                    boolean zBooleanValue2 = ((Boolean) twd0Var2.getValue()).booleanValue();
                                    boolean zA22 = aVar4.A(vx00Var5);
                                    Object objY26 = aVar4.y();
                                    if (zA22 || objY26 == c0042a3) {
                                        objY26 = new p1d(vx00Var5, 1);
                                        aVar4.r(objY26);
                                    }
                                    Function0 function8 = (Function0) objY26;
                                    boolean zA23 = aVar4.A(vx00Var5);
                                    Object objY27 = aVar4.y();
                                    if (zA23 || objY27 == c0042a3) {
                                        objY27 = new Function1() { // from class: gw00
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj21) {
                                                ap20 ap20Var = (ap20) obj21;
                                                ap20Var.getClass();
                                                vx00 vx00Var6 = vx00Var5;
                                                vx00Var6.getClass();
                                                wwd0 wwd0Var = vx00Var6.U;
                                                Boolean bool = Boolean.FALSE;
                                                wwd0Var.getClass();
                                                wwd0Var.k(null, bool);
                                                ej5.c(o8i0.d(vx00Var6), null, null, new my00(vx00Var6, ap20Var, null), 3);
                                                return Unit.a;
                                            }
                                        };
                                        aVar4.r(objY27);
                                    }
                                    c0042a = c0042a3;
                                    eqj.c(r75Var, pojVar, b390Var, b390Var2, drjVar, zBooleanValue2, function8, (Function1) objY27, aVar4, iIntValue & 14);
                                    aVar4 = aVar4;
                                    aVar4.H();
                                } else {
                                    c0042a = c0042a3;
                                    if (!Intrinsics.g(sx00Var, yi50.a)) {
                                        throw rg.a(-951910579, aVar4);
                                    }
                                    aVar4.N(558081777);
                                    Unit unit4 = Unit.a;
                                    boolean zA24 = aVar4.A(vx00Var5);
                                    Object objY28 = aVar4.y();
                                    if (zA24 || objY28 == c0042a) {
                                        objY28 = new sw00.e(vx00Var5, null);
                                        aVar4.r(objY28);
                                    }
                                    xvf.e(aVar4, unit4, (Function2) objY28);
                                    zj50 zj50Var = (zj50) wyh.c(vx00Var5.a0, aVar4, 0, 7).getValue();
                                    boolean zBooleanValue3 = ((Boolean) twd0Var2.getValue()).booleanValue();
                                    boolean zA25 = aVar4.A(vx00Var5);
                                    Object objY29 = aVar4.y();
                                    if (zA25 || objY29 == c0042a) {
                                        objY29 = new jaj() { // from class: hw00
                                            @Override // defpackage.jaj
                                            public final Object l(Object obj21, Object obj22, Object obj23, Object obj24, Object obj25) {
                                                double dDoubleValue = ((Double) obj21).doubleValue();
                                                long jLongValue = ((Long) obj22).longValue();
                                                String str6 = (String) obj23;
                                                String str7 = (String) obj24;
                                                ap20 ap20Var = (ap20) obj25;
                                                str6.getClass();
                                                str7.getClass();
                                                ap20Var.getClass();
                                                vx00Var5.B1(dDoubleValue, jLongValue, ap20Var, str6, str7, true);
                                                return Unit.a;
                                            }
                                        };
                                        aVar4.r(objY29);
                                    }
                                    jaj jajVar = (jaj) objY29;
                                    boolean zA26 = aVar4.A(vx00Var5);
                                    Object objY30 = aVar4.y();
                                    if (zA26 || objY30 == c0042a) {
                                        objY30 = new jaj() { // from class: iw00
                                            @Override // defpackage.jaj
                                            public final Object l(Object obj21, Object obj22, Object obj23, Object obj24, Object obj25) {
                                                double dDoubleValue = ((Double) obj21).doubleValue();
                                                long jLongValue = ((Long) obj22).longValue();
                                                String str6 = (String) obj23;
                                                String str7 = (String) obj24;
                                                ap20 ap20Var = (ap20) obj25;
                                                str6.getClass();
                                                str7.getClass();
                                                ap20Var.getClass();
                                                vx00Var5.B1(dDoubleValue, jLongValue, ap20Var, str6, str7, false);
                                                return Unit.a;
                                            }
                                        };
                                        aVar4.r(objY30);
                                    }
                                    dk50.a(zj50Var, zBooleanValue3, jajVar, (jaj) objY30, aVar4, 0);
                                    aVar4.H();
                                }
                                if (((sx00) twd0Var.getValue()) instanceof sxs) {
                                    i8 = 546848121;
                                    vx00Var3 = vx00Var5;
                                    aVar4.N(546848121);
                                } else {
                                    aVar4.N(559474421);
                                    d dVarB3 = sw00.b(r75Var, (sx00) twd0Var.getValue(), true, r75Var.d(), r75Var.e(), aVar4);
                                    ytw ytwVarC6 = wyh.c(vx00Var5.b0, aVar4, 0, 7);
                                    fD2 = r75Var.d();
                                    fE2 = r75Var.e();
                                    if (fD2 / fE2 <= 0.5625f) {
                                        f3 = (fD2 / 0.5625f) * 0.07f;
                                    } else {
                                        f3 = fE2 * 0.07f;
                                    }
                                    boolean zA28 = aVar4.A(vx00Var5) | aVar4.M(twd0Var);
                                    function6 = function0;
                                    zM2 = zA28 | aVar4.M(function6);
                                    objY18 = aVar4.y();
                                    if (zM2 || objY18 == c0042a) {
                                        objY18 = new Function0() { // from class: jw00
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                vx00 vx00Var6 = vx00Var5;
                                                sx00 sx00Var2 = (sx00) vx00Var6.N.getValue();
                                                if (sx00Var2 instanceof xzs) {
                                                    ej5.c(o8i0.d(vx00Var6), null, null, new by00(vx00Var6, null), 3);
                                                } else if (sx00Var2 instanceof noj) {
                                                    ej5.c(o8i0.d(vx00Var6), null, null, new fy00(vx00Var6, null), 3);
                                                } else if (sx00Var2 instanceof yi50) {
                                                    ej5.c(o8i0.d(vx00Var6), null, null, new cy00(vx00Var6, null), 3);
                                                }
                                                if (!(((sx00) twd0Var.getValue()) instanceof noj)) {
                                                    function6.invoke();
                                                }
                                                return Unit.a;
                                            }
                                        };
                                        aVar4.r(objY18);
                                    }
                                    Function0 function13 = (Function0) objY18;
                                    zA15 = aVar4.A(vx00Var5);
                                    objY19 = aVar4.y();
                                    if (zA15 || objY19 == c0042a) {
                                        objY19 = new Function0() { // from class: kw00
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                vx00Var5.P.setValue(lx00.d.a);
                                                return Unit.a;
                                            }
                                        };
                                        aVar4.r(objY19);
                                    }
                                    Function0 function14 = (Function0) objY19;
                                    double d4 = ((vxi0) ytwVarC6.getValue()).a;
                                    String str7 = ((vxi0) ytwVarC6.getValue()).b;
                                    double d5 = ((vxi0) ytwVarC6.getValue()).c;
                                    zA16 = aVar4.A(vx00Var5);
                                    objY110 = aVar4.y();
                                    if (!zA16 || objY110 == c0042a) {
                                        objY110 = new sw00.c(0, vx00Var5, vx00.class, "resetDiff", "resetDiff()V", 0);
                                        vx00Var4 = vx00Var5;
                                        aVar4.r(objY110);
                                    } else {
                                        vx00Var4 = vx00Var5;
                                    }
                                    Function0 function15 = (Function0) ((chp) objY110);
                                    zM3 = aVar4.M(twd0Var) | aVar4.A(vx00Var4);
                                    objY20 = aVar4.y();
                                    if (zM3 || objY20 == c0042a) {
                                        objY20 = new Function0() { // from class: cw00
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                boolean z4 = ((sx00) twd0Var.getValue()) instanceof xzs;
                                                vx00 vx00Var6 = vx00Var4;
                                                if (z4) {
                                                    vx00Var6.G1(pu00.SESSION_LOBBY_CHAT_CLICK);
                                                }
                                                wwd0 wwd0Var = vx00Var6.O;
                                                nu00.a aVar6 = new nu00.a(vx00Var6.F.invoke());
                                                wwd0Var.getClass();
                                                wwd0Var.k(null, aVar6);
                                                return Unit.a;
                                            }
                                        };
                                        aVar4.r(objY20);
                                    }
                                    a aVar6 = aVar4;
                                    vx00Var3 = vx00Var4;
                                    i8 = 546848121;
                                    mjj.b(f3, function13, function14, d4, str7, d5, function15, dVarB3, (Function0) objY20, aVar6, 0);
                                    aVar4 = aVar6;
                                }
                                aVar4.H();
                                if (!(((sx00) twd0Var.getValue()) instanceof g7v) || (((sx00) twd0Var.getValue()) instanceof noj)) {
                                    aVar4.N(560700688);
                                    aVar3 = aVar4;
                                    d dVarB5 = sw00.b(r75Var, (sx00) twd0Var.getValue(), false, r75Var.d(), r75Var.e(), aVar3);
                                    fD = r75Var.d();
                                    fE = r75Var.e();
                                    if (fD / fE <= 0.5625f) {
                                        f2 = (fD / 0.5625f) * 0.06f;
                                    } else {
                                        f2 = fE * 0.06f;
                                    }
                                    float f6 = f2;
                                    boolean zBooleanValue6 = ((Boolean) wyh.c(vx00Var3.I, aVar3, 0, 7).getValue()).booleanValue();
                                    zA13 = aVar3.A(vx00Var3);
                                    objY16 = aVar3.y();
                                    if (zA13) {
                                        c0042a2 = c0042a;
                                    } else {
                                        c0042a2 = c0042a;
                                        if (objY16 == c0042a2) {
                                        }
                                        Function0 function19 = (Function0) objY16;
                                        zA14 = aVar3.A(vx00Var3);
                                        objY17 = aVar3.y();
                                        if (zA14 || objY17 == c0042a2) {
                                            objY17 = new dw00(vx00Var3, 0);
                                            aVar3.r(objY17);
                                        }
                                        l240.c(dVarB5, f6, zBooleanValue6, function19, (Function1) objY17, aVar3, 0);
                                        aVar4 = aVar3;
                                    }
                                    objY16 = new j1d(vx00Var3, 1);
                                    aVar3.r(objY16);
                                    Function0 function110 = (Function0) objY16;
                                    zA14 = aVar3.A(vx00Var3);
                                    objY17 = aVar3.y();
                                    if (zA14) {
                                        objY17 = new dw00(vx00Var3, 0);
                                        aVar3.r(objY17);
                                    } else {
                                        objY17 = new dw00(vx00Var3, 0);
                                        aVar3.r(objY17);
                                    }
                                    l240.c(dVarB5, f6, zBooleanValue6, function110, (Function1) objY17, aVar3, 0);
                                    aVar4 = aVar3;
                                } else {
                                    aVar4.N(i8);
                                }
                                aVar4.H();
                            }
                        }
                        c0042a = c0042a3;
                        if (((sx00) twd0Var.getValue()) instanceof sxs) {
                            aVar4.N(559474421);
                            d dVarB4 = sw00.b(r75Var, (sx00) twd0Var.getValue(), true, r75Var.d(), r75Var.e(), aVar4);
                            ytw ytwVarC7 = wyh.c(vx00Var5.b0, aVar4, 0, 7);
                            fD2 = r75Var.d();
                            fE2 = r75Var.e();
                            if (fD2 / fE2 <= 0.5625f) {
                                f3 = (fD2 / 0.5625f) * 0.07f;
                            } else {
                                f3 = fE2 * 0.07f;
                            }
                            boolean zA29 = aVar4.A(vx00Var5) | aVar4.M(twd0Var);
                            function6 = function0;
                            zM2 = zA29 | aVar4.M(function6);
                            objY18 = aVar4.y();
                            if (zM2) {
                                objY18 = new Function0() { // from class: jw00
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        vx00 vx00Var6 = vx00Var5;
                                        sx00 sx00Var2 = (sx00) vx00Var6.N.getValue();
                                        if (sx00Var2 instanceof xzs) {
                                            ej5.c(o8i0.d(vx00Var6), null, null, new by00(vx00Var6, null), 3);
                                        } else if (sx00Var2 instanceof noj) {
                                            ej5.c(o8i0.d(vx00Var6), null, null, new fy00(vx00Var6, null), 3);
                                        } else if (sx00Var2 instanceof yi50) {
                                            ej5.c(o8i0.d(vx00Var6), null, null, new cy00(vx00Var6, null), 3);
                                        }
                                        if (!(((sx00) twd0Var.getValue()) instanceof noj)) {
                                            function6.invoke();
                                        }
                                        return Unit.a;
                                    }
                                };
                                aVar4.r(objY18);
                            } else {
                                objY18 = new Function0() { // from class: jw00
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        vx00 vx00Var6 = vx00Var5;
                                        sx00 sx00Var2 = (sx00) vx00Var6.N.getValue();
                                        if (sx00Var2 instanceof xzs) {
                                            ej5.c(o8i0.d(vx00Var6), null, null, new by00(vx00Var6, null), 3);
                                        } else if (sx00Var2 instanceof noj) {
                                            ej5.c(o8i0.d(vx00Var6), null, null, new fy00(vx00Var6, null), 3);
                                        } else if (sx00Var2 instanceof yi50) {
                                            ej5.c(o8i0.d(vx00Var6), null, null, new cy00(vx00Var6, null), 3);
                                        }
                                        if (!(((sx00) twd0Var.getValue()) instanceof noj)) {
                                            function6.invoke();
                                        }
                                        return Unit.a;
                                    }
                                };
                                aVar4.r(objY18);
                            }
                            Function0 function16 = (Function0) objY18;
                            zA15 = aVar4.A(vx00Var5);
                            objY19 = aVar4.y();
                            if (zA15) {
                                objY19 = new Function0() { // from class: kw00
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        vx00Var5.P.setValue(lx00.d.a);
                                        return Unit.a;
                                    }
                                };
                                aVar4.r(objY19);
                            } else {
                                objY19 = new Function0() { // from class: kw00
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        vx00Var5.P.setValue(lx00.d.a);
                                        return Unit.a;
                                    }
                                };
                                aVar4.r(objY19);
                            }
                            Function0 function17 = (Function0) objY19;
                            double d6 = ((vxi0) ytwVarC7.getValue()).a;
                            String str8 = ((vxi0) ytwVarC7.getValue()).b;
                            double d7 = ((vxi0) ytwVarC7.getValue()).c;
                            zA16 = aVar4.A(vx00Var5);
                            objY110 = aVar4.y();
                            if (zA16) {
                                objY110 = new sw00.c(0, vx00Var5, vx00.class, "resetDiff", "resetDiff()V", 0);
                                vx00Var4 = vx00Var5;
                                aVar4.r(objY110);
                            } else {
                                objY110 = new sw00.c(0, vx00Var5, vx00.class, "resetDiff", "resetDiff()V", 0);
                                vx00Var4 = vx00Var5;
                                aVar4.r(objY110);
                            }
                            Function0 function18 = (Function0) ((chp) objY110);
                            zM3 = aVar4.M(twd0Var) | aVar4.A(vx00Var4);
                            objY20 = aVar4.y();
                            if (zM3) {
                                objY20 = new Function0() { // from class: cw00
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        boolean z4 = ((sx00) twd0Var.getValue()) instanceof xzs;
                                        vx00 vx00Var6 = vx00Var4;
                                        if (z4) {
                                            vx00Var6.G1(pu00.SESSION_LOBBY_CHAT_CLICK);
                                        }
                                        wwd0 wwd0Var = vx00Var6.O;
                                        nu00.a aVar7 = new nu00.a(vx00Var6.F.invoke());
                                        wwd0Var.getClass();
                                        wwd0Var.k(null, aVar7);
                                        return Unit.a;
                                    }
                                };
                                aVar4.r(objY20);
                            } else {
                                objY20 = new Function0() { // from class: cw00
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        boolean z4 = ((sx00) twd0Var.getValue()) instanceof xzs;
                                        vx00 vx00Var6 = vx00Var4;
                                        if (z4) {
                                            vx00Var6.G1(pu00.SESSION_LOBBY_CHAT_CLICK);
                                        }
                                        wwd0 wwd0Var = vx00Var6.O;
                                        nu00.a aVar7 = new nu00.a(vx00Var6.F.invoke());
                                        wwd0Var.getClass();
                                        wwd0Var.k(null, aVar7);
                                        return Unit.a;
                                    }
                                };
                                aVar4.r(objY20);
                            }
                            a aVar7 = aVar4;
                            vx00Var3 = vx00Var4;
                            i8 = 546848121;
                            mjj.b(f3, function16, function17, d6, str8, d7, function18, dVarB4, (Function0) objY20, aVar7, 0);
                            aVar4 = aVar7;
                        } else {
                            i8 = 546848121;
                            vx00Var3 = vx00Var5;
                            aVar4.N(546848121);
                        }
                        aVar4.H();
                        if (((sx00) twd0Var.getValue()) instanceof g7v) {
                            aVar4.N(560700688);
                            aVar3 = aVar4;
                            d dVarB6 = sw00.b(r75Var, (sx00) twd0Var.getValue(), false, r75Var.d(), r75Var.e(), aVar3);
                            fD = r75Var.d();
                            fE = r75Var.e();
                            if (fD / fE <= 0.5625f) {
                                f2 = (fD / 0.5625f) * 0.06f;
                            } else {
                                f2 = fE * 0.06f;
                            }
                            float f7 = f2;
                            boolean zBooleanValue7 = ((Boolean) wyh.c(vx00Var3.I, aVar3, 0, 7).getValue()).booleanValue();
                            zA13 = aVar3.A(vx00Var3);
                            objY16 = aVar3.y();
                            if (zA13) {
                                c0042a2 = c0042a;
                                if (objY16 == c0042a2) {
                                }
                                Function0 function111 = (Function0) objY16;
                                zA14 = aVar3.A(vx00Var3);
                                objY17 = aVar3.y();
                                if (zA14) {
                                    objY17 = new dw00(vx00Var3, 0);
                                    aVar3.r(objY17);
                                } else {
                                    objY17 = new dw00(vx00Var3, 0);
                                    aVar3.r(objY17);
                                }
                                l240.c(dVarB6, f7, zBooleanValue7, function111, (Function1) objY17, aVar3, 0);
                                aVar4 = aVar3;
                            } else {
                                c0042a2 = c0042a;
                            }
                            objY16 = new j1d(vx00Var3, 1);
                            aVar3.r(objY16);
                            Function0 function112 = (Function0) objY16;
                            zA14 = aVar3.A(vx00Var3);
                            objY17 = aVar3.y();
                            if (zA14) {
                                objY17 = new dw00(vx00Var3, 0);
                                aVar3.r(objY17);
                            } else {
                                objY17 = new dw00(vx00Var3, 0);
                                aVar3.r(objY17);
                            }
                            l240.c(dVarB6, f7, zBooleanValue7, function112, (Function1) objY17, aVar3, 0);
                            aVar4 = aVar3;
                        } else {
                            aVar4.N(560700688);
                            aVar3 = aVar4;
                            d dVarB7 = sw00.b(r75Var, (sx00) twd0Var.getValue(), false, r75Var.d(), r75Var.e(), aVar3);
                            fD = r75Var.d();
                            fE = r75Var.e();
                            if (fD / fE <= 0.5625f) {
                                f2 = (fD / 0.5625f) * 0.06f;
                            } else {
                                f2 = fE * 0.06f;
                            }
                            float f8 = f2;
                            boolean zBooleanValue8 = ((Boolean) wyh.c(vx00Var3.I, aVar3, 0, 7).getValue()).booleanValue();
                            zA13 = aVar3.A(vx00Var3);
                            objY16 = aVar3.y();
                            if (zA13) {
                                c0042a2 = c0042a;
                                if (objY16 == c0042a2) {
                                }
                                Function0 function113 = (Function0) objY16;
                                zA14 = aVar3.A(vx00Var3);
                                objY17 = aVar3.y();
                                if (zA14) {
                                    objY17 = new dw00(vx00Var3, 0);
                                    aVar3.r(objY17);
                                } else {
                                    objY17 = new dw00(vx00Var3, 0);
                                    aVar3.r(objY17);
                                }
                                l240.c(dVarB7, f8, zBooleanValue8, function113, (Function1) objY17, aVar3, 0);
                                aVar4 = aVar3;
                            } else {
                                c0042a2 = c0042a;
                            }
                            objY16 = new j1d(vx00Var3, 1);
                            aVar3.r(objY16);
                            Function0 function114 = (Function0) objY16;
                            zA14 = aVar3.A(vx00Var3);
                            objY17 = aVar3.y();
                            if (zA14) {
                                objY17 = new dw00(vx00Var3, 0);
                                aVar3.r(objY17);
                            } else {
                                objY17 = new dw00(vx00Var3, 0);
                                aVar3.r(objY17);
                            }
                            l240.c(dVarB7, f8, zBooleanValue8, function114, (Function1) objY17, aVar3, 0);
                            aVar4 = aVar3;
                        }
                        aVar4.H();
                    } else {
                        aVar4.G();
                    }
                    return Unit.a;
                }
            }, bVar4), bVar4, 3078, 6);
            bVar2 = bVar4;
        } else {
            bVarI.G();
            bVar2 = bVarI;
        }
        androidx.compose.runtime.e eVarZ = bVar2.Z();
        if (eVarZ != null) {
            final vx00 vx00Var3 = vx00Var2;
            eVarZ.d = new Function2(vx00Var3, str, bVar, function0, i) { // from class: nw00
                public final /* synthetic */ vx00 b;
                public final /* synthetic */ String c;
                public final /* synthetic */ b d;
                public final /* synthetic */ Function0 e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj20, Object obj21) {
                    ((Integer) obj21).getClass();
                    int iA = qj40.a(65);
                    sw00.a(this.a, this.b, this.c, this.d, this.e, (a) obj20, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final androidx.compose.ui.d b(r75 r75Var, sx00 sx00Var, boolean z, float f2, float f3, androidx.compose.runtime.a aVar) {
        androidx.compose.ui.d dVarH;
        n54 n54Var = z ? ht.a.b : ht.a.h;
        boolean z2 = sx00Var instanceof noj;
        androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
        if (!z2) {
            aVar.N(900448795);
            aVar.H();
            return j.g(r75Var.b(aVar2, n54Var), 1.0f);
        }
        aVar.N(900228881);
        androidx.compose.ui.d dVarB = r75Var.b(aVar2, n54Var);
        dVarB.getClass();
        if (f2 / f3 <= 0.5625f) {
            float f4 = (f3 - (f2 / 0.5625f)) / 2.0f;
            dVarH = z ? j.g(androidx.compose.foundation.layout.h.j(dVarB, 0.0f, f4, 0.0f, 0.0f, 13), 1.0f) : j.g(androidx.compose.foundation.layout.h.j(dVarB, 0.0f, 0.0f, 0.0f, f4, 7), 1.0f);
        } else {
            dVarH = androidx.compose.foundation.layout.h.h(j.g(dVarB, 1.0f), (f2 - (f3 * 0.5625f)) / 2.0f, 0.0f, 2);
        }
        aVar.H();
        return dVarH;
    }
}
