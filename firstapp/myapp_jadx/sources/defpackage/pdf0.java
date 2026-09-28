package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* JADX INFO: loaded from: classes4.dex */
public final class pdf0 extends bjb0 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ TextPaint c;
    public final /* synthetic */ bjb0 d;
    public final /* synthetic */ odf0 e;

    public pdf0(odf0 odf0Var, Context context, TextPaint textPaint, bjb0 bjb0Var) {
        this.e = odf0Var;
        this.b = context;
        this.c = textPaint;
        this.d = bjb0Var;
    }

    @Override // defpackage.bjb0
    public final void b0(int i) {
        this.d.b0(i);
    }

    @Override // defpackage.bjb0
    public final void c0(Typeface typeface, boolean z) {
        this.e.f(this.b, this.c, typeface);
        this.d.c0(typeface, z);
    }
}
