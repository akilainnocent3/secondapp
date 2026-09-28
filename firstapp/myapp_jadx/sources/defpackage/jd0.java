package defpackage;

import android.os.Build;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class jd0 implements z6i0 {
    public final ViewConfiguration a;

    public jd0(ViewConfiguration viewConfiguration) {
        this.a = viewConfiguration;
    }

    @Override // defpackage.z6i0
    public final long a() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // defpackage.z6i0
    public final long b() {
        return 40L;
    }

    @Override // defpackage.z6i0
    public final long c() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // defpackage.z6i0
    public final float d() {
        return this.a.getScaledMinimumFlingVelocity();
    }

    @Override // defpackage.z6i0
    public final float e() {
        if (Build.VERSION.SDK_INT >= 34) {
            return kd0.b(this.a);
        }
        return 2.0f;
    }

    @Override // defpackage.z6i0
    public final float g() {
        return this.a.getScaledMaximumFlingVelocity();
    }

    @Override // defpackage.z6i0
    public final float h() {
        return this.a.getScaledTouchSlop();
    }

    @Override // defpackage.z6i0
    public final float i() {
        if (Build.VERSION.SDK_INT >= 34) {
            return kd0.a(this.a);
        }
        return 16.0f;
    }
}
