package androidx.compose.ui.layout;

import defpackage.uk40;
import defpackage.vk40;

/* JADX INFO: loaded from: classes.dex */
public final class m0 implements l0 {
    public final String b;
    public final vk40 c;
    public final vk40 d;

    public m0(String str) {
        this.b = str;
        this.c = new vk40(str);
        this.d = new vk40(str.concat(" maximum"));
    }

    @Override // androidx.compose.ui.layout.l0
    public final uk40 a() {
        return this.d;
    }

    @Override // androidx.compose.ui.layout.l0
    public final uk40 b() {
        return this.c;
    }

    public final String toString() {
        return this.b;
    }
}
