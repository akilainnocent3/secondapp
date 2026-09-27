package j3;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import e2.x;
import k.e0;
import k.t0;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f99489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f99490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f99491c;

    /* JADX INFO: renamed from: j3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(19)
    public static class C0934a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EditText f99492a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final g f99493b;

        public C0934a(@NonNull EditText editText, boolean z10) {
            this.f99492a = editText;
            g gVar = new g(editText, z10);
            this.f99493b = gVar;
            editText.addTextChangedListener(gVar);
            editText.setEditableFactory(j3.b.getInstance());
        }

        @Override // j3.a.b
        public KeyListener a(@Nullable KeyListener keyListener) {
            if (keyListener instanceof e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return keyListener instanceof NumberKeyListener ? keyListener : new e(keyListener);
        }

        @Override // j3.a.b
        public boolean b() {
            return this.f99493b.d();
        }

        @Override // j3.a.b
        public InputConnection c(@NonNull InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
            return inputConnection instanceof c ? inputConnection : new c(this.f99492a, inputConnection, editorInfo);
        }

        @Override // j3.a.b
        public void d(int i10) {
            this.f99493b.f(i10);
        }

        @Override // j3.a.b
        public void e(boolean z10) {
            this.f99493b.g(z10);
        }

        @Override // j3.a.b
        public void f(int i10) {
            this.f99493b.h(i10);
        }
    }

    public a(@NonNull EditText editText) {
        this(editText, true);
    }

    @y0({y0.a.LIBRARY_GROUP})
    public int a() {
        return this.f99491c;
    }

    @Nullable
    public KeyListener b(@Nullable KeyListener keyListener) {
        return this.f99489a.a(keyListener);
    }

    public int c() {
        return this.f99490b;
    }

    public boolean d() {
        return this.f99489a.b();
    }

    @Nullable
    public InputConnection e(@Nullable InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f99489a.c(inputConnection, editorInfo);
    }

    @y0({y0.a.LIBRARY_GROUP})
    public void f(int i10) {
        this.f99491c = i10;
        this.f99489a.d(i10);
    }

    public void g(boolean z10) {
        this.f99489a.e(z10);
    }

    public void h(@e0(from = 0) int i10) {
        x.j(i10, "maxEmojiCount should be greater than 0");
        this.f99490b = i10;
        this.f99489a.f(i10);
    }

    public a(@NonNull EditText editText, boolean z10) {
        this.f99490b = Integer.MAX_VALUE;
        this.f99491c = 0;
        x.m(editText, "editText cannot be null");
        this.f99489a = new C0934a(editText, z10);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b {
        public boolean b() {
            return false;
        }

        @Nullable
        public KeyListener a(@Nullable KeyListener keyListener) {
            return keyListener;
        }

        public void d(int i10) {
        }

        public void e(boolean z10) {
        }

        public void f(int i10) {
        }

        public InputConnection c(@NonNull InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
            return inputConnection;
        }
    }
}
