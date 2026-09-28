package com.sportybet.android.bookingcode.presentation.activity;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.m;
import androidx.compose.ui.platform.AbstractComposeView;
import com.sportybet.android.bookingcode.presentation.activity.CustomCodeComposeUtil;
import com.sportybet.android.gp.tz.R;
import defpackage.aiv;
import defpackage.b40;
import defpackage.b7c;
import defpackage.c0d;
import defpackage.dhs;
import defpackage.ej5;
import defpackage.ff3;
import defpackage.g75;
import defpackage.gdc;
import defpackage.gf3;
import defpackage.hlh0;
import defpackage.ht;
import defpackage.ib5;
import defpackage.if3;
import defpackage.igf0;
import defpackage.iz0;
import defpackage.jnu;
import defpackage.jz0;
import defpackage.k3a0;
import defpackage.kf3;
import defpackage.lnu;
import defpackage.n30;
import defpackage.ne00;
import defpackage.pi8;
import defpackage.s3a0;
import defpackage.tje0;
import defpackage.tsr;
import defpackage.uj50;
import defpackage.upx;
import defpackage.v1b;
import defpackage.v3a0;
import defpackage.v5b;
import defpackage.x5a0;
import defpackage.xvf;
import defpackage.y5b;
import defpackage.y6c;
import defpackage.yka;
import defpackage.ytw;
import defpackage.z850;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0003!\"#B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013R+\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006*²\u0006\u0010\u0010%\u001a\u0004\u0018\u00010$8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010'\u001a\u0004\u0018\u00010&8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010)\u001a\u0004\u0018\u00010(8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/sportybet/android/bookingcode/presentation/activity/CustomCodeComposeUtil;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "currentCode", "", "setOnCurrentCode", "(Ljava/lang/String;)V", "Lcom/sportybet/android/bookingcode/presentation/activity/CustomCodeComposeUtil$a;", "listener", "setOnCodeConfirmedListener", "(Lcom/sportybet/android/bookingcode/presentation/activity/CustomCodeComposeUtil$a;)V", "Lcom/sportybet/android/bookingcode/presentation/activity/CustomCodeComposeUtil$d;", "setOnLoadBetSlip", "(Lcom/sportybet/android/bookingcode/presentation/activity/CustomCodeComposeUtil$d;)V", "Lcom/sportybet/android/bookingcode/presentation/activity/CustomCodeComposeUtil$e;", "<set-?>", "w", "Lytw;", "getSheetState", "()Lcom/sportybet/android/bookingcode/presentation/activity/CustomCodeComposeUtil$e;", "setSheetState", "(Lcom/sportybet/android/bookingcode/presentation/activity/CustomCodeComposeUtil$e;)V", "sheetState", "", "getShouldCreateCompositionOnAttachedToWindow", "()Z", "shouldCreateCompositionOnAttachedToWindow", "a", "d", "e", "Lgdc;", "codeSelected", "Ljz0;", "replaceCallResponse", "Llnu;", "manageType", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class CustomCodeComposeUtil extends AbstractComposeView {
    public static final /* synthetic */ int A = 0;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public final ytw sheetState;
    public String y;
    public a z;

    public interface a {
        void a(String str);
    }

    @c0d(c = "com.sportybet.android.bookingcode.presentation.activity.CustomCodeComposeUtil$Content$1$11$1$1", f = "CustomCodeComposeUtil.kt", l = {174}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ v3a0 b;
        public final /* synthetic */ CustomCodeComposeUtil c;
        public final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(v3a0 v3a0Var, CustomCodeComposeUtil customCodeComposeUtil, String str, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.b = v3a0Var;
            this.c = customCodeComposeUtil;
            this.d = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(this.b, this.c, this.d, v1bVar);
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
                String string = this.c.getContext().getString(R.string.component_assign_custom_code__custom_code_vcode_deleted_successfully, this.d);
                string.getClass();
                k3a0 k3a0Var = k3a0.a;
                this.a = 1;
                if (v3a0.b(this.b, string, null, false, k3a0Var, this, 6) == y5bVar) {
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

    @c0d(c = "com.sportybet.android.bookingcode.presentation.activity.CustomCodeComposeUtil$Content$1$7$1$1", f = "CustomCodeComposeUtil.kt", l = {118}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ v3a0 b;
        public final /* synthetic */ CustomCodeComposeUtil c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(v3a0 v3a0Var, CustomCodeComposeUtil customCodeComposeUtil, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.b = v3a0Var;
            this.c = customCodeComposeUtil;
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
                String string = this.c.getContext().getString(R.string.component_assign_custom_code__custom_code_edited_successfully);
                string.getClass();
                k3a0 k3a0Var = k3a0.a;
                this.a = 1;
                if (v3a0.b(this.b, string, null, false, k3a0Var, this, 6) == y5bVar) {
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

    public interface d {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class e {
        public static final e a;
        public static final e b;
        public static final e c;
        public static final e d;
        public static final e e;
        public static final e f;
        public static final /* synthetic */ e[] i;

        static {
            e eVar = new e("Hidden", 0);
            a = eVar;
            e eVar2 = new e("Assign", 1);
            b = eVar2;
            e eVar3 = new e("New", 2);
            c = eVar3;
            e eVar4 = new e("Replace", 3);
            d = eVar4;
            e eVar5 = new e("Success", 4);
            e = eVar5;
            e eVar6 = new e("Manage", 5);
            f = eVar6;
            i = new e[]{eVar, eVar2, eVar3, eVar4, eVar5, eVar6};
        }

        public e() {
            throw null;
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) i.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomCodeComposeUtil(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 4, 0);
        context.getClass();
        this.sheetState = m.b(e.a);
        this.y = "";
    }

    private final e getSheetState() {
        return (e) ((x5a0) this.sheetState).getValue();
    }

    public static final Unit j(CustomCodeComposeUtil customCodeComposeUtil) {
        customCodeComposeUtil.setSheetState(e.a);
        return Unit.a;
    }

    public static final Unit k(CustomCodeComposeUtil customCodeComposeUtil) {
        customCodeComposeUtil.setSheetState(e.c);
        return Unit.a;
    }

    public static final Unit l(CustomCodeComposeUtil customCodeComposeUtil, v5b v5bVar, ytw ytwVar, v3a0 v3a0Var, String str) {
        str.getClass();
        ytwVar.setValue(null);
        customCodeComposeUtil.setSheetState(e.b);
        ej5.c(v5bVar, null, null, new b(v3a0Var, customCodeComposeUtil, str, null), 3);
        return Unit.a;
    }

    public static final Unit m(CustomCodeComposeUtil customCodeComposeUtil, ytw ytwVar, gdc gdcVar) {
        gdcVar.getClass();
        ytwVar.setValue(gdcVar);
        customCodeComposeUtil.setSheetState(e.c);
        return Unit.a;
    }

    public static final Unit n(CustomCodeComposeUtil customCodeComposeUtil, ytw ytwVar) {
        ytwVar.setValue(null);
        customCodeComposeUtil.setSheetState(e.b);
        return Unit.a;
    }

    public static final Unit o(CustomCodeComposeUtil customCodeComposeUtil, ytw ytwVar, gdc gdcVar) {
        gdcVar.getClass();
        ytwVar.setValue(gdcVar);
        customCodeComposeUtil.setSheetState(e.d);
        return Unit.a;
    }

    public static final Unit p(CustomCodeComposeUtil customCodeComposeUtil, ytw ytwVar, lnu lnuVar) {
        lnuVar.getClass();
        ytwVar.setValue(lnuVar);
        customCodeComposeUtil.setSheetState(e.f);
        return Unit.a;
    }

    public static final Unit q(CustomCodeComposeUtil customCodeComposeUtil, ytw ytwVar, ytw ytwVar2, gdc gdcVar, jz0 jz0Var) {
        gdcVar.getClass();
        jz0Var.getClass();
        ytwVar.setValue(jz0Var);
        ytwVar2.setValue(gdcVar);
        customCodeComposeUtil.setSheetState(e.e);
        return Unit.a;
    }

    public static final Unit r(CustomCodeComposeUtil customCodeComposeUtil, ytw ytwVar, ytw ytwVar2, gdc gdcVar, jz0 jz0Var) {
        gdcVar.getClass();
        jz0Var.getClass();
        ytwVar.setValue(jz0Var);
        ytwVar2.setValue(gdcVar);
        customCodeComposeUtil.setSheetState(e.e);
        return Unit.a;
    }

    public static final Unit s(CustomCodeComposeUtil customCodeComposeUtil, v5b v5bVar, ytw ytwVar, v3a0 v3a0Var) {
        ytwVar.setValue(null);
        customCodeComposeUtil.setSheetState(e.b);
        ej5.c(v5bVar, null, null, new c(v3a0Var, customCodeComposeUtil, null), 3);
        return Unit.a;
    }

    private final void setSheetState(e eVar) {
        ((x5a0) this.sheetState).setValue(eVar);
    }

    public static final Unit t(CustomCodeComposeUtil customCodeComposeUtil) {
        customCodeComposeUtil.setSheetState(e.b);
        return Unit.a;
    }

    public static final Unit u(CustomCodeComposeUtil customCodeComposeUtil) {
        customCodeComposeUtil.setSheetState(e.a);
        return Unit.a;
    }

    public static final Unit v(CustomCodeComposeUtil customCodeComposeUtil, gdc gdcVar) {
        gdcVar.getClass();
        a aVar = customCodeComposeUtil.z;
        if (aVar != null) {
            aVar.a(gdcVar.b);
        }
        customCodeComposeUtil.setSheetState(e.a);
        return Unit.a;
    }

    public static final Unit w(CustomCodeComposeUtil customCodeComposeUtil) {
        customCodeComposeUtil.setSheetState(e.a);
        return Unit.a;
    }

    public static final Unit x(CustomCodeComposeUtil customCodeComposeUtil, ytw ytwVar, jz0 jz0Var) {
        jz0Var.getClass();
        ytwVar.setValue(jz0Var);
        customCodeComposeUtil.setSheetState(e.e);
        return Unit.a;
    }

    public static final Unit y(CustomCodeComposeUtil customCodeComposeUtil) {
        customCodeComposeUtil.setSheetState(e.b);
        return Unit.a;
    }

    public final void A() {
        setSheetState(e.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void a(final int i, androidx.compose.runtime.a aVar) {
        final v3a0 v3a0Var;
        androidx.compose.runtime.b bVarI = aVar.i(1334050498);
        int i2 = (bVarI.A(this) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = b40.a(bVarI);
            }
            final v3a0 v3a0Var2 = (v3a0) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = xvf.i(kotlin.coroutines.e.a, bVarI);
                bVarI.r(objY2);
            }
            final v5b v5bVar = (v5b) objY2;
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = m.b(null);
                bVarI.r(objY3);
            }
            final ytw ytwVar = (ytw) objY3;
            Object objY4 = bVarI.y();
            if (objY4 == c0042a) {
                objY4 = m.b(null);
                bVarI.r(objY4);
            }
            final ytw ytwVar2 = (ytw) objY4;
            Object objY5 = bVarI.y();
            if (objY5 == c0042a) {
                objY5 = m.b(null);
                bVarI.r(objY5);
            }
            final ytw ytwVar3 = (ytw) objY5;
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarE = j.e(aVar2, 1.0f);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarE);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            int iOrdinal = getSheetState().ordinal();
            if (iOrdinal == 0) {
                v3a0Var = v3a0Var2;
                bVarI.N(172756044);
                bVarI.X(false);
                Unit unit = Unit.a;
            } else if (iOrdinal == 1) {
                bVarI.N(1055281941);
                String str = this.y;
                boolean zA = bVarI.A(this);
                Object objY6 = bVarI.y();
                if (zA || objY6 == c0042a) {
                    objY6 = new y6c(this, 0);
                    bVarI.r(objY6);
                }
                Function0 function0 = (Function0) objY6;
                boolean zA2 = bVarI.A(this);
                Object objY7 = bVarI.y();
                if (zA2 || objY7 == c0042a) {
                    objY7 = new pi8(this, 1);
                    bVarI.r(objY7);
                }
                Function0 function1 = (Function0) objY7;
                boolean zA3 = bVarI.A(this);
                Object objY8 = bVarI.y();
                if (zA3 || objY8 == c0042a) {
                    objY8 = new Function1() { // from class: j7c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CustomCodeComposeUtil.o(this.a, ytwVar, (gdc) obj);
                        }
                    };
                    bVarI.r(objY8);
                }
                Function1 function2 = (Function1) objY8;
                boolean zA4 = bVarI.A(this);
                Object objY9 = bVarI.y();
                if (zA4 || objY9 == c0042a) {
                    objY9 = new Function1() { // from class: z6c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CustomCodeComposeUtil.p(this.a, ytwVar3, (lnu) obj);
                        }
                    };
                    bVarI.r(objY9);
                }
                Function1 function3 = (Function1) objY9;
                boolean zA5 = bVarI.A(this);
                Object objY10 = bVarI.y();
                if (zA5 || objY10 == c0042a) {
                    objY10 = new Function2() { // from class: a7c
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return CustomCodeComposeUtil.q(this.a, ytwVar2, ytwVar, (gdc) obj, (jz0) obj2);
                        }
                    };
                    bVarI.r(objY10);
                }
                dhs.b(null, v3a0Var2, function0, function1, str, function2, function3, (Function2) objY10, bVarI, 48);
                v3a0Var = v3a0Var2;
                bVarI = bVarI;
                bVarI.X(false);
                Unit unit2 = Unit.a;
            } else if (iOrdinal == 2) {
                v3a0Var = v3a0Var2;
                bVarI.N(1056291425);
                gdc gdcVar = (gdc) ytwVar.getValue();
                String str2 = this.y;
                boolean zA6 = bVarI.A(this);
                Object objY11 = bVarI.y();
                if (zA6 || objY11 == c0042a) {
                    objY11 = new b7c(this, ytwVar2, ytwVar, 0);
                    bVarI.r(objY11);
                }
                Function2 function4 = (Function2) objY11;
                boolean zA7 = bVarI.A(this) | bVarI.A(v5bVar);
                Object objY12 = bVarI.y();
                if (zA7 || objY12 == c0042a) {
                    objY12 = new Function0() { // from class: c7c
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CustomCodeComposeUtil.s(this.a, v5bVar, ytwVar, v3a0Var);
                        }
                    };
                    bVarI.r(objY12);
                }
                Function0 function5 = (Function0) objY12;
                boolean zA8 = bVarI.A(this);
                Object objY13 = bVarI.y();
                if (zA8 || objY13 == c0042a) {
                    objY13 = new ff3(this, 1);
                    bVarI.r(objY13);
                }
                upx.d(v3a0Var, function4, function5, gdcVar, str2, (Function0) objY13, bVarI, 6);
                bVarI = bVarI;
                bVarI.X(false);
                Unit unit3 = Unit.a;
            } else if (iOrdinal == 3) {
                v3a0Var = v3a0Var2;
                boolean z = false;
                bVarI.N(1058545249);
                gdc gdcVar2 = (gdc) ytwVar.getValue();
                if (gdcVar2 == null) {
                    bVarI.N(1058545248);
                    bVarI.X(false);
                } else {
                    bVarI.N(1058545249);
                    String str3 = this.y;
                    boolean zA9 = bVarI.A(this);
                    Object objY14 = bVarI.y();
                    if (zA9 || objY14 == c0042a) {
                        objY14 = new Function1() { // from class: e7c
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return CustomCodeComposeUtil.x(this.a, ytwVar2, (jz0) obj);
                            }
                        };
                        bVarI.r(objY14);
                    }
                    Function1 function6 = (Function1) objY14;
                    boolean zA10 = bVarI.A(this);
                    Object objY15 = bVarI.y();
                    if (zA10 || objY15 == c0042a) {
                        objY15 = new kf3(this, 1);
                        bVarI.r(objY15);
                    }
                    z850.b(v3a0Var, gdcVar2, str3, function6, (Function0) objY15, bVarI, 6);
                    Unit unit4 = Unit.a;
                    z = false;
                    bVarI.X(false);
                }
                bVarI.X(z);
            } else if (iOrdinal == 4) {
                v3a0Var = v3a0Var2;
                boolean z2 = false;
                bVarI.N(1057574205);
                gdc gdcVar3 = (gdc) ytwVar.getValue();
                if (gdcVar3 == null) {
                    bVarI.N(1057574204);
                    bVarI.X(false);
                } else {
                    bVarI.N(1057574205);
                    String str4 = this.y;
                    jz0 jz0Var = (jz0) ytwVar2.getValue();
                    if (jz0Var == null) {
                        jz0Var = jz0.a;
                    }
                    boolean zA11 = bVarI.A(this);
                    Object objY16 = bVarI.y();
                    if (zA11 || objY16 == c0042a) {
                        objY16 = new gf3(this, 1);
                        bVarI.r(objY16);
                    }
                    Function0 function7 = (Function0) objY16;
                    boolean zA12 = bVarI.A(this);
                    Object objY17 = bVarI.y();
                    if (zA12 || objY17 == c0042a) {
                        objY17 = new Function1() { // from class: d7c
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return CustomCodeComposeUtil.v(this.a, (gdc) obj);
                            }
                        };
                        bVarI.r(objY17);
                    }
                    Function1 function8 = (Function1) objY17;
                    boolean zA13 = bVarI.A(this);
                    Object objY18 = bVarI.y();
                    if (zA13 || objY18 == c0042a) {
                        objY18 = new if3(this, 1);
                        bVarI.r(objY18);
                    }
                    iz0.a(v3a0Var, gdcVar3, str4, jz0Var, function7, function8, (Function0) objY18, bVarI, 6);
                    bVarI = bVarI;
                    Unit unit5 = Unit.a;
                    z2 = false;
                    bVarI.X(false);
                }
                bVarI.X(z2);
            } else {
                if (iOrdinal != 5) {
                    throw igf0.a(bVarI, 172590580, false);
                }
                bVarI.N(1059248267);
                lnu lnuVar = (lnu) ytwVar3.getValue();
                if (lnuVar == null) {
                    lnuVar = lnu.b;
                }
                lnu lnuVar2 = lnuVar;
                boolean zA14 = bVarI.A(this) | bVarI.A(v5bVar);
                Object objY19 = bVarI.y();
                if (zA14 || objY19 == c0042a) {
                    objY19 = new Function1() { // from class: f7c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CustomCodeComposeUtil.l(this.a, v5bVar, ytwVar, v3a0Var2, (String) obj);
                        }
                    };
                    bVarI.r(objY19);
                }
                Function1 function9 = (Function1) objY19;
                boolean zA15 = bVarI.A(this);
                Object objY20 = bVarI.y();
                if (zA15 || objY20 == c0042a) {
                    objY20 = new Function1() { // from class: g7c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CustomCodeComposeUtil.m(this.a, ytwVar, (gdc) obj);
                        }
                    };
                    bVarI.r(objY20);
                }
                Function1 function10 = (Function1) objY20;
                boolean zA16 = bVarI.A(this);
                Object objY21 = bVarI.y();
                if (zA16 || objY21 == c0042a) {
                    objY21 = new Function0() { // from class: h7c
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CustomCodeComposeUtil.n(this.a, ytwVar);
                        }
                    };
                    bVarI.r(objY21);
                }
                v3a0Var = v3a0Var2;
                jnu.a(v3a0Var, lnuVar2, function9, function10, (Function0) objY21, bVarI, 6);
                bVarI.X(false);
                Unit unit6 = Unit.a;
            }
            androidx.compose.runtime.b bVar = bVarI;
            s3a0.b(v3a0Var, h.j(androidx.compose.foundation.layout.d.a.b(aVar2, ht.a.h), 0.0f, 0.0f, 0.0f, 32.0f, 7), null, bVar, 6, 4);
            bVarI = bVar;
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i) { // from class: i7c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int i3 = CustomCodeComposeUtil.A;
                    int iA = qj40.a(1);
                    this.a.a(iA, (a) obj);
                    return Unit.a;
                }
            };
        }
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return !isInEditMode();
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        if (isInEditMode()) {
            return;
        }
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        return getSheetState() != e.a;
    }

    public final void setOnCodeConfirmedListener(a listener) {
        listener.getClass();
        this.z = listener;
    }

    public final void setOnCurrentCode(String currentCode) {
        currentCode.getClass();
        this.y = currentCode;
    }

    public final void setOnLoadBetSlip(d listener) {
        listener.getClass();
    }

    public final void z() {
        setSheetState(e.a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CustomCodeComposeUtil(Context context) {
        this(context, null);
        context.getClass();
    }
}
