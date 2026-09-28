package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.gestures.ScrollingLogic$onScrollStopped$performFling$1", f = "Scrollable.kt", l = {765, 768, 771}, m = "invokeSuspend")
public final class ur70 extends tje0 implements Function2<exh0, v1b<? super exh0>, Object> {
    public long a;
    public int b;
    public /* synthetic */ long c;
    public final /* synthetic */ wr70 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ur70(wr70 wr70Var, v1b<? super ur70> v1bVar) {
        super(2, v1bVar);
        this.d = wr70Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ur70 ur70Var = new ur70(this.d, v1bVar);
        ur70Var.c = ((exh0) obj).a;
        return ur70Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(exh0 exh0Var, v1b<? super exh0> v1bVar) {
        long j = exh0Var.a;
        ur70 ur70Var = new ur70(this.d, v1bVar);
        ur70Var.c = j;
        return ur70Var.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006e  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        y5b y5bVar = y5b.a;
        int i = this.b;
        wr70 wr70Var = this.d;
        if (i == 0) {
            uj50.b(obj);
            j = this.c;
            glx glxVar = wr70Var.f;
            this.c = j;
            this.b = 1;
            obj = glxVar.b(j, this);
            if (obj != y5bVar) {
            }
            return y5bVar;
        }
        if (i == 1) {
            j = this.c;
            uj50.b(obj);
        } else {
            if (i == 2) {
                j2 = this.a;
                j = this.c;
                uj50.b(obj);
                j3 = ((exh0) obj).a;
                glx glxVar2 = wr70Var.f;
                long jD = exh0.d(j2, j3);
                this.c = j;
                this.a = j3;
                this.b = 3;
                obj = glxVar2.a(jD, j3, this);
                if (obj != y5bVar) {
                    j4 = j;
                    j5 = j3;
                }
                return y5bVar;
            }
            if (i != 3) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j5 = this.a;
            j4 = this.c;
            uj50.b(obj);
        }
        return new exh0(exh0.d(j4, exh0.d(j5, ((exh0) obj).a)));
        long jD2 = exh0.d(j, ((exh0) obj).a);
        this.c = j;
        this.a = jD2;
        this.b = 2;
        obj = wr70Var.a(jD2, this);
        if (obj != y5bVar) {
            j2 = jD2;
            j3 = ((exh0) obj).a;
            glx glxVar3 = wr70Var.f;
            long jD3 = exh0.d(j2, j3);
            this.c = j;
            this.a = j3;
            this.b = 3;
            obj = glxVar3.a(jD3, j3, this);
            if (obj != y5bVar) {
                j4 = j;
                j5 = j3;
                return new exh0(exh0.d(j4, exh0.d(j5, ((exh0) obj).a)));
            }
        }
        return y5bVar;
    }
}
