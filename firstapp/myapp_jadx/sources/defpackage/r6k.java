package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes5.dex */
public final class r6k {
    public final a2k a;
    public final j1b b;
    public jvd0 c;

    @c0d(c = "com.sportybet.android.helper.GetGeoUseCase$execute$1", f = "GetGeoUseCase.kt", l = {DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = r6k.this.new a(v1bVar);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object bVar;
            y5b y5bVar = y5b.a;
            int i = this.a;
            try {
                if (i == 0) {
                    uj50.b(obj);
                    r6k r6kVar = r6k.this;
                    zi50.a aVar = zi50.b;
                    a2k a2kVar = r6kVar.a;
                    this.b = null;
                    this.a = 1;
                    obj = a2kVar.a(this);
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
                bVar = (ResponseBody) obj;
                zi50.a aVar2 = zi50.b;
            } catch (Throwable th) {
                zi50.a aVar3 = zi50.b;
                bVar = new zi50.b(th);
            }
            Throwable thA = zi50.a(bVar);
            if (thA != null) {
                itf0.a aVar4 = itf0.a;
                aVar4.q(MyLog.TAG_GEO);
                aVar4.h(thA);
            }
            return Unit.a;
        }
    }

    public static final class b extends kotlin.coroutines.a implements l5b {
        @Override // defpackage.l5b
        public final void handleException(CoroutineContext coroutineContext, Throwable th) {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_GEO);
            aVar.e(th);
        }
    }

    public r6k(a2k a2kVar, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) k5b k5bVar) {
        a2kVar.getClass();
        this.a = a2kVar;
        this.b = w5b.a(k5bVar.plus(new b(l5b.a.a)));
    }

    public final void a() {
        jvd0 jvd0Var = this.c;
        if (jvd0Var == null || !jvd0Var.isActive()) {
            this.c = ej5.c(this.b, null, null, new a(null), 3);
        }
    }
}
