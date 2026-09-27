package com.pgl.ssdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.ironsource.Y1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class al {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile al f71997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f71998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<Integer> f71999c = new ArrayList();

    private al(Context context) {
        this.f71998b = null;
        this.f71998b = context;
    }

    public static al a(Context context) {
        if (f71997a == null) {
            synchronized (al.class) {
                try {
                    if (f71997a == null) {
                        f71997a = new al(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f71997a;
    }

    public int b() {
        Intent intentRegisterReceiver = this.f71998b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            return 0;
        }
        return intentRegisterReceiver.getIntExtra("plugged", 0);
    }

    public int c() {
        Intent intentRegisterReceiver = this.f71998b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            return 0;
        }
        return Math.round(((intentRegisterReceiver.getIntExtra("level", 0) / intentRegisterReceiver.getIntExtra("scale", 0)) * 100.0f) * 10.0f) / 10;
    }

    public synchronized String d() {
        if (this.f71999c.size() <= 0) {
            return Y1.f60333f;
        }
        List<Integer> list = this.f71999c;
        return String.valueOf(list.get(list.size() - 1).intValue() % 10000);
    }

    public synchronized String e() {
        return new JSONArray((Collection) this.f71999c).toString();
    }

    @SuppressLint({"DefaultLocale"})
    public int f() {
        int iC;
        int iB = 0;
        try {
            synchronized (this) {
                iB = b();
                iC = c();
            }
            return (iB * 10000) + iC;
        } catch (Exception unused) {
            return iB * 10000;
        }
    }

    public void a() {
        int iF = f();
        if (iF == -1) {
            return;
        }
        this.f71999c.add(Integer.valueOf(iF));
        try {
            int size = this.f71999c.size();
            if (size > 20) {
                ArrayList arrayList = new ArrayList(this.f71999c.subList(size - 10, size));
                this.f71999c.clear();
                this.f71999c = arrayList;
            }
        } catch (Throwable unused) {
        }
    }
}
