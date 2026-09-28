package defpackage;

import com.sportybet.feature.facialrecognition.presentation.FacialRecognitionActivity;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.facialrecognition.presentation.FacialRecognitionActivity", f = "FacialRecognitionActivity.kt", l = {246, 252}, m = "waitForFacialRecognitionSdk", v = 2)
public final class n6h extends x1b {
    public int a;
    public int b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ FacialRecognitionActivity e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6h(FacialRecognitionActivity facialRecognitionActivity, x1b x1bVar) {
        super(x1bVar);
        this.e = facialRecognitionActivity;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        int i = FacialRecognitionActivity.f;
        return this.e.M1(0, this);
    }
}
