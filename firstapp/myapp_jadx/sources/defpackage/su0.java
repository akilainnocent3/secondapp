package defpackage;

import com.google.protobuf.DescriptorProtos;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class su0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @c0d(c = "com.sporty.android.common.network.data.AppendStateStrategyKt$appendStateFlow$1", f = "AppendStateStrategy.kt", l = {DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER, DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class a<T> extends tje0 implements Function2<myh<? super T>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ Function1<v1b<? super T>, Object> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super v1b<? super T>, ? extends Object> function1, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.d = function1;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.d, v1bVar);
            aVar.c = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, v1b<? super Unit> v1bVar) {
            return ((a) create((myh) obj, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
        
            if (r0.emit(r7, r6) == r1) goto L15;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.c
                myh r0 = (defpackage.myh) r0
                y5b r1 = defpackage.y5b.a
                int r2 = r6.b
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L21
                if (r2 == r4) goto L1b
                if (r2 != r3) goto L15
                defpackage.uj50.b(r7)
                goto L40
            L15:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r6)
                return r5
            L1b:
                myh r0 = r6.a
                defpackage.uj50.b(r7)
                goto L33
            L21:
                defpackage.uj50.b(r7)
                r6.c = r5
                r6.a = r0
                r6.b = r4
                kotlin.jvm.functions.Function1<v1b<? super T>, java.lang.Object> r7 = r6.d
                java.lang.Object r7 = r7.invoke(r6)
                if (r7 != r1) goto L33
                goto L3f
            L33:
                r6.c = r5
                r6.a = r5
                r6.b = r3
                java.lang.Object r6 = r0.emit(r7, r6)
                if (r6 != r1) goto L40
            L3f:
                return r1
            L40:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: su0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @c0d(c = "com.sporty.android.common.network.data.AppendStateStrategyKt$appendStateFlow$2", f = "AppendStateStrategy.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b<T> extends tje0 implements Function2<lk50<? extends T>, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ ztw<lk50<T>> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ztw<lk50<T>> ztwVar, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.b = ztwVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = new b(this.b, v1bVar);
            bVar.a = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, v1b<? super Unit> v1bVar) {
            return ((b) create((lk50) obj, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            lk50 lk50Var = (lk50) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            su0.b(this.b, lk50Var);
            return Unit.a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @c0d(c = "com.sporty.android.common.network.data.AppendStateStrategyKt$appendStateFlow$3", f = "AppendStateStrategy.kt", l = {49, 49}, m = "invokeSuspend", v = 2)
    public static final class c<T> extends tje0 implements Function2<myh<? super T>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ Function1<v1b<? super T>, Object> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Function1<? super v1b<? super T>, ? extends Object> function1, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.d = function1;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            c cVar = new c(this.d, v1bVar);
            cVar.c = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, v1b<? super Unit> v1bVar) {
            return ((c) create((myh) obj, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
        
            if (r0.emit(r7, r6) == r1) goto L15;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.c
                myh r0 = (defpackage.myh) r0
                y5b r1 = defpackage.y5b.a
                int r2 = r6.b
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L21
                if (r2 == r4) goto L1b
                if (r2 != r3) goto L15
                defpackage.uj50.b(r7)
                goto L40
            L15:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r6)
                return r5
            L1b:
                myh r0 = r6.a
                defpackage.uj50.b(r7)
                goto L33
            L21:
                defpackage.uj50.b(r7)
                r6.c = r5
                r6.a = r0
                r6.b = r4
                kotlin.jvm.functions.Function1<v1b<? super T>, java.lang.Object> r7 = r6.d
                java.lang.Object r7 = r7.invoke(r6)
                if (r7 != r1) goto L33
                goto L3f
            L33:
                r6.c = r5
                r6.a = r5
                r6.b = r3
                java.lang.Object r6 = r0.emit(r7, r6)
                if (r6 != r1) goto L40
            L3f:
                return r1
            L40:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: su0.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @c0d(c = "com.sporty.android.common.network.data.AppendStateStrategyKt$appendStateFlow$4", f = "AppendStateStrategy.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d<T> extends tje0 implements Function2<lk50<? extends T>, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ ztw<lk50<T>> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ztw<lk50<T>> ztwVar, v1b<? super d> v1bVar) {
            super(2, v1bVar);
            this.b = ztwVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            d dVar = new d(this.b, v1bVar);
            dVar.a = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, v1b<? super Unit> v1bVar) {
            return ((d) create((lk50) obj, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            lk50 lk50Var = (lk50) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            su0.b(this.b, lk50Var);
            return Unit.a;
        }
    }

    public static final <T> lyh<lk50<T>> a(ztw<lk50<T>> ztwVar, pu0 pu0Var, Function1<? super v1b<? super T>, ? extends Object> function1) {
        ztwVar.getClass();
        pu0Var.getClass();
        if (pu0Var instanceof pu0.a) {
            lk50<T> value = ztwVar.getValue();
            lk50.c cVar = value instanceof lk50.c ? (lk50.c) value : null;
            if (cVar == null || bm50.k(cVar, ((pu0.a) pu0Var).a)) {
                return new g1i(bm50.a(new or60(new a(function1, null))), new b(ztwVar, null));
            }
        } else if (!pu0Var.equals(pu0.b.a)) {
            if (pu0Var.equals(pu0.c.a)) {
                return new g1i(bm50.a(new or60(new c(function1, null))), new d(ztwVar, null));
            }
            uhc.a();
            return null;
        }
        return ztwVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void b(ztw<lk50<T>> ztwVar, lk50<? extends T> lk50Var) {
        if (!(ztwVar.getValue() instanceof lk50.c)) {
            ztwVar.setValue(lk50Var);
        } else if (lk50Var instanceof lk50.c) {
            ztwVar.setValue(lk50Var);
        }
    }
}
