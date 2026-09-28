package com.sportybet.android.multimaker.presentation.activity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.widget.PopupWindow;
import androidx.compose.runtime.a;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sporty.android.common_ui.widgets.SimpleActionBar;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.multimaker.domain.model.MultiMakerItem;
import com.sportybet.android.multimaker.presentation.activity.MultiMakerActivity;
import com.sportybet.android.multimaker.presentation.widget.filter.FilterTabLayout;
import com.sportybet.feature.payment.impl.security.nameupdate.presentation.activity.kekO.YAzniTbXHYQ;
import defpackage.afw;
import defpackage.aiw;
import defpackage.ajw;
import defpackage.app;
import defpackage.arr;
import defpackage.bb40;
import defpackage.bfw;
import defpackage.bjw;
import defpackage.bm50;
import defpackage.bxl;
import defpackage.c0d;
import defpackage.cew;
import defpackage.cjw;
import defpackage.cyb;
import defpackage.djw;
import defpackage.e9l;
import defpackage.ej5;
import defpackage.ejw;
import defpackage.erb;
import defpackage.few;
import defpackage.fiw;
import defpackage.fjw;
import defpackage.g1i;
import defpackage.gew;
import defpackage.gjw;
import defpackage.hwr;
import defpackage.iym;
import defpackage.jjw;
import defpackage.jq40;
import defpackage.jvd0;
import defpackage.k00;
import defpackage.k9j;
import defpackage.kid0;
import defpackage.kiw;
import defpackage.kzh;
import defpackage.lyh;
import defpackage.m2g;
import defpackage.mpe0;
import defpackage.o8i0;
import defpackage.ogw;
import defpackage.oiw;
import defpackage.ojw;
import defpackage.op8;
import defpackage.pew;
import defpackage.pf;
import defpackage.pjw;
import defpackage.q8i0;
import defpackage.qew;
import defpackage.qhw;
import defpackage.qjw;
import defpackage.qlr;
import defpackage.r1i;
import defpackage.r8i0;
import defpackage.rew;
import defpackage.s9s;
import defpackage.saj;
import defpackage.sew;
import defpackage.sjw;
import defpackage.sn5;
import defpackage.tew;
import defpackage.tje0;
import defpackage.tjw;
import defpackage.ufw;
import defpackage.uhw;
import defpackage.uiw;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v8i0;
import defpackage.vfw;
import defpackage.vj5;
import defpackage.whw;
import defpackage.wiw;
import defpackage.wsm;
import defpackage.wwd0;
import defpackage.xfw;
import defpackage.y5b;
import defpackage.yew;
import defpackage.zch0;
import defpackage.zew;
import defpackage.zfw;
import defpackage.zhw;
import defpackage.zi50;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sportybet/android/multimaker/presentation/activity/MultiMakerActivity;", "Lpy1;", "Lk9j;", "Lbb40;", "<init>", "()V", "a", "Lkiw;", "uiState", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class MultiMakerActivity extends bxl implements k9j, bb40 {
    public static final /* synthetic */ int E = 0;
    public PopupWindow A;
    public final mpe0 B;
    public final mpe0 C;
    public final mpe0 D;
    public com.sporty.android.common.uievent.e b;
    public erb c;
    public wsm d;
    public iym e;
    public kid0 f;
    public final q8i0 i = new q8i0(jq40.a(tjw.class), new j(), new i(), new k());
    public zhw v;
    public whw w;
    public zfw y;
    public uhw z;

    public static final class a {
        public static Bundle a(boolean z, boolean z2, String str, Integer num, Integer num2, String str2, List list, boolean z3) {
            Bundle bundleA = vj5.a(new Pair("booking_code_edit", Boolean.valueOf(z)), new Pair("code_hub_edit", Boolean.valueOf(z2)), new Pair("EXTRA_SHOULD_CLOSE_BETSLIP", Boolean.valueOf(z3)));
            if (str != null) {
                bundleA.putString("action_load_booking_code_from", str);
            }
            if (num != null) {
                bundleA.putInt("multi_maker_code_action", num.intValue());
            }
            if (num2 != null) {
                bundleA.putInt("code_provider", num2.intValue());
            }
            if (str2 != null) {
                bundleA.putString("share_code", str2);
            }
            if (list != null) {
                bundleA.putParcelableArrayList("booking_code_event", (ArrayList) list);
            }
            return bundleA;
        }

        public static /* synthetic */ Bundle b(boolean z, String str, Integer num, Integer num2, String str2, ArrayList arrayList, int i) {
            boolean z2 = (i & 1) == 0;
            if ((i & 16) != 0) {
                num2 = null;
            }
            return a(z2, z, str, num, num2, str2, arrayList, true);
        }
    }

    @c0d(c = "com.sportybet.android.multimaker.presentation.activity.MultiMakerActivity$onCreate$4", f = "MultiMakerActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<com.sporty.android.common.uievent.a, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = MultiMakerActivity.this.new b(v1bVar);
            bVar.a = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(com.sporty.android.common.uievent.a aVar, v1b<? super Unit> v1bVar) {
            return ((b) create(aVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            com.sporty.android.common.uievent.a aVar = (com.sporty.android.common.uievent.a) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            MultiMakerActivity multiMakerActivity = MultiMakerActivity.this;
            com.sporty.android.common.uievent.e eVar = multiMakerActivity.b;
            if (eVar == null) {
                Intrinsics.n("commonUiEventProcessor");
                throw null;
            }
            kid0 kid0Var = multiMakerActivity.f;
            if (kid0Var != null) {
                eVar.c(aVar, multiMakerActivity, kid0Var.a, null);
                return Unit.a;
            }
            Intrinsics.n("binding");
            throw null;
        }
    }

    public static final /* synthetic */ class c extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            tjw tjwVar = (tjw) this.receiver;
            tjwVar.getClass();
            tjw.I1(tjwVar, false, 3);
            return Unit.a;
        }
    }

    public static final /* synthetic */ class d extends pf implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            tjw tjwVar = (tjw) this.a;
            tjwVar.getClass();
            ej5.c(o8i0.d(tjwVar), null, null, new uiw(null, tjwVar), 3);
            return Unit.a;
        }
    }

    public static final /* synthetic */ class e extends saj implements Function1<String, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String str2 = str;
            str2.getClass();
            tjw tjwVar = (tjw) this.receiver;
            tjwVar.getClass();
            wwd0 wwd0Var = tjwVar.R;
            Integer intOrNull = StringsKt.toIntOrNull(str2);
            wwd0Var.setValue(intOrNull != null ? String.valueOf(Math.max(0, Math.min(intOrNull.intValue(), 99))) : "");
            return Unit.a;
        }
    }

    public static final /* synthetic */ class f extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((tjw) this.receiver).x1(null);
            return Unit.a;
        }
    }

    public static final /* synthetic */ class g extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((tjw) this.receiver).y.a(vfw.a, k00.d);
            return Unit.a;
        }
    }

    public static final /* synthetic */ class h extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            tjw tjwVar = (tjw) this.receiver;
            tjwVar.y.a(ufw.a, k00.d);
            ej5.c(o8i0.d(tjwVar), null, null, new oiw(null, tjwVar), 3);
            return Unit.a;
        }
    }

    public static final class i extends qlr implements Function0<r8i0.c> {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return MultiMakerActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class j extends qlr implements Function0<v8i0> {
        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return MultiMakerActivity.this.getViewModelStore();
        }
    }

    public static final class k extends qlr implements Function0<cyb> {
        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return MultiMakerActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public MultiMakerActivity() {
        int i2 = 0;
        this.B = hwr.b(new rew(this, i2));
        this.C = hwr.b(new sew(this, i2));
        this.D = hwr.b(new tew(this, i2));
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object bVar;
        wwd0 wwd0Var;
        wwd0 wwd0Var2;
        Object next;
        String str;
        super.onCreate(bundle);
        try {
            zi50.a aVar = zi50.b;
            kid0 kid0VarA = kid0.a(getLayoutInflater());
            setContentView(kid0VarA.a);
            this.f = kid0VarA;
            bVar = Unit.a;
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        Throwable thA = zi50.a(bVar);
        if (thA != null) {
            erb erbVar = this.c;
            if (erbVar == null) {
                Intrinsics.n("crashUtils");
                throw null;
            }
            erbVar.a(this);
            wsm wsmVar = this.d;
            if (wsmVar == null) {
                Intrinsics.n("crashlyticsHelper");
                throw null;
            }
            wsmVar.g("Side loading issue detected in MultiMakerActivity", "", thA, null);
            finish();
            return;
        }
        s9s lifecycle = getLifecycle();
        kid0 kid0Var = this.f;
        if (kid0Var == null) {
            Intrinsics.n("binding");
            throw null;
        }
        ConstraintLayout constraintLayout = kid0Var.a;
        constraintLayout.getClass();
        int i2 = 0;
        new app(lifecycle, constraintLayout, new cew(this, i2));
        this.v = new zhw(new bfw(this));
        this.w = new whw(new whw.a());
        kid0 kid0Var2 = this.f;
        if (kid0Var2 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        RecyclerView recyclerView = kid0Var2.w;
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.i(new aiw(zch0.a(recyclerView.getContext(), 4)));
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter(new androidx.recyclerview.widget.f(this.v, this.w));
        kid0 kid0Var3 = this.f;
        if (kid0Var3 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        SimpleActionBar simpleActionBar = kid0Var3.y.a;
        simpleActionBar.setTitle(sn5.c(simpleActionBar, R.string.multi_maker__title, new Object[0]));
        simpleActionBar.setBackButton(new few(this, i2));
        simpleActionBar.setHomeButton(new gew(this, i2));
        final kid0 kid0Var4 = this.f;
        if (kid0Var4 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        kid0Var4.e.setOnTabClickedListener(new Function1() { // from class: kew
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object value;
                final thw thwVar = (thw) obj;
                int i3 = MultiMakerActivity.E;
                thwVar.getClass();
                int iOrdinal = thwVar.ordinal();
                MultiMakerActivity multiMakerActivity = this.a;
                kid0 kid0Var5 = kid0Var4;
                if (iOrdinal == 2) {
                    final dxf0 dxf0Var = (dxf0) multiMakerActivity.C.getValue();
                    final FilterTabLayout filterTabLayout = kid0Var5.e;
                    dxf0Var.getClass();
                    xvf0 xvf0VarInvoke = dxf0Var.e.invoke();
                    ArrayList arrayListA = dxf0Var.a();
                    ArrayList arrayList = new ArrayList(l48.r(arrayListA, 10));
                    int size = arrayListA.size();
                    int i4 = 0;
                    while (i4 < size) {
                        Object obj2 = arrayListA.get(i4);
                        i4++;
                        xvf0 xvf0Var = new xvf0((xvf0) obj2);
                        xvf0Var.c = zc9.a(xvf0Var, xvf0VarInvoke);
                        arrayList.add(xvf0Var);
                    }
                    RecyclerView.f adapter = dxf0Var.b.a.getAdapter();
                    ywf0 ywf0Var = (ywf0) (adapter instanceof ywf0 ? adapter : null);
                    if (ywf0Var != null) {
                        ywf0Var.j(arrayList, new Runnable() { // from class: bxf0
                            @Override // java.lang.Runnable
                            public final void run() {
                                ((PopupWindow) dxf0Var.c.getValue()).showAsDropDown(filterTabLayout);
                            }
                        });
                    }
                } else if (iOrdinal != 3) {
                    final clw clwVar = (clw) multiMakerActivity.B.getValue();
                    final FilterTabLayout filterTabLayout2 = kid0Var5.e;
                    clwVar.getClass();
                    RecyclerView.f adapter2 = clwVar.b.d.getAdapter();
                    tkw tkwVar = (tkw) (adapter2 instanceof tkw ? adapter2 : null);
                    if (tkwVar != null) {
                        tkwVar.j(clwVar.f.invoke(thwVar), new Runnable() { // from class: ukw
                            @Override // java.lang.Runnable
                            public final void run() {
                                clw clwVar2 = clwVar;
                                clwVar2.g = thwVar;
                                clwVar2.a();
                                ((PopupWindow) clwVar2.c.getValue()).showAsDropDown(filterTabLayout2);
                            }
                        });
                    }
                } else {
                    sky skyVar = (sky) multiMakerActivity.D.getValue();
                    FilterTabLayout filterTabLayout3 = kid0Var5.e;
                    s9s lifecycle2 = multiMakerActivity.getLifecycle();
                    skyVar.getClass();
                    lifecycle2.getClass();
                    wwd0 wwd0Var3 = skyVar.g;
                    g1i g1iVar = new g1i(wwd0Var3, new qky(skyVar, null));
                    s9s.b bVar2 = s9s.b.d;
                    arr.a(g1iVar, lifecycle2, bVar2);
                    arr.a(new g1i(skyVar.b.d.getOddsRangeModeChangedEventFlow(), new rky(skyVar, null)), lifecycle2, bVar2);
                    ohw ohwVarInvoke = skyVar.f.invoke();
                    do {
                        value = wwd0Var3.getValue();
                    } while (!wwd0Var3.g(value, ohwVarInvoke));
                    ((PopupWindow) skyVar.c.getValue()).showAsDropDown(filterTabLayout3);
                }
                return Unit.a;
            }
        });
        g1i g1iVar = new g1i(z1().f0, new b(null));
        s9s lifecycle2 = getLifecycle();
        lifecycle2.getClass();
        s9s.b bVar2 = s9s.b.d;
        arr.a(g1iVar, lifecycle2, bVar2);
        this.y = new zfw(new afw(this));
        this.z = new uhw(new uhw.a());
        kid0 kid0Var5 = this.f;
        if (kid0Var5 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        RecyclerView recyclerView2 = kid0Var5.v;
        recyclerView2.setItemAnimator(null);
        recyclerView2.setAdapter(new androidx.recyclerview.widget.f(this.y, this.z));
        kid0 kid0Var6 = this.f;
        if (kid0Var6 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        kid0Var6.d.setContent(new op8(-1361300397, new Function2() { // from class: new
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar3 = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i3 = MultiMakerActivity.E;
                int i4 = 1;
                if (aVar3.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    MultiMakerActivity multiMakerActivity = this.a;
                    ytw ytwVarC = wyh.c(multiMakerActivity.z1().h0, aVar3, 0, 7);
                    chw chwVar = ((kiw) ytwVarC.getValue()).d;
                    tjw tjwVarZ1 = multiMakerActivity.z1();
                    boolean zA = aVar3.A(tjwVarZ1);
                    Object objY = aVar3.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zA || objY == c0042a) {
                        MultiMakerActivity.c cVar = new MultiMakerActivity.c(0, tjwVarZ1, tjw.class, YAzniTbXHYQ.FYbeEzKw, "clickSpin()V", 0);
                        aVar3.r(cVar);
                        objY = cVar;
                    }
                    Function0 function0 = (Function0) ((chp) objY);
                    tjw tjwVarZ2 = multiMakerActivity.z1();
                    boolean zA2 = aVar3.A(tjwVarZ2);
                    Object objY2 = aVar3.y();
                    if (zA2 || objY2 == c0042a) {
                        MultiMakerActivity.d dVar = new MultiMakerActivity.d(0, tjwVarZ2, tjw.class, "clickRemoveAll", "clickRemoveAll()Lkotlinx/coroutines/Job;", 8);
                        aVar3.r(dVar);
                        objY2 = dVar;
                    }
                    Function0 function1 = (Function0) objY2;
                    boolean zA3 = aVar3.A(multiMakerActivity) | aVar3.M(ytwVarC);
                    Object objY3 = aVar3.y();
                    if (zA3 || objY3 == c0042a) {
                        objY3 = new a3d(i4, multiMakerActivity, ytwVarC);
                        aVar3.r(objY3);
                    }
                    Function0 function2 = (Function0) objY3;
                    tjw tjwVarZ3 = multiMakerActivity.z1();
                    boolean zA4 = aVar3.A(tjwVarZ3);
                    Object objY4 = aVar3.y();
                    if (zA4 || objY4 == c0042a) {
                        MultiMakerActivity.e eVar = new MultiMakerActivity.e(1, tjwVarZ3, tjw.class, "onAddSelectionsInputTextChanged", "onAddSelectionsInputTextChanged(Ljava/lang/String;)V", 0);
                        aVar3.r(eVar);
                        objY4 = eVar;
                    }
                    Function1 function3 = (Function1) ((chp) objY4);
                    tjw tjwVarZ4 = multiMakerActivity.z1();
                    boolean zA5 = aVar3.A(tjwVarZ4);
                    Object objY5 = aVar3.y();
                    if (zA5 || objY5 == c0042a) {
                        objY5 = new MultiMakerActivity.f(0, tjwVarZ4, tjw.class, "onAddSelectionsClicked", "onAddSelectionsClicked()V", 0);
                        aVar3.r(objY5);
                    }
                    Function0 function4 = (Function0) ((chp) objY5);
                    tjw tjwVarZ5 = multiMakerActivity.z1();
                    boolean zA6 = aVar3.A(tjwVarZ5);
                    Object objY6 = aVar3.y();
                    if (zA6 || objY6 == c0042a) {
                        objY6 = new MultiMakerActivity.g(0, tjwVarZ5, tjw.class, "onAddToBetSlipShown", "onAddToBetSlipShown()V", 0);
                        aVar3.r(objY6);
                    }
                    Function0 function5 = (Function0) ((chp) objY6);
                    tjw tjwVarZ6 = multiMakerActivity.z1();
                    boolean zA7 = aVar3.A(tjwVarZ6);
                    Object objY7 = aVar3.y();
                    if (zA7 || objY7 == c0042a) {
                        objY7 = new MultiMakerActivity.h(0, tjwVarZ6, tjw.class, "onAddToBetSlipClicked", "onAddToBetSlipClicked()V", 0);
                        aVar3.r(objY7);
                    }
                    Function0 function6 = (Function0) ((chp) objY7);
                    boolean zA8 = aVar3.A(multiMakerActivity);
                    Object objY8 = aVar3.y();
                    if (zA8 || objY8 == c0042a) {
                        objY8 = new e9n(multiMakerActivity, i4);
                        aVar3.r(objY8);
                    }
                    bhw.a(chwVar, function0, function1, function2, function3, function4, function5, function6, (Function1) objY8, aVar3, 8);
                } else {
                    aVar3.G();
                }
                return Unit.a;
            }
        }, true));
        kid0 kid0Var7 = this.f;
        if (kid0Var7 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        kid0Var7.b.setOnClickListener(new pew());
        kid0 kid0Var8 = this.f;
        if (kid0Var8 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        kid0Var8.c.setOnClickListener(new qew());
        kid0 kid0Var9 = this.f;
        if (kid0Var9 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        g1i g1iVar2 = new g1i(z1().h0, new yew(this, kid0Var9, null));
        s9s lifecycle3 = getLifecycle();
        lifecycle3.getClass();
        arr.a(g1iVar2, lifecycle3, bVar2);
        g1i g1iVar3 = new g1i(z1().j0, new zew(this, null));
        s9s lifecycle4 = getLifecycle();
        lifecycle4.getClass();
        arr.a(g1iVar3, lifecycle4, bVar2);
        tjw tjwVarZ1 = z1();
        boolean booleanExtra = getIntent().getBooleanExtra("booking_code_edit", false);
        boolean booleanExtra2 = getIntent().getBooleanExtra("code_hub_edit", false);
        String stringExtra = getIntent().getStringExtra("action_load_booking_code_from");
        int intExtra = getIntent().getIntExtra("multi_maker_code_action", 0);
        int intExtra2 = getIntent().getIntExtra("code_provider", 0);
        String stringExtra2 = getIntent().getStringExtra("share_code");
        Intent intent = getIntent();
        intent.getClass();
        ArrayList parcelableArrayListExtra = Build.VERSION.SDK_INT >= 33 ? intent.getParcelableArrayListExtra("booking_code_event", MultiMakerItem.class) : intent.getParcelableArrayListExtra("booking_code_event");
        wwd0 wwd0Var3 = tjwVarZ1.P;
        wwd0 wwd0Var4 = tjwVarZ1.M;
        wwd0 wwd0Var5 = tjwVarZ1.Z;
        wwd0 wwd0Var6 = tjwVarZ1.Y;
        wwd0 wwd0Var7 = tjwVarZ1.X;
        wwd0 wwd0Var8 = tjwVarZ1.H;
        wwd0 wwd0Var9 = tjwVarZ1.G;
        wwd0 wwd0Var10 = tjwVarZ1.V;
        tjwVarZ1.z = booleanExtra;
        tjwVarZ1.A = booleanExtra2;
        tjwVarZ1.B = stringExtra;
        tjwVarZ1.C = intExtra;
        tjwVarZ1.D = intExtra2;
        tjwVarZ1.E = stringExtra2;
        ArrayList arrayList = new ArrayList();
        wwd0 wwd0Var11 = tjwVarZ1.g0;
        wwd0Var11.getClass();
        while (true) {
            Object value = wwd0Var11.getValue();
            kiw kiwVar = (kiw) value;
            fiw fiwVar = kiwVar.a;
            m2g m2gVar = m2g.a;
            fiwVar.getClass();
            m2gVar.getClass();
            wwd0Var = wwd0Var7;
            wwd0Var2 = wwd0Var6;
            if (wwd0Var11.g(value, kiw.a(kiwVar, new fiw(7, m2gVar, true), ogw.a(kiwVar.b, false, true, null, null, null, 61), null, null, null, 0, false, false, false, false, 1020))) {
                break;
            }
            wwd0Var7 = wwd0Var;
            wwd0Var6 = wwd0Var2;
        }
        wwd0 wwd0Var12 = tjwVarZ1.F;
        kzh.d(new g1i(wwd0Var12, new gjw(null, tjwVarZ1)), o8i0.d(tjwVarZ1));
        wwd0 wwd0Var13 = tjwVarZ1.L;
        kzh.d(r1i.a(wwd0Var9, wwd0Var8, wwd0Var13, new jjw(null, tjwVarZ1)), o8i0.d(tjwVarZ1));
        kzh.d(new djw(new lyh[]{bm50.f(wwd0Var12), wwd0Var10, bm50.f(wwd0Var9), wwd0Var, bm50.f(wwd0Var8), wwd0Var2, wwd0Var5, wwd0Var13}, tjwVarZ1), o8i0.d(tjwVarZ1));
        kzh.d(new ejw(new lyh[]{tjwVarZ1.J, tjwVarZ1.K, tjwVarZ1.a0, tjwVarZ1.b0}, tjwVarZ1), o8i0.d(tjwVarZ1));
        kzh.d(new fjw(new lyh[]{wwd0Var4, tjwVarZ1.I, tjwVarZ1.O, tjwVarZ1.R, tjwVarZ1.S, tjwVarZ1.U, wwd0Var3, tjwVarZ1.Q, tjwVarZ1.T}, tjwVarZ1), o8i0.d(tjwVarZ1));
        kzh.d(new cjw(new lyh[]{wwd0Var10, bm50.f(wwd0Var9), wwd0Var, bm50.f(wwd0Var8), wwd0Var2, wwd0Var5}, tjwVarZ1), o8i0.d(tjwVarZ1));
        boolean z = parcelableArrayListExtra == null || parcelableArrayListExtra.isEmpty();
        arrayList.add(tjwVarZ1.G1(qhw.a));
        arrayList.add(ej5.c(o8i0.d(tjwVarZ1), null, null, new bjw(tjwVarZ1, z, null), 3));
        arrayList.add(tjwVarZ1.H1(z));
        arrayList.add(ej5.c(o8i0.d(tjwVarZ1), null, null, new ajw(tjwVarZ1, z, null), 3));
        arrayList.add(ej5.c(o8i0.d(tjwVarZ1), null, null, new qjw(null, tjwVarZ1), 3));
        arrayList.add(ej5.c(o8i0.d(tjwVarZ1), null, null, new ojw(null, tjwVarZ1), 3));
        arrayList.add(ej5.c(o8i0.d(tjwVarZ1), null, null, new pjw(null, tjwVarZ1), 3));
        if (parcelableArrayListExtra == null || parcelableArrayListExtra.isEmpty()) {
            arrayList.add(tjw.I1(tjwVarZ1, false, 2));
        } else {
            Boolean boolValueOf = Boolean.valueOf(tjwVarZ1.z);
            wwd0Var3.getClass();
            wwd0Var3.k(null, boolValueOf);
            wwd0Var4.getClass();
            wwd0Var4.k(null, parcelableArrayListExtra);
            wwd0 wwd0Var14 = tjwVarZ1.N;
            Integer numValueOf = Integer.valueOf(parcelableArrayListExtra.size());
            wwd0Var14.getClass();
            wwd0Var14.k(null, numValueOf);
            Iterator it = e9l.a(new wiw(parcelableArrayListExtra)).entrySet().iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iIntValue = ((Number) ((Map.Entry) next).getValue()).intValue();
                    do {
                        Object next2 = it.next();
                        int iIntValue2 = ((Number) ((Map.Entry) next2).getValue()).intValue();
                        if (iIntValue < iIntValue2) {
                            next = next2;
                            iIntValue = iIntValue2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            Map.Entry entry = (Map.Entry) next;
            if (entry != null && (str = (String) entry.getKey()) != null) {
                wwd0Var10.getClass();
                wwd0Var10.k(null, str);
            }
            tjwVarZ1.G1(qhw.f);
        }
        z1().y.a(xfw.a, k00.d, k00.c);
    }

    @Override // defpackage.py1, defpackage.hrl, defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        this.v = null;
        this.w = null;
        this.y = null;
        this.z = null;
        com.sporty.android.common.uievent.e eVar = this.b;
        if (eVar == null) {
            Intrinsics.n("commonUiEventProcessor");
            throw null;
        }
        eVar.a();
        super.onDestroy();
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onPause() {
        z1().a.b(true);
        super.onPause();
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        tjw tjwVarZ1 = z1();
        List list = (List) tjwVarZ1.M.getValue();
        jvd0 jvd0Var = tjwVarZ1.k0;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        tjwVarZ1.k0 = ej5.c(o8i0.d(tjwVarZ1), null, null, new sjw(tjwVarZ1, list, null), 3);
    }

    public final tjw z1() {
        return (tjw) this.i.getValue();
    }
}
