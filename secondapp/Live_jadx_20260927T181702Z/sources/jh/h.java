package jh;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public class h implements TypeEvaluator<Matrix> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f100484a = new float[9];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f100485b = new float[9];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f100486c = new Matrix();

    @Override // android.animation.TypeEvaluator
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Matrix evaluate(float f10, @NonNull Matrix matrix, @NonNull Matrix matrix2) {
        matrix.getValues(this.f100484a);
        matrix2.getValues(this.f100485b);
        for (int i10 = 0; i10 < 9; i10++) {
            float[] fArr = this.f100485b;
            float f11 = fArr[i10];
            float f12 = this.f100484a[i10];
            fArr[i10] = f12 + ((f11 - f12) * f10);
        }
        this.f100486c.setValues(this.f100485b);
        return this.f100486c;
    }
}
