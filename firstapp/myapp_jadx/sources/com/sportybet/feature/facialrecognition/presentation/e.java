package com.sportybet.feature.facialrecognition.presentation;

import com.sportybet.feature.facialrecognition.model.FacialRecognitionResult;
import defpackage.c0d;
import defpackage.ib5;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.y5b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.facialrecognition.presentation.FacialRecognitionViewModel$onBrowserUnavailable$1", f = "FacialRecognitionViewModel.kt", l = {365}, m = "invokeSuspend", v = 2)
public final class e extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ c b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, v1b<? super e> v1bVar) {
        super(2, v1bVar);
        this.b = cVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new e(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((e) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            FacialRecognitionResult.b bVar = FacialRecognitionResult.b.d;
            a.d dVar = a.d.BrowserUnavailable;
            this.a = 1;
            if (c.z1(this.b, bVar, dVar, null, this, 4) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
