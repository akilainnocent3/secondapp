package defpackage;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.runtime.m;

/* JADX INFO: loaded from: classes.dex */
public final class ex80 extends CharacterStyle implements UpdateAppearance {
    public final dx80 a;
    public final float b;
    public final ytw c = m.b(new yw90(9205357640488583168L));
    public final mae d = a6a0.b(new ghr(this, 2));

    public ex80(dx80 dx80Var, float f) {
        this.a = dx80Var;
        this.b = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        lc0.a(textPaint, this.b);
        textPaint.setShader((Shader) this.d.getValue());
    }
}
