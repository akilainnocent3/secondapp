package w1;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import d1.q0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f142017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f142018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Intent f142019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f142020d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Bundle f142021e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final PendingIntent f142022f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f142023g;

    public a(@NonNull Context context, int i10, @NonNull Intent intent, int i11, boolean z10) {
        this(context, i10, intent, i11, null, z10);
    }

    @Nullable
    public final PendingIntent a() {
        Bundle bundle = this.f142021e;
        return bundle == null ? q0.e(this.f142017a, this.f142018b, this.f142019c, this.f142020d, this.f142023g) : q0.d(this.f142017a, this.f142018b, this.f142019c, this.f142020d, bundle, this.f142023g);
    }

    @NonNull
    public Context b() {
        return this.f142017a;
    }

    public int c() {
        return this.f142020d;
    }

    @NonNull
    public Intent d() {
        return this.f142019c;
    }

    @NonNull
    public Bundle e() {
        return this.f142021e;
    }

    @Nullable
    public PendingIntent f() {
        return this.f142022f;
    }

    public int g() {
        return this.f142018b;
    }

    public boolean h() {
        return this.f142023g;
    }

    public a(@NonNull Context context, int i10, @NonNull Intent intent, int i11, @Nullable Bundle bundle, boolean z10) {
        this.f142017a = context;
        this.f142018b = i10;
        this.f142019c = intent;
        this.f142020d = i11;
        this.f142021e = bundle;
        this.f142023g = z10;
        this.f142022f = a();
    }
}
