package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes.dex */
public final class dl10 implements ess {
    public final String a;
    public final boolean b;
    public msr c;

    public static final class a extends fdf {
        public a(ImageView imageView) {
            super(imageView);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ubn, defpackage.d5f0
        public final void e(Object obj) {
            Object obj2 = (Drawable) obj;
            f(obj2);
            if (obj2 instanceof Animatable) {
                Animatable animatable = (Animatable) obj2;
                this.c = animatable;
                animatable.start();
            } else {
                this.c = null;
            }
            thk thkVar = obj2 instanceof thk ? (thk) obj2 : null;
            if (thkVar == null || dl10.this.b) {
                return;
            }
            thkVar.b(1);
        }
    }

    public dl10(msr msrVar, String str, boolean z) {
        this.a = str;
        this.b = z;
        this.c = msrVar;
    }

    @Override // defpackage.ess
    public final void execute() {
        msr msrVar = this.c;
        if (msrVar == null) {
            return;
        }
        ea50 ea50VarH = com.bumptech.glide.a.d(msrVar.a.getContext()).p(this.a).o(R.drawable.img__football_field).h(R.drawable.img__football_field);
        ea50VarH.L(new a(msrVar.i), null, ea50VarH, fug.a);
    }

    @Override // defpackage.ess
    public final void release() {
        msr msrVar = this.c;
        Drawable drawable = msrVar != null ? msrVar.i.getDrawable() : null;
        thk thkVar = drawable instanceof thk ? (thk) drawable : null;
        if (thkVar != null) {
            thkVar.stop();
        }
        this.c = null;
    }
}
