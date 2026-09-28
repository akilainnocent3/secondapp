package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ahh {
    public final String a;
    public final String b;
    public final String c;
    public final UiText d;
    public final String e;

    public ahh(UiText uiText, String str, String str2, String str3, String str4) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = uiText;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahh)) {
            return false;
        }
        ahh ahhVar = (ahh) obj;
        return Intrinsics.g(this.a, ahhVar.a) && this.b.equals(ahhVar.b) && this.c.equals(ahhVar.c) && this.d.equals(ahhVar.d) && Intrinsics.g(this.e, ahhVar.e);
    }

    public final int hashCode() {
        int iA = yvf.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("FeedUiModel(id=", this.a, ", headline=", this.b, ", description=");
        sbA.append(this.c);
        sbA.append(", publishedTimeLabel=");
        sbA.append(this.d);
        sbA.append(", imageUrl=");
        return uf80.a(sbA, this.e, ")");
    }
}
