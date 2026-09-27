package com.mbridge.msdk.tracker.network;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f70337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f70338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, String> f70339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<g> f70340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f70341e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f70342f;

    public q(int i10, byte[] bArr, boolean z10, long j10, List<g> list) {
        this(i10, bArr, a(list), list, z10, j10);
    }

    private static Map<String, String> a(List<g> list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (g gVar : list) {
            treeMap.put(gVar.a(), gVar.b());
        }
        return treeMap;
    }

    private q(int i10, byte[] bArr, Map<String, String> map, List<g> list, boolean z10, long j10) {
        this.f70337a = i10;
        this.f70338b = bArr;
        this.f70339c = map;
        if (list == null) {
            this.f70340d = null;
        } else {
            this.f70340d = Collections.unmodifiableList(list);
        }
        this.f70341e = z10;
        this.f70342f = j10;
    }
}
