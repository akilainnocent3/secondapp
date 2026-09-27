package z6;

import f6.a1;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public final class j implements a1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f160705b = new j(true);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f160706c = new j(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f160707a;

    public j(boolean z10) {
        this.f160707a = z10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("IncorrectFragmentation{expected=");
        sb2.append(!this.f160707a);
        sb2.append("}");
        return sb2.toString();
    }
}
