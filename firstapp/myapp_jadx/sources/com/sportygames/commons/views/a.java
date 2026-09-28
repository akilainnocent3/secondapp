package com.sportygames.commons.views;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.models.OnboardingItem;
import com.sportygames.commons.views.DynamicOnboardingScreenBasicBase;
import com.sportygames.commons.views.a;
import com.sportygames.onboarding.fruithunt.FHOnboardingKnife;
import com.sportygames.onboarding.fruithunt.FHOnboardingThrow;
import com.sportygames.onboarding.pingPong.PPInteractiveOnboardingCashOut;
import com.sportygames.onboarding.sportyhero.SHInteractiveOnboardingCashOut;
import com.sportygames.onboarding.sportyjet.SJInteractiveOnboardingCashOut;
import defpackage.a1b0;
import defpackage.b8b0;
import defpackage.bm60;
import defpackage.bmy;
import defpackage.dcb0;
import defpackage.djh;
import defpackage.e510;
import defpackage.ej5;
import defpackage.eo80;
import defpackage.fgg;
import defpackage.fo80;
import defpackage.fse;
import defpackage.g6i0;
import defpackage.gku;
import defpackage.glz;
import defpackage.gvi;
import defpackage.h5e;
import defpackage.i3j;
import defpackage.ixi;
import defpackage.jct;
import defpackage.jhg;
import defpackage.kab0;
import defpackage.kd;
import defpackage.l12;
import defpackage.l560;
import defpackage.m410;
import defpackage.m7i0;
import defpackage.nn40;
import defpackage.o2g;
import defpackage.ony;
import defpackage.op5;
import defpackage.pfd;
import defpackage.plz;
import defpackage.q1c0;
import defpackage.qlf;
import defpackage.sny;
import defpackage.spy;
import defpackage.u6j;
import defpackage.un20;
import defpackage.upy;
import defpackage.vpy;
import defpackage.w3c0;
import defpackage.w5b;
import defpackage.wxi;
import defpackage.wz;
import defpackage.x5a0;
import defpackage.x7c0;
import defpackage.xn60;
import defpackage.xo40;
import defpackage.ygb;
import defpackage.zt50;
import defpackage.zy10;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0002\u0007\bB\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/sportygames/commons/views/a;", "Ll12;", "Ljct;", "Lkd;", "", "<init>", "()V", "a", "b", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a extends l12<jct, kd> {
    public boolean A;
    public int d;
    public SharedPreferences.Editor f;
    public InterfaceC0441a i;
    public b v;
    public List<? extends File> w;
    public String y;
    public Map<String, Float> z;
    public String c = "";
    public DynamicOnboardingScreenBasicBase[] e = new DynamicOnboardingScreenBasicBase[0];

    /* JADX INFO: renamed from: com.sportygames.commons.views.a$a, reason: collision with other inner class name */
    public interface InterfaceC0441a {
    }

    public interface b {
        void a(int i);
    }

    public static final class c extends ViewPager2.g {
        public c() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void c(int i) {
            kd kdVar = (kd) a.this.b;
            if (kdVar != null) {
                TabLayout tabLayout = kdVar.f;
                tabLayout.s(kdVar != null ? tabLayout.k(i) : null, true);
            }
        }
    }

    public a() {
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        this.z = o2gVar;
        this.A = true;
    }

    /* JADX WARN: Failed to calculate best type for var: r14v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v2 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v14 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v14 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v12 ??, new type: java.lang.Float[]
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v13 ??, new type: java.lang.Float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v14 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v15 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v15 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v16 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v17 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v17 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v16 ??, new type: java.lang.Float[]
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v17 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v17 ??, new type: java.lang.Float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v18 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v18 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v19 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v19 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v14 ??, new type: float
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public final void C0(int r19) {
        /*
            Method dump skipped, instruction units count: 667
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sportygames.commons.views.a.C0(int):void");
    }

    @Override // defpackage.l12
    public final g6i0 o0() {
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_on_boarding, (ViewGroup) null, false);
        int i = R.id.arrow_layout;
        ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.arrow_layout, viewInflate);
        if (constraintLayout != null) {
            i = R.id.btn_layout;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) h5e.a(R.id.btn_layout, viewInflate);
            if (constraintLayout2 != null) {
                i = R.id.done_btn;
                TextView textView = (TextView) h5e.a(R.id.done_btn, viewInflate);
                if (textView != null) {
                    i = R.id.image_bet;
                    if (((ImageView) h5e.a(R.id.image_bet, viewInflate)) != null) {
                        i = R.id.image_bet1;
                        if (((ImageView) h5e.a(R.id.image_bet1, viewInflate)) != null) {
                            i = R.id.intro_pager;
                            ViewPager2 viewPager2 = (ViewPager2) h5e.a(R.id.intro_pager, viewInflate);
                            if (viewPager2 != null) {
                                i = R.id.intro_tab_layout;
                                TabLayout tabLayout = (TabLayout) h5e.a(R.id.intro_tab_layout, viewInflate);
                                if (tabLayout != null) {
                                    i = R.id.next_btn;
                                    TextView textView2 = (TextView) h5e.a(R.id.next_btn, viewInflate);
                                    if (textView2 != null) {
                                        ConstraintLayout constraintLayout3 = (ConstraintLayout) viewInflate;
                                        i = R.id.pr_arrow_layout;
                                        ConstraintLayout constraintLayout4 = (ConstraintLayout) h5e.a(R.id.pr_arrow_layout, viewInflate);
                                        if (constraintLayout4 != null) {
                                            i = R.id.pr_image_bet1;
                                            if (((ImageView) h5e.a(R.id.pr_image_bet1, viewInflate)) != null) {
                                                i = R.id.pr_image_bet2;
                                                if (((ImageView) h5e.a(R.id.pr_image_bet2, viewInflate)) != null) {
                                                    i = R.id.pr_image_bet3;
                                                    if (((ImageView) h5e.a(R.id.pr_image_bet3, viewInflate)) != null) {
                                                        i = R.id.skip;
                                                        AppCompatTextView appCompatTextView = (AppCompatTextView) h5e.a(R.id.skip, viewInflate);
                                                        if (appCompatTextView != null) {
                                                            return new kd(constraintLayout3, constraintLayout, constraintLayout2, textView, viewPager2, tabLayout, textView2, constraintLayout4, appCompatTextView);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        this.i = (InterfaceC0441a) context;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        Window window;
        super.onPause();
        try {
            e activity = getActivity();
            if (activity == null || (window = activity.getWindow()) == null) {
                return;
            }
            window.clearFlags(128);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        Window window;
        super.onResume();
        try {
            e activity = getActivity();
            if (activity == null || (window = activity.getWindow()) == null) {
                return;
            }
            window.addFlags(128);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Window window;
        view.getClass();
        super.onViewCreated(view, bundle);
        Context context = getContext();
        if (context != null) {
            SharedPreferences sharedPreferencesA = un20.a(getContext());
            this.f = sharedPreferencesA != null ? sharedPreferencesA.edit() : null;
            SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
            String country = sportyGamesManager != null ? sportyGamesManager.getCountry() : null;
            if (country == null) {
                country = "";
            }
            this.y = country;
            List<? extends File> list = this.w;
            op5 op5Var = op5.a;
            op5Var.getClass();
            op5.b = list;
            kd kdVar = (kd) this.b;
            op5.r(op5Var, kotlin.collections.b.f(kdVar != null ? kdVar.i : null, kdVar != null ? kdVar.w : null, kdVar != null ? kdVar.d : null), null, 4);
            Context context2 = getContext();
            if (context2 != null) {
                this.e = vpy.a(context2, this.c, this.y, this.z, this.A, new bm60(getParentFragment(), getContext(), (kd) this.b), new plz(getParentFragment(), getContext(), (kd) this.b), new glz(getParentFragment(), getContext(), (kd) this.b), new xn60(getParentFragment(), getContext(), (kd) this.b));
            }
            DynamicOnboardingScreenBasicBase[] dynamicOnboardingScreenBasicBaseArr = this.e;
            if (dynamicOnboardingScreenBasicBaseArr.length == 0 || dynamicOnboardingScreenBasicBaseArr.length == 0) {
                v0(false);
            } else {
                upy upyVar = new upy(this, dynamicOnboardingScreenBasicBaseArr, this);
                kd kdVar2 = (kd) this.b;
                if (kdVar2 != null) {
                    kdVar2.e.setAdapter(upyVar);
                }
                kd kdVar3 = (kd) this.b;
                if (kdVar3 != null) {
                    kdVar3.e.setUserInputEnabled(false);
                }
                kd kdVar4 = (kd) this.b;
                if (kdVar4 != null) {
                    kdVar4.e.setCurrentItem(this.d, false);
                }
                DynamicOnboardingScreenBasicBase[] dynamicOnboardingScreenBasicBaseArr2 = this.e;
                int length = dynamicOnboardingScreenBasicBaseArr2.length;
                for (int i = 0; i < length; i++) {
                    DynamicOnboardingScreenBasicBase dynamicOnboardingScreenBasicBase = dynamicOnboardingScreenBasicBaseArr2[i];
                    kd kdVar5 = (kd) this.b;
                    if (kdVar5 != null) {
                        TabLayout.g gVarL = kdVar5.f.l();
                        gVarL.a = Integer.valueOf(i);
                        kd kdVar6 = (kd) this.b;
                        if (kdVar6 != null) {
                            kdVar6.f.d(gVarL, false);
                        }
                    }
                }
                Context context3 = getContext();
                if (context3 != null && sny.a(context3, this.c).isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    DynamicOnboardingScreenBasicBase[] dynamicOnboardingScreenBasicBaseArr3 = this.e;
                    int length2 = dynamicOnboardingScreenBasicBaseArr3.length;
                    for (int i2 = 0; i2 < length2; i2++) {
                        DynamicOnboardingScreenBasicBase dynamicOnboardingScreenBasicBase2 = dynamicOnboardingScreenBasicBaseArr3[i2];
                        arrayList.add(new OnboardingItem(Integer.valueOf(i2), Boolean.FALSE));
                    }
                    sny.b(this.f, arrayList, this.c);
                }
                kd kdVar7 = (kd) this.b;
                if (kdVar7 != null) {
                    new com.google.android.material.tabs.c(kdVar7.f, kdVar7.e, new spy()).a();
                }
            }
            e activity = getActivity();
            if (activity != null && (window = activity.getWindow()) != null) {
                LinkedHashMap linkedHashMap = ony.a;
                String str = this.c;
                str.getClass();
                Integer num = (Integer) ony.c.get(str);
                qlf.c(window, context.getColor(num != null ? num.intValue() : R.color.toolbar_strip_hero));
            }
        }
        kd kdVar8 = (kd) this.b;
        if (kdVar8 != null) {
            kdVar8.w.setPaintFlags(8);
        }
        upy upyVar2 = new upy(this, this.e, this);
        kd kdVar9 = (kd) this.b;
        if (kdVar9 != null) {
            kdVar9.e.setAdapter(upyVar2);
        }
        kd kdVar10 = (kd) this.b;
        if (kdVar10 != null) {
            kdVar10.e.setUserInputEnabled(false);
        }
        if (this.d > this.e.length - 1) {
            v0(false);
        }
        kd kdVar11 = (kd) this.b;
        if (kdVar11 != null) {
            kdVar11.e.setCurrentItem(this.d, false);
        }
        kd kdVar12 = (kd) this.b;
        if (kdVar12 != null) {
            kdVar12.i.setOnClickListener(new View.OnClickListener() { // from class: ppy
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    kd kdVar13;
                    a aVar = this.a;
                    kd kdVar14 = (kd) aVar.b;
                    if (kdVar14 != null) {
                        kdVar14.f.setVisibility(8);
                    }
                    kd kdVar15 = (kd) aVar.b;
                    if (kdVar15 != null) {
                        kdVar15.c.setVisibility(8);
                    }
                    kd kdVar16 = (kd) aVar.b;
                    if (kdVar16 != null) {
                        kdVar16.w.setVisibility(8);
                    }
                    kd kdVar17 = (kd) aVar.b;
                    Integer numValueOf = kdVar17 != null ? Integer.valueOf(kdVar17.e.getCurrentItem()) : null;
                    if (numValueOf == null || numValueOf.intValue() >= aVar.e.length - 1 || (kdVar13 = (kd) aVar.b) == null) {
                        return;
                    }
                    kdVar13.e.setCurrentItem(numValueOf.intValue() + 1);
                }
            });
        }
        kd kdVar13 = (kd) this.b;
        if (kdVar13 != null) {
            kdVar13.w.setOnClickListener(new View.OnClickListener() { // from class: qpy
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ArrayList arrayList2 = new ArrayList();
                    a aVar = this.a;
                    DynamicOnboardingScreenBasicBase[] dynamicOnboardingScreenBasicBaseArr4 = aVar.e;
                    int length3 = dynamicOnboardingScreenBasicBaseArr4.length;
                    for (int i3 = 0; i3 < length3; i3++) {
                        DynamicOnboardingScreenBasicBase dynamicOnboardingScreenBasicBase3 = dynamicOnboardingScreenBasicBaseArr4[i3];
                        arrayList2.add(new OnboardingItem(Integer.valueOf(i3), Boolean.TRUE));
                    }
                    sny.b(aVar.f, arrayList2, aVar.c);
                    wz.a("OnboardingSkip", aVar.c, new String[0]);
                    aVar.v0(Intrinsics.g(view2.getTag(R.string.tag_onboarding_partial_done_button), "PARTIAL_DONE"));
                }
            });
        }
        kd kdVar14 = (kd) this.b;
        if (kdVar14 != null) {
            kdVar14.d.setOnClickListener(new View.OnClickListener() { // from class: rpy
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.a.w0();
                }
            });
        }
        kd kdVar15 = (kd) this.b;
        if (kdVar15 != null) {
            kdVar15.e.c(new c());
        }
    }

    public final boolean p0(int i, String str) {
        if (Intrinsics.g(str, "fruit-hunt")) {
            if (i == (this.A ? 3 : 2)) {
                return true;
            }
        }
        if (Intrinsics.g(str, "sporty-hero")) {
            if (i == (z0() ? 2 : 0)) {
                return true;
            }
        }
        if (Intrinsics.g(str, "pocket-rockets") && i == 0) {
            return true;
        }
        if (Intrinsics.g(str, "ping-pong") && i == 0) {
            return true;
        }
        return Intrinsics.g(str, "sporty-jet") && i == 0;
    }

    public final void q0(int i, int i2) {
        kd kdVar = (kd) this.b;
        ViewGroup.LayoutParams layoutParams = kdVar != null ? kdVar.c.getLayoutParams() : null;
        layoutParams.getClass();
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.S = 0.05f;
        layoutParams2.R = 0.33f;
        layoutParams2.v = 0;
        ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = i;
        ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = i2;
        kd kdVar2 = (kd) this.b;
        if (kdVar2 != null) {
            kdVar2.c.setLayoutParams(layoutParams2);
        }
    }

    public final void r0(double d) {
        int i = (int) (2.0d * d);
        kd kdVar = (kd) this.b;
        ViewGroup.LayoutParams layoutParams = kdVar != null ? kdVar.c.getLayoutParams() : null;
        layoutParams.getClass();
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        ((ViewGroup.MarginLayoutParams) layoutParams2).height = (int) (m7i0.e(this) * 0.053f);
        ((ViewGroup.MarginLayoutParams) layoutParams2).width = -2;
        layoutParams2.v = 0;
        ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = (int) d;
        ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = (int) (1.5d * d);
        kd kdVar2 = (kd) this.b;
        if (kdVar2 != null) {
            kdVar2.c.setLayoutParams(layoutParams2);
        }
        kd kdVar3 = (kd) this.b;
        if (kdVar3 != null) {
            kdVar3.i.setPadding(i, 0, i, 0);
        }
        kd kdVar4 = (kd) this.b;
        if (kdVar4 != null) {
            kdVar4.d.setPadding(i, 0, i, 0);
        }
        kd kdVar5 = (kd) this.b;
        ViewGroup.LayoutParams layoutParams3 = kdVar5 != null ? kdVar5.f.getLayoutParams() : null;
        layoutParams3.getClass();
        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
        ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin = (int) (d * 0.1d);
        kd kdVar6 = (kd) this.b;
        if (kdVar6 != null) {
            kdVar6.f.setLayoutParams(layoutParams4);
        }
    }

    public final void s0() {
        float f;
        float f2;
        Map<String, Float> map = this.z;
        boolean z = map.containsKey("SH_BET_PLACED") && Intrinsics.e(map.get("SH_BET_PLACED"), 1.0f);
        boolean z2 = map.containsKey("SH_BET1_PLACED") && Intrinsics.e(map.get("SH_BET1_PLACED"), 1.0f);
        boolean z3 = map.containsKey("SH_IS_SIDE_BETS_ENABLED") && Intrinsics.e(map.get("SH_IS_SIDE_BETS_ENABLED"), 1.0f);
        kd kdVar = (kd) this.b;
        int height = kdVar != null ? kdVar.e.getHeight() : 0;
        kd kdVar2 = (kd) this.b;
        int width = kdVar2 != null ? kdVar2.e.getWidth() : 0;
        if (height <= 0 || width <= 0) {
            return;
        }
        int i = SHInteractiveOnboardingCashOut.a0;
        float fFloatValue = ((1.0f - SHInteractiveOnboardingCashOut.a.d()[0].floatValue()) + 0.04f) * width;
        if (z) {
            Float f3 = map.get("top_percent");
            float fFloatValue2 = (f3 != null ? f3.floatValue() : 0.0f) + (z3 ? 0.0f : -0.053f);
            Float f4 = map.get("container_height");
            f = 2.0f;
            float f5 = height;
            float f6 = f5 * fFloatValue2;
            float fFloatValue3 = (fFloatValue2 + (f4 != null ? f4.floatValue() : 0.0f)) * f5;
            float f7 = fFloatValue3 - f6;
            f2 = 0.85f;
            float f8 = f7 * 0.85f;
            float f9 = ((f7 - f8) / 2.0f) + (f5 - fFloatValue3);
            kd kdVar3 = (kd) this.b;
            ImageView imageView = kdVar3 != null ? (ImageView) kdVar3.b.findViewById(R.id.image_bet) : null;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            ViewGroup.LayoutParams layoutParams = imageView != null ? imageView.getLayoutParams() : null;
            layoutParams.getClass();
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) layoutParams2).height = (int) f8;
            ((ViewGroup.MarginLayoutParams) layoutParams2).width = -2;
            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = (int) f9;
            ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = (int) fFloatValue;
            imageView.setLayoutParams(layoutParams2);
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.animation_side_hover);
            animationLoadAnimation.getClass();
            imageView.startAnimation(animationLoadAnimation);
        } else {
            f = 2.0f;
            f2 = 0.85f;
        }
        if (z2) {
            Float f10 = map.get("top_percent1");
            float fFloatValue4 = (f10 != null ? f10.floatValue() : 0.0f) + (z3 ? 0.0f : -0.053f);
            Float f11 = map.get("container_height");
            float fFloatValue5 = f11 != null ? f11.floatValue() : 0.0f;
            float f12 = height;
            float f13 = f12 * fFloatValue4;
            float f14 = (fFloatValue4 + fFloatValue5) * f12;
            float f15 = f14 - f13;
            float f16 = f15 * f2;
            float f17 = ((f15 - f16) / f) + (f12 - f14);
            kd kdVar4 = (kd) this.b;
            ImageView imageView2 = kdVar4 != null ? (ImageView) kdVar4.b.findViewById(R.id.image_bet1) : null;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
            ViewGroup.LayoutParams layoutParams3 = imageView2 != null ? imageView2.getLayoutParams() : null;
            layoutParams3.getClass();
            ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
            ((ViewGroup.MarginLayoutParams) layoutParams4).height = (int) f16;
            ((ViewGroup.MarginLayoutParams) layoutParams4).width = -2;
            ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin = (int) f17;
            ((ViewGroup.MarginLayoutParams) layoutParams4).rightMargin = (int) fFloatValue;
            imageView2.setLayoutParams(layoutParams4);
            Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(getContext(), R.anim.animation_side_hover);
            animationLoadAnimation2.getClass();
            imageView2.startAnimation(animationLoadAnimation2);
        }
    }

    public final void t0() {
        Context context;
        Resources resources;
        Context context2;
        Resources resources2;
        kd kdVar = (kd) this.b;
        int height = kdVar != null ? kdVar.e.getHeight() : 0;
        kd kdVar2 = (kd) this.b;
        int width = kdVar2 != null ? kdVar2.e.getWidth() : 0;
        if (height <= 0 || width <= 0) {
            return;
        }
        kd kdVar3 = (kd) this.b;
        int iApplyDimension = (int) TypedValue.applyDimension(1, 45.0f, (kdVar3 == null || (context2 = kdVar3.c.getContext()) == null || (resources2 = context2.getResources()) == null) ? null : resources2.getDisplayMetrics());
        kd kdVar4 = (kd) this.b;
        int iApplyDimension2 = (int) TypedValue.applyDimension(1, 100.0f, (kdVar4 == null || (context = kdVar4.c.getContext()) == null || (resources = context.getResources()) == null) ? null : resources.getDisplayMetrics());
        kd kdVar5 = (kd) this.b;
        ViewGroup.LayoutParams layoutParams = kdVar5 != null ? kdVar5.c.getLayoutParams() : null;
        layoutParams.getClass();
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.S = 0.05f;
        layoutParams2.R = 0.33f;
        layoutParams2.v = 0;
        layoutParams2.l = 0;
        layoutParams2.setMarginEnd(iApplyDimension);
        ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = iApplyDimension2;
        kd kdVar6 = (kd) this.b;
        if (kdVar6 != null) {
            kdVar6.c.setLayoutParams(layoutParams2);
        }
    }

    public final void u0(int i, int i2) {
        kd kdVar = (kd) this.b;
        ViewGroup.LayoutParams layoutParams = kdVar != null ? kdVar.w.getLayoutParams() : null;
        layoutParams.getClass();
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.S = 0.045f;
        layoutParams2.R = 0.2f;
        layoutParams2.t = 0;
        ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = i;
        kd kdVar2 = (kd) this.b;
        if (kdVar2 != null) {
            kdVar2.w.setLayoutParams(layoutParams2);
        }
        kd kdVar3 = (kd) this.b;
        if (kdVar3 != null) {
            kdVar3.w.setGravity(i2);
        }
    }

    public final void v0(boolean z) {
        Fragment parentFragment = getParentFragment();
        if (parentFragment instanceof nn40) {
            Fragment parentFragment2 = getParentFragment();
            parentFragment2.getClass();
            nn40 nn40Var = (nn40) parentFragment2;
            nn40Var.n0 = false;
            xo40 xo40Var = (xo40) nn40Var.b;
            if (xo40Var != null) {
                xo40Var.P.setVisibility(8);
            }
            nn40Var.z0().x1();
            return;
        }
        if (parentFragment instanceof b8b0) {
            Fragment parentFragment3 = getParentFragment();
            parentFragment3.getClass();
            b8b0 b8b0Var = (b8b0) parentFragment3;
            b8b0Var.s0 = false;
            dcb0 dcb0Var = (dcb0) b8b0Var.b;
            if (dcb0Var != null) {
                dcb0Var.J.setVisibility(8);
            }
            b8b0Var.y0().x1();
            return;
        }
        if (parentFragment instanceof l560) {
            Fragment parentFragment4 = getParentFragment();
            parentFragment4.getClass();
            l560 l560Var = (l560) parentFragment4;
            l560Var.s0 = false;
            eo80 eo80Var = l560Var.l0;
            if (eo80Var != null) {
                eo80Var.k0.setVisibility(8);
            }
            l560Var.F0().x1();
            return;
        }
        if (parentFragment instanceof fgg) {
            Fragment parentFragment5 = getParentFragment();
            parentFragment5.getClass();
            fgg fggVar = (fgg) parentFragment5;
            fggVar.x0 = false;
            jhg jhgVar = (jhg) fggVar.b;
            if (jhgVar != null) {
                jhgVar.T.setVisibility(8);
            }
            fggVar.C0().x1();
            jhg jhgVar2 = (jhg) fggVar.b;
            if (jhgVar2 != null) {
                jhgVar2.e.setVisibility(0);
            }
            jhg jhgVar3 = (jhg) fggVar.b;
            if (jhgVar3 != null) {
                jhgVar3.A.setVisibility(4);
            }
            jhg jhgVar4 = (jhg) fggVar.b;
            if (jhgVar4 != null) {
                jhgVar4.C.setVisibility(4);
            }
            jhg jhgVar5 = (jhg) fggVar.b;
            if (jhgVar5 != null) {
                jhgVar5.B.setVisibility(4);
            }
            jhg jhgVar6 = (jhg) fggVar.b;
            if (jhgVar6 != null) {
                jhgVar6.w.setVisibility(0);
            }
            jhg jhgVar7 = (jhg) fggVar.b;
            if (jhgVar7 != null) {
                jhgVar7.z.setVisibility(0);
            }
            jhg jhgVar8 = (jhg) fggVar.b;
            if (jhgVar8 != null) {
                jhgVar8.y.setVisibility(0);
                return;
            }
            return;
        }
        if (parentFragment instanceof q1c0) {
            Fragment parentFragment6 = getParentFragment();
            parentFragment6.getClass();
            q1c0 q1c0Var = (q1c0) parentFragment6;
            q1c0Var.f1 = false;
            w3c0 w3c0Var = (w3c0) q1c0Var.b;
            if (w3c0Var != null) {
                w3c0Var.X.setVisibility(8);
            }
            q1c0Var.y1 = false;
            q1c0Var.a0 = true;
            q1c0Var.n1().x1();
            return;
        }
        if (parentFragment instanceof kab0) {
            Fragment parentFragment7 = getParentFragment();
            parentFragment7.getClass();
            kab0 kab0Var = (kab0) parentFragment7;
            kab0Var.U = false;
            fo80 fo80Var = kab0Var.c;
            if (fo80Var != null) {
                fo80Var.L.setVisibility(8);
            }
            kab0Var.w0().y1();
            kab0Var.z0(true);
            kab0Var.n0();
            return;
        }
        if (parentFragment instanceof u6j) {
            Fragment parentFragment8 = getParentFragment();
            parentFragment8.getClass();
            u6j u6jVar = (u6j) parentFragment8;
            djh djhVar = u6jVar.b;
            if (djhVar != null) {
                djhVar.G.setVisibility(8);
            }
            u6jVar.f0 = false;
            djh djhVar2 = u6jVar.b;
            if (djhVar2 != null) {
                djhVar2.F.setVisibility(8);
            }
            pfd pfdVar = fse.a;
            ej5.c(w5b.a(gku.a), null, null, new i3j(u6jVar, z, null), 3);
            return;
        }
        if (parentFragment instanceof a1b0) {
            Fragment parentFragment9 = getParentFragment();
            parentFragment9.getClass();
            a1b0 a1b0Var = (a1b0) parentFragment9;
            a1b0Var.Z = false;
            wxi wxiVar = a1b0Var.v;
            if (wxiVar != null) {
                wxiVar.K.setVisibility(8);
            }
            a1b0Var.w0().z1();
            a1b0Var.p0();
            return;
        }
        if (parentFragment instanceof zy10) {
            Fragment parentFragment10 = getParentFragment();
            parentFragment10.getClass();
            zy10 zy10Var = (zy10) parentFragment10;
            zy10Var.d = false;
            zt50 zt50Var = zy10Var.b;
            if (zt50Var != null) {
                zt50Var.P.setVisibility(8);
            }
            zy10Var.b1().x1();
            zt50 zt50Var2 = zy10Var.b;
            if (zt50Var2 != null) {
                zt50Var2.K.setVisibility(0);
            }
            zt50 zt50Var3 = zy10Var.b;
            if (zt50Var3 != null) {
                zt50Var3.V.setVisibility(8);
                return;
            }
            return;
        }
        if (parentFragment instanceof m410) {
            Fragment parentFragment11 = getParentFragment();
            parentFragment11.getClass();
            m410 m410Var = (m410) parentFragment11;
            m410Var.K0 = false;
            ixi ixiVar = (ixi) m410Var.b;
            if (ixiVar != null) {
                ixiVar.Q.setVisibility(8);
            }
            pfd pfdVar2 = fse.a;
            ej5.c(w5b.a(gku.a), null, null, new e510(m410Var, null), 3);
            return;
        }
        if (parentFragment instanceof x7c0) {
            Fragment parentFragment12 = getParentFragment();
            parentFragment12.getClass();
            x7c0 x7c0Var = (x7c0) parentFragment12;
            x7c0Var.l0 = false;
            gvi gviVar = x7c0Var.z;
            if (gviVar != null) {
                gviVar.X.setVisibility(8);
            }
            if (x7c0Var.D1) {
                ((x5a0) x7c0Var.m1).setValue(Boolean.TRUE);
            }
            pfd pfdVar3 = fse.a;
            ej5.c(w5b.a(gku.a), null, null, new ygb(x7c0Var, null), 3);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void w0() {
        boolean zG;
        boolean z = false;
        Integer numValueOf = 0;
        Context context = getContext();
        if (context != null) {
            if (Intrinsics.g(this.c, "sporty-hero") || Intrinsics.g(this.c, "fruit-hunt") || Intrinsics.g(this.c, "pocket-rockets") || Intrinsics.g(this.c, "ping-pong") || Intrinsics.g(this.c, "sporty-jet")) {
                kd kdVar = (kd) this.b;
                zG = Intrinsics.g(kdVar != null ? kdVar.d.getTag(R.string.tag_onboarding_partial_done_button) : null, "PARTIAL_DONE");
                if (zG) {
                    String str = this.c;
                    switch (str.hashCode()) {
                        case -1790437656:
                            if (!str.equals("pocket-rockets")) {
                                numValueOf = null;
                            }
                            break;
                        case -424980621:
                            if (!str.equals("ping-pong")) {
                                numValueOf = null;
                            }
                            break;
                        case 13143121:
                            if (!str.equals("sporty-jet")) {
                                numValueOf = null;
                            }
                            break;
                        case 407377218:
                            numValueOf = !str.equals("sporty-hero") ? null : Integer.valueOf(z0() ? 2 : 0);
                            break;
                        case 1353819564:
                            numValueOf = !str.equals("fruit-hunt") ? null : Integer.valueOf(this.A ? 3 : 2);
                            break;
                        default:
                            numValueOf = null;
                            break;
                    }
                } else {
                    numValueOf = Integer.valueOf(this.e.length - 1);
                }
            } else {
                numValueOf = Integer.valueOf(this.e.length - 1);
                zG = false;
            }
            if (numValueOf != null) {
                sny.c(context, this.f, numValueOf.intValue(), this.c);
                if (Intrinsics.g(this.c, "sporty-hero") && zG && numValueOf.intValue() == 0) {
                    sny.c(context, this.f, numValueOf.intValue() + 1, this.c);
                    sny.c(context, this.f, numValueOf.intValue() + 2, this.c);
                }
            }
            if (!zG) {
                wz.a("OnboardingDone", this.c, new String[0]);
            }
            z = zG;
        }
        v0(z);
    }

    /* JADX WARN: Code duplicated, block: B:112:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:113:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:116:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:118:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:124:0x0223  */
    /* JADX WARN: Code duplicated, block: B:126:0x0227  */
    /* JADX WARN: Code duplicated, block: B:128:0x022b  */
    /* JADX WARN: Code duplicated, block: B:129:0x022d  */
    /* JADX WARN: Code duplicated, block: B:257:0x059e  */
    /* JADX WARN: Code duplicated, block: B:260:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:261:0x05ac  */
    /* JADX WARN: Code duplicated, block: B:264:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:265:0x05ba  */
    /* JADX WARN: Code duplicated, block: B:271:0x05d9  */
    /* JADX WARN: Code duplicated, block: B:273:0x0603  */
    /* JADX WARN: Code duplicated, block: B:274:0x060f  */
    /* JADX WARN: Code duplicated, block: B:276:0x0612  */
    /* JADX WARN: Code duplicated, block: B:278:0x0618  */
    /* JADX WARN: Code duplicated, block: B:279:0x061d  */
    /* JADX WARN: Code duplicated, block: B:282:0x0645  */
    /* JADX WARN: Code duplicated, block: B:284:0x0671  */
    /* JADX WARN: Code duplicated, block: B:285:0x067d  */
    /* JADX WARN: Code duplicated, block: B:287:0x0680  */
    /* JADX WARN: Code duplicated, block: B:289:0x0686  */
    /* JADX WARN: Code duplicated, block: B:290:0x068b  */
    /* JADX WARN: Code duplicated, block: B:365:0x090b  */
    /* JADX WARN: Code duplicated, block: B:368:0x0912  */
    /* JADX WARN: Code duplicated, block: B:369:0x0919  */
    /* JADX WARN: Code duplicated, block: B:372:0x0920  */
    /* JADX WARN: Code duplicated, block: B:373:0x0927  */
    /* JADX WARN: Code duplicated, block: B:379:0x0946  */
    /* JADX WARN: Code duplicated, block: B:381:0x0978  */
    /* JADX WARN: Code duplicated, block: B:382:0x0984  */
    /* JADX WARN: Code duplicated, block: B:384:0x0987  */
    /* JADX WARN: Code duplicated, block: B:386:0x098d  */
    /* JADX WARN: Code duplicated, block: B:387:0x0992  */
    /* JADX WARN: Code duplicated, block: B:390:0x09ba  */
    /* JADX WARN: Code duplicated, block: B:392:0x09ea  */
    /* JADX WARN: Code duplicated, block: B:393:0x09f6  */
    /* JADX WARN: Code duplicated, block: B:395:0x09f9  */
    /* JADX WARN: Code duplicated, block: B:397:0x09ff  */
    /* JADX WARN: Code duplicated, block: B:398:0x0a04  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void y0(int i) {
        kd kdVar;
        kd kdVar2;
        kd kdVar3;
        float f;
        boolean z;
        boolean z2;
        kd kdVar4;
        int height;
        kd kdVar5;
        int width;
        float fFloatValue;
        kd kdVar6;
        ImageView imageView;
        ViewGroup.LayoutParams layoutParams;
        kd kdVar7;
        ImageView imageView2;
        ViewGroup.LayoutParams layoutParams2;
        kd kdVar8;
        float f2;
        boolean z3;
        boolean z4;
        kd kdVar9;
        int height2;
        kd kdVar10;
        int width2;
        float fFloatValue2;
        kd kdVar11;
        ImageView imageView3;
        ViewGroup.LayoutParams layoutParams3;
        kd kdVar12;
        ImageView imageView4;
        ViewGroup.LayoutParams layoutParams4;
        kd kdVar13;
        kd kdVar14;
        TabLayout.g gVarK;
        TabLayout.TabView tabView;
        TabLayout.g gVarK2;
        TabLayout.TabView tabView2;
        kd kdVar15;
        boolean z5;
        int i2;
        B b2;
        kd kdVar16;
        int i3;
        TabLayout.g gVarK3;
        TabLayout.TabView tabView3;
        kd kdVar17;
        Context context;
        kd kdVar18;
        kd kdVar19 = (kd) this.b;
        if (kdVar19 != null) {
            kdVar19.f.setVisibility(0);
        }
        boolean zP0 = p0(i, this.c);
        if (i == this.e.length - 1 || zP0) {
            kd kdVar20 = (kd) this.b;
            if (kdVar20 != null) {
                kdVar20.d.setVisibility(0);
            }
            kd kdVar21 = (kd) this.b;
            if (kdVar21 != null) {
                kdVar21.i.setVisibility(8);
            }
            kd kdVar22 = (kd) this.b;
            if (kdVar22 != null) {
                kdVar22.w.setVisibility(8);
            }
            if (zP0 && (kdVar = (kd) this.b) != null) {
                kdVar.d.setTag(R.string.tag_onboarding_partial_done_button, "PARTIAL_DONE");
            }
            if (Intrinsics.g(this.c, "fruit-hunt")) {
                r0(((double) m7i0.f(this)) * 0.025d);
            }
            if (Intrinsics.g(this.c, "sporty-hero") && !zP0) {
                kd kdVar23 = (kd) this.b;
                if (kdVar23 != null) {
                    kdVar23.d.setVisibility(8);
                }
                kd kdVar24 = (kd) this.b;
                if (kdVar24 != null) {
                    kdVar24.f.setVisibility(8);
                }
            }
            if (Intrinsics.g(this.c, "pocket-rockets") && !zP0) {
                kd kdVar25 = (kd) this.b;
                if (kdVar25 != null) {
                    kdVar25.d.setVisibility(8);
                }
                kd kdVar26 = (kd) this.b;
                if (kdVar26 != null) {
                    kdVar26.f.setVisibility(8);
                }
            }
            if (Intrinsics.g(this.c, "ping-pong") && !zP0) {
                kd kdVar27 = (kd) this.b;
                if (kdVar27 != null) {
                    kdVar27.d.setVisibility(8);
                }
                kd kdVar28 = (kd) this.b;
                if (kdVar28 != null) {
                    kdVar28.f.setVisibility(8);
                }
            }
            if (Intrinsics.g(this.c, "sporty-jet") && !zP0) {
                kd kdVar29 = (kd) this.b;
                if (kdVar29 != null) {
                    kdVar29.d.setVisibility(8);
                }
                kd kdVar30 = (kd) this.b;
                if (kdVar30 != null) {
                    kdVar30.f.setVisibility(8);
                }
            }
        } else {
            kd kdVar31 = (kd) this.b;
            if (kdVar31 != null) {
                kdVar31.i.setVisibility(0);
            }
            kd kdVar32 = (kd) this.b;
            if (kdVar32 != null) {
                kdVar32.w.setVisibility(0);
            }
            kd kdVar33 = (kd) this.b;
            if (kdVar33 != null) {
                kdVar33.d.setVisibility(8);
            }
        }
        String str = this.c;
        switch (str.hashCode()) {
            case -1790437656:
                if (str.equals("pocket-rockets")) {
                    C0(i);
                    boolean zG = Intrinsics.g(this.c, "pocket-rockets");
                    B b3 = this.b;
                    if (!zG) {
                        kd kdVar34 = (kd) b3;
                        if (kdVar34 != null) {
                            kdVar34.d.setVisibility(0);
                        }
                    } else {
                        kd kdVar35 = (kd) b3;
                        if (kdVar35 != null) {
                            kdVar35.f.setVisibility(8);
                        }
                    }
                }
                break;
            case -424980621:
                if (str.equals("ping-pong")) {
                    if (i == 0) {
                        int dimension = (int) getResources().getDimension(R.dimen._8sdp);
                        kd kdVar36 = (kd) this.b;
                        int height3 = kdVar36 != null ? kdVar36.e.getHeight() : 0;
                        kd kdVar37 = (kd) this.b;
                        int width3 = kdVar37 != null ? kdVar37.e.getWidth() : 0;
                        if (height3 > 0 && width3 > 0) {
                            float f3 = height3;
                            int i4 = PPInteractiveOnboardingCashOut.a0;
                            float fFloatValue3 = (1.0f - PPInteractiveOnboardingCashOut.a.a()[1].floatValue()) * f3;
                            kd kdVar38 = (kd) this.b;
                            ViewGroup.LayoutParams layoutParams5 = kdVar38 != null ? kdVar38.c.getLayoutParams() : null;
                            layoutParams5.getClass();
                            ConstraintLayout.LayoutParams layoutParams6 = (ConstraintLayout.LayoutParams) layoutParams5;
                            layoutParams6.S = 0.05f;
                            layoutParams6.R = 0.33f;
                            layoutParams6.v = 0;
                            ((ViewGroup.MarginLayoutParams) layoutParams6).bottomMargin = (int) ((f3 - fFloatValue3) - (f3 * 0.07f));
                            ((ViewGroup.MarginLayoutParams) layoutParams6).rightMargin = dimension;
                            kd kdVar39 = (kd) this.b;
                            if (kdVar39 != null) {
                                kdVar39.c.setLayoutParams(layoutParams6);
                            }
                        }
                        Context context2 = getContext();
                        if (context2 != null && (kdVar3 = (kd) this.b) != null) {
                            TextView textView = kdVar3.d;
                            op5 op5Var = op5.a;
                            String string = context2.getResources().getString(R.string.on_board_got_it_cms);
                            string.getClass();
                            String string2 = context2.getResources().getString(R.string.got_it_txt);
                            string2.getClass();
                            op5Var.getClass();
                            textView.setText(op5.b(string, string2, null));
                        }
                    } else if (i == 1) {
                        Map<String, Float> map = this.z;
                        if (map.containsKey("PP_BET_PLACED")) {
                            f = 1.0f;
                            z = Intrinsics.e(map.get("PP_BET_PLACED"), 1.0f);
                            if (map.containsKey("PP_BET1_PLACED") || !Intrinsics.e(map.get("PP_BET1_PLACED"), f)) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            kdVar4 = (kd) this.b;
                            if (kdVar4 != null) {
                                height = kdVar4.e.getHeight();
                            } else {
                                height = 0;
                            }
                            kdVar5 = (kd) this.b;
                            if (kdVar5 != null) {
                                width = kdVar5.e.getWidth();
                            } else {
                                width = 0;
                            }
                            if (height > 0 && width > 0) {
                                int i5 = PPInteractiveOnboardingCashOut.a0;
                                fFloatValue = ((1.0f - PPInteractiveOnboardingCashOut.a.c()[0].floatValue()) + 0.06f) * width;
                                if (z) {
                                    float f4 = height;
                                    float fFloatValue4 = (PPInteractiveOnboardingCashOut.a.a()[0].floatValue() - 0.035f) * f4;
                                    float fFloatValue5 = (1.0f - (PPInteractiveOnboardingCashOut.a.a()[1].floatValue() + 0.02f)) * f4;
                                    float f5 = fFloatValue5 - fFloatValue4;
                                    float f6 = f5 * 0.58f;
                                    float f7 = ((f5 - f6) / 2.0f) + (f4 - fFloatValue5);
                                    kdVar7 = (kd) this.b;
                                    if (kdVar7 != null) {
                                        imageView2 = (ImageView) kdVar7.b.findViewById(R.id.image_bet);
                                    } else {
                                        imageView2 = null;
                                    }
                                    if (imageView2 != null) {
                                        imageView2.setVisibility(0);
                                    }
                                    if (imageView2 != null) {
                                        layoutParams2 = imageView2.getLayoutParams();
                                    } else {
                                        layoutParams2 = null;
                                    }
                                    layoutParams2.getClass();
                                    ConstraintLayout.LayoutParams layoutParams7 = (ConstraintLayout.LayoutParams) layoutParams2;
                                    ((ViewGroup.MarginLayoutParams) layoutParams7).height = (int) f6;
                                    ((ViewGroup.MarginLayoutParams) layoutParams7).width = -2;
                                    ((ViewGroup.MarginLayoutParams) layoutParams7).bottomMargin = (int) f7;
                                    ((ViewGroup.MarginLayoutParams) layoutParams7).rightMargin = (int) fFloatValue;
                                    imageView2.setLayoutParams(layoutParams7);
                                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.animation_side_hover);
                                    animationLoadAnimation.getClass();
                                    imageView2.startAnimation(animationLoadAnimation);
                                }
                                if (z2) {
                                    float f8 = height;
                                    float fFloatValue6 = (PPInteractiveOnboardingCashOut.a.b()[0].floatValue() - 0.016f) * f8;
                                    float fFloatValue7 = (1.0f - PPInteractiveOnboardingCashOut.a.b()[1].floatValue()) * f8;
                                    float f9 = fFloatValue7 - fFloatValue6;
                                    float f10 = f9 * 0.58f;
                                    float f11 = ((f9 - f10) / 2.0f) + (f8 - fFloatValue7);
                                    kdVar6 = (kd) this.b;
                                    if (kdVar6 != null) {
                                        imageView = (ImageView) kdVar6.b.findViewById(R.id.image_bet1);
                                    } else {
                                        imageView = null;
                                    }
                                    if (imageView != null) {
                                        imageView.setVisibility(0);
                                    }
                                    if (imageView != null) {
                                        layoutParams = imageView.getLayoutParams();
                                    } else {
                                        layoutParams = null;
                                    }
                                    layoutParams.getClass();
                                    ConstraintLayout.LayoutParams layoutParams8 = (ConstraintLayout.LayoutParams) layoutParams;
                                    ((ViewGroup.MarginLayoutParams) layoutParams8).height = (int) f10;
                                    ((ViewGroup.MarginLayoutParams) layoutParams8).width = -2;
                                    ((ViewGroup.MarginLayoutParams) layoutParams8).bottomMargin = (int) f11;
                                    ((ViewGroup.MarginLayoutParams) layoutParams8).rightMargin = (int) fFloatValue;
                                    imageView.setLayoutParams(layoutParams8);
                                    Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(getContext(), R.anim.animation_side_hover);
                                    animationLoadAnimation2.getClass();
                                    imageView.startAnimation(animationLoadAnimation2);
                                }
                            }
                        } else {
                            f = 1.0f;
                        }
                        if (map.containsKey("PP_BET1_PLACED")) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        kdVar4 = (kd) this.b;
                        if (kdVar4 != null) {
                            height = kdVar4.e.getHeight();
                        } else {
                            height = 0;
                        }
                        kdVar5 = (kd) this.b;
                        if (kdVar5 != null) {
                            width = kdVar5.e.getWidth();
                        } else {
                            width = 0;
                        }
                        if (height > 0) {
                            int i6 = PPInteractiveOnboardingCashOut.a0;
                            fFloatValue = ((1.0f - PPInteractiveOnboardingCashOut.a.c()[0].floatValue()) + 0.06f) * width;
                            if (z) {
                                float f12 = height;
                                float fFloatValue8 = (PPInteractiveOnboardingCashOut.a.a()[0].floatValue() - 0.035f) * f12;
                                float fFloatValue9 = (1.0f - (PPInteractiveOnboardingCashOut.a.a()[1].floatValue() + 0.02f)) * f12;
                                float f13 = fFloatValue9 - fFloatValue8;
                                float f14 = f13 * 0.58f;
                                float f15 = ((f13 - f14) / 2.0f) + (f12 - fFloatValue9);
                                kdVar7 = (kd) this.b;
                                if (kdVar7 != null) {
                                    imageView2 = (ImageView) kdVar7.b.findViewById(R.id.image_bet);
                                } else {
                                    imageView2 = null;
                                }
                                if (imageView2 != null) {
                                    imageView2.setVisibility(0);
                                }
                                if (imageView2 != null) {
                                    layoutParams2 = imageView2.getLayoutParams();
                                } else {
                                    layoutParams2 = null;
                                }
                                layoutParams2.getClass();
                                ConstraintLayout.LayoutParams layoutParams9 = (ConstraintLayout.LayoutParams) layoutParams2;
                                ((ViewGroup.MarginLayoutParams) layoutParams9).height = (int) f14;
                                ((ViewGroup.MarginLayoutParams) layoutParams9).width = -2;
                                ((ViewGroup.MarginLayoutParams) layoutParams9).bottomMargin = (int) f15;
                                ((ViewGroup.MarginLayoutParams) layoutParams9).rightMargin = (int) fFloatValue;
                                imageView2.setLayoutParams(layoutParams9);
                                Animation animationLoadAnimation3 = AnimationUtils.loadAnimation(getContext(), R.anim.animation_side_hover);
                                animationLoadAnimation3.getClass();
                                imageView2.startAnimation(animationLoadAnimation3);
                            }
                            if (z2) {
                                float f16 = height;
                                float fFloatValue10 = (PPInteractiveOnboardingCashOut.a.b()[0].floatValue() - 0.016f) * f16;
                                float fFloatValue11 = (1.0f - PPInteractiveOnboardingCashOut.a.b()[1].floatValue()) * f16;
                                float f17 = fFloatValue11 - fFloatValue10;
                                float f18 = f17 * 0.58f;
                                float f19 = ((f17 - f18) / 2.0f) + (f16 - fFloatValue11);
                                kdVar6 = (kd) this.b;
                                if (kdVar6 != null) {
                                    imageView = (ImageView) kdVar6.b.findViewById(R.id.image_bet1);
                                } else {
                                    imageView = null;
                                }
                                if (imageView != null) {
                                    imageView.setVisibility(0);
                                }
                                if (imageView != null) {
                                    layoutParams = imageView.getLayoutParams();
                                } else {
                                    layoutParams = null;
                                }
                                layoutParams.getClass();
                                ConstraintLayout.LayoutParams layoutParams10 = (ConstraintLayout.LayoutParams) layoutParams;
                                ((ViewGroup.MarginLayoutParams) layoutParams10).height = (int) f18;
                                ((ViewGroup.MarginLayoutParams) layoutParams10).width = -2;
                                ((ViewGroup.MarginLayoutParams) layoutParams10).bottomMargin = (int) f19;
                                ((ViewGroup.MarginLayoutParams) layoutParams10).rightMargin = (int) fFloatValue;
                                imageView.setLayoutParams(layoutParams10);
                                Animation animationLoadAnimation4 = AnimationUtils.loadAnimation(getContext(), R.anim.animation_side_hover);
                                animationLoadAnimation4.getClass();
                                imageView.startAnimation(animationLoadAnimation4);
                            }
                        }
                    }
                    boolean zG2 = Intrinsics.g(this.c, "ping-pong");
                    B b4 = this.b;
                    if (!zG2) {
                        kd kdVar40 = (kd) b4;
                        if (kdVar40 != null) {
                            kdVar40.d.setVisibility(0);
                        }
                    } else {
                        kd kdVar41 = (kd) b4;
                        if (kdVar41 != null) {
                            kdVar41.f.setVisibility(8);
                        }
                    }
                }
                break;
            case -23008317:
                if (str.equals("red-black")) {
                    if (i == 0) {
                        q0((int) getResources().getDimension(R.dimen._16sdp), (int) getResources().getDimension(R.dimen._8sdp));
                        u0((int) getResources().getDimension(R.dimen._16sdp), 16);
                    } else if (i == 1) {
                        q0((int) getResources().getDimension(R.dimen._235sdp), (int) getResources().getDimension(R.dimen._8sdp));
                        u0((int) getResources().getDimension(R.dimen._235sdp), 80);
                    } else if (i == 2) {
                        q0((int) getResources().getDimension(R.dimen._8sdp), (int) getResources().getDimension(R.dimen._8sdp));
                    }
                }
                break;
            case 3512280:
                if (str.equals("rush")) {
                    if (i == 0 || i == 1) {
                        q0((int) getResources().getDimension(R.dimen._12sdp), (int) getResources().getDimension(R.dimen._12sdp));
                        u0((int) getResources().getDimension(R.dimen._12sdp), 16);
                    } else if (i == 2 || i == 3) {
                        q0((int) getResources().getDimension(R.dimen._248sdp), (int) getResources().getDimension(R.dimen._12sdp));
                        u0((int) getResources().getDimension(R.dimen._248sdp), 16);
                    } else {
                        q0((int) getResources().getDimension(R.dimen._12sdp), (int) getResources().getDimension(R.dimen._12sdp));
                        u0((int) getResources().getDimension(R.dimen._80sdp), 16);
                    }
                }
                break;
            case 13143121:
                if (str.equals("sporty-jet")) {
                    if (i == 0) {
                        int dimension2 = (int) getResources().getDimension(R.dimen._8sdp);
                        kd kdVar42 = (kd) this.b;
                        int height4 = kdVar42 != null ? kdVar42.e.getHeight() : 0;
                        kd kdVar43 = (kd) this.b;
                        int width4 = kdVar43 != null ? kdVar43.e.getWidth() : 0;
                        if (height4 > 0 && width4 > 0) {
                            float f20 = height4;
                            int i7 = SJInteractiveOnboardingCashOut.a0;
                            float fFloatValue12 = (1.0f - (SJInteractiveOnboardingCashOut.a.a()[1].floatValue() - 0.043f)) * f20;
                            kd kdVar44 = (kd) this.b;
                            ViewGroup.LayoutParams layoutParams11 = kdVar44 != null ? kdVar44.c.getLayoutParams() : null;
                            layoutParams11.getClass();
                            ConstraintLayout.LayoutParams layoutParams12 = (ConstraintLayout.LayoutParams) layoutParams11;
                            layoutParams12.S = 0.05f;
                            layoutParams12.R = 0.33f;
                            layoutParams12.v = 0;
                            ((ViewGroup.MarginLayoutParams) layoutParams12).bottomMargin = (int) ((f20 - fFloatValue12) - (f20 * 0.0325f));
                            ((ViewGroup.MarginLayoutParams) layoutParams12).rightMargin = dimension2;
                            kd kdVar45 = (kd) this.b;
                            if (kdVar45 != null) {
                                kdVar45.c.setLayoutParams(layoutParams12);
                            }
                        }
                        Context context3 = getContext();
                        if (context3 != null && (kdVar8 = (kd) this.b) != null) {
                            TextView textView2 = kdVar8.d;
                            op5 op5Var2 = op5.a;
                            String string3 = context3.getResources().getString(R.string.on_board_got_it_cms);
                            string3.getClass();
                            String string4 = context3.getResources().getString(R.string.got_it_txt);
                            string4.getClass();
                            op5Var2.getClass();
                            textView2.setText(op5.b(string3, string4, null));
                        }
                    } else if (i == 1) {
                        Map<String, Float> map2 = this.z;
                        if (map2.containsKey("SJ_BET_PLACED")) {
                            f2 = 1.0f;
                            z3 = Intrinsics.e(map2.get("SJ_BET_PLACED"), 1.0f);
                            if (map2.containsKey("SJ_BET1_PLACED") || !Intrinsics.e(map2.get("SJ_BET1_PLACED"), f2)) {
                                z4 = false;
                            } else {
                                z4 = true;
                            }
                            kdVar9 = (kd) this.b;
                            if (kdVar9 != null) {
                                height2 = kdVar9.e.getHeight();
                            } else {
                                height2 = 0;
                            }
                            kdVar10 = (kd) this.b;
                            if (kdVar10 != null) {
                                width2 = kdVar10.e.getWidth();
                            } else {
                                width2 = 0;
                            }
                            if (height2 > 0 && width2 > 0) {
                                int i8 = SJInteractiveOnboardingCashOut.a0;
                                fFloatValue2 = ((1.0f - SJInteractiveOnboardingCashOut.a.c()[0].floatValue()) + 0.06f) * width2;
                                if (z3) {
                                    float f21 = height2;
                                    float fFloatValue13 = SJInteractiveOnboardingCashOut.a.a()[0].floatValue() * f21;
                                    float fFloatValue14 = (1.0f - SJInteractiveOnboardingCashOut.a.a()[1].floatValue()) * f21;
                                    float f22 = fFloatValue14 - fFloatValue13;
                                    float f23 = f22 * 0.58f;
                                    float f24 = ((f22 - f23) / 2.0f) + (f21 - fFloatValue14);
                                    kdVar12 = (kd) this.b;
                                    if (kdVar12 != null) {
                                        imageView4 = (ImageView) kdVar12.b.findViewById(R.id.image_bet);
                                    } else {
                                        imageView4 = null;
                                    }
                                    if (imageView4 != null) {
                                        imageView4.setVisibility(0);
                                    }
                                    if (imageView4 != null) {
                                        layoutParams4 = imageView4.getLayoutParams();
                                    } else {
                                        layoutParams4 = null;
                                    }
                                    layoutParams4.getClass();
                                    ConstraintLayout.LayoutParams layoutParams13 = (ConstraintLayout.LayoutParams) layoutParams4;
                                    ((ViewGroup.MarginLayoutParams) layoutParams13).height = (int) f23;
                                    ((ViewGroup.MarginLayoutParams) layoutParams13).width = -2;
                                    ((ViewGroup.MarginLayoutParams) layoutParams13).bottomMargin = (int) f24;
                                    ((ViewGroup.MarginLayoutParams) layoutParams13).rightMargin = (int) fFloatValue2;
                                    imageView4.setLayoutParams(layoutParams13);
                                    Animation animationLoadAnimation5 = AnimationUtils.loadAnimation(getContext(), R.anim.animation_side_hover);
                                    animationLoadAnimation5.getClass();
                                    imageView4.startAnimation(animationLoadAnimation5);
                                }
                                if (z4) {
                                    float f25 = height2;
                                    float fFloatValue15 = SJInteractiveOnboardingCashOut.a.b()[0].floatValue() * f25;
                                    float fFloatValue16 = (1.0f - SJInteractiveOnboardingCashOut.a.b()[1].floatValue()) * f25;
                                    float f26 = fFloatValue16 - fFloatValue15;
                                    float f27 = f26 * 0.58f;
                                    float f28 = ((f26 - f27) / 2.0f) + (f25 - fFloatValue16);
                                    kdVar11 = (kd) this.b;
                                    if (kdVar11 != null) {
                                        imageView3 = (ImageView) kdVar11.b.findViewById(R.id.image_bet1);
                                    } else {
                                        imageView3 = null;
                                    }
                                    if (imageView3 != null) {
                                        imageView3.setVisibility(0);
                                    }
                                    if (imageView3 != null) {
                                        layoutParams3 = imageView3.getLayoutParams();
                                    } else {
                                        layoutParams3 = null;
                                    }
                                    layoutParams3.getClass();
                                    ConstraintLayout.LayoutParams layoutParams14 = (ConstraintLayout.LayoutParams) layoutParams3;
                                    ((ViewGroup.MarginLayoutParams) layoutParams14).height = (int) f27;
                                    ((ViewGroup.MarginLayoutParams) layoutParams14).width = -2;
                                    ((ViewGroup.MarginLayoutParams) layoutParams14).bottomMargin = (int) f28;
                                    ((ViewGroup.MarginLayoutParams) layoutParams14).rightMargin = (int) fFloatValue2;
                                    imageView3.setLayoutParams(layoutParams14);
                                    Animation animationLoadAnimation6 = AnimationUtils.loadAnimation(getContext(), R.anim.animation_side_hover);
                                    animationLoadAnimation6.getClass();
                                    imageView3.startAnimation(animationLoadAnimation6);
                                }
                            }
                        } else {
                            f2 = 1.0f;
                        }
                        if (map2.containsKey("SJ_BET1_PLACED")) {
                            z4 = false;
                        } else {
                            z4 = false;
                        }
                        kdVar9 = (kd) this.b;
                        if (kdVar9 != null) {
                            height2 = kdVar9.e.getHeight();
                        } else {
                            height2 = 0;
                        }
                        kdVar10 = (kd) this.b;
                        if (kdVar10 != null) {
                            width2 = kdVar10.e.getWidth();
                        } else {
                            width2 = 0;
                        }
                        if (height2 > 0) {
                            int i9 = SJInteractiveOnboardingCashOut.a0;
                            fFloatValue2 = ((1.0f - SJInteractiveOnboardingCashOut.a.c()[0].floatValue()) + 0.06f) * width2;
                            if (z3) {
                                float f29 = height2;
                                float fFloatValue17 = SJInteractiveOnboardingCashOut.a.a()[0].floatValue() * f29;
                                float fFloatValue18 = (1.0f - SJInteractiveOnboardingCashOut.a.a()[1].floatValue()) * f29;
                                float f210 = fFloatValue18 - fFloatValue17;
                                float f211 = f210 * 0.58f;
                                float f212 = ((f210 - f211) / 2.0f) + (f29 - fFloatValue18);
                                kdVar12 = (kd) this.b;
                                if (kdVar12 != null) {
                                    imageView4 = (ImageView) kdVar12.b.findViewById(R.id.image_bet);
                                } else {
                                    imageView4 = null;
                                }
                                if (imageView4 != null) {
                                    imageView4.setVisibility(0);
                                }
                                if (imageView4 != null) {
                                    layoutParams4 = imageView4.getLayoutParams();
                                } else {
                                    layoutParams4 = null;
                                }
                                layoutParams4.getClass();
                                ConstraintLayout.LayoutParams layoutParams15 = (ConstraintLayout.LayoutParams) layoutParams4;
                                ((ViewGroup.MarginLayoutParams) layoutParams15).height = (int) f211;
                                ((ViewGroup.MarginLayoutParams) layoutParams15).width = -2;
                                ((ViewGroup.MarginLayoutParams) layoutParams15).bottomMargin = (int) f212;
                                ((ViewGroup.MarginLayoutParams) layoutParams15).rightMargin = (int) fFloatValue2;
                                imageView4.setLayoutParams(layoutParams15);
                                Animation animationLoadAnimation7 = AnimationUtils.loadAnimation(getContext(), R.anim.animation_side_hover);
                                animationLoadAnimation7.getClass();
                                imageView4.startAnimation(animationLoadAnimation7);
                            }
                            if (z4) {
                                float f213 = height2;
                                float fFloatValue19 = SJInteractiveOnboardingCashOut.a.b()[0].floatValue() * f213;
                                float fFloatValue110 = (1.0f - SJInteractiveOnboardingCashOut.a.b()[1].floatValue()) * f213;
                                float f214 = fFloatValue110 - fFloatValue19;
                                float f215 = f214 * 0.58f;
                                float f216 = ((f214 - f215) / 2.0f) + (f213 - fFloatValue110);
                                kdVar11 = (kd) this.b;
                                if (kdVar11 != null) {
                                    imageView3 = (ImageView) kdVar11.b.findViewById(R.id.image_bet1);
                                } else {
                                    imageView3 = null;
                                }
                                if (imageView3 != null) {
                                    imageView3.setVisibility(0);
                                }
                                if (imageView3 != null) {
                                    layoutParams3 = imageView3.getLayoutParams();
                                } else {
                                    layoutParams3 = null;
                                }
                                layoutParams3.getClass();
                                ConstraintLayout.LayoutParams layoutParams16 = (ConstraintLayout.LayoutParams) layoutParams3;
                                ((ViewGroup.MarginLayoutParams) layoutParams16).height = (int) f215;
                                ((ViewGroup.MarginLayoutParams) layoutParams16).width = -2;
                                ((ViewGroup.MarginLayoutParams) layoutParams16).bottomMargin = (int) f216;
                                ((ViewGroup.MarginLayoutParams) layoutParams16).rightMargin = (int) fFloatValue2;
                                imageView3.setLayoutParams(layoutParams16);
                                Animation animationLoadAnimation8 = AnimationUtils.loadAnimation(getContext(), R.anim.animation_side_hover);
                                animationLoadAnimation8.getClass();
                                imageView3.startAnimation(animationLoadAnimation8);
                            }
                        }
                    }
                    boolean zG3 = Intrinsics.g(this.c, "sporty-jet");
                    B b5 = this.b;
                    if (!zG3) {
                        kd kdVar46 = (kd) b5;
                        if (kdVar46 != null) {
                            kdVar46.d.setVisibility(0);
                        }
                    } else {
                        kd kdVar47 = (kd) b5;
                        if (kdVar47 != null) {
                            kdVar47.f.setVisibility(8);
                        }
                    }
                }
                break;
            case 276018684:
                if (str.equals("even-odd")) {
                    if (i == 0) {
                        q0((int) getResources().getDimension(R.dimen._16sdp), (int) getResources().getDimension(R.dimen._8sdp));
                        u0((int) getResources().getDimension(R.dimen._16sdp), 16);
                    } else if (i == 1) {
                        q0((int) getResources().getDimension(R.dimen._235sdp), (int) getResources().getDimension(R.dimen._8sdp));
                        u0((int) getResources().getDimension(R.dimen._235sdp), 80);
                    } else if (i == 2) {
                        q0((int) getResources().getDimension(R.dimen._8sdp), (int) getResources().getDimension(R.dimen._8sdp));
                    }
                }
                break;
            case 407377218:
                if (str.equals("sporty-hero")) {
                    if (z0()) {
                        if (i == 0 || i == 1) {
                            getResources().getDimension(R.dimen._8sdp);
                            t0();
                        } else if (i == 2) {
                            getResources().getDimension(R.dimen._8sdp);
                            t0();
                            Context context4 = getContext();
                            if (context4 != null && (kdVar15 = (kd) this.b) != null) {
                                TextView textView3 = kdVar15.d;
                                op5 op5Var3 = op5.a;
                                String string5 = context4.getResources().getString(R.string.on_board_got_it_cms);
                                string5.getClass();
                                String string6 = context4.getResources().getString(R.string.got_it_txt);
                                string6.getClass();
                                op5Var3.getClass();
                                textView3.setText(op5.b(string5, string6, null));
                            }
                        } else if (i == 3) {
                            s0();
                        }
                    } else if (i == 0) {
                        getResources().getDimension(R.dimen._8sdp);
                        t0();
                        Context context5 = getContext();
                        if (context5 != null && (kdVar13 = (kd) this.b) != null) {
                            TextView textView4 = kdVar13.d;
                            op5 op5Var4 = op5.a;
                            String string7 = context5.getResources().getString(R.string.on_board_got_it_cms);
                            string7.getClass();
                            String string8 = context5.getResources().getString(R.string.got_it_txt);
                            string8.getClass();
                            op5Var4.getClass();
                            textView4.setText(op5.b(string7, string8, null));
                        }
                    } else if (i == 1) {
                        s0();
                    }
                    if (!Intrinsics.g(this.c, "sporty-hero")) {
                        kd kdVar48 = (kd) this.b;
                        if (kdVar48 != null) {
                            kdVar48.d.setVisibility(0);
                        }
                    } else {
                        if ((i == 0 || i == 3) && (kdVar14 = (kd) this.b) != null) {
                            kdVar14.f.setVisibility(8);
                        }
                        try {
                            kd kdVar49 = (kd) this.b;
                            if ((kdVar49 != null ? kdVar49.f.getTabCount() : 0) >= 4) {
                                kd kdVar50 = (kd) this.b;
                                if (kdVar50 != null && (gVarK2 = kdVar50.f.k(0)) != null && (tabView2 = gVarK2.h) != null) {
                                    tabView2.setVisibility(8);
                                }
                                kd kdVar51 = (kd) this.b;
                                if (kdVar51 != null && (gVarK = kdVar51.f.k(3)) != null && (tabView = gVarK.h) != null) {
                                    tabView.setVisibility(8);
                                }
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
                break;
            case 605180235:
                if (str.equals("spin-da-bottle")) {
                    if (i == 0) {
                        q0((int) getResources().getDimension(R.dimen._6sdp), (int) getResources().getDimension(R.dimen._8sdp));
                        u0((int) getResources().getDimension(R.dimen._6sdp), 16);
                    } else if (i == 1) {
                        q0((int) getResources().getDimension(R.dimen._235sdp), (int) getResources().getDimension(R.dimen._8sdp));
                        u0((int) getResources().getDimension(R.dimen._235sdp), 80);
                    } else if (i == 2) {
                        q0((int) getResources().getDimension(R.dimen._8sdp), (int) getResources().getDimension(R.dimen._8sdp));
                    }
                }
                break;
            case 1143942266:
                if (str.equals("spin-match")) {
                    if (i == 0) {
                        int dimension3 = (int) getResources().getDimension(R.dimen._12sdp);
                        q0(dimension3, (int) getResources().getDimension(R.dimen._12sdp));
                        u0(dimension3, 16);
                    } else if (i != 1 && i == 2) {
                        q0((int) getResources().getDimension(R.dimen._235sdp), (int) getResources().getDimension(R.dimen._12sdp));
                        u0((int) getResources().getDimension(R.dimen._235sdp), 16);
                    } else {
                        q0((int) getResources().getDimension(R.dimen._12sdp), (int) getResources().getDimension(R.dimen._12sdp));
                        u0((int) getResources().getDimension(R.dimen._12sdp), 16);
                    }
                }
                break;
            case 1313709429:
                if (str.equals("spin-to-win")) {
                    if (i == 0 || i == 1) {
                        q0((int) getResources().getDimension(R.dimen._6sdp), (int) getResources().getDimension(R.dimen._8sdp));
                        u0((int) getResources().getDimension(R.dimen._6sdp), 16);
                    } else if (i == 2) {
                        q0((int) getResources().getDimension(R.dimen._235sdp), (int) getResources().getDimension(R.dimen._8sdp));
                        u0((int) getResources().getDimension(R.dimen._235sdp), 16);
                    } else if (i == 3) {
                        q0((int) getResources().getDimension(R.dimen._6sdp), (int) getResources().getDimension(R.dimen._8sdp));
                    }
                }
                break;
            case 1353819564:
                if (str.equals("fruit-hunt")) {
                    if (i == 0 || i == 1 || i == 2) {
                        kd kdVar52 = (kd) this.b;
                        int height5 = kdVar52 != null ? kdVar52.e.getHeight() : 0;
                        kd kdVar53 = (kd) this.b;
                        int width5 = kdVar53 != null ? kdVar53.e.getWidth() : 0;
                        if (height5 > 0 && width5 > 0) {
                            int i10 = FHOnboardingThrow.b0;
                            float fA = FHOnboardingThrow.a.a(width5, height5);
                            int i11 = FHOnboardingKnife.c0;
                            int iMin = height5 - ((int) (Math.min(fA, FHOnboardingKnife.a.a(width5, height5)) - (height5 * 0.06f)));
                            q0(iMin, (int) getResources().getDimension(R.dimen._8sdp));
                            u0(iMin, 16);
                            z5 = this.A;
                            if (z5) {
                                i2 = 4;
                            } else {
                                i2 = 3;
                            }
                            b2 = this.b;
                            if (i == i2) {
                                kdVar16 = (kd) b2;
                                if (kdVar16 != null) {
                                    TabLayout tabLayout = kdVar16.f;
                                    if (z5) {
                                        i3 = 4;
                                    } else {
                                        i3 = 3;
                                    }
                                    gVarK3 = tabLayout.k(i3);
                                    if (gVarK3 != null && (tabView3 = gVarK3.h) != null) {
                                        tabView3.setVisibility(8);
                                    }
                                }
                            } else {
                                kdVar17 = (kd) b2;
                                if (kdVar17 != null) {
                                    kdVar17.f.setVisibility(8);
                                }
                                context = getContext();
                                if (context != null && (kdVar18 = (kd) this.b) != null) {
                                    TextView textView5 = kdVar18.d;
                                    op5 op5Var5 = op5.a;
                                    String string9 = context.getResources().getString(R.string.on_board_got_it_cms);
                                    string9.getClass();
                                    String string10 = context.getResources().getString(R.string.got_it_txt);
                                    string10.getClass();
                                    op5Var5.getClass();
                                    textView5.setText(op5.b(string9, string10, null));
                                }
                            }
                        }
                    } else {
                        if (i == (this.A ? 4 : 3)) {
                            kd kdVar54 = (kd) this.b;
                            int height6 = kdVar54 != null ? kdVar54.e.getHeight() : 0;
                            kd kdVar55 = (kd) this.b;
                            int width6 = kdVar55 != null ? kdVar55.e.getWidth() : 0;
                            if (height6 > 0 && width6 > 0) {
                                q0((int) (height6 * 0.16f), (int) getResources().getDimension(R.dimen._8sdp));
                            }
                        } else {
                            double dF = ((double) m7i0.f(this)) * 0.025d;
                            u0((int) dF, 16);
                            r0(dF);
                        }
                        z5 = this.A;
                        if (z5) {
                            i2 = 4;
                        } else {
                            i2 = 3;
                        }
                        b2 = this.b;
                        if (i == i2) {
                            kdVar16 = (kd) b2;
                            if (kdVar16 != null) {
                                TabLayout tabLayout2 = kdVar16.f;
                                if (z5) {
                                    i3 = 4;
                                } else {
                                    i3 = 3;
                                }
                                gVarK3 = tabLayout2.k(i3);
                                if (gVarK3 != null) {
                                    tabView3.setVisibility(8);
                                }
                            }
                        } else {
                            kdVar17 = (kd) b2;
                            if (kdVar17 != null) {
                                kdVar17.f.setVisibility(8);
                            }
                            context = getContext();
                            if (context != null) {
                                TextView textView6 = kdVar18.d;
                                op5 op5Var6 = op5.a;
                                String string11 = context.getResources().getString(R.string.on_board_got_it_cms);
                                string11.getClass();
                                String string12 = context.getResources().getString(R.string.got_it_txt);
                                string12.getClass();
                                op5Var6.getClass();
                                textView6.setText(op5.b(string11, string12, null));
                            }
                        }
                    }
                }
                break;
        }
        Context context6 = getContext();
        if (context6 != null && i > 0) {
            sny.c(context6, this.f, i - 1, this.c);
        }
        kd kdVar56 = (kd) this.b;
        if (kdVar56 != null) {
            kdVar56.c.setVisibility(0);
        }
        if (i < this.e.length - 1 && !p0(i, this.c) && (kdVar2 = (kd) this.b) != null) {
            kdVar2.w.setVisibility(0);
        }
        b bVar = this.v;
        if (bVar != null) {
            bVar.a(i);
        }
    }

    public final boolean z0() {
        return this.z.containsKey("SH_ONBOARDING_VALENTINES_THEME") && Intrinsics.e(this.z.get("SH_ONBOARDING_VALENTINES_THEME"), 1.0f);
    }
}
