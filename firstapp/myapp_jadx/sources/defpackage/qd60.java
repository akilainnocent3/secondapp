package defpackage;

import com.sportygames.common.framework.network.HTTPResponse;
import com.sportygames.speedybingo.data.dto.SBUserInfoDTO;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class qd60 implements lyh<SBUserInfoDTO> {
    public final /* synthetic */ lyh a;

    public static final class a<T> implements myh {
        public final /* synthetic */ myh a;

        /* JADX INFO: renamed from: qd60$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportygames.speedybingo.domain.usecase.SBFetchDataUseCaseImpl$userInfoFlow$$inlined$map$1$2", f = "SBFetchDataUseCaseImpl.kt", l = {50}, m = "emit", v = 1)
        public static final class C1008a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C1008a(v1b v1bVar) {
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
            C1008a c1008a;
            if (v1bVar instanceof C1008a) {
                c1008a = (C1008a) v1bVar;
                int i = c1008a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c1008a.b = i - Integer.MIN_VALUE;
                } else {
                    c1008a = new C1008a(v1bVar);
                }
            } else {
                c1008a = new C1008a(v1bVar);
            }
            Object obj2 = c1008a.a;
            y5b y5bVar = y5b.a;
            int i2 = c1008a.b;
            if (i2 == 0) {
                uj50.b(obj2);
                Object objB = em50.b((HTTPResponse) obj);
                c1008a.b = 1;
                if (this.a.emit(objB, c1008a) == y5bVar) {
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

    public qd60(lyh lyhVar) {
        this.a = lyhVar;
    }

    @Override // defpackage.lyh
    public final Object collect(myh<? super SBUserInfoDTO> myhVar, v1b v1bVar) {
        Object objCollect = this.a.collect(new a(myhVar), v1bVar);
        return objCollect == y5b.a ? objCollect : Unit.a;
    }
}
