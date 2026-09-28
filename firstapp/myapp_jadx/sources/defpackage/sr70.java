package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2", f = "Scrollable.kt", l = {837}, m = "invokeSuspend")
public final class sr70 extends tje0 implements Function2<olx, v1b<? super Unit>, Object> {
    public wr70 a;
    public cq40 b;
    public long c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ wr70 f;
    public final /* synthetic */ cq40 i;
    public final /* synthetic */ long v;

    public static final class a implements tp70 {
        public final /* synthetic */ wr70 a;
        public final /* synthetic */ olx b;

        public a(olx olxVar, wr70 wr70Var) {
            this.a = wr70Var;
            this.b = olxVar;
        }

        @Override // defpackage.tp70
        public final float e(float f) {
            wr70 wr70Var = this.a;
            boolean zBooleanValue = ((Boolean) wr70Var.h.invoke()).booleanValue();
            if (Math.abs(f) != 0.0f && !zBooleanValue) {
                throw new xvh("The fling animation was cancelled");
            }
            return wr70Var.d(wr70Var.g(this.b.b(2, wr70Var.e(wr70Var.h(f)))));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sr70(wr70 wr70Var, cq40 cq40Var, long j, v1b<? super sr70> v1bVar) {
        super(2, v1bVar);
        this.f = wr70Var;
        this.i = cq40Var;
        this.v = j;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        sr70 sr70Var = new sr70(this.f, this.i, this.v, v1bVar);
        sr70Var.e = obj;
        return sr70Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(olx olxVar, v1b<? super Unit> v1bVar) {
        return ((sr70) create(olxVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        wr70 wr70Var;
        cq40 cq40Var;
        wr70 wr70Var2;
        long j;
        y5b y5bVar = y5b.a;
        int i = this.d;
        if (i == 0) {
            uj50.b(obj);
            olx olxVar = (olx) this.e;
            wr70Var = this.f;
            a aVar = new a(olxVar, wr70Var);
            svh svhVar = wr70Var.c;
            cq40Var = this.i;
            long j2 = cq40Var.a;
            i3z i3zVar = wr70Var.d;
            i3z i3zVar2 = i3z.b;
            long j3 = this.v;
            float fD = wr70Var.d(i3zVar == i3zVar2 ? exh0.b(j3) : exh0.c(j3));
            this.e = wr70Var;
            this.a = wr70Var;
            this.b = cq40Var;
            this.c = j2;
            this.d = 1;
            obj = svhVar.a(aVar, fD, this);
            if (obj == y5bVar) {
                return y5bVar;
            }
            wr70Var2 = wr70Var;
            j = j2;
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.c;
            cq40Var = this.b;
            wr70Var = this.a;
            wr70Var2 = (wr70) this.e;
            uj50.b(obj);
        }
        float fD2 = wr70Var2.d(((Number) obj).floatValue());
        cq40Var.a = wr70Var.d == i3z.b ? exh0.a(fD2, 0.0f, 2, j) : exh0.a(0.0f, fD2, 1, j);
        return Unit.a;
    }
}
