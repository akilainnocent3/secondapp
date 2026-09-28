package defpackage;

import androidx.compose.animation.d;
import androidx.compose.animation.g;
import androidx.compose.runtime.a;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class tga extends zgx<sga.a> {
    public final sga i;
    public final iaj<pf0, ifx, a, Integer, Unit> j;
    public Function1<d<ifx>, s9g> k;
    public Function1<d<ifx>, g> l;
    public Function1<d<ifx>, s9g> m;
    public Function1<d<ifx>, g> n;

    public tga(sga sgaVar, String str, op8 op8Var) {
        super(sgaVar, -1, str);
        this.i = sgaVar;
        this.j = op8Var;
    }

    @Override // defpackage.zgx
    public final ygx a() {
        sga.a aVar = (sga.a) super.a();
        aVar.v = this.k;
        aVar.w = this.l;
        aVar.y = this.m;
        aVar.z = this.n;
        return aVar;
    }

    @Override // defpackage.zgx
    public final ygx b() {
        return new sga.a(this.i, this.j);
    }

    public tga(sga sgaVar, dq7 dq7Var, Map map, iaj iajVar) {
        super(sgaVar, dq7Var, (Map<qhp, djx<?>>) map);
        this.i = sgaVar;
        this.j = iajVar;
    }
}
