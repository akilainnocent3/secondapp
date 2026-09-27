package f2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GestureDetector f82331a;

    public e0(@NonNull Context context, @NonNull GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    public boolean a() {
        return this.f82331a.isLongpressEnabled();
    }

    public boolean b(@NonNull MotionEvent motionEvent) {
        return this.f82331a.onTouchEvent(motionEvent);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void c(boolean z10) {
        this.f82331a.setIsLongpressEnabled(z10);
    }

    public void d(@Nullable GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f82331a.setOnDoubleTapListener(onDoubleTapListener);
    }

    public e0(@NonNull Context context, @NonNull GestureDetector.OnGestureListener onGestureListener, @Nullable Handler handler) {
        this.f82331a = new GestureDetector(context, onGestureListener, handler);
    }
}
