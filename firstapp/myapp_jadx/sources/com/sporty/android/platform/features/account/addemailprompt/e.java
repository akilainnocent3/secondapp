package com.sporty.android.platform.features.account.addemailprompt;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.dispatcher.ApplicationScope;
import defpackage.fe6;
import defpackage.j8i0;
import defpackage.k00;
import defpackage.lyz;
import defpackage.rdd0;
import defpackage.uxs;
import defpackage.v5b;
import defpackage.vch0;
import defpackage.wwd0;
import defpackage.xg;
import defpackage.xq00;
import defpackage.xwd0;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sporty/android/platform/features/account/addemailprompt/e;", "Lj8i0;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class e extends j8i0 {
    public final fe6 a;
    public final lyz b;
    public final rdd0 c;
    public final xq00 d;
    public final v5b e;
    public final wwd0 f;

    public e(fe6 fe6Var, lyz lyzVar, rdd0 rdd0Var, xq00 xq00Var, @ApplicationScope v5b v5bVar) {
        fe6Var.getClass();
        lyzVar.getClass();
        rdd0Var.getClass();
        xq00Var.getClass();
        v5bVar.getClass();
        this.a = fe6Var;
        this.b = lyzVar;
        this.c = rdd0Var;
        this.d = xq00Var;
        this.e = v5bVar;
        this.f = xwd0.a(new c(0));
        rdd0Var.a(xg.a, k00.c);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001f  */
    public final void x1(String str, int i, uxs uxsVar) {
        UiText resourceUiText;
        while (true) {
            wwd0 wwd0Var = this.f;
            Object value = wwd0Var.getValue();
            c cVar = (c) value;
            if (str == null) {
                StringUiText stringUiText = vch0.a;
                resourceUiText = new ResourceUiText(i);
            } else {
                String str2 = str.length() > 0 ? str : null;
                if (str2 != null) {
                    StringUiText stringUiText2 = vch0.a;
                    resourceUiText = new StringUiText(str2);
                } else {
                    StringUiText stringUiText3 = vch0.a;
                    resourceUiText = new ResourceUiText(i);
                }
            }
            UiText uiText = resourceUiText;
            uxs uxsVar2 = uxsVar;
            if (wwd0Var.g(value, c.a(cVar, null, uxsVar2, uiText, null, 9))) {
                return;
            } else {
                uxsVar = uxsVar2;
            }
        }
    }
}
