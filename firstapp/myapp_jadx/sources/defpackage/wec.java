package defpackage;

import android.text.method.PasswordTransformationMethod;
import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public final class wec extends PasswordTransformationMethod {
    public char a;

    public class a implements CharSequence {
        public final CharSequence a;

        public a(CharSequence charSequence) {
            this.a = charSequence;
        }

        @Override // java.lang.CharSequence
        public final char charAt(int i) {
            char c = wec.this.a;
            CharSequence charSequence = this.a;
            if (charSequence.charAt(i) == ' ') {
                return charSequence.charAt(i);
            }
            return (c == '0' || charSequence.length() - i <= 4) ? charSequence.charAt(i) : c;
        }

        @Override // java.lang.CharSequence
        public final int length() {
            return this.a.length();
        }

        @Override // java.lang.CharSequence
        public final CharSequence subSequence(int i, int i2) {
            return this.a.subSequence(i, i2);
        }
    }

    @Override // android.text.method.PasswordTransformationMethod, android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        return new a(charSequence);
    }
}
