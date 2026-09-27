package rp;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f127469b = "query_info_type";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f127470c = "requester_type_5";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f127471d = "UnityScar";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f127472a;

    public a(String str) {
        this.f127472a = f127471d + str;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString(f127469b, f127470c);
        return bundle;
    }

    public String b() {
        return this.f127472a;
    }
}
