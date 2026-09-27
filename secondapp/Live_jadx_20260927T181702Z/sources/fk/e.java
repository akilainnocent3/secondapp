package fk;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f84762c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f84763d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f84764e = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Float f84765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f84766b;

    public e(Float f10, boolean z10) {
        this.f84766b = z10;
        this.f84765a = f10;
    }

    public static e a(Context context) {
        boolean zF = false;
        Float fD = null;
        try {
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver != null) {
                zF = f(intentRegisterReceiver);
                fD = d(intentRegisterReceiver);
            }
        } catch (IllegalStateException e10) {
            ck.g.f().e("An error occurred getting battery state.", e10);
        }
        return new e(fD, zF);
    }

    public static Float d(Intent intent) {
        int intExtra = intent.getIntExtra("level", -1);
        int intExtra2 = intent.getIntExtra("scale", -1);
        if (intExtra == -1 || intExtra2 == -1) {
            return null;
        }
        return Float.valueOf(intExtra / intExtra2);
    }

    public static boolean f(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        if (intExtra == -1) {
            return false;
        }
        return intExtra == 2 || intExtra == 5;
    }

    public Float b() {
        return this.f84765a;
    }

    public int c() {
        Float f10;
        if (!this.f84766b || (f10 = this.f84765a) == null) {
            return 1;
        }
        return ((double) f10.floatValue()) < 0.99d ? 2 : 3;
    }

    public boolean e() {
        return this.f84766b;
    }
}
