package d1;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CharSequence f77468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f77469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f77470d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<a0> f77471e;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.t0(26)
    public static class a {
        @k.t
        public static NotificationChannelGroup a(String str, CharSequence charSequence) {
            return new NotificationChannelGroup(str, charSequence);
        }

        @k.t
        public static List<NotificationChannel> b(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getChannels();
        }

        @k.t
        public static String c(NotificationChannel notificationChannel) {
            return notificationChannel.getGroup();
        }

        @k.t
        public static String d(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getId();
        }

        @k.t
        public static CharSequence e(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getName();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.t0(28)
    public static class b {
        @k.t
        public static String a(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getDescription();
        }

        @k.t
        public static boolean b(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.isBlocked();
        }

        @k.t
        public static void c(NotificationChannelGroup notificationChannelGroup, String str) {
            notificationChannelGroup.setDescription(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c0 f77472a;

        public c(@NonNull String str) {
            this.f77472a = new c0(str);
        }

        @NonNull
        public c0 a() {
            return this.f77472a;
        }

        @NonNull
        public c b(@Nullable String str) {
            this.f77472a.f77469c = str;
            return this;
        }

        @NonNull
        public c c(@Nullable CharSequence charSequence) {
            this.f77472a.f77468b = charSequence;
            return this;
        }
    }

    public c0(@NonNull String str) {
        this.f77471e = Collections.EMPTY_LIST;
        this.f77467a = (String) e2.x.l(str);
    }

    @NonNull
    public List<a0> a() {
        return this.f77471e;
    }

    @k.t0(26)
    public final List<a0> b(List<NotificationChannel> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<NotificationChannel> it = list.iterator();
        while (it.hasNext()) {
            NotificationChannel notificationChannelA = b0.a(it.next());
            if (this.f77467a.equals(a.c(notificationChannelA))) {
                arrayList.add(new a0(notificationChannelA));
            }
        }
        return arrayList;
    }

    @Nullable
    public String c() {
        return this.f77469c;
    }

    @NonNull
    public String d() {
        return this.f77467a;
    }

    @Nullable
    public CharSequence e() {
        return this.f77468b;
    }

    public NotificationChannelGroup f() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26) {
            return null;
        }
        NotificationChannelGroup notificationChannelGroupA = a.a(this.f77467a, this.f77468b);
        if (i10 >= 28) {
            b.c(notificationChannelGroupA, this.f77469c);
        }
        return notificationChannelGroupA;
    }

    public boolean g() {
        return this.f77470d;
    }

    @NonNull
    public c h() {
        return new c(this.f77467a).c(this.f77468b).b(this.f77469c);
    }

    @k.t0(28)
    public c0(@NonNull NotificationChannelGroup notificationChannelGroup) {
        this(notificationChannelGroup, Collections.EMPTY_LIST);
    }

    @k.t0(26)
    public c0(@NonNull NotificationChannelGroup notificationChannelGroup, @NonNull List<NotificationChannel> list) {
        this(a.d(notificationChannelGroup));
        this.f77468b = a.e(notificationChannelGroup);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            this.f77469c = b.a(notificationChannelGroup);
        }
        if (i10 >= 28) {
            this.f77470d = b.b(notificationChannelGroup);
            this.f77471e = b(a.b(notificationChannelGroup));
        } else {
            this.f77471e = b(list);
        }
    }
}
