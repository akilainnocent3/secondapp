package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class khq {

    @c0d(c = "com.sportybet.feature.luckynumber.historydetail.presentation.dialog.LNHistoryDetailDialogKt$LNHistoryDetailDialog$2$1$1", f = "LNHistoryDetailDialog.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ chq a;
        public final /* synthetic */ ytw<chq.c> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(chq chqVar, ytw<chq.c> ytwVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.a = chqVar;
            this.b = ytwVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.a, this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            chq.a aVar = chq.a.a;
            chq chqVar = this.a;
            if (!Intrinsics.g(chqVar, aVar)) {
                if (!(chqVar instanceof chq.c)) {
                    uhc.a();
                    return null;
                }
                this.b.setValue((chq.c) chqVar);
            }
            return Unit.a;
        }
    }

    public static final void a(final chq.c cVar, final Function1<? super xgq, Unit> function1, androidx.compose.runtime.a aVar, final int i) {
        boolean z;
        b bVarI = aVar.i(-2010509109);
        int i2 = (bVarI.M(cVar) ? 4 : 2) | i | (bVarI.A(function1) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            boolean z2 = cVar instanceof c5q;
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (z2) {
                bVarI.N(-1757743883);
                c5q c5qVar = (c5q) cVar;
                int i3 = i2 & 112;
                boolean z3 = i3 == 32;
                Object objY = bVarI.y();
                if (z3 || objY == c0042a) {
                    objY = new dhq(function1, 0);
                    bVarI.r(objY);
                }
                Function0 function0 = (Function0) objY;
                z = i3 == 32;
                Object objY2 = bVarI.y();
                if (z || objY2 == c0042a) {
                    objY2 = new ehq(function1, 0);
                    bVarI.r(objY2);
                }
                bhq.c(c5qVar, function0, (Function0) objY2, bVarI, i2 & 14);
                bVarI.X(false);
            } else {
                if (!cVar.equals(chq.b.a)) {
                    throw igf0.a(bVarI, 636033749, false);
                }
                bVarI.N(-1757439680);
                z = (i2 & 112) == 32;
                Object objY3 = bVarI.y();
                if (z || objY3 == c0042a) {
                    objY3 = new fhq(function1, 0);
                    bVarI.r(objY3);
                }
                whq.a((Function0) objY3, bVarI, 0);
                bVarI.X(false);
            }
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function1, i) { // from class: ghq
                public final /* synthetic */ Function1 b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    khq.a(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final chq chqVar, final Function1<? super xgq, Unit> function1, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        chqVar.getClass();
        function1.getClass();
        b bVarI = aVar.i(628566445);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(chqVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function1) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            boolean z = chqVar instanceof chq.c;
            chq.c cVar = (chq.c) (!z ? null : chqVar);
            boolean zA = cVar != null ? cVar.a() : true;
            boolean z2 = (i2 & 112) == 32;
            Object objY = bVarI.y();
            if (z2 || objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new hhq(function1, 0);
                bVarI.r(objY);
            }
            dz90.a(z, zA, (Function0) objY, 0L, pp8.b(1125675038, new Function2() { // from class: ihq
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    chq.c cVar2;
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        Object objY2 = aVar2.y();
                        a.C0041a.C0042a c0042a = a.C0041a.a;
                        if (objY2 == c0042a) {
                            objY2 = m.b(null);
                            aVar2.r(objY2);
                        }
                        ytw ytwVar = (ytw) objY2;
                        chq chqVar2 = chqVar;
                        boolean zM = aVar2.M(chqVar2);
                        Object objY3 = aVar2.y();
                        if (zM || objY3 == c0042a) {
                            objY3 = new khq.a(chqVar2, ytwVar, null);
                            aVar2.r(objY3);
                        }
                        xvf.e(aVar2, chqVar2, (Function2) objY3);
                        if (Intrinsics.g(chqVar2, chq.a.a)) {
                            cVar2 = (chq.c) ytwVar.getValue();
                        } else {
                            if (!(chqVar2 instanceof chq.c)) {
                                uhc.a();
                                return null;
                            }
                            cVar2 = (chq.c) chqVar2;
                        }
                        if (cVar2 == null) {
                            aVar2.N(-119132735);
                            aVar2.H();
                        } else {
                            aVar2.N(-119132734);
                            khq.a(cVar2, function1, aVar2, 0);
                            aVar2.H();
                        }
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 24576, 8);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: jhq
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i | 1);
                    khq.b(chqVar, function1, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
