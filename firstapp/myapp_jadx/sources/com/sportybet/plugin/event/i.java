package com.sportybet.plugin.event;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.compose.runtime.a;
import androidx.compose.runtime.m;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.event.i;
import defpackage.op8;
import defpackage.qxi;
import defpackage.s9s;
import defpackage.saj;
import defpackage.szi0;
import defpackage.u6i0;
import defpackage.vj5;
import defpackage.x5a0;
import defpackage.ytw;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/sportybet/plugin/event/i;", "Lcom/google/android/material/bottomsheet/c;", "<init>", "()V", "a", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class i extends com.google.android.material.bottomsheet.c {
    public final ytw a = m.b(new szi0(0));
    public boolean b;

    public static final class a {
        public static void a(FragmentManager fragmentManager, s9s s9sVar, String str, String str2, boolean z) {
            fragmentManager.getClass();
            s9sVar.getClass();
            if (Intrinsics.g(Looper.myLooper(), Looper.getMainLooper()) && !fragmentManager.K && !fragmentManager.V() && s9sVar.b().compareTo(s9s.b.e) >= 0) {
                try {
                    Fragment fragmentH = fragmentManager.H("WebViewJsBottomSheet");
                    if (fragmentH instanceof i) {
                        if (((i) fragmentH).isRemoving()) {
                            return;
                        }
                        fragmentManager.m0("web_view_js_bottom_sheet_update", vj5.a(new Pair("title", str), new Pair("content", str2)));
                    } else if (fragmentH == null) {
                        i iVar = new i();
                        iVar.setArguments(vj5.a(new Pair("title", str), new Pair("content", str2), new Pair("force_dark_mode", Boolean.valueOf(z))));
                        iVar.showNow(fragmentManager, "WebViewJsBottomSheet");
                    }
                } catch (IllegalStateException unused) {
                }
            }
        }
    }

    public static final /* synthetic */ class b extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((i) this.receiver).dismiss();
            return Unit.a;
        }
    }

    @Override // androidx.fragment.app.d
    public final int getTheme() {
        return R.style.EdgeToEdgeBottomSheetDialogTheme;
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        boolean z;
        String string2;
        super.onCreate(bundle);
        String str = "";
        if (bundle == null || (string = bundle.getString("state_title")) == null) {
            Bundle arguments = getArguments();
            string = arguments != null ? arguments.getString("title") : null;
            if (string == null) {
                string = "";
            }
        }
        if (bundle == null || (string2 = bundle.getString("state_content")) == null) {
            Bundle arguments2 = getArguments();
            String string3 = arguments2 != null ? arguments2.getString("content") : null;
            if (string3 != null) {
                str = string3;
            }
        } else {
            str = string2;
        }
        ((x5a0) this.a).setValue(new szi0(string, str));
        if (bundle == null || !bundle.containsKey("state_force_dark_mode")) {
            Bundle arguments3 = getArguments();
            z = arguments3 != null ? arguments3.getBoolean("force_dark_mode") : false;
        } else {
            z = bundle.getBoolean("state_force_dark_mode");
        }
        this.b = z;
    }

    @Override // com.google.android.material.bottomsheet.c, defpackage.yq0, androidx.fragment.app.d
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        dialogOnCreateDialog.getClass();
        com.google.android.material.bottomsheet.b bVar = (com.google.android.material.bottomsheet.b) dialogOnCreateDialog;
        Window window = bVar.getWindow();
        if (window != null) {
            window.setNavigationBarColor(0);
            if (Build.VERSION.SDK_INT >= 29) {
                window.setNavigationBarContrastEnforced(false);
            }
        }
        BottomSheetBehavior<FrameLayout> bottomSheetBehaviorG = bVar.g();
        bottomSheetBehaviorG.L(3);
        bottomSheetBehaviorG.Y = true;
        return bVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
        composeView.setViewCompositionStrategy(u6i0.c.a);
        composeView.setContent(new op8(-707649112, new Function2() { // from class: kzi0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i = 1;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    i iVar = this.a;
                    op8 op8VarB = pp8.b(-1130370116, new c91(iVar, i), aVar);
                    if (iVar.b) {
                        aVar.N(-1874891211);
                        rzi0.a(6, op8VarB, aVar);
                        aVar.H();
                    } else {
                        aVar.N(-1874817524);
                        op8VarB.invoke(aVar, 6);
                        aVar.H();
                    }
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
        return composeView;
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        ytw ytwVar = this.a;
        bundle.putString("state_title", ((szi0) ((x5a0) ytwVar).getValue()).a);
        bundle.putString("state_content", ((szi0) ((x5a0) ytwVar).getValue()).b);
        bundle.putBoolean("state_force_dark_mode", this.b);
        super.onSaveInstanceState(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        Object parent = view.getParent();
        if (!(parent instanceof View)) {
            parent = null;
        }
        View view2 = (View) parent;
        if (view2 != null) {
            view2.setBackgroundColor(0);
        }
        getParentFragmentManager().n0("web_view_js_bottom_sheet_update", getViewLifecycleOwner(), new qxi() { // from class: lzi0
            @Override // defpackage.qxi
            public final void a(String str, Bundle bundle2) {
                bundle2.getClass();
                String string = bundle2.getString("title");
                if (string == null) {
                    string = "";
                }
                String string2 = bundle2.getString("content");
                ((x5a0) this.a.a).setValue(new szi0(string, string2 != null ? string2 : ""));
            }
        });
    }
}
