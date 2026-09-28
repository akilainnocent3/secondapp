package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public final class hff0 {
    public float c;
    public float d;
    public final WeakReference<b> f;
    public odf0 g;
    public final TextPaint a = new TextPaint(1);
    public final a b = new a();
    public boolean e = true;

    public class a extends bjb0 {
        public a() {
        }

        @Override // defpackage.bjb0
        public final void b0(int i) {
            hff0 hff0Var = hff0.this;
            hff0Var.e = true;
            b bVar = hff0Var.f.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // defpackage.bjb0
        public final void c0(Typeface typeface, boolean z) {
            if (z) {
                return;
            }
            hff0 hff0Var = hff0.this;
            hff0Var.e = true;
            b bVar = hff0Var.f.get();
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public hff0(b bVar) {
        this.f = new WeakReference<>(null);
        this.f = new WeakReference<>(bVar);
    }

    public final float a(String str) {
        if (!this.e) {
            return this.c;
        }
        b(str);
        return this.c;
    }

    public final void b(String str) {
        TextPaint textPaint = this.a;
        this.c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        this.d = str != null ? Math.abs(textPaint.getFontMetrics().ascent) : 0.0f;
        this.e = false;
    }

    public final void c(odf0 odf0Var, Context context) {
        if (this.g != odf0Var) {
            this.g = odf0Var;
            WeakReference<b> weakReference = this.f;
            if (odf0Var != null) {
                TextPaint textPaint = this.a;
                a aVar = this.b;
                odf0Var.e(context, textPaint, aVar);
                b bVar = weakReference.get();
                if (bVar != null) {
                    textPaint.drawableState = bVar.getState();
                }
                odf0Var.d(context, textPaint, aVar);
                this.e = true;
            }
            b bVar2 = weakReference.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }
}
