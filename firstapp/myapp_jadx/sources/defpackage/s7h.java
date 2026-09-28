package defpackage;

import com.sportybet.feature.facialrecognition.presentation.c;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.facialrecognition.presentation.FacialRecognitionViewModel", f = "FacialRecognitionViewModel.kt", l = {141, 143}, m = "preloadCloudflare", v = 2)
public final class s7h extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ c b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7h(c cVar, x1b x1bVar) {
        super(x1bVar);
        this.b = cVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.G1(this);
    }
}
