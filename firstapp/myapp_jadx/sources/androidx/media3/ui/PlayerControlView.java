package androidx.media3.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.PlayerControlView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import com.sportybet.android.gp.tz.R;
import defpackage.alc;
import defpackage.bkg0;
import defpackage.c150;
import defpackage.cft;
import defpackage.cl30;
import defpackage.eid;
import defpackage.eo10;
import defpackage.gqm;
import defpackage.jjg0;
import defpackage.jrh0;
import defpackage.kf;
import defpackage.ly0;
import defpackage.mkc;
import defpackage.ojv;
import defpackage.pcn;
import defpackage.pp10;
import defpackage.qxf0;
import defpackage.rjg0;
import defpackage.so10;
import defpackage.th50;
import defpackage.uo10;
import defpackage.uuw;
import defpackage.ykc;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class PlayerControlView extends FrameLayout {
    public static final float[] W0;
    public final g A;
    public final Drawable A0;
    public final d B;
    public final Drawable B0;
    public final i C;
    public final String C0;
    public final a D;
    public final String D0;
    public final eid E;
    public so10 E0;
    public final PopupWindow F;
    public c F0;
    public final int G;
    public boolean G0;
    public final ImageView H;
    public boolean H0;
    public final ImageView I;
    public boolean I0;
    public final ImageView J;
    public boolean J0;
    public final View K;
    public boolean K0;
    public final View L;
    public boolean L0;
    public final TextView M;
    public int M0;
    public final TextView N;
    public boolean N0;
    public final ImageView O;
    public int O0;
    public final ImageView P;
    public int P0;
    public final ImageView Q;
    public long[] Q0;
    public final ImageView R;
    public boolean[] R0;
    public final ImageView S;
    public long[] S0;
    public final ImageView T;
    public boolean[] T0;
    public final View U;
    public long U0;
    public final View V;
    public boolean V0;
    public final View W;
    public final pp10 a;
    public final TextView a0;
    public final Resources b;
    public final TextView b0;
    public final b c;
    public final androidx.media3.ui.b c0;
    public final Class<?> d;
    public final StringBuilder d0;
    public final Method e;
    public final Formatter e0;
    public final Method f;
    public final qxf0.b f0;
    public final qxf0.c g0;
    public final uo10 h0;
    public final Class<?> i;
    public final Drawable i0;
    public final Drawable j0;
    public final Drawable k0;
    public final Drawable l0;
    public final Drawable m0;
    public final String n0;
    public final String o0;
    public final String p0;
    public final Drawable q0;
    public final Drawable r0;
    public final float s0;
    public final float t0;
    public final String u0;
    public final Method v;
    public final String v0;
    public final Method w;
    public final Drawable w0;
    public final Drawable x0;
    public final CopyOnWriteArrayList<l> y;
    public final String y0;
    public final RecyclerView z;
    public final String z0;

    public final class a extends k {
        public a() {
            super();
        }

        @Override // androidx.media3.ui.PlayerControlView.k
        public final void j(h hVar) {
            hVar.a.setText(R.string.exo_track_selection_auto);
            so10 so10Var = PlayerControlView.this.E0;
            so10Var.getClass();
            hVar.b.setVisibility(l(so10Var.x()) ? 4 : 0);
            hVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: xo10
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PlayerControlView playerControlView = PlayerControlView.this;
                    so10 so10Var2 = playerControlView.E0;
                    if (so10Var2 == null || !so10Var2.t(29)) {
                        return;
                    }
                    rjg0 rjg0VarX = playerControlView.E0.x();
                    so10 so10Var3 = playerControlView.E0;
                    String str = jrh0.a;
                    so10Var3.l(rjg0VarX.a().b(1).j(1, false).a());
                    PlayerControlView.g gVar = playerControlView.A;
                    gVar.b[1] = playerControlView.getResources().getString(R.string.exo_track_selection_auto);
                    playerControlView.F.dismiss();
                }
            });
        }

        @Override // androidx.media3.ui.PlayerControlView.k
        public final void k(String str) {
            PlayerControlView.this.A.b[1] = str;
        }

        public final boolean l(rjg0 rjg0Var) {
            for (int i = 0; i < this.a.size(); i++) {
                if (rjg0Var.t.containsKey(this.a.get(i).a.b)) {
                    return true;
                }
            }
            return false;
        }
    }

    public final class b implements so10.c, androidx.media3.ui.b.a, View.OnClickListener, PopupWindow.OnDismissListener {
        public b() {
        }

        @Override // so10.c
        public final void I(androidx.media3.exoplayer.d dVar, so10.b bVar) {
            boolean zA = bVar.a(4, 5, 13);
            PlayerControlView playerControlView = PlayerControlView.this;
            if (zA) {
                float[] fArr = PlayerControlView.W0;
                playerControlView.q();
            }
            if (bVar.a(4, 5, 7, 13)) {
                float[] fArr2 = PlayerControlView.W0;
                playerControlView.s();
            }
            if (bVar.a(8, 13)) {
                float[] fArr3 = PlayerControlView.W0;
                playerControlView.t();
            }
            if (bVar.a(9, 13)) {
                float[] fArr4 = PlayerControlView.W0;
                playerControlView.v();
            }
            if (bVar.a(8, 9, 11, 0, 16, 17, 13)) {
                float[] fArr5 = PlayerControlView.W0;
                playerControlView.p();
            }
            if (bVar.a(11, 0, 13)) {
                float[] fArr6 = PlayerControlView.W0;
                playerControlView.w();
            }
            if (bVar.a(12, 13)) {
                float[] fArr7 = PlayerControlView.W0;
                playerControlView.r();
            }
            if (bVar.a(2, 13)) {
                float[] fArr8 = PlayerControlView.W0;
                playerControlView.x();
            }
        }

        @Override // androidx.media3.ui.b.a
        public final void n(long j) {
            PlayerControlView playerControlView = PlayerControlView.this;
            playerControlView.L0 = true;
            TextView textView = playerControlView.b0;
            if (textView != null) {
                textView.setText(jrh0.C(playerControlView.d0, playerControlView.e0, j));
            }
            playerControlView.a.f();
            so10 so10Var = playerControlView.E0;
            if (so10Var == null || !playerControlView.N0) {
                return;
            }
            if (playerControlView.h(so10Var)) {
                try {
                    Method method = playerControlView.e;
                    method.getClass();
                    method.invoke(playerControlView.E0, Boolean.TRUE);
                    return;
                } catch (IllegalAccessException | InvocationTargetException e) {
                    gqm.a(e);
                    return;
                }
            }
            if (!playerControlView.g(playerControlView.E0)) {
                StringBuilder sb = new StringBuilder("Time bar scrubbing is enabled, but player is not an ExoPlayer or CompositionPlayer instance, so ignoring (because we can't enable scrubbing mode). player.class=");
                so10 so10Var2 = playerControlView.E0;
                so10Var2.getClass();
                sb.append(so10Var2.getClass());
                cft.g("PlayerControlView", sb.toString());
                return;
            }
            try {
                Method method2 = playerControlView.v;
                method2.getClass();
                method2.invoke(playerControlView.E0, Boolean.TRUE);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                gqm.a(e2);
            }
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            PlayerControlView playerControlView = PlayerControlView.this;
            ImageView imageView = playerControlView.R;
            View view2 = playerControlView.W;
            View view3 = playerControlView.V;
            View view4 = playerControlView.U;
            pp10 pp10Var = playerControlView.a;
            so10 so10Var = playerControlView.E0;
            if (so10Var == null) {
                return;
            }
            pp10Var.g();
            if (playerControlView.I == view) {
                if (so10Var.t(9)) {
                    so10Var.y();
                    return;
                }
                return;
            }
            if (playerControlView.H == view) {
                if (so10Var.t(7)) {
                    so10Var.m();
                    return;
                }
                return;
            }
            if (playerControlView.K == view) {
                if (so10Var.P() == 4 || !so10Var.t(12)) {
                    return;
                }
                so10Var.b0();
                return;
            }
            if (playerControlView.L == view) {
                if (so10Var.t(11)) {
                    so10Var.c0();
                    return;
                }
                return;
            }
            if (playerControlView.J == view) {
                if (jrh0.X(so10Var, playerControlView.J0)) {
                    jrh0.G(so10Var);
                    return;
                } else {
                    jrh0.F(so10Var);
                    return;
                }
            }
            if (playerControlView.O == view) {
                if (so10Var.t(15)) {
                    so10Var.V(uuw.b(so10Var.Y(), playerControlView.P0));
                    return;
                }
                return;
            }
            if (playerControlView.P == view) {
                if (so10Var.t(14)) {
                    so10Var.C(!so10Var.Z());
                    return;
                }
                return;
            }
            if (view4 == view) {
                pp10Var.f();
                playerControlView.d(playerControlView.A, view4);
                return;
            }
            if (view3 == view) {
                pp10Var.f();
                playerControlView.d(playerControlView.B, view3);
            } else if (view2 == view) {
                pp10Var.f();
                playerControlView.d(playerControlView.D, view2);
            } else if (imageView == view) {
                pp10Var.f();
                playerControlView.d(playerControlView.C, imageView);
            }
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            PlayerControlView playerControlView = PlayerControlView.this;
            if (playerControlView.V0) {
                playerControlView.a.g();
            }
        }

        @Override // androidx.media3.ui.b.a
        public final void r(long j) {
            PlayerControlView playerControlView = PlayerControlView.this;
            TextView textView = playerControlView.b0;
            if (textView != null) {
                textView.setText(jrh0.C(playerControlView.d0, playerControlView.e0, j));
            }
            if (playerControlView.j(playerControlView.E0)) {
                playerControlView.l(playerControlView.E0, j);
            }
        }

        @Override // androidx.media3.ui.b.a
        public final void v(long j, boolean z) {
            PlayerControlView playerControlView = PlayerControlView.this;
            playerControlView.L0 = false;
            so10 so10Var = playerControlView.E0;
            if (so10Var != null) {
                if (!z) {
                    playerControlView.l(so10Var, j);
                }
                if (playerControlView.h(playerControlView.E0)) {
                    try {
                        Method method = playerControlView.e;
                        method.getClass();
                        method.invoke(playerControlView.E0, Boolean.FALSE);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        gqm.a(e);
                        return;
                    }
                } else if (playerControlView.g(playerControlView.E0)) {
                    try {
                        Method method2 = playerControlView.v;
                        method2.getClass();
                        method2.invoke(playerControlView.E0, Boolean.FALSE);
                    } catch (IllegalAccessException | InvocationTargetException e2) {
                        gqm.a(e2);
                        return;
                    }
                }
            }
            playerControlView.a.g();
        }
    }

    @Deprecated
    public interface c {
    }

    public final class d extends RecyclerView.f<h> {
        public final String[] a;
        public final float[] b;
        public int c;

        public d(String[] strArr, float[] fArr) {
            this.a = strArr;
            this.b = fArr;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final int getItemCount() {
            return this.a.length;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final void onBindViewHolder(RecyclerView.d0 d0Var, final int i) {
            h hVar = (h) d0Var;
            String[] strArr = this.a;
            if (i < strArr.length) {
                hVar.a.setText(strArr[i]);
            }
            if (i == this.c) {
                hVar.itemView.setSelected(true);
                hVar.b.setVisibility(0);
            } else {
                hVar.itemView.setSelected(false);
                hVar.b.setVisibility(4);
            }
            hVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: yo10
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PlayerControlView.d dVar = this.a;
                    PlayerControlView playerControlView = PlayerControlView.this;
                    int i2 = dVar.c;
                    int i3 = i;
                    if (i3 != i2) {
                        playerControlView.setPlaybackSpeed(dVar.b[i3]);
                    }
                    playerControlView.F.dismiss();
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new h(LayoutInflater.from(PlayerControlView.this.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
        }
    }

    public interface e {
    }

    public final class f extends RecyclerView.d0 {
        public final TextView a;
        public final TextView b;
        public final ImageView c;

        public f(View view) {
            super(view);
            if (Build.VERSION.SDK_INT < 26) {
                view.setFocusable(true);
            }
            this.a = (TextView) view.findViewById(R.id.exo_main_text);
            this.b = (TextView) view.findViewById(R.id.exo_sub_text);
            this.c = (ImageView) view.findViewById(R.id.exo_icon);
            view.setOnClickListener(new View.OnClickListener() { // from class: zo10
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    PlayerControlView.f fVar = this.a;
                    PlayerControlView playerControlView = PlayerControlView.this;
                    int bindingAdapterPosition = fVar.getBindingAdapterPosition();
                    float[] fArr = PlayerControlView.W0;
                    View view3 = playerControlView.U;
                    if (bindingAdapterPosition == 0) {
                        PlayerControlView.d dVar = playerControlView.B;
                        view3.getClass();
                        playerControlView.d(dVar, view3);
                    } else {
                        if (bindingAdapterPosition != 1) {
                            playerControlView.F.dismiss();
                            return;
                        }
                        PlayerControlView.a aVar = playerControlView.D;
                        view3.getClass();
                        playerControlView.d(aVar, view3);
                    }
                }
            });
        }
    }

    public class g extends RecyclerView.f<f> {
        public final String[] a;
        public final String[] b;
        public final Drawable[] c;

        public g(String[] strArr, Drawable[] drawableArr) {
            this.a = strArr;
            this.b = new String[strArr.length];
            this.c = drawableArr;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final int getItemCount() {
            return this.a.length;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final long getItemId(int i) {
            return i;
        }

        public final boolean i(int i) {
            PlayerControlView playerControlView = PlayerControlView.this;
            so10 so10Var = playerControlView.E0;
            if (so10Var == null) {
                return false;
            }
            if (i != 0) {
                return i != 1 || (so10Var.t(30) && playerControlView.E0.t(29));
            }
            return so10Var.t(13);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
            f fVar = (f) d0Var;
            if (i(i)) {
                fVar.itemView.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            } else {
                fVar.itemView.setLayoutParams(new RecyclerView.LayoutParams(0, 0));
            }
            fVar.a.setText(this.a[i]);
            String str = this.b[i];
            TextView textView = fVar.b;
            if (str == null) {
                textView.setVisibility(8);
            } else {
                textView.setText(str);
            }
            Drawable drawable = this.c[i];
            ImageView imageView = fVar.c;
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setImageDrawable(drawable);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            PlayerControlView playerControlView = PlayerControlView.this;
            return playerControlView.new f(LayoutInflater.from(playerControlView.getContext()).inflate(R.layout.exo_styled_settings_list_item, viewGroup, false));
        }
    }

    public static class h extends RecyclerView.d0 {
        public final TextView a;
        public final View b;

        public h(View view) {
            super(view);
            if (Build.VERSION.SDK_INT < 26) {
                view.setFocusable(true);
            }
            this.a = (TextView) view.findViewById(R.id.exo_text);
            this.b = view.findViewById(R.id.exo_check);
        }
    }

    public final class i extends k {
        public i() {
            super();
        }

        @Override // androidx.media3.ui.PlayerControlView.k, androidx.recyclerview.widget.RecyclerView.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final void onBindViewHolder(h hVar, int i) {
            super.onBindViewHolder(hVar, i);
            if (i > 0) {
                j jVar = this.a.get(i - 1);
                hVar.b.setVisibility(jVar.a.e[jVar.b] ? 0 : 4);
            }
        }

        @Override // androidx.media3.ui.PlayerControlView.k
        public final void j(h hVar) {
            boolean z;
            hVar.a.setText(R.string.exo_track_selection_none);
            int i = 0;
            while (true) {
                if (i >= this.a.size()) {
                    z = true;
                    break;
                }
                j jVar = this.a.get(i);
                if (jVar.a.e[jVar.b]) {
                    z = false;
                    break;
                }
                i++;
            }
            hVar.b.setVisibility(z ? 0 : 4);
            hVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: ap10
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PlayerControlView playerControlView = PlayerControlView.this;
                    so10 so10Var = playerControlView.E0;
                    if (so10Var == null || !so10Var.t(29)) {
                        return;
                    }
                    playerControlView.E0.l(playerControlView.E0.x().a().b(3).e().g().i().a());
                    playerControlView.F.dismiss();
                }
            });
        }

        @Override // androidx.media3.ui.PlayerControlView.k
        public final void k(String str) {
        }

        public final void l(List<j> list) {
            PlayerControlView playerControlView = PlayerControlView.this;
            ImageView imageView = playerControlView.R;
            boolean z = false;
            for (int i = 0; i < ((c150) list).d; i++) {
                j jVar = (j) ((c150) list).get(i);
                if (jVar.a.e[jVar.b]) {
                    z = true;
                    break;
                }
            }
            if (imageView != null) {
                imageView.setImageDrawable(z ? playerControlView.w0 : playerControlView.x0);
                imageView.setContentDescription(z ? playerControlView.y0 : playerControlView.z0);
            }
            this.a = list;
        }
    }

    public static final class j {
        public final bkg0.a a;
        public final int b;
        public final String c;

        public j(bkg0 bkg0Var, int i, int i2, String str) {
            this.a = bkg0Var.a.get(i);
            this.b = i2;
            this.c = str;
        }
    }

    public abstract class k extends RecyclerView.f<h> {
        public List<j> a = new ArrayList();

        public k() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final int getItemCount() {
            if (this.a.isEmpty()) {
                return 0;
            }
            return this.a.size() + 1;
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0033  */
        @Override // androidx.recyclerview.widget.RecyclerView.f
        /* JADX INFO: renamed from: i */
        public void onBindViewHolder(h hVar, int i) {
            boolean z;
            final so10 so10Var = PlayerControlView.this.E0;
            if (so10Var == null) {
                return;
            }
            if (i == 0) {
                j(hVar);
                return;
            }
            final j jVar = this.a.get(i - 1);
            final jjg0 jjg0Var = jVar.a.b;
            if (so10Var.x().t.get(jjg0Var) != null) {
                z = jVar.a.e[jVar.b];
            }
            hVar.a.setText(jVar.c);
            hVar.b.setVisibility(z ? 0 : 4);
            hVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: bp10
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    so10 so10Var2 = so10Var;
                    if (so10Var2.t(29)) {
                        rjg0.b bVarA = so10Var2.x().a();
                        PlayerControlView.j jVar2 = jVar;
                        so10Var2.l(bVarA.f(new qjg0(jjg0Var, pcn.n(Integer.valueOf(jVar2.b)))).j(jVar2.a.b.c, false).a());
                        String str = jVar2.c;
                        PlayerControlView.k kVar = this.a;
                        kVar.k(str);
                        PlayerControlView.this.F.dismiss();
                    }
                }
            });
        }

        public abstract void j(h hVar);

        public abstract void k(String str);

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new h(LayoutInflater.from(PlayerControlView.this.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
        }
    }

    @Deprecated
    public interface l {
        void n(int i);
    }

    static {
        ojv.a("media3.ui");
        W0 = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v9, types: [uo10] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
    public PlayerControlView(Context context, AttributeSet attributeSet, int i2, AttributeSet attributeSet2) throws NoSuchMethodException {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int resourceId;
        int resourceId2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        int i16;
        Method method;
        Method method2;
        androidx.media3.ui.b bVar;
        Method method3;
        Class<?> cls;
        Method method4;
        int i17;
        androidx.media3.ui.b bVar2;
        super(context, attributeSet, i2);
        Class<?> cls2 = Boolean.TYPE;
        this.J0 = true;
        this.M0 = 5000;
        this.P0 = 0;
        this.O0 = r.d.DEFAULT_DRAG_ANIMATION_DURATION;
        int resourceId3 = R.layout.exo_player_control_view;
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, cl30.d, i2, 0);
            try {
                resourceId3 = typedArrayObtainStyledAttributes.getResourceId(6, R.layout.exo_player_control_view);
                int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(12, R.drawable.exo_styled_controls_play);
                int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(11, R.drawable.exo_styled_controls_pause);
                int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(10, R.drawable.exo_styled_controls_next);
                int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(7, R.drawable.exo_styled_controls_simple_fastforward);
                int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(15, R.drawable.exo_styled_controls_previous);
                int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(20, R.drawable.exo_styled_controls_simple_rewind);
                int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(9, R.drawable.exo_styled_controls_fullscreen_exit);
                int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(8, R.drawable.exo_styled_controls_fullscreen_enter);
                int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(17, R.drawable.exo_styled_controls_repeat_off);
                int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(18, R.drawable.exo_styled_controls_repeat_one);
                int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(16, R.drawable.exo_styled_controls_repeat_all);
                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(35, R.drawable.exo_styled_controls_shuffle_on);
                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(34, R.drawable.exo_styled_controls_shuffle_off);
                resourceId = typedArrayObtainStyledAttributes.getResourceId(37, R.drawable.exo_styled_controls_subtitle_on);
                resourceId2 = typedArrayObtainStyledAttributes.getResourceId(36, R.drawable.exo_styled_controls_subtitle_off);
                int resourceId17 = typedArrayObtainStyledAttributes.getResourceId(42, R.drawable.exo_styled_controls_vr);
                this.M0 = typedArrayObtainStyledAttributes.getInt(32, this.M0);
                this.P0 = typedArrayObtainStyledAttributes.getInt(19, this.P0);
                z5 = typedArrayObtainStyledAttributes.getBoolean(29, true);
                z6 = typedArrayObtainStyledAttributes.getBoolean(26, true);
                z7 = typedArrayObtainStyledAttributes.getBoolean(28, true);
                z8 = typedArrayObtainStyledAttributes.getBoolean(27, true);
                boolean z9 = typedArrayObtainStyledAttributes.getBoolean(30, false);
                boolean z10 = typedArrayObtainStyledAttributes.getBoolean(31, false);
                boolean z11 = typedArrayObtainStyledAttributes.getBoolean(33, false);
                this.N0 = typedArrayObtainStyledAttributes.getBoolean(39, false);
                setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(38, this.O0));
                boolean z12 = typedArrayObtainStyledAttributes.getBoolean(2, true);
                typedArrayObtainStyledAttributes.recycle();
                i4 = resourceId4;
                i5 = resourceId5;
                i6 = resourceId6;
                i7 = resourceId7;
                i8 = resourceId8;
                i9 = resourceId9;
                i10 = resourceId10;
                i12 = resourceId13;
                i13 = resourceId14;
                i14 = resourceId15;
                i15 = resourceId16;
                i16 = resourceId17;
                z3 = z10;
                z4 = z11;
                i11 = resourceId12;
                i3 = resourceId11;
                z2 = z9;
                z = z12;
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i3 = R.drawable.exo_styled_controls_fullscreen_enter;
            i4 = R.drawable.exo_styled_controls_play;
            i5 = R.drawable.exo_styled_controls_pause;
            i6 = R.drawable.exo_styled_controls_next;
            i7 = R.drawable.exo_styled_controls_simple_fastforward;
            i8 = R.drawable.exo_styled_controls_previous;
            i9 = R.drawable.exo_styled_controls_simple_rewind;
            i10 = R.drawable.exo_styled_controls_fullscreen_exit;
            i11 = R.drawable.exo_styled_controls_repeat_off;
            i12 = R.drawable.exo_styled_controls_repeat_one;
            i13 = R.drawable.exo_styled_controls_repeat_all;
            i14 = R.drawable.exo_styled_controls_shuffle_on;
            i15 = R.drawable.exo_styled_controls_shuffle_off;
            resourceId = R.drawable.exo_styled_controls_subtitle_on;
            resourceId2 = R.drawable.exo_styled_controls_subtitle_off;
            z = true;
            z2 = false;
            z3 = false;
            z4 = false;
            z5 = true;
            z6 = true;
            z7 = true;
            z8 = true;
            i16 = R.drawable.exo_styled_controls_vr;
        }
        LayoutInflater.from(context).inflate(resourceId3, this);
        setDescendantFocusability(262144);
        this.c = new b();
        this.y = new CopyOnWriteArrayList<>();
        this.f0 = new qxf0.b();
        this.g0 = new qxf0.c();
        StringBuilder sb = new StringBuilder();
        this.d0 = sb;
        int i18 = i15;
        this.e0 = new Formatter(sb, Locale.getDefault());
        this.Q0 = new long[0];
        this.R0 = new boolean[0];
        this.S0 = new long[0];
        this.T0 = new boolean[0];
        this.h0 = new Runnable() { // from class: uo10
            @Override // java.lang.Runnable
            public final void run() {
                float[] fArr = PlayerControlView.W0;
                this.a.s();
            }
        };
        try {
            method = ExoPlayer.class.getMethod("setScrubbingModeEnabled", cls2);
            try {
                method2 = ExoPlayer.class.getMethod("isScrubbingModeEnabled", null);
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                method2 = null;
            }
        } catch (ClassNotFoundException | NoSuchMethodException unused2) {
            method = null;
        }
        this.d = ExoPlayer.class;
        this.e = method;
        this.f = method2;
        try {
            cls = Class.forName("androidx.media3.transformer.CompositionPlayer");
            try {
                method3 = cls.getMethod("setScrubbingModeEnabled", cls2);
                bVar = null;
                try {
                    method4 = cls.getMethod("isScrubbingModeEnabled", null);
                } catch (ClassNotFoundException | NoSuchMethodException unused3) {
                    method4 = bVar;
                }
            } catch (ClassNotFoundException | NoSuchMethodException unused4) {
                bVar = null;
                method3 = null;
            }
        } catch (ClassNotFoundException | NoSuchMethodException unused5) {
            bVar = null;
            method3 = null;
            cls = null;
        }
        this.i = cls;
        this.v = method3;
        this.w = method4;
        this.a0 = (TextView) findViewById(R.id.exo_duration);
        this.b0 = (TextView) findViewById(R.id.exo_position);
        ImageView imageView = (ImageView) findViewById(R.id.exo_subtitle);
        this.R = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(this.c);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_fullscreen);
        this.S = imageView2;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: vo10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                float[] fArr = PlayerControlView.W0;
                PlayerControlView playerControlView = this.a;
                playerControlView.o(!playerControlView.G0);
            }
        };
        if (imageView2 == null) {
            i17 = 8;
        } else {
            i17 = 8;
            imageView2.setVisibility(8);
            imageView2.setOnClickListener(onClickListener);
        }
        ImageView imageView3 = (ImageView) findViewById(R.id.exo_minimal_fullscreen);
        this.T = imageView3;
        View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: vo10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                float[] fArr = PlayerControlView.W0;
                PlayerControlView playerControlView = this.a;
                playerControlView.o(!playerControlView.G0);
            }
        };
        if (imageView3 != null) {
            imageView3.setVisibility(i17);
            imageView3.setOnClickListener(onClickListener2);
        }
        View viewFindViewById = findViewById(R.id.exo_settings);
        this.U = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(this.c);
        }
        View viewFindViewById2 = findViewById(R.id.exo_playback_speed);
        this.V = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(this.c);
        }
        View viewFindViewById3 = findViewById(R.id.exo_audio_track);
        this.W = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(this.c);
        }
        androidx.media3.ui.b bVar3 = (androidx.media3.ui.b) findViewById(R.id.exo_progress);
        View viewFindViewById4 = findViewById(R.id.exo_progress_placeholder);
        if (bVar3 != null) {
            this.c0 = bVar3;
            bVar2 = bVar3;
        } else if (viewFindViewById4 != null) {
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context, null, 0, attributeSet2, R.style.ExoStyledControls_TimeBar);
            defaultTimeBar.setId(R.id.exo_progress);
            defaultTimeBar.setLayoutParams(viewFindViewById4.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById4.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById4);
            viewGroup.removeView(viewFindViewById4);
            viewGroup.addView(defaultTimeBar, iIndexOfChild);
            this.c0 = defaultTimeBar;
            bVar2 = defaultTimeBar;
        } else {
            this.c0 = bVar;
            bVar2 = null;
        }
        if (bVar2 != null) {
            bVar2.a(this.c);
        }
        Resources resources = context.getResources();
        this.b = resources;
        ImageView imageView4 = (ImageView) findViewById(R.id.exo_play_pause);
        this.J = imageView4;
        if (imageView4 != null) {
            imageView4.setOnClickListener(this.c);
        }
        ImageView imageView5 = (ImageView) findViewById(R.id.exo_prev);
        this.H = imageView5;
        if (imageView5 != null) {
            imageView5.setImageDrawable(resources.getDrawable(i8, context.getTheme()));
            imageView5.setOnClickListener(this.c);
        }
        ImageView imageView6 = (ImageView) findViewById(R.id.exo_next);
        this.I = imageView6;
        if (imageView6 != null) {
            imageView6.setImageDrawable(resources.getDrawable(i6, context.getTheme()));
            imageView6.setOnClickListener(this.c);
        }
        Typeface typefaceB = th50.b(context, R.font.roboto_medium_numbers);
        ImageView imageView7 = (ImageView) findViewById(R.id.exo_rew);
        TextView textView = (TextView) findViewById(R.id.exo_rew_with_amount);
        if (imageView7 != null) {
            imageView7.setImageDrawable(resources.getDrawable(i9, context.getTheme()));
            this.L = imageView7;
            this.N = null;
        } else if (textView != null) {
            textView.setTypeface(typefaceB);
            this.N = textView;
            this.L = textView;
        } else {
            this.N = null;
            this.L = null;
        }
        View view = this.L;
        if (view != null) {
            view.setOnClickListener(this.c);
        }
        ImageView imageView8 = (ImageView) findViewById(R.id.exo_ffwd);
        TextView textView2 = (TextView) findViewById(R.id.exo_ffwd_with_amount);
        if (imageView8 != null) {
            imageView8.setImageDrawable(resources.getDrawable(i7, context.getTheme()));
            this.K = imageView8;
            this.M = null;
        } else if (textView2 != null) {
            textView2.setTypeface(typefaceB);
            this.M = textView2;
            this.K = textView2;
        } else {
            this.M = null;
            this.K = null;
        }
        View view2 = this.K;
        if (view2 != null) {
            view2.setOnClickListener(this.c);
        }
        ImageView imageView9 = (ImageView) findViewById(R.id.exo_repeat_toggle);
        this.O = imageView9;
        if (imageView9 != null) {
            imageView9.setOnClickListener(this.c);
        }
        ImageView imageView10 = (ImageView) findViewById(R.id.exo_shuffle);
        this.P = imageView10;
        if (imageView10 != null) {
            imageView10.setOnClickListener(this.c);
        }
        this.s0 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.t0 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        ImageView imageView11 = (ImageView) findViewById(R.id.exo_vr);
        this.Q = imageView11;
        if (imageView11 != null) {
            imageView11.setImageDrawable(resources.getDrawable(i16, context.getTheme()));
            n(imageView11, false);
        }
        pp10 pp10Var = new pp10(this);
        this.a = pp10Var;
        pp10Var.C = z;
        g gVar = new g(new String[]{resources.getString(R.string.exo_controls_playback_speed), resources.getString(R.string.exo_track_selection_title_audio)}, new Drawable[]{resources.getDrawable(R.drawable.exo_styled_controls_speed, context.getTheme()), resources.getDrawable(R.drawable.exo_styled_controls_audiotrack, context.getTheme())});
        this.A = gVar;
        this.G = resources.getDimensionPixelSize(R.dimen.exo_settings_offset);
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(R.layout.exo_styled_settings_list, (ViewGroup) null);
        this.z = recyclerView;
        recyclerView.setAdapter(gVar);
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        PopupWindow popupWindow = new PopupWindow((View) recyclerView, -2, -2, true);
        this.F = popupWindow;
        popupWindow.setOnDismissListener(this.c);
        this.V0 = true;
        this.E = new eid(getResources());
        this.w0 = resources.getDrawable(resourceId, context.getTheme());
        this.x0 = resources.getDrawable(resourceId2, context.getTheme());
        this.y0 = resources.getString(R.string.exo_controls_cc_enabled_description);
        this.z0 = resources.getString(R.string.exo_controls_cc_disabled_description);
        this.C = new i();
        this.D = new a();
        this.B = new d(resources.getStringArray(R.array.exo_controls_playback_speeds), W0);
        this.i0 = resources.getDrawable(i4, context.getTheme());
        this.j0 = resources.getDrawable(i5, context.getTheme());
        this.A0 = resources.getDrawable(i10, context.getTheme());
        this.B0 = resources.getDrawable(i3, context.getTheme());
        this.k0 = resources.getDrawable(i11, context.getTheme());
        this.l0 = resources.getDrawable(i12, context.getTheme());
        this.m0 = resources.getDrawable(i13, context.getTheme());
        this.q0 = resources.getDrawable(i14, context.getTheme());
        this.r0 = resources.getDrawable(i18, context.getTheme());
        this.C0 = resources.getString(R.string.exo_controls_fullscreen_exit_description);
        this.D0 = resources.getString(R.string.exo_controls_fullscreen_enter_description);
        this.n0 = resources.getString(R.string.exo_controls_repeat_off_description);
        this.o0 = resources.getString(R.string.exo_controls_repeat_one_description);
        this.p0 = resources.getString(R.string.exo_controls_repeat_all_description);
        this.u0 = resources.getString(R.string.exo_controls_shuffle_on_description);
        this.v0 = resources.getString(R.string.exo_controls_shuffle_off_description);
        pp10Var.h((ViewGroup) findViewById(R.id.exo_bottom_bar), true);
        pp10Var.h(this.K, z6);
        pp10Var.h(this.L, z5);
        pp10Var.h(imageView5, z7);
        pp10Var.h(imageView6, z8);
        pp10Var.h(imageView10, z2);
        pp10Var.h(this.R, z3);
        pp10Var.h(imageView11, z4);
        pp10Var.h(imageView9, this.P0 != 0);
        addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: wo10
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view3, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26) {
                float[] fArr = PlayerControlView.W0;
                PlayerControlView playerControlView = this.a;
                int i27 = playerControlView.G;
                PopupWindow popupWindow2 = playerControlView.F;
                int i28 = i22 - i20;
                int i29 = i26 - i24;
                if (!(i21 - i19 == i25 - i23 && i28 == i29) && popupWindow2.isShowing()) {
                    playerControlView.u();
                    popupWindow2.update(view3, (playerControlView.getWidth() - popupWindow2.getWidth()) - i27, (-popupWindow2.getHeight()) - i27, -1, -1);
                }
            }
        });
    }

    public static boolean b(so10 so10Var, qxf0.c cVar) {
        qxf0 qxf0VarV;
        int iO;
        if (!so10Var.t(17) || (iO = (qxf0VarV = so10Var.v()).o()) <= 1 || iO > 100) {
            return false;
        }
        for (int i2 = 0; i2 < iO; i2++) {
            if (qxf0VarV.m(i2, cVar, 0L).l == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f2) {
        so10 so10Var = this.E0;
        if (so10Var == null || !so10Var.t(13)) {
            return;
        }
        so10 so10Var2 = this.E0;
        so10Var2.e(new eo10(f2, so10Var2.c().b));
    }

    public final boolean c(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        so10 so10Var = this.E0;
        if (so10Var == null) {
            return false;
        }
        if (keyCode != 90 && keyCode != 89 && keyCode != 85 && keyCode != 79 && keyCode != 126 && keyCode != 127 && keyCode != 87 && keyCode != 88) {
            return false;
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (so10Var.P() == 4 || !so10Var.t(12)) {
                return true;
            }
            so10Var.b0();
            return true;
        }
        if (keyCode == 89 && so10Var.t(11)) {
            so10Var.c0();
            return true;
        }
        if (keyEvent.getRepeatCount() != 0) {
            return true;
        }
        if (keyCode == 79 || keyCode == 85) {
            if (jrh0.X(so10Var, this.J0)) {
                jrh0.G(so10Var);
                return true;
            }
            jrh0.F(so10Var);
            return true;
        }
        if (keyCode == 87) {
            if (!so10Var.t(9)) {
                return true;
            }
            so10Var.y();
            return true;
        }
        if (keyCode == 88) {
            if (!so10Var.t(7)) {
                return true;
            }
            so10Var.m();
            return true;
        }
        if (keyCode == 126) {
            jrh0.G(so10Var);
            return true;
        }
        if (keyCode != 127) {
            return true;
        }
        jrh0.F(so10Var);
        return true;
    }

    public final void d(RecyclerView.f<?> fVar, View view) {
        this.z.setAdapter(fVar);
        u();
        this.V0 = false;
        PopupWindow popupWindow = this.F;
        popupWindow.dismiss();
        this.V0 = true;
        int width = getWidth() - popupWindow.getWidth();
        int i2 = this.G;
        popupWindow.showAsDropDown(view, width - i2, (-popupWindow.getHeight()) - i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return c(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public final c150 e(bkg0 bkg0Var, int i2) {
        pcn.a aVar = new pcn.a();
        pcn<bkg0.a> pcnVar = bkg0Var.a;
        for (int i3 = 0; i3 < pcnVar.size(); i3++) {
            bkg0.a aVar2 = pcnVar.get(i3);
            if (aVar2.b.c == i2) {
                for (int i4 = 0; i4 < aVar2.a; i4++) {
                    if (aVar2.a(i4)) {
                        androidx.media3.common.a aVar3 = aVar2.b.d[i4];
                        if ((aVar3.e & 2) == 0) {
                            aVar.c(new j(bkg0Var, i3, i4, this.E.a(aVar3)));
                        }
                    }
                }
            }
        }
        return aVar.g();
    }

    public final void f() {
        pp10 pp10Var = this.a;
        int i2 = pp10Var.z;
        if (i2 == 3 || i2 == 2) {
            return;
        }
        pp10Var.f();
        if (!pp10Var.C) {
            pp10Var.i(2);
        } else if (pp10Var.z == 1) {
            pp10Var.m.start();
        } else {
            pp10Var.n.start();
        }
    }

    public final boolean g(so10 so10Var) {
        Class<?> cls;
        return (so10Var == null || (cls = this.i) == null || !cls.isAssignableFrom(so10Var.getClass())) ? false : true;
    }

    public so10 getPlayer() {
        return this.E0;
    }

    public int getRepeatToggleModes() {
        return this.P0;
    }

    public boolean getShowShuffleButton() {
        return this.a.b(this.P);
    }

    public boolean getShowSubtitleButton() {
        return this.a.b(this.R);
    }

    public int getShowTimeoutMs() {
        return this.M0;
    }

    public boolean getShowVrButton() {
        return this.a.b(this.Q);
    }

    public final boolean h(so10 so10Var) {
        Class<?> cls;
        return (so10Var == null || (cls = this.d) == null || !cls.isAssignableFrom(so10Var.getClass())) ? false : true;
    }

    public final boolean i() {
        pp10 pp10Var = this.a;
        return pp10Var.z == 0 && pp10Var.a.k();
    }

    public final boolean j(so10 so10Var) {
        try {
            if (h(so10Var)) {
                Method method = this.f;
                method.getClass();
                Object objInvoke = method.invoke(so10Var, null);
                objInvoke.getClass();
                if (((Boolean) objInvoke).booleanValue()) {
                    return true;
                }
            }
            if (g(so10Var)) {
                Method method2 = this.w;
                method2.getClass();
                Object objInvoke2 = method2.invoke(so10Var, null);
                objInvoke2.getClass();
                if (((Boolean) objInvoke2).booleanValue()) {
                    return true;
                }
            }
            return false;
        } catch (IllegalAccessException e2) {
            e = e2;
            gqm.a(e);
            return false;
        } catch (InvocationTargetException e3) {
            e = e3;
            gqm.a(e);
            return false;
        }
    }

    public final boolean k() {
        return getVisibility() == 0;
    }

    public final void l(so10 so10Var, long j2) {
        if (this.K0) {
            if (so10Var.t(17) && so10Var.t(10)) {
                qxf0 qxf0VarV = so10Var.v();
                int iO = qxf0VarV.o();
                int i2 = 0;
                while (true) {
                    long jZ = jrh0.Z(qxf0VarV.m(i2, this.g0, 0L).l);
                    if (j2 < jZ) {
                        break;
                    }
                    if (i2 == iO - 1) {
                        j2 = jZ;
                        break;
                    } else {
                        j2 -= jZ;
                        i2++;
                    }
                }
                so10Var.A(i2, j2);
            }
        } else if (so10Var.t(5)) {
            so10Var.K(j2);
        }
        s();
    }

    public final void m() {
        q();
        p();
        t();
        v();
        x();
        r();
        w();
    }

    public final void n(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.setEnabled(z);
        view.setAlpha(z ? this.s0 : this.t0);
    }

    public final void o(boolean z) {
        PlayerView.d dVar;
        if (this.G0 == z) {
            return;
        }
        this.G0 = z;
        String str = this.D0;
        Drawable drawable = this.B0;
        String str2 = this.C0;
        Drawable drawable2 = this.A0;
        ImageView imageView = this.S;
        if (imageView != null) {
            if (z) {
                imageView.setImageDrawable(drawable2);
                imageView.setContentDescription(str2);
            } else {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            }
        }
        ImageView imageView2 = this.T;
        if (imageView2 != null) {
            if (z) {
                imageView2.setImageDrawable(drawable2);
                imageView2.setContentDescription(str2);
            } else {
                imageView2.setImageDrawable(drawable);
                imageView2.setContentDescription(str);
            }
        }
        c cVar = this.F0;
        if (cVar == null || (dVar = PlayerView.this.L) == null) {
            return;
        }
        ykc ykcVar = (ykc) dVar;
        ((mkc) ykcVar.a).a.invoke(Boolean.valueOf(!((alc) ykcVar.b).d));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        pp10 pp10Var = this.a;
        pp10Var.a.addOnLayoutChangeListener(pp10Var.x);
        this.H0 = true;
        if (i()) {
            pp10Var.g();
        }
        m();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        pp10 pp10Var = this.a;
        pp10Var.a.removeOnLayoutChangeListener(pp10Var.x);
        this.H0 = false;
        removeCallbacks(this.h0);
        pp10Var.f();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        View view = this.a.b;
        if (view != null) {
            view.layout(0, 0, i4 - i2, i5 - i3);
        }
    }

    public final void p() {
        boolean zT;
        boolean zT2;
        boolean zT3;
        boolean zT4;
        boolean zT5;
        if (k() && this.H0) {
            so10 so10Var = this.E0;
            if (so10Var != null) {
                zT = (this.I0 && b(so10Var, this.g0)) ? so10Var.t(10) : so10Var.t(5);
                zT3 = so10Var.t(7);
                zT4 = so10Var.t(11);
                zT5 = so10Var.t(12);
                zT2 = so10Var.t(9);
            } else {
                zT = false;
                zT2 = false;
                zT3 = false;
                zT4 = false;
                zT5 = false;
            }
            Resources resources = this.b;
            View view = this.L;
            if (zT4) {
                so10 so10Var2 = this.E0;
                int iF0 = (int) ((so10Var2 != null ? so10Var2.f0() : 5000L) / 1000);
                TextView textView = this.N;
                if (textView != null) {
                    textView.setText(String.valueOf(iF0));
                }
                if (view != null) {
                    view.setContentDescription(resources.getQuantityString(R.plurals.exo_controls_rewind_by_amount_description, iF0, Integer.valueOf(iF0)));
                }
            }
            View view2 = this.K;
            if (zT5) {
                so10 so10Var3 = this.E0;
                int iN = (int) ((so10Var3 != null ? so10Var3.N() : 15000L) / 1000);
                TextView textView2 = this.M;
                if (textView2 != null) {
                    textView2.setText(String.valueOf(iN));
                }
                if (view2 != null) {
                    view2.setContentDescription(resources.getQuantityString(R.plurals.exo_controls_fastforward_by_amount_description, iN, Integer.valueOf(iN)));
                }
            }
            n(this.H, zT3);
            n(view, zT4);
            n(view2, zT5);
            n(this.I, zT2);
            androidx.media3.ui.b bVar = this.c0;
            if (bVar != null) {
                bVar.setEnabled(zT);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0051  */
    public final void q() {
        ImageView imageView;
        boolean z;
        if (k() && this.H0 && (imageView = this.J) != null) {
            boolean zX = jrh0.X(this.E0, this.J0);
            Drawable drawable = zX ? this.i0 : this.j0;
            int i2 = zX ? R.string.exo_controls_play_description : R.string.exo_controls_pause_description;
            imageView.setImageDrawable(drawable);
            imageView.setContentDescription(this.b.getString(i2));
            so10 so10Var = this.E0;
            if (so10Var != null) {
                z = true;
                if (!so10Var.t(1) || (so10Var.t(17) && so10Var.v().p())) {
                    z = false;
                }
            } else {
                z = false;
            }
            n(imageView, z);
        }
    }

    public final void r() {
        d dVar;
        so10 so10Var = this.E0;
        if (so10Var == null) {
            return;
        }
        float f2 = so10Var.c().a;
        float f3 = Float.MAX_VALUE;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            dVar = this.B;
            float[] fArr = dVar.b;
            if (i2 >= fArr.length) {
                break;
            }
            float fAbs = Math.abs(f2 - fArr[i2]);
            if (fAbs < f3) {
                i3 = i2;
                f3 = fAbs;
            }
            i2++;
        }
        dVar.c = i3;
        String str = dVar.a[i3];
        g gVar = this.A;
        gVar.b[0] = str;
        n(this.U, gVar.i(1) || gVar.i(0));
    }

    public final void s() {
        long jO;
        long jA0;
        if (k() && this.H0) {
            so10 so10Var = this.E0;
            if (so10Var == null || !so10Var.t(16)) {
                jO = 0;
                jA0 = 0;
            } else {
                jO = so10Var.O() + this.U0;
                jA0 = so10Var.a0() + this.U0;
            }
            TextView textView = this.b0;
            if (textView != null && !this.L0) {
                textView.setText(jrh0.C(this.d0, this.e0, jO));
            }
            androidx.media3.ui.b bVar = this.c0;
            if (bVar != null) {
                bVar.setPosition(jO);
                if (j(so10Var)) {
                    jA0 = jO;
                }
                bVar.setBufferedPosition(jA0);
            }
            uo10 uo10Var = this.h0;
            removeCallbacks(uo10Var);
            int iP = so10Var == null ? 1 : so10Var.P();
            if (so10Var != null && so10Var.Q()) {
                long jMin = Math.min(bVar != null ? bVar.getPreferredUpdateDelay() : 1000L, 1000 - (jO % 1000));
                float f2 = so10Var.c().a;
                postDelayed(uo10Var, jrh0.j(f2 > 0.0f ? (long) (jMin / f2) : 1000L, this.O0, 1000L));
            } else {
                if (iP == 4 || iP == 1) {
                    return;
                }
                postDelayed(uo10Var, 1000L);
            }
        }
    }

    public void setAnimationEnabled(boolean z) {
        this.a.C = z;
    }

    public void setExtraAdGroupMarkers(long[] jArr, boolean[] zArr) {
        if (jArr == null) {
            this.S0 = new long[0];
            this.T0 = new boolean[0];
        } else {
            zArr.getClass();
            ly0.b(jArr.length == zArr.length);
            this.S0 = jArr;
            this.T0 = zArr;
        }
        w();
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(c cVar) {
        this.F0 = cVar;
        boolean z = cVar != null;
        ImageView imageView = this.S;
        if (imageView != null) {
            if (z) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
        boolean z2 = cVar != null;
        ImageView imageView2 = this.T;
        if (imageView2 == null) {
            return;
        }
        if (z2) {
            imageView2.setVisibility(0);
        } else {
            imageView2.setVisibility(8);
        }
    }

    public void setPlayer(so10 so10Var) {
        ly0.f(Looper.myLooper() == Looper.getMainLooper());
        ly0.b(so10Var == null || so10Var.w() == Looper.getMainLooper());
        so10 so10Var2 = this.E0;
        if (so10Var2 == so10Var) {
            return;
        }
        b bVar = this.c;
        if (so10Var2 != null) {
            so10Var2.W(bVar);
        }
        this.E0 = so10Var;
        if (so10Var != null) {
            so10Var.D(bVar);
        }
        m();
    }

    public void setProgressUpdateListener(e eVar) {
    }

    public void setRepeatToggleModes(int i2) {
        this.P0 = i2;
        so10 so10Var = this.E0;
        if (so10Var != null && so10Var.t(15)) {
            int iY = this.E0.Y();
            if (i2 == 0 && iY != 0) {
                this.E0.V(0);
            } else if (i2 == 1 && iY == 2) {
                this.E0.V(1);
            } else if (i2 == 2 && iY == 1) {
                this.E0.V(2);
            }
        }
        this.a.h(this.O, i2 != 0);
        t();
    }

    public void setShowFastForwardButton(boolean z) {
        this.a.h(this.K, z);
        p();
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z) {
        this.I0 = z;
        w();
    }

    public void setShowNextButton(boolean z) {
        this.a.h(this.I, z);
        p();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z) {
        this.J0 = z;
        q();
    }

    public void setShowPreviousButton(boolean z) {
        this.a.h(this.H, z);
        p();
    }

    public void setShowRewindButton(boolean z) {
        this.a.h(this.L, z);
        p();
    }

    public void setShowShuffleButton(boolean z) {
        this.a.h(this.P, z);
        v();
    }

    public void setShowSubtitleButton(boolean z) {
        this.a.h(this.R, z);
    }

    public void setShowTimeoutMs(int i2) {
        this.M0 = i2;
        if (i()) {
            this.a.g();
        }
    }

    public void setShowVrButton(boolean z) {
        this.a.h(this.Q, z);
    }

    public void setTimeBarMinUpdateInterval(int i2) {
        this.O0 = jrh0.i(i2, 16, 1000);
    }

    public void setTimeBarScrubbingEnabled(boolean z) {
        this.N0 = z;
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.Q;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
            n(imageView, onClickListener != null);
        }
    }

    public final void t() {
        ImageView imageView;
        if (k() && this.H0 && (imageView = this.O) != null) {
            if (this.P0 == 0) {
                n(imageView, false);
                return;
            }
            so10 so10Var = this.E0;
            String str = this.n0;
            Drawable drawable = this.k0;
            if (so10Var == null || !so10Var.t(15)) {
                n(imageView, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            n(imageView, true);
            int iY = so10Var.Y();
            if (iY == 0) {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            } else if (iY == 1) {
                imageView.setImageDrawable(this.l0);
                imageView.setContentDescription(this.o0);
            } else {
                if (iY != 2) {
                    return;
                }
                imageView.setImageDrawable(this.m0);
                imageView.setContentDescription(this.p0);
            }
        }
    }

    public final void u() {
        RecyclerView recyclerView = this.z;
        recyclerView.measure(0, 0);
        int width = getWidth();
        int i2 = this.G;
        int iMin = Math.min(recyclerView.getMeasuredWidth(), width - (i2 * 2));
        PopupWindow popupWindow = this.F;
        popupWindow.setWidth(iMin);
        popupWindow.setHeight(Math.min(getHeight() - (i2 * 2), recyclerView.getMeasuredHeight()));
    }

    public final void v() {
        ImageView imageView;
        if (k() && this.H0 && (imageView = this.P) != null) {
            so10 so10Var = this.E0;
            if (!this.a.b(imageView)) {
                n(imageView, false);
                return;
            }
            String str = this.v0;
            Drawable drawable = this.r0;
            if (so10Var == null || !so10Var.t(14)) {
                n(imageView, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            n(imageView, true);
            if (so10Var.Z()) {
                drawable = this.q0;
            }
            imageView.setImageDrawable(drawable);
            if (so10Var.Z()) {
                str = this.u0;
            }
            imageView.setContentDescription(str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0137  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [int] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX WARN: Type inference failed for: r21v6 */
    /* JADX WARN: Type inference failed for: r21v7 */
    /* JADX WARN: Type inference failed for: r21v8 */
    /* JADX WARN: Type inference failed for: r21v9 */
    /* JADX WARN: Type inference failed for: r2v10, types: [qxf0] */
    /* JADX WARN: Type inference failed for: r2v11, types: [qxf0] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r4v19, types: [kf] */
    /* JADX WARN: Type inference failed for: r7v1, types: [qxf0$b] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void w() {
        long jO;
        int i2;
        ?? r2;
        ?? r21;
        boolean z;
        ?? r3;
        boolean[] zArr;
        boolean z2;
        ?? r22;
        int length;
        so10 so10Var = this.E0;
        if (so10Var == null) {
            return;
        }
        boolean z3 = this.I0;
        qxf0.c cVar = this.g0;
        boolean z4 = false;
        boolean z5 = true;
        this.K0 = z3 && b(so10Var, cVar);
        long j2 = 0;
        this.U0 = 0L;
        qxf0 qxf0VarV = so10Var.t(17) ? so10Var.v() : qxf0.a;
        long j3 = -9223372036854775807L;
        if (qxf0VarV.p()) {
            if (so10Var.t(16)) {
                long jE = so10Var.E();
                if (jE != -9223372036854775807L) {
                    jO = jrh0.O(jE);
                } else {
                    jO = 0;
                }
            } else {
                jO = 0;
            }
            i2 = 0;
        } else {
            int iU = so10Var.U();
            boolean z6 = this.K0;
            int i3 = z6 ? 0 : iU;
            int iO = z6 ? qxf0VarV.o() - 1 : iU;
            i2 = 0;
            long j4 = 0;
            ?? r4 = qxf0VarV;
            while (i3 <= iO) {
                long j5 = j2;
                if (i3 == iU) {
                    this.U0 = jrh0.Z(j4);
                }
                r4.n(i3, cVar);
                if (cVar.l == j3) {
                    ly0.f(this.K0 ^ z5);
                    break;
                }
                int i4 = cVar.m;
                ?? r5 = r4;
                while (i4 <= cVar.n) {
                    ?? r7 = this.f0;
                    r5.f(i4, r7, z4);
                    long j6 = j3;
                    kf kfVar = r7.g;
                    kfVar.getClass();
                    int i5 = kfVar.a;
                    for (?? r10 = z4; r10 < i5; r10++) {
                        r7.d(r10);
                        long j7 = r7.e;
                        if (j7 >= j5) {
                            long[] jArr = this.Q0;
                            if (i2 == jArr.length) {
                                if (jArr.length == 0) {
                                    r2 = r5;
                                    length = 1;
                                } else {
                                    r2 = r5;
                                    length = jArr.length * 2;
                                }
                                this.Q0 = Arrays.copyOf(jArr, length);
                                this.R0 = Arrays.copyOf(this.R0, length);
                            }
                            r2 = r5;
                            this.Q0[i2] = jrh0.Z(j7 + j4);
                            boolean[] zArr2 = this.R0;
                            kf.a aVarA = r7.g.a(r10);
                            int i6 = aVarA.a;
                            if (i6 == -1) {
                                zArr = zArr2;
                                r22 = r2;
                                z = true;
                            } else {
                                int i7 = 0;
                                while (true) {
                                    if (i7 >= i6) {
                                        r3 = r2;
                                        zArr = zArr2;
                                        r21 = r3;
                                        z = true;
                                        z2 = false;
                                        break;
                                    }
                                    zArr = zArr2;
                                    int i8 = aVarA.d[i7];
                                    r22 = r3;
                                    z = true;
                                    if (i8 == 0) {
                                        r3 = r2;
                                    } else if (i8 != 1) {
                                        i7++;
                                        zArr2 = zArr;
                                        r3 = r22;
                                    }
                                }
                                zArr[i2] = z2 ^ z;
                                i2++;
                            }
                            z2 = z;
                            r21 = r22;
                            zArr[i2] = z2 ^ z;
                            i2++;
                        } else {
                            r2 = r5;
                            r21 = r2;
                            z = true;
                        }
                        z5 = z;
                        iU = iU;
                        r2 = r21;
                        j5 = 0;
                    }
                    r2 = r5;
                    i4++;
                    j3 = j6;
                    r5 = r2;
                    z4 = false;
                    j5 = 0;
                }
                j4 += cVar.l;
                i3++;
                z5 = z5;
                r4 = r5;
                z4 = false;
                j2 = 0;
            }
            jO = j4;
        }
        long jZ = jrh0.Z(jO);
        TextView textView = this.a0;
        if (textView != null) {
            textView.setText(jrh0.C(this.d0, this.e0, jZ));
        }
        androidx.media3.ui.b bVar = this.c0;
        if (bVar != null) {
            bVar.setDuration(jZ);
            int length2 = this.S0.length;
            int i9 = i2 + length2;
            long[] jArr2 = this.Q0;
            if (i9 > jArr2.length) {
                this.Q0 = Arrays.copyOf(jArr2, i9);
                this.R0 = Arrays.copyOf(this.R0, i9);
            }
            System.arraycopy(this.S0, 0, this.Q0, i2, length2);
            System.arraycopy(this.T0, 0, this.R0, i2, length2);
            bVar.setAdGroupTimesMs(this.Q0, this.R0, i9);
        }
        s();
    }

    public final void x() {
        i iVar = this.C;
        iVar.getClass();
        List<j> list = Collections.EMPTY_LIST;
        iVar.a = list;
        a aVar = this.D;
        aVar.getClass();
        aVar.a = list;
        so10 so10Var = this.E0;
        ImageView imageView = this.R;
        if (so10Var != null && so10Var.t(30) && this.E0.t(29)) {
            bkg0 bkg0VarP = this.E0.p();
            c150 c150VarE = e(bkg0VarP, 1);
            aVar.a = c150VarE;
            PlayerControlView playerControlView = PlayerControlView.this;
            so10 so10Var2 = playerControlView.E0;
            g gVar = playerControlView.A;
            so10Var2.getClass();
            rjg0 rjg0VarX = so10Var2.x();
            if (c150VarE.isEmpty()) {
                gVar.b[1] = playerControlView.getResources().getString(R.string.exo_track_selection_none);
            } else if (aVar.l(rjg0VarX)) {
                for (int i2 = 0; i2 < c150VarE.d; i2++) {
                    j jVar = (j) c150VarE.get(i2);
                    if (jVar.a.e[jVar.b]) {
                        gVar.b[1] = jVar.c;
                        break;
                    }
                }
            } else {
                gVar.b[1] = playerControlView.getResources().getString(R.string.exo_track_selection_auto);
            }
            if (this.a.b(imageView)) {
                iVar.l(e(bkg0VarP, 3));
            } else {
                pcn.b bVar = pcn.b;
                iVar.l(c150.e);
            }
        }
        n(imageView, iVar.getItemCount() > 0);
        g gVar2 = this.A;
        n(this.U, gVar2.i(1) || gVar2.i(0));
    }

    public PlayerControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlayerControlView(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, attributeSet);
    }

    public PlayerControlView(Context context) {
        this(context, null);
    }
}
