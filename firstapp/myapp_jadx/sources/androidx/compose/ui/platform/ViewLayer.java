package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import defpackage.bxz;
import defpackage.jsg0;
import defpackage.lc6;
import defpackage.no50;
import defpackage.qtw;
import defpackage.v6l;
import defpackage.vgz;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\rR*\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0013\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\"\u0010\"\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0007\u001a\u0004\b\"\u0010\t\"\u0004\b#\u0010\u000bR\u001a\u0010%\u001a\u00020$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010(R$\u0010-\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010\u0010\"\u0004\b,\u0010\u0012R\u0016\u00101\u001a\u0004\u0018\u00010.8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"Landroidx/compose/ui/platform/ViewLayer;", "Landroid/view/View;", "Lvgz;", "", "", "value", "a", "Z", "isInvalidated", "()Z", "setInvalidated", "(Z)V", "", "b", "F", "getFrameRate", "()F", "setFrameRate", "(F)V", "frameRate", "Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "Landroidx/compose/ui/platform/AndroidComposeView;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "Landroidx/compose/ui/platform/DrawChildContainer;", "container", "Landroidx/compose/ui/platform/DrawChildContainer;", "getContainer", "()Landroidx/compose/ui/platform/DrawChildContainer;", "Lddv;", "getUnderlyingMatrix-sQKQjiQ", "()[F", "underlyingMatrix", "isFrameRateFromParent", "setFrameRateFromParent", "", "layerId", "J", "getLayerId", "()J", "getOwnerViewId", "ownerViewId", "getCameraDistancePx", "setCameraDistancePx", "cameraDistancePx", "Lbxz;", "getManualClipPath", "()Lbxz;", "manualClipPath", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ViewLayer extends View implements vgz {
    public static Method c;
    public static Field d;
    public static boolean e;
    public static boolean f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public boolean isInvalidated;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public float frameRate;

    public static final class a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            view.getClass();
            throw null;
        }
    }

    public static final class b {
    }

    static {
        new a();
    }

    private final bxz getManualClipPath() {
        if (getClipToOutline()) {
            throw null;
        }
        return null;
    }

    private final void setInvalidated(boolean z) {
        if (z == this.isInvalidated) {
            return;
        }
        this.isInvalidated = z;
        throw null;
    }

    @Override // defpackage.vgz
    public final void a(float[] fArr) {
        throw null;
    }

    @Override // defpackage.vgz
    public final void b(qtw qtwVar, boolean z) {
        if (!z) {
            throw null;
        }
        throw null;
    }

    @Override // defpackage.vgz
    public final void c(no50 no50Var) {
        int i = no50Var.a;
        throw null;
    }

    @Override // defpackage.vgz
    public final long d(long j, boolean z) {
        if (z) {
            throw null;
        }
        throw null;
    }

    @Override // defpackage.vgz
    public final void destroy() {
        setInvalidated(false);
        throw null;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        throw null;
    }

    @Override // defpackage.vgz
    public final void e(Function2<? super lc6, ? super v6l, Unit> function2, Function0<Unit> function0) {
        throw null;
    }

    @Override // defpackage.vgz
    public final void f(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (i == getWidth() && i2 == getHeight()) {
            return;
        }
        int i3 = jsg0.c;
        setPivotX(Float.intBitsToFloat(0) * i);
        setPivotY(Float.intBitsToFloat(0) * i2);
        throw null;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // defpackage.vgz
    public final void g(lc6 lc6Var, v6l v6lVar) {
        if (getElevation() > 0.0f) {
            lc6Var.j();
        }
        getDrawingTime();
        throw null;
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    public final DrawChildContainer getContainer() {
        return null;
    }

    public float getFrameRate() {
        return this.frameRate;
    }

    public long getLayerId() {
        return 0L;
    }

    public final AndroidComposeView getOwnerView() {
        return null;
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT < 29) {
            return -1L;
        }
        throw null;
    }

    @Override // defpackage.vgz
    /* JADX INFO: renamed from: getUnderlyingMatrix-sQKQjiQ, reason: not valid java name */
    public float[] mo2getUnderlyingMatrixsQKQjiQ() {
        throw null;
    }

    @Override // defpackage.vgz
    public final boolean h(long j) {
        Float.intBitsToFloat((int) (j >> 32));
        Float.intBitsToFloat((int) (j & 4294967295L));
        if (getClipToOutline()) {
            throw null;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // defpackage.vgz
    public final void i(float[] fArr) {
        throw null;
    }

    @Override // android.view.View, defpackage.vgz
    public final void invalidate() {
        if (this.isInvalidated) {
            return;
        }
        setInvalidated(true);
        super.invalidate();
        throw null;
    }

    @Override // defpackage.vgz
    public final void j(long j) {
        int i = (int) (j >> 32);
        if (i != getLeft()) {
            offsetLeftAndRight(i - getLeft());
            throw null;
        }
        int i2 = (int) (j & 4294967295L);
        if (i2 == getTop()) {
            return;
        }
        offsetTopAndBottom(i2 - getTop());
        throw null;
    }

    @Override // defpackage.vgz
    public final void k() {
        if (!this.isInvalidated || f) {
            return;
        }
        try {
            if (!e) {
                e = true;
                if (Build.VERSION.SDK_INT < 28) {
                    c = View.class.getDeclaredMethod("updateDisplayListIfDirty", null);
                    d = View.class.getDeclaredField("mRecreateDisplayList");
                } else {
                    c = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                    d = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                }
                Method method = c;
                if (method != null) {
                    method.setAccessible(true);
                }
                Field field = d;
                if (field != null) {
                    field.setAccessible(true);
                }
            }
            Field field2 = d;
            if (field2 != null) {
                field2.setBoolean(this, true);
            }
            Method method2 = c;
            if (method2 != null) {
                method2.invoke(this, null);
            }
        } catch (Throwable unused) {
            f = true;
        }
        setInvalidated(false);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public final void setCameraDistancePx(float f2) {
        setCameraDistance(f2 * getResources().getDisplayMetrics().densityDpi);
    }

    public void setFrameRate(float f2) {
        this.frameRate = f2;
    }

    public void setFrameRateFromParent(boolean z) {
    }
}
