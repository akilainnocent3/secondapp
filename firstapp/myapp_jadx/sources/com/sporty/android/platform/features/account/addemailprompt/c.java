package com.sporty.android.platform.features.account.addemailprompt;

import com.sporty.android.common_ui.uitext.UiText;
import defpackage.ijf0;
import defpackage.uxs;
import defpackage.vch0;
import defpackage.y45;
import defpackage.yvf;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c {
    public final ijf0 a;
    public final uxs b;
    public final UiText c;
    public final d d;

    public c(int i) {
        this(new ijf0((String) null, 0L, 7), uxs.DISABLE, vch0.a, d.a.a);
    }

    public static c a(c cVar, ijf0 ijf0Var, uxs uxsVar, UiText uiText, d.b bVar, int i) {
        if ((i & 1) != 0) {
            ijf0Var = cVar.a;
        }
        if ((i & 4) != 0) {
            uiText = cVar.c;
        }
        d dVar = bVar;
        if ((i & 8) != 0) {
            dVar = cVar.d;
        }
        cVar.getClass();
        ijf0Var.getClass();
        uiText.getClass();
        dVar.getClass();
        return new c(ijf0Var, uxsVar, uiText, dVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.g(this.a, cVar.a) && this.b == cVar.b && Intrinsics.g(this.c, cVar.c) && Intrinsics.g(this.d, cVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + yvf.a(y45.a(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        return "AddEmailPromptState(email=" + this.a + ", buttonStatus=" + this.b + ", textFieldError=" + this.c + ", step=" + this.d + ")";
    }

    public c(ijf0 ijf0Var, uxs uxsVar, UiText uiText, d dVar) {
        uiText.getClass();
        dVar.getClass();
        this.a = ijf0Var;
        this.b = uxsVar;
        this.c = uiText;
        this.d = dVar;
    }

    public c() {
        this(0);
    }
}
