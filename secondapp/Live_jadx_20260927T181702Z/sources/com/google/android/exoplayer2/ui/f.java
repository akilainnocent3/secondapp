package com.google.android.exoplayer2.ui;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.google.android.exoplayer2.metadata.Metadata;
import d1.l0;
import eh.o1;
import eh.q0;
import fh.b0;
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
import k.e0;
import k.u;
import re.d8;
import re.h3;
import re.h4;
import re.k4;
import re.l4;
import re.n4;
import re.q;
import re.x2;
import re.y7;
import yg.c0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class f {
    public static final String O = "com.google.android.exoplayer.play";
    public static final String P = "com.google.android.exoplayer.pause";
    public static final String Q = "com.google.android.exoplayer.prev";
    public static final String R = "com.google.android.exoplayer.next";
    public static final String S = "com.google.android.exoplayer.ffwd";
    public static final String T = "com.google.android.exoplayer.rewind";
    public static final String U = "com.google.android.exoplayer.stop";
    public static final String V = "INSTANCE_ID";
    public static final String W = "com.google.android.exoplayer.dismiss";
    public static final int X = 0;
    public static final int Y = 1;
    public static int Z;
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public int F;
    public boolean G;
    public int H;
    public int I;

    @u
    public int J;
    public int K;
    public int L;
    public boolean M;

    @Nullable
    public String N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f49308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f49309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f49310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f49311d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final g f49312e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final d f49313f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Handler f49314g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l0 f49315h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final IntentFilter f49316i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l4.g f49317j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0456f f49318k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Map<String, NotificationCompat.b> f49319l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Map<String, NotificationCompat.b> f49320m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final PendingIntent f49321n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f49322o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public NotificationCompat.n f49323p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public List<NotificationCompat.b> f49324q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public l4 f49325r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f49326s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f49327t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public MediaSessionCompat.Token f49328u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f49329v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f49330w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f49331x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f49332y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f49333z;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f49334a;

        public void a(Bitmap bitmap) {
            if (bitmap != null) {
                f.this.s(bitmap, this.f49334a);
            }
        }

        public b(int i10) {
            this.f49334a = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface d {
        Map<String, NotificationCompat.b> a(Context context, int i10);

        void b(l4 l4Var, String str, Intent intent);

        List<String> c(l4 l4Var);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface e {
        @Nullable
        CharSequence a(l4 l4Var);

        @Nullable
        PendingIntent b(l4 l4Var);

        CharSequence c(l4 l4Var);

        @Nullable
        CharSequence d(l4 l4Var);

        @Nullable
        Bitmap e(l4 l4Var, b bVar);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.f$f, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class C0456f extends BroadcastReceiver {
        public C0456f() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            l4 l4Var = f.this.f49325r;
            if (l4Var != null && f.this.f49326s && intent.getIntExtra("INSTANCE_ID", f.this.f49322o) == f.this.f49322o) {
                String action = intent.getAction();
                if (f.O.equals(action)) {
                    o1.J0(l4Var);
                    return;
                }
                if (f.P.equals(action)) {
                    o1.I0(l4Var);
                    return;
                }
                if (f.Q.equals(action)) {
                    if (l4Var.o0(7)) {
                        l4Var.P();
                        return;
                    }
                    return;
                }
                if (f.T.equals(action)) {
                    if (l4Var.o0(11)) {
                        l4Var.e0();
                        return;
                    }
                    return;
                }
                if (f.S.equals(action)) {
                    if (l4Var.o0(12)) {
                        l4Var.I();
                        return;
                    }
                    return;
                }
                if (f.R.equals(action)) {
                    if (l4Var.o0(9)) {
                        l4Var.W();
                        return;
                    }
                    return;
                }
                if (f.U.equals(action)) {
                    if (l4Var.o0(3)) {
                        l4Var.stop();
                    }
                    if (l4Var.o0(20)) {
                        l4Var.clearMediaItems();
                        return;
                    }
                    return;
                }
                if (f.W.equals(action)) {
                    f.this.P(true);
                } else {
                    if (action == null || f.this.f49313f == null || !f.this.f49320m.containsKey(action)) {
                        return;
                    }
                    f.this.f49313f.b(l4Var, action, intent);
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface g {
        void a(int i10, Notification notification, boolean z10);

        void b(int i10, boolean z10);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class h implements l4.g {
        public h() {
        }

        @Override // re.l4.g
        public /* synthetic */ void E(og.f fVar) {
            n4.e(this, fVar);
        }

        @Override // re.l4.g
        public /* synthetic */ void K(long j10) {
            n4.l(this, j10);
        }

        @Override // re.l4.g
        public /* synthetic */ void R(x2 x2Var, int i10) {
            n4.m(this, x2Var, i10);
        }

        @Override // re.l4.g
        public /* synthetic */ void T(te.e eVar) {
            n4.a(this, eVar);
        }

        @Override // re.l4.g
        public /* synthetic */ void V(c0 c0Var) {
            n4.H(this, c0Var);
        }

        @Override // re.l4.g
        public void Y(l4 l4Var, l4.f fVar) {
            if (fVar.b(4, 5, 7, 0, 12, 11, 8, 9, 14)) {
                f.this.r();
            }
        }

        @Override // re.l4.g
        public /* synthetic */ void c(int i10) {
            n4.b(this, i10);
        }

        @Override // re.l4.g
        public /* synthetic */ void c0(h3 h3Var) {
            n4.n(this, h3Var);
        }

        @Override // re.l4.g
        public /* synthetic */ void f0(q qVar) {
            n4.f(this, qVar);
        }

        @Override // re.l4.g
        public /* synthetic */ void i0(h4 h4Var) {
            n4.u(this, h4Var);
        }

        @Override // re.l4.g
        public /* synthetic */ void k0(l4.c cVar) {
            n4.c(this, cVar);
        }

        @Override // re.l4.g
        public /* synthetic */ void m0(h3 h3Var) {
            n4.w(this, h3Var);
        }

        @Override // re.l4.g
        public /* synthetic */ void n(int i10, boolean z10) {
            n4.g(this, i10, z10);
        }

        @Override // re.l4.g
        public /* synthetic */ void onCues(List list) {
            n4.d(this, list);
        }

        @Override // re.l4.g
        public /* synthetic */ void onIsLoadingChanged(boolean z10) {
            n4.i(this, z10);
        }

        @Override // re.l4.g
        public /* synthetic */ void onIsPlayingChanged(boolean z10) {
            n4.j(this, z10);
        }

        @Override // re.l4.g
        public /* synthetic */ void onLoadingChanged(boolean z10) {
            n4.k(this, z10);
        }

        @Override // re.l4.g
        public /* synthetic */ void onPlayWhenReadyChanged(boolean z10, int i10) {
            n4.p(this, z10, i10);
        }

        @Override // re.l4.g
        public /* synthetic */ void onPlaybackStateChanged(int i10) {
            n4.r(this, i10);
        }

        @Override // re.l4.g
        public /* synthetic */ void onPlaybackSuppressionReasonChanged(int i10) {
            n4.s(this, i10);
        }

        @Override // re.l4.g
        public /* synthetic */ void onPlayerError(h4 h4Var) {
            n4.t(this, h4Var);
        }

        @Override // re.l4.g
        public /* synthetic */ void onPlayerStateChanged(boolean z10, int i10) {
            n4.v(this, z10, i10);
        }

        @Override // re.l4.g
        public /* synthetic */ void onPositionDiscontinuity(int i10) {
            n4.x(this, i10);
        }

        @Override // re.l4.g
        public /* synthetic */ void onRenderedFirstFrame() {
            n4.z(this);
        }

        @Override // re.l4.g
        public /* synthetic */ void onRepeatModeChanged(int i10) {
            n4.A(this, i10);
        }

        @Override // re.l4.g
        public /* synthetic */ void onShuffleModeEnabledChanged(boolean z10) {
            n4.D(this, z10);
        }

        @Override // re.l4.g
        public /* synthetic */ void onSkipSilenceEnabledChanged(boolean z10) {
            n4.E(this, z10);
        }

        @Override // re.l4.g
        public /* synthetic */ void onSurfaceSizeChanged(int i10, int i11) {
            n4.F(this, i10, i11);
        }

        @Override // re.l4.g
        public /* synthetic */ void onTimelineChanged(y7 y7Var, int i10) {
            n4.G(this, y7Var, i10);
        }

        @Override // re.l4.g
        public /* synthetic */ void onVolumeChanged(float f10) {
            n4.K(this, f10);
        }

        @Override // re.l4.g
        public /* synthetic */ void q(k4 k4Var) {
            n4.q(this, k4Var);
        }

        @Override // re.l4.g
        public /* synthetic */ void q0(d8 d8Var) {
            n4.I(this, d8Var);
        }

        @Override // re.l4.g
        public /* synthetic */ void r(b0 b0Var) {
            n4.J(this, b0Var);
        }

        @Override // re.l4.g
        public /* synthetic */ void t(long j10) {
            n4.C(this, j10);
        }

        @Override // re.l4.g
        public /* synthetic */ void y(Metadata metadata) {
            n4.o(this, metadata);
        }

        @Override // re.l4.g
        public /* synthetic */ void z(long j10) {
            n4.B(this, j10);
        }

        @Override // re.l4.g
        public /* synthetic */ void onPositionDiscontinuity(l4.k kVar, l4.k kVar2, int i10) {
            n4.y(this, kVar, kVar2, i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface i {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface j {
    }

    public f(Context context, String str, int i10, e eVar, @Nullable g gVar, @Nullable d dVar, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, @Nullable String str2) {
        Context applicationContext = context.getApplicationContext();
        this.f49308a = applicationContext;
        this.f49309b = str;
        this.f49310c = i10;
        this.f49311d = eVar;
        this.f49312e = gVar;
        this.f49313f = dVar;
        this.J = i11;
        this.N = str2;
        int i19 = Z;
        Z = i19 + 1;
        this.f49322o = i19;
        this.f49314g = o1.B(Looper.getMainLooper(), new Handler.Callback() { // from class: zg.m
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f161561b.p(message);
            }
        });
        this.f49315h = l0.q(applicationContext);
        this.f49317j = new h();
        this.f49318k = new C0456f();
        this.f49316i = new IntentFilter();
        this.f49329v = true;
        this.f49330w = true;
        this.D = true;
        this.f49333z = true;
        this.A = true;
        this.G = true;
        this.M = true;
        this.I = 0;
        this.H = 0;
        this.L = -1;
        this.F = 1;
        this.K = 1;
        Map<String, NotificationCompat.b> mapL = l(applicationContext, i19, i12, i13, i14, i15, i16, i17, i18);
        this.f49319l = mapL;
        Iterator<String> it = mapL.keySet().iterator();
        while (it.hasNext()) {
            this.f49316i.addAction(it.next());
        }
        Map<String, NotificationCompat.b> mapA = dVar != null ? dVar.a(applicationContext, this.f49322o) : Collections.EMPTY_MAP;
        this.f49320m = mapA;
        Iterator<String> it2 = mapA.keySet().iterator();
        while (it2.hasNext()) {
            this.f49316i.addAction(it2.next());
        }
        this.f49321n = j(W, applicationContext, this.f49322o);
        this.f49316i.addAction(W);
    }

    public static PendingIntent j(String str, Context context, int i10) {
        Intent intent = new Intent(str).setPackage(context.getPackageName());
        intent.putExtra("INSTANCE_ID", i10);
        return PendingIntent.getBroadcast(context, i10, intent, o1.f81142a >= 23 ? 201326592 : 134217728);
    }

    public static Map<String, NotificationCompat.b> l(Context context, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        HashMap map = new HashMap();
        map.put(O, new NotificationCompat.b(i11, context.getString(com.google.android.exoplayer2.ui.h.k.f49654l), j(O, context, i10)));
        map.put(P, new NotificationCompat.b(i12, context.getString(com.google.android.exoplayer2.ui.h.k.f49653k), j(P, context, i10)));
        map.put(U, new NotificationCompat.b(i13, context.getString(com.google.android.exoplayer2.ui.h.k.f49666x), j(U, context, i10)));
        map.put(T, new NotificationCompat.b(i14, context.getString(com.google.android.exoplayer2.ui.h.k.f49660r), j(T, context, i10)));
        map.put(S, new NotificationCompat.b(i15, context.getString(com.google.android.exoplayer2.ui.h.k.f49646d), j(S, context, i10)));
        map.put(Q, new NotificationCompat.b(i16, context.getString(com.google.android.exoplayer2.ui.h.k.f49656n), j(Q, context, i10)));
        map.put(R, new NotificationCompat.b(i17, context.getString(com.google.android.exoplayer2.ui.h.k.f49650h), j(R, context, i10)));
        return map;
    }

    public static void x(NotificationCompat.n nVar, @Nullable Bitmap bitmap) {
        nVar.b0(bitmap);
    }

    public final void A(int i10) {
        if (this.L == i10) {
            return;
        }
        if (i10 != -2 && i10 != -1 && i10 != 0 && i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException();
        }
        this.L = i10;
        q();
    }

    public final void B(@u int i10) {
        if (this.J != i10) {
            this.J = i10;
            q();
        }
    }

    public final void C(boolean z10) {
        if (this.M != z10) {
            this.M = z10;
            q();
        }
    }

    public final void D(boolean z10) {
        if (this.A != z10) {
            this.A = z10;
            q();
        }
    }

    public final void E(boolean z10) {
        if (this.C != z10) {
            this.C = z10;
            if (z10) {
                this.f49332y = false;
            }
            q();
        }
    }

    public final void F(boolean z10) {
        if (this.f49330w != z10) {
            this.f49330w = z10;
            q();
        }
    }

    public final void G(boolean z10) {
        if (this.f49332y != z10) {
            this.f49332y = z10;
            if (z10) {
                this.C = false;
            }
            q();
        }
    }

    public final void H(boolean z10) {
        if (this.D != z10) {
            this.D = z10;
            q();
        }
    }

    public final void I(boolean z10) {
        if (this.f49329v != z10) {
            this.f49329v = z10;
            q();
        }
    }

    public final void J(boolean z10) {
        if (this.f49331x != z10) {
            this.f49331x = z10;
            if (z10) {
                this.B = false;
            }
            q();
        }
    }

    public final void K(boolean z10) {
        if (this.f49333z != z10) {
            this.f49333z = z10;
            q();
        }
    }

    public final void L(boolean z10) {
        if (this.B != z10) {
            this.B = z10;
            if (z10) {
                this.f49331x = false;
            }
            q();
        }
    }

    public final void M(boolean z10) {
        if (this.E == z10) {
            return;
        }
        this.E = z10;
        q();
    }

    public final void N(int i10) {
        if (this.K == i10) {
            return;
        }
        if (i10 != -1 && i10 != 0 && i10 != 1) {
            throw new IllegalStateException();
        }
        this.K = i10;
        q();
    }

    public final void O(l4 l4Var, @Nullable Bitmap bitmap) {
        boolean zO = o(l4Var);
        NotificationCompat.n nVarK = k(l4Var, this.f49323p, zO, bitmap);
        this.f49323p = nVarK;
        if (nVarK == null) {
            P(false);
            return;
        }
        Notification notificationH = nVarK.h();
        this.f49315h.F(this.f49310c, notificationH);
        if (!this.f49326s) {
            o1.y1(this.f49308a, this.f49318k, this.f49316i);
        }
        g gVar = this.f49312e;
        if (gVar != null) {
            gVar.a(this.f49310c, notificationH, zO || !this.f49326s);
        }
        this.f49326s = true;
    }

    public final void P(boolean z10) {
        if (this.f49326s) {
            this.f49326s = false;
            this.f49314g.removeMessages(0);
            this.f49315h.c(this.f49310c);
            this.f49308a.unregisterReceiver(this.f49318k);
            g gVar = this.f49312e;
            if (gVar != null) {
                gVar.b(this.f49310c, z10);
            }
        }
    }

    @Nullable
    public NotificationCompat.n k(l4 l4Var, @Nullable NotificationCompat.n nVar, boolean z10, @Nullable Bitmap bitmap) {
        if (l4Var.getPlaybackState() == 1 && l4Var.o0(17) && l4Var.getCurrentTimeline().w()) {
            this.f49324q = null;
            return null;
        }
        List<String> listN = n(l4Var);
        ArrayList arrayList = new ArrayList(listN.size());
        for (int i10 = 0; i10 < listN.size(); i10++) {
            String str = listN.get(i10);
            NotificationCompat.b bVar = this.f49319l.containsKey(str) ? this.f49319l.get(str) : this.f49320m.get(str);
            if (bVar != null) {
                arrayList.add(bVar);
            }
        }
        if (nVar == null || !arrayList.equals(this.f49324q)) {
            nVar = new NotificationCompat.n(this.f49308a, this.f49309b);
            this.f49324q = arrayList;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                nVar.b((NotificationCompat.b) arrayList.get(i11));
            }
        }
        r4.a.f fVar = new r4.a.f();
        MediaSessionCompat.Token token = this.f49328u;
        if (token != null) {
            fVar.H(token);
        }
        fVar.J(m(listN, l4Var));
        fVar.K(!z10);
        fVar.G(this.f49321n);
        nVar.z0(fVar);
        nVar.T(this.f49321n);
        nVar.D(this.F).i0(z10).I(this.I).J(this.G).t0(this.J).G0(this.K).k0(this.L).S(this.H);
        if (o1.f81142a >= 21 && this.M && l4Var.o0(16) && l4Var.isPlaying() && !l4Var.isPlayingAd() && !l4Var.L0() && l4Var.getPlaybackParameters().f125923b == 1.0f) {
            nVar.H0(System.currentTimeMillis() - l4Var.getContentPosition()).r0(true).E0(true);
        } else {
            nVar.r0(false).E0(false);
        }
        nVar.O(this.f49311d.c(l4Var));
        nVar.N(this.f49311d.d(l4Var));
        nVar.A0(this.f49311d.a(l4Var));
        if (bitmap == null) {
            e eVar = this.f49311d;
            int i12 = this.f49327t + 1;
            this.f49327t = i12;
            bitmap = eVar.e(l4Var, new b(i12));
        }
        x(nVar, bitmap);
        nVar.M(this.f49311d.b(l4Var));
        String str2 = this.N;
        if (str2 != null) {
            nVar.Y(str2);
        }
        nVar.j0(true);
        return nVar;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005d  */
    public int[] m(List<String> list, l4 l4Var) {
        int iIndexOf;
        int iIndexOf2;
        int i10;
        int iIndexOf3 = list.indexOf(P);
        int iIndexOf4 = list.indexOf(O);
        if (this.f49331x) {
            iIndexOf = list.indexOf(Q);
        } else {
            iIndexOf = this.B ? list.indexOf(T) : -1;
        }
        if (this.f49332y) {
            iIndexOf2 = list.indexOf(R);
        } else {
            iIndexOf2 = this.C ? list.indexOf(S) : -1;
        }
        int[] iArr = new int[3];
        int i11 = 0;
        if (iIndexOf != -1) {
            iArr[0] = iIndexOf;
            i11 = 1;
        }
        boolean zG1 = o1.G1(l4Var);
        if (iIndexOf3 == -1 || zG1) {
            if (iIndexOf4 != -1 && zG1) {
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

    public List<String> n(l4 l4Var) {
        boolean zO0 = l4Var.o0(7);
        boolean zO1 = l4Var.o0(11);
        boolean zO2 = l4Var.o0(12);
        boolean zO3 = l4Var.o0(9);
        ArrayList arrayList = new ArrayList();
        if (this.f49329v && zO0) {
            arrayList.add(Q);
        }
        if (this.f49333z && zO1) {
            arrayList.add(T);
        }
        if (this.D) {
            if (o1.G1(l4Var)) {
                arrayList.add(O);
            } else {
                arrayList.add(P);
            }
        }
        if (this.A && zO2) {
            arrayList.add(S);
        }
        if (this.f49330w && zO3) {
            arrayList.add(R);
        }
        d dVar = this.f49313f;
        if (dVar != null) {
            arrayList.addAll(dVar.c(l4Var));
        }
        if (this.E) {
            arrayList.add(U);
        }
        return arrayList;
    }

    public boolean o(l4 l4Var) {
        int playbackState = l4Var.getPlaybackState();
        return (playbackState == 2 || playbackState == 3) && l4Var.getPlayWhenReady();
    }

    public final boolean p(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            l4 l4Var = this.f49325r;
            if (l4Var != null) {
                O(l4Var, null);
            }
        } else {
            if (i10 != 1) {
                return false;
            }
            l4 l4Var2 = this.f49325r;
            if (l4Var2 != null && this.f49326s && this.f49327t == message.arg1) {
                O(l4Var2, (Bitmap) message.obj);
            }
        }
        return true;
    }

    public final void q() {
        if (this.f49326s) {
            r();
        }
    }

    public final void r() {
        if (this.f49314g.hasMessages(0)) {
            return;
        }
        this.f49314g.sendEmptyMessage(0);
    }

    public final void s(Bitmap bitmap, int i10) {
        this.f49314g.obtainMessage(1, i10, -1, bitmap).sendToTarget();
    }

    public final void t(int i10) {
        if (this.F == i10) {
            return;
        }
        if (i10 != 0 && i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException();
        }
        this.F = i10;
        q();
    }

    public final void u(int i10) {
        if (this.I != i10) {
            this.I = i10;
            q();
        }
    }

    public final void v(boolean z10) {
        if (this.G != z10) {
            this.G = z10;
            q();
        }
    }

    public final void w(int i10) {
        if (this.H != i10) {
            this.H = i10;
            q();
        }
    }

    public final void y(MediaSessionCompat.Token token) {
        if (o1.g(this.f49328u, token)) {
            return;
        }
        this.f49328u = token;
        q();
    }

    public final void z(@Nullable l4 l4Var) {
        boolean z10 = true;
        eh.a.i(Looper.myLooper() == Looper.getMainLooper());
        if (l4Var != null && l4Var.M0() != Looper.getMainLooper()) {
            z10 = false;
        }
        eh.a.a(z10);
        l4 l4Var2 = this.f49325r;
        if (l4Var2 == l4Var) {
            return;
        }
        if (l4Var2 != null) {
            l4Var2.c1(this.f49317j);
            if (l4Var == null) {
                P(false);
            }
        }
        this.f49325r = l4Var;
        if (l4Var != null) {
            l4Var.e1(this.f49317j);
            r();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f49336a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f49337b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f49338c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public g f49339d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public d f49340e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public e f49341f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f49342g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f49343h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f49344i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f49345j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f49346k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f49347l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f49348m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f49349n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f49350o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f49351p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f49352q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        @Nullable
        public String f49353r;

        @Deprecated
        public c(Context context, int i10, String str, e eVar) {
            this(context, i10, str);
            this.f49341f = eVar;
        }

        public f a() {
            int i10 = this.f49342g;
            if (i10 != 0) {
                q0.a(this.f49336a, this.f49338c, i10, this.f49343h, this.f49344i);
            }
            return new f(this.f49336a, this.f49338c, this.f49337b, this.f49341f, this.f49339d, this.f49340e, this.f49345j, this.f49347l, this.f49348m, this.f49349n, this.f49346k, this.f49350o, this.f49351p, this.f49352q, this.f49353r);
        }

        public c b(int i10) {
            this.f49343h = i10;
            return this;
        }

        public c c(int i10) {
            this.f49344i = i10;
            return this;
        }

        public c d(int i10) {
            this.f49342g = i10;
            return this;
        }

        public c e(d dVar) {
            this.f49340e = dVar;
            return this;
        }

        public c f(int i10) {
            this.f49350o = i10;
            return this;
        }

        public c g(String str) {
            this.f49353r = str;
            return this;
        }

        public c h(e eVar) {
            this.f49341f = eVar;
            return this;
        }

        public c i(int i10) {
            this.f49352q = i10;
            return this;
        }

        public c j(g gVar) {
            this.f49339d = gVar;
            return this;
        }

        public c k(int i10) {
            this.f49348m = i10;
            return this;
        }

        public c l(int i10) {
            this.f49347l = i10;
            return this;
        }

        public c m(int i10) {
            this.f49351p = i10;
            return this;
        }

        public c n(int i10) {
            this.f49346k = i10;
            return this;
        }

        public c o(int i10) {
            this.f49345j = i10;
            return this;
        }

        public c p(int i10) {
            this.f49349n = i10;
            return this;
        }

        public c(Context context, @e0(from = 1) int i10, String str) {
            eh.a.a(i10 > 0);
            this.f49336a = context;
            this.f49337b = i10;
            this.f49338c = str;
            this.f49344i = 2;
            this.f49341f = new com.google.android.exoplayer2.ui.b(null);
            this.f49345j = com.google.android.exoplayer2.ui.h.e.f49485c0;
            this.f49347l = com.google.android.exoplayer2.ui.h.e.Z;
            this.f49348m = com.google.android.exoplayer2.ui.h.e.Y;
            this.f49349n = com.google.android.exoplayer2.ui.h.e.f49487d0;
            this.f49346k = com.google.android.exoplayer2.ui.h.e.f49483b0;
            this.f49350o = com.google.android.exoplayer2.ui.h.e.W;
            this.f49351p = com.google.android.exoplayer2.ui.h.e.f49481a0;
            this.f49352q = com.google.android.exoplayer2.ui.h.e.X;
        }
    }
}
