package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;
import com.sportybet.ntespm.socket.protobuf.NP.tYcQsJyaojE;

/* JADX INFO: loaded from: classes4.dex */
public final class j6l0 extends xal0 {
    public static final Pair z = new Pair("", 0L);
    public SharedPreferences c;
    public SharedPreferences d;
    public f6l0 e;
    public final d6l0 f;
    public final h6l0 g;
    public String h;
    public boolean i;
    public long j;
    public final d6l0 k;
    public final z5l0 l;
    public final h6l0 m;
    public final b6l0 n;
    public final z5l0 o;
    public final d6l0 p;
    public final d6l0 q;
    public boolean r;
    public final z5l0 s;
    public final z5l0 t;
    public final d6l0 u;
    public final h6l0 v;
    public final h6l0 w;
    public final d6l0 x;
    public final b6l0 y;

    @Override // defpackage.xal0
    public final boolean h() {
        return true;
    }

    public final SharedPreferences k() {
        g();
        i();
        hm20.h(this.c);
        return this.c;
    }

    public final SharedPreferences l() {
        g();
        i();
        SharedPreferences sharedPreferences = this.d;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        k8l0 k8l0Var = this.a;
        String strValueOf = String.valueOf(k8l0Var.a.getPackageName());
        y4l0 y4l0Var = k8l0Var.f;
        k8l0.m(y4l0Var);
        u4l0 u4l0Var = y4l0Var.n;
        String strConcat = strValueOf.concat("_preferences");
        u4l0Var.b(strConcat, "Default prefs file");
        SharedPreferences sharedPreferences2 = k8l0Var.a.getSharedPreferences(strConcat, 0);
        this.d = sharedPreferences2;
        return sharedPreferences2;
    }

    public final SparseArray m() {
        Bundle bundleA = this.n.a();
        int[] intArray = bundleA.getIntArray("uriSources");
        long[] longArray = bundleA.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            y4l0 y4l0Var = this.a.f;
            k8l0.m(y4l0Var);
            y4l0Var.f.a("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        SparseArray sparseArray = new SparseArray();
        for (int i = 0; i < intArray.length; i++) {
            sparseArray.put(intArray[i], Long.valueOf(longArray[i]));
        }
        return sparseArray;
    }

    public final jbl0 n() {
        g();
        return jbl0.c(k().getInt("consent_source", 100), k().getString("consent_settings", "G1"));
    }

    public final boolean o(yll0 yll0Var) {
        g();
        String string = k().getString("stored_tcf_param", "");
        String strA = yll0Var.a();
        if (strA.equals(string)) {
            return false;
        }
        SharedPreferences.Editor editorEdit = k().edit();
        editorEdit.putString("stored_tcf_param", strA);
        editorEdit.apply();
        return true;
    }

    public final void p(boolean z2) {
        g();
        y4l0 y4l0Var = this.a.f;
        k8l0.m(y4l0Var);
        y4l0Var.n.b(Boolean.valueOf(z2), "App measurement setting deferred collection");
        SharedPreferences.Editor editorEdit = k().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z2);
        editorEdit.apply();
    }

    public final boolean q(long j) {
        return j - this.k.a() > this.p.a();
    }

    public j6l0(k8l0 k8l0Var) {
        super(k8l0Var);
        this.k = new d6l0(this, "session_timeout", 1800000L);
        this.l = new z5l0(this, "start_new_session", true);
        this.p = new d6l0(this, "last_pause_time", 0L);
        this.q = new d6l0(this, "session_id", 0L);
        this.m = new h6l0(this, "non_personalized_ads");
        this.n = new b6l0(this, "last_received_uri_timestamps_by_source");
        this.o = new z5l0(this, "allow_remote_dynamite", false);
        this.f = new d6l0(this, tYcQsJyaojE.ptvVEAlGuKz, 0L);
        hm20.e("app_install_time");
        this.g = new h6l0(this, "app_instance_id");
        this.s = new z5l0(this, "app_backgrounded", false);
        this.t = new z5l0(this, "deep_link_retrieval_complete", false);
        this.u = new d6l0(this, "deep_link_retrieval_attempts", 0L);
        this.v = new h6l0(this, "firebase_feature_rollouts");
        this.w = new h6l0(this, "deferred_attribution_cache");
        this.x = new d6l0(this, "deferred_attribution_cache_timestamp", 0L);
        this.y = new b6l0(this, "default_event_parameters");
    }
}
