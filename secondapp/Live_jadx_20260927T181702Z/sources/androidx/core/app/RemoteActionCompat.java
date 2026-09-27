package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.graphics.drawable.Icon;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.core.graphics.drawable.IconCompat;
import e2.x;
import k.t;
import k.t0;
import k.y0;
import w9.h;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class RemoteActionCompat implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    @y0({y0.a.LIBRARY_GROUP})
    public IconCompat f9194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    @y0({y0.a.LIBRARY_GROUP})
    public CharSequence f9195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    @y0({y0.a.LIBRARY_GROUP})
    public CharSequence f9196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    @y0({y0.a.LIBRARY_GROUP})
    public PendingIntent f9197d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @y0({y0.a.LIBRARY_GROUP})
    public boolean f9198e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @y0({y0.a.LIBRARY_GROUP})
    public boolean f9199f;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(26)
    public static class a {
        @t
        public static RemoteAction a(Icon icon, CharSequence charSequence, CharSequence charSequence2, PendingIntent pendingIntent) {
            return new RemoteAction(icon, charSequence, charSequence2, pendingIntent);
        }

        @t
        public static PendingIntent b(RemoteAction remoteAction) {
            return remoteAction.getActionIntent();
        }

        @t
        public static CharSequence c(RemoteAction remoteAction) {
            return remoteAction.getContentDescription();
        }

        @t
        public static Icon d(RemoteAction remoteAction) {
            return remoteAction.getIcon();
        }

        @t
        public static CharSequence e(RemoteAction remoteAction) {
            return remoteAction.getTitle();
        }

        @t
        public static boolean f(RemoteAction remoteAction) {
            return remoteAction.isEnabled();
        }

        @t
        public static void g(RemoteAction remoteAction, boolean z10) {
            remoteAction.setEnabled(z10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(28)
    public static class b {
        @t
        public static void a(RemoteAction remoteAction, boolean z10) {
            remoteAction.setShouldShowIcon(z10);
        }

        @t
        public static boolean b(RemoteAction remoteAction) {
            return remoteAction.shouldShowIcon();
        }
    }

    public RemoteActionCompat(@NonNull IconCompat iconCompat, @NonNull CharSequence charSequence, @NonNull CharSequence charSequence2, @NonNull PendingIntent pendingIntent) {
        this.f9194a = (IconCompat) x.l(iconCompat);
        this.f9195b = (CharSequence) x.l(charSequence);
        this.f9196c = (CharSequence) x.l(charSequence2);
        this.f9197d = (PendingIntent) x.l(pendingIntent);
        this.f9198e = true;
        this.f9199f = true;
    }

    @NonNull
    @t0(26)
    public static RemoteActionCompat a(@NonNull RemoteAction remoteAction) {
        x.l(remoteAction);
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat(IconCompat.n(a.d(remoteAction)), a.e(remoteAction), a.c(remoteAction), a.b(remoteAction));
        remoteActionCompat.n(a.f(remoteAction));
        if (Build.VERSION.SDK_INT >= 28) {
            remoteActionCompat.o(b.b(remoteAction));
        }
        return remoteActionCompat;
    }

    @NonNull
    public PendingIntent i() {
        return this.f9197d;
    }

    @NonNull
    public CharSequence j() {
        return this.f9196c;
    }

    @NonNull
    public IconCompat k() {
        return this.f9194a;
    }

    @NonNull
    public CharSequence l() {
        return this.f9195b;
    }

    public boolean m() {
        return this.f9198e;
    }

    public void n(boolean z10) {
        this.f9198e = z10;
    }

    public void o(boolean z10) {
        this.f9199f = z10;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public boolean p() {
        return this.f9199f;
    }

    @NonNull
    @t0(26)
    public RemoteAction q() {
        RemoteAction remoteActionA = a.a(this.f9194a.M(), this.f9195b, this.f9196c, this.f9197d);
        a.g(remoteActionA, m());
        if (Build.VERSION.SDK_INT >= 28) {
            b.a(remoteActionA, p());
        }
        return remoteActionA;
    }

    @y0({y0.a.LIBRARY_GROUP})
    public RemoteActionCompat() {
    }

    public RemoteActionCompat(@NonNull RemoteActionCompat remoteActionCompat) {
        x.l(remoteActionCompat);
        this.f9194a = remoteActionCompat.f9194a;
        this.f9195b = remoteActionCompat.f9195b;
        this.f9196c = remoteActionCompat.f9196c;
        this.f9197d = remoteActionCompat.f9197d;
        this.f9198e = remoteActionCompat.f9198e;
        this.f9199f = remoteActionCompat.f9199f;
    }
}
