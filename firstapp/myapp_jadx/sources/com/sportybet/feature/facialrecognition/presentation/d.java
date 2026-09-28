package com.sportybet.feature.facialrecognition.presentation;

import defpackage.c0d;
import defpackage.tje0;
import defpackage.v1b;
import defpackage.v5b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.facialrecognition.presentation.FacialRecognitionViewModel$launchLegitimuzFlow$1", f = "FacialRecognitionViewModel.kt", l = {175, 185}, m = "invokeSuspend", v = 2)
public final class d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ c b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, v1b<? super d> v1bVar) {
        super(2, v1bVar);
        this.b = cVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new d(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a2, code lost:
    
        if (r0.emit(r2, r9) == r6) goto L31;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            com.sportybet.feature.facialrecognition.presentation.c r0 = r9.b
            vu60 r1 = r0.y
            y5b r6 = defpackage.y5b.a
            int r2 = r9.a
            r3 = 1
            r4 = 0
            r5 = 2
            if (r2 == 0) goto L20
            if (r2 == r3) goto L1c
            if (r2 != r5) goto L16
            defpackage.uj50.b(r10)
            goto La5
        L16:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r9)
            return r4
        L1c:
            defpackage.uj50.b(r10)
            return r10
        L20:
            defpackage.uj50.b(r10)
            java.lang.String r10 = "token"
            java.lang.Object r10 = r1.b(r10)
            java.lang.String r10 = (java.lang.String) r10
            if (r10 != 0) goto L3e
            r9.a = r3
            com.sportybet.feature.facialrecognition.model.FacialRecognitionResult$b r1 = com.sportybet.feature.facialrecognition.model.FacialRecognitionResult.b.e
            com.sportybet.feature.facialrecognition.presentation.a$d r2 = com.sportybet.feature.facialrecognition.presentation.a.d.MissingSessionToken
            r3 = 0
            r5 = 4
            r4 = r9
            java.lang.Object r9 = com.sportybet.feature.facialrecognition.presentation.c.z1(r0, r1, r2, r3, r4, r5)
            if (r9 != r6) goto L3d
            goto La4
        L3d:
            return r9
        L3e:
            com.sportybet.feature.facialrecognition.presentation.a$g r2 = new com.sportybet.feature.facialrecognition.presentation.a$g
            java.lang.String r3 = r0.A1()
            q7h r7 = r0.C1()
            java.lang.String r7 = com.sportybet.feature.facialrecognition.presentation.b.a(r7)
            com.sportybet.feature.facialrecognition.presentation.a$l r8 = com.sportybet.feature.facialrecognition.presentation.a.l.Legitimuz
            r2.<init>(r3, r7, r8, r4)
            r0.H1(r2)
            wwd0 r2 = r0.a
        L56:
            java.lang.Object r3 = r2.getValue()
            r4 = r3
            p7h r4 = (defpackage.p7h) r4
            r7 = 0
            p7h r4 = defpackage.p7h.a(r4, r7)
            boolean r3 = r2.g(r3, r4)
            if (r3 == 0) goto L56
            b390 r0 = r0.c
            o7h$c r2 = new o7h$c
            java.lang.String r3 = "has_document"
            java.lang.Object r3 = r1.b(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            if (r3 == 0) goto L7a
            boolean r7 = r3.booleanValue()
        L7a:
            java.lang.String r3 = "cpf"
            java.lang.Object r1 = r1.b(r3)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L86
            java.lang.String r1 = ""
        L86:
            if (r7 != 0) goto L8b
            java.lang.String r3 = "\n            window.facialRecognition.verifyDocument('{\"cpf\":\"%s\", \"refId\": \"%s\"}');\n        "
            goto L8d
        L8b:
            java.lang.String r3 = "\n            window.facialRecognition.startFaceIndex('{\"cpf\":\"%s\", \"refId\": \"%s\"}');\n        "
        L8d:
            java.lang.Object[] r10 = new java.lang.Object[]{r1, r10}
            java.lang.Object[] r10 = java.util.Arrays.copyOf(r10, r5)
            java.lang.String r10 = java.lang.String.format(r3, r10)
            r2.<init>(r10)
            r9.a = r5
            java.lang.Object r9 = r0.emit(r2, r9)
            if (r9 != r6) goto La5
        La4:
            return r6
        La5:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sportybet.feature.facialrecognition.presentation.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
