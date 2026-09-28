package defpackage;

import androidx.compose.ui.layout.f;
import androidx.compose.ui.layout.k0;

/* JADX INFO: loaded from: classes.dex */
public final class vk40 implements uk40 {
    public final String a;
    public final k0 b = new k0(null);
    public final f c = new f(null);
    public final k0 d = new k0(null);
    public final f e = new f(null);

    public vk40(String str) {
        this.a = str;
    }

    @Override // defpackage.uk40
    public final k0 a() {
        return this.b;
    }

    @Override // defpackage.uk40
    public final f b() {
        return this.c;
    }

    @Override // defpackage.uk40
    public final f c() {
        return this.e;
    }

    @Override // defpackage.uk40
    public final k0 d() {
        return this.d;
    }

    public final String toString() {
        return zdf0.a(')', "RectRulers(", this.a);
    }
}
