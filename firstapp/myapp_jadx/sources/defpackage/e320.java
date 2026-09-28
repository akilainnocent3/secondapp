package defpackage;

import com.sporty.android.book.domain.entity.UIState;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Le320;", "Lj8i0;", "sportybook"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class e320 extends j8i0 {
    public final eck a;
    public final ki80 b;
    public final v1p c;
    public final wwd0 d;
    public final v340 e;
    public final ssw<Boolean> f;
    public final ssw i;

    public e320(eck eckVar, ki80 ki80Var, v1p v1pVar) {
        this.a = eckVar;
        this.b = ki80Var;
        this.c = v1pVar;
        wwd0 wwd0VarA = xwd0.a(UIState.Idle.INSTANCE);
        this.d = wwd0VarA;
        this.e = e1i.b(wwd0VarA);
        ssw<Boolean> sswVar = new ssw<>();
        this.f = sswVar;
        this.i = sswVar;
    }
}
