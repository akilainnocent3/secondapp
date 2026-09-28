package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ov50 implements Runnable {
    public final /* synthetic */ bc6 a;
    public final /* synthetic */ lv50 b;
    public final /* synthetic */ qv50.a c;

    @c0d(c = "androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$startTransactionCoroutine$2$1$1", f = "RoomDatabase.android.kt", l = {2087}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ lv50 c;
        public final /* synthetic */ bc6 d;
        public final /* synthetic */ qv50.a e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(lv50 lv50Var, bc6 bc6Var, qv50.a aVar, v1b v1bVar) {
            super(2, v1bVar);
            this.c = lv50Var;
            this.d = bc6Var;
            this.e = aVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.c, this.d, this.e, v1bVar);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            v1b v1bVar;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                CoroutineContext.Element element = ((v5b) this.b).getCoroutineContext().get(d.n);
                element.getClass();
                d dVar = (d) element;
                CoroutineContext coroutineContextPlus = dVar.plus(new fqg0(dVar));
                CoroutineContext coroutineContextPlus2 = coroutineContextPlus.plus(new wof0(coroutineContextPlus, this.c.i));
                zi50.a aVar = zi50.b;
                bc6 bc6Var = this.d;
                this.b = bc6Var;
                this.a = 1;
                obj = ej5.d(coroutineContextPlus2, this.e, this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
                v1bVar = bc6Var;
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                v1bVar = (v1b) this.b;
                uj50.b(obj);
            }
            zi50.a aVar2 = zi50.b;
            v1bVar.resumeWith(obj);
            return Unit.a;
        }
    }

    public ov50(bc6 bc6Var, lv50 lv50Var, qv50.a aVar) {
        this.a = bc6Var;
        this.b = lv50Var;
        this.c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bc6 bc6Var = this.a;
        try {
            dj5.a(bc6Var.e.minusKey(d.n), new a(this.b, bc6Var, this.c, null));
        } catch (Throwable th) {
            bc6Var.cancel(th);
        }
    }
}
