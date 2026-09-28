package defpackage;

import android.content.Context;
import android.os.Build;
import androidx.compose.ui.graphics.layer.view.ViewLayerContainer;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class s70 implements t6l {
    public static boolean g = true;
    public final AndroidComposeView a;
    public final Object b = new Object();
    public ViewLayerContainer c;
    public boolean d;
    public jb0 e;
    public final q70 f;

    public static final class a {
        public static final long a(AndroidComposeView androidComposeView) {
            return androidComposeView.getUniqueDrawingId();
        }
    }

    public s70(AndroidComposeView androidComposeView) {
        this.a = androidComposeView;
        q70 q70Var = new q70(this);
        this.f = q70Var;
        if (androidComposeView.isAttachedToWindow()) {
            Context context = androidComposeView.getContext();
            if (!this.d) {
                context.getApplicationContext().registerComponentCallbacks(q70Var);
                this.d = true;
            }
        }
        androidComposeView.addOnAttachStateChangeListener(new r70(this));
    }

    @Override // defpackage.t6l
    public final void a(v6l v6lVar) {
        synchronized (this.b) {
            if (!v6lVar.s) {
                v6lVar.s = true;
                v6lVar.b();
            }
            Unit unit = Unit.a;
        }
    }

    @Override // defpackage.t6l
    public final jx80 b() {
        jb0 jb0Var = this.e;
        if (jb0Var != null) {
            return jb0Var;
        }
        jb0 jb0Var2 = new jb0();
        this.e = jb0Var2;
        return jb0Var2;
    }

    @Override // defpackage.t6l
    public final v6l c() {
        androidx.compose.ui.graphics.layer.a e7lVar;
        androidx.compose.ui.graphics.layer.a d7lVar;
        v6l v6lVar;
        synchronized (this.b) {
            try {
                AndroidComposeView androidComposeView = this.a;
                int i = Build.VERSION.SDK_INT;
                if (i >= 29) {
                    a.a(androidComposeView);
                }
                if (i >= 29) {
                    d7lVar = new d7l();
                } else {
                    if (g) {
                        try {
                            e7lVar = new c7l(this.a, new sc6(), new qc6());
                        } catch (Throwable unused) {
                            g = false;
                            AndroidComposeView androidComposeView2 = this.a;
                            ViewLayerContainer viewLayerContainer = this.c;
                            if (viewLayerContainer == null) {
                                ViewLayerContainer viewLayerContainer2 = new ViewLayerContainer(androidComposeView2.getContext());
                                androidComposeView2.addView(viewLayerContainer2, -1);
                                this.c = viewLayerContainer2;
                                viewLayerContainer = viewLayerContainer2;
                            }
                            e7lVar = new e7l(viewLayerContainer);
                        }
                    } else {
                        AndroidComposeView androidComposeView3 = this.a;
                        ViewLayerContainer viewLayerContainer3 = this.c;
                        if (viewLayerContainer3 == null) {
                            ViewLayerContainer viewLayerContainer4 = new ViewLayerContainer(androidComposeView3.getContext());
                            androidComposeView3.addView(viewLayerContainer4, -1);
                            this.c = viewLayerContainer4;
                            viewLayerContainer3 = viewLayerContainer4;
                        }
                        e7lVar = new e7l(viewLayerContainer3);
                    }
                    d7lVar = e7lVar;
                }
                v6lVar = new v6l(d7lVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return v6lVar;
    }
}
