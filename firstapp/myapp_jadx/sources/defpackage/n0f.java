package defpackage;

import android.content.Context;
import android.net.Uri;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.d;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class n0f {
    public final Context a;
    public final br5 b;
    public d c;

    public n0f(Context context, br5 br5Var) {
        this.a = context;
        this.b = br5Var;
    }

    public final d a() {
        ExoPlayer.b bVar = new ExoPlayer.b(this.a);
        gr5.a aVar = new gr5.a();
        aVar.a = this.b;
        aVar.c = new idd.a();
        ged gedVar = new ged(aVar);
        ly0.f(!bVar.w);
        bVar.d = new axg(gedVar);
        d dVarA = bVar.a();
        dVarA.H0(new r21(4, 14));
        return dVarA;
    }

    public final void b(String str) {
        str.getClass();
        if (StringsKt.U(str)) {
            return;
        }
        d dVarA = this.c;
        if (dVarA == null) {
            dVarA = a();
            this.c = dVarA;
        }
        dVarA.M0();
        dVarA.i();
        dVarA.p0(njv.a(Uri.parse(str)));
        dVarA.d();
        dVarA.T();
    }

    public final void c() {
        if (this.c != null) {
            return;
        }
        this.c = a();
    }

    public final void d() {
        d dVar = this.c;
        if (dVar != null) {
            dVar.release();
        }
        this.c = null;
    }

    public final void e() {
        d dVar = this.c;
        if (dVar != null) {
            dVar.M0();
        }
    }
}
