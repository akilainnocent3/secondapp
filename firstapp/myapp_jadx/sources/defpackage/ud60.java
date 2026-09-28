package defpackage;

import com.sportygames.common.framework.network.HTTPResponse;
import com.sportygames.speedybingo.data.dto.SBExtraBallDTO;
import java.math.BigDecimal;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class ud60 implements lyh<xc60> {
    public final /* synthetic */ lyh a;
    public final /* synthetic */ vd60 b;
    public final /* synthetic */ int c;

    public static final class a<T> implements myh {
        public final /* synthetic */ myh a;
        public final /* synthetic */ int b;

        /* JADX INFO: renamed from: ud60$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportygames.speedybingo.domain.usecase.SBGetExtraBallUseCaseImpl$invoke$$inlined$map$1$2", f = "SBGetExtraBallUseCaseImpl.kt", l = {50}, m = "emit", v = 1)
        public static final class C1172a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C1172a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(myh myhVar, vd60 vd60Var, int i) {
            this.a = myhVar;
            this.b = i;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            C1172a c1172a;
            if (v1bVar instanceof C1172a) {
                c1172a = (C1172a) v1bVar;
                int i = c1172a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c1172a.b = i - Integer.MIN_VALUE;
                } else {
                    c1172a = new C1172a(v1bVar);
                }
            } else {
                c1172a = new C1172a(v1bVar);
            }
            Object obj2 = c1172a.a;
            y5b y5bVar = y5b.a;
            int i2 = c1172a.b;
            if (i2 == 0) {
                uj50.b(obj2);
                SBExtraBallDTO sBExtraBallDTO = (SBExtraBallDTO) em50.b((HTTPResponse) obj);
                BigDecimal bigDecimalValueOf = BigDecimal.valueOf(sBExtraBallDTO.getStakeAmount());
                bigDecimalValueOf.getClass();
                BigDecimal bigDecimal = skd0.b;
                xc60 xc60Var = new xc60(this.b, a4h.f(sBExtraBallDTO.getResult().getNumbers()), bigDecimalValueOf, Math.abs(sBExtraBallDTO.getPayoutAmount()) > 1.0E-5d);
                c1172a.b = 1;
                if (this.a.emit(xc60Var, c1172a) == y5bVar) {
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

    public ud60(lyh lyhVar, vd60 vd60Var, int i) {
        this.a = lyhVar;
        this.b = vd60Var;
        this.c = i;
    }

    @Override // defpackage.lyh
    public final Object collect(myh<? super xc60> myhVar, v1b v1bVar) {
        Object objCollect = this.a.collect(new a(myhVar, this.b, this.c), v1bVar);
        return objCollect == y5b.a ? objCollect : Unit.a;
    }
}
