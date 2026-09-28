package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.paging.LegacyPageFetcher$scheduleLoad$1", f = "LegacyPageFetcher.jvm.kt", l = {53}, m = "invokeSuspend")
public final class t5s extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ r5s<Object, Object> c;
    public final /* synthetic */ wqz.a<Object> d;
    public final /* synthetic */ kxs e;

    @c0d(c = "androidx.paging.LegacyPageFetcher$scheduleLoad$1$1", f = "LegacyPageFetcher.jvm.kt", l = {}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ wqz.b<Object, Object> a;
        public final /* synthetic */ r5s<Object, Object> b;
        public final /* synthetic */ kxs c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(wqz.b<Object, Object> bVar, r5s<Object, Object> r5sVar, kxs kxsVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.a = bVar;
            this.b = r5sVar;
            this.c = kxsVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.a, this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            r5s<Object, Object> r5sVar = this.b;
            AtomicBoolean atomicBoolean = r5sVar.h;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            wqz.b<Object, Object> bVar = this.a;
            boolean z = bVar instanceof wqz.b.c;
            kxs kxsVar = this.c;
            if (z) {
                r5sVar.a(kxsVar, (wqz.b.c) bVar);
            } else if (bVar instanceof wqz.b.a) {
                Throwable th = ((wqz.b.a) bVar).a;
                if (!atomicBoolean.get()) {
                    r5sVar.i.b(kxsVar, new hxs.a(th));
                }
            } else if (bVar instanceof wqz.b.C1263b) {
                r5sVar.c.c();
                atomicBoolean.set(true);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5s(r5s<Object, Object> r5sVar, wqz.a<Object> aVar, kxs kxsVar, v1b<? super t5s> v1bVar) {
        super(2, v1bVar);
        this.c = r5sVar;
        this.d = aVar;
        this.e = kxsVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        t5s t5sVar = new t5s(this.c, this.d, this.e, v1bVar);
        t5sVar.b = obj;
        return t5sVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((t5s) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        v5b v5bVar;
        r5s<Object, Object> r5sVar = this.c;
        wqz<Object, Object> wqzVar = r5sVar.c;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            v5b v5bVar2 = (v5b) this.b;
            this.b = v5bVar2;
            this.a = 1;
            Object objD = wqzVar.d(this.d, this);
            if (objD == y5bVar) {
                return y5bVar;
            }
            v5bVar = v5bVar2;
            obj = objD;
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v5bVar = (v5b) this.b;
            uj50.b(obj);
        }
        wqz.b bVar = (wqz.b) obj;
        if (wqzVar.a.e) {
            r5sVar.h.set(true);
            return Unit.a;
        }
        ej5.c(v5bVar, r5sVar.d, null, new a(bVar, r5sVar, this.e, null), 2);
        return Unit.a;
    }
}
