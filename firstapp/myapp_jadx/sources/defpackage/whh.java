package defpackage;

import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class whh {
    public final bhh a;
    public final wf00<bhh, ijf0> b;
    public final uxs c;
    public final UiText d;
    public final int e;
    public final boolean f;
    public final xgh g;
    public final boolean h;

    public whh(int i, StringUiText stringUiText) {
        bhh bhhVar = bhh.SuggestFeature;
        uag uagVar = bhh.f;
        int iA = jpu.a(l48.r(uagVar, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA < 16 ? 16 : iA);
        q3.b bVar = new q3.b();
        while (bVar.hasNext()) {
            Object next = bVar.next();
            linkedHashMap.put(next, new ijf0("", 0L, 6));
        }
        this(bhhVar, a4h.g(linkedHashMap), uxs.DISABLE, (i & 8) != 0 ? vch0.a : stringUiText, (i & 16) != 0 ? 0 : 60, false, xgh.c.a);
    }

    public static whh a(whh whhVar, bhh bhhVar, wf00 wf00Var, uxs uxsVar, StringUiText stringUiText, boolean z, xgh xghVar, int i) {
        if ((i & 1) != 0) {
            bhhVar = whhVar.a;
        }
        bhh bhhVar2 = bhhVar;
        if ((i & 2) != 0) {
            wf00Var = whhVar.b;
        }
        wf00 wf00Var2 = wf00Var;
        if ((i & 4) != 0) {
            uxsVar = whhVar.c;
        }
        uxs uxsVar2 = uxsVar;
        UiText uiText = stringUiText;
        if ((i & 8) != 0) {
            uiText = whhVar.d;
        }
        UiText uiText2 = uiText;
        int i2 = whhVar.e;
        if ((i & 32) != 0) {
            z = whhVar.f;
        }
        boolean z2 = z;
        if ((i & 64) != 0) {
            xghVar = whhVar.g;
        }
        xgh xghVar2 = xghVar;
        whhVar.getClass();
        bhhVar2.getClass();
        wf00Var2.getClass();
        uxsVar2.getClass();
        uiText2.getClass();
        xghVar2.getClass();
        return new whh(bhhVar2, wf00Var2, uxsVar2, uiText2, i2, z2, xghVar2);
    }

    public final ijf0 b() {
        ijf0 ijf0Var = this.b.get(this.a);
        return ijf0Var == null ? new ijf0("", 0L, 6) : ijf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof whh)) {
            return false;
        }
        whh whhVar = (whh) obj;
        return this.a == whhVar.a && Intrinsics.g(this.b, whhVar.b) && this.c == whhVar.c && Intrinsics.g(this.d, whhVar.d) && this.e == whhVar.e && this.f == whhVar.f && Intrinsics.g(this.g, whhVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + mtg0.a(gpp.a(this.e, yvf.a(y45.a(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31, this.d), 31), 31, this.f);
    }

    public final String toString() {
        return "FeedbackFormState(selectedCategory=" + this.a + ", feedbackByCategory=" + this.b + ", submitStatus=" + this.c + ", lengthLimit=" + this.d + ", minimumLength=" + this.e + ", textFieldError=" + this.f + ", feedBackDialogAction=" + this.g + ")";
    }

    public whh(bhh bhhVar, wf00<bhh, ijf0> wf00Var, uxs uxsVar, UiText uiText, int i, boolean z, xgh xghVar) {
        bhhVar.getClass();
        wf00Var.getClass();
        uiText.getClass();
        xghVar.getClass();
        this.a = bhhVar;
        this.b = wf00Var;
        this.c = uxsVar;
        this.d = uiText;
        this.e = i;
        this.f = z;
        this.g = xghVar;
        this.h = uxsVar != uxs.LOADING;
    }

    public whh() {
        this(127, null);
    }
}
