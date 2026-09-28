package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class uvd {

    @c0d(c = "com.sportybet.android.globalpay.pixBtg.deposit.compose.DepositConfirmationBottomSheetKt$DepositConfirmationBottomSheet$1$1", f = "DepositConfirmationBottomSheet.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ vvd a;
        public final /* synthetic */ v5b b;
        public final /* synthetic */ ytw<Boolean> c;
        public final /* synthetic */ j590 d;

        /* JADX INFO: renamed from: uvd$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.android.globalpay.pixBtg.deposit.compose.DepositConfirmationBottomSheetKt$DepositConfirmationBottomSheet$1$1$1", f = "DepositConfirmationBottomSheet.kt", l = {52}, m = "invokeSuspend", v = 2)
        public static final class C1190a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ j590 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1190a(j590 j590Var, v1b<? super C1190a> v1bVar) {
                super(2, v1bVar);
                this.b = j590Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new C1190a(this.b, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((C1190a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    this.a = 1;
                    if (this.b.d(this) == y5bVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(vvd vvdVar, v5b v5bVar, ytw<Boolean> ytwVar, j590 j590Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.a = vvdVar;
            this.b = v5bVar;
            this.c = ytwVar;
            this.d = j590Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.a, this.b, this.c, this.d, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            boolean z = this.a.a;
            final ytw<Boolean> ytwVar = this.c;
            if (z) {
                ytwVar.setValue(Boolean.TRUE);
            } else {
                final j590 j590Var = this.d;
                ej5.c(this.b, null, null, new C1190a(j590Var, null), 3).invokeOnCompletion(new Function1() { // from class: tvd
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        if (!j590Var.e()) {
                            ytwVar.setValue(Boolean.FALSE);
                        }
                        return Unit.a;
                    }
                });
            }
            return Unit.a;
        }
    }

    public static final void a(final int i, androidx.compose.runtime.a aVar, final d dVar, final String str) {
        b bVar;
        b bVarI = aVar.i(1329436823);
        int i2 = i | (bVarI.M(str) ? 4 : 2);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            d dVarG = j.g(dVar, 1.0f);
            d160 d160VarA = b160.a(kw0.a, ht.a.j, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarG);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
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
            lkf0.d(cb40.a(R.string.component_boleto_deposit_info__cpf, new Object[0], bVarI), yy.a(bVarI, dVarC, yka.a.d, 1.0f, true), c68.a(R.color.text_secondary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVarI), bVarI, 0, 0, 131064);
            lkf0.d(str, null, c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVarI), bVarI, i2 & 14, 0, 131066);
            bVar = bVarI;
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, dVar, str) { // from class: svd
                public final /* synthetic */ String a;
                public final /* synthetic */ d b;

                {
                    this.a = str;
                    this.b = dVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    uvd.a(qj40.a(49), (a) obj, this.b, this.a);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final vvd vvdVar, final Function0<Unit> function0, final Function0<Unit> function1, final Function0<Unit> function2, androidx.compose.runtime.a aVar, final int i) {
        b bVar;
        ytw ytwVar;
        vvdVar.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        b bVarI = aVar.i(1448362997);
        int i2 = i | (bVarI.M(vvdVar) ? 4 : 2) | (bVarI.A(function0) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128) | (bVarI.A(function2) ? 2048 : 1024);
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            j590 j590VarG = v1w.g(true, null, bVarI, 6, 2);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = xvf.i(kotlin.coroutines.e.a, bVarI);
                bVarI.r(objY);
            }
            v5b v5bVar = (v5b) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = m.b(Boolean.FALSE);
                bVarI.r(objY2);
            }
            ytw ytwVar2 = (ytw) objY2;
            Boolean boolValueOf = Boolean.valueOf(vvdVar.a);
            boolean zA = bVarI.A(v5bVar) | ((i2 & 14) == 4) | bVarI.M(j590VarG);
            Object objY3 = bVarI.y();
            if (zA || objY3 == c0042a) {
                ytwVar = ytwVar2;
                a aVar2 = new a(vvdVar, v5bVar, ytwVar, j590VarG, null);
                bVarI.r(aVar2);
                objY3 = aVar2;
            } else {
                ytwVar = ytwVar2;
            }
            xvf.e(bVarI, boolValueOf, (Function2) objY3);
            if (((Boolean) ytwVar.getValue()).booleanValue()) {
                bVarI.N(941357495);
                v1w.a(function0, null, j590VarG, 0.0f, false, j060.c(0.0f), 0L, 0L, 0L, null, null, null, pp8.b(-378069138, new gaj() { // from class: ovd
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        a aVar3 = (a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ((j78) obj).getClass();
                        if (aVar3.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                            uvd.c(vvdVar, function1, function2, aVar3, 0);
                        } else {
                            aVar3.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVarI, (i2 >> 3) & 14, 3078, 7130);
                bVar = bVarI;
                bVar.X(false);
            } else {
                bVar = bVarI;
                bVar.N(941747661);
                bVar.X(false);
            }
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function0, function1, function2, i) { // from class: pvd
                public final /* synthetic */ Function0 b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ Function0 d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    uvd.b(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final vvd vvdVar, final Function0<Unit> function0, final Function0<Unit> function1, androidx.compose.runtime.a aVar, final int i) {
        b bVarI = aVar.i(-593600868);
        int i2 = (bVarI.M(vvdVar) ? 4 : 2) | i | (bVarI.A(function0) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 << 12;
            eqg0.d(cb40.a(R.string.page_payment__deposit_confirmation, new Object[0], bVarI), vvdVar.b, vvdVar.e, cb40.a(R.string.page_payment__deposit_amount, new Object[0], bVarI), vvdVar.d, function0, function1, null, c9j.c(d.a.b, AnalyticsEvent.FS_ATTRIBUTE_DATA_OP, "deposit__confirm_btn"), pp8.b(266930941, new qvd(vvdVar, 0), bVarI), bVarI, (458752 & i3) | 805306368 | (i3 & 3670016), 128);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function0, function1, i) { // from class: rvd
                public final /* synthetic */ Function0 b;
                public final /* synthetic */ Function0 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    uvd.c(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
