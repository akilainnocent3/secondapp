package com.mbridge.msdk.config.dynamic.baseview.touch;

import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import gp.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f65908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f65909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f65910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f65911d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f65912e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f65913f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f65914g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f65915h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f65916i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f65917j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f65918k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f65919l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f65920m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f65921n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private View f65922o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final List<C0616a> f65923p = new ArrayList();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f65924q = 0;

    /* JADX INFO: renamed from: com.mbridge.msdk.config.dynamic.baseview.touch.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class C0616a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f65925a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f65926b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f65927c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f65928d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f65929e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f65930f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f65931g;

        public C0616a(int i10, float f10, float f11, float f12, float f13, float f14, int i11) {
            this.f65925a = i10;
            this.f65926b = f10;
            this.f65927c = f11;
            this.f65928d = f12;
            this.f65929e = f13;
            this.f65930f = f14;
            this.f65931g = i11;
        }
    }

    private float a(MotionEvent motionEvent) {
        return Build.VERSION.SDK_INT >= 29 ? motionEvent.getRawX(motionEvent.getActionIndex()) : motionEvent.getRawX();
    }

    private float b(MotionEvent motionEvent) {
        return Build.VERSION.SDK_INT >= 29 ? motionEvent.getRawY(motionEvent.getActionIndex()) : motionEvent.getRawY();
    }

    private void g(MotionEvent motionEvent) {
        this.f65923p.clear();
        if (Build.VERSION.SDK_INT < 29) {
            this.f65924q = 1;
            this.f65923p.add(new C0616a(motionEvent.getPointerId(0), motionEvent.getRawX(), motionEvent.getRawY(), motionEvent.getPressure(), motionEvent.getSize(), motionEvent.getOrientation(), motionEvent.getToolType(motionEvent.getActionIndex())));
        } else {
            this.f65924q = motionEvent.getPointerCount();
            for (int i10 = 0; i10 < this.f65924q; i10++) {
                this.f65923p.add(new C0616a(motionEvent.getPointerId(i10), motionEvent.getRawX(i10), motionEvent.getRawY(i10), motionEvent.getPressure(i10), motionEvent.getSize(i10), motionEvent.getOrientation(i10), motionEvent.getToolType(i10)));
            }
        }
    }

    private void h(MotionEvent motionEvent) {
        this.f65916i = motionEvent.getPressure();
        this.f65917j = motionEvent.getSize();
        this.f65918k = motionEvent.getOrientation();
        this.f65919l = motionEvent.getToolType(motionEvent.getActionIndex());
    }

    public void c(MotionEvent motionEvent) {
        g(motionEvent);
    }

    public void d(MotionEvent motionEvent) {
        this.f65908a = a(motionEvent);
        this.f65909b = b(motionEvent);
        this.f65914g = System.currentTimeMillis();
        h(motionEvent);
        g(motionEvent);
    }

    public void e(MotionEvent motionEvent) {
        this.f65910c = a(motionEvent);
        this.f65911d = b(motionEvent);
        h(motionEvent);
        g(motionEvent);
    }

    public void f(MotionEvent motionEvent) {
        this.f65912e = a(motionEvent);
        this.f65913f = b(motionEvent);
        this.f65915h = System.currentTimeMillis();
        h(motionEvent);
        g(motionEvent);
    }

    public void c(View view) {
        this.f65922o = view;
        this.f65920m = view.getWidth();
        this.f65921n = view.getHeight();
    }

    private void b(HashMap<String, Object> map) {
        ArrayList arrayList = new ArrayList();
        for (C0616a c0616a : this.f65923p) {
            HashMap map2 = new HashMap();
            map2.put("x", String.valueOf(c0616a.f65926b));
            map2.put("y", String.valueOf(c0616a.f65927c));
            map2.put("pressure", String.valueOf(c0616a.f65928d));
            map2.put("size", String.valueOf(c0616a.f65929e));
            map2.put("id", Integer.valueOf(c0616a.f65925a));
            arrayList.add(map2);
        }
        map.put("points", arrayList);
    }

    public HashMap<String, Object> a() {
        HashMap<String, Object> map = new HashMap<>();
        a(map);
        b(map);
        d(map);
        c(map);
        return map;
    }

    private void c(HashMap<String, Object> map) {
        map.put("down_x", Float.valueOf(this.f65908a));
        map.put("down_y", Float.valueOf(this.f65909b));
        map.put("down_time", Long.valueOf(this.f65914g));
        map.put("up_x", Float.valueOf(this.f65912e));
        map.put("up_y", Float.valueOf(this.f65913f));
        map.put("up_time", Long.valueOf(this.f65915h));
    }

    private void d(HashMap<String, Object> map) {
        View view = this.f65922o;
        if (view != null) {
            map.put(e.f87283v, view.getClass().getSimpleName());
            String strB = b(this.f65922o);
            map.put("resource_id", strB);
            String strA = a(this.f65922o);
            map.put("content_desc", strA);
            map.put("view_format", String.format("%s#%s(%s)", this.f65922o.getClass().getSimpleName(), strB, strA));
        }
    }

    private void a(HashMap<String, Object> map) {
        map.put("event_name", "touch");
        map.put("event_time", String.valueOf(System.currentTimeMillis()));
        map.put("down_time", String.valueOf(this.f65914g));
    }

    public void c() {
        this.f65913f = 0.0f;
        this.f65912e = 0.0f;
        this.f65911d = 0.0f;
        this.f65910c = 0.0f;
        this.f65909b = 0.0f;
        this.f65908a = 0.0f;
        this.f65915h = 0L;
        this.f65914g = 0L;
        this.f65918k = 0.0f;
        this.f65917j = 0.0f;
        this.f65916i = 0.0f;
        this.f65919l = 0;
        this.f65921n = 0;
        this.f65920m = 0;
        this.f65922o = null;
        this.f65924q = 0;
        this.f65923p.clear();
    }

    private String a(View view) {
        CharSequence contentDescription = view.getContentDescription();
        return contentDescription != null ? contentDescription.toString() : "";
    }

    private String b(View view) {
        if (view.getId() != -1) {
            try {
                return view.getResources().getResourceEntryName(view.getId());
            } catch (Exception unused) {
                return String.valueOf(view.getId());
            }
        }
        return "";
    }

    public C0616a b() {
        if (this.f65923p.isEmpty()) {
            return null;
        }
        return this.f65923p.get(0);
    }
}
