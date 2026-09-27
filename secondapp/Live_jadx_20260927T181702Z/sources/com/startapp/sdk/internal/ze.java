package com.startapp.sdk.internal;

import android.content.Context;
import android.content.IntentFilter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ze extends cf {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ye f75988c;

    public ze(String str, HashMap map) {
        super(str, map);
    }

    @Override // com.startapp.sdk.internal.hf
    public final void a(Context context, ef efVar) {
        if (this.f75988c != null) {
            throw new IllegalStateException();
        }
        ye yeVar = new ye(this, efVar);
        this.f75988c = yeVar;
        context.registerReceiver(yeVar, new IntentFilter(this.f74651a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ze.class != obj.getClass()) {
            return false;
        }
        return si.a(this.f75988c, ((ze) obj).f75988c);
    }

    public final int hashCode() {
        Object[] objArr = {this.f75988c};
        WeakHashMap weakHashMap = si.f75514a;
        return Arrays.deepHashCode(objArr);
    }

    @Override // com.startapp.sdk.internal.hf
    public final void a(Context context) {
        ye yeVar = this.f75988c;
        if (yeVar != null) {
            context.unregisterReceiver(yeVar);
            this.f75988c = null;
            return;
        }
        throw new IllegalStateException();
    }
}
