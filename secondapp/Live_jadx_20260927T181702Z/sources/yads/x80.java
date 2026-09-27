package yads;

import com.yandex.mobile.ads.R;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class x80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f157712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f157713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f157714c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f157715d;

    public x80(String str, int i10, Integer num, int i11) {
        this.f157712a = str;
        this.f157713b = i10;
        this.f157714c = num;
        this.f157715d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x80)) {
            return false;
        }
        x80 x80Var = (x80) obj;
        return kotlin.jvm.internal.m0.g(this.f157712a, x80Var.f157712a) && this.f157713b == x80Var.f157713b && kotlin.jvm.internal.m0.g(this.f157714c, x80Var.f157714c) && this.f157715d == x80Var.f157715d;
    }

    public final int hashCode() {
        int iA = nd3.a(this.f157713b, this.f157712a.hashCode() * 31, 31);
        Integer num = this.f157714c;
        return this.f157715d + ((iA + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        return "DebugPanelTextWithIcon(text=" + this.f157712a + ", color=" + this.f157713b + ", icon=" + this.f157714c + ", style=" + this.f157715d + gi.j.f86771d;
    }

    public /* synthetic */ x80(String str, int i10, Integer num, int i11, int i12) {
        this(str, (i12 & 2) != 0 ? R.attr.debug_panel_label_primary : i10, (i12 & 4) != 0 ? null : num, (i12 & 8) != 0 ? R.style.DebugPanelText_Body1 : i11);
    }
}
