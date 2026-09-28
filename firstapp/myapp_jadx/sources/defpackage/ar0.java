package defpackage;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.emoji2.text.d;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public final class ar0 {
    public final EditText a;
    public final c1g b;

    public ar0(EditText editText) {
        this.a = editText;
        this.b = new c1g(editText);
    }

    public final KeyListener a(KeyListener keyListener) {
        if ((keyListener instanceof NumberKeyListener) || (keyListener instanceof i1g)) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new i1g(keyListener);
    }

    public final void b(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, dl30.j, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            d(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final g1g c(InputConnection inputConnection, EditorInfo editorInfo) {
        InputConnection inputConnection2;
        if (inputConnection == null) {
            inputConnection2 = null;
        } else {
            c1g.a aVar = this.b.a;
            if (!(inputConnection instanceof g1g)) {
                inputConnection = new g1g(aVar.a, inputConnection, editorInfo);
            }
            inputConnection2 = inputConnection;
        }
        return (g1g) inputConnection2;
    }

    public final void d(boolean z) {
        m1g m1gVar = this.b.a.b;
        if (m1gVar.c != z) {
            if (m1gVar.b != null) {
                d dVarA = d.a();
                m1g.a aVar = m1gVar.b;
                dVarA.getClass();
                km20.f(aVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = dVarA.a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    dVarA.b.remove(aVar);
                    reentrantReadWriteLock.writeLock().unlock();
                } catch (Throwable th) {
                    reentrantReadWriteLock.writeLock().unlock();
                    throw th;
                }
            }
            m1gVar.c = z;
            if (z) {
                m1g.a(m1gVar.a, d.a().c());
            }
        }
    }
}
