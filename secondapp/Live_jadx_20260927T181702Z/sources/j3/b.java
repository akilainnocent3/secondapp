package j3;

import android.annotation.SuppressLint;
import android.text.Editable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.emoji2.text.r;
import k.a0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class b extends Editable.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f99494a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @a0("INSTANCE_LOCK")
    public static volatile Editable.Factory f99495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public static Class<?> f99496c;

    @SuppressLint({"PrivateApi"})
    public b() {
        try {
            f99496c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f99495b == null) {
            synchronized (f99494a) {
                try {
                    if (f99495b == null) {
                        f99495b = new b();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f99495b;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(@NonNull CharSequence charSequence) {
        Class<?> cls = f99496c;
        return cls != null ? r.c(cls, charSequence) : super.newEditable(charSequence);
    }
}
