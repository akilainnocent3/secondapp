package defpackage;

import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.core.model.patron.VerifyPersonalInfoResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.kyc.nameupdateforfirstdeposit.NameUpdateByNINViewModel$verifyNameByNIN$1", f = "NameUpdateByNINViewModel.kt", l = {55, 57}, m = "invokeSuspend", v = 2)
public final class kdx extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public lyz a;
    public int b;
    public final /* synthetic */ jdx c;
    public final /* synthetic */ String d;
    public final /* synthetic */ cdx e;

    public static final class a<T> implements myh {
        public final /* synthetic */ jdx a;
        public final /* synthetic */ cdx b;

        public a(jdx jdxVar, cdx cdxVar) {
            this.a = jdxVar;
            this.b = cdxVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            Object value;
            Object value2;
            Object value3;
            SprThrowable sprThrowable;
            Object value4;
            lk50 lk50Var = (lk50) obj;
            jdx jdxVar = this.a;
            wwd0 wwd0Var = jdxVar.d;
            if (lk50Var instanceof lk50.c) {
                do {
                    value4 = wwd0Var.getValue();
                } while (!wwd0Var.g(value4, hdx.a((hdx) value4, null, false, 10000, null, 9)));
                if (((VerifyPersonalInfoResult) ((lk50.c) lk50Var).a).isPass()) {
                    this.b.invoke();
                }
            } else if (lk50Var instanceof lk50.a) {
                do {
                    value2 = wwd0Var.getValue();
                } while (!wwd0Var.g(value2, hdx.a((hdx) value2, ((w4x) ((x5a0) jdxVar.c).getValue()).a().a.b, false, 0, null, 12)));
                Throwable th = ((lk50.a) lk50Var).a;
                if (th instanceof SprThrowable) {
                    do {
                        value3 = wwd0Var.getValue();
                        sprThrowable = (SprThrowable) th;
                    } while (!wwd0Var.g(value3, hdx.a((hdx) value3, null, false, sprThrowable.getD(), sprThrowable.getE(), 3)));
                }
            } else {
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, hdx.a((hdx) value, null, true, 0, null, 13)));
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kdx(jdx jdxVar, String str, cdx cdxVar, v1b v1bVar) {
        super(2, v1bVar);
        this.c = jdxVar;
        this.d = str;
        this.e = cdxVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new kdx(this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((kdx) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        if (r7.collect(r1, r6) == r0) goto L15;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r6.b
            jdx r2 = r6.c
            r3 = 2
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L1f
            if (r1 == r5) goto L19
            if (r1 != r3) goto L13
            defpackage.uj50.b(r7)
            goto L51
        L13:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r4
        L19:
            lyz r1 = r6.a
            defpackage.uj50.b(r7)
            goto L31
        L1f:
            defpackage.uj50.b(r7)
            lyz r1 = r2.a
            mgb0 r7 = r2.b
            r6.a = r1
            r6.b = r5
            java.lang.Object r7 = r7.getUserId(r6)
            if (r7 != r0) goto L31
            goto L50
        L31:
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r5 = r6.d
            lyh r7 = r1.Q(r7, r5)
            com.sporty.android.common_ui.uitext.ResourceUiText r1 = defpackage.vch0.b
            yzh r7 = defpackage.bm50.b(r7, r1)
            kdx$a r1 = new kdx$a
            cdx r5 = r6.e
            r1.<init>(r2, r5)
            r6.a = r4
            r6.b = r3
            java.lang.Object r6 = r7.collect(r1, r6)
            if (r6 != r0) goto L51
        L50:
            return r0
        L51:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kdx.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
