package com.sportybet.android.bookingcode.presentation.activity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.sporty.android.common.uievent.e;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.android.bookingcode.presentation.smartremix.SmartRemixConfirmationUiState;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.multimaker.presentation.activity.MultiMakerActivity;
import com.sportybet.plugin.realsports.data.Event;
import com.twilio.voice.EventKeys;
import defpackage.arr;
import defpackage.azm;
import defpackage.b9s;
import defpackage.bb40;
import defpackage.bew;
import defpackage.bmy;
import defpackage.cyb;
import defpackage.ej5;
import defpackage.f00;
import defpackage.feb0;
import defpackage.g1i;
import defpackage.g9i0;
import defpackage.gkl;
import defpackage.hkl;
import defpackage.jpu;
import defpackage.jq40;
import defpackage.k2a0;
import defpackage.l9s;
import defpackage.m2g;
import defpackage.n8j0;
import defpackage.o8i0;
import defpackage.oke;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.qoa0;
import defpackage.r6i0;
import defpackage.r8i0;
import defpackage.s9s;
import defpackage.sd9;
import defpackage.tlf;
import defpackage.v8i0;
import defpackage.vgb0;
import defpackage.vjl;
import defpackage.wae;
import defpackage.whs;
import defpackage.wjl;
import defpackage.wrl;
import defpackage.wwd0;
import defpackage.x8s;
import defpackage.xjl;
import defpackage.yjl;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.luBk.Chyeyik;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/sportybet/android/bookingcode/presentation/activity/HighLiabilityCodeActivity;", "Lpy1;", "Lbb40;", "Lcom/sportybet/android/bookingcode/presentation/activity/a$a;", "Ll9s$a;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class HighLiabilityCodeActivity extends wrl implements bb40, com.sportybet.android.bookingcode.presentation.activity.a.InterfaceC0220a, l9s.a {
    public static final /* synthetic */ int y = 0;
    public azm b;
    public e c;
    public feb0 d;
    public List<? extends Event> e;
    public String f;
    public String i;
    public boolean v;
    public final q8i0 w = new q8i0(jq40.a(gkl.class), new b(), new a(), new c());

    /* JADX INFO: loaded from: classes5.dex */
    public static final class a extends qlr implements Function0<r8i0.c> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return HighLiabilityCodeActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class b extends qlr implements Function0<v8i0> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return HighLiabilityCodeActivity.this.getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class c extends qlr implements Function0<cyb> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return HighLiabilityCodeActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public final gkl A1() {
        return (gkl) this.w.getValue();
    }

    public final void B1() {
        if (z1() instanceof com.sportybet.android.bookingcode.presentation.activity.a) {
            return;
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a aVarA = oke.a(supportFragmentManager, supportFragmentManager);
        feb0 feb0Var = this.d;
        if (feb0Var == null) {
            Intrinsics.n("binding");
            throw null;
        }
        int id = feb0Var.a.getId();
        String str = this.f;
        if (str == null) {
            Intrinsics.n(EventKeys.ERROR_CODE);
            throw null;
        }
        String str2 = this.i;
        if (str2 == null) {
            Intrinsics.n("summary");
            throw null;
        }
        List<? extends Event> list = this.e;
        if (list == null) {
            Intrinsics.n("itemList");
            throw null;
        }
        boolean z = this.v;
        com.sportybet.android.bookingcode.presentation.activity.a aVar = new com.sportybet.android.bookingcode.presentation.activity.a();
        Bundle bundleA = whs.a("arg_share_code", str, "arg_summary", str2);
        bundleA.putParcelableArrayList("arg_booking_code_event", new ArrayList<>(list));
        bundleA.putBoolean("arg_is_smart_remix_available", z);
        aVar.setArguments(bundleA);
        aVarA.f(id, aVar, "HighLiabilityCodeFragment");
        aVarA.d();
        String stringExtra = getIntent().getStringExtra("action_load_booking_code_from");
        if (stringExtra == null || StringsKt.U(stringExtra)) {
            return;
        }
        f00 f00Var = vgb0.a;
        vgb0.c(AnalyticsEvent.SHOW_HIGH_LIABILITY_DIALOG, jpu.b(new Pair("from", stringExtra)), false);
    }

    @Override // l9s.a
    public final void Y0() {
        gkl gklVarA1 = A1();
        gklVarA1.y1(null, ((k2a0) gklVarA1.i.getValue()).a);
        finish();
    }

    @Override // l9s.a
    public final void o0() {
        gkl gklVarA1 = A1();
        wwd0 wwd0Var = gklVarA1.i;
        SmartRemixConfirmationUiState smartRemixConfirmationUiState = ((k2a0) wwd0Var.getValue()).b;
        if (smartRemixConfirmationUiState != null) {
            ArrayList arrayList = smartRemixConfirmationUiState.c;
            SmartRemixConfirmationUiState smartRemixConfirmationUiState2 = ((k2a0) wwd0Var.getValue()).b;
            String str = smartRemixConfirmationUiState2 != null ? smartRemixConfirmationUiState2.a : null;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            SmartRemixConfirmationUiState smartRemixConfirmationUiState3 = ((k2a0) wwd0Var.getValue()).b;
            Integer num = smartRemixConfirmationUiState3 != null ? smartRemixConfirmationUiState3.b : null;
            gklVarA1.z1(b9s.a);
            ej5.c(o8i0.d(gklVarA1), null, null, new hkl(gklVarA1, arrayList, str2, num, null), 3);
        }
    }

    @Override // com.sportybet.android.bookingcode.presentation.activity.a.InterfaceC0220a
    public final void p0() {
        String stringExtra = getIntent().getStringExtra("action_load_booking_code_from");
        if (stringExtra == null) {
            stringExtra = "";
        }
        String str = stringExtra;
        if (str.length() > 0) {
            f00 f00Var = vgb0.a;
            vgb0.c("edit_in_multimaker", jpu.b(new Pair("from", str)), false);
        }
        setResult(1);
        finish();
        azm azmVar = this.b;
        if (azmVar == null) {
            Intrinsics.n("router");
            throw null;
        }
        wae waeVar = wae.MULTI_MAKER;
        List<? extends Event> list = this.e;
        if (list == null) {
            Intrinsics.n("itemList");
            throw null;
        }
        ArrayList arrayListA = sd9.a(list);
        String stringExtra2 = getIntent().getStringExtra("share_code");
        Intent intent = getIntent();
        bew bewVar = bew.ADD_TO_BETSLIP_DIRECTLY;
        azmVar.e(waeVar, MultiMakerActivity.a.b(false, str, Integer.valueOf(intent.getIntExtra("multi_maker_code_action", 3)), Integer.valueOf(getIntent().getIntExtra("code_provider", 0)), stringExtra2, arrayListA, 128));
    }

    @Override // l9s.a
    public final void q() {
        A1().z1(x8s.a);
        gkl gklVarA1 = A1();
        gklVarA1.y1(null, ((k2a0) gklVarA1.i.getValue()).a);
        B1();
    }

    public final Fragment z1() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        feb0 feb0Var = this.d;
        if (feb0Var != null) {
            return supportFragmentManager.G(feb0Var.a.getId());
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        n8j0.g bVar;
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.spm_activity_high_liability_code, (ViewGroup) null, false);
        if (viewInflate != null) {
            FrameLayout frameLayout = (FrameLayout) viewInflate;
            this.d = new feb0(frameLayout);
            setContentView(frameLayout);
            int i2 = Build.VERSION.SDK_INT;
            boolean z = true;
            if (i2 == 26) {
                i = -1;
            } else {
                i = 1;
            }
            setRequestedOrientation(i);
            feb0 feb0Var = this.d;
            if (feb0Var != null) {
                feb0Var.a.setSystemUiVisibility(1280);
                feb0 feb0Var2 = this.d;
                if (feb0Var2 != null) {
                    feb0Var2.a.setBackgroundColor(0);
                    getWindow().getDecorView().setBackgroundColor(0);
                    getWindow().setBackgroundDrawable(new ColorDrawable(0));
                    getWindow().clearFlags(2);
                    getWindow().setDimAmount(0.0f);
                    if (i2 >= 35) {
                        Window window = getWindow();
                        qoa0 qoa0Var = new qoa0(window.getDecorView());
                        int i3 = Build.VERSION.SDK_INT;
                        if (i3 >= 35) {
                            bVar = new n8j0.f(window, qoa0Var);
                        } else if (i3 >= 30) {
                            bVar = new n8j0.d(window, qoa0Var);
                        } else if (i3 >= 26) {
                            bVar = new n8j0.c(window, qoa0Var);
                        } else {
                            bVar = new n8j0.b(window, qoa0Var);
                        }
                        bVar.d(false);
                        bVar.c(false);
                        View viewFindViewById = findViewById(android.R.id.content);
                        tlf tlfVar = new tlf(viewFindViewById, z);
                        WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
                        r6i0.d.n(viewFindViewById, tlfVar);
                    } else {
                        Window window2 = getWindow();
                        window2.addFlags(Integer.MIN_VALUE);
                        window2.clearFlags(67108864);
                        window2.setStatusBarColor(0);
                    }
                    List<? extends Event> parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("booking_code_event");
                    if (parcelableArrayListExtra == null) {
                        parcelableArrayListExtra = m2g.a;
                    }
                    this.e = parcelableArrayListExtra;
                    String stringExtra = getIntent().getStringExtra("share_code");
                    String str = "";
                    if (stringExtra == null) {
                        stringExtra = "";
                    }
                    this.f = stringExtra;
                    String stringExtra2 = getIntent().getStringExtra("summary");
                    if (stringExtra2 != null) {
                        str = stringExtra2;
                    }
                    this.i = str;
                    this.v = getIntent().getBooleanExtra("is_smart_remix_available", false);
                    if (bundle == null) {
                        B1();
                    }
                    getOnBackPressedDispatcher().a(this, new vjl(this));
                    feb0 feb0Var3 = this.d;
                    if (feb0Var3 != null) {
                        g1i g1iVar = new g1i(A1().A, new yjl(this, feb0Var3.a, null));
                        s9s lifecycle = getLifecycle();
                        lifecycle.getClass();
                        s9s.b bVar2 = s9s.b.d;
                        arr.a(g1iVar, lifecycle, bVar2);
                        g1i g1iVar2 = new g1i(A1().v, new wjl(2, this, HighLiabilityCodeActivity.class, "renderSmartRemixUiState", "renderSmartRemixUiState(Lcom/sportybet/android/bookingcode/presentation/smartremix/SmartRemixUiState;)V", 4));
                        s9s lifecycle2 = getLifecycle();
                        lifecycle2.getClass();
                        arr.a(g1iVar2, lifecycle2, bVar2);
                        g1i g1iVar3 = new g1i(A1().y, new xjl(2, this, HighLiabilityCodeActivity.class, Chyeyik.FmXeUpFQYzAcGR, "handleSmartRemixSideEffect(Lcom/sportybet/android/bookingcode/presentation/smartremix/SmartRemixSideEffect;)V", 4));
                        s9s lifecycle3 = getLifecycle();
                        lifecycle3.getClass();
                        arr.a(g1iVar3, lifecycle3, bVar2);
                        return;
                    }
                    Intrinsics.n("binding");
                    throw null;
                }
                Intrinsics.n("binding");
                throw null;
            }
            Intrinsics.n("binding");
            throw null;
        }
        bmy.a("rootView");
    }
}
