package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.d;
import androidx.media3.exoplayer.k;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class jfd implements f850 {
    public final Context a;
    public final aed b;

    public jfd(Context context) {
        this.a = context;
        this.b = new aed(context);
    }

    @Override // defpackage.f850
    public final k[] a(Handler handler, d.a aVar, d.a aVar2, d.a aVar3, d.a aVar4) {
        ArrayList arrayList = new ArrayList();
        Context context = this.a;
        ljv.c cVar = new ljv.c(context);
        aed aedVar = this.b;
        cVar.c = aedVar;
        cVar.d = 5000L;
        cVar.e = handler;
        cVar.f = aVar;
        cVar.g = 50;
        ly0.f(!cVar.b);
        Handler handler2 = cVar.e;
        ly0.f((handler2 == null && cVar.f == null) || !(handler2 == null || cVar.f == null));
        cVar.b = true;
        arrayList.add(new ljv(cVar));
        tad.d dVar = new tad.d(context);
        ly0.f(!dVar.d);
        dVar.d = true;
        if (dVar.c == null) {
            dVar.c = new tad.f(new j31[0]);
        }
        if (dVar.f == null) {
            dVar.f = new oad(context);
        }
        arrayList.add(new wiv(this.a, aedVar, handler, aVar2, new tad(dVar)));
        arrayList.add(new zlf0(aVar3, handler.getLooper()));
        Looper looper = handler.getLooper();
        arrayList.add(new dpv(aVar4, looper));
        arrayList.add(new dpv(aVar4, looper));
        arrayList.add(new w26());
        arrayList.add(new lan(new me4.a(context)));
        return (k[]) arrayList.toArray(new k[0]);
    }

    @Override // defpackage.f850
    public final void b(k kVar) {
        kVar.getClass();
    }
}
