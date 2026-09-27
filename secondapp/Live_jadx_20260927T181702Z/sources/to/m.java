package to;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.m
    public SharedPreferences f137119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.m
    public SharedPreferences.Editor f137120b;

    public m(@oy.m Context context) {
        SharedPreferences sharedPreferences = context != null ? context.getSharedPreferences(context.getString(com.sports.live.football.tv.a.m.f73472k), 0) : null;
        this.f137119a = sharedPreferences;
        this.f137120b = sharedPreferences != null ? sharedPreferences.edit() : null;
    }

    @oy.m
    public final Integer a(@oy.l String key) {
        m0.p(key, "key");
        SharedPreferences sharedPreferences = this.f137119a;
        if (sharedPreferences != null) {
            return Integer.valueOf(sharedPreferences.getInt(key, 0));
        }
        return null;
    }

    @oy.m
    public final Boolean b(@oy.l String key) {
        m0.p(key, "key");
        SharedPreferences sharedPreferences = this.f137119a;
        if (sharedPreferences != null) {
            return Boolean.valueOf(sharedPreferences.getBoolean(key, true));
        }
        return null;
    }

    @oy.m
    public final Boolean c(@oy.l String key) {
        m0.p(key, "key");
        SharedPreferences sharedPreferences = this.f137119a;
        if (sharedPreferences != null) {
            return Boolean.valueOf(sharedPreferences.getBoolean(key, false));
        }
        return null;
    }

    @oy.m
    public final Integer d(@oy.l String key) {
        m0.p(key, "key");
        SharedPreferences sharedPreferences = this.f137119a;
        if (sharedPreferences != null) {
            return Integer.valueOf(sharedPreferences.getInt(key, 0));
        }
        return null;
    }

    @oy.m
    public final Boolean e(@oy.l String key) {
        m0.p(key, "key");
        SharedPreferences sharedPreferences = this.f137119a;
        if (sharedPreferences != null) {
            return Boolean.valueOf(sharedPreferences.getBoolean(key, false));
        }
        return null;
    }

    @oy.m
    public final Boolean f(@oy.l String key) {
        m0.p(key, "key");
        SharedPreferences sharedPreferences = this.f137119a;
        if (sharedPreferences != null) {
            return Boolean.valueOf(sharedPreferences.getBoolean(key, false));
        }
        return null;
    }

    @oy.m
    public final String g(@oy.l String key) {
        m0.p(key, "key");
        SharedPreferences sharedPreferences = this.f137119a;
        if (sharedPreferences != null) {
            return sharedPreferences.getString(key, "light");
        }
        return null;
    }

    public final void h(@oy.l String key, int i10) {
        m0.p(key, "key");
        SharedPreferences.Editor editor = this.f137120b;
        if (editor != null) {
            editor.putInt(key, i10);
        }
        SharedPreferences.Editor editor2 = this.f137120b;
        if (editor2 != null) {
            editor2.commit();
        }
    }

    public final void i(@oy.l String key, boolean z10) {
        m0.p(key, "key");
        SharedPreferences.Editor editor = this.f137120b;
        if (editor != null) {
            editor.putBoolean(key, z10);
        }
        SharedPreferences.Editor editor2 = this.f137120b;
        if (editor2 != null) {
            editor2.commit();
        }
    }

    public final void j(@oy.l String key, boolean z10) {
        m0.p(key, "key");
        SharedPreferences.Editor editor = this.f137120b;
        if (editor != null) {
            editor.putBoolean(key, z10);
        }
        SharedPreferences.Editor editor2 = this.f137120b;
        if (editor2 != null) {
            editor2.commit();
        }
    }

    public final void k(@oy.l String key, int i10) {
        m0.p(key, "key");
        SharedPreferences.Editor editor = this.f137120b;
        if (editor != null) {
            editor.putInt(key, i10);
        }
        SharedPreferences.Editor editor2 = this.f137120b;
        if (editor2 != null) {
            editor2.commit();
        }
    }

    public final void l(@oy.l String key, boolean z10) {
        m0.p(key, "key");
        SharedPreferences.Editor editor = this.f137120b;
        if (editor != null) {
            editor.putBoolean(key, z10);
        }
        SharedPreferences.Editor editor2 = this.f137120b;
        if (editor2 != null) {
            editor2.commit();
        }
    }

    public final void m(@oy.l String key, boolean z10) {
        m0.p(key, "key");
        SharedPreferences.Editor editor = this.f137120b;
        if (editor != null) {
            editor.putBoolean(key, z10);
        }
        SharedPreferences.Editor editor2 = this.f137120b;
        if (editor2 != null) {
            editor2.commit();
        }
    }

    public final void n(@oy.l String key, @oy.l String value) {
        m0.p(key, "key");
        m0.p(value, "value");
        SharedPreferences.Editor editor = this.f137120b;
        if (editor != null) {
            editor.putString(key, value);
        }
        SharedPreferences.Editor editor2 = this.f137120b;
        if (editor2 != null) {
            editor2.commit();
        }
    }
}
