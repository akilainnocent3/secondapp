package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class m4j0 {
    public final List<w5f0> a;
    public final String b;
    public final List<ds50> c;
    public final dup d;
    public final List<tcf0> e;
    public final UiText f;
    public final UiText g;
    public final boolean h;

    public m4j0(List list, String str, List list2, dup dupVar, List list3, UiText uiText, UiText uiText2, int i) {
        this((List<w5f0>) ((i & 1) != 0 ? m2g.a : list), (i & 2) != 0 ? "" : str, (List<ds50>) ((i & 4) != 0 ? m2g.a : list2), (i & 8) != 0 ? dup.b.a : dupVar, (List<? extends tcf0>) ((i & 16) != 0 ? m2g.a : list3), (i & 32) != 0 ? null : uiText, (i & 64) != 0 ? null : uiText2, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m4j0)) {
            return false;
        }
        m4j0 m4j0Var = (m4j0) obj;
        return Intrinsics.g(this.a, m4j0Var.a) && Intrinsics.g(this.b, m4j0Var.b) && Intrinsics.g(this.c, m4j0Var.c) && Intrinsics.g(this.d, m4j0Var.d) && Intrinsics.g(this.e, m4j0Var.e) && Intrinsics.g(this.f, m4j0Var.f) && Intrinsics.g(this.g, m4j0Var.g) && this.h == m4j0Var.h;
    }

    public final int hashCode() {
        int iA = ai50.a((this.d.hashCode() + ai50.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31, this.e);
        UiText uiText = this.f;
        int iHashCode = (iA + (uiText == null ? 0 : uiText.hashCode())) * 31;
        UiText uiText2 = this.g;
        return Boolean.hashCode(this.h) + ((iHashCode + (uiText2 != null ? uiText2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "WelcomeRewardUiState(tasks=" + this.a + ", taskProgress=" + this.b + ", rewards=" + this.c + ", kycReviewUiType=" + this.d + ", terms=" + this.e + ", dayLeft=" + this.f + ", challengeDayLeft=" + this.g + ", hasShownAllDoneAnimation=" + this.h + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m4j0(List<w5f0> list, String str, List<ds50> list2, dup dupVar, List<? extends tcf0> list3, UiText uiText, UiText uiText2, boolean z) {
        list.getClass();
        str.getClass();
        list2.getClass();
        dupVar.getClass();
        list3.getClass();
        this.a = list;
        this.b = str;
        this.c = list2;
        this.d = dupVar;
        this.e = list3;
        this.f = uiText;
        this.g = uiText2;
        this.h = z;
    }

    public m4j0() {
        this((List) null, (String) null, (List) null, (dup) null, (List) null, (UiText) null, (UiText) null, 255);
    }
}
