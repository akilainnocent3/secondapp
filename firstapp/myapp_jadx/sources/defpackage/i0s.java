package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.paging.compose.LazyPagingItemsKt$collectAsLazyPagingItems$1$1", f = "LazyPagingItems.kt", l = {210, 212}, m = "invokeSuspend")
public final class i0s extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ CoroutineContext b;
    public final /* synthetic */ h0s<Object> c;

    @c0d(c = "androidx.paging.compose.LazyPagingItemsKt$collectAsLazyPagingItems$1$1$1", f = "LazyPagingItems.kt", l = {213}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ h0s<Object> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h0s<Object> h0sVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = h0sVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object obj2 = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                h0s<Object> h0sVar = this.b;
                Object objB = kzh.b(h0sVar.a, new g0s(h0sVar, null), this);
                if (objB != obj2) {
                    objB = Unit.a;
                }
                if (objB == obj2) {
                    return obj2;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0s(CoroutineContext coroutineContext, h0s<Object> h0sVar, v1b<? super i0s> v1bVar) {
        super(2, v1bVar);
        this.b = coroutineContext;
        this.c = h0sVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new i0s(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((i0s) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        if (r6 == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if (defpackage.ej5.d(r1, r7, r6) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        return r0;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r6.a
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L18
            if (r1 == r4) goto L14
            if (r1 != r3) goto Le
            goto L14
        Le:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r2
        L14:
            defpackage.uj50.b(r7)
            goto L4a
        L18:
            defpackage.uj50.b(r7)
            kotlin.coroutines.e r7 = kotlin.coroutines.e.a
            kotlin.coroutines.CoroutineContext r1 = r6.b
            boolean r7 = kotlin.jvm.internal.Intrinsics.g(r1, r7)
            h0s<java.lang.Object> r5 = r6.c
            if (r7 == 0) goto L3c
            r6.a = r4
            lyh<kqz<T>> r7 = r5.a
            g0s r1 = new g0s
            r1.<init>(r5, r2)
            java.lang.Object r6 = defpackage.kzh.b(r7, r1, r6)
            if (r6 != r0) goto L37
            goto L39
        L37:
            kotlin.Unit r6 = kotlin.Unit.a
        L39:
            if (r6 != r0) goto L4a
            goto L49
        L3c:
            i0s$a r7 = new i0s$a
            r7.<init>(r5, r2)
            r6.a = r3
            java.lang.Object r6 = defpackage.ej5.d(r1, r7, r6)
            if (r6 != r0) goto L4a
        L49:
            return r0
        L4a:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i0s.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
