package com.fyber.inneractive.sdk.response;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f47706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f47707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j f47708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f47709d = true;

    public abstract e a();

    public final e a(String str) throws Exception {
        this.f47709d = str != null;
        e eVar = this.f47706a;
        eVar.getClass();
        eVar.f47719c = System.currentTimeMillis();
        this.f47708c.a(this);
        String strA = this.f47708c.a();
        this.f47706a.f47724h = strA;
        r0 r0VarA = com.fyber.inneractive.sdk.config.a.a(this.f47707b);
        IAlog.a("%sGot unit config for unitId: %s from config manager", IAlog.a(this), this.f47707b);
        IAlog.a("%s%s", IAlog.a(this), r0VarA);
        if (this.f47709d) {
            a(str, r0VarA);
        } else if (b()) {
            h hVar = new h(strA);
            if (hVar.f47743a) {
                String str2 = hVar.f47744b;
                if (str2 == null || TextUtils.isEmpty(str2.trim())) {
                    throw new Exception("empty ad content detected. failing fast.");
                }
                a(str2, r0VarA);
            }
        } else {
            a(strA, r0VarA);
        }
        return this.f47706a;
    }

    public abstract void a(String str, r0 r0Var);

    public boolean b() {
        return !(this instanceof com.fyber.inneractive.sdk.dv.h);
    }

    public boolean c() {
        return this instanceof com.fyber.inneractive.sdk.dv.h;
    }
}
