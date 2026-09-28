package defpackage;

import android.net.Uri;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.share.domain.ShowOffShareImagesResolver$resolve$3", f = "ShowOffShareImagesResolver.kt", l = {}, m = "invokeSuspend", v = 2)
public final class db90 extends tje0 implements gaj<g090, g090, v1b<? super Pair<? extends String, ? extends String>>, Object> {
    public /* synthetic */ g090 a;
    public /* synthetic */ g090 b;

    @Override // defpackage.gaj
    public final Object invoke(g090 g090Var, g090 g090Var2, v1b<? super Pair<? extends String, ? extends String>> v1bVar) {
        db90 db90Var = new db90(3, v1bVar);
        db90Var.a = g090Var;
        db90Var.b = g090Var2;
        return db90Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Uri uri;
        Uri uri2;
        g090 g090Var = this.a;
        g090 g090Var2 = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        String string = null;
        g090.b bVar = g090Var instanceof g090.b ? (g090.b) g090Var : null;
        String string2 = (bVar == null || (uri2 = bVar.a) == null) ? null : uri2.toString();
        g090.b bVar2 = g090Var2 instanceof g090.b ? (g090.b) g090Var2 : null;
        if (bVar2 != null && (uri = bVar2.a) != null) {
            string = uri.toString();
        }
        return new Pair(string2, string);
    }
}
