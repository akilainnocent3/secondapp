package defpackage;

import android.animation.ObjectAnimator;
import android.util.Property;
import com.google.android.material.loadingindicator.LoadingIndicatorSpec;

/* JADX INFO: loaded from: classes4.dex */
public final class eys {
    public static final a i = new a(Float.class, "animationFraction");
    public static final b j = new b();
    public int a;
    public float b;
    public float c;
    public ObjectAnimator d;
    public ckd0 e;
    public LoadingIndicatorSpec f;
    public fys g;
    public gys.a h;

    public class a extends Property<eys, Float> {
        @Override // android.util.Property
        public final Float get(eys eysVar) {
            return Float.valueOf(eysVar.b);
        }

        @Override // android.util.Property
        public final void set(eys eysVar, Float f) {
            eys eysVar2 = eysVar;
            float fFloatValue = f.floatValue();
            eysVar2.b = fFloatValue;
            float f2 = eysVar2.a - 1;
            float f3 = eysVar2.c - f2;
            float f4 = ((int) (fFloatValue * 650.0f)) / 650.0f;
            if (f4 == 1.0f) {
                f4 = 0.0f;
            }
            eysVar2.h.c = ((f3 * 90.0f) + ((f4 * 50.0f) + (f2 * 140.0f))) % 360.0f;
            fys fysVar = eysVar2.g;
            if (fysVar != null) {
                fysVar.invalidateSelf();
            }
        }
    }

    public class b extends y3l {
        @Override // defpackage.y3l
        public final float l(Object obj) {
            return ((eys) obj).c;
        }

        @Override // defpackage.y3l
        public final void t(Object obj, float f) {
            ((eys) obj).a(f);
        }
    }

    public final void a(float f) {
        this.c = f;
        gys.a aVar = this.h;
        aVar.b = f;
        int i2 = this.a - 1;
        int[] iArr = this.f.d;
        int length = i2 % iArr.length;
        aVar.a = gw0.a(cdv.a(f - i2, 0.0f, 1.0f), Integer.valueOf(iArr[length]), Integer.valueOf(iArr[(length + 1) % iArr.length])).intValue();
        fys fysVar = this.g;
        if (fysVar != null) {
            fysVar.invalidateSelf();
        }
    }
}
