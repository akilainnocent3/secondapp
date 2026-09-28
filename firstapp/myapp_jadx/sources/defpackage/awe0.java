package defpackage;

import com.sportygames.common.framework.network.HTTPResponse;
import com.sportygames.goldmine.data.dto.TGGiftDTO;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final class awe0 implements lyh<TGGiftDTO> {
    public final /* synthetic */ lyh a;

    public static final class a<T> implements myh {
        public final /* synthetic */ myh a;

        /* JADX INFO: renamed from: awe0$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportygames.goldmine.usecase.TGGetUserUseCase$giftFlow$$inlined$map$1$2", f = "TGGetUserUseCase.kt", l = {50}, m = "emit", v = 1)
        public static final class C0103a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C0103a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(myh myhVar) {
            this.a = myhVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) throws wjd0 {
            C0103a c0103a;
            if (v1bVar instanceof C0103a) {
                c0103a = (C0103a) v1bVar;
                int i = c0103a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0103a.b = i - Integer.MIN_VALUE;
                } else {
                    c0103a = new C0103a(v1bVar);
                }
            } else {
                c0103a = new C0103a(v1bVar);
            }
            Object obj2 = c0103a.a;
            y5b y5bVar = y5b.a;
            int i2 = c0103a.b;
            if (i2 == 0) {
                uj50.b(obj2);
                Object objB = em50.b((HTTPResponse) obj);
                c0103a.b = 1;
                if (this.a.emit(objB, c0103a) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj2);
            }
            return Unit.a;
        }
    }

    public awe0(lyh lyhVar) {
        this.a = lyhVar;
    }

    @Override // defpackage.lyh
    public final Object collect(myh<? super TGGiftDTO> myhVar, v1b v1bVar) {
        Object objCollect = this.a.collect(new a(myhVar), v1bVar);
        return objCollect == y5b.a ? objCollect : Unit.a;
    }
}
