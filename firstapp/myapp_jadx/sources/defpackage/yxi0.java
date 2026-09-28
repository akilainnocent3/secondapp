package defpackage;

import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.d;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class yxi0 {
    public final ExoPlayer a;
    public final Function1<Integer, Unit> b;
    public io10 c;

    public yxi0(d dVar, Function1 function1) {
        dVar.getClass();
        this.a = dVar;
        this.b = function1;
    }

    public final void a() {
        String str;
        io10 io10Var = this.c;
        if (io10Var == null) {
            return;
        }
        HashMap map = io10Var.b;
        yed yedVar = io10Var.a;
        synchronized (yedVar) {
            str = yedVar.f;
        }
        io10.a aVar = str == null ? null : (io10.a) map.get(str);
        ho10 ho10VarA = aVar == null ? null : aVar.a(false);
        if (ho10VarA == null) {
            int i = 1;
            ho10[] ho10VarArr = new ho10[map.size() + 1];
            ho10VarArr[0] = io10Var.e;
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ho10VarArr[i] = ((io10.a) it.next()).a(false);
                i++;
            }
            ho10VarA = ho10.a(ho10VarArr);
        }
        int i2 = (int) (ho10VarA.N[3] / 1000);
        if (i2 > 0) {
            this.b.invoke(Integer.valueOf(i2));
        }
        try {
            this.a.J(io10Var);
        } catch (IllegalStateException unused) {
        } finally {
            this.c = null;
        }
    }

    public final void b() {
        a();
        io10 io10Var = new io10();
        this.a.M(io10Var);
        this.c = io10Var;
    }
}
