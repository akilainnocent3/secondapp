package yads;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class tg1 implements rg1, SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f155889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oy2 f155890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f155891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dr.i0 f155892d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f155893e;

    public tg1(Context context, String str, oy2 oy2Var) {
        this.f155889a = str;
        this.f155890b = oy2Var;
        Context applicationContext = context.getApplicationContext();
        this.f155891c = applicationContext != null ? applicationContext : context;
        this.f155892d = dr.k0.b(new sg1(this));
        this.f155893e = new LinkedHashSet();
    }

    public final void a() {
        ((SharedPreferences) this.f155892d.getValue()).edit().clear().apply();
    }

    public final long b(String str) {
        return ((SharedPreferences) this.f155892d.getValue()).getLong(str, 0L);
    }

    public final String c(String str) {
        return ((SharedPreferences) this.f155892d.getValue()).getString(str, null);
    }

    public final void d(String str) {
        ((SharedPreferences) this.f155892d.getValue()).edit().remove(str).apply();
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str != null) {
            Iterator it = this.f155893e.iterator();
            while (it.hasNext()) {
                qg1 qg1Var = (qg1) ((WeakReference) it.next()).get();
                if (qg1Var != null) {
                    zw zwVar = (zw) qg1Var;
                    synchronized (zw.f159060j) {
                        try {
                            ix ixVarA = zwVar.f159062c.a(this, str);
                            if (ixVarA == null) {
                                ixVarA = zwVar.f159061b.a(this, str);
                            }
                            if (ixVarA != null) {
                                zwVar.a(ixVarA);
                            }
                            dr.w2 w2Var = dr.w2.f79517a;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
        }
    }

    public final boolean a(String str) {
        return ((SharedPreferences) this.f155892d.getValue()).contains(str);
    }

    public final void b(String str, boolean z10) {
        ((SharedPreferences) this.f155892d.getValue()).edit().putBoolean(str, z10).apply();
    }

    public final boolean a(String str, boolean z10) {
        return ((SharedPreferences) this.f155892d.getValue()).getBoolean(str, z10);
    }

    public final void b(int i10, String str) {
        ((SharedPreferences) this.f155892d.getValue()).edit().putInt(str, i10).apply();
    }

    public final int a(int i10, String str) {
        ((SharedPreferences) this.f155892d.getValue()).contains(str);
        return ((SharedPreferences) this.f155892d.getValue()).getInt(str, i10);
    }

    public final Set a(String str, Set set) {
        return ((SharedPreferences) this.f155892d.getValue()).getStringSet(str, set);
    }

    public final void a(String str, long j10) {
        ((SharedPreferences) this.f155892d.getValue()).edit().putLong(str, j10).apply();
    }

    public final void a(String str, String str2) {
        ((SharedPreferences) this.f155892d.getValue()).edit().putString(str, str2).apply();
    }

    public final void a(String str, HashSet hashSet) {
        ((SharedPreferences) this.f155892d.getValue()).edit().putStringSet(str, hashSet).apply();
    }

    public final void a(qg1 qg1Var) {
        if (this.f155893e.isEmpty()) {
            ((SharedPreferences) this.f155892d.getValue()).registerOnSharedPreferenceChangeListener(this);
        }
        this.f155893e.add(new WeakReference(qg1Var));
    }
}
