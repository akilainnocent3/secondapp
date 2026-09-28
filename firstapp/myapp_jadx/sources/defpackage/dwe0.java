package defpackage;

import com.sportygames.common.framework.network.HTTPResponse;
import com.sportygames.goldmine.data.dto.TGUserDTO;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final class dwe0 implements lyh<TGUserDTO> {
    public final /* synthetic */ lyh a;

    public static final class a<T> implements myh {
        public final /* synthetic */ myh a;

        /* JADX INFO: renamed from: dwe0$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportygames.goldmine.usecase.TGGetUserUseCase$userFlow$$inlined$map$1$2", f = "TGGetUserUseCase.kt", l = {50}, m = "emit", v = 1)
        public static final class C0509a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C0509a(v1b v1bVar) {
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
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) throws rve0.b {
            C0509a c0509a;
            if (v1bVar instanceof C0509a) {
                c0509a = (C0509a) v1bVar;
                int i = c0509a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0509a.b = i - Integer.MIN_VALUE;
                } else {
                    c0509a = new C0509a(v1bVar);
                }
            } else {
                c0509a = new C0509a(v1bVar);
            }
            Object obj2 = c0509a.a;
            y5b y5bVar = y5b.a;
            int i2 = c0509a.b;
            if (i2 == 0) {
                uj50.b(obj2);
                TGUserDTO tGUserDTO = (TGUserDTO) em50.b((HTTPResponse) obj);
                if (!tGUserDTO.getAvailable()) {
                    throw rve0.b.a;
                }
                c0509a.b = 1;
                if (this.a.emit(tGUserDTO, c0509a) == y5bVar) {
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

    public dwe0(lyh lyhVar) {
        this.a = lyhVar;
    }

    @Override // defpackage.lyh
    public final Object collect(myh<? super TGUserDTO> myhVar, v1b v1bVar) {
        Object objCollect = this.a.collect(new a(myhVar), v1bVar);
        return objCollect == y5b.a ? objCollect : Unit.a;
    }
}
