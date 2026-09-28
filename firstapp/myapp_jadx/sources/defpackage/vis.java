package defpackage;

import com.google.protobuf.DescriptorProtos;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.work.ListenableFutureKt$launchFuture$1$2", f = "ListenableFuture.kt", l = {DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER}, m = "invokeSuspend")
public final class vis extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Function2<v5b, v1b<Object>, Object> c;
    public final /* synthetic */ nv5.a<Object> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public vis(Function2<? super v5b, ? super v1b<Object>, ? extends Object> function2, nv5.a<Object> aVar, v1b<? super vis> v1bVar) {
        super(2, v1bVar);
        this.c = function2;
        this.d = aVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        vis visVar = new vis(this.c, this.d, v1bVar);
        visVar.b = obj;
        return visVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((vis) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        nv5.a<Object> aVar = this.d;
        try {
            if (i == 0) {
                uj50.b(obj);
                v5b v5bVar = (v5b) this.b;
                Function2<v5b, v1b<Object>, Object> function2 = this.c;
                this.a = 1;
                obj = function2.invoke(v5bVar, this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            aVar.b(obj);
        } catch (CancellationException unused) {
            aVar.c();
        } catch (Throwable th) {
            aVar.d(th);
        }
        return Unit.a;
    }
}
