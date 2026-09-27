package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final TextView f7484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final j3.f f7485b;

    public y(@NonNull TextView textView) {
        this.f7484a = textView;
        this.f7485b = new j3.f(textView, false);
    }

    @NonNull
    public InputFilter[] a(@NonNull InputFilter[] inputFilterArr) {
        return this.f7485b.a(inputFilterArr);
    }

    public boolean b() {
        return this.f7485b.b();
    }

    public void c(@Nullable AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = this.f7484a.getContext().obtainStyledAttributes(attributeSet, m.a.m.f106166v0, i10, 0);
        try {
            boolean z10 = typedArrayObtainStyledAttributes.hasValue(m.a.m.K0) ? typedArrayObtainStyledAttributes.getBoolean(m.a.m.K0, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            e(z10);
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public void d(boolean z10) {
        this.f7485b.c(z10);
    }

    public void e(boolean z10) {
        this.f7485b.d(z10);
    }

    @Nullable
    public TransformationMethod f(@Nullable TransformationMethod transformationMethod) {
        return this.f7485b.f(transformationMethod);
    }
}
