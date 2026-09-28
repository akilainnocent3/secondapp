package defpackage;

import android.animation.ObjectAnimator;
import android.util.Property;
import com.google.android.material.progressindicator.BaseProgressIndicator;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class jfs extends bfn<ObjectAnimator> {
    public static final a i = new a(Float.class, "animationFraction");
    public ObjectAnimator c;
    public final w9h d;
    public final LinearProgressIndicatorSpec e;
    public int f;
    public boolean g;
    public float h;

    public class a extends Property<jfs, Float> {
        @Override // android.util.Property
        public final Float get(jfs jfsVar) {
            return Float.valueOf(jfsVar.h);
        }

        @Override // android.util.Property
        public final void set(jfs jfsVar, Float f) {
            jfs jfsVar2 = jfsVar;
            float fFloatValue = f.floatValue();
            jfsVar2.h = fFloatValue;
            ArrayList arrayList = jfsVar2.b;
            ((kef.a) arrayList.get(0)).a = 0.0f;
            float fB = bfn.b((int) (fFloatValue * 333.0f), 0, 667);
            kef.a aVar = (kef.a) arrayList.get(0);
            kef.a aVar2 = (kef.a) arrayList.get(1);
            w9h w9hVar = jfsVar2.d;
            float interpolation = w9hVar.getInterpolation(fB);
            aVar2.a = interpolation;
            aVar.b = interpolation;
            kef.a aVar3 = (kef.a) arrayList.get(1);
            kef.a aVar4 = (kef.a) arrayList.get(2);
            float interpolation2 = w9hVar.getInterpolation(fB + 0.49925038f);
            aVar4.a = interpolation2;
            aVar3.b = interpolation2;
            ((kef.a) arrayList.get(2)).b = 1.0f;
            if (jfsVar2.g && ((kef.a) arrayList.get(1)).b < 1.0f) {
                ((kef.a) arrayList.get(2)).c = ((kef.a) arrayList.get(1)).c;
                ((kef.a) arrayList.get(1)).c = ((kef.a) arrayList.get(0)).c;
                ((kef.a) arrayList.get(0)).c = jfsVar2.e.e[jfsVar2.f];
                jfsVar2.g = false;
            }
            jfsVar2.a.invalidateSelf();
        }
    }

    public jfs(LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(3);
        this.f = 1;
        this.e = linearProgressIndicatorSpec;
        this.d = new w9h();
    }

    @Override // defpackage.bfn
    public final void a() {
        ObjectAnimator objectAnimator = this.c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // defpackage.bfn
    public final void c() {
        h();
        this.c.setDuration((long) (this.e.n * 333.0f));
        i();
    }

    @Override // defpackage.bfn
    public final void f() {
        h();
        i();
        this.c.start();
    }

    public final void h() {
        if (this.c == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, i, 0.0f, 1.0f);
            this.c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (this.e.n * 333.0f));
            this.c.setInterpolator(null);
            this.c.setRepeatCount(-1);
            this.c.addListener(new ifs(this));
        }
    }

    public final void i() {
        this.g = true;
        this.f = 1;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            kef.a aVar = (kef.a) obj;
            LinearProgressIndicatorSpec linearProgressIndicatorSpec = this.e;
            aVar.c = linearProgressIndicatorSpec.e[0];
            aVar.d = linearProgressIndicatorSpec.i / 2;
        }
    }

    @Override // defpackage.bfn
    public final void e() {
    }

    @Override // defpackage.bfn
    public final void g() {
    }

    @Override // defpackage.bfn
    public final void d(BaseProgressIndicator.c cVar) {
    }
}
