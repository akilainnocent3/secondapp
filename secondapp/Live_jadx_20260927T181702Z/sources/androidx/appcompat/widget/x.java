package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final EditText f7457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final j3.a f7458b;

    public x(@NonNull EditText editText) {
        this.f7457a = editText;
        this.f7458b = new j3.a(editText, false);
    }

    @Nullable
    public KeyListener a(@Nullable KeyListener keyListener) {
        return b(keyListener) ? this.f7458b.b(keyListener) : keyListener;
    }

    public boolean b(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    public boolean c() {
        return this.f7458b.d();
    }

    public void d(@Nullable AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = this.f7457a.getContext().obtainStyledAttributes(attributeSet, m.a.m.f106166v0, i10, 0);
        try {
            boolean z10 = typedArrayObtainStyledAttributes.hasValue(m.a.m.K0) ? typedArrayObtainStyledAttributes.getBoolean(m.a.m.K0, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            f(z10);
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    @Nullable
    public InputConnection e(@Nullable InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
        return this.f7458b.e(inputConnection, editorInfo);
    }

    public void f(boolean z10) {
        this.f7458b.g(z10);
    }
}
