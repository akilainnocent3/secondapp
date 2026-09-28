package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\n²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\n@\nX\u008a\u008e\u0002²\u0006\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\n@\nX\u008a\u008e\u0002"}, d2 = {"Lrr6;", "Lcom/google/android/material/bottomsheet/c;", "<init>", "()V", "Lzl6;", "recommendationsState", "", "", "selectedKeys", "trackedOutcomeKeys", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class rr6 extends tnl {
    public rdd0 f;
    public u350 i;
    public gl6 v;
    public il6 w;
    public hl6 y;

    @c0d(c = "com.sportybet.android.cashoutphase3.presentation.ui.quickreinvest.single.CashoutSuccessSingleBottomSheetDialog$onCreateView$1$1$1$1", f = "CashoutSuccessSingleBottomSheetDialog.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ ks6 a;
        public final /* synthetic */ rr6 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ks6 ks6Var, rr6 rr6Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.a = ks6Var;
            this.b = rr6Var;
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
            String string = this.b.requireArguments().getString("arg_bet_id");
            if (string == null) {
                string = "";
            }
            ks6 ks6Var = this.a;
            ks6Var.getClass();
            ej5.c(o8i0.d(ks6Var), null, null, new is6(ks6Var, string, null), 3);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.android.cashoutphase3.presentation.ui.quickreinvest.single.CashoutSuccessSingleBottomSheetDialog$onCreateView$1$1$2$1", f = "CashoutSuccessSingleBottomSheetDialog.kt", l = {82}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ks6 b;
        public final /* synthetic */ rr6 c;

        public static final class a<T> implements myh {
            public final /* synthetic */ rr6 a;

            public a(rr6 rr6Var) {
                this.a = rr6Var;
            }

            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                rr6 rr6Var = this.a;
                rr6Var.v = null;
                hl6 hl6Var = rr6Var.y;
                if (hl6Var != null) {
                    hl6Var.invoke();
                }
                rr6Var.dismissAllowingStateLoss();
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ks6 ks6Var, rr6 rr6Var, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.b = ks6Var;
            this.c = rr6Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                t340 t340Var = this.b.i;
                rr6 rr6Var = this.c;
                s9s lifecycle = rr6Var.getLifecycle();
                lifecycle.getClass();
                jv5 jv5VarA = zyh.a(t340Var, lifecycle, s9s.b.d);
                a aVar = new a(rr6Var);
                this.a = 1;
                if (jv5VarA.collect(aVar, this) == y5bVar) {
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

    @c0d(c = "com.sportybet.android.cashoutphase3.presentation.ui.quickreinvest.single.CashoutSuccessSingleBottomSheetDialog$onCreateView$1$1$3$1", f = "CashoutSuccessSingleBottomSheetDialog.kt", l = {96}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ks6 b;
        public final /* synthetic */ rr6 c;

        public static final class a<T> implements myh {
            public final /* synthetic */ rr6 a;

            public a(rr6 rr6Var) {
                this.a = rr6Var;
            }

            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                qz3.p(this.a.requireActivity());
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ks6 ks6Var, rr6 rr6Var, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.b = ks6Var;
            this.c = rr6Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new c(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                t340 t340Var = this.b.w;
                rr6 rr6Var = this.c;
                s9s lifecycle = rr6Var.getLifecycle();
                lifecycle.getClass();
                jv5 jv5VarA = zyh.a(t340Var, lifecycle, s9s.b.d);
                a aVar = new a(rr6Var);
                this.a = 1;
                if (jv5VarA.collect(aVar, this) == y5bVar) {
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

    @c0d(c = "com.sportybet.android.cashoutphase3.presentation.ui.quickreinvest.single.CashoutSuccessSingleBottomSheetDialog$onCreateView$1$1$4$1", f = "CashoutSuccessSingleBottomSheetDialog.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ rr6 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z, rr6 rr6Var, v1b<? super d> v1bVar) {
            super(2, v1bVar);
            this.a = z;
            this.b = rr6Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new d(this.a, this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (this.a) {
                this.b.m0().a(txy.a, k00.d);
            }
            return Unit.a;
        }
    }

    public final rdd0 m0() {
        rdd0 rdd0Var = this.f;
        if (rdd0Var != null) {
            return rdd0Var;
        }
        Intrinsics.n("sportyTrackingUseCase");
        throw null;
    }

    @Override // com.google.android.material.bottomsheet.c, defpackage.yq0, androidx.fragment.app.d
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        dialogOnCreateDialog.getClass();
        final com.google.android.material.bottomsheet.b bVar = (com.google.android.material.bottomsheet.b) dialogOnCreateDialog;
        bVar.setOnShowListener(new DialogInterface.OnShowListener() { // from class: hr6
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                View viewFindViewById = bVar.findViewById(R.id.design_bottom_sheet);
                if (viewFindViewById == null) {
                    return;
                }
                BottomSheetBehavior bottomSheetBehaviorC = BottomSheetBehavior.C(viewFindViewById);
                bottomSheetBehaviorC.L(3);
                bottomSheetBehaviorC.Y = true;
            }
        });
        return bVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        return mla.a(contextRequireContext, new op8(-602836103, new Function2() { // from class: ir6
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final rr6 rr6Var = this.a;
                    o0z.a(null, null, null, null, null, pp8.b(1239812584, new Function2() { // from class: jr6
                        /* JADX WARN: Code duplicated, block: B:60:0x015c  */
                        /* JADX WARN: Code duplicated, block: B:65:0x016a  */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            String str;
                            String str2;
                            a aVar2 = (a) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            int i = 0;
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                w8i0 w8i0VarA = zdt.a(aVar2);
                                if (w8i0VarA == null) {
                                    ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                final ks6 ks6Var = (ks6) p8i0.a(jq40.a(ks6.class), w8i0VarA, null, cll.a(w8i0VarA, aVar2), w8i0VarA instanceof iel ? ((iel) w8i0VarA).getDefaultViewModelCreationExtras() : cyb.a.b, aVar2);
                                Unit unit = Unit.a;
                                boolean zA = aVar2.A(ks6Var);
                                final rr6 rr6Var2 = rr6Var;
                                boolean zA2 = zA | aVar2.A(rr6Var2);
                                Object objY = aVar2.y();
                                a.C0041a.C0042a c0042a = a.C0041a.a;
                                if (zA2 || objY == c0042a) {
                                    objY = new rr6.a(ks6Var, rr6Var2, null);
                                    aVar2.r(objY);
                                }
                                xvf.e(aVar2, unit, (Function2) objY);
                                boolean zA3 = aVar2.A(ks6Var) | aVar2.A(rr6Var2);
                                Object objY2 = aVar2.y();
                                if (zA3 || objY2 == c0042a) {
                                    objY2 = new rr6.b(ks6Var, rr6Var2, null);
                                    aVar2.r(objY2);
                                }
                                xvf.e(aVar2, unit, (Function2) objY2);
                                boolean zA4 = aVar2.A(ks6Var) | aVar2.A(rr6Var2);
                                Object objY3 = aVar2.y();
                                if (zA4 || objY3 == c0042a) {
                                    objY3 = new rr6.c(ks6Var, rr6Var2, null);
                                    aVar2.r(objY3);
                                }
                                xvf.e(aVar2, unit, (Function2) objY3);
                                ytw ytwVarB = n95.b(ks6Var.e, aVar2);
                                Object[] objArr = new Object[0];
                                Object objY4 = aVar2.y();
                                if (objY4 == c0042a) {
                                    objY4 = new kr6(0);
                                    aVar2.r(objY4);
                                }
                                uv60 uv60Var = ur6.a;
                                final ytw ytwVarB2 = o350.b(objArr, uv60Var, (Function0) objY4, aVar2);
                                Object[] objArr2 = new Object[0];
                                Object objY5 = aVar2.y();
                                if (objY5 == c0042a) {
                                    objY5 = new lr6(0);
                                    aVar2.r(objY5);
                                }
                                final ytw ytwVarB3 = o350.b(objArr2, uv60Var, (Function0) objY5, aVar2);
                                zl6 zl6Var = (zl6) ytwVarB.getValue();
                                zl6.c cVar = zl6Var instanceof zl6.c ? (zl6.c) zl6Var : null;
                                boolean z = cVar != null && (cVar.a.isEmpty() ^ true);
                                Boolean boolValueOf = Boolean.valueOf(z);
                                boolean zB = aVar2.b(z) | aVar2.A(rr6Var2);
                                Object objY6 = aVar2.y();
                                if (zB || objY6 == c0042a) {
                                    objY6 = new rr6.d(z, rr6Var2, null);
                                    aVar2.r(objY6);
                                }
                                xvf.e(aVar2, boolValueOf, (Function2) objY6);
                                String strA = cb40.a(R.string.bet_history__vs, new Object[0], aVar2);
                                zl6 zl6Var2 = (zl6) ytwVarB.getValue();
                                zl6.c cVar2 = zl6Var2 instanceof zl6.c ? (zl6.c) zl6Var2 : null;
                                final pt90 pt90Var = cVar2 != null ? (pt90) CollectionsKt.firstOrNull(cVar2.a) : null;
                                boolean zM = aVar2.M(pt90Var) | aVar2.M(strA);
                                Object objY7 = aVar2.y();
                                if (zM || objY7 == c0042a) {
                                    if (pt90Var != null) {
                                        str = pt90Var.a.f;
                                        if (StringsKt.U(str)) {
                                            str = null;
                                        }
                                    } else {
                                        str = null;
                                    }
                                    if (pt90Var != null) {
                                        str2 = pt90Var.a.g;
                                        if (StringsKt.U(str2)) {
                                            str2 = null;
                                        }
                                    } else {
                                        str2 = null;
                                    }
                                    String strA0 = CollectionsKt.a0(ay0.v(new String[]{str, str2}), tug.a(" ", strA, " "), null, null, null, 62);
                                    if (StringsKt.U(strA0)) {
                                        strA0 = pt90Var != null ? pt90Var.a.e : null;
                                        if (strA0 == null) {
                                            strA0 = "";
                                        }
                                    }
                                    objY7 = strA0;
                                    aVar2.r(objY7);
                                }
                                String str3 = (String) objY7;
                                String string = rr6Var2.requireArguments().getString("arg_amount");
                                String str4 = string == null ? "" : string;
                                boolean z2 = (pt90Var != null && pt90Var.a.i == 1) || (pt90Var != null && pt90Var.a.i == 2);
                                zl6 zl6Var3 = (zl6) ytwVarB.getValue();
                                zl6.c cVar3 = zl6Var3 instanceof zl6.c ? (zl6.c) zl6Var3 : null;
                                List<pt90> list = cVar3 != null ? cVar3.a : null;
                                if (list == null) {
                                    list = m2g.a;
                                }
                                ln6 ln6Var = new ln6(str4, str3, z2, list, (Set) ytwVarB2.getValue(), ((zl6) ytwVarB.getValue()) instanceof zl6.b);
                                boolean zA5 = aVar2.A(rr6Var2);
                                Object objY8 = aVar2.y();
                                if (zA5 || objY8 == c0042a) {
                                    objY8 = new mr6(rr6Var2, i);
                                    aVar2.r(objY8);
                                }
                                Function0 function0 = (Function0) objY8;
                                boolean zA6 = aVar2.A(rr6Var2) | aVar2.A(pt90Var);
                                Object objY9 = aVar2.y();
                                if (zA6 || objY9 == c0042a) {
                                    objY9 = new Function0() { // from class: nr6
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            rr6 rr6Var3 = rr6Var2;
                                            rr6Var3.m0().a(uxy.a, k00.d);
                                            rr6Var3.v = null;
                                            pt90 pt90Var2 = pt90Var;
                                            if (pt90Var2 != null) {
                                                qt90 qt90Var = pt90Var2.a;
                                                String str5 = qt90Var.a;
                                                int i2 = qt90Var.i;
                                                boolean z3 = true;
                                                if (i2 != 1 && i2 != 2) {
                                                    z3 = false;
                                                }
                                                rt90 rt90Var = pt90Var2.b;
                                                xi6.b(str5, rt90Var.a, rt90Var.b, qt90Var.b, z3);
                                            }
                                            il6 il6Var = rr6Var3.w;
                                            if (il6Var != null) {
                                                il6Var.invoke();
                                            }
                                            rr6Var3.dismissAllowingStateLoss();
                                            return Unit.a;
                                        }
                                    };
                                    aVar2.r(objY9);
                                }
                                Function0 function1 = (Function0) objY9;
                                boolean zM2 = aVar2.M(ytwVarB3) | aVar2.A(rr6Var2) | aVar2.M(ytwVarB2) | aVar2.A(ks6Var);
                                Object objY10 = aVar2.y();
                                if (zM2 || objY10 == c0042a) {
                                    objY10 = new Function1() { // from class: or6
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj5) {
                                            Set setC;
                                            String str5 = (String) obj5;
                                            str5.getClass();
                                            ytw ytwVar = ytwVarB3;
                                            boolean zContains = ((Set) ytwVar.getValue()).contains(str5);
                                            rr6 rr6Var3 = rr6Var2;
                                            if (!zContains) {
                                                rr6Var3.m0().a(wxy.a, k00.d);
                                                ytwVar.setValue(yi80.f((Set) ytwVar.getValue(), str5));
                                            }
                                            ytw ytwVar2 = ytwVarB2;
                                            if (((Set) ytwVar2.getValue()).contains(str5)) {
                                                Set set = (Set) ytwVar2.getValue();
                                                set.getClass();
                                                setC = yi80.c(set, str5);
                                            } else {
                                                Set set2 = (Set) ytwVar2.getValue();
                                                boolean z3 = rr6Var3.requireArguments().getBoolean("arg_retain_selections", false);
                                                set2.getClass();
                                                LinkedHashSet linkedHashSetF = yi80.f(set2, str5);
                                                ks6 ks6Var2 = ks6Var;
                                                if (linkedHashSetF.size() + (z3 ? ks6Var2.b.U().size() : 0) > ks6Var2.c.a()) {
                                                    ej5.c(o8i0.d(ks6Var2), null, null, new js6(ks6Var2, null), 3);
                                                    setC = set2;
                                                } else {
                                                    setC = linkedHashSetF;
                                                }
                                            }
                                            ytwVar2.setValue(setC);
                                            return Unit.a;
                                        }
                                    };
                                    aVar2.r(objY10);
                                }
                                Function1 function2 = (Function1) objY10;
                                boolean zA7 = aVar2.A(rr6Var2) | aVar2.A(ks6Var) | aVar2.M(ytwVarB2);
                                Object objY11 = aVar2.y();
                                if (zA7 || objY11 == c0042a) {
                                    objY11 = new Function0() { // from class: pr6
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            rr6 rr6Var3 = rr6Var2;
                                            u350 u350Var = rr6Var3.i;
                                            if (u350Var == null) {
                                                Intrinsics.n("remixBetAnTestManager");
                                                throw null;
                                            }
                                            u350Var.c();
                                            rdd0 rdd0VarM0 = rr6Var3.m0();
                                            vxy vxyVar = vxy.a;
                                            k00 k00Var = k00.d;
                                            rdd0VarM0.a(vxyVar, k00Var);
                                            rr6Var3.m0().a(hyy.a, k00Var);
                                            Set set = (Set) ytwVarB2.getValue();
                                            int i2 = 0;
                                            boolean z3 = rr6Var3.requireArguments().getBoolean("arg_retain_selections", false);
                                            set.getClass();
                                            ks6 ks6Var2 = ks6Var;
                                            Object value = ks6Var2.e.a.getValue();
                                            zl6.c cVar4 = value instanceof zl6.c ? (zl6.c) value : null;
                                            List<pt90> list2 = cVar4 != null ? cVar4.a : null;
                                            if (list2 == null) {
                                                list2 = m2g.a;
                                            }
                                            ArrayList arrayList = new ArrayList();
                                            for (Object obj5 : list2) {
                                                int i3 = i2 + 1;
                                                if (i2 < 0) {
                                                    b.q();
                                                    throw null;
                                                }
                                                pt90 pt90Var2 = (pt90) obj5;
                                                if (set.contains(i2 + "_" + tx5.a(pt90Var2.a.a, "_", pt90Var2.b.a, "_", pt90Var2.c.a))) {
                                                    arrayList.add(obj5);
                                                }
                                                i2 = i3;
                                            }
                                            if (!arrayList.isEmpty()) {
                                                ej5.c(o8i0.d(ks6Var2), null, null, new hs6(ks6Var2, z3, arrayList, null), 3);
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    aVar2.r(objY11);
                                }
                                Function0 function3 = (Function0) objY11;
                                boolean zA8 = aVar2.A(rr6Var2);
                                Object objY12 = aVar2.y();
                                if (zA8 || objY12 == c0042a) {
                                    objY12 = new qr6(rr6Var2, i);
                                    aVar2.r(objY12);
                                }
                                gs6.b(ln6Var, function0, function1, function2, function3, (Function0) objY12, aVar2, 0);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, aVar), aVar, 196608);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
    }

    @Override // androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        super.onDismiss(dialogInterface);
        gl6 gl6Var = this.v;
        if (gl6Var != null) {
            gl6Var.invoke();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view2.setBackgroundColor(0);
        }
    }
}
