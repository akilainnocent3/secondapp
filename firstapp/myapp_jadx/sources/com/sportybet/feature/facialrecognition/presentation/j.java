package com.sportybet.feature.facialrecognition.presentation;

import defpackage.c0d;
import defpackage.tje0;
import defpackage.v1b;
import defpackage.v5b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.facialrecognition.presentation.FacialRecognitionViewModel$startFacialRecognitionFlow$1", f = "FacialRecognitionViewModel.kt", l = {100, 116, 118, 123, 130}, m = "invokeSuspend", v = 2)
public final class j extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ c b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(c cVar, v1b<? super j> v1bVar) {
        super(2, v1bVar);
        this.b = cVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new j(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((j) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x010b, code lost:
    
        if (r11 == r7) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0114, code lost:
    
        if (r1.G1(r11) == r7) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0132, code lost:
    
        if (com.sportybet.feature.facialrecognition.presentation.c.z1(r1, r2, r3, null, r11, 4) == r7) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0143, code lost:
    
        if (com.sportybet.feature.facialrecognition.presentation.c.z1(r1, r2, r3, null, r11, 4) == r7) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sportybet.feature.facialrecognition.presentation.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
