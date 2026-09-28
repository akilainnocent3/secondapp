package defpackage;

import com.sportygames.common.framework.network.HTTPResponse;
import com.sportygames.goldmine.data.dto.TGBetDTO;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final class nue0 implements lyh<mue0.c> {
    public final /* synthetic */ lyh a;
    public final /* synthetic */ que0 b;

    public static final class a<T> implements myh {
        public final /* synthetic */ myh a;
        public final /* synthetic */ que0 b;

        /* JADX INFO: renamed from: nue0$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportygames.goldmine.usecase.TGBetUseCase$invoke$$inlined$map$1$2", f = "TGBetUseCase.kt", l = {50}, m = "emit", v = 1)
        public static final class C0905a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C0905a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(myh myhVar, que0 que0Var) {
            this.a = myhVar;
            this.b = que0Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            C0905a c0905a;
            if (v1bVar instanceof C0905a) {
                c0905a = (C0905a) v1bVar;
                int i = c0905a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0905a.b = i - Integer.MIN_VALUE;
                } else {
                    c0905a = new C0905a(v1bVar);
                }
            } else {
                c0905a = new C0905a(v1bVar);
            }
            Object obj2 = c0905a.a;
            y5b y5bVar = y5b.a;
            int i2 = c0905a.b;
            if (i2 == 0) {
                uj50.b(obj2);
                TGBetDTO tGBetDTO = (TGBetDTO) em50.b((HTTPResponse) obj);
                this.b.getClass();
                mue0.c cVar = new mue0.c(tGBetDTO.getTicketId(), tGBetDTO.getResult().getIndex(), tGBetDTO.getPayoutAmount(), Math.abs(tGBetDTO.getGiftAmount()) < 1.0E-5d ? kze0.b.a : new kze0.a(tGBetDTO.getGiftAmount()));
                c0905a.b = 1;
                if (this.a.emit(cVar, c0905a) == y5bVar) {
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

    public nue0(lyh lyhVar, que0 que0Var) {
        this.a = lyhVar;
        this.b = que0Var;
    }

    @Override // defpackage.lyh
    public final Object collect(myh<? super mue0.c> myhVar, v1b v1bVar) {
        Object objCollect = this.a.collect(new a(myhVar, this.b), v1bVar);
        return objCollect == y5b.a ? objCollect : Unit.a;
    }
}
