package defpackage;

import android.net.Uri;
import androidx.compose.animation.f;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes6.dex */
public final class r2y {

    @c0d(c = "com.sportybet.feature.notificationcenter.ui.NotificationListScreenKt$ListContent$1$1", f = "NotificationListScreen.kt", l = {304}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ h0s<j3x> b;
        public final /* synthetic */ String c;
        public final /* synthetic */ v3a0 d;
        public final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h0s<j3x> h0sVar, String str, v3a0 v3a0Var, String str2, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = h0sVar;
            this.c = str;
            this.d = v3a0Var;
            this.e = str2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, this.d, this.e, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0046  */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Throwable thH;
            String e;
            y5b y5bVar = y5b.a;
            int i = this.a;
            h0s<j3x> h0sVar = this.b;
            if (i == 0) {
                uj50.b(obj);
                if (h0sVar.d().g) {
                    y78 y78VarD = h0sVar.d();
                    jxs jxsVar = y78VarD.e;
                    if (jxsVar == null || (thH = r2y.h(jxsVar)) == null) {
                        thH = r2y.h(y78VarD.d);
                    }
                    if (thH == null) {
                        e = this.c;
                    } else {
                        if (!(thH instanceof SprThrowable)) {
                            thH = null;
                        }
                        SprThrowable sprThrowable = (SprThrowable) thH;
                        if (sprThrowable == null || (e = sprThrowable.getE()) == null) {
                            e = this.c;
                        }
                    }
                    k3a0 k3a0Var = k3a0.a;
                    this.a = 1;
                    v3a0 v3a0Var = this.d;
                    v3a0Var.getClass();
                    obj = v3a0Var.a(new v3a0.b(e, this.e, true, k3a0Var), this);
                    if (obj == y5bVar) {
                        return y5bVar;
                    }
                }
                return Unit.a;
            }
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            int iOrdinal = ((j4a0) obj).ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    uhc.a();
                    return null;
                }
                h0sVar.c.e();
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.notificationcenter.ui.NotificationListScreenKt$ListContent$2$1", f = "NotificationListScreen.kt", l = {323}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ h0s<j3x> c;
        public final /* synthetic */ j3x d;
        public final /* synthetic */ ytw<j3x> e;
        public final /* synthetic */ zzr f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(h0s<j3x> h0sVar, j3x j3xVar, ytw<j3x> ytwVar, zzr zzrVar, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.c = h0sVar;
            this.d = j3xVar;
            this.e = ytwVar;
            this.f = zzrVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = new b(this.c, this.d, this.e, this.f, v1bVar);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            j3x value;
            y5b y5bVar = y5b.a;
            int i = this.a;
            ytw<j3x> ytwVar = this.e;
            j3x j3xVar = this.d;
            try {
                if (i == 0) {
                    uj50.b(obj);
                    if (this.c.d().a instanceof hxs.c) {
                        if ((j3xVar != null ? new Integer(j3xVar.a) : null) != null && ((value = ytwVar.getValue()) == null || value.a != j3xVar.a)) {
                            zzr zzrVar = this.f;
                            zi50.a aVar = zi50.b;
                            this.b = null;
                            this.a = 1;
                            uv60 uv60Var = zzr.x;
                            if (zzrVar.f(0, 0, this) == y5bVar) {
                                return y5bVar;
                            }
                        }
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                Unit unit = Unit.a;
                zi50.a aVar2 = zi50.b;
            } catch (Throwable unused) {
                zi50.a aVar3 = zi50.b;
            }
            ytwVar.setValue(j3xVar);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.notificationcenter.ui.NotificationListScreenKt$ListContent$3$2$1$1$1", f = "NotificationListScreen.kt", l = {387}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ zzr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(zzr zzrVar, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.b = zzrVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new c(this.b, v1bVar);
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
                this.a = 1;
                uv60 uv60Var = zzr.x;
                if (this.b.f(0, 0, this) == y5bVar) {
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

    @c0d(c = "com.sportybet.feature.notificationcenter.ui.NotificationListScreenKt$NotificationListScreen$1$1", f = "NotificationListScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ h0s<j3x> a;
        public final /* synthetic */ ytw<Boolean> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(h0s<j3x> h0sVar, ytw<Boolean> ytwVar, v1b<? super d> v1bVar) {
            super(2, v1bVar);
            this.a = h0sVar;
            this.b = ytwVar;
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
            h0s<j3x> h0sVar = this.a;
            if (h0sVar.d().f || h0sVar.d().g || h0sVar.c() != 0) {
                this.b.setValue(Boolean.TRUE);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.notificationcenter.ui.NotificationListScreenKt$PullRefreshContent$1$1", f = "NotificationListScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class e extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ h0s<j3x> a;
        public final /* synthetic */ ytw<Boolean> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(h0s<j3x> h0sVar, ytw<Boolean> ytwVar, v1b<? super e> v1bVar) {
            super(2, v1bVar);
            this.a = h0sVar;
            this.b = ytwVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new e(this.a, this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((e) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (this.a.d().f) {
                this.b.setValue(Boolean.FALSE);
            }
            return Unit.a;
        }
    }

    public static final void a(final v3a0 v3a0Var, final h0s<j3x> h0sVar, final boolean z, final Function1<? super Uri, Unit> function1, final Function1<? super String, Unit> function2, final Function1<? super i3x, Unit> function3, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.b bVar;
        Object aVar2;
        int i2;
        androidx.compose.runtime.a.C0041a.C0042a c0042a;
        final zzr zzrVar;
        androidx.compose.runtime.b bVarI = aVar.i(639731496);
        int i3 = i | (bVarI.A(h0sVar) ? 32 : 16) | (bVarI.b(z) ? 256 : 128) | (bVarI.A(function1) ? 2048 : 1024) | (bVarI.A(function2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(function3) ? 131072 : 65536);
        if (bVarI.q(i3 & 1, (74899 & i3) != 74898)) {
            String strA = cb40.a(R.string.common_functions__retry, new Object[0], bVarI);
            String strA2 = cb40.a(R.string.page_notification_center__can_not_load_data, new Object[0], bVarI);
            zzr zzrVarA = e0s.a(0, 3, bVarI);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a2 = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a2) {
                objY = m.b(null);
                bVarI.r(objY);
            }
            ytw ytwVar = (ytw) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a2) {
                objY2 = xvf.i(kotlin.coroutines.e.a, bVarI);
                bVarI.r(objY2);
            }
            final v5b v5bVar = (v5b) objY2;
            Object objY3 = bVarI.y();
            if (objY3 == c0042a2) {
                objY3 = a6a0.b(new w61(zzrVarA, 2));
                bVarI.r(objY3);
            }
            final twd0 twd0Var = (twd0) objY3;
            Boolean boolValueOf = Boolean.valueOf(h0sVar.d().g);
            int i4 = i3 & 112;
            boolean zM = (i4 == 32 || bVarI.A(h0sVar)) | bVarI.M(strA2) | bVarI.M(strA);
            Object objY4 = bVarI.y();
            if (zM || objY4 == c0042a2) {
                i2 = i4;
                c0042a = c0042a2;
                aVar2 = new a(h0sVar, strA2, v3a0Var, strA, null);
                bVarI.r(aVar2);
            } else {
                i2 = i4;
                c0042a = c0042a2;
                aVar2 = objY4;
            }
            xvf.e(bVarI, boolValueOf, (Function2) aVar2);
            h0s<j3x> h0sVar2 = h0sVar.c() > 0 ? h0sVar : null;
            j3x j3xVarE = h0sVar2 != null ? h0sVar2.e(0) : null;
            hxs hxsVar = h0sVar.d().a;
            boolean zA = bVarI.A(j3xVarE) | (i2 == 32 || bVarI.A(h0sVar)) | bVarI.M(zzrVarA);
            Object objY5 = bVarI.y();
            if (zA || objY5 == c0042a) {
                b bVar2 = new b(h0sVar, j3xVarE, ytwVar, zzrVarA, null);
                zzrVar = zzrVarA;
                bVarI.r(bVar2);
                objY5 = bVar2;
            } else {
                zzrVar = zzrVarA;
            }
            xvf.e(bVarI, hxsVar, (Function2) objY5);
            bVar = bVarI;
            q75.a(null, ht.a.i, false, pp8.b(1556692222, new gaj() { // from class: d2y
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    r75 r75Var = (r75) obj;
                    a aVar3 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    r75Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar3.M(r75Var) ? 4 : 2;
                    }
                    if (aVar3.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        final float fA = qvf.a(r75Var.d(), 12.0f);
                        d dVarE = j.e(d.a.b, 1.0f);
                        umz umzVarB = h.b(fA, 12.0f, fA, 0.0f, 8);
                        kw0.i iVar = new kw0.i(12.0f, true, new hw0());
                        final h0s h0sVar3 = h0sVar;
                        boolean zA2 = aVar3.A(h0sVar3);
                        final boolean z2 = z;
                        boolean zB = zA2 | aVar3.b(z2);
                        final Function1 function4 = function1;
                        boolean zM2 = zB | aVar3.M(function4);
                        final Function1 function5 = function2;
                        boolean zM3 = zM2 | aVar3.M(function5);
                        final Function1 function6 = function3;
                        boolean zM4 = zM3 | aVar3.M(function6);
                        Object objY6 = aVar3.y();
                        if (zM4 || objY6 == a.C0041a.a) {
                            Function1 function7 = new Function1() { // from class: h2y
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    szr szrVar = (szr) obj4;
                                    szrVar.getClass();
                                    final h0s h0sVar4 = h0sVar3;
                                    int iC = h0sVar4.c();
                                    androidx.paging.compose.a aVar4 = new androidx.paging.compose.a(h0sVar4, new b2y());
                                    final boolean z3 = z2;
                                    final Function1 function8 = function4;
                                    final Function1 function9 = function5;
                                    final Function1 function10 = function6;
                                    szr.f(szrVar, iC, aVar4, new op8(495761820, new iaj() { // from class: j2y
                                        @Override // defpackage.iaj
                                        public final Object d(Object obj5, Object obj6, Object obj7, Object obj8) {
                                            int iIntValue2 = ((Integer) obj6).intValue();
                                            a aVar5 = (a) obj7;
                                            int iIntValue3 = ((Integer) obj8).intValue();
                                            ((gwr) obj5).getClass();
                                            if ((iIntValue3 & 48) == 0) {
                                                iIntValue3 |= aVar5.d(iIntValue2) ? 32 : 16;
                                            }
                                            if (aVar5.q(iIntValue3 & 1, (iIntValue3 & 145) != 144)) {
                                                final j3x j3xVar = (j3x) h0sVar4.b(iIntValue2);
                                                if (j3xVar == null) {
                                                    aVar5.N(-1152082906);
                                                    aVar5.H();
                                                } else {
                                                    aVar5.N(-1152082905);
                                                    boolean z4 = z3;
                                                    Function1 function11 = function8;
                                                    Function1 function12 = function9;
                                                    final Function1 function13 = function10;
                                                    a.C0041a.C0042a c0042a3 = a.C0041a.a;
                                                    if (z4) {
                                                        aVar5.N(-801182637);
                                                        boolean zM5 = aVar5.M(function13) | aVar5.A(j3xVar);
                                                        Object objY7 = aVar5.y();
                                                        if (zM5 || objY7 == c0042a3) {
                                                            objY7 = new Function0() { // from class: l2y
                                                                @Override // kotlin.jvm.functions.Function0
                                                                public final Object invoke() {
                                                                    function13.invoke(new i3x.a(j3xVar.a));
                                                                    return Unit.a;
                                                                }
                                                            };
                                                            aVar5.r(objY7);
                                                        }
                                                        Function0 function0 = (Function0) objY7;
                                                        boolean zM6 = aVar5.M(function13) | aVar5.A(j3xVar);
                                                        Object objY8 = aVar5.y();
                                                        if (zM6 || objY8 == c0042a3) {
                                                            objY8 = new m2y(0, j3xVar, function13);
                                                            aVar5.r(objY8);
                                                        }
                                                        a2y.e(null, j3xVar, function11, function12, function0, (Function0) objY8, aVar5, 0);
                                                        aVar5 = aVar5;
                                                        aVar5.H();
                                                    } else {
                                                        aVar5.N(-800751520);
                                                        boolean zM7 = aVar5.M(function13) | aVar5.A(j3xVar);
                                                        Object objY9 = aVar5.y();
                                                        if (zM7 || objY9 == c0042a3) {
                                                            objY9 = new n2y(0, j3xVar, function13);
                                                            aVar5.r(objY9);
                                                        }
                                                        a2y.d(null, j3xVar, function11, function12, (Function0) objY9, aVar5, 0, 1);
                                                        aVar5.H();
                                                    }
                                                    aVar5.H();
                                                }
                                            } else {
                                                aVar5.G();
                                            }
                                            return Unit.a;
                                        }
                                    }, true), 4);
                                    szr.h(szrVar, null, new op8(-1386899053, new gaj() { // from class: k2y
                                        @Override // defpackage.gaj
                                        public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                            a aVar5 = (a) obj6;
                                            int iIntValue2 = ((Integer) obj7).intValue();
                                            ((gwr) obj5).getClass();
                                            if (aVar5.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                boolean zG = Intrinsics.g(h0sVar4.d().c, hxs.b.b);
                                                d.a aVar6 = d.a.b;
                                                if (zG) {
                                                    aVar5.N(-1370124711);
                                                    d dVarG = j.g(j.i(aVar6, 92.0f), 1.0f);
                                                    aiv aivVarC = g75.c(ht.a.e, false);
                                                    int iHashCode = Long.hashCode(aVar5.m());
                                                    ne00 ne00VarO = aVar5.o();
                                                    d dVarC = c.c(aVar5, dVarG);
                                                    yka.k.getClass();
                                                    tsr.a aVar7 = yka.a.b;
                                                    if (aVar5.k() == null) {
                                                        l2a.b();
                                                        throw null;
                                                    }
                                                    aVar5.D();
                                                    if (aVar5.g()) {
                                                        aVar5.F(aVar7);
                                                    } else {
                                                        aVar5.p();
                                                    }
                                                    hlh0.a(aVar5, aivVarC, yka.a.f);
                                                    hlh0.a(aVar5, ne00VarO, yka.a.e);
                                                    yka.a.C1350a c1350a = yka.a.g;
                                                    if (aVar5.g() || !Intrinsics.g(aVar5.y(), Integer.valueOf(iHashCode))) {
                                                        j3c.a(iHashCode, aVar5, iHashCode, c1350a);
                                                    }
                                                    hlh0.a(aVar5, dVarC, yka.a.d);
                                                    q330.a(j.r(aVar6, 28.0f), c68.a(R.color.brand_secondary, aVar5), 2.5f, 0L, 0, 0.0f, aVar5, 390, 56);
                                                    aVar5.s();
                                                    aVar5.H();
                                                } else {
                                                    aVar5.N(-1370107652);
                                                    ty0.a(aVar5, j.i(aVar6, 12.0f));
                                                    aVar5.H();
                                                }
                                            } else {
                                                aVar5.G();
                                            }
                                            return Unit.a;
                                        }
                                    }, true), 3);
                                    return Unit.a;
                                }
                            };
                            aVar3.r(function7);
                            objY6 = function7;
                        }
                        final zzr zzrVar2 = zzrVar;
                        aur.a(dVarE, zzrVar2, umzVarB, false, iVar, null, null, false, null, (Function1) objY6, aVar3, 24582, 488);
                        boolean zBooleanValue = ((Boolean) twd0Var.getValue()).booleanValue();
                        t9g t9gVarF = f.f(null, 3);
                        owg owgVarG = f.g(null, 3);
                        final v5b v5bVar2 = v5bVar;
                        hh0.e(zBooleanValue, null, t9gVarF, owgVarG, null, pp8.b(-2069327914, new gaj() { // from class: i2y
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                a aVar4 = (a) obj5;
                                int iIntValue2 = ((Integer) obj6).intValue();
                                ((jh0) obj4).getClass();
                                int i5 = 1;
                                if (aVar4.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    d dVarJ = h.j(d.a.b, 0.0f, 0.0f, fA - 12.0f, 0.0f, 11);
                                    v5b v5bVar3 = v5bVar2;
                                    boolean zA3 = aVar4.A(v5bVar3);
                                    zzr zzrVar3 = zzrVar2;
                                    boolean zM5 = zA3 | aVar4.M(zzrVar3);
                                    Object objY7 = aVar4.y();
                                    if (zM5 || objY7 == a.C0041a.a) {
                                        objY7 = new p0f(i5, v5bVar3, zzrVar3);
                                        aVar4.r(objY7);
                                    }
                                    r2y.f(0, aVar4, dVarJ, (Function0) objY7);
                                } else {
                                    aVar4.G();
                                }
                                return Unit.a;
                            }
                        }, aVar3), aVar3, 200064, 18);
                    } else {
                        aVar3.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVar, 3120, 5);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        androidx.compose.runtime.e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(h0sVar, z, function1, function2, function3, i) { // from class: e2y
                public final /* synthetic */ h0s b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ Function1 d;
                public final /* synthetic */ Function1 e;
                public final /* synthetic */ Function1 f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(71);
                    r2y.a(this.a, this.b, this.c, this.d, this.e, this.f, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.b bVarI = aVar.i(-78966473);
        if (bVarI.q(i & 1, i != 0)) {
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarC = op70.c(j.e(aVar2, 1.0f), op70.a(bVarI), 14);
            aiv aivVarC = g75.c(ht.a.b, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarC);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, aivVarC, bVar);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC2, cVar);
            androidx.compose.ui.d dVarJ = h.j(aVar2, 0.0f, 200.0f, 0.0f, 0.0f, 13);
            i78 i78VarA = g78.a(kw0.c, ht.a.n, bVarI, 48);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(bVarI, dVarJ);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC3, cVar);
            h9n.a(erz.a(R.drawable.ic_info_error, 0, bVarI), AnalyticsParam.HOME_NAV_ICON, j.r(h.f(aVar2, 6.0f), 36.0f), null, null, 0.0f, new gf4(c68.a(R.color.text_type1_secondary, bVarI), 5), bVarI, 432, 56);
            lkf0.d(cb40.a(R.string.common_functions__no_message_available, new Object[0], bVarI), h.j(aVar2, 0.0f, 8.0f, 0.0f, 0.0f, 13), c68.a(R.color.text_type1_secondary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_M, bVarI), bVarI, 48, 0, 131064);
            bVarI = bVarI;
            bVarI.X(true);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new g2y(i, 0);
        }
    }

    public static final void c(String str, androidx.compose.runtime.a aVar, final int i) {
        final String str2 = str;
        androidx.compose.runtime.b bVarI = aVar.i(-810785992);
        int i2 = i | (bVarI.M(str2) ? 4 : 2);
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarC = op70.c(j.e(aVar2, 1.0f), op70.a(bVarI), 14);
            aiv aivVarC = g75.c(ht.a.b, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarC);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, aivVarC, bVar);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC2, cVar);
            androidx.compose.ui.d dVarW = j.w(h.j(aVar2, 0.0f, 160.0f, 0.0f, 0.0f, 13), 216.0f);
            i78 i78VarA = g78.a(kw0.c, ht.a.n, bVarI, 48);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(bVarI, dVarW);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC3, cVar);
            h9n.a(erz.a(R.drawable.emty_error_icon, 0, bVarI), AnalyticsParam.HOME_NAV_ICON, j.r(aVar2, 48.0f), null, null, 0.0f, new gf4(c68.a(R.color.text_type1_secondary, bVarI), 5), bVarI, 432, 56);
            lkf0.d(cb40.a(R.string.page_notification_center__message_loading_failed, new Object[0], bVarI), h.j(aVar2, 0.0f, 8.0f, 0.0f, 0.0f, 13), c68.a(R.color.text_type1_secondary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.H3_M, bVarI), bVarI, 48, 0, 130040);
            str2 = str;
            lkf0.d(str2, h.j(aVar2, 0.0f, 8.0f, 0.0f, 0.0f, 13), c68.a(R.color.text_type1_secondary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVarI), bVarI, (i2 & 14) | 48, 0, 130040);
            bVarI = bVarI;
            bVarI.X(true);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str2, i) { // from class: f2y
                public final /* synthetic */ String a;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    r2y.c(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(final v3a0 v3a0Var, final h0s<j3x> h0sVar, final boolean z, final Function1<? super Uri, Unit> function1, final Function1<? super String, Unit> function2, final Function1<? super i3x, Unit> function3, androidx.compose.runtime.a aVar, final int i) {
        v3a0Var.getClass();
        h0sVar.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(-335317570);
        int i2 = i | (bVarI.A(h0sVar) ? 32 : 16) | (bVarI.b(z) ? 256 : 128) | (bVarI.A(function1) ? 2048 : 1024) | (bVarI.A(function2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(function3) ? 131072 : 65536);
        boolean z2 = true;
        if (bVarI.q(i2 & 1, (74899 & i2) != 74898)) {
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = m.b(Boolean.FALSE);
                bVarI.r(objY);
            }
            ytw ytwVar = (ytw) objY;
            Boolean boolValueOf = Boolean.valueOf(h0sVar.d().f);
            Boolean boolValueOf2 = Boolean.valueOf(h0sVar.d().g);
            Integer numValueOf = Integer.valueOf(h0sVar.c());
            int i3 = i2 & 112;
            if (i3 != 32 && !bVarI.A(h0sVar)) {
                z2 = false;
            }
            Object objY2 = bVarI.y();
            if (z2 || objY2 == c0042a) {
                objY2 = new d(h0sVar, ytwVar, null);
                bVarI.r(objY2);
            }
            xvf.f(boolValueOf, boolValueOf2, numValueOf, (Function2) objY2, bVarI);
            if (((Boolean) ytwVar.getValue()).booleanValue()) {
                bVarI.N(648791938);
                e(v3a0Var, h0sVar, z, function1, function2, function3, bVarI, (i2 & 458752) | 70 | i3 | (i2 & 896) | (i2 & 7168) | (57344 & i2));
                bVarI.X(false);
            } else {
                bVarI.N(648754955);
                g(0, bVarI);
                bVarI.X(false);
            }
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(h0sVar, z, function1, function2, function3, i) { // from class: p2y
                public final /* synthetic */ h0s b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ Function1 d;
                public final /* synthetic */ Function1 e;
                public final /* synthetic */ Function1 f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(71);
                    r2y.d(this.a, this.b, this.c, this.d, this.e, this.f, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:82:0x01a8  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(final v3a0 v3a0Var, final h0s<j3x> h0sVar, final boolean z, final Function1<? super Uri, Unit> function1, final Function1<? super String, Unit> function2, final Function1<? super i3x, Unit> function3, androidx.compose.runtime.a aVar, final int i) {
        Throwable thH;
        String strA;
        boolean z2;
        v3a0Var.getClass();
        h0sVar.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(161336460);
        int i2 = i | (bVarI.A(h0sVar) ? 32 : 16) | (bVarI.b(z) ? 256 : 128) | (bVarI.A(function1) ? 2048 : 1024) | (bVarI.A(function2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(function3) ? 131072 : 65536);
        if (bVarI.q(i2 & 1, (74899 & i2) != 74898)) {
            boolean z3 = h0sVar.d().a instanceof hxs.b;
            int i3 = i2 & 112;
            Object[] objArr = i3 == 32 || bVarI.A(h0sVar);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objArr != false || objY == c0042a) {
                objY = new wze(h0sVar, 1);
                bVarI.r(objY);
            }
            d930 d930VarB = zcg.b(0, bVarI, (Function0) objY, z3);
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = m.b(Boolean.FALSE);
                bVarI.r(objY2);
            }
            ytw ytwVar = (ytw) objY2;
            Boolean boolValueOf = Boolean.valueOf(h0sVar.d().f);
            Object[] objArr2 = i3 == 32 || bVarI.A(h0sVar);
            Object objY3 = bVarI.y();
            if (objArr2 != false || objY3 == c0042a) {
                objY3 = new e(h0sVar, ytwVar, null);
                bVarI.r(objY3);
            }
            xvf.e(bVarI, boolValueOf, (Function2) objY3);
            androidx.compose.ui.d dVarA = a930.a(j.e(androidx.compose.foundation.a.b(androidx.compose.ui.d.a.b, c68.a(R.color.background_general_secondary, bVarI), zk40.a), 1.0f), d930VarB);
            aiv aivVarC = g75.c(ht.a.b, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarA);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
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
            if (h0sVar.c() == 0) {
                bVarI.N(-372489300);
                if (((Boolean) ytwVar.getValue()).booleanValue() || h0sVar.d().g) {
                    bVarI.N(-372434337);
                    ytwVar.setValue(Boolean.TRUE);
                    y78 y78VarD = h0sVar.d();
                    jxs jxsVar = y78VarD.e;
                    if (jxsVar == null || (thH = h(jxsVar)) == null) {
                        thH = h(y78VarD.d);
                    }
                    if (thH == null) {
                        strA = null;
                    } else {
                        if (!(thH instanceof SprThrowable)) {
                            thH = null;
                        }
                        SprThrowable sprThrowable = (SprThrowable) thH;
                        if (sprThrowable != null) {
                            strA = sprThrowable.getE();
                        } else {
                            strA = null;
                        }
                    }
                    if (strA == null) {
                        bVarI.N(2066200797);
                        z2 = false;
                        strA = cb40.a(R.string.page_notification_center__load_failed_please_try_again, new Object[0], bVarI);
                    } else {
                        z2 = false;
                        bVarI.N(2066198100);
                    }
                    bVarI.X(z2);
                    c(strA, bVarI, z2 ? 1 : 0);
                    bVarI.X(z2);
                } else {
                    bVarI.N(-372122508);
                    b(0, bVarI);
                    bVarI.X(false);
                    z2 = false;
                }
                bVarI.X(z2);
            } else {
                bVarI.N(-372057749);
                a(v3a0Var, h0sVar, z, function1, function2, function3, bVarI, 70 | i3 | (i2 & 896) | (i2 & 7168) | (57344 & i2) | (i2 & 458752));
                bVarI.X(false);
            }
            w830.b(h0sVar.d().a instanceof hxs.b, d930VarB, null, c68.a(R.color.background_type1_primary, bVarI), c68.a(R.color.text_type1_primary, bVarI), bVarI, 64, 36);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(h0sVar, z, function1, function2, function3, i) { // from class: c2y
                public final /* synthetic */ h0s b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ Function1 d;
                public final /* synthetic */ Function1 e;
                public final /* synthetic */ Function1 f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(71);
                    r2y.e(this.a, this.b, this.c, this.d, this.e, this.f, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void f(final int i, androidx.compose.runtime.a aVar, final androidx.compose.ui.d dVar, Function0 function0) {
        final Function0 function1;
        function0.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(80511554);
        int i2 = (bVarI.M(dVar) ? 4 : 2) | i | (bVarI.A(function0) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            function1 = function0;
            ayh.a(function1, j.r(h.j(dVar, 0.0f, 0.0f, 16.0f, 16.0f, 3), 32.0f), j060.a, c68.a(R.color.brand_secondary, bVarI), c68.a(R.color.text_type2_primary, bVarI), new pxh(0.0f, d6h.d, d6h.b, d6h.c), sg9.b, bVarI, ((i2 >> 3) & 14) | 12582912, 64);
        } else {
            function1 = function0;
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, dVar, function1) { // from class: o2y
                public final /* synthetic */ d a;
                public final /* synthetic */ Function0 b;

                {
                    this.a = dVar;
                    this.b = function1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    r2y.f(qj40.a(1), (a) obj, this.a, this.b);
                    return Unit.a;
                }
            };
        }
    }

    public static final void g(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.b bVarI = aVar.i(-1861245923);
        if (bVarI.q(i & 1, i != 0)) {
            q75.a(androidx.compose.foundation.a.b(j.e(androidx.compose.ui.d.a.b, 1.0f), c68.a(R.color.background_general_secondary, bVarI), zk40.a), null, false, sg9.a, bVarI, 3072, 6);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new q2y();
        }
    }

    public static final Throwable h(jxs jxsVar) {
        hxs hxsVar = jxsVar.a;
        if (!(hxsVar instanceof hxs.a)) {
            hxsVar = null;
        }
        hxs.a aVar = (hxs.a) hxsVar;
        if (aVar != null) {
            return aVar.b;
        }
        hxs hxsVar2 = jxsVar.b;
        if (!(hxsVar2 instanceof hxs.a)) {
            hxsVar2 = null;
        }
        hxs.a aVar2 = (hxs.a) hxsVar2;
        if (aVar2 != null) {
            return aVar2.b;
        }
        hxs hxsVar3 = jxsVar.c;
        if (!(hxsVar3 instanceof hxs.a)) {
            hxsVar3 = null;
        }
        hxs.a aVar3 = (hxs.a) hxsVar3;
        if (aVar3 != null) {
            return aVar3.b;
        }
        return null;
    }
}
