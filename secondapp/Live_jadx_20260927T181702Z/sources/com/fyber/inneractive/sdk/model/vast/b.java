package com.fyber.inneractive.sdk.model.vast;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements com.fyber.inneractive.sdk.response.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f45157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f45158b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PriorityQueue f45160d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o f45162f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final PriorityQueue f45163g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Comparator f45164h;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.endcard.k f45171o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public v f45172p;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f45161e = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f45165i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f45166j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f45167k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f45168l = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f45169m = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f45170n = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f45159c = new HashMap();

    public b(com.fyber.inneractive.sdk.flow.vast.g gVar, com.fyber.inneractive.sdk.flow.vast.d dVar) {
        this.f45160d = new PriorityQueue(1, gVar);
        this.f45164h = dVar;
        this.f45163g = new PriorityQueue(1, dVar);
    }

    @Override // com.fyber.inneractive.sdk.response.i
    public final List a(x xVar) {
        HashMap map;
        if (xVar == null || (map = this.f45159c) == null) {
            return null;
        }
        return (List) map.get(xVar);
    }

    public final void a(x xVar, String str) {
        List arrayList = (List) this.f45159c.get(xVar);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f45159c.put(xVar, arrayList);
        }
        arrayList.add(str);
    }
}
