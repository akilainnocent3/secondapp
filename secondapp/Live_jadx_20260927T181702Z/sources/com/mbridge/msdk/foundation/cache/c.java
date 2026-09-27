package com.mbridge.msdk.foundation.cache;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f66653i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f66654j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f66655k = 3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f66656l = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CopyOnWriteArrayList<CampaignEx> f66657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f66658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f66659c = 21;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f66660d = f66654j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList<String> f66661e = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List<String> f66662f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<String> f66663g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List<String> f66664h = new ArrayList();

    public void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
        this.f66657a = copyOnWriteArrayList;
    }

    public String b() {
        List<String> list = this.f66664h;
        return list == null ? "" : list.toString();
    }

    public CopyOnWriteArrayList<CampaignEx> c() {
        return this.f66657a;
    }

    public String d() {
        List<String> list = this.f66663g;
        return list == null ? "" : list.toString();
    }

    public String e() {
        return this.f66658b;
    }

    public String f() {
        List<String> list = this.f66662f;
        return list == null ? "" : list.toString();
    }

    public int g() {
        return this.f66660d;
    }

    public String a() {
        ArrayList<String> arrayList = this.f66661e;
        return arrayList == null ? "" : arrayList.toString();
    }

    public void c(String str) {
        try {
            List<String> list = this.f66662f;
            if (list != null) {
                list.add(str);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void b(String str) {
        try {
            List<String> list = this.f66663g;
            if (list != null) {
                list.add(str);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void d(String str) {
        this.f66658b = str;
    }

    public void a(String str) {
        try {
            ArrayList<String> arrayList = this.f66661e;
            if (arrayList != null) {
                arrayList.add(str);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void a(int i10) {
        this.f66660d = i10;
    }
}
