package com.applovin.impl;

import android.content.Context;
import android.text.SpannedString;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class t4 extends t2 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final q0.a f29269n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Context f29270o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f29271p;

    public t4(q0.a aVar, boolean z10, Context context) {
        super(t2.c.RIGHT_DETAIL);
        this.f29269n = aVar;
        this.f29270o = context;
        this.f29202c = new SpannedString(aVar.a());
        this.f29271p = z10;
    }

    @Override // com.applovin.impl.t2
    public SpannedString f() {
        return new SpannedString(this.f29269n.a(this.f29270o));
    }

    @Override // com.applovin.impl.t2
    public boolean o() {
        return false;
    }

    @Override // com.applovin.impl.t2
    public boolean p() {
        Boolean boolB = this.f29269n.b(this.f29270o);
        if (boolB != null) {
            return boolB.equals(Boolean.valueOf(this.f29271p));
        }
        return false;
    }
}
