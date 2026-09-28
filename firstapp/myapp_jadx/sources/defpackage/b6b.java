package defpackage;

import androidx.work.CoroutineWorker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.work.CoroutineWorker$getForegroundInfoAsync$1", f = "CoroutineWorker.kt", l = {121}, m = "invokeSuspend")
public final class b6b extends tje0 implements Function2<v5b, v1b<? super pti>, Object> {
    public int a;
    public final /* synthetic */ CoroutineWorker b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b6b(CoroutineWorker coroutineWorker, v1b<? super b6b> v1bVar) {
        super(2, v1bVar);
        this.b = coroutineWorker;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new b6b(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super pti> v1bVar) {
        b6b b6bVar = (b6b) create(v5bVar, v1bVar);
        Unit unit = Unit.a;
        b6bVar.invokeSuspend(unit);
        return unit;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            ib5.a("Not implemented");
            return null;
        }
        if (i == 1) {
            uj50.b(obj);
            return obj;
        }
        ib5.a("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
