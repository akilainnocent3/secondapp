package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.account.latam.validation.presentation.RegistrationValidationViewModel$handleSuccessfulFacialRecognition$2", f = "RegistrationValidationViewModel.kt", l = {205, 207}, m = "invokeSuspend", v = 2)
public final class m050 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ s050 b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m050(s050 s050Var, String str, v1b<? super m050> v1bVar) {
        super(2, v1bVar);
        this.b = s050Var;
        this.c = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new m050(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((m050) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x008a, code lost:
    
        if (r3.emit(r6, r22) == r1) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            r22 = this;
            r0 = r22
            y5b r1 = defpackage.y5b.a
            int r2 = r0.a
            r3 = 0
            r4 = 2
            s050 r5 = r0.b
            r6 = 1
            if (r2 == 0) goto L22
            if (r2 == r6) goto L1c
            if (r2 != r4) goto L16
            defpackage.uj50.b(r23)
            goto Lb5
        L16:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r0)
            return r3
        L1c:
            defpackage.uj50.b(r23)
            r2 = r23
            goto L43
        L22:
            defpackage.uj50.b(r23)
            dc r2 = r5.w
            r0.a = r6
            lwm r2 = r2.a
            java.lang.String r6 = r0.c
            lyh r2 = r2.f(r6)
            com.sporty.android.common_ui.uitext.ResourceUiText r6 = defpackage.vch0.b
            yzh r2 = defpackage.bm50.b(r2, r6)
            sl50 r6 = new sl50
            r6.<init>(r2)
            java.lang.Object r2 = defpackage.s0i.a(r6, r0)
            if (r2 != r1) goto L43
            goto L8c
        L43:
            lk50 r2 = (defpackage.lk50) r2
            boolean r6 = r2 instanceof lk50.c
            if (r6 == 0) goto L8d
            b390 r3 = r5.c
            k050$d r6 = new k050$d
            fz40 r5 = r5.z1()
            java.lang.String r8 = r5.a
            lk50$c r2 = (lk50.c) r2
            T r2 = r2.a
            com.sportybet.android.account.international.data.model.AccountActivationResponse r2 = (com.sportybet.android.account.international.data.model.AccountActivationResponse) r2
            java.lang.String r10 = r2.getAccessToken()
            java.lang.String r11 = r2.getRefreshToken()
            java.lang.String r9 = r2.getUserId()
            java.lang.String r15 = r2.getCountryCode()
            java.lang.String r16 = r2.getCurrency()
            java.lang.String r17 = r2.getLanguage()
            java.lang.String r18 = r2.getPhoneCountryCode()
            vqm r7 = new vqm
            r19 = 0
            r21 = 6256(0x1870, float:8.767E-42)
            r12 = 0
            r13 = 0
            r14 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r21)
            r6.<init>(r7)
            r0.a = r4
            java.lang.Object r0 = r3.emit(r6, r0)
            if (r0 != r1) goto Lb5
        L8c:
            return r1
        L8d:
            boolean r0 = r2 instanceof lk50.a
            if (r0 == 0) goto Lb1
            wwd0 r0 = r5.a
        L93:
            java.lang.Object r1 = r0.getValue()
            r2 = r1
            l050 r2 = (defpackage.l050) r2
            r12 = 0
            r13 = 127(0x7f, float:1.78E-43)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 1
            l050 r2 = defpackage.l050.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            boolean r1 = r0.g(r1, r2)
            if (r1 == 0) goto L93
            goto Lb5
        Lb1:
            boolean r0 = r2 instanceof lk50.b
            if (r0 == 0) goto Lb8
        Lb5:
            kotlin.Unit r0 = kotlin.Unit.a
            return r0
        Lb8:
            defpackage.uhc.a()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m050.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
