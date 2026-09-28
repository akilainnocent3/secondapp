package defpackage;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ikd0 {
    public final hkd0 a;
    public Interpolator b;
    public long c = 2000;
    public int d = 0;
    public final HashMap e = new HashMap();

    public class a extends b<Float> {
    }

    public class b<T> {
        public final float[] a;
        public final Property b;
        public final T[] c;

        /* JADX WARN: Multi-variable type inference failed */
        public b(float[] fArr, Property property, Object[] objArr) {
            this.a = fArr;
            this.b = property;
            this.c = objArr;
        }
    }

    public class c extends b<Integer> {
    }

    public ikd0(hkd0 hkd0Var) {
        this.a = hkd0Var;
    }

    public final ObjectAnimator a() {
        HashMap map = this.e;
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[map.size()];
        Iterator it = map.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            b bVar = (b) ((Map.Entry) it.next()).getValue();
            float[] fArr = bVar.a;
            Keyframe[] keyframeArr = new Keyframe[fArr.length];
            int i2 = this.d;
            float f = fArr[i2];
            while (true) {
                int i3 = this.d;
                Object[] objArr = bVar.c;
                if (i2 < objArr.length + i3) {
                    int i4 = i2 - i3;
                    int length = i2 % objArr.length;
                    float f2 = fArr[length] - f;
                    if (f2 < 0.0f) {
                        f2 += fArr[fArr.length - 1];
                    }
                    if (bVar instanceof c) {
                        keyframeArr[i4] = Keyframe.ofInt(f2, ((Integer) objArr[length]).intValue());
                    } else if (bVar instanceof a) {
                        keyframeArr[i4] = Keyframe.ofFloat(f2, ((Float) objArr[length]).floatValue());
                    } else {
                        keyframeArr[i4] = Keyframe.ofObject(f2, objArr[length]);
                    }
                    i2++;
                }
            }
            propertyValuesHolderArr[i] = PropertyValuesHolder.ofKeyframe(bVar.b, keyframeArr);
            i++;
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.a, propertyValuesHolderArr);
        objectAnimatorOfPropertyValuesHolder.setDuration(this.c);
        objectAnimatorOfPropertyValuesHolder.setRepeatCount(-1);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(this.b);
        return objectAnimatorOfPropertyValuesHolder;
    }

    public final void b(float... fArr) {
        fmp fmpVar = new fmp(new PathInterpolator(0.42f, 0.0f, 0.58f, 1.0f), new float[0]);
        fmpVar.b = fArr;
        this.b = fmpVar;
    }

    public final void c(float[] fArr, Property property, Float[] fArr2) {
        int length = fArr.length;
        int length2 = fArr2.length;
        if (length != length2) {
            ib5.a(String.format(Locale.getDefault(), "The fractions.length must equal values.length, fraction.length[%d], values.length[%d]", Integer.valueOf(length), Integer.valueOf(length2)));
            return;
        }
        this.e.put(property.getName(), new a(fArr, property, fArr2));
    }

    public final void d(float[] fArr, Property property, Integer[] numArr) {
        int length = fArr.length;
        int length2 = numArr.length;
        if (length != length2) {
            ib5.a(String.format(Locale.getDefault(), "The fractions.length must equal values.length, fraction.length[%d], values.length[%d]", Integer.valueOf(length), Integer.valueOf(length2)));
            return;
        }
        this.e.put(property.getName(), new c(fArr, property, numArr));
    }
}
