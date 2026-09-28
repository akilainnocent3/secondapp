package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sporty.android.core.model.cms.CMSResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.repository.imageBOConfigs.BOImageRepositoryImpl$loadFromNetwork$$inlined$filterIsInstanceOrThrow$1", f = "BOImageRepositoryImpl.kt", l = {DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
public final class xq1 extends tje0 implements Function2<myh<? super lk50.c<? extends List<? extends CMSResponse>>>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ zq1 c;

    public static final class a<T> implements myh {
        public final /* synthetic */ myh<T> a;

        public a(myh myhVar) {
            this.a = myhVar;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            if (obj instanceof lk50.c) {
                Object objEmit = this.a.emit(obj, v1bVar);
                return objEmit == y5b.a ? objEmit : Unit.a;
            }
            sza.a(obj, "Expected ", " to be of type ", lk50.c.class, " but wasn't");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xq1(zq1 zq1Var, v1b v1bVar) {
        super(2, v1bVar);
        this.c = zq1Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        xq1 xq1Var = new xq1(this.c, v1bVar);
        xq1Var.b = obj;
        return xq1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super lk50.c<? extends List<? extends CMSResponse>>> myhVar, v1b<? super Unit> v1bVar) {
        return ((xq1) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            a aVar = new a((myh) this.b);
            this.b = null;
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
