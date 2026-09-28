package defpackage;

import com.sportygames.common.framework.network.HTTPResponse;
import com.sportygames.speedybingo.data.dto.SBGiftDTO;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class xd60 implements lyh<SBGiftDTO> {
    public final /* synthetic */ lyh a;

    public static final class a<T> implements myh {
        public final /* synthetic */ myh a;

        /* JADX INFO: renamed from: xd60$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportygames.speedybingo.domain.usecase.SBGetWalletUseCaseImpl$giftFlow$$inlined$map$1$2", f = "SBGetWalletUseCaseImpl.kt", l = {50}, m = "emit", v = 1)
        public static final class C1287a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C1287a(v1b v1bVar) {
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
            C1287a c1287a;
            if (v1bVar instanceof C1287a) {
                c1287a = (C1287a) v1bVar;
                int i = c1287a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c1287a.b = i - Integer.MIN_VALUE;
                } else {
                    c1287a = new C1287a(v1bVar);
                }
            } else {
                c1287a = new C1287a(v1bVar);
            }
            Object obj2 = c1287a.a;
            y5b y5bVar = y5b.a;
            int i2 = c1287a.b;
            if (i2 == 0) {
                uj50.b(obj2);
                Object objB = em50.b((HTTPResponse) obj);
                c1287a.b = 1;
                if (this.a.emit(objB, c1287a) == y5bVar) {
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

    public xd60(lyh lyhVar) {
        this.a = lyhVar;
    }

    @Override // defpackage.lyh
    public final Object collect(myh<? super SBGiftDTO> myhVar, v1b v1bVar) {
        Object objCollect = this.a.collect(new a(myhVar), v1bVar);
        return objCollect == y5b.a ? objCollect : Unit.a;
    }
}
