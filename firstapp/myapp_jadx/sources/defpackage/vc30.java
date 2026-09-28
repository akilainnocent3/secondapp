package defpackage;

import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class vc30 implements ssd0 {
    public final /* synthetic */ Function2<zrd0, BigDecimal, Unit> a;
    public final /* synthetic */ xc30 b;
    public final /* synthetic */ Function2<zrd0, String, Unit> c;
    public final /* synthetic */ Function1<zrd0, Unit> d;
    public final /* synthetic */ Function1<zrd0, Unit> e;
    public final /* synthetic */ Function2<zrd0, Boolean, Unit> f;

    /* JADX WARN: Multi-variable type inference failed */
    public vc30(Function2<? super zrd0, ? super BigDecimal, Unit> function2, xc30 xc30Var, Function2<? super zrd0, ? super String, Unit> function3, Function1<? super zrd0, Unit> function1, Function1<? super zrd0, Unit> function4, Function2<? super zrd0, ? super Boolean, Unit> function5) {
        this.a = function2;
        this.b = xc30Var;
        this.c = function3;
        this.d = function1;
        this.e = function4;
        this.f = function5;
    }

    @Override // defpackage.ssd0
    public final void a() {
        this.e.invoke(this.b.l);
    }

    @Override // defpackage.ssd0
    public final void b() {
        this.d.invoke(this.b.l);
    }

    @Override // defpackage.ssd0
    public final void c(String str) {
        str.getClass();
        this.c.invoke(this.b.l, str);
    }

    @Override // defpackage.ssd0
    public final void d(boolean z) {
        this.f.invoke(this.b.l, Boolean.valueOf(z));
    }

    @Override // defpackage.ssd0
    public final void e(BigDecimal bigDecimal) {
        this.a.invoke(this.b.l, bigDecimal);
    }
}
