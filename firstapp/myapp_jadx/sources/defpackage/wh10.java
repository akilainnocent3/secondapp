package defpackage;

import com.sportybet.feature.luckynumber.placebet.data.data.LNPlaceBetDTO;
import java.math.BigDecimal;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class wh10 implements lyh<u2q> {
    public final /* synthetic */ o0i a;
    public final /* synthetic */ ai10 b;
    public final /* synthetic */ dq40 c;
    public final /* synthetic */ yxq d;
    public final /* synthetic */ erq e;

    @c0d(c = "com.sportybet.feature.luckynumber.placebet.domain.PlaceBetUseCase$invoke$$inlined$map$1", f = "PlaceBetUseCase.kt", l = {109}, m = "collect", v = 2)
    public static final class a extends x1b {
        public /* synthetic */ Object a;
        public int b;

        public a(v1b v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return wh10.this.collect(null, this);
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ myh a;
        public final /* synthetic */ dq40 b;
        public final /* synthetic */ yxq c;
        public final /* synthetic */ erq d;

        @c0d(c = "com.sportybet.feature.luckynumber.placebet.domain.PlaceBetUseCase$invoke$$inlined$map$1$2", f = "PlaceBetUseCase.kt", l = {50}, m = "emit", v = 2)
        public static final class a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return b.this.emit(null, this);
            }
        }

        public b(myh myhVar, ai10 ai10Var, dq40 dq40Var, yxq yxqVar, erq erqVar) {
            this.a = myhVar;
            this.b = dq40Var;
            this.c = yxqVar;
            this.d = erqVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            a aVar;
            if (v1bVar instanceof a) {
                aVar = (a) v1bVar;
                int i = aVar.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    aVar.b = i - Integer.MIN_VALUE;
                } else {
                    aVar = new a(v1bVar);
                }
            } else {
                aVar = new a(v1bVar);
            }
            Object obj2 = aVar.a;
            y5b y5bVar = y5b.a;
            int i2 = aVar.b;
            if (i2 == 0) {
                uj50.b(obj2);
                LNPlaceBetDTO lNPlaceBetDTO = (LNPlaceBetDTO) obj;
                BigDecimal bigDecimal = (BigDecimal) this.b.a;
                bigDecimal.getClass();
                yxq yxqVar = this.c;
                yxqVar.getClass();
                BigDecimal bigDecimal2 = yxqVar.f;
                long j = this.d.k;
                int i3 = ai10.e;
                u2q u2qVar = new u2q(lNPlaceBetDTO.getOrder().getId(), lNPlaceBetDTO.getOrder().getShortId(), lNPlaceBetDTO.getOrder().getCreateTime(), j, bigDecimal, bigDecimal2);
                aVar.b = 1;
                if (this.a.emit(u2qVar, aVar) == y5bVar) {
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

    public wh10(o0i o0iVar, ai10 ai10Var, dq40 dq40Var, yxq yxqVar, erq erqVar) {
        this.a = o0iVar;
        this.b = ai10Var;
        this.c = dq40Var;
        this.d = yxqVar;
        this.e = erqVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super u2q> myhVar, v1b v1bVar) {
        a aVar;
        if (v1bVar instanceof a) {
            aVar = (a) v1bVar;
            int i = aVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.b = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(v1bVar);
            }
        } else {
            aVar = new a(v1bVar);
        }
        Object obj = aVar.a;
        y5b y5bVar = y5b.a;
        int i2 = aVar.b;
        if (i2 == 0) {
            uj50.b(obj);
            b bVar = new b(myhVar, this.b, this.c, this.d, this.e);
            aVar.b = 1;
            if (this.a.collect(bVar, aVar) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
