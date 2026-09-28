package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.ui.platform.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2", f = "InfiniteAnimationPolicy.kt", l = {66}, m = "invokeSuspend")
public final class zfn extends tje0 implements Function1<v1b<Object>, Object> {
    public int a;
    public final /* synthetic */ Function1<Long, Object> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public zfn(Function1<? super Long, Object> function1, v1b<? super zfn> v1bVar) {
        super(1, v1bVar);
        this.b = function1;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new zfn(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<Object> v1bVar) {
        return ((zfn) create(v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            Object objP = t4w.a(getContext()).P(this.b, this);
            return objP == y5bVar ? y5bVar : objP;
        }
        if (i == 1) {
            uj50.b(obj);
            return obj;
        }
        ib5.a("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
