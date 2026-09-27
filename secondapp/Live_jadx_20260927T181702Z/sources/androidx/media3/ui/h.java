package androidx.media3.ui;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.media.session.MediaSession;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import d1.l0;
import d1.z;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import k.e0;
import k.u;
import u4.c1;
import u4.d5;
import u4.g0;
import u4.h5;
import u4.i1;
import u4.k1;
import u4.o5;
import u4.r1;
import u4.s1;
import u4.u1;
import u4.v1;
import u4.y4;
import x4.b2;
import x4.m1;
import x4.s0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public class h {
    public static final String P = "androidx.media3.ui.notification.play";
    public static final String Q = "androidx.media3.ui.notification.pause";
    public static final String R = "androidx.media3.ui.notification.prev";
    public static final String S = "androidx.media3.ui.notification.next";
    public static final String T = "androidx.media3.ui.notification.ffwd";
    public static final String U = "androidx.media3.ui.notification.rewind";
    public static final String V = "androidx.media3.ui.notification.stop";
    public static final String W = "INSTANCE_ID";
    public static final String X = "androidx.media3.ui.notification.dismiss";
    public static final int Y = 1;
    public static final int Z = 2;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static int f17271a0;
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public int G;
    public boolean H;
    public int I;
    public int J;

    @u
    public int K;
    public int L;
    public int M;
    public boolean N;

    @Nullable
    public String O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f17272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f17275d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final InterfaceC0130h f17276e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final d f17277f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Handler f17278g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l0 f17279h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final IntentFilter f17280i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final u1.g f17281j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final g f17282k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Map<String, NotificationCompat.b> f17283l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Map<String, NotificationCompat.b> f17284m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final PendingIntent f17285n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f17286o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public NotificationCompat.n f17287p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public List<NotificationCompat.b> f17288q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public u1 f17289r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f17290s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f17291t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public MediaSession.Token f17292u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f17293v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f17294w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f17295x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f17296y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f17297z;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f17298a;

        public void a(Bitmap bitmap) {
            if (bitmap != null) {
                h.this.s(bitmap, this.f17298a);
            }
        }

        public b(int i10) {
            this.f17298a = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface d {
        Map<String, NotificationCompat.b> a(Context context, int i10);

        List<String> b(u1 u1Var);

        void c(u1 u1Var, String str, Intent intent);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface e {
        @Nullable
        Bitmap a(u1 u1Var, b bVar);

        @Nullable
        CharSequence b(u1 u1Var);

        CharSequence c(u1 u1Var);

        @Nullable
        PendingIntent d(u1 u1Var);

        @Nullable
        CharSequence e(u1 u1Var);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class f extends NotificationCompat.y {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int[] f17318e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public final MediaSession.Token f17319f;

        public f(@Nullable MediaSession.Token token, int[] iArr) {
            this.f17319f = token;
            this.f17318e = iArr;
        }

        @Override // androidx.core.app.NotificationCompat.y
        public void b(z zVar) {
            Notification.MediaStyle mediaStyle = new Notification.MediaStyle();
            mediaStyle.setShowActionsInCompactView(this.f17318e);
            MediaSession.Token token = this.f17319f;
            if (token != null) {
                mediaStyle.setMediaSession(token);
            }
            zVar.a().setStyle(mediaStyle);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class g extends BroadcastReceiver {
        public g() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            u1 u1Var = h.this.f17289r;
            if (u1Var != null && h.this.f17290s && intent.getIntExtra("INSTANCE_ID", h.this.f17286o) == h.this.f17286o) {
                String action = intent.getAction();
                if (h.P.equals(action)) {
                    b2.b1(u1Var);
                    return;
                }
                if (h.Q.equals(action)) {
                    b2.a1(u1Var);
                    return;
                }
                if (h.R.equals(action)) {
                    if (u1Var.o0(7)) {
                        u1Var.P();
                        return;
                    }
                    return;
                }
                if (h.U.equals(action)) {
                    if (u1Var.o0(11)) {
                        u1Var.e0();
                        return;
                    }
                    return;
                }
                if (h.T.equals(action)) {
                    if (u1Var.o0(12)) {
                        u1Var.I();
                        return;
                    }
                    return;
                }
                if (h.S.equals(action)) {
                    if (u1Var.o0(9)) {
                        u1Var.W();
                        return;
                    }
                    return;
                }
                if (h.V.equals(action)) {
                    if (u1Var.o0(3)) {
                        u1Var.stop();
                    }
                    if (u1Var.o0(20)) {
                        u1Var.clearMediaItems();
                        return;
                    }
                    return;
                }
                if (h.X.equals(action)) {
                    h.this.Q(true);
                } else {
                    if (action == null || h.this.f17277f == null || !h.this.f17284m.containsKey(action)) {
                        return;
                    }
                    h.this.f17277f.c(u1Var, action, intent);
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.media3.ui.h$h, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface InterfaceC0130h {
        void a(int i10, Notification notification, boolean z10);

        void b(int i10, boolean z10);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class i implements u1.g {
        public i() {
        }

        @Override // u4.u1.g
        public /* synthetic */ void C(k1 k1Var) {
            v1.o(this, k1Var);
        }

        @Override // u4.u1.g
        public /* synthetic */ void J(s1 s1Var) {
            v1.q(this, s1Var);
        }

        @Override // u4.u1.g
        public /* synthetic */ void K(long j10) {
            v1.l(this, j10);
        }

        @Override // u4.u1.g
        public void M(u1 u1Var, u1.f fVar) {
            if (fVar.c(4, 5, 7, 0, 12, 11, 8, 9, 14)) {
                h.this.r();
            }
        }

        @Override // u4.u1.g
        public /* synthetic */ void P(i1 i1Var) {
            v1.n(this, i1Var);
        }

        @Override // u4.u1.g
        public /* synthetic */ void Q(u4.i iVar) {
            v1.a(this, iVar);
        }

        @Override // u4.u1.g
        public /* synthetic */ void b0(u1.c cVar) {
            v1.c(this, cVar);
        }

        @Override // u4.u1.g
        public /* synthetic */ void c(int i10) {
            v1.b(this, i10);
        }

        @Override // u4.u1.g
        public /* synthetic */ void d0(d5 d5Var) {
            v1.H(this, d5Var);
        }

        @Override // u4.u1.g
        public /* synthetic */ void g0(r1 r1Var) {
            v1.u(this, r1Var);
        }

        @Override // u4.u1.g
        public /* synthetic */ void j0(c1 c1Var, int i10) {
            v1.m(this, c1Var, i10);
        }

        @Override // u4.u1.g
        public /* synthetic */ void n(int i10, boolean z10) {
            v1.g(this, i10, z10);
        }

        @Override // u4.u1.g
        public /* synthetic */ void o0(g0 g0Var) {
            v1.f(this, g0Var);
        }

        @Override // u4.u1.g
        public /* synthetic */ void onCues(List list) {
            v1.d(this, list);
        }

        @Override // u4.u1.g
        public /* synthetic */ void onIsLoadingChanged(boolean z10) {
            v1.i(this, z10);
        }

        @Override // u4.u1.g
        public /* synthetic */ void onIsPlayingChanged(boolean z10) {
            v1.j(this, z10);
        }

        @Override // u4.u1.g
        public /* synthetic */ void onLoadingChanged(boolean z10) {
            v1.k(this, z10);
        }

        @Override // u4.u1.g
        public /* synthetic */ void onPlayWhenReadyChanged(boolean z10, int i10) {
            v1.p(this, z10, i10);
        }

        @Override // u4.u1.g
        public /* synthetic */ void onPlaybackStateChanged(int i10) {
            v1.r(this, i10);
        }

        @Override // u4.u1.g
        public /* synthetic */ void onPlaybackSuppressionReasonChanged(int i10) {
            v1.s(this, i10);
        }

        @Override // u4.u1.g
        public /* synthetic */ void onPlayerError(r1 r1Var) {
            v1.t(this, r1Var);
        }

        @Override // u4.u1.g
        public /* synthetic */ void onPlayerStateChanged(boolean z10, int i10) {
            v1.v(this, z10, i10);
        }

        @Override // u4.u1.g
        public /* synthetic */ void onPositionDiscontinuity(int i10) {
            v1.x(this, i10);
        }

        @Override // u4.u1.g
        public /* synthetic */ void onRenderedFirstFrame() {
            v1.z(this);
        }

        @Override // u4.u1.g
        public /* synthetic */ void onRepeatModeChanged(int i10) {
            v1.A(this, i10);
        }

        @Override // u4.u1.g
        public /* synthetic */ void onShuffleModeEnabledChanged(boolean z10) {
            v1.D(this, z10);
        }

        @Override // u4.u1.g
        public /* synthetic */ void onSkipSilenceEnabledChanged(boolean z10) {
            v1.E(this, z10);
        }

        @Override // u4.u1.g
        public /* synthetic */ void onSurfaceSizeChanged(int i10, int i11) {
            v1.F(this, i10, i11);
        }

        @Override // u4.u1.g
        public /* synthetic */ void onTimelineChanged(y4 y4Var, int i10) {
            v1.G(this, y4Var, i10);
        }

        @Override // u4.u1.g
        public /* synthetic */ void onTracksChanged(h5 h5Var) {
            v1.I(this, h5Var);
        }

        @Override // u4.u1.g
        public /* synthetic */ void onVideoSizeChanged(o5 o5Var) {
            v1.J(this, o5Var);
        }

        @Override // u4.u1.g
        public /* synthetic */ void onVolumeChanged(float f10) {
            v1.K(this, f10);
        }

        @Override // u4.u1.g
        public /* synthetic */ void t(long j10) {
            v1.C(this, j10);
        }

        @Override // u4.u1.g
        public /* synthetic */ void u0(i1 i1Var) {
            v1.w(this, i1Var);
        }

        @Override // u4.u1.g
        public /* synthetic */ void v(w4.e eVar) {
            v1.e(this, eVar);
        }

        @Override // u4.u1.g
        public /* synthetic */ void z(long j10) {
            v1.B(this, j10);
        }

        @Override // u4.u1.g
        public /* synthetic */ void onPositionDiscontinuity(u1.k kVar, u1.k kVar2, int i10) {
            v1.y(this, kVar, kVar2, i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface j {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface k {
    }

    public h(Context context, String str, int i10, e eVar, @Nullable InterfaceC0130h interfaceC0130h, @Nullable d dVar, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, @Nullable String str2) {
        Context applicationContext = context.getApplicationContext();
        this.f17272a = applicationContext;
        this.f17273b = str;
        this.f17274c = i10;
        this.f17275d = eVar;
        this.f17276e = interfaceC0130h;
        this.f17277f = dVar;
        this.K = i11;
        this.O = str2;
        int i19 = f17271a0;
        f17271a0 = i19 + 1;
        this.f17286o = i19;
        this.f17278g = b2.I(Looper.getMainLooper(), new Handler.Callback() { // from class: p7.d0
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f120438b.p(message);
            }
        });
        this.f17279h = l0.q(applicationContext);
        this.f17281j = new i();
        this.f17282k = new g();
        this.f17280i = new IntentFilter();
        this.f17293v = true;
        this.f17294w = true;
        this.D = true;
        this.E = true;
        this.f17297z = true;
        this.A = true;
        this.H = true;
        this.N = true;
        this.J = 0;
        this.I = 0;
        this.M = -1;
        this.G = 1;
        this.L = 1;
        Map<String, NotificationCompat.b> mapL = l(applicationContext, i19, i12, i13, i14, i15, i16, i17, i18);
        this.f17283l = mapL;
        Iterator<String> it = mapL.keySet().iterator();
        while (it.hasNext()) {
            this.f17280i.addAction(it.next());
        }
        Map<String, NotificationCompat.b> mapA = dVar != null ? dVar.a(applicationContext, this.f17286o) : Collections.EMPTY_MAP;
        this.f17284m = mapA;
        Iterator<String> it2 = mapA.keySet().iterator();
        while (it2.hasNext()) {
            this.f17280i.addAction(it2.next());
        }
        this.f17285n = j(X, applicationContext, this.f17286o);
        this.f17280i.addAction(X);
    }

    public static PendingIntent j(String str, Context context, int i10) {
        Intent intent = new Intent(str).setPackage(context.getPackageName());
        intent.putExtra("INSTANCE_ID", i10);
        return PendingIntent.getBroadcast(context, i10, intent, 201326592);
    }

    public static Map<String, NotificationCompat.b> l(Context context, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        HashMap map = new HashMap();
        map.put(P, new NotificationCompat.b(i11, context.getString(androidx.media3.ui.i.k.f17508l), j(P, context, i10)));
        map.put(Q, new NotificationCompat.b(i12, context.getString(androidx.media3.ui.i.k.f17507k), j(Q, context, i10)));
        map.put(V, new NotificationCompat.b(i13, context.getString(androidx.media3.ui.i.k.f17520x), j(V, context, i10)));
        map.put(U, new NotificationCompat.b(i14, context.getString(androidx.media3.ui.i.k.f17514r), j(U, context, i10)));
        map.put(T, new NotificationCompat.b(i15, context.getString(androidx.media3.ui.i.k.f17500d), j(T, context, i10)));
        map.put(R, new NotificationCompat.b(i16, context.getString(androidx.media3.ui.i.k.f17510n), j(R, context, i10)));
        map.put(S, new NotificationCompat.b(i17, context.getString(androidx.media3.ui.i.k.f17504h), j(S, context, i10)));
        return map;
    }

    public static void x(NotificationCompat.n nVar, @Nullable Bitmap bitmap) {
        nVar.b0(bitmap);
    }

    public final void A(int i10) {
        if (this.M == i10) {
            return;
        }
        if (i10 != -2 && i10 != -1 && i10 != 0 && i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException();
        }
        this.M = i10;
        q();
    }

    public void B(boolean z10) {
        if (this.E != z10) {
            this.E = z10;
            q();
        }
    }

    public final void C(@u int i10) {
        if (this.K != i10) {
            this.K = i10;
            q();
        }
    }

    public final void D(boolean z10) {
        if (this.N != z10) {
            this.N = z10;
            q();
        }
    }

    public final void E(boolean z10) {
        if (this.A != z10) {
            this.A = z10;
            q();
        }
    }

    public final void F(boolean z10) {
        if (this.C != z10) {
            this.C = z10;
            if (z10) {
                this.f17296y = false;
            }
            q();
        }
    }

    public final void G(boolean z10) {
        if (this.f17294w != z10) {
            this.f17294w = z10;
            q();
        }
    }

    public final void H(boolean z10) {
        if (this.f17296y != z10) {
            this.f17296y = z10;
            if (z10) {
                this.C = false;
            }
            q();
        }
    }

    public final void I(boolean z10) {
        if (this.D != z10) {
            this.D = z10;
            q();
        }
    }

    public final void J(boolean z10) {
        if (this.f17293v != z10) {
            this.f17293v = z10;
            q();
        }
    }

    public final void K(boolean z10) {
        if (this.f17295x != z10) {
            this.f17295x = z10;
            if (z10) {
                this.B = false;
            }
            q();
        }
    }

    public final void L(boolean z10) {
        if (this.f17297z != z10) {
            this.f17297z = z10;
            q();
        }
    }

    public final void M(boolean z10) {
        if (this.B != z10) {
            this.B = z10;
            if (z10) {
                this.f17295x = false;
            }
            q();
        }
    }

    public final void N(boolean z10) {
        if (this.F == z10) {
            return;
        }
        this.F = z10;
        q();
    }

    public final void O(int i10) {
        if (this.L == i10) {
            return;
        }
        if (i10 != -1 && i10 != 0 && i10 != 1) {
            throw new IllegalStateException();
        }
        this.L = i10;
        q();
    }

    @SuppressLint({"MissingPermission"})
    public final void P(u1 u1Var, @Nullable Bitmap bitmap) {
        boolean zO = o(u1Var);
        NotificationCompat.n nVarK = k(u1Var, this.f17287p, zO, bitmap);
        this.f17287p = nVarK;
        if (nVarK == null) {
            Q(false);
            return;
        }
        Notification notificationH = nVarK.h();
        this.f17279h.F(this.f17274c, notificationH);
        if (!this.f17290s) {
            b2.g2(this.f17272a, this.f17282k, this.f17280i);
        }
        InterfaceC0130h interfaceC0130h = this.f17276e;
        if (interfaceC0130h != null) {
            interfaceC0130h.a(this.f17274c, notificationH, zO || !this.f17290s);
        }
        this.f17290s = true;
    }

    public final void Q(boolean z10) {
        if (this.f17290s) {
            this.f17290s = false;
            this.f17278g.removeMessages(1);
            this.f17279h.c(this.f17274c);
            this.f17272a.unregisterReceiver(this.f17282k);
            InterfaceC0130h interfaceC0130h = this.f17276e;
            if (interfaceC0130h != null) {
                interfaceC0130h.b(this.f17274c, z10);
            }
        }
    }

    @Nullable
    public NotificationCompat.n k(u1 u1Var, @Nullable NotificationCompat.n nVar, boolean z10, @Nullable Bitmap bitmap) {
        if (u1Var.getPlaybackState() == 1 && u1Var.o0(17) && u1Var.getCurrentTimeline().z()) {
            this.f17288q = null;
            return null;
        }
        List<String> listN = n(u1Var);
        ArrayList arrayList = new ArrayList(listN.size());
        for (int i10 = 0; i10 < listN.size(); i10++) {
            String str = listN.get(i10);
            NotificationCompat.b bVar = this.f17283l.containsKey(str) ? this.f17283l.get(str) : this.f17284m.get(str);
            if (bVar != null) {
                arrayList.add(bVar);
            }
        }
        if (nVar == null || !arrayList.equals(this.f17288q)) {
            nVar = new NotificationCompat.n(this.f17272a, this.f17273b);
            this.f17288q = arrayList;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                nVar.b((NotificationCompat.b) arrayList.get(i11));
            }
        }
        nVar.z0(new f(this.f17292u, m(listN, u1Var)));
        nVar.T(this.f17285n);
        nVar.D(this.G).i0(z10).I(this.J).J(this.H).t0(this.K).G0(this.L).k0(this.M).S(this.I);
        if (this.N && u1Var.o0(16) && u1Var.isPlaying() && !u1Var.isPlayingAd() && !u1Var.L0() && u1Var.getPlaybackParameters().f138950a == 1.0f) {
            nVar.H0(System.currentTimeMillis() - u1Var.getContentPosition()).r0(true).E0(true);
        } else {
            nVar.r0(false).E0(false);
        }
        nVar.O(this.f17275d.c(u1Var));
        nVar.N(this.f17275d.e(u1Var));
        nVar.A0(this.f17275d.b(u1Var));
        if (bitmap == null) {
            e eVar = this.f17275d;
            int i12 = this.f17291t + 1;
            this.f17291t = i12;
            bitmap = eVar.a(u1Var, new b(i12));
        }
        x(nVar, bitmap);
        nVar.M(this.f17275d.d(u1Var));
        String str2 = this.O;
        if (str2 != null) {
            nVar.Y(str2);
        }
        nVar.j0(true);
        return nVar;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005f  */
    public int[] m(List<String> list, u1 u1Var) {
        int iIndexOf;
        int iIndexOf2;
        int i10;
        int iIndexOf3 = list.indexOf(Q);
        int iIndexOf4 = list.indexOf(P);
        if (this.f17295x) {
            iIndexOf = list.indexOf(R);
        } else {
            iIndexOf = this.B ? list.indexOf(U) : -1;
        }
        if (this.f17296y) {
            iIndexOf2 = list.indexOf(S);
        } else {
            iIndexOf2 = this.C ? list.indexOf(T) : -1;
        }
        int[] iArr = new int[3];
        int i11 = 0;
        if (iIndexOf != -1) {
            iArr[0] = iIndexOf;
            i11 = 1;
        }
        boolean zW2 = b2.w2(u1Var, this.E);
        if (iIndexOf3 == -1 || zW2) {
            if (iIndexOf4 != -1 && zW2) {
                i10 = i11 + 1;
                iArr[i11] = iIndexOf4;
            }
            if (iIndexOf2 != -1) {
                iArr[i11] = iIndexOf2;
                i11++;
            }
            return Arrays.copyOf(iArr, i11);
        }
        i10 = i11 + 1;
        iArr[i11] = iIndexOf3;
        i11 = i10;
        if (iIndexOf2 != -1) {
            iArr[i11] = iIndexOf2;
            i11++;
        }
        return Arrays.copyOf(iArr, i11);
    }

    public List<String> n(u1 u1Var) {
        boolean zO0 = u1Var.o0(7);
        boolean zO1 = u1Var.o0(11);
        boolean zO2 = u1Var.o0(12);
        boolean zO3 = u1Var.o0(9);
        ArrayList arrayList = new ArrayList();
        if (this.f17293v && zO0) {
            arrayList.add(R);
        }
        if (this.f17297z && zO1) {
            arrayList.add(U);
        }
        if (this.D) {
            if (b2.w2(u1Var, this.E)) {
                arrayList.add(P);
            } else {
                arrayList.add(Q);
            }
        }
        if (this.A && zO2) {
            arrayList.add(T);
        }
        if (this.f17294w && zO3) {
            arrayList.add(S);
        }
        d dVar = this.f17277f;
        if (dVar != null) {
            arrayList.addAll(dVar.b(u1Var));
        }
        if (this.F) {
            arrayList.add(V);
        }
        return arrayList;
    }

    public boolean o(u1 u1Var) {
        int playbackState = u1Var.getPlaybackState();
        return (playbackState == 2 || playbackState == 3) && u1Var.getPlayWhenReady();
    }

    public final boolean p(Message message) {
        int i10 = message.what;
        if (i10 == 1) {
            u1 u1Var = this.f17289r;
            if (u1Var != null) {
                P(u1Var, null);
            }
        } else {
            if (i10 != 2) {
                return false;
            }
            u1 u1Var2 = this.f17289r;
            if (u1Var2 != null && this.f17290s && this.f17291t == message.arg1) {
                P(u1Var2, (Bitmap) message.obj);
            }
        }
        return true;
    }

    public final void q() {
        if (this.f17290s) {
            r();
        }
    }

    public final void r() {
        if (this.f17278g.hasMessages(1)) {
            return;
        }
        this.f17278g.sendEmptyMessage(1);
    }

    public final void s(Bitmap bitmap, int i10) {
        this.f17278g.obtainMessage(2, i10, -1, bitmap).sendToTarget();
    }

    public final void t(int i10) {
        if (this.G == i10) {
            return;
        }
        if (i10 != 0 && i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException();
        }
        this.G = i10;
        q();
    }

    public final void u(int i10) {
        if (this.J != i10) {
            this.J = i10;
            q();
        }
    }

    public final void v(boolean z10) {
        if (this.H != z10) {
            this.H = z10;
            q();
        }
    }

    public final void w(int i10) {
        if (this.I != i10) {
            this.I = i10;
            q();
        }
    }

    public final void y(MediaSession.Token token) {
        if (Objects.equals(this.f17292u, token)) {
            return;
        }
        this.f17292u = token;
        q();
    }

    public final void z(@Nullable u1 u1Var) {
        boolean z10 = true;
        zi.l0.g0(Looper.myLooper() == Looper.getMainLooper());
        if (u1Var != null && u1Var.M0() != Looper.getMainLooper()) {
            z10 = false;
        }
        zi.l0.d(z10);
        u1 u1Var2 = this.f17289r;
        if (u1Var2 == u1Var) {
            return;
        }
        if (u1Var2 != null) {
            u1Var2.Z0(this.f17281j);
            if (u1Var == null) {
                Q(false);
            }
        }
        this.f17289r = u1Var;
        if (u1Var != null) {
            u1Var.a1(this.f17281j);
            r();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f17300a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f17301b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f17302c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public InterfaceC0130h f17303d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public d f17304e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public e f17305f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f17306g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f17307h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f17308i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f17309j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f17310k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f17311l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f17312m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f17313n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f17314o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f17315p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f17316q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        @Nullable
        public String f17317r;

        @Deprecated
        public c(Context context, int i10, String str, e eVar) {
            this(context, i10, str);
            this.f17305f = eVar;
        }

        public h a() {
            int i10 = this.f17306g;
            if (i10 != 0) {
                s0.a(this.f17300a, this.f17302c, i10, this.f17307h, this.f17308i);
            }
            return new h(this.f17300a, this.f17302c, this.f17301b, this.f17305f, this.f17303d, this.f17304e, this.f17309j, this.f17311l, this.f17312m, this.f17313n, this.f17310k, this.f17314o, this.f17315p, this.f17316q, this.f17317r);
        }

        public c b(int i10) {
            this.f17307h = i10;
            return this;
        }

        public c c(int i10) {
            this.f17308i = i10;
            return this;
        }

        public c d(int i10) {
            this.f17306g = i10;
            return this;
        }

        public c e(d dVar) {
            this.f17304e = dVar;
            return this;
        }

        public c f(int i10) {
            this.f17314o = i10;
            return this;
        }

        public c g(String str) {
            this.f17317r = str;
            return this;
        }

        public c h(e eVar) {
            this.f17305f = eVar;
            return this;
        }

        public c i(int i10) {
            this.f17316q = i10;
            return this;
        }

        public c j(InterfaceC0130h interfaceC0130h) {
            this.f17303d = interfaceC0130h;
            return this;
        }

        public c k(int i10) {
            this.f17312m = i10;
            return this;
        }

        public c l(int i10) {
            this.f17311l = i10;
            return this;
        }

        public c m(int i10) {
            this.f17315p = i10;
            return this;
        }

        public c n(int i10) {
            this.f17310k = i10;
            return this;
        }

        public c o(int i10) {
            this.f17309j = i10;
            return this;
        }

        public c p(int i10) {
            this.f17313n = i10;
            return this;
        }

        public c(Context context, @e0(from = 1) int i10, String str) {
            zi.l0.d(i10 > 0);
            this.f17300a = context;
            this.f17301b = i10;
            this.f17302c = str;
            this.f17308i = 2;
            this.f17305f = new androidx.media3.ui.b(null);
            this.f17309j = androidx.media3.ui.i.e.f17393c0;
            this.f17311l = androidx.media3.ui.i.e.Z;
            this.f17312m = androidx.media3.ui.i.e.Y;
            this.f17313n = androidx.media3.ui.i.e.f17395d0;
            this.f17310k = androidx.media3.ui.i.e.f17391b0;
            this.f17314o = androidx.media3.ui.i.e.W;
            this.f17315p = androidx.media3.ui.i.e.f17389a0;
            this.f17316q = androidx.media3.ui.i.e.X;
        }
    }
}
