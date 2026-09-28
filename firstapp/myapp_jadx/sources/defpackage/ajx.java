package defpackage;

import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class ajx {
    public final zix.a a;
    public boolean b;
    public boolean c;
    public int d;
    public String e;
    public boolean f;
    public boolean g;
    public dq7 h;
    public swf i;

    public ajx() {
        zix.a aVar = new zix.a();
        aVar.f = -1;
        aVar.g = -1;
        aVar.h = -1;
        aVar.i = -1;
        this.a = aVar;
        this.d = -1;
    }

    public final void a(int i) {
        this.d = i;
        this.f = false;
    }

    public final void b(String str) {
        if (StringsKt.U(str)) {
            hb5.a("Cannot pop up to an empty route");
        } else {
            this.e = str;
            this.f = false;
        }
    }
}
