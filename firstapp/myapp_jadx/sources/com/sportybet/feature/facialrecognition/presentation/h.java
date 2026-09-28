package com.sportybet.feature.facialrecognition.presentation;

import defpackage.c0d;
import defpackage.tje0;
import defpackage.v1b;
import defpackage.v5b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.facialrecognition.presentation.FacialRecognitionViewModel$onSdkResult$2", f = "FacialRecognitionViewModel.kt", l = {245, 255}, m = "invokeSuspend", v = 2)
public final class h extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ c c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String str, c cVar, v1b<? super h> v1bVar) {
        super(2, v1bVar);
        this.b = str;
        this.c = cVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new h(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((h) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
    
        if (com.sportybet.feature.facialrecognition.presentation.c.z1(r5, r6, r7, null, r11, 4) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
    
        if (r5.F1(r11, false, r11) == r0) goto L24;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r11.a
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1b
            if (r1 == r4) goto L17
            if (r1 != r3) goto L11
            defpackage.uj50.b(r12)
            goto L74
        L11:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r11)
            return r2
        L17:
            defpackage.uj50.b(r12)
            goto L42
        L1b:
            defpackage.uj50.b(r12)
            java.lang.String r12 = "success"
            java.lang.String r1 = r11.b
            boolean r12 = r1.equals(r12)
            com.sportybet.feature.facialrecognition.presentation.c r5 = r11.c
            if (r12 != 0) goto L45
            java.lang.String r12 = "error"
            boolean r12 = r1.equals(r12)
            if (r12 != 0) goto L45
            com.sportybet.feature.facialrecognition.model.FacialRecognitionResult$b r6 = com.sportybet.feature.facialrecognition.model.FacialRecognitionResult.b.c
            com.sportybet.feature.facialrecognition.presentation.a$d r7 = com.sportybet.feature.facialrecognition.presentation.a.d.ExternalResultUnexpected
            r11.a = r4
            r8 = 0
            r10 = 4
            r9 = r11
            java.lang.Object r11 = com.sportybet.feature.facialrecognition.presentation.c.z1(r5, r6, r7, r8, r9, r10)
            if (r11 != r0) goto L42
            goto L73
        L42:
            kotlin.Unit r11 = kotlin.Unit.a
            return r11
        L45:
            r9 = r11
            com.sportybet.feature.facialrecognition.presentation.a$l r11 = com.sportybet.feature.facialrecognition.presentation.a.l.Legitimuz
            com.sportybet.feature.facialrecognition.presentation.a$f r12 = new com.sportybet.feature.facialrecognition.presentation.a$f
            java.lang.String r1 = r5.A1()
            q7h r4 = r5.C1()
            java.lang.String r4 = com.sportybet.feature.facialrecognition.presentation.b.a(r4)
            r12.<init>(r1, r4, r11, r2)
            r5.H1(r12)
            vu60 r11 = r5.y
            java.lang.String r12 = "token"
            java.lang.Object r11 = r11.b(r12)
            java.lang.String r11 = (java.lang.String) r11
            if (r11 != 0) goto L6a
            java.lang.String r11 = ""
        L6a:
            r9.a = r3
            r12 = 0
            java.lang.Object r11 = r5.F1(r11, r12, r9)
            if (r11 != r0) goto L74
        L73:
            return r0
        L74:
            kotlin.Unit r11 = kotlin.Unit.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sportybet.feature.facialrecognition.presentation.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
