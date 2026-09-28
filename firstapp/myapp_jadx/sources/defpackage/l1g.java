package defpackage;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.emoji2.text.d;

/* JADX INFO: loaded from: classes.dex */
public final class l1g {
    public final b a;

    public static class a extends b {
        public final TextView a;
        public final h1g b;
        public boolean c = true;

        public a(TextView textView) {
            this.a = textView;
            this.b = new h1g(textView);
        }

        @Override // l1g.b
        public final InputFilter[] a(InputFilter[] inputFilterArr) {
            if (!this.c) {
                SparseArray sparseArray = new SparseArray(1);
                for (int i = 0; i < inputFilterArr.length; i++) {
                    InputFilter inputFilter = inputFilterArr[i];
                    if (inputFilter instanceof h1g) {
                        sparseArray.put(i, inputFilter);
                    }
                }
                if (sparseArray.size() == 0) {
                    return inputFilterArr;
                }
                int length = inputFilterArr.length;
                InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
                int i2 = 0;
                for (int i3 = 0; i3 < length; i3++) {
                    if (sparseArray.indexOfKey(i3) < 0) {
                        inputFilterArr2[i2] = inputFilterArr[i3];
                        i2++;
                    }
                }
                return inputFilterArr2;
            }
            int length2 = inputFilterArr.length;
            int i4 = 0;
            while (true) {
                h1g h1gVar = this.b;
                if (i4 >= length2) {
                    InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                    System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                    inputFilterArr3[length2] = h1gVar;
                    return inputFilterArr3;
                }
                if (inputFilterArr[i4] == h1gVar) {
                    return inputFilterArr;
                }
                i4++;
            }
        }

        @Override // l1g.b
        public final boolean b() {
            return this.c;
        }

        @Override // l1g.b
        public final void c(boolean z) {
            if (z) {
                TextView textView = this.a;
                textView.setTransformationMethod(e(textView.getTransformationMethod()));
            }
        }

        @Override // l1g.b
        public final void d(boolean z) {
            this.c = z;
            TextView textView = this.a;
            textView.setTransformationMethod(e(textView.getTransformationMethod()));
            textView.setFilters(a(textView.getFilters()));
        }

        @Override // l1g.b
        public final TransformationMethod e(TransformationMethod transformationMethod) {
            if (this.c) {
                return ((transformationMethod instanceof n1g) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new n1g(transformationMethod);
            }
            return transformationMethod instanceof n1g ? ((n1g) transformationMethod).a : transformationMethod;
        }
    }

    public static class b {
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            throw null;
        }

        public boolean b() {
            throw null;
        }

        public void c(boolean z) {
            throw null;
        }

        public void d(boolean z) {
            throw null;
        }

        public TransformationMethod e(TransformationMethod transformationMethod) {
            throw null;
        }
    }

    public static class c extends b {
        public final a a;

        public c(TextView textView) {
            this.a = new a(textView);
        }

        @Override // l1g.b
        public final InputFilter[] a(InputFilter[] inputFilterArr) {
            return !d.d() ? inputFilterArr : this.a.a(inputFilterArr);
        }

        @Override // l1g.b
        public final boolean b() {
            return this.a.c;
        }

        @Override // l1g.b
        public final void c(boolean z) {
            if (d.d()) {
                this.a.c(z);
            }
        }

        @Override // l1g.b
        public final void d(boolean z) {
            boolean zD = d.d();
            a aVar = this.a;
            if (zD) {
                aVar.d(z);
            } else {
                aVar.c = z;
            }
        }

        @Override // l1g.b
        public final TransformationMethod e(TransformationMethod transformationMethod) {
            return !d.d() ? transformationMethod : this.a.e(transformationMethod);
        }
    }

    public l1g(TextView textView) {
        this.a = new c(textView);
    }
}
