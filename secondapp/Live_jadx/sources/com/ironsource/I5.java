package com.ironsource;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class I5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f59234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f59235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f59236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private J7 f59237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f59238e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ArrayList<Pair<String, String>> f59239f;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f59240a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private J7 f59243d;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f59241b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f59242c = "POST";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f59244e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private ArrayList<Pair<String, String>> f59245f = new ArrayList<>();

        public a(String str) {
            this.f59240a = "";
            if (str == null || str.isEmpty()) {
                return;
            }
            this.f59240a = str;
        }

        public a a(J7 j10) {
            this.f59243d = j10;
            return this;
        }

        public a b(boolean z10) {
            this.f59241b = z10;
            return this;
        }

        public a c() {
            this.f59242c = "POST";
            return this;
        }

        public a a(Pair<String, String> pair) {
            this.f59245f.add(pair);
            return this;
        }

        public a b() {
            this.f59242c = "GET";
            return this;
        }

        public a a(List<Pair<String, String>> list) {
            this.f59245f.addAll(list);
            return this;
        }

        public a a(boolean z10) {
            this.f59244e = z10;
            return this;
        }

        public I5 a() {
            return new I5(this);
        }
    }

    public I5(a aVar) {
        this.f59238e = false;
        this.f59234a = aVar.f59240a;
        this.f59235b = aVar.f59241b;
        this.f59236c = aVar.f59242c;
        this.f59237d = aVar.f59243d;
        this.f59238e = aVar.f59244e;
        if (aVar.f59245f != null) {
            this.f59239f = new ArrayList<>(aVar.f59245f);
        }
    }

    public boolean a() {
        return this.f59235b;
    }

    public String b() {
        return this.f59234a;
    }

    public J7 c() {
        return this.f59237d;
    }

    public ArrayList<Pair<String, String>> d() {
        return new ArrayList<>(this.f59239f);
    }

    public String e() {
        return this.f59236c;
    }

    public boolean f() {
        return this.f59238e;
    }
}
