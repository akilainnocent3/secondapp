package defpackage;

import com.sporty.android.core.model.loyalty.LoyaltyAggregateHintData;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class k2u implements lyh<oum> {
    public final /* synthetic */ lyh[] a;
    public final /* synthetic */ u2u b;

    @c0d(c = "com.sportybet.android.loyalty.LoyaltyUseCase$getLoyaltyState$$inlined$combine$1", f = "LoyaltyUseCase.kt", l = {109}, m = "collect", v = 2)
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
            return k2u.this.collect(null, this);
        }
    }

    public static final class b implements Function0<Object[]> {
        public final /* synthetic */ lyh[] a;

        public b(lyh[] lyhVarArr) {
            this.a = lyhVarArr;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object[] invoke() {
            return new Object[this.a.length];
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @c0d(c = "com.sportybet.android.loyalty.LoyaltyUseCase$getLoyaltyState$$inlined$combine$1$3", f = "LoyaltyUseCase.kt", l = {253, 234}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements gaj<myh<? super oum>, Object[], v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ myh b;
        public /* synthetic */ Object[] c;
        public final /* synthetic */ u2u d;
        public myh e;
        public LoyaltyAggregateHintData f;
        public ArrayList i;
        public boolean v;
        public boolean w;
        public boolean y;
        public int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(v1b v1bVar, u2u u2uVar) {
            super(3, v1bVar);
            this.d = u2uVar;
        }

        @Override // defpackage.gaj
        public final Object invoke(myh<? super oum> myhVar, Object[] objArr, v1b<? super Unit> v1bVar) {
            c cVar = new c(v1bVar, this.d);
            cVar.b = myhVar;
            cVar.c = objArr;
            return cVar.invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:40:0x0136  */
        /* JADX WARN: Code duplicated, block: B:46:0x0149  */
        /* JADX WARN: Code duplicated, block: B:47:0x0152  */
        /* JADX WARN: Code duplicated, block: B:52:0x0162  */
        /* JADX WARN: Code duplicated, block: B:58:0x0142 A[SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x017b, code lost:
        
            if (r13.emit(r18, r25) == r1) goto L55;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r26) {
            /*
                Method dump skipped, instruction units count: 385
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: k2u.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public k2u(lyh[] lyhVarArr, u2u u2uVar) {
        this.a = lyhVarArr;
        this.b = u2uVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super oum> myhVar, v1b v1bVar) {
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
            lyh[] lyhVarArr = this.a;
            b bVar = new b(lyhVarArr);
            c cVar = new c(null, this.b);
            aVar.b = 1;
            if (r78.a(aVar, myhVar, cVar, bVar, lyhVarArr) == y5bVar) {
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
