package androidx.media3.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.AttachedSurfaceControl;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceControl;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.SurfaceSyncGroup;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.video.VideoDecoderGLSurfaceView;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;
import androidx.media3.ui.PlayerView;
import com.sportybet.android.gp.tz.R;
import defpackage.bkg0;
import defpackage.bo10;
import defpackage.cl30;
import defpackage.gqm;
import defpackage.hf;
import defpackage.iw5;
import defpackage.ly0;
import defpackage.o4c;
import defpackage.oq10;
import defpackage.pcn;
import defpackage.pp10;
import defpackage.qcg;
import defpackage.qxf0;
import defpackage.rzk;
import defpackage.so10;
import defpackage.v5i0;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class PlayerView extends FrameLayout {
    public static final /* synthetic */ int a0 = 0;
    public final PlayerControlView A;
    public final FrameLayout B;
    public final FrameLayout C;
    public final Handler D;
    public final Class<?> E;
    public final Method F;
    public final Object G;
    public so10 H;
    public boolean I;
    public c J;
    public PlayerControlView.l K;
    public d L;
    public int M;
    public int N;
    public Drawable O;
    public int P;
    public boolean Q;
    public CharSequence R;
    public int S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public final b a;
    public final AspectRatioFrameLayout b;
    public final View c;
    public final View d;
    public final boolean e;
    public final e f;
    public final ImageView i;
    public final ImageView v;
    public final SubtitleView w;
    public final View y;
    public final TextView z;

    public static class a {
        public static void a(SurfaceView surfaceView) {
            surfaceView.setSurfaceLifecycle(2);
        }
    }

    public final class b implements so10.c, View.OnClickListener, PlayerControlView.l, PlayerControlView.c {
        public final qxf0.b a = new qxf0.b();
        public Object b;

        public b() {
        }

        @Override // so10.c
        public final void C() {
            PlayerView playerView = PlayerView.this;
            View view = playerView.c;
            if (view != null) {
                view.setVisibility(4);
                if (!playerView.a()) {
                    playerView.b();
                    return;
                }
                ImageView imageView = playerView.i;
                if (imageView != null) {
                    imageView.setVisibility(4);
                }
            }
        }

        @Override // so10.c
        public final void K(int i, int i2) {
            PlayerView playerView = PlayerView.this;
            View view = playerView.d;
            if (Build.VERSION.SDK_INT == 34 && (view instanceof SurfaceView) && playerView.W) {
                final e eVar = playerView.f;
                eVar.getClass();
                Handler handler = playerView.D;
                final SurfaceView surfaceView = (SurfaceView) view;
                final oq10 oq10Var = new oq10(playerView);
                handler.post(new Runnable() { // from class: qq10
                    @Override // java.lang.Runnable
                    public final void run() {
                        eVar.a(surfaceView, oq10Var);
                    }
                });
            }
        }

        @Override // so10.c
        public final void Q(int i, boolean z) {
            int i2 = PlayerView.a0;
            PlayerView playerView = PlayerView.this;
            playerView.k();
            if (!playerView.c() || !playerView.U) {
                playerView.e(false);
                return;
            }
            PlayerControlView playerControlView = playerView.A;
            if (playerControlView != null) {
                playerControlView.f();
            }
        }

        @Override // so10.c
        public final void V(o4c o4cVar) {
            SubtitleView subtitleView = PlayerView.this.w;
            if (subtitleView != null) {
                subtitleView.setCues(o4cVar.a);
            }
        }

        @Override // so10.c
        public final void X(bkg0 bkg0Var) {
            PlayerView playerView = PlayerView.this;
            so10 so10Var = playerView.H;
            so10Var.getClass();
            qxf0 qxf0VarV = so10Var.t(17) ? so10Var.v() : qxf0.a;
            if (qxf0VarV.p()) {
                this.b = null;
            } else {
                boolean zT = so10Var.t(30);
                qxf0.b bVar = this.a;
                if (!zT || so10Var.p().a.isEmpty()) {
                    Object obj = this.b;
                    if (obj != null) {
                        int iB = qxf0VarV.b(obj);
                        if (iB != -1) {
                            if (so10Var.U() == qxf0VarV.f(iB, bVar, false).c) {
                                return;
                            }
                        }
                        this.b = null;
                    }
                } else {
                    this.b = qxf0VarV.f(so10Var.F(), bVar, true).b;
                }
            }
            playerView.n(false);
        }

        @Override // so10.c
        public final void a(v5i0 v5i0Var) {
            PlayerView playerView;
            so10 so10Var;
            if (v5i0Var.equals(v5i0.d) || (so10Var = (playerView = PlayerView.this).H) == null || so10Var.P() == 1) {
                return;
            }
            playerView.j();
        }

        @Override // androidx.media3.ui.PlayerControlView.l
        public final void n(int i) {
            int i2 = PlayerView.a0;
            PlayerView playerView = PlayerView.this;
            playerView.l();
            c cVar = playerView.J;
            if (cVar != null) {
                cVar.a(i);
            }
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i = PlayerView.a0;
            PlayerView.this.i();
        }

        @Override // so10.c
        public final void q(int i) {
            int i2 = PlayerView.a0;
            PlayerView playerView = PlayerView.this;
            playerView.k();
            playerView.m();
            if (!playerView.c() || !playerView.U) {
                playerView.e(false);
                return;
            }
            PlayerControlView playerControlView = playerView.A;
            if (playerControlView != null) {
                playerControlView.f();
            }
        }

        @Override // so10.c
        public final void z(int i, so10.d dVar, so10.d dVar2) {
            PlayerControlView playerControlView;
            int i2 = PlayerView.a0;
            PlayerView playerView = PlayerView.this;
            if (playerView.c() && playerView.U && (playerControlView = playerView.A) != null) {
                playerControlView.f();
            }
        }
    }

    public interface c {
        void a(int i);
    }

    public interface d {
    }

    public static final class e {
        public SurfaceSyncGroup a;

        public final /* synthetic */ void a(SurfaceView surfaceView, oq10 oq10Var) {
            AttachedSurfaceControl rootSurfaceControl = surfaceView.getRootSurfaceControl();
            if (rootSurfaceControl == null) {
                return;
            }
            SurfaceSyncGroup surfaceSyncGroup = new SurfaceSyncGroup("exo-sync-b-334901521");
            this.a = surfaceSyncGroup;
            ly0.f(surfaceSyncGroup.add(rootSurfaceControl, new iw5()));
            oq10Var.run();
            rootSurfaceControl.applyTransactionOnDraw(new SurfaceControl.Transaction());
        }

        public final void b() {
            SurfaceSyncGroup surfaceSyncGroup = this.a;
            if (surfaceSyncGroup != null) {
                surfaceSyncGroup.markSyncReady();
                this.a = null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PlayerView(Context context, AttributeSet attributeSet, int i) {
        int i2;
        int i3;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z5;
        boolean z6;
        int i10;
        boolean z7;
        Class<ExoPlayer> cls;
        Object objNewProxyInstance;
        Method method;
        int i11;
        super(context, attributeSet, i);
        b bVar = new b();
        this.a = bVar;
        this.D = new Handler(Looper.getMainLooper());
        if (isInEditMode()) {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = false;
            this.f = null;
            this.i = null;
            this.v = null;
            this.w = null;
            this.y = null;
            this.z = null;
            this.A = null;
            this.B = null;
            this.C = null;
            this.E = null;
            this.F = null;
            this.G = null;
            ImageView imageView = new ImageView(context);
            Resources resources = getResources();
            imageView.setImageDrawable(resources.getDrawable(2131231485, context.getTheme()));
            imageView.setBackgroundColor(resources.getColor(R.color.exo_edit_mode_background_color, null));
            addView(imageView);
            return;
        }
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, cl30.e, i, 0);
            try {
                boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(42);
                int color = typedArrayObtainStyledAttributes.getColor(42, 0);
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(22, R.layout.exo_player_view);
                boolean z8 = typedArrayObtainStyledAttributes.getBoolean(50, true);
                int i12 = typedArrayObtainStyledAttributes.getInt(3, 1);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(9, 0);
                int i13 = typedArrayObtainStyledAttributes.getInt(15, 0);
                boolean z9 = typedArrayObtainStyledAttributes.getBoolean(51, true);
                int i14 = typedArrayObtainStyledAttributes.getInt(45, 1);
                int i15 = typedArrayObtainStyledAttributes.getInt(28, 0);
                z = z9;
                i2 = typedArrayObtainStyledAttributes.getInt(38, 5000);
                boolean z10 = typedArrayObtainStyledAttributes.getBoolean(14, true);
                boolean z11 = typedArrayObtainStyledAttributes.getBoolean(4, true);
                int integer = typedArrayObtainStyledAttributes.getInteger(35, 0);
                this.Q = typedArrayObtainStyledAttributes.getBoolean(16, this.Q);
                boolean z12 = typedArrayObtainStyledAttributes.getBoolean(13, true);
                typedArrayObtainStyledAttributes.recycle();
                z4 = z12;
                z2 = z10;
                z6 = z8;
                i9 = color;
                i3 = resourceId;
                i5 = resourceId2;
                i7 = i15;
                z3 = z11;
                i4 = integer;
                i10 = i12;
                z5 = zHasValue;
                i8 = i14;
                i6 = i13;
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i2 = 5000;
            i3 = R.layout.exo_player_view;
            z = true;
            z2 = true;
            z3 = true;
            z4 = true;
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
            i8 = 1;
            i9 = 0;
            z5 = false;
            z6 = true;
            i10 = 1;
        }
        LayoutInflater.from(context).inflate(i3, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(R.id.exo_content_frame);
        this.b = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setResizeMode(i7);
        }
        View viewFindViewById = findViewById(R.id.exo_shutter);
        this.c = viewFindViewById;
        if (viewFindViewById != null && z5) {
            viewFindViewById.setBackgroundColor(i9);
        }
        if (aspectRatioFrameLayout == null || i8 == 0) {
            this.d = null;
            z7 = false;
        } else {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i8 != 2) {
                if (i8 == 3) {
                    try {
                        int i16 = SphericalGLSurfaceView.A;
                        this.d = (View) SphericalGLSurfaceView.class.getConstructor(Context.class).newInstance(context);
                        z7 = true;
                    } catch (Exception e2) {
                        rzk.b("spherical_gl_surface_view requires an ExoPlayer dependency", e2);
                        throw r6;
                    }
                } else if (i8 != 4) {
                    SurfaceView surfaceView = new SurfaceView(context);
                    if (Build.VERSION.SDK_INT >= 34) {
                        a.a(surfaceView);
                    }
                    this.d = surfaceView;
                } else {
                    try {
                        int i17 = VideoDecoderGLSurfaceView.b;
                        this.d = (View) VideoDecoderGLSurfaceView.class.getConstructor(Context.class).newInstance(context);
                    } catch (Exception e3) {
                        rzk.b("video_decoder_gl_surface_view requires an ExoPlayer dependency", e3);
                        throw r6;
                    }
                }
                this.d.setLayoutParams(layoutParams);
                this.d.setOnClickListener(bVar);
                this.d.setClickable(false);
                aspectRatioFrameLayout.addView(this.d, 0);
            } else {
                this.d = new TextureView(context);
            }
            z7 = false;
            this.d.setLayoutParams(layoutParams);
            this.d.setOnClickListener(bVar);
            this.d.setClickable(false);
            aspectRatioFrameLayout.addView(this.d, 0);
        }
        this.e = z7;
        this.f = Build.VERSION.SDK_INT == 34 ? new e() : null;
        this.B = (FrameLayout) findViewById(R.id.exo_ad_overlay);
        this.C = (FrameLayout) findViewById(R.id.exo_overlay);
        this.i = (ImageView) findViewById(R.id.exo_image);
        this.N = i6;
        try {
            cls = ExoPlayer.class;
            method = cls.getMethod("setImageOutput", ImageOutput.class);
            objNewProxyInstance = Proxy.newProxyInstance(ImageOutput.class.getClassLoader(), new Class[]{ImageOutput.class}, new InvocationHandler() { // from class: mq10
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj, Method method2, Object[] objArr) {
                    int i18 = PlayerView.a0;
                    if (!method2.getName().equals("onImageAvailable")) {
                        return null;
                    }
                    final Bitmap bitmap = (Bitmap) objArr[1];
                    final PlayerView playerView = this.a;
                    playerView.D.post(new Runnable() { // from class: nq10
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i19 = PlayerView.a0;
                            playerView.d(bitmap);
                        }
                    });
                    return null;
                }
            });
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            objNewProxyInstance = null;
            method = null;
        }
        this.E = cls;
        this.F = method;
        this.G = objNewProxyInstance;
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_artwork);
        this.v = imageView2;
        this.M = (!z6 || i10 == 0 || imageView2 == null) ? 0 : i10;
        if (i5 != 0) {
            this.O = getContext().getDrawable(i5);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(R.id.exo_subtitles);
        this.w = subtitleView;
        if (subtitleView != null) {
            subtitleView.setUserDefaultStyle();
            subtitleView.setUserDefaultTextSize();
        }
        View viewFindViewById2 = findViewById(R.id.exo_buffering);
        this.y = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
        }
        this.P = i4;
        TextView textView = (TextView) findViewById(R.id.exo_error_message);
        this.z = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        PlayerControlView playerControlView = (PlayerControlView) findViewById(R.id.exo_controller);
        View viewFindViewById3 = findViewById(R.id.exo_controller_placeholder);
        if (playerControlView != null) {
            this.A = playerControlView;
            i11 = 0;
        } else if (viewFindViewById3 != null) {
            i11 = 0;
            playerControlView = new PlayerControlView(context, null, 0, attributeSet);
            this.A = playerControlView;
            playerControlView.setId(R.id.exo_controller);
            playerControlView.setLayoutParams(viewFindViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById3.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById3);
            viewGroup.removeView(viewFindViewById3);
            viewGroup.addView(playerControlView, iIndexOfChild);
        } else {
            i11 = 0;
            this.A = null;
            playerControlView = null;
        }
        this.S = playerControlView != null ? i2 : i11;
        this.V = z2;
        this.T = z3;
        this.U = z4;
        this.I = (!z || playerControlView == null) ? i11 : 1;
        if (playerControlView != null) {
            pp10 pp10Var = playerControlView.a;
            int i18 = pp10Var.z;
            if (i18 != 3 && i18 != 2) {
                pp10Var.f();
                pp10Var.i(2);
            }
            b bVar2 = this.a;
            bVar2.getClass();
            playerControlView.y.add(bVar2);
        }
        if (z) {
            setClickable(true);
        }
        l();
    }

    private void setImage(Drawable drawable) {
        ImageView imageView = this.i;
        if (imageView == null) {
            return;
        }
        imageView.setImageDrawable(drawable);
        o();
    }

    private void setImageOutput(so10 so10Var) {
        Class<?> cls = this.E;
        if (cls == null || !cls.isAssignableFrom(so10Var.getClass())) {
            return;
        }
        try {
            Method method = this.F;
            method.getClass();
            Object obj = this.G;
            obj.getClass();
            method.invoke(so10Var, obj);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            gqm.a(e2);
        }
    }

    public final boolean a() {
        so10 so10Var = this.H;
        return so10Var != null && this.G != null && so10Var.t(30) && so10Var.p().a(4);
    }

    public final void b() {
        ImageView imageView = this.i;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        if (imageView != null) {
            imageView.setImageResource(android.R.color.transparent);
        }
    }

    public final boolean c() {
        so10 so10Var = this.H;
        return so10Var != null && so10Var.t(16) && this.H.g() && this.H.B();
    }

    public final void d(Bitmap bitmap) {
        setImage(new BitmapDrawable(getResources(), bitmap));
        so10 so10Var = this.H;
        if (so10Var != null && so10Var.t(30) && so10Var.p().a(2)) {
            return;
        }
        ImageView imageView = this.i;
        if (imageView != null) {
            imageView.setVisibility(0);
            o();
        }
        View view = this.c;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        e eVar;
        super.dispatchDraw(canvas);
        if (Build.VERSION.SDK_INT == 34 && (eVar = this.f) != null && this.W) {
            eVar.b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        so10 so10Var = this.H;
        if (so10Var != null && so10Var.t(16) && this.H.g()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        boolean z = keyCode == 19 || keyCode == 270 || keyCode == 22 || keyCode == 271 || keyCode == 20 || keyCode == 269 || keyCode == 21 || keyCode == 268 || keyCode == 23;
        PlayerControlView playerControlView = this.A;
        if (z && p() && !playerControlView.i()) {
            e(true);
            return true;
        }
        if ((p() && playerControlView.c(keyEvent)) || super.dispatchKeyEvent(keyEvent)) {
            e(true);
            return true;
        }
        if (z && p()) {
            e(true);
        }
        return false;
    }

    public final void e(boolean z) {
        if (!(c() && this.U) && p()) {
            PlayerControlView playerControlView = this.A;
            boolean z2 = playerControlView.i() && playerControlView.getShowTimeoutMs() <= 0;
            boolean zG = g();
            if (z || z2 || zG) {
                h(zG);
            }
        }
    }

    public final boolean f(Drawable drawable) {
        ImageView imageView = this.v;
        if (imageView != null && drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float width = intrinsicWidth / intrinsicHeight;
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                if (this.M == 2) {
                    width = getWidth() / getHeight();
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
                AspectRatioFrameLayout aspectRatioFrameLayout = this.b;
                if (aspectRatioFrameLayout != null) {
                    aspectRatioFrameLayout.setAspectRatio(width);
                }
                imageView.setScaleType(scaleType);
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    public final boolean g() {
        so10 so10Var = this.H;
        if (so10Var == null) {
            return true;
        }
        int iP = so10Var.P();
        if (!this.T) {
            return false;
        }
        if (this.H.t(17) && this.H.v().p()) {
            return false;
        }
        if (iP != 1 && iP != 4) {
            so10 so10Var2 = this.H;
            so10Var2.getClass();
            if (so10Var2.B()) {
                return false;
            }
        }
        return true;
    }

    public List<hf> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.C;
        if (frameLayout != null) {
            arrayList.add(new hf(frameLayout));
        }
        PlayerControlView playerControlView = this.A;
        if (playerControlView != null) {
            arrayList.add(new hf(playerControlView));
        }
        return pcn.j(arrayList);
    }

    public ViewGroup getAdViewGroup() {
        FrameLayout frameLayout = this.B;
        ly0.h(frameLayout, "exo_ad_overlay must be present for ad playback");
        return frameLayout;
    }

    public int getArtworkDisplayMode() {
        return this.M;
    }

    public boolean getControllerAutoShow() {
        return this.T;
    }

    public boolean getControllerHideOnTouch() {
        return this.V;
    }

    public int getControllerShowTimeoutMs() {
        return this.S;
    }

    public Drawable getDefaultArtwork() {
        return this.O;
    }

    public int getImageDisplayMode() {
        return this.N;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.C;
    }

    public so10 getPlayer() {
        return this.H;
    }

    public int getResizeMode() {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.b;
        ly0.g(aspectRatioFrameLayout);
        return aspectRatioFrameLayout.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.w;
    }

    @Deprecated
    public boolean getUseArtwork() {
        return this.M != 0;
    }

    public boolean getUseController() {
        return this.I;
    }

    public View getVideoSurfaceView() {
        return this.d;
    }

    public final void h(boolean z) {
        if (p()) {
            int i = z ? 0 : this.S;
            PlayerControlView playerControlView = this.A;
            playerControlView.setShowTimeoutMs(i);
            pp10 pp10Var = playerControlView.a;
            PlayerControlView playerControlView2 = pp10Var.a;
            if (!playerControlView2.k()) {
                playerControlView2.setVisibility(0);
                playerControlView2.m();
                ImageView imageView = playerControlView2.J;
                if (imageView != null) {
                    imageView.requestFocus();
                }
            }
            pp10Var.k();
        }
    }

    public final void i() {
        if (!p() || this.H == null) {
            return;
        }
        PlayerControlView playerControlView = this.A;
        if (!playerControlView.i()) {
            e(true);
        } else if (this.V) {
            playerControlView.f();
        }
    }

    public final void j() {
        so10 so10Var = this.H;
        v5i0 v5i0VarH = so10Var != null ? so10Var.H() : v5i0.d;
        int i = v5i0VarH.a;
        int i2 = v5i0VarH.b;
        float f = this.e ? 0.0f : (i2 == 0 || i == 0) ? 0.0f : (i * v5i0VarH.c) / i2;
        AspectRatioFrameLayout aspectRatioFrameLayout = this.b;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0020  */
    public final void k() {
        boolean z;
        View view = this.y;
        if (view != null) {
            so10 so10Var = this.H;
            if (so10Var == null || so10Var.P() != 2) {
                z = false;
            } else {
                int i = this.P;
                z = true;
                if (i != 2 && (i != 1 || !this.H.B())) {
                    z = false;
                }
            }
            view.setVisibility(z ? 0 : 8);
        }
    }

    public final void l() {
        PlayerControlView playerControlView = this.A;
        if (playerControlView == null || !this.I) {
            setContentDescription(null);
        } else if (playerControlView.i()) {
            setContentDescription(this.V ? getResources().getString(R.string.exo_controls_hide) : null);
        } else {
            setContentDescription(getResources().getString(R.string.exo_controls_show));
        }
    }

    public final void m() {
        TextView textView = this.z;
        if (textView != null) {
            CharSequence charSequence = this.R;
            if (charSequence != null) {
                textView.setText(charSequence);
                textView.setVisibility(0);
            } else {
                so10 so10Var = this.H;
                if (so10Var != null) {
                    so10Var.b();
                }
                textView.setVisibility(8);
            }
        }
    }

    public final void n(boolean z) {
        byte[] bArr;
        Drawable drawable;
        so10 so10Var = this.H;
        boolean zF = false;
        boolean z2 = (so10Var == null || !so10Var.t(30) || so10Var.p().a.isEmpty()) ? false : true;
        boolean z3 = this.Q;
        ImageView imageView = this.v;
        View view = this.c;
        if (!z3 && (!z2 || z)) {
            if (imageView != null) {
                imageView.setImageResource(android.R.color.transparent);
                imageView.setVisibility(4);
            }
            if (view != null) {
                view.setVisibility(0);
            }
            b();
        }
        if (z2) {
            so10 so10Var2 = this.H;
            boolean z4 = so10Var2 != null && so10Var2.t(30) && so10Var2.p().a(2);
            boolean zA = a();
            if (!z4 && !zA) {
                if (view != null) {
                    view.setVisibility(0);
                }
                b();
            }
            ImageView imageView2 = this.i;
            boolean z5 = (view == null || view.getVisibility() != 4 || imageView2 == null || (drawable = imageView2.getDrawable()) == null || drawable.getAlpha() == 0) ? false : true;
            if (zA && !z4 && z5) {
                if (view != null) {
                    view.setVisibility(0);
                }
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                    o();
                }
            } else if (z4 && !zA && z5) {
                b();
            }
            if (!z4 && !zA && this.M != 0) {
                ly0.g(imageView);
                if (so10Var != null && so10Var.t(18) && (bArr = so10Var.d0().f) != null) {
                    zF = f(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
                }
                if (zF || f(this.O)) {
                    return;
                }
            }
            if (imageView != null) {
                imageView.setImageResource(android.R.color.transparent);
                imageView.setVisibility(4);
            }
        }
    }

    public final void o() {
        Drawable drawable;
        AspectRatioFrameLayout aspectRatioFrameLayout;
        ImageView imageView = this.i;
        if (imageView == null || (drawable = imageView.getDrawable()) == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return;
        }
        float width = intrinsicWidth / intrinsicHeight;
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        if (this.N == 1) {
            width = getWidth() / getHeight();
            scaleType = ImageView.ScaleType.CENTER_CROP;
        }
        if (imageView.getVisibility() == 0 && (aspectRatioFrameLayout = this.b) != null) {
            aspectRatioFrameLayout.setAspectRatio(width);
        }
        imageView.setScaleType(scaleType);
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!p() || this.H == null) {
            return false;
        }
        e(true);
        return true;
    }

    public final boolean p() {
        if (!this.I) {
            return false;
        }
        ly0.g(this.A);
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        i();
        return super.performClick();
    }

    public void setArtworkDisplayMode(int i) {
        ly0.f(i == 0 || this.v != null);
        if (this.M != i) {
            this.M = i;
            n(false);
        }
    }

    public void setAspectRatioListener(AspectRatioFrameLayout.a aVar) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.b;
        ly0.g(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setAspectRatioListener(aVar);
    }

    public void setControllerAnimationEnabled(boolean z) {
        PlayerControlView playerControlView = this.A;
        ly0.g(playerControlView);
        playerControlView.setAnimationEnabled(z);
    }

    public void setControllerAutoShow(boolean z) {
        this.T = z;
    }

    public void setControllerHideDuringAds(boolean z) {
        this.U = z;
    }

    public void setControllerHideOnTouch(boolean z) {
        ly0.g(this.A);
        this.V = z;
        l();
    }

    @Deprecated
    public void setControllerOnFullScreenModeChangedListener(PlayerControlView.c cVar) {
        PlayerControlView playerControlView = this.A;
        ly0.g(playerControlView);
        this.L = null;
        playerControlView.setOnFullScreenModeChangedListener(cVar);
    }

    public void setControllerShowTimeoutMs(int i) {
        PlayerControlView playerControlView = this.A;
        ly0.g(playerControlView);
        this.S = i;
        if (playerControlView.i()) {
            h(g());
        }
    }

    @Deprecated
    public void setControllerVisibilityListener(PlayerControlView.l lVar) {
        PlayerControlView playerControlView = this.A;
        ly0.g(playerControlView);
        CopyOnWriteArrayList<PlayerControlView.l> copyOnWriteArrayList = playerControlView.y;
        PlayerControlView.l lVar2 = this.K;
        if (lVar2 == lVar) {
            return;
        }
        if (lVar2 != null) {
            copyOnWriteArrayList.remove(lVar2);
        }
        this.K = lVar;
        if (lVar != null) {
            copyOnWriteArrayList.add(lVar);
            setControllerVisibilityListener((c) null);
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        ly0.f(this.z != null);
        this.R = charSequence;
        m();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.O != drawable) {
            this.O = drawable;
            n(false);
        }
    }

    public void setEnableComposeSurfaceSyncWorkaround(boolean z) {
        this.W = z;
    }

    public void setErrorMessageProvider(qcg<? super bo10> qcgVar) {
        if (qcgVar != null) {
            m();
        }
    }

    public void setExtraAdGroupMarkers(long[] jArr, boolean[] zArr) {
        PlayerControlView playerControlView = this.A;
        ly0.g(playerControlView);
        playerControlView.setExtraAdGroupMarkers(jArr, zArr);
    }

    public void setFullscreenButtonClickListener(d dVar) {
        PlayerControlView playerControlView = this.A;
        ly0.g(playerControlView);
        this.L = dVar;
        playerControlView.setOnFullScreenModeChangedListener(this.a);
    }

    public void setFullscreenButtonState(boolean z) {
        PlayerControlView playerControlView = this.A;
        ly0.g(playerControlView);
        playerControlView.o(z);
    }

    public void setImageDisplayMode(int i) {
        ly0.f(this.i != null);
        if (this.N != i) {
            this.N = i;
            o();
        }
    }

    public void setKeepContentOnPlayerReset(boolean z) {
        if (this.Q != z) {
            this.Q = z;
            n(false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:68:0x00e8  */
    public void setPlayer(so10 so10Var) {
        boolean z = true;
        ly0.f(Looper.myLooper() == Looper.getMainLooper());
        ly0.b(so10Var == null || so10Var.w() == Looper.getMainLooper());
        so10 so10Var2 = this.H;
        if (so10Var2 == so10Var) {
            return;
        }
        View view = this.d;
        b bVar = this.a;
        if (so10Var2 != null) {
            so10Var2.W(bVar);
            if (so10Var2.t(27)) {
                if (view instanceof TextureView) {
                    so10Var2.G((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    so10Var2.X((SurfaceView) view);
                }
            }
            Class<?> cls = this.E;
            if (cls != null && cls.isAssignableFrom(so10Var2.getClass())) {
                try {
                    Method method = this.F;
                    method.getClass();
                    method.invoke(so10Var2, null);
                } catch (IllegalAccessException | InvocationTargetException e2) {
                    gqm.a(e2);
                    return;
                }
            }
        }
        SubtitleView subtitleView = this.w;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.H = so10Var;
        boolean zP = p();
        PlayerControlView playerControlView = this.A;
        if (zP) {
            playerControlView.setPlayer(so10Var);
        }
        k();
        m();
        n(true);
        if (so10Var == null) {
            if (playerControlView != null) {
                playerControlView.f();
                return;
            }
            return;
        }
        if (so10Var.t(27)) {
            if (view instanceof TextureView) {
                so10Var.z((TextureView) view);
            } else if (view instanceof SurfaceView) {
                so10Var.k((SurfaceView) view);
            }
            if (so10Var.t(30)) {
                pcn<bkg0.a> pcnVar = so10Var.p().a;
                int i = 0;
                loop0: while (true) {
                    if (i >= pcnVar.size()) {
                        z = false;
                        break;
                    }
                    if (pcnVar.get(i).b.c == 2) {
                        bkg0.a aVar = pcnVar.get(i);
                        for (int i2 = 0; i2 < aVar.d.length; i2++) {
                            if (aVar.a(i2)) {
                                break loop0;
                            }
                        }
                    }
                    i++;
                }
                if (z) {
                    j();
                }
            } else {
                j();
            }
        }
        if (subtitleView != null && so10Var.t(28)) {
            subtitleView.setCues(so10Var.r().a);
        }
        so10Var.D(bVar);
        setImageOutput(so10Var);
        e(false);
    }

    public void setRepeatToggleModes(int i) {
        PlayerControlView playerControlView = this.A;
        ly0.g(playerControlView);
        playerControlView.setRepeatToggleModes(i);
    }

    public void setResizeMode(int i) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.b;
        ly0.g(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setResizeMode(i);
    }

    public void setShowBuffering(int i) {
        if (this.P != i) {
            this.P = i;
            k();
        }
    }

    public void setShowFastForwardButton(boolean z) {
        PlayerControlView playerControlView = this.A;
        ly0.g(playerControlView);
        playerControlView.setShowFastForwardButton(z);
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z) {
        PlayerControlView playerControlView = this.A;
        ly0.g(playerControlView);
        playerControlView.setShowMultiWindowTimeBar(z);
    }

    public void setShowNextButton(boolean z) {
        PlayerControlView playerControlView = this.A;
        ly0.g(playerControlView);
        playerControlView.setShowNextButton(z);
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z) {
        PlayerControlView playerControlView = this.A;
        ly0.g(playerControlView);
        playerControlView.setShowPlayButtonIfPlaybackIsSuppressed(z);
    }

    public void setShowPreviousButton(boolean z) {
        PlayerControlView playerControlView = this.A;
        ly0.g(playerControlView);
        playerControlView.setShowPreviousButton(z);
    }

    public void setShowRewindButton(boolean z) {
        PlayerControlView playerControlView = this.A;
        ly0.g(playerControlView);
        playerControlView.setShowRewindButton(z);
    }

    public void setShowShuffleButton(boolean z) {
        PlayerControlView playerControlView = this.A;
        ly0.g(playerControlView);
        playerControlView.setShowShuffleButton(z);
    }

    public void setShowSubtitleButton(boolean z) {
        PlayerControlView playerControlView = this.A;
        ly0.g(playerControlView);
        playerControlView.setShowSubtitleButton(z);
    }

    public void setShowVrButton(boolean z) {
        PlayerControlView playerControlView = this.A;
        ly0.g(playerControlView);
        playerControlView.setShowVrButton(z);
    }

    public void setShutterBackgroundColor(int i) {
        View view = this.c;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    public void setTimeBarScrubbingEnabled(boolean z) {
        PlayerControlView playerControlView = this.A;
        ly0.g(playerControlView);
        playerControlView.setTimeBarScrubbingEnabled(z);
    }

    @Deprecated
    public void setUseArtwork(boolean z) {
        setArtworkDisplayMode(!z ? 1 : 0);
    }

    public void setUseController(boolean z) {
        boolean z2 = true;
        PlayerControlView playerControlView = this.A;
        ly0.f((z && playerControlView == null) ? false : true);
        if (!z && !hasOnClickListeners()) {
            z2 = false;
        }
        setClickable(z2);
        if (this.I == z) {
            return;
        }
        this.I = z;
        if (p()) {
            playerControlView.setPlayer(this.H);
        } else if (playerControlView != null) {
            playerControlView.f();
            playerControlView.setPlayer(null);
        }
        l();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.d;
        if (view instanceof SurfaceView) {
            view.setVisibility(i);
        }
    }

    public void setControllerVisibilityListener(c cVar) {
        this.J = cVar;
        if (cVar != null) {
            setControllerVisibilityListener((PlayerControlView.l) null);
        }
    }

    public PlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlayerView(Context context) {
        this(context, null);
    }
}
