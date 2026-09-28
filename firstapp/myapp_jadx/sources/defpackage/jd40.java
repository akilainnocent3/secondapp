package defpackage;

import com.google.protobuf.DescriptorProtos;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.recap.data.manager.RecapDataManagerImpl$observeLanguageChanges$1", f = "RecapDataManagerImpl.kt", l = {DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
public final class jd40 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ mgb0 b;
    public final /* synthetic */ kd40 c;

    public static final class a<T> implements myh {
        public final /* synthetic */ kd40 a;

        public a(kd40 kd40Var) {
            this.a = kd40Var;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            wwd0 wwd0Var = this.a.b;
            o2g o2gVar = o2g.a;
            o2gVar.getClass();
            wwd0Var.getClass();
            wwd0Var.k(null, o2gVar);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jd40(mgb0 mgb0Var, kd40 kd40Var, v1b<? super jd40> v1bVar) {
        super(2, v1bVar);
        this.b = mgb0Var;
        this.c = kd40Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new jd40(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((jd40) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            d0i d0iVarA = fc4.a(uzh.b(this.b.getLanguageFlow()), 1);
            a aVar = new a(this.c);
            this.a = 1;
            if (d0iVarA.collect(aVar, this) == y5bVar) {
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
