package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class yuv {
    public final ResourceUiText a;
    public final UiText b;
    public final zuv c;

    public yuv(ResourceUiText resourceUiText, UiText uiText, zuv zuvVar) {
        uiText.getClass();
        zuvVar.getClass();
        this.a = resourceUiText;
        this.b = uiText;
        this.c = zuvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yuv)) {
            return false;
        }
        yuv yuvVar = (yuv) obj;
        return Intrinsics.g(this.a, yuvVar.a) && Intrinsics.g(this.b, yuvVar.b) && Intrinsics.g(this.c, yuvVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + yvf.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "MissionRule(title=" + this.a + ", desc=" + this.b + ", descColor=" + this.c + ")";
    }

    public /* synthetic */ yuv(ResourceUiText resourceUiText, ResourceUiText resourceUiText2) {
        this(resourceUiText, resourceUiText2, zuv.b.a);
    }
}
