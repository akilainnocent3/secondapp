package defpackage;

import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Louo;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ouo extends j8i0 {
    public final krm a;
    public final odd b;
    public final b390 c;
    public final r5b d;
    public jvd0 e;
    public final AtomicLong f;
    public final AtomicReference<ruo> i;

    public ouo(krm krmVar, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) odd oddVar) {
        krmVar.getClass();
        this.a = krmVar;
        this.b = oddVar;
        b390 b390VarB = d390.b(0, 3, null, 5);
        this.c = b390VarB;
        this.d = i2i.c(b390VarB, null, 3);
        this.f = new AtomicLong(0L);
        this.i = new AtomicReference<>();
    }

    public static void x1(List list) {
        vuo.a.getClass();
        vuo.b(list).size();
    }
}
