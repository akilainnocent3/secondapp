package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.patron.UpdateNicknameResponse;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class x0x implements lyh<lk50<? extends BaseResponse<UpdateNicknameResponse>>> {
    public final /* synthetic */ yzh a;

    @c0d(c = "com.sportybet.android.social.domain.viewmodel.MySocialCreationViewModel$confirm$$inlined$map$1", f = "MySocialCreationViewModel.kt", l = {109}, m = "collect", v = 2)
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
            return x0x.this.collect(null, this);
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ myh a;

        @c0d(c = "com.sportybet.android.social.domain.viewmodel.MySocialCreationViewModel$confirm$$inlined$map$1$2", f = "MySocialCreationViewModel.kt", l = {51, 50}, m = "emit", v = 2)
        public static final class a extends x1b {
            public /* synthetic */ Object a;
            public int b;
            public myh d;
            public lk50 e;

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

        public b(myh myhVar) {
            this.a = myhVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
        
            if (r10.emit(r9, r0) == r1) goto L22;
         */
        @Override // defpackage.myh
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r10, defpackage.v1b r11) {
            /*
                r9 = this;
                boolean r0 = r11 instanceof x0x.b.a
                if (r0 == 0) goto L13
                r0 = r11
                x0x$b$a r0 = (x0x.b.a) r0
                int r1 = r0.b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.b = r1
                goto L18
            L13:
                x0x$b$a r0 = new x0x$b$a
                r0.<init>(r11)
            L18:
                java.lang.Object r11 = r0.a
                y5b r1 = defpackage.y5b.a
                int r2 = r0.b
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L3b
                if (r2 == r4) goto L31
                if (r2 != r3) goto L2b
                defpackage.uj50.b(r11)
                goto L64
            L2b:
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r9)
                return r5
            L31:
                lk50 r9 = r0.e
                lk50 r9 = (defpackage.lk50) r9
                myh r10 = r0.d
                defpackage.uj50.b(r11)
                goto L57
            L3b:
                defpackage.uj50.b(r11)
                lk50 r10 = (defpackage.lk50) r10
                myh r9 = r9.a
                r0.d = r9
                r11 = r10
                lk50 r11 = (defpackage.lk50) r11
                r0.e = r11
                r0.b = r4
                r6 = 300(0x12c, double:1.48E-321)
                java.lang.Object r11 = defpackage.hkd.b(r6, r0)
                if (r11 != r1) goto L54
                goto L63
            L54:
                r8 = r10
                r10 = r9
                r9 = r8
            L57:
                r0.d = r5
                r0.e = r5
                r0.b = r3
                java.lang.Object r9 = r10.emit(r9, r0)
                if (r9 != r1) goto L64
            L63:
                return r1
            L64:
                kotlin.Unit r9 = kotlin.Unit.a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: x0x.b.emit(java.lang.Object, v1b):java.lang.Object");
        }
    }

    public x0x(yzh yzhVar) {
        this.a = yzhVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super lk50<? extends BaseResponse<UpdateNicknameResponse>>> myhVar, v1b v1bVar) {
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
            b bVar = new b(myhVar);
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
