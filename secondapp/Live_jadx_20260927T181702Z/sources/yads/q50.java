package yads;

import com.yandex.mobile.ads.R;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class q50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f154271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f154272c;

    public q50(int i10, int i11, String str) {
        this.f154270a = str;
        this.f154271b = i10;
        this.f154272c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q50)) {
            return false;
        }
        q50 q50Var = (q50) obj;
        return kotlin.jvm.internal.m0.g(this.f154270a, q50Var.f154270a) && this.f154271b == q50Var.f154271b && this.f154272c == q50Var.f154272c;
    }

    public final int hashCode() {
        return this.f154272c + nd3.a(this.f154271b, this.f154270a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "DebugPanelColoredText(text=" + this.f154270a + ", color=" + this.f154271b + ", style=" + this.f154272c + gi.j.f86771d;
    }

    public /* synthetic */ q50(String str, int i10) {
        this(i10, R.style.DebugPanelText_Body2, str);
    }
}
