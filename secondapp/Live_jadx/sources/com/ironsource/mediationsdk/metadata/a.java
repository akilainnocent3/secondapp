package com.ironsource.mediationsdk.metadata;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f62740a = "do_not_sell";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f62741b = "is_child_directed";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f62742c = "is_deviceid_optout";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f62743d = "google_family_self_certified_sdks";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f62744e = "iiqf";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f62745f = "is_test_suite";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f62746g = "true";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected static final String f62747h = "false";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f62748i = "google_water_mark";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f62749j = "enable";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final Set<String> f62750k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final Set<String> f62751l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final Set<String> f62752m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f62753n = 2048;

    static {
        HashSet hashSet = new HashSet(Arrays.asList(f62741b, f62742c, f62745f, f62743d, f62744e));
        f62750k = hashSet;
        f62751l = new HashSet(Arrays.asList(f62742c, f62743d, f62745f, f62744e));
        HashSet hashSet2 = new HashSet(hashSet);
        f62752m = hashSet2;
        hashSet2.add(f62740a);
    }
}
