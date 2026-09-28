package com.sporty.android.common.uievent;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AlertController;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.fragment.NavHostFragment;
import com.appsflyer.internal.y;
import com.google.android.material.snackbar.Snackbar;
import com.sporty.android.common.uievent.AlertDialogCallbackType;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.account.Qr.QQWMbKFOuTf;
import defpackage.d0n;
import defpackage.ebs;
import defpackage.ej5;
import defpackage.f6c;
import defpackage.fe00;
import defpackage.h3a0;
import defpackage.ha8;
import defpackage.ibs;
import defpackage.li8;
import defpackage.md8;
import defpackage.mi8;
import defpackage.oi8;
import defpackage.pi8;
import defpackage.qf3;
import defpackage.qxi;
import defpackage.t2y;
import defpackage.uhc;
import defpackage.vj5;
import defpackage.w7n;
import defpackage.yfx;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e {
    public final d0n a;
    public final LinkedHashSet b;

    public e(d0n d0nVar) {
        d0nVar.getClass();
        this.a = d0nVar;
        this.b = new LinkedHashSet();
    }

    public final void a() {
        this.b.clear();
    }

    public final void c(a aVar, androidx.fragment.app.e eVar, View view, fe00 fe00Var) {
        b(aVar, eVar, eVar, eVar, eVar != null ? eVar.getSupportFragmentManager() : null, null, eVar != null ? eVar.getLayoutInflater() : null, view, fe00Var);
    }

    public final void d(a aVar, Fragment fragment, View view, fe00 fe00Var) {
        b(aVar, fragment != null ? fragment.getContext() : null, fragment, fragment != null ? fragment.getActivity() : null, fragment != null ? fragment.getChildFragmentManager() : null, fragment, fragment != null ? fragment.getLayoutInflater() : null, view, fe00Var);
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [ni8] */
    public final void b(a aVar, Context context, ibs ibsVar, androidx.fragment.app.e eVar, final FragmentManager fragmentManager, Fragment fragment, LayoutInflater layoutInflater, View view, fe00 fe00Var) throws Exception {
        yfx yfxVarA;
        md8.a aVar2;
        if (aVar instanceof a.n) {
            if (context != null) {
                Toast.makeText(context, ((a.n) aVar).a.e(context), 0).show();
                return;
            }
            return;
        }
        if (aVar instanceof a.m) {
            if (context == null || layoutInflater == null || view == null) {
                return;
            }
            a.m mVar = (a.m) aVar;
            UiText uiText = mVar.a;
            h3a0 h3a0Var = new h3a0(view);
            CharSequence charSequenceE = uiText.e(context);
            charSequenceE.getClass();
            h3a0Var.b = charSequenceE;
            UiText uiText2 = mVar.b;
            h3a0Var.c = uiText2 != null ? uiText2.e(context) : null;
            h3a0Var.d = new li8(mVar, 0);
            h3a0Var.f = mVar.d;
            Snackbar snackbarB = h3a0Var.b(context, mVar.e, mVar.f);
            if (snackbarB != null) {
                c cVar = new c(snackbarB, mVar);
                ArrayList arrayList = snackbarB.s;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    snackbarB.s = arrayList;
                }
                arrayList.add(cVar);
            }
            if (snackbarB != null) {
                snackbarB.j();
                return;
            } else {
                Toast.makeText(context, uiText.e(context), 0).show();
                return;
            }
        }
        if (aVar instanceof a.h) {
            if (eVar != null) {
                final a.h hVar = (a.h) aVar;
                Object obj = hVar.h;
                LinkedHashSet linkedHashSet = this.b;
                if (obj == null || !linkedHashSet.contains(obj)) {
                    Integer num = hVar.g;
                    androidx.appcompat.app.b.a aVar3 = num == null ? new androidx.appcompat.app.b.a(eVar) : new androidx.appcompat.app.b.a(eVar, num.intValue());
                    boolean z = hVar.f;
                    AlertController.b bVar = aVar3.a;
                    bVar.k = z;
                    UiText uiText3 = hVar.a;
                    if (uiText3 != null) {
                        aVar3.setTitle(uiText3.e(eVar));
                    }
                    UiText uiText4 = hVar.b;
                    if (uiText4 != null) {
                        bVar.f = Html.fromHtml(uiText4.e(eVar).toString());
                    } else {
                        UiText uiText5 = hVar.c;
                        if (uiText5 != null) {
                            bVar.f = uiText5.e(eVar);
                        }
                    }
                    UiText uiText6 = hVar.d;
                    if (uiText6 != null) {
                        aVar3.c(uiText6.e(eVar), new DialogInterface.OnClickListener() { // from class: hi8
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                Function1<AlertDialogCallbackType, Unit> function1 = hVar.i;
                                if (function1 != null) {
                                    function1.invoke(AlertDialogCallbackType.Positive.a);
                                }
                            }
                        });
                    }
                    UiText uiText7 = hVar.e;
                    if (uiText7 != null) {
                        aVar3.b(uiText7.e(eVar), new DialogInterface.OnClickListener() { // from class: ii8
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                Function1<AlertDialogCallbackType, Unit> function1 = hVar.i;
                                if (function1 != null) {
                                    function1.invoke(AlertDialogCallbackType.Negative.a);
                                }
                            }
                        });
                    }
                    bVar.l = new DialogInterface.OnCancelListener() { // from class: ji8
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            Function1<AlertDialogCallbackType, Unit> function1 = hVar.i;
                            if (function1 != null) {
                                function1.invoke(AlertDialogCallbackType.Cancel.a);
                            }
                        }
                    };
                    bVar.m = new DialogInterface.OnDismissListener() { // from class: ki8
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            Object obj2 = hVar.h;
                            if (obj2 != null) {
                                this.b.remove(obj2);
                            }
                        }
                    };
                    if (eVar.isFinishing() || eVar.isDestroyed()) {
                        return;
                    }
                    aVar3.f();
                    if (obj != null) {
                        linkedHashSet.add(obj);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (aVar instanceof a.j) {
            if (fragmentManager == null || ibsVar == null) {
                return;
            }
            a.j jVar = (a.j) aVar;
            UiText uiText8 = jVar.a;
            UiText uiText9 = jVar.b;
            UiText uiText10 = jVar.c;
            UiText uiText11 = jVar.d;
            UiText uiText12 = jVar.e;
            UiText uiText13 = jVar.f;
            boolean z2 = jVar.g;
            final oi8 oi8Var = new oi8(jVar, this);
            fragmentManager.n0("REQUEST_KEY_SHOW_CUSTOM_ALERT_DIALOG", ibsVar, new qxi() { // from class: e6c
                @Override // defpackage.qxi
                public final void a(String str, Bundle bundle) {
                    f6c.a.a(oi8Var, fragmentManager, str, bundle);
                }
            });
            f6c f6cVar = new f6c();
            f6cVar.setArguments(vj5.a(new Pair("ARG_TITLE", uiText8), new Pair("ARG_MESSAGE", uiText9), new Pair("ARG_HTML_MESSAGE", null), new Pair("ARG_HYPERLINK_IN_MESSAGE", uiText10), new Pair("ARG_CHECK_BOX_UI_TEXT", uiText11), new Pair(QQWMbKFOuTf.fbbeVqOqgvgmRoD, uiText12), new Pair("ARG_NEGATIVE_TEXT", uiText13), new Pair("ARG_CANCELABLE", Boolean.valueOf(z2))));
            f6cVar.show(fragmentManager, f6c.class.getName());
            return;
        }
        if (aVar instanceof a.i) {
            if (fragmentManager != null) {
                a.i iVar = (a.i) aVar;
                ha8.a.a(iVar.a, iVar.b, null, null, iVar.c, iVar.d, new pi8(iVar, this), new qf3(iVar, this)).show(fragmentManager, ha8.class.getName());
                return;
            }
            return;
        }
        if (!(aVar instanceof a.l)) {
            if (aVar instanceof a.d) {
                if (context != null) {
                    this.a.b(context, ((a.d) aVar).a);
                    return;
                }
                return;
            }
            if (Intrinsics.g(aVar, a.b.a)) {
                if (eVar == null || eVar.isFinishing()) {
                    return;
                }
                eVar.finish();
                return;
            }
            if (Intrinsics.g(aVar, a.g.a)) {
                if (fragment == null || (yfxVarA = NavHostFragment.a.a(fragment)) == null) {
                    return;
                }
                yfxVarA.k();
                return;
            }
            if (aVar instanceof a.c) {
                if (context != null) {
                    throw null;
                }
                return;
            }
            if (aVar instanceof a.C0203a) {
                if (context != null) {
                    ((a.C0203a) aVar).a.invoke(Boolean.valueOf(new t2y(context).b.areNotificationsEnabled()));
                    return;
                }
                return;
            }
            if (aVar instanceof a.e) {
                if (eVar != null) {
                    a.e eVar2 = (a.e) aVar;
                    if (fe00Var != null) {
                        ej5.c(ebs.a(eVar.getLifecycle()), null, null, new d(eVar, fe00Var, eVar2, null), 3);
                        return;
                    } else {
                        y.a("The caller must implement `PermissionRequester` and pass it into `CommonUiEventProcessor`.");
                        return;
                    }
                }
                return;
            }
            if (aVar instanceof a.k) {
                if (fragmentManager != null) {
                    a.k kVar = (a.k) aVar;
                    new w7n(kVar.b, kVar.a, kVar.c).show(fragmentManager, w7n.class.getSimpleName());
                    return;
                }
                return;
            }
            if (Intrinsics.g(aVar, a.f.a) || aVar == null) {
                return;
            }
            uhc.a();
            return;
        }
        if (context == null || fragmentManager == null) {
            return;
        }
        a.l lVar = (a.l) aVar;
        UiText uiText14 = lVar.a;
        CharSequence charSequenceE2 = uiText14 != null ? uiText14.e(context) : null;
        UiText uiText15 = lVar.b;
        CharSequence charSequenceE3 = uiText15 != null ? uiText15.e(context) : null;
        ResourceUiText resourceUiText = lVar.d;
        CharSequence charSequenceE4 = resourceUiText != null ? resourceUiText.e(context) : null;
        UiText uiText16 = lVar.e;
        CharSequence charSequenceE5 = uiText16 != null ? uiText16.e(context) : null;
        Integer num2 = lVar.c;
        if (num2 != null) {
            int iIntValue = num2.intValue();
            aVar2 = new md8.a();
            aVar2.e = "Confirm";
            aVar2.f = "Cancel";
            aVar2.i = true;
            aVar2.j = true;
            aVar2.c = charSequenceE2;
            aVar2.d = charSequenceE3;
            aVar2.b = "";
            aVar2.a = iIntValue;
        } else {
            aVar2 = new md8.a();
            aVar2.e = "Confirm";
            aVar2.f = "Cancel";
            aVar2.i = true;
            aVar2.j = true;
            aVar2.c = charSequenceE2;
            aVar2.d = charSequenceE3;
            aVar2.b = "";
            aVar2.a = 0;
        }
        aVar2.e = charSequenceE4;
        aVar2.i = charSequenceE4 != null;
        aVar2.f = charSequenceE5;
        aVar2.j = charSequenceE5 != null;
        aVar2.g = new mi8(lVar, this);
        aVar2.h = new md8.b(this) { // from class: ni8
            @Override // md8.b
            public final void d() {
                Function1<AlertDialogCallbackType, Unit> function1 = this.a.f;
                if (function1 != null) {
                    function1.invoke(AlertDialogCallbackType.Negative.a);
                }
            }
        };
        md8 md8Var = new md8();
        md8Var.i = aVar2.c;
        md8Var.v = aVar2.a;
        md8Var.w = aVar2.b;
        md8Var.y = aVar2.d;
        md8Var.A = aVar2.f;
        md8Var.z = aVar2.e;
        md8Var.C = aVar2.j;
        md8Var.B = aVar2.i;
        md8Var.F = aVar2.h;
        md8Var.E = aVar2.g;
        md8Var.show(fragmentManager, md8.class.getSimpleName());
    }
}
