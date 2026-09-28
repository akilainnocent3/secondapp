package com.sportybet.feature.luckynumber.shared.presentation;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.compose.runtime.a;
import androidx.compose.runtime.m;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sportybet.android.router.Sender;
import com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetEntrance;
import com.sportybet.feature.luckynumber.shared.presentation.LuckyNumberActivity;
import defpackage.a5u;
import defpackage.aqe0;
import defpackage.arq;
import defpackage.axz;
import defpackage.azm;
import defpackage.bb40;
import defpackage.bjx;
import defpackage.c0d;
import defpackage.c9p;
import defpackage.cyb;
import defpackage.e1i;
import defpackage.ej5;
import defpackage.elf;
import defpackage.f7q;
import defpackage.f8u;
import defpackage.gaj;
import defpackage.gan;
import defpackage.h8r;
import defpackage.i8r;
import defpackage.ib5;
import defpackage.ifx;
import defpackage.igx;
import defpackage.jq40;
import defpackage.k9j;
import defpackage.kzh;
import defpackage.l5u;
import defpackage.m9n;
import defpackage.n5u;
import defpackage.nvp;
import defpackage.op8;
import defpackage.phx;
import defpackage.q8i0;
import defpackage.q8r;
import defpackage.qcn;
import defpackage.qlr;
import defpackage.qw90;
import defpackage.r8i0;
import defpackage.rlf;
import defpackage.rym;
import defpackage.saj;
import defpackage.t340;
import defpackage.tje0;
import defpackage.u420;
import defpackage.ue80;
import defpackage.uhc;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v3a0;
import defpackage.v420;
import defpackage.v5b;
import defpackage.v8i0;
import defpackage.vu60;
import defpackage.w060;
import defpackage.xvl;
import defpackage.y5b;
import defpackage.yfx;
import defpackage.ygp;
import defpackage.ytw;
import defpackage.zn8;
import defpackage.zpe0;
import java.io.Serializable;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n²\u0006\u0010\u0010\t\u001a\u0004\u0018\u00010\b8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/sportybet/feature/luckynumber/shared/presentation/LuckyNumberActivity;", "Lpy1;", "Lrlf;", "Lbb40;", "Lk9j;", "Lv420;", "<init>", "()V", "Lc9p;", "snackBarJob", "luckynumber"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class LuckyNumberActivity extends xvl implements rlf, bb40, k9j, v420 {
    public static final /* synthetic */ int i = 0;
    public arq b;
    public azm c;
    public rym d;
    public final q8i0 e = new q8i0(jq40.a(f8u.class), new e(), new d(), new f());
    public u420.f f = new u420.f(null);

    @c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.LuckyNumberActivity$onCreate$3$1$1", f = "LuckyNumberActivity.kt", l = {91}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ phx b;
        public final /* synthetic */ LuckyNumberActivity c;

        /* JADX INFO: renamed from: com.sportybet.feature.luckynumber.shared.presentation.LuckyNumberActivity$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.LuckyNumberActivity$onCreate$3$1$1$1", f = "LuckyNumberActivity.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class C0409a extends tje0 implements Function2<ifx, v1b<? super Unit>, Object> {
            public /* synthetic */ Object a;
            public final /* synthetic */ LuckyNumberActivity b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0409a(LuckyNumberActivity luckyNumberActivity, v1b<? super C0409a> v1bVar) {
                super(2, v1bVar);
                this.b = luckyNumberActivity;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                C0409a c0409a = new C0409a(this.b, v1bVar);
                c0409a.a = obj;
                return c0409a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ifx ifxVar, v1b<? super Unit> v1bVar) {
                return ((C0409a) create(ifxVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                ifx ifxVar = (ifx) this.a;
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                u420.f fVar = new u420.f(ifxVar.b.b.f);
                LuckyNumberActivity luckyNumberActivity = this.b;
                luckyNumberActivity.f = fVar;
                rym rymVar = luckyNumberActivity.d;
                if (rymVar != null) {
                    rymVar.d(fVar);
                    return Unit.a;
                }
                Intrinsics.n("popupQueueManager");
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(phx phxVar, LuckyNumberActivity luckyNumberActivity, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = phxVar;
            this.c = luckyNumberActivity;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                t340 t340VarA = e1i.a(this.b.b.A);
                C0409a c0409a = new C0409a(this.c, null);
                this.a = 1;
                if (kzh.b(t340VarA, c0409a, this) == y5bVar) {
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

    @c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.LuckyNumberActivity$onCreate$3$2$1", f = "LuckyNumberActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements gaj<v5b, f7q, v1b<? super Unit>, Object> {
        public /* synthetic */ v5b a;
        public /* synthetic */ f7q b;
        public final /* synthetic */ phx c;
        public final /* synthetic */ LuckyNumberActivity d;
        public final /* synthetic */ ytw<c9p> e;
        public final /* synthetic */ v3a0 f;

        @c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.LuckyNumberActivity$onCreate$3$2$1$3", f = "LuckyNumberActivity.kt", l = {143}, m = "invokeSuspend", v = 2)
        public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ v3a0 b;
            public final /* synthetic */ f7q c;
            public final /* synthetic */ LuckyNumberActivity d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(v3a0 v3a0Var, f7q f7qVar, LuckyNumberActivity luckyNumberActivity, v1b<? super a> v1bVar) {
                super(2, v1bVar);
                this.b = v3a0Var;
                this.c = f7qVar;
                this.d = luckyNumberActivity;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new a(this.b, this.c, this.d, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    f7q.i iVar = (f7q.i) this.c;
                    ResourceUiText resourceUiText = iVar.a;
                    resourceUiText.getClass();
                    String string = resourceUiText.e(this.d).toString();
                    boolean z = iVar.b;
                    this.a = 1;
                    if (v3a0.b(this.b, string, null, z, null, this, 10) == y5bVar) {
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

        /* JADX INFO: renamed from: com.sportybet.feature.luckynumber.shared.presentation.LuckyNumberActivity$b$b, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.LuckyNumberActivity$onCreate$3$2$1$4", f = "LuckyNumberActivity.kt", l = {157}, m = "invokeSuspend", v = 2)
        public static final class C0410b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ LuckyNumberActivity b;
            public final /* synthetic */ f7q c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0410b(LuckyNumberActivity luckyNumberActivity, f7q f7qVar, v1b<? super C0410b> v1bVar) {
                super(2, v1bVar);
                this.b = luckyNumberActivity;
                this.c = f7qVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new C0410b(this.b, this.c, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((C0410b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    LuckyNumberActivity luckyNumberActivity = this.b;
                    m9n m9nVarA = qw90.a(luckyNumberActivity);
                    qcn<String> qcnVar = ((f7q.h) this.c).a;
                    this.a = 1;
                    if (gan.b(m9nVarA, luckyNumberActivity, qcnVar, null, this, 28) == y5bVar) {
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
        public b(phx phxVar, LuckyNumberActivity luckyNumberActivity, ytw<c9p> ytwVar, v3a0 v3a0Var, v1b<? super b> v1bVar) {
            super(3, v1bVar);
            this.c = phxVar;
            this.d = luckyNumberActivity;
            this.e = ytwVar;
            this.f = v3a0Var;
        }

        @Override // defpackage.gaj
        public final Object invoke(v5b v5bVar, f7q f7qVar, v1b<? super Unit> v1bVar) {
            ytw<c9p> ytwVar = this.e;
            v3a0 v3a0Var = this.f;
            b bVar = new b(this.c, this.d, ytwVar, v3a0Var, v1bVar);
            bVar.a = v5bVar;
            bVar.b = f7qVar;
            return bVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            v5b v5bVar = this.a;
            f7q f7qVar = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            boolean z = f7qVar instanceof f7q.c;
            int i = 0;
            phx phxVar = this.c;
            if (z) {
                Object obj2 = ((f7q.c) f7qVar).a;
                if (obj2 instanceof i8r) {
                    a5u a5uVar = new a5u(i);
                    phxVar.getClass();
                    igx igxVar = phxVar.b;
                    igxVar.getClass();
                    igxVar.o(igxVar.f(obj2), bjx.a(a5uVar));
                } else {
                    yfx.h(phxVar, obj2, null, 6);
                }
                Unit unit = Unit.a;
            } else if (f7qVar instanceof f7q.f) {
                ifx ifxVarE = phxVar.e();
                vu60 vu60VarA = ifxVarE != null ? ifxVarE.a() : null;
                for (Pair<String, Object> pair : ((f7q.f) f7qVar).a) {
                    if (vu60VarA != null) {
                        String str = pair.a;
                        Object obj3 = pair.b;
                        obj3.getClass();
                        vu60VarA.e((String) obj3, str);
                    }
                }
                phxVar.k();
            } else {
                boolean z2 = f7qVar instanceof f7q.d;
                LuckyNumberActivity luckyNumberActivity = this.d;
                if (z2) {
                    azm azmVar = luckyNumberActivity.c;
                    if (azmVar == null) {
                        Intrinsics.n("iRouter");
                        throw null;
                    }
                    f7q.d dVar = (f7q.d) f7qVar;
                    azmVar.f(dVar.a, dVar.b);
                } else if (f7qVar instanceof f7q.e) {
                    azm azmVar2 = luckyNumberActivity.c;
                    if (azmVar2 == null) {
                        Intrinsics.n("iRouter");
                        throw null;
                    }
                    f7q.e eVar = (f7q.e) f7qVar;
                    azm.c(azmVar2, eVar.a, eVar.b, null, 4);
                } else if (Intrinsics.g(f7qVar, f7q.b.a)) {
                    luckyNumberActivity.finish();
                    Unit unit2 = Unit.a;
                } else if (f7qVar instanceof f7q.g) {
                    ygp<T> ygpVar = ((f7q.g) f7qVar).a;
                    phxVar.getClass();
                    ygpVar.getClass();
                    igx igxVar2 = phxVar.b;
                    igxVar2.getClass();
                    int iB = w060.b(ue80.b(ygpVar));
                    if (igx.e(iB, igxVar2.j(), null, true) == null) {
                        axz.a(ygpVar.k(), "Destination with route ", " cannot be found in navigation graph ", igxVar2.j());
                        return null;
                    }
                    igxVar2.p(iB, false);
                } else {
                    boolean z3 = f7qVar instanceof f7q.i;
                    ytw<c9p> ytwVar = this.e;
                    if (z3) {
                        int i2 = LuckyNumberActivity.i;
                        c9p value = ytwVar.getValue();
                        if (value != null) {
                            value.cancel((CancellationException) null);
                        }
                        ytwVar.setValue(ej5.c(v5bVar, null, null, new a(this.f, f7qVar, luckyNumberActivity, null), 3));
                        Unit unit3 = Unit.a;
                    } else if (Intrinsics.g(f7qVar, f7q.a.a)) {
                        int i3 = LuckyNumberActivity.i;
                        c9p value2 = ytwVar.getValue();
                        if (value2 != null) {
                            value2.cancel((CancellationException) null);
                        }
                        ytwVar.setValue(null);
                        Unit unit4 = Unit.a;
                    } else {
                        if (!(f7qVar instanceof f7q.h)) {
                            uhc.a();
                            return null;
                        }
                        ej5.c(v5bVar, null, null, new C0410b(luckyNumberActivity, f7qVar, null), 3);
                    }
                }
            }
            return Unit.a;
        }
    }

    public static final /* synthetic */ class c extends saj implements Function1<nvp, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(nvp nvpVar) {
            nvp nvpVar2 = nvpVar;
            nvpVar2.getClass();
            ((f8u) this.receiver).x1(nvpVar2);
            return Unit.a;
        }
    }

    public static final class d extends qlr implements Function0<r8i0.c> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return LuckyNumberActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class e extends qlr implements Function0<v8i0> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return LuckyNumberActivity.this.getViewModelStore();
        }
    }

    public static final class f extends qlr implements Function0<cyb> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return LuckyNumberActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public final void A1(l5u l5uVar) {
        Object h8rVar;
        LNPlaceBetEntrance next;
        Sender senderZ1 = z1();
        if (l5uVar instanceof l5u.b) {
            h8rVar = new i8r(senderZ1, ((l5u.b) l5uVar).a);
        } else if (l5uVar instanceof l5u.c) {
            l5u.c cVar = (l5u.c) l5uVar;
            String str = cVar.a;
            Iterator<LNPlaceBetEntrance> it = LNPlaceBetEntrance.getEntries().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.g(next.getFromScreenName(), cVar.b));
            h8rVar = new q8r(str, next, senderZ1, null, cVar.c, null, 72);
        } else {
            if (!(l5uVar instanceof l5u.d)) {
                uhc.a();
                return;
            }
            h8rVar = new h8r(((l5u.d) l5uVar).a, false);
        }
        ((f8u) this.e.getValue()).x1(new nvp.c(h8rVar));
    }

    @Override // defpackage.v420
    public final u420 E() {
        return this.f;
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("key-lucky-number-gif-id");
        if (stringExtra != null && (!StringsKt.U(stringExtra))) {
            ((f8u) this.e.getValue()).x1(new nvp.i(stringExtra));
        }
        elf.b(this, new aqe0(0, 0, 2, zpe0.a), 2);
        arq arqVar = this.b;
        if (arqVar == null) {
            Intrinsics.n("loginBinder");
            throw null;
        }
        arqVar.a(this);
        final Sender senderZ1 = z1();
        Intent intent = getIntent();
        intent.getClass();
        n5u n5uVar = n5u.a;
        String stringExtra2 = intent.getStringExtra("key-raw-query");
        n5uVar.getClass();
        final l5u l5uVarA = n5u.a(stringExtra2);
        if (l5uVarA != null) {
            l5u l5uVar = l5uVarA instanceof l5u.b ? null : l5uVarA;
            if (l5uVar != null) {
                A1(l5uVar);
            }
        }
        zn8.a(this, new op8(1051889003, new Function2() { // from class: w4u
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                v3a0 v3a0Var;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = LuckyNumberActivity.i;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final phx phxVarC = mr10.c(new vkx[0], aVar);
                    Object objY = aVar.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (objY == c0042a) {
                        objY = new v3a0();
                        aVar.r(objY);
                    }
                    v3a0 v3a0Var2 = (v3a0) objY;
                    Object objY2 = aVar.y();
                    if (objY2 == c0042a) {
                        objY2 = m.b(null);
                        aVar.r(objY2);
                    }
                    ytw ytwVar = (ytw) objY2;
                    Unit unit = Unit.a;
                    boolean zA = aVar.A(phxVarC);
                    final LuckyNumberActivity luckyNumberActivity = this.a;
                    boolean zA2 = zA | aVar.A(luckyNumberActivity);
                    Object objY3 = aVar.y();
                    if (zA2 || objY3 == c0042a) {
                        objY3 = new LuckyNumberActivity.a(phxVarC, luckyNumberActivity, null);
                        aVar.r(objY3);
                    }
                    xvf.e(aVar, unit, (Function2) objY3);
                    ku90<f7q> ku90Var = ((f8u) luckyNumberActivity.e.getValue()).z;
                    boolean zA3 = aVar.A(phxVarC) | aVar.A(luckyNumberActivity);
                    Object objY4 = aVar.y();
                    if (zA3 || objY4 == c0042a) {
                        v3a0Var = v3a0Var2;
                        LuckyNumberActivity.b bVar = new LuckyNumberActivity.b(phxVarC, luckyNumberActivity, ytwVar, v3a0Var, null);
                        aVar.r(bVar);
                        objY4 = bVar;
                    } else {
                        v3a0Var = v3a0Var2;
                    }
                    abs.b(ku90Var, null, null, (gaj) objY4, aVar, 0);
                    final l5u l5uVar2 = l5uVarA;
                    final Sender sender = senderZ1;
                    final v3a0 v3a0Var3 = v3a0Var;
                    u7u.b(48, 1, pp8.b(-1825167259, new Function2() { // from class: x4u
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            a aVar2 = (a) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            int i3 = LuckyNumberActivity.i;
                            int i4 = 1;
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                l5u l5uVar3 = l5uVar2;
                                l5u.b bVar2 = l5uVar3 instanceof l5u.b ? (l5u.b) l5uVar3 : null;
                                String str = bVar2 != null ? bVar2.a : null;
                                phx phxVar = phxVarC;
                                boolean zM = aVar2.M(phxVar);
                                Object objY5 = aVar2.y();
                                a.C0041a.C0042a c0042a2 = a.C0041a.a;
                                if (zM || objY5 == c0042a2) {
                                    objY5 = new j9b(phxVar, i4);
                                    aVar2.r(objY5);
                                }
                                Function0 function0 = (Function0) objY5;
                                final LuckyNumberActivity luckyNumberActivity2 = luckyNumberActivity;
                                f8u f8uVar = (f8u) luckyNumberActivity2.e.getValue();
                                boolean zA4 = aVar2.A(f8uVar);
                                Object objY6 = aVar2.y();
                                if (zA4 || objY6 == c0042a2) {
                                    LuckyNumberActivity.c cVar = new LuckyNumberActivity.c(1, f8uVar, f8u.class, "handleAction", "handleAction(Lcom/sportybet/feature/luckynumber/shared/presentation/state/LNAction;)V", 0);
                                    aVar2.r(cVar);
                                    objY6 = cVar;
                                }
                                chp chpVar = (chp) objY6;
                                boolean zA5 = aVar2.A(luckyNumberActivity2);
                                Object objY7 = aVar2.y();
                                if (zA5 || objY7 == c0042a2) {
                                    objY7 = new gaj() { // from class: y4u
                                        @Override // defpackage.gaj
                                        public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                            WebViewClient webViewClient = (WebViewClient) obj6;
                                            WebChromeClient webChromeClient = (WebChromeClient) obj7;
                                            int i5 = LuckyNumberActivity.i;
                                            webViewClient.getClass();
                                            webChromeClient.getClass();
                                            LuckyNumberActivity luckyNumberActivity3 = luckyNumberActivity2;
                                            luckyNumberActivity3.getWebViewWrapperService().installJsBridge(luckyNumberActivity3, (WebView) obj5, webViewClient, webChromeClient);
                                            return Unit.a;
                                        }
                                    };
                                    aVar2.r(objY7);
                                }
                                gaj gajVar = (gaj) objY7;
                                boolean zA6 = aVar2.A(luckyNumberActivity2);
                                Object objY8 = aVar2.y();
                                if (zA6 || objY8 == c0042a2) {
                                    objY8 = new Function1() { // from class: z4u
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj5) {
                                            int i5 = LuckyNumberActivity.i;
                                            luckyNumberActivity2.getWebViewWrapperService().uninstallJsBridge((WebView) obj5);
                                            return Unit.a;
                                        }
                                    };
                                    aVar2.r(objY8);
                                }
                                m7u.a(sender, str, gajVar, v3a0Var3, (Function1) objY8, function0, (Function1) chpVar, aVar2, 3072);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, aVar), aVar, false);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
    }

    @Override // defpackage.rn8, android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        setIntent(intent);
        n5u n5uVar = n5u.a;
        String stringExtra = intent.getStringExtra("key-raw-query");
        n5uVar.getClass();
        l5u l5uVarA = n5u.a(stringExtra);
        if (l5uVarA != null) {
            A1(l5uVarA);
        }
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        ((f8u) this.e.getValue()).x1(nvp.k.a);
    }

    public final Sender z1() {
        if (Build.VERSION.SDK_INT >= 33) {
            return (Sender) getIntent().getSerializableExtra("key_sender", Sender.class);
        }
        Serializable serializableExtra = getIntent().getSerializableExtra("key_sender");
        if (serializableExtra instanceof Sender) {
            return (Sender) serializableExtra;
        }
        return null;
    }
}
