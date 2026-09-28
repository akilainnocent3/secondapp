package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.lifecycle.FlowLiveDataConversions$asLiveData$1", f = "FlowLiveData.kt", l = {78}, m = "invokeSuspend")
public final class h2i extends tje0 implements Function2<yjs<Object>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ lyh<Object> c;

    public static final class a<T> implements myh {
        public final /* synthetic */ yjs<T> a;

        public a(yjs<T> yjsVar) {
            this.a = yjsVar;
        }

        @Override // defpackage.myh
        public final Object emit(T t, v1b<? super Unit> v1bVar) {
            Object objEmit = this.a.emit(t, v1bVar);
            return objEmit == y5b.a ? objEmit : Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2i(lyh<Object> lyhVar, v1b<? super h2i> v1bVar) {
        super(2, v1bVar);
        this.c = lyhVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        h2i h2iVar = new h2i(this.c, v1bVar);
        h2iVar.b = obj;
        return h2iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(yjs<Object> yjsVar, v1b<? super Unit> v1bVar) {
        return ((h2i) create(yjsVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            a aVar = new a((yjs) this.b);
            this.a = 1;
            if (this.c.collect(aVar, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
