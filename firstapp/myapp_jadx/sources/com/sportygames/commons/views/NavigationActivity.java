package com.sportygames.commons.views;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.NavigationView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.components.SGHamburgerMenu;
import com.sportygames.commons.components.a;
import com.sportygames.commons.models.LeftMenuButton;
import com.sportygames.commons.models.MenuIconSize;
import com.sportygames.commons.models.enums.PagingFetchType;
import com.sportygames.commons.remote.model.Status;
import com.sportygames.commons.views.NavigationActivity;
import com.sportygames.lobby.remote.models.GameDetails;
import defpackage.bmy;
import defpackage.cyb;
import defpackage.dio;
import defpackage.elf;
import defpackage.fo2;
import defpackage.g6i0;
import defpackage.gd;
import defpackage.ghe;
import defpackage.h5e;
import defpackage.h8a;
import defpackage.haj;
import defpackage.jq40;
import defpackage.lfy;
import defpackage.ljx;
import defpackage.mpa0;
import defpackage.nij;
import defpackage.nt2;
import defpackage.ojx;
import defpackage.op5;
import defpackage.paj;
import defpackage.pm0;
import defpackage.q8i0;
import defpackage.qlf;
import defpackage.qlr;
import defpackage.qo80;
import defpackage.r8i0;
import defpackage.rjx;
import defpackage.rk60;
import defpackage.rm0;
import defpackage.rpa0;
import defpackage.rx5;
import defpackage.tm0;
import defpackage.un20;
import defpackage.uy1;
import defpackage.v8i0;
import defpackage.ypa0;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sportygames/commons/views/NavigationActivity;", "Luy1;", "Lgd;", "<init>", "()V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NavigationActivity extends uy1<gd> {
    public static final /* synthetic */ int y = 0;
    public SharedPreferences c;
    public SharedPreferences.Editor d;
    public final q8i0 e = new q8i0(jq40.a(ypa0.class), new e(), new d(), new f());
    public final q8i0 f = new q8i0(jq40.a(nt2.class), new h(), new g(), new i());
    public fo2 i;
    public rpa0 v;
    public GameDetails w;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Status.values().length];
            try {
                iArr[Status.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Status.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Status.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static final class b implements DrawerLayout.e {
        public b() {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.e
        public final void a(View view) {
            view.getClass();
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.e
        public final void b(View view) {
            view.getClass();
            try {
                NavigationActivity.this.getOnBackPressedDispatcher().d();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.e
        public final void c(View view, float f) {
            view.getClass();
        }
    }

    public static final class c implements lfy, paj {
        public final /* synthetic */ ojx a;

        public c(ojx ojxVar) {
            this.a = ojxVar;
        }

        @Override // defpackage.paj
        public final haj<?> c() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof lfy) && (obj instanceof paj)) {
                return Intrinsics.g(c(), ((paj) obj).c());
            }
            return false;
        }

        public final int hashCode() {
            return c().hashCode();
        }

        @Override // defpackage.lfy
        public final /* synthetic */ void u1(Object obj) {
            this.a.invoke(obj);
        }
    }

    public static final class d extends qlr implements Function0<r8i0.c> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return NavigationActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class e extends qlr implements Function0<v8i0> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return NavigationActivity.this.getViewModelStore();
        }
    }

    public static final class f extends qlr implements Function0<cyb> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return NavigationActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public static final class g extends qlr implements Function0<r8i0.c> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return NavigationActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class h extends qlr implements Function0<v8i0> {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return NavigationActivity.this.getViewModelStore();
        }
    }

    public static final class i extends qlr implements Function0<cyb> {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return NavigationActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public final ypa0 A1() {
        return (ypa0) this.e.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v6 */
    @Override // defpackage.uy1, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ?? r10;
        ypa0 ypa0Var;
        ypa0 ypa0Var2;
        DisplayMetrics displayMetrics;
        qo80 binding;
        qo80 binding2;
        qo80 binding3;
        qo80 binding4;
        CoordinatorLayout coordinatorLayout;
        super.onCreate(bundle);
        elf.b(this, null, 3);
        gd gdVar = (gd) this.a;
        if (gdVar != null && (coordinatorLayout = gdVar.a) != null) {
            qlf.b(coordinatorLayout);
        }
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        int intExtra = getIntent().getIntExtra("color", 0);
        Window window = getWindow();
        window.getClass();
        qlf.c(window, getColor(intExtra));
        this.c = un20.a(this);
        gd gdVar2 = (gd) this.a;
        if (gdVar2 != null && (binding2 = gdVar2.c.getBinding()) != null) {
            TextView textView = binding2.c;
            op5 op5Var = op5.a;
            gd gdVar3 = (gd) this.a;
            String strValueOf = String.valueOf((gdVar3 == null || (binding4 = gdVar3.c.getBinding()) == null) ? null : binding4.c.getTag());
            gd gdVar4 = (gd) this.a;
            textView.setText("+ ".concat(op5.c(op5Var, strValueOf, String.valueOf((gdVar4 == null || (binding3 = gdVar4.c.getBinding()) == null) ? null : binding3.c.getText()))));
        }
        op5 op5Var2 = op5.a;
        gd gdVar5 = (gd) this.a;
        op5.r(op5Var2, kotlin.collections.b.f((gdVar5 == null || (binding = gdVar5.c.getBinding()) == null) ? null : binding.f), null, 6);
        SharedPreferences sharedPreferences = this.c;
        this.d = sharedPreferences != null ? sharedPreferences.edit() : null;
        Parcelable parcelableExtra = getIntent().getParcelableExtra("gameDetail");
        parcelableExtra.getClass();
        this.w = (GameDetails) parcelableExtra;
        Integer numValueOf = Integer.valueOf(R.color.evenodd_toggle_off_color);
        Integer numValueOf2 = Integer.valueOf(R.color.evenodd_toggle_on_color);
        z1().b.f(this, new c(new ojx(this)));
        String string = getString(R.string.music_cms);
        string.getClass();
        String string2 = getString(R.string.music_menu);
        string2.getClass();
        String strB = op5.b(string, string2, null);
        MenuIconSize menuIconSize = new MenuIconSize(R.dimen._15sdp, R.dimen._12sdp);
        int i2 = 1;
        pm0 pm0Var = new pm0(1);
        SharedPreferences sharedPreferences2 = this.c;
        LeftMenuButton leftMenuButton = new LeftMenuButton(0, strB, R.drawable.music, menuIconSize, pm0Var, true, sharedPreferences2 != null ? Boolean.valueOf(sharedPreferences2.getBoolean("EVEN_ODD_MUSIC", true)) : null, numValueOf2, numValueOf, null, false, new Function1() { // from class: qjx
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                NavigationActivity navigationActivity = this.a;
                SharedPreferences.Editor editor = navigationActivity.d;
                if (zBooleanValue) {
                    if (editor != null) {
                        editor.putBoolean("EVEN_ODD_MUSIC", true);
                    }
                    SharedPreferences.Editor editor2 = navigationActivity.d;
                    if (editor2 != null) {
                        editor2.apply();
                    }
                    navigationActivity.A1().y1();
                } else {
                    if (editor != null) {
                        editor.putBoolean("EVEN_ODD_MUSIC", false);
                    }
                    navigationActivity.A1().I1();
                    navigationActivity.A1().y1();
                    SharedPreferences.Editor editor3 = navigationActivity.d;
                    if (editor3 != null) {
                        editor3.apply();
                    }
                }
                Intent intent = new Intent("musicOnOff");
                intent.putExtra("state-change", zBooleanValue);
                fdt.a(navigationActivity).c(intent);
                return Unit.a;
            }
        }, 1536, null);
        String string3 = getString(R.string.sound_cms);
        string3.getClass();
        String string4 = getString(R.string.sound_menu);
        string4.getClass();
        String strB2 = op5.b(string3, string4, null);
        MenuIconSize menuIconSize2 = new MenuIconSize(R.dimen._15sdp, R.dimen._12sdp);
        rm0 rm0Var = new rm0(2);
        SharedPreferences sharedPreferences3 = this.c;
        LeftMenuButton leftMenuButton2 = new LeftMenuButton(0, strB2, R.drawable.ic_sound, menuIconSize2, rm0Var, true, sharedPreferences3 != null ? Boolean.valueOf(sharedPreferences3.getBoolean("EVEN_ODD_SOUND", true)) : null, numValueOf2, numValueOf, null, false, new rjx(this, objArr2 == true ? 1 : 0), 1536, null);
        String string5 = getString(R.string.one_tap_bet_cms);
        string5.getClass();
        String string6 = getString(R.string.onetap_bet_menu);
        string6.getClass();
        String strB3 = op5.b(string5, string6, null);
        MenuIconSize menuIconSize3 = new MenuIconSize(R.dimen._15sdp, R.dimen._10sdp);
        tm0 tm0Var = new tm0(1);
        SharedPreferences sharedPreferences4 = this.c;
        LeftMenuButton leftMenuButton3 = new LeftMenuButton(1, strB3, R.drawable.ic_one_tap_bet, menuIconSize3, tm0Var, true, sharedPreferences4 != null ? Boolean.valueOf(sharedPreferences4.getBoolean("EVEN_ODD_ONE_TAP", false)) : null, numValueOf2, numValueOf, null, false, new h8a(this, 1), 1536, null);
        String string7 = getString(R.string.how_to_play_nav_cms);
        string7.getClass();
        String string8 = getString(R.string.how_to_play_menu);
        string8.getClass();
        LeftMenuButton leftMenuButton4 = new LeftMenuButton(0, op5.b(string7, string8, null), R.drawable.ic_how_to_play, new MenuIconSize(R.dimen._13sdp, R.dimen._13sdp), new ghe(this, i2), false, null, null, null, null, false, null, 3072, null);
        String string9 = getString(R.string.bet_history_cms);
        string9.getClass();
        String string10 = getString(R.string.bethistory_menu);
        string10.getClass();
        List listK = kotlin.collections.b.k(leftMenuButton, leftMenuButton2, leftMenuButton3, leftMenuButton4, new LeftMenuButton(0, op5.b(string9, string10, null), R.drawable.ic_bethistory, new MenuIconSize(R.dimen._17sdp, R.dimen._17sdp), new Function0() { // from class: sjx
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = NavigationActivity.y;
                final NavigationActivity navigationActivity = this.a;
                if (!(navigationActivity.getSupportFragmentManager().G(R.id.flContent) instanceof a)) {
                    fo2 fo2Var = new fo2(navigationActivity, "Even-Odd");
                    fo2Var.H = new Function2() { // from class: mjx
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj).intValue();
                            int iIntValue2 = ((Integer) obj2).intValue();
                            int i4 = NavigationActivity.y;
                            navigationActivity.z1().x1(iIntValue, iIntValue2, PagingFetchType.VIEW_MORE);
                            return Unit.a;
                        }
                    };
                    fo2Var.I = new yge(navigationActivity, 1);
                    fo2Var.d();
                    vo2 vo2Var = new vo2();
                    vo2Var.e = navigationActivity;
                    fo2Var.i(vo2Var);
                    fo2Var.b();
                    navigationActivity.i = fo2Var;
                    fo2Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: njx
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            fo2 fo2Var2 = navigationActivity.i;
                            if (fo2Var2 != null) {
                                fo2Var2.c();
                            }
                        }
                    });
                }
                return Unit.a;
            }
        }, false, null, null, null, null, false, null, 3072, null));
        gd gdVar6 = (gd) this.a;
        if (gdVar6 != null) {
            r10 = 1;
            SGHamburgerMenu.setup$default(gdVar6.c, new SGHamburgerMenu.b(A1(), R.string.evenodd_name, getIntent().getStringExtra("userImage"), getIntent().getStringExtra("userName"), listK, new dio(this, 1), new ljx(objArr == true ? 1 : 0)), this, false, null, null, 28, null);
        } else {
            r10 = 1;
        }
        Resources resources = getResources();
        double d2 = ((double) ((resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) ? 0 : displayMetrics.widthPixels)) * 0.72d;
        gd gdVar7 = (gd) this.a;
        ViewGroup.LayoutParams layoutParams = gdVar7 != null ? gdVar7.d.getLayoutParams() : null;
        layoutParams.getClass();
        DrawerLayout.LayoutParams layoutParams2 = (DrawerLayout.LayoutParams) layoutParams;
        ((ViewGroup.MarginLayoutParams) layoutParams2).width = (int) d2;
        gd gdVar8 = (gd) this.a;
        if (gdVar8 != null) {
            gdVar8.d.setLayoutParams(layoutParams2);
        }
        gd gdVar9 = (gd) this.a;
        if (gdVar9 != null) {
            gdVar9.c.setEvenImage();
        }
        gd gdVar10 = (gd) this.a;
        if (gdVar10 != null) {
            gdVar10.c.setEvenOddBottomImage();
        }
        gd gdVar11 = (gd) this.a;
        if (gdVar11 != null) {
            gdVar11.c.F(getIntent().getIntExtra("addMoneyBg", 0));
        }
        ypa0 ypa0VarA1 = A1();
        GameDetails gameDetails = this.w;
        if (gameDetails == null) {
            Intrinsics.n("gameDetails");
            throw null;
        }
        SharedPreferences sharedPreferences5 = this.c;
        rpa0 rpa0Var = new rpa0(ypa0VarA1, gameDetails, sharedPreferences5);
        this.v = rpa0Var;
        rk60 rk60Var = rpa0Var.b;
        if (rk60Var == null && (rk60Var = rpa0Var.b) == null) {
            HashMap map = new HashMap();
            List<String> gameSounds = gameDetails.getGameSounds();
            if (gameSounds != null) {
                for (String str : gameSounds) {
                    rk60.b bVar = rk60.n.get(gameDetails.getName());
                    if (bVar != null) {
                        mpa0 mpa0Var = new mpa0();
                        mpa0Var.a = this;
                        map.put(mpa0Var.a(str), new rk60.a(str, StringsKt.k0(str, String.valueOf(gameDetails.getName()), str), false, bVar, null));
                    }
                }
            }
            List<String> commonSounds = gameDetails.getCommonSounds();
            if (commonSounds != null) {
                for (String str2 : commonSounds) {
                    mpa0 mpa0Var2 = new mpa0();
                    mpa0Var2.a = this;
                    map.put(mpa0Var2.a(str2), new rk60.a(str2, StringsKt.k0(str2, "common/", str2), false, rk60.b.b, null));
                }
            }
            String strValueOf2 = String.valueOf(gameDetails.getName());
            boolean z = sharedPreferences5 != 0 ? sharedPreferences5.getBoolean(rpa0.c.get(gameDetails.getName()), r10) : false;
            if (sharedPreferences5 != 0) {
                sharedPreferences5.getBoolean(rpa0.d.get(gameDetails.getName()), r10);
            }
            rk60 rk60Var2 = new rk60(this, strValueOf2, map, z);
            rpa0Var.b = rk60Var2;
            rk60Var = rk60Var2;
        }
        if (rk60Var != null && (ypa0Var2 = rpa0Var.a) != null) {
            ypa0Var2.F1(rk60Var, new nij(rpa0Var, this));
        }
        rpa0 rpa0Var2 = this.v;
        if (rpa0Var2 != null && (ypa0Var = rpa0Var2.a) != null) {
            ypa0.E1(A1(), ypa0Var.y1());
        }
        new Handler(Looper.getMainLooper()).postDelayed(new rx5(this, r10), 100L);
        gd gdVar12 = (gd) this.a;
        if (gdVar12 != null) {
            gdVar12.e.setOnClickListener(new View.OnClickListener() { // from class: pjx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i3 = NavigationActivity.y;
                    this.a.getOnBackPressedDispatcher().d();
                }
            });
        }
        gd gdVar13 = (gd) this.a;
        if (gdVar13 != null) {
            gdVar13.b.a(new b());
        }
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    public final void onPause() {
        super.onPause();
        try {
            getWindow().clearFlags(128);
            overridePendingTransition(0, 0);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        try {
            super.onResume();
            getWindow().addFlags(128);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // defpackage.uy1
    public final g6i0 w1() {
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_navigation, (ViewGroup) null, false);
        int i2 = R.id.drawer_layout;
        DrawerLayout drawerLayout = (DrawerLayout) h5e.a(R.id.drawer_layout, viewInflate);
        if (drawerLayout != null) {
            i2 = R.id.flContent;
            if (((FrameLayout) h5e.a(R.id.flContent, viewInflate)) != null) {
                i2 = R.id.hamburger_menu;
                SGHamburgerMenu sGHamburgerMenu = (SGHamburgerMenu) h5e.a(R.id.hamburger_menu, viewInflate);
                if (sGHamburgerMenu != null) {
                    i2 = R.id.navigationView;
                    NavigationView navigationView = (NavigationView) h5e.a(R.id.navigationView, viewInflate);
                    if (navigationView != null) {
                        i2 = R.id.parent;
                        RelativeLayout relativeLayout = (RelativeLayout) h5e.a(R.id.parent, viewInflate);
                        if (relativeLayout != null) {
                            return new gd((CoordinatorLayout) viewInflate, drawerLayout, sGHamburgerMenu, navigationView, relativeLayout);
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        return null;
    }

    public final nt2 z1() {
        return (nt2) this.f.getValue();
    }
}
