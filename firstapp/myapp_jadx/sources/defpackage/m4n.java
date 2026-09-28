package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.kickoff.matchtracker.component.IbProgressBarKt$IbProgressBar$1$1", f = "IbProgressBar.kt", l = {}, m = "invokeSuspend", v = 2)
public final class m4n extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ int a;
    public final /* synthetic */ isw b;
    public final /* synthetic */ isw c;
    public final /* synthetic */ isw d;
    public final /* synthetic */ isw e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4n(int i, isw iswVar, isw iswVar2, isw iswVar3, isw iswVar4, v1b<? super m4n> v1bVar) {
        super(2, v1bVar);
        this.a = i;
        this.b = iswVar;
        this.c = iswVar2;
        this.d = iswVar3;
        this.e = iswVar4;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new m4n(this.a, this.b, this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((m4n) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        int i = this.a;
        if (i == 1) {
            this.b.A(1.0f);
        } else if (i == 2) {
            this.c.A(1.0f);
        } else if (i == 3) {
            this.d.A(1.0f);
        } else if (i == 4) {
            this.e.A(1.0f);
        }
        return Unit.a;
    }
}
