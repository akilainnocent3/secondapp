package defpackage;

import com.google.protobuf.Reader;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class ku90<T> implements vtw<T> {
    public final b390 a = d390.b(Reader.READ_DONE, 0, pb5.b, 2);

    @c0d(c = "com.sportybet.android.util.flow.SingleEventSharedFlow", f = "SingleEventSharedFlow.kt", l = {30}, m = "collect", v = 2)
    public static final class a extends x1b {
        public /* synthetic */ Object a;
        public final /* synthetic */ ku90<T> b;
        public int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ku90<T> ku90Var, v1b<? super a> v1bVar) {
            super(v1bVar);
            this.b = ku90Var;
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            this.b.collect(null, this);
            return y5b.a;
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ ku90<T> a;
        public final /* synthetic */ myh<T> b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(ku90<T> ku90Var, myh<? super T> myhVar) {
            this.a = ku90Var;
            this.b = myhVar;
        }

        @Override // defpackage.myh
        public final Object emit(T t, v1b<? super Unit> v1bVar) throws Throwable {
            this.a.h();
            return this.b.emit(t, v1bVar);
        }
    }

    @Override // defpackage.vtw
    public final boolean a(T t) {
        return this.a.a(t);
    }

    @Override // defpackage.vtw
    public final uwd0<Integer> b() {
        return this.a.b();
    }

    @Override // defpackage.a390
    public final List<T> c() {
        return this.a.c();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super T> myhVar, v1b<?> v1bVar) {
        a aVar;
        if (v1bVar instanceof a) {
            aVar = (a) v1bVar;
            int i = aVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.c = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, v1bVar);
            }
        } else {
            aVar = new a(this, v1bVar);
        }
        Object obj = aVar.a;
        y5b y5bVar = y5b.a;
        int i2 = aVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                throw l80.a(obj);
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        b bVar = new b(this, myhVar);
        aVar.c = 1;
        this.a.collect(bVar, aVar);
        return y5bVar;
    }

    @Override // defpackage.vtw, defpackage.myh
    public final Object emit(T t, v1b<? super Unit> v1bVar) {
        return this.a.emit(t, v1bVar);
    }

    @Override // defpackage.vtw
    public final void h() throws Throwable {
        this.a.h();
    }
}
