package com.sporty.android.common.uievent;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import defpackage.bc6;
import defpackage.ci8;
import defpackage.di8;
import defpackage.ei8;
import defpackage.snb0;
import defpackage.tje0;
import defpackage.v1b;
import defpackage.vch0;
import defpackage.vtw;
import defpackage.x1b;
import defpackage.y5b;
import defpackage.yzo;
import defpackage.zh8;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class b {
    public static final Object a(vtw vtwVar, x1b x1bVar) throws Throwable {
        bc6 bc6Var = new bc6(1, yzo.b(x1bVar));
        bc6Var.q();
        vtwVar.a(new a.C0203a(new zh8(bc6Var)));
        Object objO = bc6Var.o();
        y5b y5bVar = y5b.a;
        return objO;
    }

    public static final void b(vtw<a> vtwVar) {
        vtwVar.getClass();
        vtwVar.a(a.b.a);
    }

    public static final void c(vtw<a> vtwVar, snb0 snb0Var) {
        vtwVar.getClass();
        vtwVar.a(new a.d(snb0Var));
    }

    public static final Object d(vtw vtwVar, tje0 tje0Var) throws Throwable {
        bc6 bc6Var = new bc6(1, yzo.b(tje0Var));
        bc6Var.q();
        vtwVar.a(new a.e(new ci8(bc6Var)));
        Object objO = bc6Var.o();
        y5b y5bVar = y5b.a;
        return objO;
    }

    public static void e(vtw vtwVar, UiText uiText, UiText uiText2, UiText uiText3, UiText uiText4, ResourceUiText resourceUiText, Integer num, Function1 function1, int i) {
        UiText resourceUiText2;
        UiText uiText5 = (i & 1) != 0 ? null : uiText;
        UiText uiText6 = (i & 2) != 0 ? null : uiText2;
        UiText uiText7 = (i & 4) != 0 ? null : uiText3;
        if ((i & 8) != 0) {
            StringUiText stringUiText = vch0.a;
            resourceUiText2 = new ResourceUiText(R.string.common_functions__ok);
        } else {
            resourceUiText2 = uiText4;
        }
        ResourceUiText resourceUiText3 = (i & 16) != 0 ? null : resourceUiText;
        boolean z = (i & 32) != 0;
        Integer num2 = (i & 64) != 0 ? null : num;
        Function1 function2 = (i & 256) != 0 ? null : function1;
        vtwVar.getClass();
        vtwVar.a(new a.h(uiText5, uiText6, uiText7, resourceUiText2, resourceUiText3, z, num2, null, function2));
    }

    public static Object f(vtw vtwVar, UiText uiText, ResourceUiText resourceUiText, UiText uiText2, UiText uiText3, UiText uiText4, Integer num, Integer num2, v1b v1bVar, int i) {
        UiText resourceUiText2;
        UiText uiText5 = (i & 1) != 0 ? null : uiText;
        ResourceUiText resourceUiText3 = (i & 2) != 0 ? null : resourceUiText;
        UiText uiText6 = (i & 4) != 0 ? null : uiText2;
        if ((i & 8) != 0) {
            StringUiText stringUiText = vch0.a;
            resourceUiText2 = new ResourceUiText(R.string.common_functions__ok);
        } else {
            resourceUiText2 = uiText3;
        }
        UiText uiText7 = (i & 16) != 0 ? null : uiText4;
        boolean z = (i & 32) != 0;
        Integer num3 = (i & 64) != 0 ? null : num;
        Integer num4 = (i & 128) != 0 ? null : num2;
        bc6 bc6Var = new bc6(1, yzo.b(v1bVar));
        bc6Var.q();
        vtwVar.a(new a.h(uiText5, resourceUiText3, uiText6, resourceUiText2, uiText7, z, num3, num4, new di8(bc6Var)));
        Object objO = bc6Var.o();
        y5b y5bVar = y5b.a;
        return objO;
    }

    public static Object g(vtw vtwVar, ResourceUiText resourceUiText, UiText uiText, ResourceUiText resourceUiText2, ResourceUiText resourceUiText3, ResourceUiText resourceUiText4, ResourceUiText resourceUiText5, x1b x1bVar, int i) {
        if ((i & 8) != 0) {
            resourceUiText2 = null;
        }
        if ((i & 16) != 0) {
            resourceUiText3 = null;
        }
        if ((i & 32) != 0) {
            StringUiText stringUiText = vch0.a;
            resourceUiText4 = new ResourceUiText(R.string.common_functions__ok);
        }
        if ((i & 64) != 0) {
            resourceUiText5 = null;
        }
        bc6 bc6Var = new bc6(1, yzo.b(x1bVar));
        bc6Var.q();
        ResourceUiText resourceUiText6 = resourceUiText5;
        vtwVar.a(new a.j(resourceUiText, uiText, resourceUiText2, resourceUiText3, resourceUiText4, resourceUiText6, new ei8(bc6Var)));
        Object objO = bc6Var.o();
        y5b y5bVar = y5b.a;
        return objO;
    }

    public static void h(vtw vtwVar) {
        vtwVar.getClass();
        StringUiText stringUiText = vch0.a;
        e(vtwVar, null, null, new ResourceUiText(R.string.common_feedback__something_went_wrong_please_try_again), null, null, null, null, 251);
    }

    public static void i(vtw vtwVar, UiText uiText, ResourceUiText resourceUiText, Function0 function0, Integer num, int i) {
        ResourceUiText resourceUiText2 = (i & 2) != 0 ? null : resourceUiText;
        Function0 function1 = (i & 4) != 0 ? null : function0;
        Integer num2 = (i & 16) != 0 ? null : num;
        float f = (i & 32) != 0 ? 0.0f : 12.0f;
        float f2 = (i & 64) == 0 ? 60.0f : 0.0f;
        vtwVar.getClass();
        uiText.getClass();
        vtwVar.a(new a.m(uiText, resourceUiText2, function1, num2, f, f2));
    }

    public static final void j(vtw<a> vtwVar, UiText uiText) {
        vtwVar.getClass();
        uiText.getClass();
        vtwVar.a(new a.n(uiText));
    }
}
