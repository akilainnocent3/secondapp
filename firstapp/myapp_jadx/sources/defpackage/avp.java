package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes4.dex */
public final class avp implements j5f0<Bitmap> {
    public final /* synthetic */ g1y a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ bvp e;

    public avp(g1y g1yVar, String str, String str2, Context context, bvp bvpVar) {
        this.a = g1yVar;
        this.b = str;
        this.c = str2;
        this.d = context;
        this.e = bvpVar;
    }

    @Override // defpackage.j5f0
    public final void a(Drawable drawable) {
        this.e.i(this.a, this.c, this.b, this.d);
    }

    @Override // defpackage.j5f0
    public final void b(Bitmap bitmap) {
        g1y g1yVar = this.a;
        g1yVar.e(bitmap);
        e1y e1yVar = new e1y();
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.b = bitmap;
        e1yVar.e = iconCompat;
        e1yVar.f = null;
        e1yVar.g = true;
        e1yVar.b = g1y.b(this.b);
        e1yVar.c = g1y.b(this.c);
        e1yVar.d = true;
        g1yVar.f(e1yVar);
        bvp bvpVar = this.e;
        int i = bvpVar.a;
        bvpVar.a = i + 1;
        p32.h(this.d, i, g1yVar.a());
    }
}
