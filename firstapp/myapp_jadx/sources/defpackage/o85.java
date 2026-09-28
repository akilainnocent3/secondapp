package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
public final class o85 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final az40 az40Var, final Function2 function2, final Function0 function0, final Function0 function1, final Function0 function3, final Function0 function4, d95 d95Var, a aVar, final int i) {
        final d95 d95Var2;
        d95 d95Var3;
        int i2;
        d95 d95Var4;
        az40Var.getClass();
        function2.getClass();
        function0.getClass();
        function1.getClass();
        function3.getClass();
        function4.getClass();
        b bVarI = aVar.i(1720313751);
        int i3 = i | (bVarI.A(az40Var) ? 4 : 2) | (bVarI.A(function2) ? 32 : 16) | (bVarI.A(function0) ? 256 : 128) | (bVarI.A(function1) ? 2048 : 1024) | (bVarI.A(function3) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(function4) ? 131072 : 65536) | 524288;
        if (bVarI.q(i3 & 1, (599187 & i3) != 599186)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                w8i0 w8i0VarA = zdt.a(bVarI);
                if (w8i0VarA == null) {
                    ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    d95Var3 = (d95) p8i0.a(jq40.a(d95.class), w8i0VarA, null, cll.a(w8i0VarA, bVarI), w8i0VarA instanceof iel ? ((iel) w8i0VarA).getDefaultViewModelCreationExtras() : cyb.a.b, bVarI);
                    i2 = i3 & (-3670017);
                }
            } else {
                bVarI.G();
                i2 = i3 & (-3670017);
                d95Var3 = d95Var;
            }
            bVarI.Y();
            p85 p85Var = ((c95) wyh.c(d95Var3.y, bVarI, 0, 7).getValue()).b;
            if (Intrinsics.g(p85Var, p85.c.a)) {
                bVarI.N(-340876645);
                bVarI.X(false);
                d95Var4 = d95Var3;
            } else {
                boolean zG = Intrinsics.g(p85Var, p85.a.a);
                a.C0041a.C0042a c0042a = a.C0041a.a;
                if (zG) {
                    bVarI.N(-1977151563);
                    boolean zA = bVarI.A(d95Var3);
                    Object objY = bVarI.y();
                    if (zA || objY == c0042a) {
                        objY = new m85(0, d95Var3, d95.class, "trackDismiss", "trackDismiss()V", 0);
                        bVarI.r(objY);
                    }
                    chp chpVar = (chp) objY;
                    boolean zA2 = bVarI.A(d95Var3) | ((i2 & 112) == 32);
                    Object objY2 = bVarI.y();
                    if (zA2 || objY2 == c0042a) {
                        objY2 = new i85(0, function2, d95Var3);
                        bVarI.r(objY2);
                    }
                    ifd.a(az40Var, (Function1) objY2, "register__deposit_now__btn", function0, (Function0) chpVar, function4, bVarI, (i2 & 14) | 392 | ((i2 << 3) & 7168) | (i2 & 458752), 0);
                    bVarI = bVarI;
                    bVarI.X(false);
                    d95Var4 = d95Var3;
                } else {
                    final d95 d95Var5 = d95Var3;
                    if (!(p85Var instanceof p85.b)) {
                        throw igf0.a(bVarI, -340878487, false);
                    }
                    bVarI.N(-1976488566);
                    q85 q85Var = ((p85.b) p85Var).a;
                    boolean zA3 = bVarI.A(d95Var5) | ((i2 & 112) == 32);
                    Object objY3 = bVarI.y();
                    if (zA3 || objY3 == c0042a) {
                        objY3 = new Function0() { // from class: j85
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                String str = (String) CollectionsKt.b0(z76.o.b);
                                d95 d95Var6 = d95Var5;
                                ej5.c(d95Var6.w, null, null, new l95(d95Var6, str, null), 3);
                                function2.invoke(Boolean.TRUE, dag.LOYALTY);
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY3);
                    }
                    Function0 function5 = (Function0) objY3;
                    boolean zA4 = bVarI.A(d95Var5) | ((i2 & 7168) == 2048);
                    Object objY4 = bVarI.y();
                    if (zA4 || objY4 == c0042a) {
                        objY4 = new Function0() { // from class: k85
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                d95Var5.i.a.a(ts40.u.a, k00.d);
                                function1.invoke();
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY4);
                    }
                    Function0 function6 = (Function0) objY4;
                    boolean zA5 = bVarI.A(d95Var5);
                    Object objY5 = bVarI.y();
                    if (zA5 || objY5 == c0042a) {
                        d95Var4 = d95Var5;
                        objY5 = new n85(0, d95Var4, d95.class, "trackDismiss", "trackDismiss()V", 0);
                        bVarI.r(objY5);
                    } else {
                        d95Var4 = d95Var5;
                    }
                    int i4 = d95.B;
                    b95.a(q85Var, function5, function6, function3, (Function0) ((chp) objY5), function4, d95Var4, bVarI, (i2 & 458752) | ((i2 >> 3) & 7168) | 2097152);
                    bVarI = bVarI;
                    bVarI.X(false);
                }
            }
            d95Var2 = d95Var4;
        } else {
            bVarI.G();
            d95Var2 = d95Var;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function2, function0, function1, function3, function4, d95Var2, i) { // from class: l85
                public final /* synthetic */ Function2 b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ Function0 d;
                public final /* synthetic */ Function0 e;
                public final /* synthetic */ Function0 f;
                public final /* synthetic */ d95 i;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(9);
                    o85.a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
