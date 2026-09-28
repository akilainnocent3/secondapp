package defpackage;

import com.sportygames.common.framework.network.HTTPResponse;
import com.sportygames.refscall.data.dto.RCWalletInfoDTO;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class ho30 implements lyh<RCWalletInfoDTO> {
    public final /* synthetic */ lyh a;

    public static final class a<T> implements myh {
        public final /* synthetic */ myh a;

        /* JADX INFO: renamed from: ho30$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportygames.refscall.domain.usecase.RCGetWalletGiftUseCaseImpl$walletFlow$$inlined$map$1$2", f = "RCGetWalletGiftUseCaseImpl.kt", l = {50}, m = "emit", v = 1)
        public static final class C0650a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C0650a(v1b v1bVar) {
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
            C0650a c0650a;
            if (v1bVar instanceof C0650a) {
                c0650a = (C0650a) v1bVar;
                int i = c0650a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0650a.b = i - Integer.MIN_VALUE;
                } else {
                    c0650a = new C0650a(v1bVar);
                }
            } else {
                c0650a = new C0650a(v1bVar);
            }
            Object obj2 = c0650a.a;
            y5b y5bVar = y5b.a;
            int i2 = c0650a.b;
            if (i2 == 0) {
                uj50.b(obj2);
                Object objB = em50.b((HTTPResponse) obj);
                c0650a.b = 1;
                if (this.a.emit(objB, c0650a) == y5bVar) {
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

    public ho30(lyh lyhVar) {
        this.a = lyhVar;
    }

    @Override // defpackage.lyh
    public final Object collect(myh<? super RCWalletInfoDTO> myhVar, v1b v1bVar) {
        Object objCollect = this.a.collect(new a(myhVar), v1bVar);
        return objCollect == y5b.a ? objCollect : Unit.a;
    }
}
