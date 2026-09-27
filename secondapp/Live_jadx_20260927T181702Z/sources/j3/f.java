package j3;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import e2.x;
import k.t0;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f99505a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(19)
    public static class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f99506a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f99507b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f99508c = true;

        public a(TextView textView) {
            this.f99506a = textView;
            this.f99507b = new d(textView);
        }

        @Override // j3.f.b
        @NonNull
        public InputFilter[] a(@NonNull InputFilter[] inputFilterArr) {
            return !this.f99508c ? i(inputFilterArr) : g(inputFilterArr);
        }

        @Override // j3.f.b
        public boolean b() {
            return this.f99508c;
        }

        @Override // j3.f.b
        public void c(boolean z10) {
            if (z10) {
                e();
            }
        }

        @Override // j3.f.b
        public void d(boolean z10) {
            this.f99508c = z10;
            e();
            l();
        }

        @Override // j3.f.b
        public void e() {
            this.f99506a.setTransformationMethod(f(this.f99506a.getTransformationMethod()));
        }

        @Override // j3.f.b
        @Nullable
        public TransformationMethod f(@Nullable TransformationMethod transformationMethod) {
            return this.f99508c ? m(transformationMethod) : k(transformationMethod);
        }

        @NonNull
        public final InputFilter[] g(@NonNull InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.f99507b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.f99507b;
            return inputFilterArr2;
        }

        public final SparseArray<InputFilter> h(@NonNull InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> sparseArray = new SparseArray<>(1);
            for (int i10 = 0; i10 < inputFilterArr.length; i10++) {
                InputFilter inputFilter = inputFilterArr[i10];
                if (inputFilter instanceof d) {
                    sparseArray.put(i10, inputFilter);
                }
            }
            return sparseArray;
        }

        @NonNull
        public final InputFilter[] i(@NonNull InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> sparseArrayH = h(inputFilterArr);
            if (sparseArrayH.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArrayH.size()];
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                if (sparseArrayH.indexOfKey(i11) < 0) {
                    inputFilterArr2[i10] = inputFilterArr[i11];
                    i10++;
                }
            }
            return inputFilterArr2;
        }

        @y0({y0.a.LIBRARY})
        public void j(boolean z10) {
            this.f99508c = z10;
        }

        @Nullable
        public final TransformationMethod k(@Nullable TransformationMethod transformationMethod) {
            return transformationMethod instanceof h ? ((h) transformationMethod).a() : transformationMethod;
        }

        public final void l() {
            this.f99506a.setFilters(a(this.f99506a.getFilters()));
        }

        @NonNull
        public final TransformationMethod m(@Nullable TransformationMethod transformationMethod) {
            return ((transformationMethod instanceof h) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new h(transformationMethod);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(19)
    public static class c extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f99509a;

        public c(TextView textView) {
            this.f99509a = new a(textView);
        }

        @Override // j3.f.b
        @NonNull
        public InputFilter[] a(@NonNull InputFilter[] inputFilterArr) {
            return g() ? inputFilterArr : this.f99509a.a(inputFilterArr);
        }

        @Override // j3.f.b
        public boolean b() {
            return this.f99509a.b();
        }

        @Override // j3.f.b
        public void c(boolean z10) {
            if (g()) {
                return;
            }
            this.f99509a.c(z10);
        }

        @Override // j3.f.b
        public void d(boolean z10) {
            if (g()) {
                this.f99509a.j(z10);
            } else {
                this.f99509a.d(z10);
            }
        }

        @Override // j3.f.b
        public void e() {
            if (g()) {
                return;
            }
            this.f99509a.e();
        }

        @Override // j3.f.b
        @Nullable
        public TransformationMethod f(@Nullable TransformationMethod transformationMethod) {
            return g() ? transformationMethod : this.f99509a.f(transformationMethod);
        }

        public final boolean g() {
            return !androidx.emoji2.text.g.q();
        }
    }

    public f(@NonNull TextView textView) {
        this(textView, true);
    }

    @NonNull
    public InputFilter[] a(@NonNull InputFilter[] inputFilterArr) {
        return this.f99505a.a(inputFilterArr);
    }

    public boolean b() {
        return this.f99505a.b();
    }

    public void c(boolean z10) {
        this.f99505a.c(z10);
    }

    public void d(boolean z10) {
        this.f99505a.d(z10);
    }

    public void e() {
        this.f99505a.e();
    }

    @Nullable
    public TransformationMethod f(@Nullable TransformationMethod transformationMethod) {
        return this.f99505a.f(transformationMethod);
    }

    public f(@NonNull TextView textView, boolean z10) {
        x.m(textView, "textView cannot be null");
        if (z10) {
            this.f99505a = new a(textView);
        } else {
            this.f99505a = new c(textView);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b {
        public boolean b() {
            return false;
        }

        @NonNull
        public InputFilter[] a(@NonNull InputFilter[] inputFilterArr) {
            return inputFilterArr;
        }

        public void c(boolean z10) {
        }

        public void d(boolean z10) {
        }

        public void e() {
        }

        @Nullable
        public TransformationMethod f(@Nullable TransformationMethod transformationMethod) {
            return transformationMethod;
        }
    }
}
