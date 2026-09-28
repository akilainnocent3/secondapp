package com.sportygames.commons.components;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.components.a;
import defpackage.bk60;
import defpackage.bq40;
import defpackage.gi60;
import defpackage.gr60;
import defpackage.hi60;
import defpackage.mn80;
import defpackage.qi6;
import defpackage.whs;
import defpackage.xn80;
import defpackage.zj60;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/sportygames/commons/components/a;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a extends Fragment {
    public int A;
    public boolean d;
    public boolean e;
    public mn80 y;
    public int z;
    public String a = "";
    public String b = "";
    public String c = "";
    public String f = "";
    public String i = "";
    public Function1<? super Boolean, Unit> v = new qi6(1);
    public Function0<Unit> w = new hi60();

    /* JADX INFO: renamed from: com.sportygames.commons.components.a$a, reason: collision with other inner class name */
    public static final class C0437a {
        public static a a(String str, String str2, String str3, String str4, String str5, String str6, Function1 function1, Function0 function0, int i, int i2, int i3) {
            boolean z = (i3 & 4096) == 0;
            boolean z2 = (i3 & 8192) == 0;
            str4.getClass();
            a aVar = new a();
            aVar.a = str3;
            aVar.c = str;
            aVar.b = str2;
            aVar.f = str5;
            aVar.i = str6;
            aVar.v = function1;
            aVar.w = function0;
            aVar.z = i;
            aVar.A = i2;
            aVar.d = z;
            aVar.e = z2;
            return aVar;
        }
    }

    public static final class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ bq40 a;
        public final /* synthetic */ bq40 b;
        public final /* synthetic */ a c;

        public b(bq40 bq40Var, bq40 bq40Var2, a aVar) {
            this.a = bq40Var;
            this.b = bq40Var2;
            this.c = aVar;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            bq40 bq40Var = this.a;
            int i = bq40Var.a;
            a aVar = this.c;
            if (i == 0) {
                mn80 mn80Var = aVar.y;
                if (mn80Var == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                int lineCount = mn80Var.C.getLineCount();
                bq40 bq40Var2 = this.b;
                bq40Var2.a = lineCount;
                mn80 mn80Var2 = aVar.y;
                if (mn80Var2 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                ViewGroup.LayoutParams layoutParams = mn80Var2.C.getLayoutParams();
                layoutParams.getClass();
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                int i2 = bq40Var2.a;
                if (i2 == 1) {
                    layoutParams2.S = 0.032f;
                }
                if (i2 == 2) {
                    layoutParams2.S = 0.063f;
                }
                if (i2 == 3) {
                    layoutParams2.S = 0.096f;
                }
                mn80 mn80Var3 = aVar.y;
                if (mn80Var3 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                mn80Var3.C.setLayoutParams(layoutParams2);
                bq40Var.a = 1;
            }
            mn80 mn80Var4 = aVar.y;
            if (mn80Var4 != null) {
                mn80Var4.C.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            } else {
                Intrinsics.n("binding");
                throw null;
            }
        }
    }

    public static void j0(String str, String str2, String str3) {
        zj60 bridge;
        String str4 = SportyGamesManager.getInstance().getUser() != null ? "logged-in" : "non logged-in";
        Bundle bundleA = whs.a("popup_name", str, "button_name", str2);
        bundleA.putString(AnalyticsParam.GAMES_RECOMMENDATION_GAME_NAME, str3);
        bundleA.putString("user_state", str4);
        SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
        if (sportyGamesManager == null || (bridge = sportyGamesManager.getBridge()) == null) {
            return;
        }
        ((bk60) bridge).a("popup_action", bundleA);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        mn80 mn80VarA = mn80.a(layoutInflater, viewGroup);
        this.y = mn80VarA;
        gr60.a(mn80VarA.e, new gi60(this, 0));
        mn80 mn80Var = this.y;
        if (mn80Var == null) {
            Intrinsics.n("binding");
            throw null;
        }
        ConstraintLayout constraintLayout = mn80Var.a;
        constraintLayout.getClass();
        return constraintLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        boolean z = this.d;
        mn80 mn80Var = this.y;
        if (z) {
            if (mn80Var == null) {
                Intrinsics.n("binding");
                throw null;
            }
            xn80.b(mn80Var.C, this.a);
        } else {
            if (mn80Var == null) {
                Intrinsics.n("binding");
                throw null;
            }
            mn80Var.C.setText(this.a);
        }
        mn80 mn80Var2 = this.y;
        if (mn80Var2 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        CharSequence text = mn80Var2.C.getText();
        text.getClass();
        StringsKt.X(text).size();
        bq40 bq40Var = new bq40();
        bq40 bq40Var2 = new bq40();
        mn80 mn80Var3 = this.y;
        if (mn80Var3 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        mn80Var3.i.setVisibility(8);
        mn80 mn80Var4 = this.y;
        if (mn80Var4 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        mn80Var4.C.getViewTreeObserver().addOnGlobalLayoutListener(new b(bq40Var2, bq40Var, this));
        mn80 mn80Var5 = this.y;
        if (mn80Var5 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = mn80Var5.C.getLayoutParams();
        layoutParams.getClass();
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        int i = bq40Var.a;
        if (i == 1) {
            layoutParams2.S = 0.15f;
        }
        if (i == 2) {
            layoutParams2.S = 5.9f;
        }
        mn80 mn80Var6 = this.y;
        if (mn80Var6 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        mn80Var6.C.setLayoutParams(layoutParams2);
        mn80 mn80Var7 = this.y;
        if (mn80Var7 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        mn80Var7.c.setText(this.i);
        mn80 mn80Var8 = this.y;
        if (mn80Var8 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        mn80Var8.d.setText(this.f);
        mn80 mn80Var9 = this.y;
        if (mn80Var9 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        if (mn80Var9.c.getText().equals(getResources().getString(R.string.new_round))) {
            mn80 mn80Var10 = this.y;
            if (mn80Var10 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            ViewGroup.LayoutParams layoutParams3 = mn80Var10.b.getLayoutParams();
            layoutParams3.getClass();
            ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
            layoutParams4.R = 0.4f;
            mn80 mn80Var11 = this.y;
            if (mn80Var11 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            mn80Var11.b.setLayoutParams(layoutParams4);
            mn80 mn80Var12 = this.y;
            if (mn80Var12 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            ViewGroup.LayoutParams layoutParams5 = mn80Var12.e.getLayoutParams();
            layoutParams5.getClass();
            ConstraintLayout.LayoutParams layoutParams6 = (ConstraintLayout.LayoutParams) layoutParams5;
            layoutParams6.R = 0.6f;
            mn80 mn80Var13 = this.y;
            if (mn80Var13 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            mn80Var13.e.setLayoutParams(layoutParams6);
        }
        mn80 mn80Var14 = this.y;
        if (mn80Var14 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        gr60.a(mn80Var14.b, new Function1() { // from class: fi60
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ((View) obj).getClass();
                a aVar = this.a;
                String str = aVar.b;
                mn80 mn80Var15 = aVar.y;
                if (mn80Var15 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                a.j0(str, mn80Var15.c.getText().toString(), aVar.c);
                aVar.v.invoke(Boolean.FALSE);
                return Unit.a;
            }
        });
        int i2 = this.z;
        if (i2 != 0) {
            mn80 mn80Var15 = this.y;
            if (mn80Var15 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            mn80Var15.b.setBackgroundColor(i2);
        }
        int i3 = this.A;
        if (i3 != 0) {
            mn80 mn80Var16 = this.y;
            if (mn80Var16 != null) {
                mn80Var16.e.setBackgroundColor(i3);
            } else {
                Intrinsics.n("binding");
                throw null;
            }
        }
    }
}
