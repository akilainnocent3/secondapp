package com.mbridge.msdk.tracker;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class i implements Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static String f70238i = "CREATE TABLE IF NOT EXISTS %s (id INTEGER PRIMARY KEY,uuid TEXT,name TEXT,type INTEGER,time_stamp INTEGER,duration INTEGER,properties TEXT,priority INTEGER,state INTEGER,invalid_time INTEGER,ignore_max_timeout INTEGER,ignore_max_retry_times INTEGER,report_error_message TEXT,report_count INTEGER)";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static String f70239j = "DROP TABLE IF EXISTS %s";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f70240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f70241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f70242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f70243d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f70244e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f70245f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f70246g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f70247h;

    public i(e eVar) {
        this.f70240a = eVar;
        this.f70243d = eVar.n();
    }

    public void a(boolean z10) {
        this.f70246g = z10;
    }

    public void b(boolean z10) {
        this.f70245f = z10;
    }

    public e d() {
        return this.f70240a;
    }

    public long g() {
        return this.f70244e;
    }

    public int h() {
        return this.f70241b;
    }

    public String i() {
        return this.f70247h;
    }

    public int j() {
        return this.f70242c;
    }

    public String k() {
        return this.f70243d;
    }

    public boolean l() {
        return this.f70246g;
    }

    public boolean m() {
        return this.f70245f;
    }

    public void a(int i10) {
        this.f70241b = i10;
    }

    public void b(int i10) {
        this.f70242c = i10;
    }

    public void a(long j10) {
        this.f70244e = j10;
    }

    public void a(String str) {
        this.f70247h = str;
    }
}
