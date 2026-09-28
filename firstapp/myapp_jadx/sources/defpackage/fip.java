package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.patron.VerifiedInfoResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class fip implements eip {
    public final xxz a;

    @c0d(c = "com.sportybet.android.user.kyc.data.KYCRepoImpl$getUserSubmissions$1", f = "KYCRepoImpl.kt", l = {13, 13}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<myh<? super BaseResponse<List<? extends VerifiedInfoResponse>>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.e = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = fip.this.new a(this.e, v1bVar);
            aVar.c = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<List<? extends VerifiedInfoResponse>>> myhVar, v1b<? super Unit> v1bVar) {
            return ((a) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
        
            if (r0.emit(r7, r6) == r1) goto L18;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.c
                myh r0 = (defpackage.myh) r0
                y5b r1 = defpackage.y5b.a
                int r2 = r6.b
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L21
                if (r2 == r4) goto L1b
                if (r2 != r3) goto L15
                defpackage.uj50.b(r7)
                goto L61
            L15:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r6)
                return r5
            L1b:
                myh r0 = r6.a
                defpackage.uj50.b(r7)
                goto L4b
            L21:
                defpackage.uj50.b(r7)
                fip r7 = defpackage.fip.this
                xxz r7 = r7.a
                r6.c = r5
                r6.a = r0
                r6.b = r4
                r2 = 20
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r4 = 30
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                java.lang.Integer[] r2 = new java.lang.Integer[]{r2, r4}
                java.util.List r2 = kotlin.collections.b.k(r2)
                java.lang.String r4 = r6.e
                java.lang.Object r7 = r7.K1(r4, r2, r6)
                if (r7 != r1) goto L4b
                goto L60
            L4b:
                com.sporty.android.common.network.data.BaseResponse r7 = (com.sporty.android.common.network.data.BaseResponse) r7
                if (r7 != 0) goto L54
                com.sporty.android.common.network.data.BaseResponse r7 = new com.sporty.android.common.network.data.BaseResponse
                r7.<init>()
            L54:
                r6.c = r5
                r6.a = r5
                r6.b = r3
                java.lang.Object r6 = r0.emit(r7, r6)
                if (r6 != r1) goto L61
            L60:
                return r1
            L61:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: fip.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public fip(xxz xxzVar) {
        this.a = xxzVar;
    }

    @Override // defpackage.eip
    public final lyh<BaseResponse<List<VerifiedInfoResponse>>> a(String str) {
        or60 or60Var = new or60(new a(str, null));
        pfd pfdVar = fse.a;
        return ozh.c(or60Var, odd.b);
    }
}
