package defpackage;

import com.google.protobuf.DescriptorProtos;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.common.ui.SideEffectUtilsKt$CollectSharedFlowWithLifecycle$1$1", f = "SideEffectUtils.kt", l = {22}, m = "invokeSuspend", v = 1)
public final class kd90 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ ibs b;
    public final /* synthetic */ a390<Object> c;
    public final /* synthetic */ ytw d;

    @c0d(c = "com.sportygames.common.ui.SideEffectUtilsKt$CollectSharedFlowWithLifecycle$1$1$1", f = "SideEffectUtils.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ a390<Object> b;
        public final /* synthetic */ ytw c;

        /* JADX INFO: renamed from: kd90$a$a, reason: collision with other inner class name */
        public static final class C0757a<T> implements myh {
            public final /* synthetic */ ytw a;

            public C0757a(ytw ytwVar) {
                this.a = ytwVar;
            }

            @Override // defpackage.myh
            public final Object emit(T t, v1b<? super Unit> v1bVar) {
                Object objInvoke = ((Function2) this.a.getValue()).invoke(t, v1bVar);
                return objInvoke == y5b.a ? objInvoke : Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(a390 a390Var, ytw ytwVar, v1b v1bVar) {
            super(2, v1bVar);
            this.b = a390Var;
            this.c = ytwVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            return y5b.a;
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                C0757a c0757a = new C0757a(this.c);
                this.a = 1;
                if (this.b.collect(c0757a, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            fkd.a();
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kd90(ibs ibsVar, a390 a390Var, ytw ytwVar, v1b v1bVar) {
        super(2, v1bVar);
        s9s.b bVar = s9s.b.a;
        this.b = ibsVar;
        this.c = a390Var;
        this.d = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        s9s.b bVar = s9s.b.a;
        return new kd90(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((kd90) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            s9s lifecycle = this.b.getLifecycle();
            s9s.b bVar = s9s.b.d;
            a aVar = new a(this.c, this.d, null);
            this.a = 1;
            if (m850.a(lifecycle, bVar, aVar, this) == y5bVar) {
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
