package com.startapp.sdk.internal;

import android.graphics.Bitmap;
import com.startapp.sdk.ads.list3d.List3DActivity;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class a9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ib f74529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ib f74530b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List3DActivity f74534f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f74535g = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Hashtable f74532d = new Hashtable();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f74533e = new HashSet();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ConcurrentLinkedQueue f74536h = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f74531c = new HashMap();

    public a9(ib ibVar, ib ibVar2) {
        this.f74529a = ibVar;
        this.f74530b = ibVar2;
    }

    public final Bitmap a(String str, int i10, String str2) {
        Bitmap bitmap = (Bitmap) this.f74532d.get(str);
        if (bitmap != null) {
            return bitmap;
        }
        if (this.f74533e.contains(str)) {
            return null;
        }
        this.f74533e.add(str);
        int i11 = this.f74535g;
        if (i11 >= 15) {
            this.f74536h.add(new z8(this, i10, str, str2));
            return null;
        }
        this.f74535g = i11 + 1;
        ((Executor) this.f74529a.a()).execute(new z8(this, i10, str, str2));
        return null;
    }
}
