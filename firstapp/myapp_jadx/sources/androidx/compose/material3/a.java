package androidx.compose.material3;

import androidx.compose.ui.d;
import defpackage.b1h;
import defpackage.b5i;
import defpackage.h1h;
import defpackage.j1h;
import defpackage.k1h;
import defpackage.l1h;
import defpackage.ooa0;
import defpackage.osw;
import defpackage.tac;
import defpackage.wje0;
import defpackage.xa80;
import defpackage.ytw;
import defpackage.z0h;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class a extends b1h {
    public final /* synthetic */ b5i a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ytw<Boolean> c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ ooa0 g;
    public final /* synthetic */ ytw<z0h> h;
    public final /* synthetic */ Function1<Boolean, Unit> i;
    public final /* synthetic */ osw j;
    public final /* synthetic */ osw k;

    /* JADX WARN: Multi-variable type inference failed */
    public a(b5i b5iVar, boolean z, ytw<Boolean> ytwVar, String str, String str2, String str3, ooa0 ooa0Var, ytw<z0h> ytwVar2, Function1<? super Boolean, Unit> function1, osw oswVar, osw oswVar2) {
        this.a = b5iVar;
        this.b = z;
        this.c = ytwVar;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = ooa0Var;
        this.h = ytwVar2;
        this.i = function1;
        this.j = oswVar;
        this.k = oswVar2;
    }

    @Override // defpackage.a1h
    public final d a() {
        b5i b5iVar = this.a;
        d.a aVar = d.a.b;
        d dVarA = androidx.compose.ui.focus.b.a(aVar, b5iVar);
        ytw<z0h> ytwVar = this.h;
        d dVarN = dVarA.n(new ExposedDropdownMenuAnchorElement(new tac(ytwVar, 1)));
        Function1<Boolean, Unit> function1 = this.i;
        boolean z = this.b;
        j1h j1hVar = new j1h(ytwVar, function1, z);
        return dVarN.n(xa80.b(androidx.compose.ui.input.key.a.b(wje0.a(aVar, j1hVar, new k1h(j1hVar)), new l1h(j1hVar, z, this.c)), false, new h1h(z, this.d, this.e, this.f, j1hVar, this.g)));
    }
}
