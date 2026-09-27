package d1;

import android.app.Notification;
import android.app.NotificationChannel;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class a0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f77439s = "miscellaneous";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final boolean f77440t = true;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f77441u = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final String f77442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CharSequence f77443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f77444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f77445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f77446e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f77447f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Uri f77448g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AudioAttributes f77449h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f77450i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f77451j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f77452k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long[] f77453l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f77454m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f77455n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f77456o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f77457p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f77458q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f77459r;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.t0(26)
    public static class a {
        @k.t
        public static boolean a(NotificationChannel notificationChannel) {
            return notificationChannel.canBypassDnd();
        }

        @k.t
        public static boolean b(NotificationChannel notificationChannel) {
            return notificationChannel.canShowBadge();
        }

        @k.t
        public static NotificationChannel c(String str, CharSequence charSequence, int i10) {
            return new NotificationChannel(str, charSequence, i10);
        }

        @k.t
        public static void d(NotificationChannel notificationChannel, boolean z10) {
            notificationChannel.enableLights(z10);
        }

        @k.t
        public static void e(NotificationChannel notificationChannel, boolean z10) {
            notificationChannel.enableVibration(z10);
        }

        @k.t
        public static AudioAttributes f(NotificationChannel notificationChannel) {
            return notificationChannel.getAudioAttributes();
        }

        @k.t
        public static String g(NotificationChannel notificationChannel) {
            return notificationChannel.getDescription();
        }

        @k.t
        public static String h(NotificationChannel notificationChannel) {
            return notificationChannel.getGroup();
        }

        @k.t
        public static String i(NotificationChannel notificationChannel) {
            return notificationChannel.getId();
        }

        @k.t
        public static int j(NotificationChannel notificationChannel) {
            return notificationChannel.getImportance();
        }

        @k.t
        public static int k(NotificationChannel notificationChannel) {
            return notificationChannel.getLightColor();
        }

        @k.t
        public static int l(NotificationChannel notificationChannel) {
            return notificationChannel.getLockscreenVisibility();
        }

        @k.t
        public static CharSequence m(NotificationChannel notificationChannel) {
            return notificationChannel.getName();
        }

        @k.t
        public static Uri n(NotificationChannel notificationChannel) {
            return notificationChannel.getSound();
        }

        @k.t
        public static long[] o(NotificationChannel notificationChannel) {
            return notificationChannel.getVibrationPattern();
        }

        @k.t
        public static void p(NotificationChannel notificationChannel, String str) {
            notificationChannel.setDescription(str);
        }

        @k.t
        public static void q(NotificationChannel notificationChannel, String str) {
            notificationChannel.setGroup(str);
        }

        @k.t
        public static void r(NotificationChannel notificationChannel, int i10) {
            notificationChannel.setLightColor(i10);
        }

        @k.t
        public static void s(NotificationChannel notificationChannel, boolean z10) {
            notificationChannel.setShowBadge(z10);
        }

        @k.t
        public static void t(NotificationChannel notificationChannel, Uri uri, AudioAttributes audioAttributes) {
            notificationChannel.setSound(uri, audioAttributes);
        }

        @k.t
        public static void u(NotificationChannel notificationChannel, long[] jArr) {
            notificationChannel.setVibrationPattern(jArr);
        }

        @k.t
        public static boolean v(NotificationChannel notificationChannel) {
            return notificationChannel.shouldShowLights();
        }

        @k.t
        public static boolean w(NotificationChannel notificationChannel) {
            return notificationChannel.shouldVibrate();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.t0(29)
    public static class b {
        @k.t
        public static boolean a(NotificationChannel notificationChannel) {
            return notificationChannel.canBubble();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.t0(30)
    public static class c {
        @k.t
        public static String a(NotificationChannel notificationChannel) {
            return notificationChannel.getConversationId();
        }

        @k.t
        public static String b(NotificationChannel notificationChannel) {
            return notificationChannel.getParentChannelId();
        }

        @k.t
        public static boolean c(NotificationChannel notificationChannel) {
            return notificationChannel.isImportantConversation();
        }

        @k.t
        public static void d(NotificationChannel notificationChannel, String str, String str2) {
            notificationChannel.setConversationId(str, str2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a0 f77460a;

        public d(@NonNull String str, int i10) {
            this.f77460a = new a0(str, i10);
        }

        @NonNull
        public a0 a() {
            return this.f77460a;
        }

        @NonNull
        public d b(@NonNull String str, @NonNull String str2) {
            if (Build.VERSION.SDK_INT >= 30) {
                a0 a0Var = this.f77460a;
                a0Var.f77454m = str;
                a0Var.f77455n = str2;
            }
            return this;
        }

        @NonNull
        public d c(@Nullable String str) {
            this.f77460a.f77445d = str;
            return this;
        }

        @NonNull
        public d d(@Nullable String str) {
            this.f77460a.f77446e = str;
            return this;
        }

        @NonNull
        public d e(int i10) {
            this.f77460a.f77444c = i10;
            return this;
        }

        @NonNull
        public d f(int i10) {
            this.f77460a.f77451j = i10;
            return this;
        }

        @NonNull
        public d g(boolean z10) {
            this.f77460a.f77450i = z10;
            return this;
        }

        @NonNull
        public d h(@Nullable CharSequence charSequence) {
            this.f77460a.f77443b = charSequence;
            return this;
        }

        @NonNull
        public d i(boolean z10) {
            this.f77460a.f77447f = z10;
            return this;
        }

        @NonNull
        public d j(@Nullable Uri uri, @Nullable AudioAttributes audioAttributes) {
            a0 a0Var = this.f77460a;
            a0Var.f77448g = uri;
            a0Var.f77449h = audioAttributes;
            return this;
        }

        @NonNull
        public d k(boolean z10) {
            this.f77460a.f77452k = z10;
            return this;
        }

        @NonNull
        public d l(@Nullable long[] jArr) {
            a0 a0Var = this.f77460a;
            a0Var.f77452k = jArr != null && jArr.length > 0;
            a0Var.f77453l = jArr;
            return this;
        }
    }

    public a0(@NonNull String str, int i10) {
        this.f77447f = true;
        this.f77448g = Settings.System.DEFAULT_NOTIFICATION_URI;
        this.f77451j = 0;
        this.f77442a = (String) e2.x.l(str);
        this.f77444c = i10;
        this.f77449h = Notification.AUDIO_ATTRIBUTES_DEFAULT;
    }

    public boolean a() {
        return this.f77458q;
    }

    public boolean b() {
        return this.f77456o;
    }

    public boolean c() {
        return this.f77447f;
    }

    @Nullable
    public AudioAttributes d() {
        return this.f77449h;
    }

    @Nullable
    public String e() {
        return this.f77455n;
    }

    @Nullable
    public String f() {
        return this.f77445d;
    }

    @Nullable
    public String g() {
        return this.f77446e;
    }

    @NonNull
    public String h() {
        return this.f77442a;
    }

    public int i() {
        return this.f77444c;
    }

    public int j() {
        return this.f77451j;
    }

    public int k() {
        return this.f77457p;
    }

    @Nullable
    public CharSequence l() {
        return this.f77443b;
    }

    public NotificationChannel m() {
        String str;
        String str2;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26) {
            return null;
        }
        NotificationChannel notificationChannelC = a.c(this.f77442a, this.f77443b, this.f77444c);
        a.p(notificationChannelC, this.f77445d);
        a.q(notificationChannelC, this.f77446e);
        a.s(notificationChannelC, this.f77447f);
        a.t(notificationChannelC, this.f77448g, this.f77449h);
        a.d(notificationChannelC, this.f77450i);
        a.r(notificationChannelC, this.f77451j);
        a.u(notificationChannelC, this.f77453l);
        a.e(notificationChannelC, this.f77452k);
        if (i10 >= 30 && (str = this.f77454m) != null && (str2 = this.f77455n) != null) {
            c.d(notificationChannelC, str, str2);
        }
        return notificationChannelC;
    }

    @Nullable
    public String n() {
        return this.f77454m;
    }

    @Nullable
    public Uri o() {
        return this.f77448g;
    }

    @Nullable
    public long[] p() {
        return this.f77453l;
    }

    public boolean q() {
        return this.f77459r;
    }

    public boolean r() {
        return this.f77450i;
    }

    public boolean s() {
        return this.f77452k;
    }

    @NonNull
    public d t() {
        return new d(this.f77442a, this.f77444c).h(this.f77443b).c(this.f77445d).d(this.f77446e).i(this.f77447f).j(this.f77448g, this.f77449h).g(this.f77450i).f(this.f77451j).k(this.f77452k).l(this.f77453l).b(this.f77454m, this.f77455n);
    }

    @k.t0(26)
    public a0(@NonNull NotificationChannel notificationChannel) {
        this(a.i(notificationChannel), a.j(notificationChannel));
        this.f77443b = a.m(notificationChannel);
        this.f77445d = a.g(notificationChannel);
        this.f77446e = a.h(notificationChannel);
        this.f77447f = a.b(notificationChannel);
        this.f77448g = a.n(notificationChannel);
        this.f77449h = a.f(notificationChannel);
        this.f77450i = a.v(notificationChannel);
        this.f77451j = a.k(notificationChannel);
        this.f77452k = a.w(notificationChannel);
        this.f77453l = a.o(notificationChannel);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            this.f77454m = c.b(notificationChannel);
            this.f77455n = c.a(notificationChannel);
        }
        this.f77456o = a.a(notificationChannel);
        this.f77457p = a.l(notificationChannel);
        if (i10 >= 29) {
            this.f77458q = b.a(notificationChannel);
        }
        if (i10 >= 30) {
            this.f77459r = c.c(notificationChannel);
        }
    }
}
