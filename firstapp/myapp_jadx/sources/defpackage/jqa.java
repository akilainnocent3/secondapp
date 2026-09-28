package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class jqa implements tqc<Integer> {
    public final /* synthetic */ hqa a;
    public final /* synthetic */ Context b;

    public jqa(hqa hqaVar, Context context) {
        this.a = hqaVar;
        this.b = context;
    }

    @Override // defpackage.tqc
    public final void a(Exception exc) {
        exc.printStackTrace();
    }

    @Override // defpackage.tqc
    public final void onSuccess(Integer num) {
        int iIntValue = num.intValue();
        hqa hqaVar = this.a;
        ej5.c((v5b) hqaVar.e.getValue(), null, null, new iqa(hqaVar, iIntValue, this.b, null), 3);
    }
}
