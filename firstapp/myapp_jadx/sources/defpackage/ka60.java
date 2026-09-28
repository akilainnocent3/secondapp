package defpackage;

import com.sportygames.common.framework.network.HTTPResponse;
import com.sportygames.speedybingo.data.dto.SBBetResponseDTO;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class ka60 implements lyh<ia60> {
    public final /* synthetic */ lyh a;
    public final /* synthetic */ la60 b;
    public final /* synthetic */ dq40 c;

    public static final class a<T> implements myh {
        public final /* synthetic */ myh a;
        public final /* synthetic */ dq40 b;

        /* JADX INFO: renamed from: ka60$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportygames.speedybingo.domain.usecase.SBBetUseCaseImpl$invoke$$inlined$map$1$2", f = "SBBetUseCaseImpl.kt", l = {50}, m = "emit", v = 1)
        public static final class C0756a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C0756a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(myh myhVar, la60 la60Var, dq40 dq40Var) {
            this.a = myhVar;
            this.b = dq40Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            C0756a c0756a;
            BigDecimal bigDecimalValueOf;
            if (v1bVar instanceof C0756a) {
                c0756a = (C0756a) v1bVar;
                int i = c0756a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0756a.b = i - Integer.MIN_VALUE;
                } else {
                    c0756a = new C0756a(v1bVar);
                }
            } else {
                c0756a = new C0756a(v1bVar);
            }
            Object obj2 = c0756a.a;
            y5b y5bVar = y5b.a;
            int i2 = c0756a.b;
            if (i2 == 0) {
                uj50.b(obj2);
                SBBetResponseDTO sBBetResponseDTO = (SBBetResponseDTO) em50.b((HTTPResponse) obj);
                boolean z = this.b.a != null;
                int id = sBBetResponseDTO.getId();
                Double extraBallPrice = sBBetResponseDTO.getResult().getExtraBallPrice();
                if (extraBallPrice != null) {
                    bigDecimalValueOf = BigDecimal.valueOf(extraBallPrice.doubleValue());
                    bigDecimalValueOf.getClass();
                    BigDecimal bigDecimal = skd0.b;
                } else {
                    bigDecimalValueOf = skd0.b;
                }
                BigDecimal bigDecimal2 = bigDecimalValueOf;
                String currency = sBBetResponseDTO.getCurrency();
                ArrayList arrayListL = CollectionsKt.L(sBBetResponseDTO.getResult().getNumbers(), 12);
                ArrayList arrayList = new ArrayList(l48.r(arrayListL, 10));
                int size = arrayListL.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj3 = arrayListL.get(i3);
                    i3++;
                    arrayList.add(a4h.f((List) obj3));
                }
                ia60 ia60Var = new ia60(id, z, a4h.f(arrayList), bigDecimal2, currency, Math.abs(sBBetResponseDTO.getPayoutAmount()) > 1.0E-4d);
                c0756a.b = 1;
                if (this.a.emit(ia60Var, c0756a) == y5bVar) {
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

    public ka60(lyh lyhVar, la60 la60Var, dq40 dq40Var) {
        this.a = lyhVar;
        this.b = la60Var;
        this.c = dq40Var;
    }

    @Override // defpackage.lyh
    public final Object collect(myh<? super ia60> myhVar, v1b v1bVar) {
        Object objCollect = this.a.collect(new a(myhVar, this.b, this.c), v1bVar);
        return objCollect == y5b.a ? objCollect : Unit.a;
    }
}
