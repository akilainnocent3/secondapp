package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.google.firebase.datastorage.JavaDataStorage$putSync$1", f = "JavaDataStorage.kt", l = {132}, m = "invokeSuspend")
public final class w7p extends tje0 implements Function2<v5b, v1b<? super zn20>, Object> {
    public int a;
    public final /* synthetic */ x7p b;
    public final /* synthetic */ zn20.a<Object> c;
    public final /* synthetic */ Long d;

    @c0d(c = "com.google.firebase.datastorage.JavaDataStorage$putSync$1$1", f = "JavaDataStorage.kt", l = {}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<jtw, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ zn20.a<Object> b;
        public final /* synthetic */ Long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(zn20.a aVar, Long l, v1b v1bVar) {
            super(2, v1bVar);
            this.b = aVar;
            this.c = l;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.b, this.c, v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(jtw jtwVar, v1b<? super Unit> v1bVar) {
            return ((a) create(jtwVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            jtw jtwVar = (jtw) this.a;
            jtwVar.getClass();
            jtwVar.h(this.b, this.c);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7p(x7p x7pVar, zn20.a aVar, Long l, v1b v1bVar) {
        super(2, v1bVar);
        this.b = x7pVar;
        this.c = aVar;
        this.d = l;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new w7p(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super zn20> v1bVar) {
        return ((w7p) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        sqc<zn20> sqcVar = this.b.c;
        a aVar = new a(this.c, this.d, null);
        this.a = 1;
        Object objA = do20.a(sqcVar, aVar, this);
        return objA == y5bVar ? y5bVar : objA;
    }
}
